package org.nsh.praktikum1ditasekarasri;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class belanja extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] ListAct =new String[] {"Hypermart Mal SKA","Planet Swalayan Marpoyan","KAS SWALAYAN","Ion Swalayan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListAct));
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
            if (pilihan.equals("Hypermart Mal SKA"))
                a = new Intent(this,Ska.class);

            {


            }  if (pilihan.equals("Planet Swalayan Marpoyan"))
                a= new Intent(this,Planet.class);
            {

            } if (pilihan.equals("KAS SWALAYAN"))
                a = new Intent(this,KasSwalayan.class);
            {

            }  if (pilihan.equals("Ion Swalayan"))
                a = new Intent(this,IonSwalayan.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
