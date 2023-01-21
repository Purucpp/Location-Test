package com.yesandroid.locationapp.usecase.errors

import com.yesandroid.locationapp.data.error.Error

interface ErrorUseCase {
    fun getError(errorCode: Int): Error
}
