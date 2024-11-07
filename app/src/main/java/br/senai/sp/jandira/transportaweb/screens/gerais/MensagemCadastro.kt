package br.senai.sp.jandira.transportaweb.screens.gerais

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R

@Composable
fun MensagemCadastro(controleDeNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 10.dp)
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.certo),
                    contentDescription = "Sinal de Certo",
                    modifier = Modifier
                        .size(120.dp)
                )

                Spacer(modifier = Modifier.height(40.dp))

                // Centraliza o texto com TextAlign.Center
                Text(
                    text = "Agradecemos o seu cadastro, entraremos em contato em breve com informações!",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFC00000),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center // Centraliza o texto horizontalmente
                )

                Spacer(modifier = Modifier.height(200.dp))

                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(48.dp)
                        .background(
                            color = Color(0xFFC00000),
                            shape = RoundedCornerShape(corner = CornerSize(18.dp))
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Atualizar",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMensagemCadastro() {
    MensagemCadastro(controleDeNavegacao = NavHostController(LocalContext.current))
}
