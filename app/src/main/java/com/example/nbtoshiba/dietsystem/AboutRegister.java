package com.example.nbtoshiba.dietsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by nb toshiba on 20/2/2017.
 */

public class AboutRegister extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutregister_layout);

        Button b = (Button) findViewById(R.id.submit);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutRegister.this ,Mainpage.class);
                AboutRegister.this.startActivity(intent);
            }
        });


    }
}
