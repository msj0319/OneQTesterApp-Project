package org.techtown.oneqtester_1_0

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_rgb02.*
import kotlinx.android.synthetic.main.activity_rgb04.*
import kotlinx.android.synthetic.main.activity_rgb06.*
import kotlinx.android.synthetic.main.activity_rgb07.*

class rgb07 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rgb07)
        rgb_7_b1.setBackgroundColor(Color.WHITE)
        var val1 = intent.getStringExtra("answer1")
        rgb_7_b1.setOnClickListener { view->
            var intent = Intent(this,rgb08::class.java)
            intent.putExtra("answer1",val1)
            startActivityForResult(intent,1)
        }
    }
}
