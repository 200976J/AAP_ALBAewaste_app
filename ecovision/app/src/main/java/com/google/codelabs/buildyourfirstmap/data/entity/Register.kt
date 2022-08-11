package com.google.codelabs.buildyourfirstmap.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(
    tableName = "User",
    indices = [
        Index("id", unique=true)
    ]
)

data class Register(
    @PrimaryKey(autoGenerate = true) val userId: Long = 0,
    @ColumnInfo(name = "usename") val username: String,
    @ColumnInfo(name = "password") val password: String,
    @ColumnInfo(name = "pfp") val pfp: ByteArray
)