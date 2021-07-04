 package com.example.scalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView txtView1,txtView2;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,bac,bc,bb1,bb2,bsin,bcos,btan,blog,bin,bfact,bsquore,bsqrt,binv,
    bdiv,bmul,bmin,bplus,bdot,bpi,bequal;
    String pi="3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //-----<find by id>---
        setContentView(R.layout.activity_main);
        txtView1=findViewById(R.id.txtView1);
        txtView2=findViewById(R.id.txtView2);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        bac=findViewById(R.id.bac);
        bc=findViewById(R.id.bc);
        bac=findViewById(R.id.bac);
        bsin=findViewById(R.id.bsin);
        bcos=findViewById(R.id.bcos);
        btan=findViewById(R.id.btan);
        blog=findViewById(R.id.blog);
        bin=findViewById(R.id.bin);
        bplus=findViewById(R.id.bplus);
        bmin=findViewById(R.id.bmin);
        bmul=findViewById(R.id.bmul);
        bdiv=findViewById(R.id.bdiv);
        bpi=findViewById(R.id.bpi);
        bb1=findViewById(R.id.bb1);
        bb2=findViewById(R.id.bb2);
        bfact=findViewById(R.id.bfact);
        bsquore=findViewById(R.id.bsquore);
        bsqrt=findViewById(R.id.bsqrt);
        binv=findViewById(R.id.binv);
        bequal=findViewById(R.id.bequal);
        bdot=findViewById(R.id.bdot);

        //-----<Onclick >------

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"7");

            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"9");

            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"+");

            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"-");

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"×");

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"÷");

            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+".");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText("");
                txtView1.setText("");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"value not found",Toast.LENGTH_SHORT).show();
                //String val=txtView2.getText().toString();
                //val = val.substring(0,val.length() -1);
                //txtView2.setText(val);
                String val= txtView2.getText().toString();
                if(val.length()>=1){
                    val = val.substring(val.length()-1,0);
                    txtView2.setText(val);
                }else if(val.length()<=1);{
                    txtView2.setText("");
                }
            }
        });
        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=txtView2.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                txtView2.setText(String.valueOf(r));
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"(");
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+")");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView1.setText(bpi.getText());
                txtView2.setText(txtView2.getText()+pi);
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"sin");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"cos");
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"tan");
            }
        });

        binv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"^"+"(-1)");
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(txtView2.getText().toString());
                int fact=factorial(val);
                txtView2.setText(String.valueOf(fact));
                txtView1.setText(val+"!");

            }
        });
        bsquore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d=Double.parseDouble(txtView2.getText().toString());
                double square = d*d;
                txtView2.setText(String.valueOf(square));
                txtView1.setText(d+"2");
            }
        });
        bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"in");
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView2.setText(txtView2.getText()+"log");
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = txtView2.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');
                double result = eval(replacedstr);
                txtView2.setText(String.valueOf(result));
                txtView1.setText(val);
            }
        });



    }
    //factorial function
    int factorial(int n)
    {
        return (n==1||n==0)? 1:n*factorial(n-1);
    }
    //eval function
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }
}