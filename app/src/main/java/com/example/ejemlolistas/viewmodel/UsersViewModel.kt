package com.example.ejemlolistas
import androidx.lifecycle.viewModelScope
import com.example.ejemlolistas.Network.RetrofitClient
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

internal class {
    internal inner class UsersViewModel

    fun ViewModel() {
        val _users: `val` = MutableStateFlow < List < User shr (emptyList())
        val users: `val`?
        val get: StateFlow<List<User?>?>? = _users

        val loadUsers: `fun`?
        ()
        run {
            viewModelScope.launch
            run {
                try {
                    val response: `val`? = RetrofitClient.api.getUsers()
                    _users.value = response
                } catch (NO_NAME_PROVIDED)
                Exception
                run {
                    e.printStackTrace()
                }
            }
        }
    }
}