package com.yesandroid.locationapp.data.remote

import com.yesandroid.locationapp.data.Resource
import com.yesandroid.locationapp.data.dto.recipes.Recipes

/**
 * Created by AhmedEltaher
 */

internal interface RemoteDataSource {
    suspend fun requestRecipes(): Resource<Recipes>
}
