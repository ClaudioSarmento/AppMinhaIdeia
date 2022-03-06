package br.com.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

// AppCompactActivity vem do SKD do Android e contem tudo que é necessário para gerar o layout da tela
public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    int tempoDeEspera = 1000 * 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal carregada...");

        trocarTela();
    }

    private void trocarTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "Esperando o tempo para mudar de Tela...");
                Intent itSplash = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(itSplash);
                finish();
            }
        },tempoDeEspera);
    }
}