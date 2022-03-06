package br.com.appminhaideia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class IncialActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    int tempoDeEspera = 1000 * 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

        trocarTela();
        Log.d(TAG, "onCreate: Tela Splash carregada...");
    }

    private void trocarTela() {

        new Handler().postDelayed(() -> {
            Log.d(TAG, "Esperando o tempo para mudar de Tela...");
            Intent itSplash = new Intent(IncialActivity.this, MainActivity.class);
            startActivity(itSplash);
            finish();
        }, tempoDeEspera);
    }
}