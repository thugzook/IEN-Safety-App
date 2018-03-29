package thugzook.github.com.iensafetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Chemical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemical);

        // Variables for different menu options
        final ImageView IfThen =  findViewById(R.id.image1);
        final ImageView SDS = findViewById(R.id.image2);

        // Detect if that menu option has been clicked
        IfThen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chemical.this, Fire.class);
                startActivity(getIntent());
                startActivity(intent);
            }
        });

        SDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chemical.this, SDS.class);
                startActivity(intent);
            }
        });
    }
}
