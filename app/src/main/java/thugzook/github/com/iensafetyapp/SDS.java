package thugzook.github.com.iensafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class SDS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sds);

        //declare listview and nameArray of SDSs
        ListView listView;
        final String[] nameArray = {"Lanthanum Nitrate Hexahydrate", "Chlorine"};
        final String[] URL = {"http://www.sciencelab.com/msds.php?msdsId=9927201",""};
        ListAdapter List = new ListAdapter(this, nameArray,URL);
        listView = (ListView) findViewById(R.id.SDSList);
        listView.setAdapter(List);

        //listens for menu selection and opens the appropriate file
        //Create intent and send extras to
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SDS.this, pdfView.class);
                PDFView pdfView;
                pdfView = (PDFView) findViewById(R.id.pdfView);
                pdfView.fromAsset("chlorine.pdf").load();
                //using the name array, create a file name by removing all spaces and adding .pdf
                /*
                String filename = (nameArray[position].replaceAll("\\s","").toLowerCase() + ".pdf");

                //pass the URL and filename to pdfView
                intent.putExtra("File URL", URL[position]);
                intent.putExtra("File Name", filename);
                startActivity(intent);*/
            }
        });
    }
}
