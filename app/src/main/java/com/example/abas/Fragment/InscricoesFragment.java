package com.example.abas.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.abas.R;


public class InscricoesFragment extends Fragment {

   public WebView webChat;
   public String url;

    public InscricoesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inscricoes, container, false);

        url="https://www.twitch.tv/popout/jogandojuntox11/chat?popout=";
        webChat = view.findViewById(R.id.webChat);
        webChat.loadUrl(url);

        // Abrir dentro do app
        webChat.setWebViewClient(new WebViewClient());

        // habilitar o java script
        webChat.getSettings().setJavaScriptEnabled(true);

        // Habilitar salvamento interno do telefone
        webChat.getSettings().setDomStorageEnabled(true);


        return view;
    }
}