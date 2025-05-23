package com.example.myapplication

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor() : ViewModel() {
    // Exemplo de estado
    val message = "Hello from Hilt ViewModel!"
}
