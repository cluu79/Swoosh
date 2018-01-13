package com.example.semidevil.swoosh.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.semidevil.swoosh.utilities.EXTRA_LEAGUE
import com.example.semidevil.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        finishSkillBtn.setOnClickListener{
            val skillIntent = Intent(this, FinishActivity::class.java )
            startActivity(skillIntent)
        }

        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)


    }
}