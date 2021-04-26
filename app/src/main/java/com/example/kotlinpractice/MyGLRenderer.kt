package com.example.kotlinpractice

import android.opengl.GLES20
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

class MyGLRenderer : GLSurfaceView.Renderer {
    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        //프레임의 배경색상 설정하기
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 0.0f);
    }

    override fun onDrawFrame(gl: GL10?) {
        //표면 변화시
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)
    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
        //표면 변화시
        GLES20.glViewport(0, 0, width, height)
    }

}