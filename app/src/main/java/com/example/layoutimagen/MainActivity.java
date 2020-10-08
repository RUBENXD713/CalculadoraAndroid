package com.example.layoutimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     String cadena="";
     double resultado=0;
     boolean suma=false;
    boolean resta=false;
    boolean multiplicación=false;
    boolean division=false;
    boolean porcentaje=false;
    TextView Txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.Txt1=findViewById(R.id.Text1);
    }
public void concatenar(View view) {
    switch (view.getId())
    {
        case R.id.btn1:
            cadena = cadena+"1";
            Txt1.setText(cadena);
            break;
        case R.id.btn2:
            cadena = cadena+"2";
            Txt1.setText(cadena);
            break;
        case R.id.btn3:
            cadena = cadena+"3";
            Txt1.setText(cadena);
            break;
        case R.id.btn4:
            cadena = cadena+"4";
            Txt1.setText(cadena);
            break;
        case R.id.btn5:
            cadena = cadena+"5";
            Txt1.setText(cadena);
            break;
        case R.id.btn6:
            cadena = cadena+"6";
            Txt1.setText(cadena);
            break;
        case R.id.btn7:
            cadena = cadena+"7";
            Txt1.setText(cadena);
            break;
        case R.id.btn8:
            cadena = cadena+"8";
            Txt1.setText(cadena);
            break;
        case R.id.btn9:
            cadena = cadena+"9";
            Txt1.setText(cadena);
            break;
        case R.id.btn0:
            if (cadena!="")
            {
                cadena = cadena+"0";
                Txt1.setText(cadena);
            }
            else {Txt1.setText("0");}
            break;
        case R.id.btnDot:
            if (cadena=="")
            {
                cadena = cadena+"0.";
                Txt1.setText(cadena);
            }
            else
            {
                cadena = cadena+".";
                Txt1.setText(cadena);
            }
            break;
        default:
            break;
    }
//en un switch
}
public void porcentaje(View view){
    if(cadena!="") {
        if(resultado==0){
            this.resultado= Double.parseDouble(cadena);
        }else {
            this.resultado = resultado * (Double.parseDouble(cadena)*0.01);
        }
    }
    porcentaje=true;
    suma = false;
    resta = false;
    multiplicación = false;
    division = false;
    cadena = "";
    Txt1.setText("0");
}
    public void sumar(View view)
    {
    if(cadena!="") {
        this.resultado =resultado+Double.parseDouble(cadena);
    }
    porcentaje=false;
    suma = true;
    resta = false;
    multiplicación = false;
    division = false;
    cadena = "";
    Txt1.setText("0");
    }
    public void restar(View view) {
        if(cadena!="") {
            if(resultado==0){
             this.resultado= Double.parseDouble(cadena);
            }else {
                this.resultado = resultado - Double.parseDouble(cadena);
            }
        }
        porcentaje=false;
        suma = false;
        resta = true;
        multiplicación = false;
        division = false;
        cadena = "";
        Txt1.setText("0");
    }
    public void multiplicar(View view) {
        if(resultado==0){
            this.resultado= Double.parseDouble(cadena);
        }else {
            this.resultado = resultado * Double.parseDouble(cadena);
        }
        porcentaje=false;
        suma = false;
        resta = false;
        multiplicación = true;
        division = false;
        cadena = "";
        Txt1.setText("0");
    }
    public void dividir(View view) {
        if(resultado==0){
            this.resultado= Double.parseDouble(cadena);
        }else {
            try {
                this.resultado = resultado / Double.parseDouble(cadena);
            }catch (Exception e){
                Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
            }

        }
        porcentaje=false;
        suma = false;
        resta = false;
        multiplicación = false;
        division = true;
        cadena = "";
        Txt1.setText("0");
    }

    public void Igual(View view){
        if (suma==true)
        {
            this.resultado =resultado+Double.parseDouble(cadena);
            Txt1.setText(String.valueOf(resultado));
        }
        else if (resta==true)
        {
            this.resultado =resultado-Double.parseDouble(cadena);
            Txt1.setText(String.valueOf(resultado));
        }
        else if (multiplicación==true)
        {
            this.resultado =resultado*Double.parseDouble(cadena);
            Txt1.setText(String.valueOf(resultado));
        }
        else
            {

              if (division==true)
              {
                  try {
                      this.resultado = resultado / Double.parseDouble(cadena);
                      Txt1.setText(String.valueOf(resultado));
                  }catch (Exception e){
                      Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
                      Txt1.setText("Syntax ERROR");
                  }
              }else {
                  this.resultado = resultado * (Double.parseDouble(cadena)*0.01);
                  Txt1.setText(String.valueOf(resultado));
              }
            }

    }

    public void clear(View view)
    {
        cadena="";
        resultado=0;
        suma=false;
        resta=false;
        multiplicación=false;
        division=false;
        Txt1.setText("0");
    }


    }
    //public void Valor(View view){
    //b = (Text1) view;
    //  if (b.equals("0"))
    //{

    //}
    //}

    //   public void miclick(View view)
    // {
    //   switch (view.getId()){
    //     case R.id.btn1:
    //       Button b=(Button) view;

    //     TextView tt=(TextView) findViewById(R.id.lbl1);
    //   tt.setText("Holaaa....");

    //break;
    //case R.id.btn2:
    //  Button b2=(Button) view;
    //Toast.makeText(this,"a", Toast.LENGTH_SHORT).show();//Mensaje en forma de burbuja
    // break;
    //case R.id.lbl1:
    //  TextView t1=(TextView) view;//Transformar en..
    //Toast.makeText(this,"a", Toast.LENGTH_SHORT).show();

    //break;
    // default:
    //   break;
    //}
    //}

