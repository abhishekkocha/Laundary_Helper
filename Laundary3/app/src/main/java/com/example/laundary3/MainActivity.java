package com.example.laundary3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton b1;
    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    String d1;
    String dd1;
    ListView l1;
    TextView t;
    ArrayAdapter<datastore> mm ;
    dbhelp dd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         b1 = findViewById(R.id.floatingActionButton);
         s1 = getIntent().getStringExtra("t-shirt");
         s2 =  getIntent().getStringExtra("banyan");
        s3 =  getIntent().getStringExtra("shorts");
        s4 =  getIntent().getStringExtra("npant");
        s5 =  getIntent().getStringExtra("bedshe");
        s6 =  getIntent().getStringExtra("pillow");
        d1 = getIntent().getStringExtra("date");
        dd1 = getIntent().getStringExtra("duedate");
         l1 = findViewById(R.id.lis);
         dd = new dbhelp(MainActivity.this);
        jon();
         if(s1 == null){

         }else{
             datastore dm;
             try{
                 dm = new datastore(-1,s1,s3,s4,s5,s6,s2,d1,dd1);
             }catch(Exception e){
                 Toast.makeText(MainActivity.this,"Error",Toast.LENGTH_SHORT).show();
                 dm = new datastore(-1,"error","error","error","error","error","error");
             }
             dbhelp dp = new dbhelp(MainActivity.this);
            boolean m = dp.addone(dm);
             Toast.makeText(MainActivity.this,"sucess="+ m,Toast.LENGTH_SHORT).show();
             jon();
         }
        datastore datas;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,pp.class);
                startActivity(intent);
            }
        });

        l1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                datastore datastore = (datastore) parent.getItemAtPosition(position);
                dd.deleteone(datastore);
                Toast.makeText(MainActivity.this,"DELETED",Toast.LENGTH_LONG).show();
                jon();
                return true ;
            }
        });
    }
    private void jon(){
        mm = new ArrayAdapter<datastore>(MainActivity.this, R.layout.op,dd.getEveryone());
        l1.setAdapter(mm);
    }
}