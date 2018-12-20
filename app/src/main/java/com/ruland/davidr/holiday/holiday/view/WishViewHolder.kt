package com.ruland.davidr.holiday.holiday.view

import android.support.v7.widget.RecyclerView
import com.ruland.davidr.holiday.databinding.HolderWishBinding
import com.ruland.davidr.holiday.holiday.data.room.Wish
import com.ruland.davidr.holiday.holiday.screen.wish.WishActivity

data class WishViewHolder(private val holderListCategoryBinding: HolderWishBinding,
                          private val wishactivity: WishActivity) :
        RecyclerView.ViewHolder(holderListCategoryBinding.root) {

    fun setListCategoryItem(wish: Wish) {
        val listCategoryViewModel = WishViewModel(wish)
        holderListCategoryBinding.wishItem = listCategoryViewModel
        holderListCategoryBinding.executePendingBindings()
    }
}