package br.senai.sp.jandira.transportaweb.screens.gerais

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
import androidx.compose.foundation.border
import androidx.compose.runtime.Composable

@Composable
fun TelaSelecao(controleDeNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                painter = painterResource(id = R.drawable.logoo),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp)
            )

            Spacer(modifier = Modifier.height(70.dp))

            Text(
                text = "Que tipo de serviço você oferece?",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Primeiro Quadrado com a imagem de "caminhao" alinhada à esquerda
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp) // Ajustei a altura para dar espaço para a imagem
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .border(3.dp, Color(0xFFE5E5E5), RoundedCornerShape(16.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Imagem "caminhao" à esquerda
                    Image(
                        painter = painterResource(id = R.drawable.caminhaozinho), // A imagem de caminhão
                        contentDescription = "Caminhão",
                        modifier = Modifier.size(70.dp) // Tamanho da imagem
                    )

                    // Colocando o texto e outros elementos à direita
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "MOTORISTA",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFC00000)
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // Texto "Tenho caminhão e presto serviços" deslocado para a direita
                        Text(
                            text = "Tenho caminhão e presto serviços",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black,
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Segundo Quadrado com a imagem de "caminhao" à esquerda e elementos iguais ao primeiro quadrado
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp) // Ajustei a altura para ficar igual ao primeiro quadrado
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .border(3.dp, Color(0xFFE5E5E5), RoundedCornerShape(16.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Imagem "caminhao" à esquerda, com um padding de 5 dp à direita
                    Image(
                        painter = painterResource(id = R.drawable.empresa), // A imagem de caminhão
                        contentDescription = "Caminhão",
                        modifier = Modifier
                            .size(70.dp) // Tamanho da imagem
                            .padding(start = 5.dp) // Move a imagem para a direita em 5dp
                    )

                    // Colocando o texto e outros elementos à direita
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            text = "EMPRESA",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFC00000),
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        // Texto "Tenho caminhão e presto serviços" deslocado para a direita
                        Text(
                            text = "Possuo uma empresa com serviços",
                            fontSize = 19.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black,
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(100.dp))

            // Botão "Continuar"
            Box(
                modifier = Modifier
                    .width(300.dp)
                    .height(48.dp)
                    .background(
                        color = Color(0xFFC00000),
                        shape = RoundedCornerShape(14.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Continuar",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTelaSelecao() {
    TelaSelecao(controleDeNavegacao = NavHostController(LocalContext.current))
}
