package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,multiply,divide,delete,isequal,dot;
    TextView number;
    float value1;
    float value2;
    boolean addition, substract, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        delete=(Button)findViewById(R.id.delete);
        dot=(Button)findViewById(R.id.dot);
        isequal=(Button)findViewById(R.id.isequal);
        number=(TextView)findViewById(R.id.text);



        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText(number.getText()+"9");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (number == null) {
                    number.setText("");
                } else {

                    value1=Float.parseFloat(number.getText()+"");
                   addition = true;
                    number.setText(null);
                }
            }
        });

        sub.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null)
                {
                    number.setText("");
                }
                else
                {
                    value1=Float.parseFloat(number.getText()+"");
                    substract= true;
                    number.setText(null);
                }
            }
        }));
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null)
                {
                    number.setText("");
                }
                else
                {
                    value1=Float.parseFloat(number.getText()+"");
                    multiplication= true;
                    number.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number==null)
                {
                    number.setText("");
                }
                else
                {
                    value1=Float.parseFloat(number.getText()+"");
                    division= true;
                    number.setText(null);
                }
            }
        });



        isequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(number.getText() + "");

                if (addition == true) {
                    number.setText(value1 + value2 + "");
                    addition = false;
                }

                if (substract == true) {
                    number.setText(value1-value2 + "");
                    substract = false;
                }

                if (multiplication == true) {
                    number.setText(value1*value2 + "");
                    multiplication = false;
                }

                if (division == true) {
                    number.setText(value1/value2 + "");
                    division = false;
                }
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText("");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(number.getText() + ".");
            }
        });



    }
}
