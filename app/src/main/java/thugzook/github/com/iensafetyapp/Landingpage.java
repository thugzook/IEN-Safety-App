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
        final ImageView chemical = (ImageView) findViewById(R.id.chemical);
        final ImageView resource1 = (ImageView) findViewById(R.id.resource1);
        final ImageView resource2 = (ImageView) findViewById(R.id.resource2);
        final ImageView resource3 = (ImageView) findViewById(R.id.resource3);

        //fire.setCompoundDrawablesWithIntrinsicBounds(R.drawable.fire, 0, 0, 0);
        fire.getViewTreeObserver()
                .addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public void onGlobalLayout() {
                        Drawable img = Landingpage.this.getResources().getDrawable(
                                R.drawable.fire);
                        img.setBounds(0, 0, img.getIntrinsicWidth() * fire.getMeasuredHeight() / img.getIntrinsicHeight(), fire.getMeasuredHeight());
                        fire.setCompoundDrawables(img, null, null, null);

                    }
                });

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
