package br.senai.sp.jandira.transportaweb.model

import java.time.LocalDate

data class Motorista(
    val nome: String = "",
    val foto_url: String = "",
    val data_nascimento: String = "",
    val cpf: String = "",
    val email: String = "",
    val senha: String = ""
)

data class LoginMotorista(
    val email: String = "",
    val senha: String = ""
)

data class RespostaLogin(
    val status_code: Int?,
    val message: String?
)