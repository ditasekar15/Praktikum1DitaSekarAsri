package org.nsh.praktikum1ditasekarasri;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sman4pku extends ListActivity {
    protected void  onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] ListAct =new String[] {"SMS Center","Driving Direction","Website","Info di Google","Exit"};
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

            {


            }  if (pilihan.equals("SMS Center"))
            {
                String smsText="Dita Sekar Asri/P";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:083800807070"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "https://www.google.com/maps/dir/-6.4067762,106.9712794/sekolah+di+pekanbaru/@-2.9677141,101.9533316,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x31d5af2dffe05c8d:0x3a4d50c6dc8baf59!2m2!1d101.4336314!2d0.4622864";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equals("Website"))
            {
                String website ="https://sman4pku.sch.id/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

            } else if (pilihan.equals("Info di Google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"SMA Negeri 4 Pekanbaru");
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
