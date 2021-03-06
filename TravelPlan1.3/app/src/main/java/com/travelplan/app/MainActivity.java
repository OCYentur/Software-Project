package com.travelplan.app;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textViewSearch = (EditText)findViewById(R.id.textViewSearch);

        Button btnCreateTrip= (Button) findViewById(R.id.btnCreateTrip);
        btnCreateTrip.setOnClickListener(this);

        Button btnSearch=(Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);

        Button btnManualNavigation=(Button)findViewById(R.id.btnManualNavigation);
        btnManualNavigation.setOnClickListener(this);

        Button btnTravelList=(Button)findViewById(R.id.btnTravelList);
        btnTravelList.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnSearch:
                btnSearchClicked();
                break;
            case R.id.btnCreateTrip:
                btnCreateTripClicked();
                break;
            case R.id.btnManualNavigation:
                btnManualNavigationClicked();
                break;
            case R.id.btnTravelList:
                btnTravelListClicked();
                break;
        }

    }

    private void btnTravelListClicked() {
        startActivity(new Intent("com.travelplan.app.TravelList"));
    }

    private void btnManualNavigationClicked() {
        startActivity(new Intent("com.travelplan.app.ManualNavigationScreen"));

    }

    private void btnCreateTripClicked() {
        startActivity(new Intent("com.travelplan.app.CreateTripScreen"));
    }

    private void btnSearchClicked(){
        startActivity(new Intent("com.travelplan.app.SearchScreen"));
    }
}
