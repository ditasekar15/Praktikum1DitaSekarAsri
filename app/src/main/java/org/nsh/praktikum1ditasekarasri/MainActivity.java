package org.nsh.praktikum1ditasekarasri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void  clickrs(View view){
        //gambar rs di clik
        Intent i = new Intent(this,rs.class);
        startActivity(i);

    }
    public void clickpolisi (View view){
        //gambar polisi di clik
        Intent i = new Intent(this,polisi.class);
        startActivity(i);

    }


    public void clickbelanja(View view) {
        //gambar polisi di clik
        Intent i = new Intent(this,belanja.class);
        startActivity(i);
    }

    public void clicksekolah(View view) {
        //gambar polisi di clik
        Intent i = new Intent(this,sekolah.class);
        startActivity(i);
    }
}