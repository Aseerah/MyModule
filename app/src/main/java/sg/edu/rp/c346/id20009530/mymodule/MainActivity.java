package sg.edu.rp.c346.id20009530.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // step 1
    Button btn203;
    Button btn346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // step 2
        btn203 = findViewById(R.id.btn203);
        btn346 = findViewById(R.id.btn346);

        btn203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // step 3
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("module", "c203");
                startActivity(intent);

            }
        });

        btn346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetails.class);
                intent.putExtra("module", "c346");
                startActivity(intent);

            }
        });


    }
}