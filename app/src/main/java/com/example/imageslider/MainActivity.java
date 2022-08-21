package com.example.imageslider;

import static com.example.imageslider.MyAdapter.position_pic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        viewPager=findViewById(R.id.viewPager);
        circleIndicator=findViewById(R.id.circleIndicator);

        List<Integer> imageList=new ArrayList<>();
        imageList.add(R.drawable.a);
        imageList.add(R.drawable.b);
        imageList.add(R.drawable.c);
        imageList.add(R.drawable.d);
        imageList.add(R.drawable.e);
        imageList.add(R.drawable.f);



        MyAdapter adapter=new MyAdapter(imageList);
        viewPager.setAdapter(adapter);
        circleIndicator.setViewPager(viewPager);




    }
}