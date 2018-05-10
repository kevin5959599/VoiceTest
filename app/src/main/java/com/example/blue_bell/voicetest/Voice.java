package com.example.blue_bell.voicetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Blue_bell on 2017/12/28.
 */

public class Voice extends Activity {
    private String updatecitycode = "-1";
    private String cityname;
    private String all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voice_layout);



        //透過 Intent 的方式開啟內建的語音辨識 Activity...
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "請說話..."); //語音辨識 Dialog 上要顯示的提示文字
        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                //把所有辨識的可能結果印出來看一看，第一筆是最 match 的。

                ArrayList result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                all = "";
                for (Object r : result) {
                    all = all + r + "\n";
                }
                if(all.contains("基隆"))
                {
                    updatecitycode = "03";
                    cityname = "基隆市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("臺北"))
                {
                    updatecitycode = "01";
                    cityname = "臺北市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("新北市"))
                {
                    updatecitycode = "04";
                    cityname = "新北市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("桃園"))
                {
                    updatecitycode = "05";
                    cityname = "桃園市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("新竹市"))
                {
                    updatecitycode = "14";
                    cityname = "新竹市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("新竹縣"))
                {
                    updatecitycode = "06";
                    cityname = "新竹縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("宜蘭"))
                {
                    updatecitycode = "17";
                    cityname = "宜蘭縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("苗栗"))
                {
                    updatecitycode = "07";
                    cityname = "苗栗縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("臺中"))
                {
                    updatecitycode = "08";
                    cityname = "臺中市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("彰化"))
                {
                    updatecitycode = "09";
                    cityname = "彰化縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("南投"))
                {
                    updatecitycode = "10";
                    cityname = "南投縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("雲林"))
                {
                    updatecitycode = "11";
                    cityname = "雲林縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("嘉義市"))
                {
                    updatecitycode = "16";
                    cityname = "嘉義市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("嘉義縣"))
                {
                    updatecitycode = "12";
                    cityname = "嘉義縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("臺南"))
                {
                    updatecitycode = "13";
                    cityname = "臺南市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("高雄"))
                {
                    updatecitycode = "02";
                    cityname = "高雄市";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("屏東"))
                {
                    updatecitycode = "15";
                    cityname = "屏東縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("澎湖"))
                {
                    updatecitycode = "20";
                    cityname = "澎湖縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("花蓮"))
                {
                    updatecitycode = "18";
                    cityname = "花蓮縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("臺東"))
                {
                    updatecitycode = "19";
                    cityname = "臺東縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("金門"))
                {
                    updatecitycode = "21";
                    cityname = "金門縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }else if(all.contains("連江"))
                {
                    updatecitycode = "22";
                    cityname = "連江縣";
                    Intent intent = new Intent(this,Weather.class);
                    intent.putExtra("citycode",updatecitycode);
                    intent.putExtra("city",cityname);
                    startActivity(intent);
                }
            }
        }
        finish();
    }


}
