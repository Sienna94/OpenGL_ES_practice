package com.example.kotlinpractice

import android.content.Context
import android.opengl.GLSurfaceView

class MyGLSurfaceView (context:Context) : GLSurfaceView(context) {
    private val renderer : MyGLRenderer
    init {
        //OpenGl ES context
        setEGLContextClientVersion(2)
        renderer = MyGLRenderer()
        //GLSurfaceView 위에 그릴 랜더러
        setRenderer(renderer)
        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    }
}