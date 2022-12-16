package com.example.collegemanagementsystem.Students;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;


import com.example.collegemanagementsystem.R;
import com.example.collegemanagementsystem.Students.Fragments.AboutFragment;
import com.example.collegemanagementsystem.Students.Fragments.DepartmentFragment;
import com.example.collegemanagementsystem.Students.Fragments.FacultyFragment;
import com.example.collegemanagementsystem.Students.Fragments.HomeFragmentFragment;
import com.example.collegemanagementsystem.Students.Fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StudentMainActivity2 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

        BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_main2);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

    }
    HomeFragmentFragment homeFragment = new HomeFragmentFragment();
    DepartmentFragment deptFragment = new DepartmentFragment();
    FacultyFragment facultyFragment = new FacultyFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    AboutFragment aboutFragment = new AboutFragment();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navigation_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, homeFragment).commit();
                return true;
            case R.id.navigation_Department:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, deptFragment).commit();
                return true;
            case R.id.navigation_faculty:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, facultyFragment).commit();
                return true;
            case R.id.navigation_profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileFragment).commit();
                return true;
            case R.id.navigation_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, aboutFragment).commit();
                return true;


        }
        return false;
    }
}