package com.bmck2006.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class FunFactsActivity extends AppCompatActivity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private static final String KEY_FACT = "KEY_FACT" ;
    private static final String KEY_COLOR = "KEY_COLOR";

    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    // Declare view variables:
    private TextView factTextView;
    private Button showFactButton;
    private Button showInfoButton;
    private RelativeLayout relativeLayout;
    private String fact = factBook.getFactAt(0); // initializes first fact
    private int color = colorWheel.getColorAt(8);// initializes first color

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_FACT, fact);
        outState.putInt(KEY_COLOR, color);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        fact = savedInstanceState.getString(KEY_FACT);
        color = savedInstanceState.getInt(KEY_COLOR);
        factTextView.setText(fact);
        showFactButton.setTextColor(color);
        showInfoButton.setTextColor(color);
        relativeLayout.setBackgroundColor(color);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables:
        this.factTextView = (TextView) findViewById(R.id.factTextView);
        this.showFactButton = (Button) findViewById(R.id.showFactButton);
        this.showInfoButton = (Button) findViewById(R.id.showInfoButton);
        this.relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update the screen with a dynamic fact
                fact = factBook.getFact();
                factTextView.setText(fact);

                //Colors:
                color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
                showInfoButton.setTextColor(color);
            }
        };

        View.OnClickListener infoListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //info string:
                factTextView.setText(
                        "Fun Facts v1.0.1\nCreator: Brian McKeown\nVisit brianmckeown.com"
                );

                //Colors:
                int colorNum = colorWheel.getColor();
                relativeLayout.setBackgroundColor(colorNum);
                showFactButton.setTextColor(colorNum);
                showInfoButton.setTextColor(colorNum);

            }
        };

        this.showFactButton.setOnClickListener(listener);
        this.showInfoButton.setOnClickListener(infoListener);

        /*Optional Toast popup and log for testing
        **********************************************/
        //Toast.makeText(FunFactsActivity.this, "Activity was created!", Toast.LENGTH_SHORT).show();
        //Log.d(TAG, "We're logging from the onCreate() method");
    }
}
