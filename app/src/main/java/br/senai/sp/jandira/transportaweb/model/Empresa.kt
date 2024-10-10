package br.senai.sp.jandira.transportaweb.model

data class Empresa(
    val nome: String = "",
    val razaoSocial: String = "",
    val cep: String = "",
    val cnpj: String = "",
    val numero_telefone: String = "",
    val img_perfil: String = "",
    val email: String = "",
    val senha: String = ""
)
