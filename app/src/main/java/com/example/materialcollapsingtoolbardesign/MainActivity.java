package com.example.materialcollapsingtoolbardesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView faculty_card,power_card,telecom_card,govt_card,other_card;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        faculty_card=(CardView) findViewById(R.id.faculty_card);
        power_card=(CardView) findViewById(R.id.power_card);
        telecom_card=(CardView) findViewById(R.id.telecom_card);
        govt_card=(CardView) findViewById(R.id.govt_card);
        other_card=(CardView) findViewById(R.id.other_card);

        faculty_card.setOnClickListener(this);
        power_card.setOnClickListener(this);
        telecom_card.setOnClickListener(this);
        govt_card.setOnClickListener(this);
        other_card.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()){

            case R.id.faculty_card: i= new Intent(this,Main2Activity.class);
                startActivity(i);
                break;

            case R.id.power_card: i= new Intent(this,Main2Activity.class);
                startActivity(i);
                break;

            case R.id.telecom_card: i= new Intent(this,Main2Activity.class);
                startActivity(i);
                break;

            case R.id.govt_card: i= new Intent(this,Main2Activity.class);
                startActivity(i);
                break;

            case R.id.other_card: i= new Intent(this,Main2Activity.class);
                startActivity(i);
                break;

                default: break;

        }
    }
}
