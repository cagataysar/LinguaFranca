package com.cagataysar.linguafranca

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.cagataysar.linguafranca.databinding.ActivityHomepageBinding

class HomepageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.bottomNav.setOnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.search -> {
                    replaceFragment(HomepageFragment())
                    true
                }
                R.id.settings -> {
                    replaceFragment(SettingsFragment())
                    true
                }
                R.id.favorites -> {
                    replaceFragment(FavoritesFragment())
                    true
                }
                R.id.recent -> {
                    replaceFragment(RecentFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomepageFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}