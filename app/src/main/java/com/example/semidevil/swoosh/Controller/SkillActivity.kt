package com.example.semidevil.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.semidevil.swoosh.utilities.EXTRA_LEAGUE
import com.example.semidevil.swoosh.R
import com.example.semidevil.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)


    }

    fun ballerOnClick (view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"

    }

    fun beginnerOnClick(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"

    }

    fun FinishedOnClickedBtn (view: View){

        if(skill != ""){
            val finishedActivity = Intent(this, FinishActivity::class.java)
            finishedActivity.putExtra(EXTRA_LEAGUE, league)
            finishedActivity.putExtra(EXTRA_SKILL, skill)


            startActivity(finishedActivity)

        }else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }
}