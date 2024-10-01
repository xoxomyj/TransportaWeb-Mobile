package br.senai.sp.jandira.transportaweb.screens.motoristas

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R
import br.senai.sp.jandira.transportaweb.model.Motorista
import br.senai.sp.jandira.transportaweb.service.RetrofitFactory
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroMotorista(controleNavegacao: NavHostController) {
    val nome = remember { mutableStateOf("") }
    val foto_url = remember { mutableStateOf("") }
    val data_nascimento = remember { mutableStateOf("") }
    val cpf = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val senha = remember { mutableStateOf("") }
    val retrofitFactory = RetrofitFactory()

    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Card(
                modifier = Modifier
                    .padding(top = 12.dp)
                    .width(240.dp)
                    .height(100.dp),
                colors = CardDefaults.cardColors(Color(0xffffff))
            ) {
                Image(
                    painterResource(id = R.drawable.logoo),
                    contentDescription = "Logo do sistema",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .offset(y = 10.dp)
                        .fillMaxSize(),
                )
            }

            Column(modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Digite o seu nome:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = nome.value,
                    onValueChange = { nome.value = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "NOME:") }
                )

                // Campo de foto de perfil
                Text(
                    text = "Selecione uma foto de perfil:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = foto_url.value,
                    onValueChange = { foto_url.value = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "FOTO:") }
                )

                // Campo de data de nascimento
                Text(
                    text = "Digite sua data de nascimento:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = data_nascimento.value,
                    onValueChange = { data_nascimento.value = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "DATA:") }
                )

                // Campo de CPF
                Text(
                    text = "Digite o seu CPF:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = cpf.value,
                    onValueChange = { cpf.value = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "CPF:") }
                )

                // Campo de email
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Digite o seu e-mail:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = email.value,
                    onValueChange = { email.value = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "E-MAIL:") }
                )

                // Campo de senha
                Text(
                    text = "Crie uma senha:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier.height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = senha.value,
                    onValueChange = { senha.value = it },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "SENHA:") }
                )

                Spacer(modifier = Modifier.height(45.dp))

                // Botão de cadastro
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier.padding(12.dp),
                        horizontalAlignment = Alignment.End
                    ) {
                        Button(
                            onClick = {
                                val motorista = Motorista(
                                    nome = nome.value,
                                    foto_url = foto_url.value,
                                    data_nascimento = data_nascimento.value,
                                    cpf = cpf.value,
                                    email = email.value,
                                    senha = senha.value
                                )

                                val motoristaService = retrofitFactory.postMotoristaService()
                                motoristaService.postMotoristas(motorista)
                                    .enqueue(object : Callback<Motorista> {
                                        override fun onResponse(
                                            call: Call<Motorista>,
                                            response: Response<Motorista>
                                        ) {
                                            if (response.isSuccessful) {
                                                Log.i("response", response.body().toString())
                                                controleNavegacao.navigate("cadastroempresa")
                                            } else {
                                                Log.i(
                                                    "response",
                                                    response.errorBody()?.string() ?: "Erro desconhecido"
                                                )
                                            }
                                        }

                                        override fun onFailure(
                                            call: Call<Motorista>,
                                            t: Throwable
                                        ) {
                                            Log.i("response", t.toString())
                                        }
                                    })
                            },
                            modifier = Modifier
                                .height(60.dp)
                                .width(350.dp)
                                .padding(2.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC00000)),
                            shape = RoundedCornerShape(24.dp)
                        ) {
                            Text(text = "Cadastrar", color = Color.White)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCadastroMotorista() {
    TransportaWebTheme {
        CadastroMotorista(controleNavegacao = NavHostController(LocalContext.current))
    }
}
