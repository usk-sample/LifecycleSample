package com.example.lifecyclesample

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

interface MyLifecycleListener {
    fun onLifecycleDestroy()
    fun onLifecyclePause()
    fun onLifecycleResume()
}

class MyLifecycleObserver : LifecycleObserver {

    private lateinit var name: String
    private lateinit var listener: MyLifecycleListener

    fun set(lifecycleOwner: LifecycleOwner, name: String, listener: MyLifecycleListener) {
        this.name = name
        this.listener = listener
        lifecycleOwner.lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy() {
        Log.e(name, "onDestroy")
        listener.onLifecycleDestroy()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause() {
        Log.e(name, "onPause")
        listener.onLifecyclePause()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume() {
        Log.e(name, "onResume")
        listener.onLifecycleResume()
    }

}