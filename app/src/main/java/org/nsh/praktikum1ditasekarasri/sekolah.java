package org.nsh.praktikum1ditasekarasri;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sekolah extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] ListAct =new String[] {"SMA Negeri 4 Pekanbaru","SMA Darma Yudha","Sekolah Dasar Negeri 79 Pekanbaru","Sekolah Dasar Negeri 80 Pekanbaru"};
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
            if (pilihan.equals("SMA Negeri 4 Pekanbaru"))
                a = new Intent(this,sman4pku.class);

            {


            }  if (pilihan.equals("SMA Darma Yudha"))
                a= new Intent(this,SmaDarma.class);
            {

            } if (pilihan.equals("Sekolah Dasar Negeri 79 Pekanbaru"))
                a = new Intent(this,Sdn79pku.class);
            {

            }  if (pilihan.equals("Sekolah Dasar Negeri 80 Pekanbaru"))
                a = new Intent(this,Sdn80pku.class);
            {

            }

            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
