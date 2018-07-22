package login.com.girish.fragmentdemo;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener{

    private static final String TAG = "MainActivity";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textViewOut);
        Log.i(TAG,"onCreate()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"onStart()");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"onResume()");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause()");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"onStop()");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy()");

    }

    @Override
    public void onFragmentInteraction(String str) {

        textView.setText(str);

    }
}
