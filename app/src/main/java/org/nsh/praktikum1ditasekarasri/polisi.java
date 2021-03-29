package org.nsh.praktikum1ditasekarasri;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class polisi extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] Listrs =new String[] {"Polresta Pekanbaru","Polsek Pekan Baru Kota","Polsek Tampan","polda pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Listrs));
    }

    protected void  onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Polresta Pekanbaru"))
                a = new Intent(this,PolrestaPekanbaru.class);

            {


            }  if (pilihan.equals("Polsek Pekan Baru Kota"))
                a= new Intent(this,PolsekPekanbaruKota.class);
            {

            } if (pilihan.equals("Polsek Tampan"))
                a = new Intent(this,PolsekTampan.class);
            {

            }  if (pilihan.equals("polda pekanbaru"))
                a = new Intent(this,PoldaPekanbaru.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}







