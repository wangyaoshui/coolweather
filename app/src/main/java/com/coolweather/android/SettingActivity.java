package com.coolweather.android;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.coolweather.android.set.TimeSet;


public class SettingActivity extends AppCompatActivity{
    Button backButton ;
    SwitchCompat switchCompat;
    EditText editText;
    TimeSet timeSet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        backButton = findViewById(R.id.back_button);
        editText = findViewById(R.id.edit_text);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //从 EditText 中取参数
//                String time = editText.getText().toString();
//                if (!time.equals("")) {
//                    timeSet.setTime(time);
//                }
                Intent intent = new Intent(SettingActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });

        switchCompat = findViewById(R.id.autoupdateSwitch);
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingActivity.this, "设置已变更", Toast.LENGTH_SHORT).show();
            }
        });




    }

}
