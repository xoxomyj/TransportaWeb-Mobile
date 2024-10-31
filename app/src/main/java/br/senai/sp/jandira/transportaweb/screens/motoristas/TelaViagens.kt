package br.senai.sp.jandira.transportaweb.screens.motoristas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Box(
                modifier = Modifier
                    .size(430.dp, 209.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .align(Alignment.CenterHorizontally)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.Top
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 30.dp, top = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Olá, Nome",
                            style = TextStyle(
                                color = Color(0xFFBB4848),
                                fontSize = 20.sp
                            ),
                            fontWeight = FontWeight.Bold,
                        )

                        Spacer(modifier = Modifier.weight(1f))

                        Image(
                            painter = painterResource(id = R.drawable.logoo),
                            contentDescription = "Logotipo",
                            modifier = Modifier
                                .size(87.dp, 90.dp)
                                .padding(start = 10.dp)
                        )
                    }

                    // Texto "Histórico de Viagens"
                    Text(
                        text = "Histórico de Viagens",
                        style = TextStyle(
                            color = Color(0xFFBB4848),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier.padding(start = 30.dp, top = 10.dp, bottom = 16.dp)
                    )

                    // Linha de separação
                    Box(
                        modifier = Modifier
                            .padding(start = 30.dp, end = 30.dp)
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(color = Color(0xFFDADADA))
                    )

                    // Row com informações
                    Row(
                        modifier = Modifier
                            .padding(start = 30.dp, top = 8.dp)
                    ) {
                        Text(
                            text = "Concluídas",
                            style = TextStyle(
                                color = Color(0xFF000000),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Text(
                            text = " | ",
                            style = TextStyle(
                                color = Color(0xFF000000),
                                fontSize = 15.sp
                            ),
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
                        )

                        Text(
                            text = "Em Andamento",
                            style = TextStyle(
                                color = Color(0xFF000000),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )

                        Text(
                            text = " | ",
                            style = TextStyle(
                                color = Color(0xFF000000),
                                fontSize = 15.sp
                            ),
                            modifier = Modifier.padding(start = 8.dp, end = 8.dp)
                        )

                        Text(
                            text = "Disponíveis",
                            style = TextStyle(
                                color = Color(0xFF000000),
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Box(
                modifier = Modifier
                    .width(369.dp)
                    .height(203.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .padding(16.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Column {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top
                    ) {
                        Text(
                            text = "Pedro Pedraga",
                            color = Color(0xFFBB4848),
                            style = TextStyle(fontSize = 20.sp),
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Dist: 14 mi",
                            color = Color(0xFFBB4848),
                            style = TextStyle(fontSize = 17.sp),
                            fontWeight = FontWeight.Bold
                        )
                    }

                    // Imagem de localização com texto ao lado
                    Row(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.localizacao),
                            contentDescription = "Localização",
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(8.dp)) // Espaçamento entre imagem e texto

                        Text(
                            text = "6391 Elgin St. Celina, Delaware 10299",
                            color = Color.Gray,
                            fontWeight = FontWeight.Bold,
                            style = TextStyle(fontSize = 14.sp)
                        )
                    }

                    // Imagem da caixa com texto ao lado
                    Row(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.box),
                            contentDescription = "Caixa",
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(8.dp)) // Espaçamento entre imagem e texto

                        Text(
                            text = "Product - 02",
                            color = Color.Gray,
                            style = TextStyle(fontSize = 14.sp)
                        )
                    }

                    // Imagem do círculo com texto ao lado
                    Row(
                        modifier = Modifier
                            .padding(top = 6.dp)
                            .align(Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.circle),
                            contentDescription = "Círculo",
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(8.dp)) // Espaçamento entre imagem e texto

                        Text(
                            text = "Price - $52.01",
                            color = Color.Gray,
                            style = TextStyle(fontSize = 14.sp)
                        )
                    }

                    // Linha de separação abaixo da última imagem
                    Spacer(modifier = Modifier.height(8.dp)) // Aumenta a separação
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(2.dp)
                            .background(color = Color(0xFFDADADA))
                    )

                    // Cilindro e quadrado na mesma linha
                    Spacer(modifier = Modifier.height(8.dp)) // Espaçamento entre a linha e os itens
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween // Para alinhar os itens
                    ) {
                        // Cilindro
                        Box(
                            modifier = Modifier
                                .width(114.dp)
                                .height(22.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(Color(0xFFC00000))
                        ) {
                            // Texto dentro do cilindro
                            Text(
                                text = "WO# 04-1209",
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.Center) // Centraliza o texto dentro do cilindro
                                    .padding(horizontal = 8.dp), // Adiciona um pouco de padding
                                style = TextStyle(fontSize = 12.sp) // Tamanho do texto
                            )
                        }

                        // Quadrado no canto direito
                        Box(
                            modifier = Modifier
                                .size(35.64.dp, 32.dp)
                                .clip(RoundedCornerShape(4.dp))
                                .background(Color(0xFFC00000))
                        ) {
                            Text(
                                text = "03",
                                color = Color.White,
                                modifier = Modifier
                                    .align(Alignment.Center), // Centraliza o texto dentro do quadrado
                                style = TextStyle(fontWeight = FontWeight.Bold)
                            )
                        }
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
