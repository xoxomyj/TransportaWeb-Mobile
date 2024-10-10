package br.senai.sp.jandira.transportaweb.model

import java.time.LocalDate

data class LoginMotorista(
    val email: String = "",
    val senha: String = ""
)

data class RespostaLogin(
    val status_code: Int?,
    val message: String?
)