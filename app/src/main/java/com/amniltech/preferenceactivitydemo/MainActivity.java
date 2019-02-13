package com.amniltech.preferenceactivitydemo;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout clRootLayout;
    private TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clRootLayout = findViewById(R.id.cl_rootlayout);
        tvText = findViewById(R.id.tv_demo_text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.action_setting:
                startActivity(new Intent(MainActivity.this,Setting.class));
                break;

        }
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();

        GetSetting setting = new GetSetting(this);
        if(setting.getDarkEnabled()){
            clRootLayout.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            tvText.setBackgroundColor(getResources().getColor(R.color.colorBlack));
            tvText.setTextColor(getResources().getColor(R.color.colorWhite));
        }else{
            clRootLayout.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tvText.setBackgroundColor(getResources().getColor(R.color.colorWhite));
            tvText.setTextColor(getResources().getColor(R.color.colorBlack));

        }
    }
}
