package com.example.calculatorcombustibil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private EditText num3;
    //private EditText num4;
    private Button add;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




            num1 = (EditText) findViewById(R.id.pret_combustibil);

            num2 = (EditText) findViewById(R.id.consum_km);
            num3 = (EditText) findViewById(R.id.distanta_parcursa);
            add = (Button) findViewById(R.id.calculeaza_pret);
            result = (TextView) findViewById(R.id.rezultat_calcul);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if(num1.length() == 0) {
                        Toast.makeText(getApplicationContext(),"Nu a fost introdus pretul carborantului",Toast.LENGTH_LONG).show();
                        num1.setError("Introduce pretul carborantului");
                        return;
                    }
                    if(num2.length() == 0) {
                        Toast.makeText(getApplicationContext(),"Nu a fost introdus consumul",Toast.LENGTH_LONG).show();
                        num2.setError("Introduce consumul");
                        return;
                    }
                    if(num3.length() == 0) {
                        //String tmp2 = "0";
                       // num3.setText(tmp2);
                        Toast.makeText(getApplicationContext(),"Nu a fost introdua distanta parcursa",Toast.LENGTH_LONG).show();
                        num3.setError("Introduce distanta parcursa");
                        return;
                    }
                    double numar1 = Double.parseDouble(num1.getText().toString());
                    double numar2 = Double.parseDouble(num2.getText().toString());
                    double numar3 = Double.parseDouble(num3.getText().toString());

                    double sum = ((numar1 * numar2) / 100) * numar3;
                    String sum1 = String.format("%.02f", sum);
                    result.setText(String.valueOf(sum1) + " Lei");
                }
            });

        }
    }

