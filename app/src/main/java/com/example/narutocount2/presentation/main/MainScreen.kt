package com.example.narutocount2.presentation.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import com.example.narutocount2.presentation.main.components.MainButton

@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel()
) {
    Scaffold(
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainButton(
                text = "开启计时器",
                onClick = {
                    viewModel.onEvent(MainEvent.ClickedWindowButton)
                }
            )
            MainButton(
                text = "配置计时器",
                onClick = {}
            )
            MainButton(
                text = "退出应用",
                onClick = {}
            )
        }
    }
}