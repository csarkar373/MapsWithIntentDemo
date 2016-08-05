package com.westhillcs.mapswithintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MapsWithIntentActivity extends AppCompatActivity {

    private Intent googleMapIntent;
    private Intent chooser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_with_intent);
        this.initialze();
    }

    private void initialze() {
        googleMapIntent = new Intent(Intent.ACTION_VIEW);
        chooser = Intent.createChooser(googleMapIntent, "Choose a Map App");
        googleMapIntent.setData(Uri.parse("geo:0,0?q=le Louvre, France sushi"));
        this.startActivity(googleMapIntent);
    }
}
