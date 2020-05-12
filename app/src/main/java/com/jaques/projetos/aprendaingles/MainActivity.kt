package com.jaques.projetos.aprendaingles



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.jaques.projetos.aprendaingles.fragment.BichosFragment
import com.jaques.projetos.aprendaingles.fragment.ConsoantesFragment
import com.jaques.projetos.aprendaingles.fragment.NumerosFragment
import com.jaques.projetos.aprendaingles.fragment.VogaisFragment
import com.ogaclejapan.smarttablayout.SmartTabLayout
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var smartTabLayout: SmartTabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.elevation = 0f

        smartTabLayout = viewPagerTab_
        viewPager = viewPager_

        val adapter = FragmentPagerItemAdapter(
                supportFragmentManager, FragmentPagerItems.with(this)
                .add("Bichos",BichosFragment::class.java)
                .add("Números", NumerosFragment::class.java)
                .add("Vogais",VogaisFragment::class.java)
                .add("Consoantes",ConsoantesFragment::class.java)
                .`create`())

        viewPager = viewPager_ as ViewPager
        viewPager.adapter = adapter

        smartTabLayout = viewPagerTab_ as SmartTabLayout
        smartTabLayout.setViewPager(viewPager)

    }


}
