package thugzook.github.com.iensafetyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.File;

public class SDS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sds);

        //declare listview and nameArray of SDSs
        ListView listView;
        String[] nameArray = {"SDS1", "SDS2"};
        String[] URL = {"http://www.sciencelab.com/msds.php?msdsId=9927201","https://www.sigmaaldrich.com/MSDS/MSDS/DisplayMSDSPage.do?country=US&language=en&productNumber=168149"};
        String[] FileName = {"LNH", "LC"};
        ListAdapter List = new ListAdapter(this, nameArray,URL, FileName);
        listView = (ListView) findViewById(R.id.SDSList);
        listView.setAdapter(List);
    }
}
