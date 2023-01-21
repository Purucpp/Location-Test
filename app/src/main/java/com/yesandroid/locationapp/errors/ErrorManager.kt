package com.yesandroid.locationapp.usecase.errors

import com.yesandroid.locationapp.data.error.Error
import com.yesandroid.locationapp.data.error.mapper.ErrorMapper
import javax.inject.Inject

/**
 * Created by AhmedEltaher
 */

class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) : ErrorUseCase {
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorsMap.getValue(errorCode))
    }
}
