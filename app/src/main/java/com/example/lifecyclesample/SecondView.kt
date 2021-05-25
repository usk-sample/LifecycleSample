package com.example.lifecyclesample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.TextPaint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

class SecondView @JvmOverloads constructor(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0) :
    View(context, attrs, defStyleAttr, defStyleRes), MyLifecycleListener {

    private val observer = MyLifecycleObserver()

    //https://developer.android.com/reference/androidx/lifecycle/Lifecycle?hl=ja
    fun setLifecycleOwner(owner: LifecycleOwner) {
        observer.set(owner, TAG, this)
    }

    override fun onLifecycleDestroy() {
        //do something
    }

    override fun onLifecyclePause() {
        //do something
    }

    override fun onLifecycleResume() {
        //do something
    }

    companion object {
        private const val TAG = "SecondView"
    }

}