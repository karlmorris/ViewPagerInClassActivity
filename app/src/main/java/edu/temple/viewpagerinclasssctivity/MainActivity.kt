package edu.temple.viewpagerinclasssctivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with (findViewById<ViewPager2>(R.id.viewPager)) {
            adapter = object: FragmentStateAdapter(this@MainActivity) {
                override fun getItemCount(): Int {
                    return 10
                }

                override fun createFragment(position: Int): Fragment {
                    return TextFragment.newInstance((position + 1).toString())
                }

            }
        }

    }

}