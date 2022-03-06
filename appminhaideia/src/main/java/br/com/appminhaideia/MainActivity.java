package br.com.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// AppCompactActivity vem do SKD do Android e contem tudo que é necessário para gerar o layout da tela
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}