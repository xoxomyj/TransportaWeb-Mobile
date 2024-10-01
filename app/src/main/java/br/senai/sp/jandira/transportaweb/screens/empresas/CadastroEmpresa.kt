package br.senai.sp.jandira.transportaweb.screens.empresas

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import br.senai.sp.jandira.transportaweb.R
import br.senai.sp.jandira.transportaweb.model.Empresa
import br.senai.sp.jandira.transportaweb.model.Motorista
import br.senai.sp.jandira.transportaweb.service.RetrofitFactory
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadastroEmpresa(controleNavegacao: NavHostController) {
    val nome = remember { mutableStateOf("") }
    val razaoSocial = remember { mutableStateOf("") }
    val cep = remember { mutableStateOf("") }
    val cnpj = remember { mutableStateOf("") }
    val numero_telefone = remember { mutableStateOf("") }
    val img_perfil = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val senha = remember { mutableStateOf("") }
    val retrofitFactory = RetrofitFactory()

    Surface {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()), // Permite rolagem
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
                    text = "Digite o nome da sua empresa:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = nome.value,
                    onValueChange = {nome.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "NOME DA EMPRESA:") }
                )

                Text(
                    text = "Digite a razão social:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = razaoSocial.value,
                    onValueChange = {razaoSocial.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "RAZÃO SOCIAL:") }
                )

                Text(
                    text = "Digite o CEP da empresa:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = cep.value,
                    onValueChange = {cep.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "CEP:") }
                )


                Text(
                    text = "Digite o CNPJ da empresa:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = cnpj.value,
                    onValueChange = {cnpj.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "CNPJ:") }
                )

                Text(
                    text = "Digite um telefone:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = numero_telefone.value,
                    onValueChange = {numero_telefone.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "TELEFONE:") }
                )

                Text(
                    text = "Selecione uma foto de perfil:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = img_perfil.value,
                    onValueChange = {img_perfil.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "FOTO:") }
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Digite o seu e-mail corporativo:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = email.value,
                    onValueChange = {email.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "E-MAIL:") }
                )

                Text(
                    text = "Crie uma senha:",
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                OutlinedTextField(
                    modifier = Modifier
                        .height(50.dp),
                    shape = RoundedCornerShape(10.dp),
                    value = senha.value,
                    onValueChange = {senha.value=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFFF61221),
                        unfocusedBorderColor = Color(0xFF131313),
                        focusedContainerColor = Color(0xFFF4F4F4),
                        unfocusedContainerColor = Color(0xFFF4F4F4)
                    ),
                    placeholder = { Text(text = "SENHA:") }
                )

                Spacer(modifier = Modifier.height(45.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(
                        modifier = Modifier
                            .padding(12.dp),
                        horizontalAlignment = Alignment.End
                    ) {

                        Button(
                            onClick = {

                               val empresa = Empresa(
                                    nome = nome.value,
                                    razaoSocial = razaoSocial.value,
                                    cep = cep.value,
                                    cnpj = cnpj.value,
                                    numero_telefone = numero_telefone.value,
                                    img_perfil = img_perfil.value,
                                    email = email.value,
                                    senha = senha.value
                                )

                                val empresaService = retrofitFactory.postEmpresaService()
                                empresaService.postEmpresas(empresa)
                                    .enqueue(object : Callback<Empresa> {
                                        override fun onResponse(
                                            call: Call<Empresa>,
                                            response: Response<Empresa>
                                        ) {
                                            if (response.isSuccessful) {
                                                Log.i("response", response.body().toString())
                                                controleNavegacao.navigate("cadastromotorista")
                                            } else {
                                                Log.i(
                                                    "response",
                                                    response.errorBody()?.string() ?: "Erro desconhecido"
                                                )
                                            }
                                        }

                                        override fun onFailure(
                                            call: Call<Empresa>,
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
                            colors = ButtonDefaults
                                .buttonColors(containerColor = Color(0xFFC00000)),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(text = "CADASTRAR", fontSize = 18.sp)
                        }

                    }

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CadastroMotoristaPreview() {
    TransportaWebTheme {
        // Preview da tela de cadastro
    }
}
