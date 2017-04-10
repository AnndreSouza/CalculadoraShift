package br.com.fiap.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SomaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma);

        /*Button button = (Button) findViewById(R.id.btn_soma);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somador(View v);
            }
        });*/
    }


    //Metodo para clique do botao
    public void somador(View view){
        //recuperar os valores da tela
        //recupera os componentes da teala
        EditText editNumero1 =(EditText) findViewById(R.id.txt_numero1);
        EditText editNumero2 =(EditText) findViewById(R.id.txt_numero2);

        //recuparar o valor  de dentro do componente(valor inserido pelo user)
        //converte a string para um valor inteiro
        int numero1 = Integer.parseInt(editNumero1.getText().toString());
        int numero2 = Integer.parseInt(editNumero2.getText().toString());

        //realiza a operacao (soma)
        int soma = numero1 + numero2;

        //devolve o resultado
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle(R.string.dialog_title);
        alert.setMessage("SOMA: " + soma);
        alert.setPositiveButton("OK", null);
        alert.show();
    }


}
