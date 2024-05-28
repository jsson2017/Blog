package com.todo.blog.ui.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {
    /**
     * Holds current user state
     */
    var _userState = MutableStateFlow(UserUiState(
        username = "zackfairfan64",
        iconUri = ""
    ))
    val userState: StateFlow<UserUiState> = _userState.asStateFlow()
}

data class UserUiState(
    val id: Int = 0,
    val username: String = "",
    val iconUri: String = ""
)