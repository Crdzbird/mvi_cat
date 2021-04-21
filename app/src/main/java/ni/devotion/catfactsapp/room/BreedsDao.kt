package ni.devotion.catfactsapp.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


/*
Realiza interaccion con BD.
Puede ejecutar cualquier consulta SQL, tales como:
- Insert into table.
- Delete from table.
- Update from table.
- Select from table.
 */

// Data Access Object
// Es necesario unicamente cuando se requiera de interaccion de MODELO a TABLA DE BASE DE DATOS
// y viceversa.
@Dao
interface BreedsDao {

    // Inserta una nueva fila en la tabla BreedsCacheEntity usando como referencia el modelo de
    // BreedsCacheEntity ubicado en la carpeta room.
    // REPLACE: Reemplaza los valores antiguos con nuevos datos, exceptuando el identificador unico, debido a que
    // dicho identificador ya se encuentra previamente insertado y su valor no va a cambiar.
    // ABORT: Evita que se inserte data unica que ya estaba previamente registrada en alguna fila.
    // IGNORE: Ignora los campos que dan error, y actualiza o inserta los datos que no dan error.
    // Parecido a un try{}catch(){}
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(breedsCacheEntity :BreedsCacheEntity): Long

    // Retorna un objeto del tipo BreedsCacheEntity, usando un parametro unico (ID) para obtener la data
    @Query("select * from Breeds where id = :parametro")
    suspend fun select(parametro : Int): BreedsCacheEntity

    // Retorna una lista de BreedsCacheEntity.
    // Si no existe data, retorna una lista VACIA:   []
    @Query("select * from Breeds")
    suspend fun selectAll(): List<BreedsCacheEntity>

}