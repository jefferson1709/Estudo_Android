package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    //TextBox
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textResultado;
    //Checkbox
    private CheckBox checkVerde, checkBranco, checkVermelho;
    //RadioButton
    private RadioButton sexoM, sexoF;
    private RadioGroup opcaosexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextBox
        campoNome     = findViewById(R.id.textnome);
        campoEmail    = findViewById(R.id.textemail);
        textResultado = findViewById(R.id.textResultado);
        //Checkbox
        checkVerde    = findViewById(R.id.checkVerde);
        checkBranco   = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);
        //RadioButton
        sexoF         = findViewById(R.id.radioButtonF);
        sexoM         = findViewById(R.id.radioButtonM);
        opcaosexo     = findViewById(R.id.radioGroupSexo);
        radiobutton();
    }

    public void checkbox(){
        String texto = "";
        if(checkVerde.isChecked()){
            //String corSelecionada = checkVerde.getText().toString();
            //texto += corSelecionada;
            texto +="Verde selecionado -";
        }
        if(checkBranco.isChecked()){
            texto +="Branco selecionado -";
        }
        if(checkVermelho.isChecked()){
            texto +="Vermelho selecionado -";
        }
        textResultado.setText(texto);

    }

    public void radiobutton(){

         opcaosexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(RadioGroup group, int checkedId) {
                 if(checkedId == R.id.radioButtonF){
                     textResultado.setText("Feminino");
                 }
                 if(checkedId == R.id.radioButtonM){
                     textResultado.setText("Masculino");
                 }
             }
         });
        /*String texto = "";
        if(sexoF.isChecked()){
            texto ="sexo Feminino selecionado -";
        }
        if(sexoM.isChecked()){
            texto ="sexo Masculino selecionado -";
        }
        textResultado.setText(texto);*/

    }

    public void enviar(View view) {
        //checkbox();
        radiobutton();

    /*    String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textResultado.setText("Nome:"+nome+"\ne-mail: " + email );*/
    }


    public void limpa(View view) {

        campoNome.setText("");
        campoEmail.setText("");
        textResultado.setText("");

    }

}