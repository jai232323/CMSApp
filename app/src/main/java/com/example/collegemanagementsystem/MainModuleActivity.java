package com.example.collegemanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.collegemanagementsystem.Admin.AdminEmailActivity;
import com.example.collegemanagementsystem.Staffs.StaffEmailActivity;
import com.example.collegemanagementsystem.Students.Student_Reg_Log;
import com.google.android.material.card.MaterialCardView;

public class MainModuleActivity extends AppCompatActivity {


    MaterialCardView Students,Staffs,Admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_module);

        Students=findViewById(R.id.Students);
        Staffs=findViewById(R.id.Staffs);
        Admin=findViewById(R.id.Admin);

        Students.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainModuleActivity.this, Student_Reg_Log.class));
            }
        });
        Staffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainModuleActivity.this, StaffEmailActivity.class));
            }
        });
        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainModuleActivity.this, AdminEmailActivity.class));
            }
        });

    }
}