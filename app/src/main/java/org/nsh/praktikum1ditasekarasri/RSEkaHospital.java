package org.nsh.praktikum1ditasekarasri;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSEkaHospital extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] ListAct =new String[] {"Call Center","SMS Center","Driving Direction","Website","Info di Google","Exit"};
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
            if (pilihan.equals("Call Center"))
                a = new Intent(this,RSEkaHospital.class);
            String nomortel1 ="tel:0761-6989999";
            a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel1));
            {


            }  if (pilihan.equals("SMS Center"))
            {
                String smsText="Dita Sekar Asri/P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:083800807070"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "https://www.google.com/maps/place/Eka+Hospital+Pekanbaru/@0.4823185,101.41969,15z/data=!4m12!1m6!3m5!1s0x0:0x958ef365745c3ff7!2sEka+Hospital+Pekanbaru!8m2!3d0.4823185!4d101.41969!3m4!1s0x0:0x958ef365745c3ff7!8m2!3d0.4823185!4d101.41969";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equals("Website"))
            {
                String website ="https://www.ekahospital.com/id";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            } else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Eka Hospital");
            }
            else
            {
                finish();
            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }}

