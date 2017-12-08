package com.ex.vicandroid.inout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Step 1:宣告變數類型
    private Button myBtnCopy;
    private TextView mytvHeloWorld;
    private EditText myetInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2:初始化UI介面上的控制單元-透過findViewById()指令產生連結性達到控制功能
        //format 宣告的變數 = (元件類型)findViewById(R.id.元件ID);
        mytvHeloWorld = (TextView)findViewById(R.id.tvHelloWorld);
        myetInput = (EditText)findViewById(R.id.etOutput);
        myBtnCopy = (Button)findViewById(R.id.btnCopy);

        //Step 3:建立事件-當Button有應對事件onClick時

        myBtnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mytvHeloWorld.setText(myetInput.getText());

                //Toast
                String toastMsg = myetInput.getText().toString();
                Toast toast = Toast.makeText(view.getContext(), toastMsg, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 100);
                toast.show();


            }
        });

    }
}
