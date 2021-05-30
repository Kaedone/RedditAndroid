package com.droidcba.kedditbysteps.commons

import android.util.log

object Logger {
    private const val TAG="Reddit"

    fun dt(value: String){
        Log.d(TAG, "Название трэда: ${Thread.currentThread().name}-$value")
    }
}