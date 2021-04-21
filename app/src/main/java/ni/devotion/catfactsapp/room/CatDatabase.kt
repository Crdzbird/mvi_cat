package ni.devotion.catfactsapp.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [CatCacheEntity::class, BreedsCacheEntity::class], version = 1)
abstract class CatDatabase : RoomDatabase() {
    companion object{
        val DATABASE_NAME = "CatDB"
    }
    abstract fun catDao(): CatDao
    /* Notifica a ROOM que existe una clase llamada BreedsDao en la cual se va a manejar
    * toda la logica (CRUD) de la tabla [Breeds]
    */
    abstract fun breedsDao(): BreedsDao

}