package com.example.nbtoshiba.dietsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by nb toshiba on 20/2/2017.
 */

public class AboutLogin extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutlogin_layout);

        Button b = (Button) findViewById(R.id.login);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutLogin.this ,Mainpage.class);
                AboutLogin.this.startActivity(intent);
            }
        });
    }
}
