package com.example.ejemlolistas
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejemlolistas.ui.theme.EjemloListasTheme
import com.example.ejemlolistas.viewmodel.UsersViewModel
import com.example.ejemlolistas.ui.UserListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val viewModel = UsersViewModel()  // ← aquí creamos nuestro ViewModel

        setContent {
            EjemloListasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    UserListScreen(
                        viewModel = viewModel,
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
