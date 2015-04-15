package com.vipul.hp_hp.layout_to_image;

import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.vipul.hp_hp.library.Layout_to_Image;


public class MainActivity extends ActionBarActivity {

    Layout_to_Image layout_to_image;

    RelativeLayout relativeLayout;

    Bitmap bitmap;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout=(RelativeLayout)findViewById(R.id.container);
        imageView=(ImageView)findViewById(R.id.imageView2);

        layout_to_image=new Layout_to_Image(MainActivity.this,relativeLayout);

        bitmap=layout_to_image.convert_layout();

        imageView.setImageBitmap(bitmap);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}