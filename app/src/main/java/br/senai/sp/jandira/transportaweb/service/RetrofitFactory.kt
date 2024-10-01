package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.service.CEmpresaService
import br.senai.sp.jandira.transportaweb.service.CMotoristaService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "https://crud-03-09.onrender.com/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

        fun getMotoristaService(): CMotoristaService {
            return retrofitFactory.create(CMotoristaService::class.java)
        }

        fun getEmpresaService(): CEmpresaService{
             return retrofitFactory.create(CEmpresaService::class.java)
        }

        fun postMotoristaService(): CMotoristaService{
            return retrofitFactory.create(CMotoristaService::class.java)
        }

        fun postEmpresaService(): CEmpresaService {
            return retrofitFactory.create((CEmpresaService::class.java))
        }

}