package br.senai.sp.jandira.transportaweb.screens.motoristas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R

@Composable
fun CadastroViagens(controleDeNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Box(
            modifier = Modifier
                .padding(top = 10.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.logoo),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.TopCenter)
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCadastroViagens() {
    CadastroViagens(controleDeNavegacao = NavHostController(LocalContext.current))
}
