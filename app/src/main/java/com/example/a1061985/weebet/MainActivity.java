package com.example.a1061985.weebet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends MenuActivity {

    public Button soccerButton;

    public void onSoccerButtonPress(){
        soccerButton = (Button)findViewById(R.id.soccerButton);
        soccerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CompetitionsActivity.class);
                intent.putExtra("sportId", 1);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onSoccerButtonPress();
    }
}
