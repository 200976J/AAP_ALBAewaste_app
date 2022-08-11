package com.google.codelabs.buildyourfirstmap.data.entity

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface RegisterDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun registerUser(register: Register)

    @Query("SELECT * FROM User ORDER BY userId ASC")
    fun readAllData(): LiveData<Register>
}