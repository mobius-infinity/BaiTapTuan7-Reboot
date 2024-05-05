package com.example.baitaptuan7_reboot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.baitaptuan7_reboot.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private UserModel userModel = new UserModel("","");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        binding.setUser(userModel);
        userModel.setFirstName("Huu");
        userModel.setLastName("Trung");
    }
}