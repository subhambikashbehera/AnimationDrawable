package com.subhambikash.animationdrawable

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Constraints

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraint = findViewById<ConstraintLayout>(R.id.constraint)
        val animation = constraint.background as AnimationDrawable
        animation.setEnterFadeDuration(1000)
        animation.setExitFadeDuration(2500)
        animation.start()


    }
}