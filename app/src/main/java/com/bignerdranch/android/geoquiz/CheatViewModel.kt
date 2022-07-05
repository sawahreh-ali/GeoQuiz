package com.bignerdranch.android.geoquiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
const val IS_CHEATED = "IS_CHEATED"
const val INDEX = "INDEX"

class CheatViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {
    var isCheated:Boolean
        get() = savedStateHandle.get<Boolean>(IS_CHEATED) ?:false
        set(value) = savedStateHandle.set(IS_CHEATED, value)
}