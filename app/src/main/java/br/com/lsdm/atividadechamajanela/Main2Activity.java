package br.com.lsdm.atividadechamajanela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void buttonBack(View view) {
        Intent i2 = new Intent(Main2Activity.this, MainActivity.class);
        Main2Activity.this.startActivity(i2);
    }
}