package com.toyibnurseha.simplequiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.toyibnurseha.simplequiz.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    private lateinit var binding: FragmentGameBinding
    private lateinit var currentQuestion: Question
    private lateinit var answer : MutableList<String>

    private var questionIndex = 0
    private val questions : MutableList<Question> = mutableListOf(
        Question(
            text = "",
            answers = listOf("", "", "", "")
        ),
        Question(
            text = "",
            answers = listOf("", "", "", "")
        ),
        Question(
            text = "",
            answers = listOf("", "", "", "")
        ),
        Question(
            text = "",
            answers = listOf("", "", "", "")
        ),
        Question(
            text = "",
            answers = listOf("", "", "", "")
        ),
    )
    private val numQuestions = ((questions.size + 1) / 2).coerceAtMost(3)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGameBinding.inflate(layoutInflater)
        return binding.root
    }

}