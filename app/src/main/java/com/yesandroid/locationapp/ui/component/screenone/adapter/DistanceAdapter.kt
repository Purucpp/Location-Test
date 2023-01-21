package com.yesandroid.locationapp.ui.component.screenone.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yesandroid.locationapp.data.dto.recipes.RecipesItem
import com.yesandroid.locationapp.databinding.DistanceItemBinding
import com.yesandroid.locationapp.databinding.RecipeItemBinding
import com.yesandroid.locationapp.ui.base.listeners.RecyclerItemListener
import com.yesandroid.locationapp.ui.component.recipes.RecipesListViewModel
import com.yesandroid.locationapp.ui.component.recipes.adapter.RecipeViewHolder
import com.yesandroid.locationapp.ui.component.screenone.ScreenOneViewModel


class DistanceAdapter(private val recipesListViewModel: ScreenOneViewModel, private val recipes: List<RecipesItem>) : RecyclerView.Adapter<DistanceViewHolder>() {

    private val onItemClickListener: RecyclerItemListener = object : RecyclerItemListener {
        override fun onItemSelected(recipe: RecipesItem) {
            recipesListViewModel.openRecipeDetails(recipe)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DistanceViewHolder {
        val itemBinding = DistanceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DistanceViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: DistanceViewHolder, position: Int) {
        holder.bind(recipes[position], onItemClickListener)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }
}