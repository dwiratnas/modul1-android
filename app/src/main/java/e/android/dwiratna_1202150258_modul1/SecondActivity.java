package e.android.dwiratna_1202150258_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView tempat, harga, porsi, menu;
    private int uang = 65000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tempat = findViewById(R.id.id_tempat);
        menu = findViewById(R.id.id_menu1);
        porsi = findViewById(R.id.id_porsi1);
        harga = findViewById(R.id.id_harga1);

        Intent intent = getIntent();
        String kTempat = intent.getStringExtra("id_tempat");
        tempat.setText(kTempat);
        String lHarga = intent.getStringExtra("id_harga1");

        String mPorsi = intent.getStringExtra("id_porsi1");
        porsi.setText(mPorsi);
        String nMenu = intent.getStringExtra("id_menu1");
        menu.setText(nMenu);

        int jumlahHarga = Integer.valueOf(lHarga)*Integer.valueOf(mPorsi);
        harga.setText(String.valueOf(jumlahHarga));

        if(jumlahHarga<=uang){
            Toast.makeText(this,"makan malam kamu disini saja", 1).show();
        }else{
            Toast.makeText(this,"jangan makan disini, uangkamu tidak cukup", 1).show();

        }


    }
}
