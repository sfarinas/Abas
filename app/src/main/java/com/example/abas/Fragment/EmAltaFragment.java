package com.example.abas.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.abas.R;

public class EmAltaFragment extends Fragment {

    public WebView webAlta;
    public String url;

    public EmAltaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_em_alta, container, false);

        url="https://bxctv.net";
        webAlta = view.findViewById(R.id.webAlta);
        webAlta.loadUrl(url);

        // Para abrir dentro do app.
        webAlta.setWebViewClient(new WebViewClient());
        // Habilitar java scritp no app
        webAlta.getSettings().setJavaScriptEnabled(true);
        // Salvar dados no celular
        webAlta.getSettings().setDomStorageEnabled(true);



        return view;
    }
}