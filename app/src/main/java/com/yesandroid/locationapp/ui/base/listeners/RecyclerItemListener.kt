package com.yesandroid.locationapp.ui.base.listeners

import com.yesandroid.locationapp.data.dto.recipes.RecipesItem

/**
 * Created by AhmedEltaher
 */

interface RecyclerItemListener {
    fun onItemSelected(recipe : RecipesItem)
}
