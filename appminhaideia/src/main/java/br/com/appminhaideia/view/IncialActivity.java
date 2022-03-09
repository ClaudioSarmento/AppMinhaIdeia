package br.com.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import br.com.appminhaideia.R;
import br.com.appminhaideia.model.Cliente;

public class IncialActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";
    int tempoDeEspera = 1000 * 10;
    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);
        trocarTela();
        Log.d(TAG, "onCreate: Tela Splash carregada...");
    }

    private void trocarTela() {

        new Handler().postDelayed(() -> {

            objCliente = new Cliente(
                    "Claudio",
                    "claudio@gmail.com",
                    "2799999999",
                    23,
                    true
            );

            Log.d(TAG, "Esperando o tempo para mudar de Tela...");

            Intent itSplash = new Intent(IncialActivity.this, MainActivity.class);
            //
            Bundle bundle = new Bundle();
            bundle.putString("nome", objCliente.getNome());
            bundle.putString("email", objCliente.getEmail());
            //
            itSplash.putExtras(bundle);
            startActivity(itSplash);
            finish();
        }, tempoDeEspera);
    }
}