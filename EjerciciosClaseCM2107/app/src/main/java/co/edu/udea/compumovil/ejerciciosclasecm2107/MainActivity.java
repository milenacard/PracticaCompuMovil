package co.edu.udea.compumovil.ejerciciosclasecm2107;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

       /* btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                log.d("MainActivity", "onClick Button");
                Toast.makeText(MainActivity.this, "Mensaje", Toast.LENGTH_LONG);
            }

        });*/

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button:
                Log.d("MainActivity", "onClick Button");
                Toast.makeText(MainActivity.this, "Mensaje 1", Toast.LENGTH_LONG);
                break;
            case R.id.button_2:
                Log.d("MainActivity", "onClick Button 2");
                Toast.makeText(MainActivity.this, "Mensaje 2", Toast.LENGTH_LONG);
                break;
        }
    }
}