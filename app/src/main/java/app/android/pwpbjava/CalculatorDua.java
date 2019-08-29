package app.android.pwpbjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorDua extends AppCompatActivity implements View.OnClickListener {

    TextView txtPenampung;
    Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,nol,tambah,kurang,kali,bagi,hasilnya;
    int angka1,angka2;
    boolean plus , min , times , div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_dua);

        txtPenampung = (TextView)findViewById(R.id.txtPenampung);
        satu = (Button)findViewById(R.id.satu);
        satu.setOnClickListener(this);
        dua = (Button)findViewById(R.id.dua);
        dua.setOnClickListener(this);
        tiga = (Button)findViewById(R.id.tiga);
        tiga.setOnClickListener(this);
        empat = (Button)findViewById(R.id.empat);
        empat.setOnClickListener(this);
        lima = (Button)findViewById(R.id.lima);
        lima.setOnClickListener(this);
        enam = (Button)findViewById(R.id.enam);
        enam.setOnClickListener(this);
        tujuh = (Button)findViewById(R.id.tujuh);
        tujuh.setOnClickListener(this);
        delapan = (Button)findViewById(R.id.delapan);
        delapan.setOnClickListener(this);
        sembilan = (Button)findViewById(R.id.sembilan);
        sembilan.setOnClickListener(this);
        nol = (Button)findViewById(R.id.nol);
        nol.setOnClickListener(this);
        tambah = (Button)findViewById(R.id.tambah);
        tambah.setOnClickListener(this);
        kurang = (Button)findViewById(R.id.kurang);
        kurang.setOnClickListener(this);
        kali = (Button)findViewById(R.id.kali);
        kali.setOnClickListener(this);
        bagi = (Button)findViewById(R.id.bagi);
        bagi.setOnClickListener(this);
        hasilnya = (Button)findViewById(R.id.hasilnya);
        hasilnya.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.satu:
                txtPenampung.setText("1");
                break;
            case R.id.dua:
                txtPenampung.setText("2");
                break;
            case R.id.tiga:
                txtPenampung.setText("3");
                break;
            case R.id.empat:
                txtPenampung.setText("4");
                break;
            case R.id.lima:
                txtPenampung.setText("5");
                break;
            case R.id.enam:
                txtPenampung.setText("6");
                break;
            case R.id.tujuh:
                txtPenampung.setText("7");
                break;
            case R.id.delapan:
                txtPenampung.setText("8");
                break;
            case R.id.sembilan:
                txtPenampung.setText("9");
                break;
            case R.id.nol:
                txtPenampung.setText("0");
                break;
            case R.id.tambah:
                angka1 = Integer.parseInt(txtPenampung.getText().toString());
                txtPenampung.setText(null);
                plus = true;
                break;
            case R.id.kurang:
                angka1 = Integer.parseInt(txtPenampung.getText().toString());
                min = true;
                txtPenampung.setText(null);
                break;
            case R.id.kali:
                angka1 = Integer.parseInt(txtPenampung.getText().toString());
                times = true;
                txtPenampung.setText(null);
                break;
            case R.id.bagi:
                angka1 = Integer.parseInt(txtPenampung.getText().toString());
                div = true;
                txtPenampung.setText(null);
                break;
            case R.id.hasilnya:
                angka2 = Integer.parseInt(txtPenampung.getText().toString());
                if (plus==true){
                    txtPenampung.setText(angka1+angka2+"");
                    plus=false;
                }else if(min==true){
                    txtPenampung.setText(angka1-angka2+"");
                    min=false;
                }else if(times==true){
                    txtPenampung.setText(angka1*angka2+"");
                    times=false;
                }else if(div==true){
                    txtPenampung.setText(angka1/angka2+"");
                    div=false;
                }

                break;

        }

    }
}
