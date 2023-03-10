package com.example.abas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.abas.Fragment.EmAltaFragment;
import com.example.abas.Fragment.HomeFragment;
import com.example.abas.Fragment.InscricoesFragment;
import com.example.abas.Fragment.NovaFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewPagerTab);
        viewPager = findViewById(R.id.viewPager);


        //Configurar adapter para abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Home", HomeFragment.class )
                        .add("chat", InscricoesFragment.class )
                        .add("Em alta", EmAltaFragment.class )
                        .add("Nova", NovaFragment.class)
                        .create()

        );

        viewPager.setAdapter( adapter );
        smartTabLayout.setViewPager( viewPager );
    }
}