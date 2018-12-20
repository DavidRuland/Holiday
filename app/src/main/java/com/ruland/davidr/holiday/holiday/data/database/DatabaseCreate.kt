package com.ruland.davidr.holiday.holiday.data.database

import android.app.Application
import android.arch.persistence.room.Room

class DatabaseCreate:Application() {


    companion object {
        var database: AppDatabase? = null

    }



    override fun onCreate() {
        super.onCreate()
        DatabaseCreate.database = Room.databaseBuilder(this, AppDatabase::class.java,
                "wishlists-db").build()

    }




}

