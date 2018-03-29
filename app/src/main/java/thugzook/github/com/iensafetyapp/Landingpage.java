package thugzook.github.com.iensafetyapp;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
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
        final TextView chemical = (TextView) findViewById(R.id.chemical);
        final TextView resource1 = (TextView) findViewById(R.id.resource1);
        final TextView resource2 = (TextView) findViewById(R.id.resource2);
        final TextView resource3 = (TextView) findViewById(R.id.resource3);

        // Detect if that menu option has been clicked
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawable orig = fire.getBackground();
                int color = ((ColorDrawable) orig).getColor();
                fire.setBackgroundColor(0x42f4d400);
                Intent intent = new Intent(Landingpage.this, Fire.class);
                finish();
                startActivity(getIntent());
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
