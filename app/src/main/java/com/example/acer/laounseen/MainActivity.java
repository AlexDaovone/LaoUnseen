package com.example.acer.laounseen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.edtx);
        final EditText editText1 = findViewById(R.id.edty);
        final TextView textView = findViewById(R.id.result);
        Button button = findViewById(R.id.btncal);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ix = Integer.parseInt(editText.getText().toString());
                int iy = Integer.parseInt(editText1.getText().toString());
                textView.setText(ix + iy +"");
            }
        });
    }
}
