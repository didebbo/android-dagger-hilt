package com.example.daggerhilt.viewModel

import androidx.lifecycle.ViewModel
import com.example.daggerhilt.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val userRepo: UserRepository
): ViewModel() {
    val getFullName get() = userRepo.getData().getFullName
    val getAge get() = userRepo.getData().getAge
}