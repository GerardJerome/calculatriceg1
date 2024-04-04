package com.example.calculatriceg1java;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculatriceg1java.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button boutonCalcul;

    private TextView monTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boutonCalcul= findViewById(R.id.bouton_calcul);
        monTextView = findViewById(R.id.monTextView);
        /*boutonCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/

        boutonCalcul.setOnClickListener(view -> {
            Toast.makeText(this,"j'affiche un toast",Toast.LENGTH_LONG).show();
            monTextView.setText(getString(R.string.text_mon_textview));
            //TODO MODIFIER L'ATTRIBUT TEXT DE MA TEXTVIEW
        });
    }


}