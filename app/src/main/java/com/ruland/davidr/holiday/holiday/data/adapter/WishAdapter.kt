package com.ruland.davidr.holiday.holiday.data.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.ruland.davidr.holiday.databinding.HolderWishBinding
import com.ruland.davidr.holiday.holiday.data.room.Wish
import com.ruland.davidr.holiday.holiday.screen.wish.WishActivity
import com.ruland.davidr.holiday.holiday.view.WishViewHolder

data class WishAdapter(var wishlist: List<Wish>, private val wisActivity: WishActivity) : RecyclerView.Adapter<WishViewHolder>() {

    override fun getItemCount(): Int {
        return wishlist.size
    }

    override fun onBindViewHolder(holder: WishViewHolder, position: Int) {
        holder.setListCategoryItem(wishlist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WishViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val holderListCategoryItemBinding = HolderWishBinding.inflate(layoutInflater, parent, false)
        return WishViewHolder(holderListCategoryItemBinding, wisActivity)
    }
}