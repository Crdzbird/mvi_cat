package ni.devotion.catfactsapp.retrofit

import retrofit2.http.GET

interface BreedRetrofit {
     @GET("search")
     suspend fun get(): List<BreedsNetworkEntity>
}