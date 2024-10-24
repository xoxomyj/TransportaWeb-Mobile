package br.senai.sp.jandira.transportaweb.model

data class Viagem(
    val id_viagem: Int = 0,
    val dia_partida: String = "", //mudar de strings para a classe adequada
    val horario_partida: String = "", //mudar de strings para a classe adequada
    val dia_chegada: String = "", //mudar de strings para a classe adequada
    val remetente: String = "",
    val destinatario: String = "",
    val status_entregue: String = "",
    val id_partida: Int = 0,
    val id_destino: Int = 0,
    val id_motorista: Int = 0,
    val id_veiculo: Int = 0
)
