package com.example.calculatriceg1java;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
// CLEST LE PROJET GROUPE 1
public class ActivityCalcul extends AppCompatActivity {
    private Button bouton0;
    private Button bouton1;
    private Button bouton2;
    private Button bouton3;
    private Button bouton4;
    private Button bouton5;
    private Button bouton6;
    private Button bouton7;
    private Button bouton8;
    private Button bouton9;
    private Button boutonPlus;
    private Button boutonDivide;
    private Button boutonSubstract;
    private Button boutonMulitply;

    private TextView textViewCalcul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calcul);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        bouton0 = findViewById(R.id.button_0);
        bouton1 = findViewById(R.id.button_1);
        bouton2 = findViewById(R.id.button_2);
        bouton3 = findViewById(R.id.button_3);
        bouton4 = findViewById(R.id.button_4);
        bouton5 = findViewById(R.id.button_5);
        bouton6 = findViewById(R.id.button_6);
        bouton7 = findViewById(R.id.button_sept);
        bouton8 = findViewById(R.id.button_8);
        bouton9 = findViewById(R.id.button_9);
        boutonPlus = findViewById(R.id.button_plus);
        boutonDivide = findViewById(R.id.button_divide);
        boutonSubstract = findViewById(R.id.button_substract);
        boutonMulitply = findViewById(R.id.button_mulitply);
        textViewCalcul = findViewById(R.id.textview_calcul);
        //TODO FAIRE EN SORTE QUE QUAND JE CLIQUE ÇA APPELLE AJOUTERCHARACTERE

        bouton0.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton1.setOnClickListener(view -> ajouterCharactere(bouton1));
        bouton2.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton3.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton4.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton5.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton6.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton7.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton8.setOnClickListener(view -> ajouterCharactere((Button) view));
        bouton9.setOnClickListener(view -> ajouterCharactere((Button) view));
        boutonPlus.setOnClickListener(view -> ajouterCharactere((Button) view));
        boutonSubstract.setOnClickListener(view -> ajouterCharactere((Button) view));
        boutonDivide.setOnClickListener(view -> ajouterCharactere((Button) view));
        boutonMulitply.setOnClickListener(view -> ajouterCharactere((Button) view));
    }

    private void ajouterCharactere(Button bouton){
        textViewCalcul.setText(textViewCalcul.getText().toString()+bouton.getText().toString());
    }
}