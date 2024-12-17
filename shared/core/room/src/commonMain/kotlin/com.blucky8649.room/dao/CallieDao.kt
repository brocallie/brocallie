package com.blucky8649.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.blucky8649.room.model.CallieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CallieDao {
    @Query("SELECT * FROM callies")
    fun getCallieList() : Flow<List<CallieEntity>>

    @Insert
    suspend fun insertCallie(callieEntity: CallieEntity)

    @Query("DELETE FROM callies WHERE id = :id")
    suspend fun deleteCallie(id: Long)
}