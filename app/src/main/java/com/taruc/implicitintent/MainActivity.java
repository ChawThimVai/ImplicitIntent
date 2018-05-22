package com.taruc.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare views
    //import the classs, press alt+enter
    private Button buttonView;
    private Button buttonCall;
    private Button buttonHome;
    private Button buttonSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialze view
        buttonView = findViewById(R.id.buttonView);
        buttonCall = findViewById(R.id.buttonCall);
        buttonHome = findViewById(R.id.buttonHome);
        buttonSend =findViewById(R.id.buttonSend);
    }

    public void viewTARUC(View v){
        String uri ="http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent); //start to submit the intent
    }

    public void showCall(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"0169310328"));
        startActivity(intent);
    }

    public void ShowHome(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);
    }

    public void showSend(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);

        intent.setData(Uri.parse("mailto:" +"simonttc.gmail.com"));
        startActivity(intent);
    }
}
