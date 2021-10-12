package com.example.toggleeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private CheckBox checkSenha;
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha   = findViewById(R.id.toggleSenha);
        switchSenha   = findViewById(R.id.switchSenha);
        checkSenha = findViewById(R.id.checkSenha);
        textResultado = findViewById(R.id.textResultado);

        adcionarListener();
    }

    public void enviar(View view){
        checkbutton();
    }

    public void adcionarListener(){
        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    textResultado.setText("toggle Ligado");
                }else{
                    textResultado.setText("toggle DesLigado");
                }
            }
        });
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    textResultado.setText("switch Ligado");
                }else{
                    textResultado.setText("switch DesLigado");
                }
            }
        });
        checkSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    textResultado.setText("CheckBox Ligado");
                }else{
                    textResultado.setText("CheckBox DesLigado");
                }
            }
        });
    }




    public void checkbutton(){
        //toggleSenha.setOnCheckedChangeListener( );
        String toggle = "";
        String switch1 = "";
        String check = "";

        if (toggleSenha.isChecked()){
           toggle = "Ligado";
        }else{
            toggle = "DesLigado";
        }

        if(switchSenha.isChecked()) {
            switch1 = "Ligado";
        }else {
            switch1 = "DesLigado";
        }

        if(checkSenha.isChecked()) {
            check = "Ligado";
        }else {
            check = "DesLigado";
        }

        textResultado.setText(" toggle:"+ toggle +"\n switch: "+ switch1+"\n check: "+ check);
    }


}