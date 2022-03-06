package br.com.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

// AppCompactActivity vem do SKD do Android e contem tudo que é necessário para gerar o layout da tela
public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal carregada...");
    }
}