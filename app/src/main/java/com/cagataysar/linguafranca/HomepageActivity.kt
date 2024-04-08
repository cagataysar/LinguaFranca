package com.cagataysar.linguafranca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.cagataysar.linguafranca.databinding.ActivityHomepageBinding
import com.cagataysar.linguafranca.databinding.ActivityMainBinding

class HomepageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityHomepageBinding

    private lateinit var searchView: SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
}