package com.example.narutocount2.presentation.main

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {
    private val _state = mutableStateOf(MainState())
    val state: State<MainState> = _state

    fun onEvent(event: MainEvent) {
        when (event) {
            is MainEvent.ClickedWindowButton -> {
                _state.value = _state.value.copy(
                    isOpenWindow = !_state.value.isOpenWindow
                )
                Log.e("windows", "test status: ${_state.value.isOpenWindow}")
            }
        }
    }
}