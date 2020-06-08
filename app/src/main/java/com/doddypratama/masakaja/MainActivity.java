package com.doddypratama.masakaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView indonesia, chinese, snack, dessert, viral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indonesia = (CardView) findViewById(R.id.indonesia);
        chinese = (CardView) findViewById(R.id.chinese);
        snack = (CardView) findViewById(R.id.snack);
        dessert = (CardView) findViewById(R.id.dessert);
        viral = (CardView) findViewById(R.id.viral);

        indonesia.setOnClickListener(this);
        chinese.setOnClickListener(this);
        snack.setOnClickListener(this);
        dessert.setOnClickListener(this);
        viral.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()) {

            case R.id.indonesia : intent = new Intent(this, Indonesia.class);
            startActivity(intent);
            break;

            case R.id.chinese : intent = new Intent(this, Chinese.class);
            startActivity(intent);
            break;

            case R.id.snack : intent = new Intent(this, Snack.class);
            startActivity(intent);
            break;

            case R.id.dessert : intent = new Intent(this, Dessert.class);
            startActivity(intent);
            break;

            case R.id.viral : intent = new Intent(this, Viral.class);
            startActivity(intent);
            break;

            default:break;

        }

    }
}
