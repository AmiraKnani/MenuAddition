package com.example.menuadd;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    CheckBox pizza;
    CheckBox hamburger;
    CheckBox BoissonG;
    Button Addition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza= (CheckBox) findViewById(R.id.checkBoxP);
        hamburger= (CheckBox) findViewById(R.id.checkBoxH);
        BoissonG= (CheckBox) findViewById(R.id.checkBoxBG);
        Addition=(Button)findViewById(R.id.btAdd);
        Addition.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int somme=0;
                String message=new String();
                message=message.concat("Articles choisis: ");
                if(pizza.isChecked())
                {   somme+=9000;
                    message=message.concat(" Pizza ") ;}
                if(hamburger.isChecked())
                {   somme+=6000;
                    message=message.concat(" Hamburger " );}
                if(BoissonG.isChecked())
                {   somme+=2000;
                    message=message.concat(" Boisson Gazeuse ") ;}

                message=message.concat("total= "+ somme);


                    AlertDialog.Builder alertDialog;
                    alertDialog= new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle("ADDITION RESTAURANT");
                    alertDialog.setMessage(message);
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    alertDialog.show();

            }
        });

        }

    }
