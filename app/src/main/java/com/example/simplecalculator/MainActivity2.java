package com.example.simplecalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity2 extends AppCompatActivity {
    EditText num1, num2;
    Button add,sub,mul,div,mod,allOps,clear,back;
    TextView AddRes,SubRes,MulRes,DivRes,ModRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        sub= (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        allOps=(Button) findViewById(R.id.allOps);
        clear=(Button) findViewById(R.id.Clear);
        mod=(Button) findViewById(R.id.mod);
        AddRes=(TextView)findViewById(R.id.addRes);
        SubRes=(TextView)findViewById(R.id.subRes);
        MulRes=(TextView)findViewById(R.id.mulRes);
        DivRes=(TextView)findViewById(R.id.divRes);
        ModRes=(TextView)findViewById(R.id.modRes);
        back=(Button) findViewById(R.id.back);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=num1.getText().toString();
                n2=num2.getText().toString();
                if (n1.isEmpty()|| n2.isEmpty()) {
                    Toast.makeText(MainActivity2.this,"Please enter the two numbers",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    float Res1 = (Float.parseFloat(n1) + Float.parseFloat(n2));
                    AddRes.setText(String.valueOf(Res1));
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=num1.getText().toString();
                n2=num2.getText().toString();
                if (n1.isEmpty()|| n2.isEmpty()) {
                    Toast.makeText(MainActivity2.this,"Please enter the two numbers",Toast.LENGTH_SHORT).show();
                    return;
                }
                float Res2= (Float.parseFloat(n1)-Float.parseFloat(n2));
                SubRes.setText(String.valueOf(Res2));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=num1.getText().toString();
                n2=num2.getText().toString();
                if (n1.isEmpty()|| n2.isEmpty()) {
                    Toast.makeText(MainActivity2.this,"Please enter the two numbers",Toast.LENGTH_SHORT).show();
                    return;
                }
                float Res3= (Float.parseFloat(n1)*Float.parseFloat(n2));
                MulRes.setText(String.valueOf(Res3));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=num1.getText().toString();
                n2=num2.getText().toString();
                if (n1.isEmpty()|| n2.isEmpty()) {
                    Toast.makeText(MainActivity2.this,"Please enter the two numbers",Toast.LENGTH_SHORT).show();
                    return;
                }
                float Res4= (Float.parseFloat(n1)/Float.parseFloat(n2));
                DivRes.setText(String.valueOf(Res4));
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=num1.getText().toString();
                n2=num2.getText().toString();
                if (n1.isEmpty()|| n2.isEmpty()) {
                    Toast.makeText(MainActivity2.this,"Please enter the two numbers",Toast.LENGTH_SHORT).show();
                    return;
                }
                float Res5= (Float.parseFloat(n1)%Float.parseFloat(n2));
                ModRes.setText(String.valueOf(Res5));
            }
        });
        allOps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1,n2;
                n1=num1.getText().toString();
                n2=num2.getText().toString();
                if (n1.isEmpty()|| n2.isEmpty()) {
                    Toast.makeText(MainActivity2.this,"Please enter the two numbers",Toast.LENGTH_SHORT).show();
                    return;
                }
                float Res1= (Float.parseFloat(n1)+Float.parseFloat(n2));
                AddRes.setText(String.valueOf(Res1));
                float Res2= (Float.parseFloat(n1)-Float.parseFloat(n2));
                SubRes.setText(String.valueOf(Res2));
                float Res3= (Float.parseFloat(n1)*Float.parseFloat(n2));
                MulRes.setText(String.valueOf(Res3));
                float Res4= (Float.parseFloat(n1)/Float.parseFloat(n2));
                DivRes.setText(String.valueOf(Res4));
                float Res5= (Float.parseFloat(n1)%Float.parseFloat(n2));
                ModRes.setText(String.valueOf(Res5));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num2.setText("");
                AddRes.setText("");
                SubRes.setText("");
                MulRes.setText("");
                DivRes.setText("");
                ModRes.setText("");
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent conn = new
                        Intent(getApplicationContext(),MainActivity.class);
                startActivity(conn);
                startActivityForResult(conn,1);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}