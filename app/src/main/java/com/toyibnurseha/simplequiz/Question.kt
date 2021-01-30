package com.toyibnurseha.simplequiz

import android.os.Parcelable

data class Question(
    var text: String = "",
    var answers: List<String>
)