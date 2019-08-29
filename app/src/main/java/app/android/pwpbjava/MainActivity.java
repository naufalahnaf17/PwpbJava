package app.android.pwpbjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angkaSatu,angkaDua;
    TextView txtOutput;
    Button btnTampilkan , btnCalculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtOutput = (TextView)findViewById(R.id.txtOutput);
        angkaSatu = (EditText)findViewById(R.id.angkaSatu);
        angkaDua = (EditText)findViewById(R.id.angkaDua);
        btnTampilkan = (Button) findViewById(R.id.btnTampil);
        btnCalculator = (Button) findViewById(R.id.btnCalculator);

        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double panjang = Double.parseDouble(angkaSatu.getText().toString());
                double lebar = Double.parseDouble(angkaDua.getText().toString());
                double hasil = panjang * lebar;

                txtOutput.setText(hasil+"cm");

            }
        });

        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CalculatorActivity.class));
            }
        });

    }
}
