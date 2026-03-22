package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val tips = listOf(
            Tip(1, R.string.tip1_title, R.string.tip1_desc, R.string.tip1_full, R.drawable.art1),
            Tip(2, R.string.tip2_title, R.string.tip2_desc, R.string.tip2_full, R.drawable.art2),
            Tip(3, R.string.tip3_title, R.string.tip3_desc, R.string.tip3_full, R.drawable.art3),
            Tip(4, R.string.tip4_title, R.string.tip4_desc, R.string.tip4_full, R.drawable.art4),
            Tip(5, R.string.tip5_title, R.string.tip5_desc, R.string.tip5_full, R.drawable.art5),
            Tip(6, R.string.tip6_title, R.string.tip6_desc, R.string.tip6_full, R.drawable.art6),
            Tip(7, R.string.tip7_title, R.string.tip7_desc, R.string.tip7_full, R.drawable.art7),
            Tip(8, R.string.tip8_title, R.string.tip8_desc, R.string.tip8_full, R.drawable.art8),
            Tip(9, R.string.tip9_title, R.string.tip9_desc, R.string.tip9_full, R.drawable.art9),
            Tip(10, R.string.tip10_title, R.string.tip10_desc, R.string.tip10_full, R.drawable.art10),
            Tip(11, R.string.tip11_title, R.string.tip11_desc, R.string.tip11_full, R.drawable.art11),
            Tip(12, R.string.tip12_title, R.string.tip12_desc, R.string.tip12_full, R.drawable.art12),
            Tip(13, R.string.tip13_title, R.string.tip13_desc, R.string.tip13_full, R.drawable.art13),
            Tip(14, R.string.tip14_title, R.string.tip14_desc, R.string.tip14_full, R.drawable.art14),
            Tip(15, R.string.tip15_title, R.string.tip15_desc, R.string.tip15_full, R.drawable.art15),
            Tip(16, R.string.tip16_title, R.string.tip16_desc, R.string.tip16_full, R.drawable.art16),
            Tip(17, R.string.tip17_title, R.string.tip17_desc, R.string.tip17_full, R.drawable.art17),
            Tip(18, R.string.tip18_title, R.string.tip18_desc, R.string.tip18_full, R.drawable.art18),
            Tip(19, R.string.tip19_title, R.string.tip19_desc, R.string.tip19_full, R.drawable.art19),
            Tip(20, R.string.tip20_title, R.string.tip20_desc, R.string.tip20_full, R.drawable.art20),
            Tip(21, R.string.tip21_title, R.string.tip21_desc, R.string.tip21_full, R.drawable.art21),
            Tip(22, R.string.tip22_title, R.string.tip22_desc, R.string.tip22_full, R.drawable.art22),
            Tip(23, R.string.tip23_title, R.string.tip23_desc, R.string.tip23_full, R.drawable.art23),
            Tip(24, R.string.tip24_title, R.string.tip24_desc, R.string.tip24_full, R.drawable.art24),
            Tip(25, R.string.tip25_title, R.string.tip25_desc, R.string.tip25_full, R.drawable.art25),
            Tip(26, R.string.tip26_title, R.string.tip26_desc, R.string.tip26_full, R.drawable.art26),
            Tip(27, R.string.tip27_title, R.string.tip27_desc, R.string.tip27_full, R.drawable.art27),
            Tip(28, R.string.tip28_title, R.string.tip28_desc, R.string.tip28_full, R.drawable.art28),
            Tip(29, R.string.tip29_title, R.string.tip29_desc, R.string.tip29_full, R.drawable.art29),
            Tip(30, R.string.tip30_title, R.string.tip30_desc, R.string.tip30_full, R.drawable.art30)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TipAdapter(tips)
    }
}

