package com.ruland.davidr.holiday.holiday.data.room

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "wish_lists")
data class Wish(@ColumnInfo(name="category_name") var categoryName: String, @ColumnInfo(name="price") var price: String, @ColumnInfo(name="description") var desc: String, @ColumnInfo(name="rating") var rating: String,
                @ColumnInfo(name="id") @PrimaryKey(autoGenerate = true) var id: Long = 0)