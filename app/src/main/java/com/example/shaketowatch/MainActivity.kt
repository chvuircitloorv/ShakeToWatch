package com.example.shaketowatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shaketowatch.favorite.FavoriteFragment
import com.example.shaketowatch.top.TopListFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.lang.IllegalStateException
import kotlinx.android.synthetic.main.activity_main.bottom_navigation_view as bottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavigationListener)
        bottomNavigationView.selectedItemId = R.id.top_item
    }

    private val bottomNavigationListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.top_item -> {
                val fragment = supportFragmentManager.findFragmentByTag(TopListFragment.TAG)
                if (fragment == null) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, TopListFragment.create(), TopListFragment.TAG)
                        .commit()
                }
            }
            R.id.favorite_item -> {
                val fragment = supportFragmentManager.findFragmentByTag(FavoriteFragment.TAG)
                if (fragment == null) {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, FavoriteFragment.create(), FavoriteFragment.TAG)
                        .commit()
                }
            }
            else -> throw IllegalStateException("Illegal id clicked on BottomNavigationView")
        }
        true
    }
}
