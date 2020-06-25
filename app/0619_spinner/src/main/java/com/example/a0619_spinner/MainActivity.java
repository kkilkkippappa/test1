package com.example.a0619_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Spinner spinner;
    ArrayList<String> dataList = getArrayListData(30);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

        // 어댑터 생성
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dataList);

        // 리스트뷰에 어댑터 연결
        spinner.setAdapter(adapter);

        // 드롭다운 뷰 설정
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        // 리스트뷰의 아이템 클릭 이벤트 설정

    }
    private  ArrayList<String> getArrayListData(int count){
        ArrayList<String>   arrayList = new ArrayList<>();

        for(int i = 0; i <= count; i++){
            arrayList.add("스피너 아이템" + i);
        }
        return  arrayList;
    }
}