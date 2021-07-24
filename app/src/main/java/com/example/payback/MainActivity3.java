package com.example.payback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        int val = intent.getIntExtra(MainActivity.EXTRA_PERSON, -1);

        TextView nameTextView = findViewById(R.id.nameSubmit);
        nameTextView.setText(MainActivity.data.get(val).getName());
        int flag = intent.getIntExtra(MainActivity.EXTRA_WHAT, -1);
        String sFlag;
        if (flag == 0) sFlag = "Add";
        else sFlag = "Sub";
        TextView flagDisplay = findViewById(R.id.addSubText);
        flagDisplay.setText(sFlag);

        EditText et = findViewById(R.id.moneySubmit);
        Button btn = findViewById(R.id.SubmitButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float money = Float.parseFloat(et.getText().toString());
                if(flag == 0) {
                    MainActivity.data.get(val).addMoney(money);
                }
                else{
                    MainActivity.data.get(val).subMoney(money);
                }
                Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}