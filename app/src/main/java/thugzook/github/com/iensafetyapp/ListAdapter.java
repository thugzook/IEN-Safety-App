package thugzook.github.com.iensafetyapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Noah Sushimushi on 3/27/2018.
 */

public class ListAdapter extends ArrayAdapter {
    //to reference the Activity
    private final Activity context;

    //to store the SDS text
    private final String[] nameArray;

    //store URL
    private final String[] URLs;

    //store filenames
    private final String[] fileName;

    public ListAdapter(Activity context, String[] nameArrayParam, String[] URLsParam, String[] fileNameParam) {

        super(context,R.layout.sds_row , nameArrayParam);

        this.context=context;
        this.nameArray = nameArrayParam;
        this.URLs = URLsParam;
        this.fileName = fileNameParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.sds_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameSDS);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);

        return rowView;

    }
}

