package com.example.laundary3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pp extends AppCompatActivity {
EditText t1;
EditText t2;
EditText t3;
EditText t4;
EditText t5;
EditText t6;
EditText d1;
EditText d2;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pp);
        t1 = findViewById(R.id.editTextTextPersonName);
        t2 = findViewById(R.id.banya);
        t3 = findViewById(R.id.shorts);
        t4 = findViewById(R.id.npantt);
        t5 = findViewById(R.id.bedsheet);
        t6 = findViewById(R.id.pillowcover);
        d1 = findViewById(R.id.dante);
        d2 = findViewById(R.id.duedante);

    }
   public void getdata(){
      Intent intent = new Intent(this,MainActivity.class);
      intent.putExtra("t-shirt",t1.getText().toString());
      intent.putExtra("banyan",t2.getText().toString());
      intent.putExtra("shorts",t3.getText().toString());
      intent.putExtra("npant",t4.getText().toString());
      intent.putExtra("bedshe",t5.getText().toString());
      intent.putExtra("pillow",t6.getText().toString());
      intent.putExtra("date",d1.getText().toString());
       intent.putExtra("duedate",d2.getText().toString());
      startActivity(intent);
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.lol,menu);
        MenuItem m = menu.findItem(R.id.hi);
        m.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                getdata();
                return true;
            }
        });
        return true;
    }
}