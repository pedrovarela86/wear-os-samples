package com.pedrovarela.sample

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class MainActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enables Always-on
        setAmbientEnabled()
    }
}


class SpecialFunction : () -> Unit {
    override fun invoke() {
        println("Not yet implemented")
    }
}

class Other {

    inline fun invoke(specialFunction: SpecialFunction) {

    }

}

fun main() {
    try {
        SpecialFunction()()
    } catch (ex: Exception) {
        println("")
    }
}