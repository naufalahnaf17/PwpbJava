package app.android.pwpbjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SuhuActivity extends AppCompatActivity {

    EditText eCelcius;
    TextView kelvin, reamur,fahrenheit;
    Button btnKonversi,hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu);

        hello = (Button)findViewById(R.id.hello);
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SuhuActivity.this,CalculatorDua.class));
            }
        });
        eCelcius = (EditText)findViewById(R.id.eSuhu);
        kelvin = (TextView) findViewById(R.id.kelvin);
        fahrenheit = (TextView) findViewById(R.id.fahrenheit);
        reamur = (TextView) findViewById(R.id.reamur);
        btnKonversi = (Button) findViewById(R.id.btnKonversi);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double suhu = Double.parseDouble(eCelcius.getText().toString());

                double hasilKelvin = suhu+273.15;
                kelvin.setText(hasilKelvin+"K");

                double hasilFahrenheit = (suhu*9/5)+32;
                fahrenheit.setText(hasilFahrenheit+"F");

                double hasilReamur = 0.8 * suhu;
                reamur.setText(hasilReamur+"R");


            }
        });
    }
}
