package com.example.daniel.w1d3_homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() { //In here you track and manage when the application is going to background or stops
        super.onStop();
        Log.d(TAG, "onStop: ");
        Toast.makeText(getApplicationContext(), "Application going to Backgroung", Toast.LENGTH_SHORT).show();
    }
}

/*
        Teorical homework:

        -> What is a Fragment?
            Is a piece of an activity which enable more modeular activity design. It will not be wrong
            if we say that a fragment is a kind of subactivity.

        -> What are permissions?
            When an application needs to use resources or information or information outside from its sandbox
            the app has to request the appropriate permission. YOU DECLARE HAT YOUR APP NEEDS A PERMISION
            BY LISTING THE PERMISSION IN THE MANIFEST.
 */

/*
Refeences:
    https://developer.android.com/guide/topics/ui/notifiers/toasts.html
    http://stackoverflow.com/questions/3270409/how-do-i-get-multiple-icons-to-launch-different-activities-in-one-application?noredirect=1&lq=1
    http://stackoverflow.com/questions/8927315/two-launcher-activities
    https://www.tutorialspoint.com/android/android_acitivities.htm

 */