package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        TextView txtFirst = findViewById(R.id.txtShowFirstName);
        TextView txtLast = findViewById(R.id.txtShowLastName);
        TextView txtMail = findViewById(R.id.txtShowEmail);

        EditText edtFirst = findViewById(R.id.edtFirstName);
        EditText edtLast = findViewById(R.id.edtLastName);
        EditText edtMail = findViewById(R.id.edtEmail);

        txtFirst.setText(txtFirst.getText() + edtFirst.getText().toString());
        txtLast.setText(txtLast.getText() + edtLast.getText().toString());
        txtMail.setText(txtMail.getText() + edtMail.getText().toString());
    }
}