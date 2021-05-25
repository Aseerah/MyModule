package sg.edu.rp.c346.id20009530.mymodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetails extends AppCompatActivity {
    // step 1
    TextView tvModuleDetails;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);


        tvModuleDetails = findViewById(R.id.moduleDetails);
        backButton = findViewById(R.id.backButton);

        //step 3
        Intent intentRecieved = getIntent();
        String module = intentRecieved.getStringExtra("module");
        if(module.equals("c203")){
            String Output = "Module Code: C203 \n" +
                    "Module Name: Web Application Development in php\n" +
                    "Academic Year: 2021 \n" +
                    "Semester: 1 \n" +
                    "Module Credit: 4 \n" +
                    "Venue: W67N";
            tvModuleDetails.setText(Output);

        }else{
            String Output = "Module Code: C346 \n" +
                    "Module Name: Mobile Application Development \n" +
                    "Academic Year: 2021 \n" +
                    "Semester: 1 \n" +
                    "Module Credit: 4 \n" +
                    "Venue: E62E";
            tvModuleDetails.setText(Output);

        }


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}
