package com.example.daggerhilt.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.example.daggerhilt.repository.UserRepositoryImpl
import com.example.daggerhilt.view.ui.theme.DaggerHiltTheme
import com.example.daggerhilt.viewModel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content(viewModel = viewModel)
        }
    }
}

@Composable
fun Content(viewModel: MainActivityViewModel) {
    DaggerHiltTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Text(
                modifier = Modifier.padding(all = Dp(10F)),
                text = "Con Dagger Hilt, utility di dependency injection, ho scoperto che ${viewModel.getFullName} ha ${viewModel.getAge} anni.")
        }
    }
}


@Preview
@Composable
fun Preview() {
    val viewModel: MainActivityViewModel = MainActivityViewModel(UserRepositoryImpl())
    Content(viewModel = viewModel)
}