package br.com.appminhaideia.view;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;


import android.content.res.ColorStateList;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import br.com.appminhaideia.R;
import br.com.appminhaideia.core.AppUtil;
import br.com.appminhaideia.model.Cliente;

// AppCompactActivity vem do SKD do Android e contem tudo que é necessário para gerar o layout da tela
public class MainActivity extends AppCompatActivity {


    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: Tela Principal carregada...");

        Bundle bundle = getIntent().getExtras(); // recupera o Bundle

        String nome = bundle.getString("nome");
        String email = bundle.getString("email");

        txtNome = findViewById(R.id.txtNome);
        txtNome.setText(nome);
        txtNome.setTextColor(getResources().getColor(R.color.purple_500));

    }
}