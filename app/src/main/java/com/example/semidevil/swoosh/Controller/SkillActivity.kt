package com.example.semidevil.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.semidevil.swoosh.Model.Player

import com.example.semidevil.swoosh.R
import com.example.semidevil.swoosh.utilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun ballerOnClick (view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"

    }

    fun beginnerOnClick(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"

    }

    fun FinishedOnClickedBtn (view: View){

        if(player.skill != ""){
            val finishedActivity = Intent(this, FinishActivity::class.java)
            finishedActivity.putExtra(EXTRA_PLAYER, player)



            startActivity(finishedActivity)

        }else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}