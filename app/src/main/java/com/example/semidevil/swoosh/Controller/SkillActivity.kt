package com.example.semidevil.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.semidevil.swoosh.utilities.EXTRA_LEAGUE
import com.example.semidevil.swoosh.R

class SkillActivity : AppCompatActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
