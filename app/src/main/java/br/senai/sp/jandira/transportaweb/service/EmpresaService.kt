package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.model.Empresa
// import br.senai.sp.jandira.telainicio.model.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface EmpresaService {

    // Retorna uma lista de motoristas. (GET)
    @GET("v1/transportaweb/empresas")
    fun getEmpresas(): Call<List<Empresa>>

    // Retorna um motorista pelo ID. (GET)
    @GET("v1/transportaweb/empresas/{id}")
    fun getEmpresasById(@Path("id") id: Int): Call<Empresa>

    // Enviar uma (POST)
    @Headers("Content-Type: application/json")
    @POST("v1/transportaweb/insertempresa")
    fun postEmpresas(@Body empresaPost: Empresa): Call<Empresa>

    // @Headers("Content-Type: application/json")
    // @POST("login")
    // fun getAlunoByEmailSenha(@Body EmailSenha: Login): Call<LoginResponse>

}