package thugzook.github.com.iensafetyapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Landingpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landingpage);

        // Variables for different menu options
        final TextView fire = (TextView) findViewById(R.id.fire);
        final ImageView chemical = (ImageView) findViewById(R.id.chemical);
        final ImageView resource1 = (ImageView) findViewById(R.id.resource1);
        final ImageView resource2 = (ImageView) findViewById(R.id.resource2);
        final ImageView resource3 = (ImageView) findViewById(R.id.resource3);

        fire.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fire, 0, 0, 0);

        // Detect if that menu option has been clicked
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Landingpage.this, Fire.class);
                startActivity(intent);
            }
        });

        chemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Landingpage.this, Chemical.class);
                startActivity(intent);
            }
        });

    }
}
