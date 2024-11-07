package br.senai.sp.jandira.transportaweb.screens.gerais

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R

@Composable
fun RecuperarSenha(controleDeNavegacao: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            Image(
                painter = painterResource(id = R.drawable.logoo),
                contentDescription = "Logo",
                modifier = Modifier.padding(top = 10.dp)
                    .size(200.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "RECUPERAR SENHA",
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Spacer(modifier = Modifier.height(70.dp))

            Text(
                text = "NOVA SENHA:",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))


            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFF61221),
                    unfocusedBorderColor = Color(0xFF131313),
                    focusedContainerColor = Color(0xFFF4F4F4),
                    unfocusedContainerColor = Color(0xFFF4F4F4)
                ),
                placeholder = { Text(text = "NOVA SENHA:") }
            )

            Spacer(modifier = Modifier.height(80.dp))

            Text(
                text = "CONFIRMAR NOVA SENHA:",
                fontSize = 17.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))


            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                shape = RoundedCornerShape(10.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(0xFFF61221),
                    unfocusedBorderColor = Color(0xFF131313),
                    focusedContainerColor = Color(0xFFF4F4F4),
                    unfocusedContainerColor = Color(0xFFF4F4F4)
                ),
                placeholder = { Text(text = "CONFIRMAR SENHA:") }
            )

            Spacer(modifier = Modifier.height(80.dp))

            Box(
                modifier = Modifier
                    .width(327.dp)
                    .height(48.dp)
                    .background(
                        color = Color(0xFFC00000),
                        shape = RoundedCornerShape(corner = CornerSize(10.dp))
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "SALVAR",
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
fun PreviewRecuperarSenha() {
    RecuperarSenha(controleDeNavegacao = NavHostController(LocalContext.current))
}
