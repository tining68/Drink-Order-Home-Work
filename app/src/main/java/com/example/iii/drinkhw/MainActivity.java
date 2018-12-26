package com.example.iii.drinkhw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener btnAdd_Click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int price=Integer.parseInt(spinner1.getSelectedItem().toString().substring(27,29));
            int count=Integer.parseInt(spinner4.getSelectedItem().toString());
            String TotalPrice= Integer.toString(price*count);
            String msg=spinner1.getSelectedItem().toString()+" ,"+spinner2.getSelectedItem().toString()+" ,"+spinner3.getSelectedItem().toString()+" ,"+spinner4.getSelectedItem().toString()+"杯";

            txtOrder.setText(msg+"\r\n"+"\r\n價錢："+TotalPrice+" 元");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialComponent();
    }



    private void InitialComponent() {
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(btnAdd_Click);
        txtOrder=(TextView)findViewById(R.id.txtOrder);
        spinner1=(Spinner)findViewById(R.id.spinner1);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        spinner3=(Spinner)findViewById(R.id.spinner3);
        spinner4=(Spinner)findViewById(R.id.spinner4);

    }

    Spinner spinner1,spinner2,spinner3,spinner4;
    TextView txtOrder;
    Button btnAdd;
}

