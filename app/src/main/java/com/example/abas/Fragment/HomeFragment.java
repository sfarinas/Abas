package com.example.abas.Fragment;

import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.abas.R;


public class HomeFragment extends Fragment {

    public WebView webCanal;
    public String url;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //url="https://www.youtube.com/@sfarinas/videos";
        url="https://www.twitch.tv/jogandojuntox11";

        webCanal = view.findViewById(R.id.webHome);
        webCanal.loadUrl(url);

        // Para abrir dentro do app.
        webCanal.setWebViewClient(new WebViewClient());
        // Habilitar java scritp no app
        webCanal.getSettings().setJavaScriptEnabled(true);
        // Salvar dados no celular
        webCanal.getSettings().setDomStorageEnabled(true);


        return view;
    }


}