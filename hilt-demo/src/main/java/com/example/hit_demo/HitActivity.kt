package com.example.hit_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HitActivity : AppCompatActivity() {
    @Inject
    lateinit var user: User
    @Inject
    lateinit var student:Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hit)

        println(user.name)
        println(student.name)
    }
}