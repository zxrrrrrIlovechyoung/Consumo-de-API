package com.example.ejemlolistas.ui

import androidx.compose.foundation.lazy.LazyColumn

internal class {
    fun UserListScreen(): @Composable `fun`? {
        val users: `val`
        val viewModel: by
        users.collectAsState()

        LaunchedEffect(Unit)
        run {
            viewModel.loadUsers()
        }

        LazyColumn(
            fillMaxSize()
                .padding(16.0, TODO("Cannot convert element"), p).also { modifier = it }
        )
        run {
            items(users)
            run {
                { user ->
                    Card(
                        fillMaxWidth()
                            .padding(6.0.also { vertical = it }, TODO("Cannot convert element"), p)
                            .also { modifier = it }
                    )
                }
                run {
                    Column(padding(12.0, TODO("Cannot convert element"), p).also { modifier = it })
                    run {
                        Text(
                            "ID: \${user.id}".also { text = it },
                            typography.titleMedium.also { style = it })
                        Text("Nombre: \${user.name}".also { text = it })
                        Text("Usuario: \${user.username}".also { text = it })
                        Text("Correo: \${user.email}".also { text = it })
                    }
                }
            }
        }
    }
}
