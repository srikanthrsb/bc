package com.sptuts.bcdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by buchale.reddy on 7/1/2015.
 */
public class BaseActivity extends AppCompatActivity {

    protected void setUpActionBar(final Toolbar toolbar) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    protected void setUpActionBarTitle(final String title) {
        getSupportActionBar().setTitle(title);
    }
}
