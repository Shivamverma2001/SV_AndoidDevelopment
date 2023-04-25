package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

//Swipe Tab
class c29 : AppCompatActivity() {
    lateinit var tabLayout:TabLayout
    lateinit var viewPager:ViewPager
    var viewPagerAdapter:c29_ViewPagerAdapter1?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c29)
        viewPager=findViewById(R.id.view_pager)
        tabLayout=findViewById(R.id.tabs)
        viewPagerAdapter=c29_ViewPagerAdapter1(supportFragmentManager)
        viewPager.adapter=viewPagerAdapter
        //it is used to join TabLayout with ViewPager
        tabLayout.setupWithViewPager(viewPager)

    }
}