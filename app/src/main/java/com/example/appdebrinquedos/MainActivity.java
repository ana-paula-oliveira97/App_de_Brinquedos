package com.example.appdebrinquedos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void brinquedo1(View V){
        Toast.makeText(getApplicationContext(),"Mini BonecoYoshi Super Mario R$ 143,99 à vista",Toast.LENGTH_LONG).show();
    }
    public void brinquedo2(View V){
        Toast.makeText(getApplicationContext(),"Boneca Baby Alive - Dia na Praia R$ 349,99 à vista",Toast.LENGTH_LONG).show();
    }
    public void brinquedo3(View V){
        Toast.makeText(getApplicationContext(),"LEGO Harry Potter - Hogwarts R$ 199,99 à vista",Toast.LENGTH_LONG).show();
    }
    public void brinquedo4(View V){
        Toast.makeText(getApplicationContext(),"Hot Wheels - Track Builder R$ 219,90 à vista",Toast.LENGTH_LONG).show();
    }

    public void  vermais(View V){
        Toast.makeText(getApplicationContext(),"Mais Brinquedos em Breve",Toast.LENGTH_LONG).show();
    }
}