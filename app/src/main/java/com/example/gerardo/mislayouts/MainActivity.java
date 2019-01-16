package com.example.gerardo.mislayouts;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, boton;
    TextView texto;
    int contador=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btn1);
        boton=findViewById(R.id.btncentro);
        texto=findViewById(R.id.texto);
        texto.setText(R.string.sinnombre);
        boton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                contador++;
                texto.setText(String.valueOf(contador));
            }
        });




//        btn1=findViewById(R.id.miboton);




        new CountDownTimer(100000,100)
        {
          @Override
          public void onTick(long millisUntilFinished)
          {
              Random random =new Random();
              int rand=random.nextInt(2);
              FrameLayout.LayoutParams lp=new FrameLayout.LayoutParams(-2,-2);
//              lp.gravity=Gravity.TOP;
//              btn1.setLayoutParams(lp);




              switch (rand)
              {
                  case 0: lp.gravity=Gravity.CENTER;break;
                  case 1: lp.gravity=Gravity.RIGHT;break;
              }
              btn1.setLayoutParams(lp);


          }
          @Override
            public void onFinish()
          {

          }



        }.start();



    }
}
