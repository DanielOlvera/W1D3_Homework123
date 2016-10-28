package com.example.daniel.w1d3_homework;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
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

        //here we specify notification properties
        NotificationCompat.Builder mBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.ic_rowing_white_24dp)
                .setContentText("Hello Notifications!")
                .setContentTitle("W1D3 Notification");

        //Specifying an action ans its categori to be triggered once clicked on the notification
        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction("android.inten.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        //Building the notification
        mBuilder.setContentIntent(pendingIntent);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, mBuilder.build());
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
References:
    https://developer.android.com/guide/topics/ui/notifiers/toasts.html
    http://stackoverflow.com/questions/3270409/how-do-i-get-multiple-icons-to-launch-different-activities-in-one-application?noredirect=1&lq=1
    http://stackoverflow.com/questions/8927315/two-launcher-activities
    https://www.tutorialspoint.com/android/android_acitivities.htm
    http://stackoverflow.com/questions/19163367/resume-an-activity-when-clicked-on-a-notification
    https://www.tutorialspoint.com/android/android_notifications.htm
    https://developer.android.com/training/notify-user/build-notification.html
 */