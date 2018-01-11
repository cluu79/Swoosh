package com.example.semidevil.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class leagueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View){
        val skillActivity = Intent( this, SkillActivity::class.java)
        startActivity(skillActivity)

    }
}
