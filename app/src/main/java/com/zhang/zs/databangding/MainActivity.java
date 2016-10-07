package com.zhang.zs.databangding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.zhang.zs.databangding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setStu(new Student("TOM"));
        Log.e("TAG", "111177777777777777777777777777777700000000000000");
        Log.e("TAG", "1111777777777777777777777777777777");
        System.out.print(true);
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");
        Log.e("TAG","1111222222222222222222222");

    }
}
