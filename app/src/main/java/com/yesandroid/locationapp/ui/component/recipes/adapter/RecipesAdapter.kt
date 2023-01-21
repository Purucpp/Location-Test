package com.yesandroid.locationapp.ui.component.recipes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yesandroid.locationapp.data.dto.recipes.RecipesItem
import com.yesandroid.locationapp.databinding.RecipeItemBinding
import com.yesandroid.locationapp.ui.base.listeners.RecyclerItemListener
import com.yesandroid.locationapp.ui.component.recipes.RecipesListViewModel

/**
 * Created by AhmedEltaher
 */

class RecipesAdapter(private val recipesListViewModel: RecipesListViewModel, private val recipes: List<RecipesItem>) : RecyclerView.Adapter<RecipeViewHolder>() {

    private val onItemClickListener: RecyclerItemListener = object : RecyclerItemListener {
        override fun onItemSelected(recipe: RecipesItem) {
            recipesListViewModel.openRecipeDetails(recipe)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemBinding = RecipeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RecipeViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(recipes[position], onItemClickListener)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }
}

