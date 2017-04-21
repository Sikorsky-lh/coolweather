package com.coolweather.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.coolweather.android.db.Province;
import com.coolweather.android.util.HttpUtil;
import com.coolweather.android.util.MyApplication;
import com.coolweather.android.util.Utility;

import org.litepal.crud.DataSupport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

//    private List<String> dataList=new ArrayList<>();
//
//    private List<Province> provinceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        String address = "http://guolin.tech/api/china";
//        HttpUtil.sendOkHttpRequest(address, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Toast.makeText(MyApplication.getContext(), "failed", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//
//                final String responseText = response.body().string();
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
////                        TextView textView= (TextView) findViewById(R.id.text);
////                        textView.setText(responseText);
//                        Utility.handleProvinceResponse(responseText);
//                    }
//                });
//
//            }
//        });

//
//        initDatalist();

//
//        ArrayAdapter<String> adapter;
//        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, dataList);
//
//            ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();

        }

//    private void initDatalist() {
//
//            provinceList = DataSupport.findAll(Province.class);
//            dataList.clear();
//            for (Province province : provinceList) {
//                String provinceName = province.getProvinceName();
//                dataList.add(provinceName);
//            }
//
//    }
}
