package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.model.LoginMotorista
import br.senai.sp.jandira.transportaweb.model.Motorista
import br.senai.sp.jandira.transportaweb.model.RespostaLogin
// import br.senai.sp.jandira.telainicio.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface MotoristaService {

    // Retorna uma lista de motoristas. (GET)
    @GET("v1/transportaweb/motoristas")
    fun getMotoristas(): Call<List<Motorista>>

    // Retorna um motorista pelo ID. (GET)
    @GET("v1/transportaweb/motoristas/{id}")
    fun getMotoristasById(@Path("id") id: Int): Call<Motorista>

    // Enviar uma (POST)
    @Headers("Content-Type: application/json")

    @POST("v1/transportaweb/insertmotorista")
    fun postMotoristas(@Body motorista: Motorista): Call<Motorista>

    // @Headers("Content-Type: application/json")
    // @POST("login")
    // fun getAlunoByEmailSenha(@Body EmailSenha: Login): Call<LoginResponse>

    @Headers("Content-Type: application/json")
    @POST("/v1/transportaweb/motorista/login")
    fun getMotoristaByEmailSenha(@Body EmailSenha: LoginMotorista): Call<RespostaLogin>

}