package thugzook.github.com.iensafetyapp;

import android.content.Intent;
import android.os.Environment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fire extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        final TextView testButton = findViewById(R.id.testPDF);

        testButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Fire.this, pdfView.class);

                //pass the URL and filename to pdfView
                intent.putExtra("File URL", "https://www.colorado.edu/physics/phys1110/phys1110_sp15/lectures/Lec14.pdf");
                intent.putExtra("File Name", "test1.pdf");
                startActivity(intent);
            }
        });
    }
}