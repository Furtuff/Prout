package fr.wildcodeschool.haa.prout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button= (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chier = new Intent(MainActivity.this,ScrollingActivity.class);
                startActivity(chier);
            }
        });
        Button button2= (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chier = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(chier);
            }ffnsxudnlsdjnfhsfhfd gdf fghdnffghft
            rnydfgotfky,dfy,s4dgf4
                    toykd,tfùmbdn:ft
            pktr
                    ùtj ùdol dnlgk d$f
                    mlyàpsmro dt
                            ;dpd odtkyft$u,sr
                    dp,pp !  j ty;sby r
                    * y d
        });
    }
}
