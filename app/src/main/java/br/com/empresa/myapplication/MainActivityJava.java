package br.com.empresa.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityJava extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button = findViewById(R.id.botao_principal);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showMessage("Olá Java!");
//            }
//        });

    }

    private void showMessage(String message) {
        Toast.makeText(this,
                message,
                Toast.LENGTH_LONG)
                .show();
    }
}
