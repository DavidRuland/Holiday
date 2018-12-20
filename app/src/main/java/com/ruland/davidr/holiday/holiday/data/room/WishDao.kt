package com.ruland.davidr.holiday.holiday.data.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface WishDao {

    @Query("SELECT * FROM wish_lists")
    fun getAll(): List<Wish>

    @Insert
    fun insertAll(vararg wish: Wish)
}