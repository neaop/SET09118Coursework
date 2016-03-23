package uk.co.sam.mediacontroller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Button> mButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewGroup layout = (ViewGroup) findViewById(R.id.main_layout);

        mButtons = new ArrayList<>();
        int childCount = layout.getChildCount();

        for(int i = 0; i < childCount; i++){
            View child  = layout.getChildAt(i);
            if(child instanceof Button){
                mButtons.add((Button) child);
            }
        }

        int i = 1;
        for (Button button : mButtons) {
            button.setText("Button "+i);
            button.setEnabled(false);
            i++;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            //noinspection SimplifiableIfStatement
            case R.id.action_connect:
                return true;
            case R.id.action_disconnect:
                return true;
            case R.id.action_settings:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}