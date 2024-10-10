package br.senai.sp.jandira.transportaweb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.transportaweb.model.LoginMotorista
import br.senai.sp.jandira.transportaweb.screens.LoginMotorista
import br.senai.sp.jandira.transportaweb.screens.empresas.CadastroEmpresa
import br.senai.sp.jandira.transportaweb.screens.motoristas.CadastroMotorista
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

class   MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TransportaWebTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleNavegacao = rememberNavController()
                    NavHost(navController = controleNavegacao,
                        startDestination = "loginMotorista"
                    ){
                        composable(route = "cadastroempresa"){ CadastroEmpresa(controleNavegacao) }
                        composable(route = "cadastromotorista"){ CadastroMotorista(controleNavegacao) }
                        composable(route = "loginMotorista"){ LoginMotorista(controleNavegacao) }
                    }

                }
            }
        }
    }
}