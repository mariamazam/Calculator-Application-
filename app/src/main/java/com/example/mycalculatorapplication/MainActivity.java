package com.example.mycalculatorapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText textinput;
    Button Buttonequal, Buttonminus, Buttonplus, Buttonmultiply, Buttondivide, Buttonclear, Button0, Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9;
    float mvalue1;
    float mvalue2;

Boolean Addition,Multplication,Subtraction,Division;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textinput = (EditText) findViewById(R.id.textinput);
        Buttonequal = (Button) findViewById(R.id.Buttonequal);
        Buttonminus = (Button) findViewById(R.id.Buttonminus);
        Buttonplus = (Button) findViewById(R.id.Buttonplus);
        Buttonmultiply = (Button) findViewById(R.id.Buttonmultiply);
        Buttondivide = (Button) findViewById(R.id.Buttondivide);
        Buttonclear = (Button) findViewById(R.id.Buttonclear);
        Button1 = (Button) findViewById(R.id.Button1);
        Button2 = (Button) findViewById(R.id.Button2);
        Button3 = (Button) findViewById(R.id.Button3);
        Button4 = (Button) findViewById(R.id.Button4);
        Button5 = (Button) findViewById(R.id.Button5);
        Button6 = (Button) findViewById(R.id.Button6);
        Button7 = (Button) findViewById(R.id.Button7);
        Button8 = (Button) findViewById(R.id.Button8);
        Button9 = (Button) findViewById(R.id.Button9);
        Button0 = (Button) findViewById(R.id.Button0);


        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "0");
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "1");
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "2");
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "3");
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "4");
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "5");
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "6");
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "7");
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "8");
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textinput.setText(textinput.getText() + "9");
            }
        });

        Buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textinput == null) {
                    textinput.setText("");
                } else {
                    mvalue1 = Float.parseFloat(textinput.getText() + "");
                    Addition = true;
                    textinput.setText(null);
                }
            }
        });

        Buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textinput == null) {
                    textinput.setText("");
                } else {
                    mvalue1 = Float.parseFloat(textinput.getText() + "");
                    Subtraction = true;
                    textinput.setText(null);
                }
            }
        });
        Buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textinput == null) {
                    textinput.setText("");
                } else {
                    mvalue1 = Float.parseFloat(textinput.getText() + "");
                    Multplication = true;
                    textinput.setText(null);
                }
            }
        });

        Buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (textinput == null) {
                    textinput.setText("");
                } else {
                    mvalue1 = Float.parseFloat(textinput.getText() + "");
                    Division = true;
                    textinput.setText(null);
                }
            }
        });

        Buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mvalue2 = Float.parseFloat(textinput.getText() + "");


                Log.e("aa", "onClick: " + mvalue1 + "----" + mvalue2 + Addition);

                if (Addition != null) {
                    if (Addition) {
                        textinput.setText(mvalue1 + mvalue2 + "");
                        Addition = false;
                    }
                }

                if (Subtraction != null) {
                    if (Subtraction) {
                        textinput.setText(mvalue1 - mvalue2 + "");
                        Subtraction = false;
                    }
                }
                if (Multplication != null) {
                    if (Multplication) {
                        textinput.setText(mvalue1 * mvalue2 + "");
                        Multplication = false;
                    }
                }
                if (Division != null) {
                    if (Division) {
                        textinput.setText(mvalue1 / mvalue2 + "");
                        Division = false;
                    }
                }

                Buttonclear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textinput.setText("");
                    }
                });

            }
        }
            );
        }
    }