package com.example.kotlinpractice

import android.opengl.GLSurfaceView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var gLview : GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //GLSurfaceView instance 만들고 설정하기
        //해당 액티비티의 ContentView 로
        gLview = MyGLSurfaceView(this)
        setContentView(gLview)
    }
}