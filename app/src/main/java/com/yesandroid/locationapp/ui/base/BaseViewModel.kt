package com.yesandroid.locationapp.ui.base

import androidx.lifecycle.ViewModel
import com.yesandroid.locationapp.usecase.errors.ErrorManager
import javax.inject.Inject


/**
 * Created by AhmedEltaher
 */


abstract class BaseViewModel : ViewModel() {
    /**Inject Singleton ErrorManager
     * Use this errorManager to get the Errors
     */
    @Inject
    lateinit var errorManager: ErrorManager
}
