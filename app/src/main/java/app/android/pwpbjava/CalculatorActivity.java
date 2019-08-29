package app.android.pwpbjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    EditText angkaSatuCal,angkaDuaCal;
    Button tambah,kurang,kali,bagi,suhu;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        angkaSatuCal = (EditText) findViewById(R.id.angkaSatuCal);
        angkaDuaCal = (EditText) findViewById(R.id.angkaDuaCal);
        txtHasil = (TextView)findViewById(R.id.txtOutput);
        tambah = (Button)findViewById(R.id.btnTambah);
        kurang = (Button)findViewById(R.id.btnKurang);
        kali = (Button)findViewById(R.id.btnKali);
        bagi = (Button)findViewById(R.id.btnBagi);
        suhu = (Button)findViewById(R.id.btnSuhu);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angkaSatu = Float.parseFloat(angkaSatuCal.getText().toString());
                float angkaDua = Float.parseFloat(angkaDuaCal.getText().toString());

                float hasil = angkaSatu + angkaDua;
                txtHasil.setText(hasil+"");
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angkaSatu = Float.parseFloat(angkaSatuCal.getText().toString());
                float angkaDua = Float.parseFloat(angkaDuaCal.getText().toString());

                float hasil = angkaSatu - angkaDua;
                txtHasil.setText(hasil+"");
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angkaSatu = Float.parseFloat(angkaSatuCal.getText().toString());
                float angkaDua = Float.parseFloat(angkaDuaCal.getText().toString());

                float hasil = angkaSatu * angkaDua;
                txtHasil.setText(hasil+"");
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float angkaSatu = Float.parseFloat(angkaSatuCal.getText().toString());
                float angkaDua = Float.parseFloat(angkaDuaCal.getText().toString());

                float hasil = angkaSatu / angkaDua;
                txtHasil.setText(hasil+"");
            }
        });

        suhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CalculatorActivity.this , SuhuActivity.class));
            }
        });
    }
}
