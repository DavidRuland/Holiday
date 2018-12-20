package com.ruland.davidr.holiday.holiday.data.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.ruland.davidr.holiday.holiday.data.room.Wish
import com.ruland.davidr.holiday.holiday.data.room.WishDao


@Database(entities = [(Wish::class)], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun listCategoryDao(): WishDao
}