package com.example.fragmentview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    public lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val frag = SubFragment()
        val tran = supportFragmentManager.beginTransaction()
        tran.replace(R.id.container1, frag)
        tran.commit()
    }
}