package e.android.dwiratna_1202150258_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nMenu, Mporsi;
    Button dEatbuss, eAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nMenu = findViewById(R.id.edit_Text);
        Mporsi = findViewById(R.id.edit_Text2);

        dEatbuss = findViewById(R.id.button);
        eAbnormal = findViewById(R.id.button2);
    }

    public void launchEatbuss(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("id_tempat",dEatbuss.getText().toString());
        intent.putExtra("id_menu1", nMenu.getText().toString());
        intent.putExtra("id_porsi1", Mporsi.getText().toString());
        intent.putExtra("id_harga1","50000");
        startActivity(intent);
    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("id_tempat", eAbnormal.getText().toString());
        intent.putExtra("id_menu1", nMenu.getText().toString());
        intent.putExtra("id_porsi1", Mporsi.getText().toString());
        intent.putExtra("id_harga1","30000");
        startActivity(intent);

    }
}
