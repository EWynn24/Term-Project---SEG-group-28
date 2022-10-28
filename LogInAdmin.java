package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInAdmin extends AppCompatActivity {
    Button btn0;
    TextView display;

    EditText editTextTextID;
    EditText editTextPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_admin);
        display=findViewById(R.id.display);
        btn0=findViewById(R.id.btn0);

        editTextTextID = findViewById(R.id.editTextTextID);
        editTextPass = findViewById(R.id.editTextPass);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //openSignUPAdmin();
                if(editTextTextID.getText().toString().matches("") || editTextPass.getText().toString().matches("")){
                    display.setText("Missing Criteria");
                }else{
                    updateID();
                }
            }
        });
    }
    public void updateID(){
        display.setText("ID: "+editTextTextID.getText()+"; Password: "+editTextPass.getText());
        editTextTextID.setText("");
        editTextPass.setText("");
    }
}
