package com.example.a1061985.weebet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.a1061985.weebet.Model.Competition;

public class MenuActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_list_view:
                launchListOddsActivity();
                return true;
            case R.id.menu_competitions:
                launchCompetitionsActivity();
                return true;

            default: return super.onOptionsItemSelected(item);
        }
    }


    private void launchListOddsActivity() {
        Intent intent = new Intent(getApplicationContext(), ListOddsActivity.class);
        startActivity(intent);
    }

    private void launchCompetitionsActivity(){
        Intent intent = new Intent(getApplicationContext(), CompetitionsActivity.class);
        intent.putExtra("sportId", 1);
        startActivity(intent);
    }


    }

