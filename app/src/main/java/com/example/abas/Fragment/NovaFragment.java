package com.example.abas.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.abas.R;

public class NovaFragment extends Fragment {

    public WebView webnova;
    public String url;

    public NovaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nova, container, false);

        url = "https://www.youtube.com/@sfarinas/videos";
        webnova = view.findViewById(R.id.WebNova);
        webnova.loadUrl(url);

        // Poder Abrir pagina dentro do app
        webnova.setWebViewClient(new WebViewClient());

        webnova.getSettings().setJavaScriptEnabled(true);

        webnova.getSettings().setDomStorageEnabled(true);

        return view;
    }
}