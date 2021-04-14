package ni.devotion.catfactsapp.repository

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ni.devotion.catfactsapp.retrofit.BreedsMapper
import ni.devotion.catfactsapp.retrofit.CatRetrofit
import ni.devotion.catfactsapp.retrofit.NetworkMapper
import ni.devotion.catfactsapp.room.CacheMapper
import ni.devotion.catfactsapp.room.CatDao
import ni.devotion.catfactsapp.utils.DataState

class BreedsRepository constructor(
    private val catDao: CatDao,
    private val catRetrofit: CatRetrofit,
    private val cacheMapper: CacheMapper,
    private val breedsMapper: BreedsMapper
) {
    suspend fun getBreeds(): Flow<DataState> = flow {
        emit(DataState.Loading)
        delay(5000)
        try {
            val catData = catRetrofit.get_breeds()
            val catMap = breedsMapper.mapFromEntityList(catData)
            for (tempCat in catMap){
                catDao.insert(cacheMapper.mapToEntity(tempCat))
            }
            val cacheCat = catDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cacheCat)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}