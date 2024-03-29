package com.example.test123;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        firstFragment = (Button) findViewById(R.id.firstFragment);
        secondFragment = (Button) findViewById(R.id.secondFragment);

      firstFragment.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              loadFragment(new FragmentA());
          }
      });

      secondFragment.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              loadFragment(new FragmentB());
          }
      });

    }

    private void loadFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentLayout, fragment);
        fragmentTransaction.commit();
    }


}