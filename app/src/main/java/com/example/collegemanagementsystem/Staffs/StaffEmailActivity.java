package com.example.collegemanagementsystem.Staffs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.collegemanagementsystem.AdminMainActivity;
import com.example.collegemanagementsystem.R;


public class StaffEmailActivity extends AppCompatActivity {

    EditText StaffEmail,StaffPassword;
    Button StaffLoginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_email);


        StaffEmail=findViewById(R.id.StaffEmail);
        StaffPassword=findViewById(R.id.StaffPassword);
        StaffLoginBtn=findViewById(R.id.StaffLoginBtn);

        StaffLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = StaffEmail.getText().toString();
                String password = StaffPassword.getText().toString();

                if (email.isEmpty()){
                    StaffEmail.setError("Email Error");
                    StaffEmail.requestFocus();
                }else if (password.isEmpty()){
                    StaffPassword.setError("Password Error");
                    StaffPassword.requestFocus();
                }else if (email.equals("staff23@gmail.com") & password.equals("staff23")){
                    Toast.makeText(StaffEmailActivity.this,"Staff Login Successfully",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(StaffEmailActivity.this, AdminMainActivity.class));
                    finish();
                }else {
                    Toast.makeText(StaffEmailActivity.this,"something went wrong",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}