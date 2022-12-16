package com.example.collegemanagementsystem.Students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.collegemanagementsystem.R;
import com.google.android.material.card.MaterialCardView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Student_Reg_Log extends AppCompatActivity {



    private MaterialCardView StudentRegister,StudentLogin;

    FirebaseUser firebaseUser;
    @Override
    protected void onStart() {
        super.onStart();

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if (firebaseUser != null) {
            startActivity(new Intent(Student_Reg_Log.this,StudentMainActivity2.class));
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_reg_log);


        StudentLogin=findViewById(R.id.StudentLogin);
        StudentRegister=findViewById(R.id.StudentRegister);


        StudentRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student_Reg_Log.this, StudentRegisterActivity.class));
            }
        });
        StudentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Student_Reg_Log.this,StudentLoginActivity.class));
            }
        });
    }
}