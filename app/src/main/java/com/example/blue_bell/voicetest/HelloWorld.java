package com.example.blue_bell.voicetest;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Blue_bell on 2017/12/21.
 */

public class HelloWorld extends Activity {
    /*@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main );

        Button button = (Button)findViewById( R.id.button);

        // 判斷裝置是否有支援語音辨識功能的 App, 若沒有則失效之
        PackageManager pm = getPackageManager();
        List activities = pm.queryIntentActivities( new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH), 0);
        if( activities.size() == 0 )
            button.setEnabled( false );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // 不知道從哪個版本之後, 語音辨識需要【網路有通】才能進行
                // 判斷有無連接網路, 若沒有, 則不允許進行語音輸入
                ConnectivityManager cm = (ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);
                NetworkInfo info = cm.getActiveNetworkInfo();
                if( info == null || !info.isConnected() )
                {
                    return;
                }

                try {
                    // ACTION_RECOGNIZE_SPEECH: 透過 Android 內建語音辨識
                    // ACTION_WEB_SEARCH: 透過外掛的語音辨識 App
                    Intent intent = new Intent( RecognizerIntent.ACTION_RECOGNIZE_SPEECH );

                    intent.putExtra( RecognizerIntent.EXTRA_LANGUAGE_MODEL
                            , RecognizerIntent.LANGUAGE_MODEL_FREE_FORM
                    );

                    // 設定語音辨識的語系
                    intent.putExtra( RecognizerIntent.EXTRA_LANGUAGE, Locale.CHINESE.toString() );

                    // 回傳語音辨識有多少結果段落 (沒有設定, 回傳全部段落)
                    //intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1);

                    // 語音提示文字 (替換成您喜歡的文字)
                    intent.putExtra( RecognizerIntent.EXTRA_PROMPT
                            , "請說 ..."
                    );

                    startActivityForResult( intent, 0 );
                }
                catch (ActivityNotFoundException e) {
                    // 如果沒有安裝具有語音辨識 Activity 的時候，顯示錯誤訊息
                    Toast.makeText( HelloWorld.this
                            , "找不到語音辨識 App !!"
                            , Toast.LENGTH_LONG
                    ).show();
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {

        if( requestCode == 0 && resultCode == RESULT_OK )
        {
            String resultsString = "";

            // 取得 STT 語音辨識的結果段落
            ArrayList results = data.getStringArrayListExtra( RecognizerIntent.EXTRA_RESULTS );

            // 語音辨識的每個段落
            for( int i = 0; i < results.size(); i++ )
            {
                // 一個段落可拆解為多個字組
                /*String[] resultWords = results.get(i).split("");

                for( int j = 0; j < resultWords.length; j++ )
                {
                    resultsString += resultWords[j] + ":";
                }
            }

            // 顯示結果
            Toast.makeText( this, resultsString, Toast.LENGTH_LONG ).show();
        }

        super.onActivityResult( requestCode, resultCode, data );
    }*/
}
