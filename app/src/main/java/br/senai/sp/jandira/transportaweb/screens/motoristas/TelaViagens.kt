package br.senai.sp.jandira.transportaweb.screens.motoristas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R

@Composable
fun TelaViagens(controleNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFC00000)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .size(430.dp, 209.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .align(Alignment.CenterHorizontally)
            ) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.Start
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.logoo),
                            contentDescription = "Logotipo",
                            modifier = Modifier.size(87.dp, 90.dp)
                                .align(Alignment.End)
                        )

                        // Adicionando o texto "Olá, Nome"
                        Text(
                            text = "Olá, Nome",
                            style = TextStyle(
                                color = Color(0xFFBB4848),
                                fontSize = 20.sp
                            ),
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(30.dp, 10.dp)
                        )


                        Text(
                            text = "Histórico de Viagens",
                            style = TextStyle(
                                color = Color(0xFFBB4848),
                                fontSize = 20.sp
                            ),
                            modifier = Modifier.padding(start = 30.dp, top = 5.dp)
                        )

                        Box(
                            modifier = Modifier
                                .padding(top = 4.dp, start = 30.dp, end = 30.dp)
                                .fillMaxWidth()
                                .height(2.dp)
                                .background(color = Color(0xFFDADADA))
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTelaViagens() {
    TelaViagens(controleNavegacao = NavHostController(LocalContext.current))
}

