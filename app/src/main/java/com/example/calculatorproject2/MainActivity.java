//Aayush Srivastava Calculator Project
        package com.example.calculatorproject2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import java.util.ArrayList;
        import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {
    Button b0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button oA;
    Button oS;
    Button oM;
    Button oD;
    Button oC;
    Button es;
    TextView dc;
    String output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.Num0);
        b1 = findViewById(R.id.Num1);
        b2 = findViewById(R.id.Num2);
        b3 = findViewById(R.id.Num3);
        b4 = findViewById(R.id.Num4);
        b5 = findViewById(R.id.Num5);
        b6 = findViewById(R.id.Num6);
        b7 = findViewById(R.id.Num7);
        b8 = findViewById(R.id.Num8);
        b9 = findViewById(R.id.Num9);
        oA = findViewById(R.id.Addition);
        oS = findViewById(R.id.Subtraction);
        oM = findViewById(R.id.Multiplication);
        oD = findViewById(R.id.Division);
        oC = findViewById(R.id.Clear);
        es = findViewById(R.id.EqualsSign);
        dc = findViewById(R.id.DisplayCalcs);
        output = "";
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "0";
                dc.append("0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "1";
                dc.append("1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "2";
                dc.append("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "3";
                dc.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "4";
                dc.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "5";
                dc.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "6";
                dc.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "7";
                dc.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "8";
                dc.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += "9";
                dc.append("9");
            }
        });
        oA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += " + ";
                dc.append("+");
            }
        });
        oS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += " - ";
                dc.append("-");
            }
        });
        oM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += " * ";
                dc.append("*");
            }
        });
        oD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output += " / ";
                dc.append("/");
            }
        });
        oC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output = "";
                dc.setText("");
            }
        });
        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = "";
                ArrayList<String> a = new ArrayList<String>();
                StringTokenizer h = new StringTokenizer(output, " ");
                while (h.hasMoreElements()) {
                    a.add((String) h.nextElement());
                }
                if (output.length() > 1) {
                    if ((validity(output) == true) && (validity2(output) == true) && (validity3(output) == false)) {
                        double x;
                        double y;
                        double z;
                        for (int i = 0; i < a.size(); i++) {
                            if ((a.get(i).equals("*")) || (a.get(i).equals("/"))) {
                                if (a.get(i).equals("*")) {
                                    x = Double.valueOf(a.get(i - 1));
                                    y = Double.valueOf(a.get(i + 1));
                                    z = x * y;
                                    t = Double.toString(z);
                                    a.set(i - 1, t);
                                    a.remove(i);
                                    a.remove(i);
                                    i = i - 1;
                                } else if (a.get(i).equals("/")) {
                                    x = Double.valueOf(a.get(i - 1));
                                    y = Double.valueOf(a.get(i + 1));
                                    z = x / y;
                                    t = Double.toString(z);
                                    a.set(i - 1, t);
                                    a.remove(i);
                                    a.remove(i);
                                    i = i - 1;
                                }
                            }
                        }
                        for (int i = 0; i < a.size(); i++) {
                            if ((a.get(i).equals("+")) || (a.get(i).equals("-"))) {
                                if (a.get(i).equals("+")) {
                                    x = Double.valueOf(a.get(i - 1));
                                    y = Double.valueOf(a.get(i + 1));
                                    z = x + y;
                                    t = Double.toString(z);
                                    a.set(i - 1, t);
                                    a.remove(i);
                                    a.remove(i);
                                    i = i - 1;
                                } else if (a.get(i).equals("-")) {
                                    x = Double.valueOf(a.get(i - 1));
                                    y = Double.valueOf(a.get(i + 1));
                                    z = x - y;
                                    t = Double.toString(z);
                                    a.set(i - 1, t);
                                    a.remove(i);
                                    a.remove(i);
                                    i = i - 1;
                                }
                            }
                        }
                        output = a.get(0);
                        dc.setText(a.get(0));
                    }
                    if ((validity(output) == false) || (validity2(output) == false) || (validity3(output) == true)) {
                        output = "";
                        dc.setText("An error has occurred! Clear and Try again.");
                    }
                } else {
                    dc.setText(" ");
                }
            }
        });
    }

    public static boolean validity(String u) {
        String k = "";
        ArrayList<String> a = new ArrayList<String>();
        StringTokenizer q = new StringTokenizer(u, " ");
        while (q.hasMoreElements()) {
            a.add((String) q.nextElement());
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("+") || a.get(i).equals("-") || a.get(i).equals("*") || a.get(i).equals("/")) {
                if (a.get(i + 1).equals("+") || a.get(i + 1).equals("-") || a.get(i + 1).equals("*") || a.get(i + 1).equals("/")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validity2(String u) {
        ArrayList<String> a = new ArrayList<String>();
        StringTokenizer q = new StringTokenizer(u, " ");
        while (q.hasMoreElements()) {
            a.add((String) q.nextElement());
        }
        int c = a.size();
        boolean z = true;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals("+") || a.get(i).equals("-") || a.get(i).equals("*") || a.get(i).equals("/")) {
                if (i < c) {
                    if ((a.get(i + 1).equals("1")) || (a.get(i + 1).equals("2")) || (a.get(i + 1).equals("3")) || (a.get(i + 1).equals("4")) || (a.get(i + 1).equals("5")) || (a.get(i + 1).equals("6")) || (a.get(i + 1).equals("7")) || (a.get(i + 1).equals("8")) || (a.get(i + 1).equals("9"))) {
                        if (i > 0) {
                            if ((a.get(i - 1).equals("1")) || (a.get(i - 1).equals("2")) || (a.get(i - 1).equals("3")) || (a.get(i - 1).equals("4")) || (a.get(i - 1).equals("5")) || (a.get(i - 1).equals("6")) || (a.get(i - 1).equals("7")) || (a.get(i - 1).equals("8")) || (a.get(i - 1).equals("9"))) {
                                return true;
                            }
                        } else {
                            z = false;
                            break;

                        }
                    }
                } else {
                    z = false;
                    break;
                }

            }
        }
        return z;
    }

    public static boolean validity3(String u) {
        String output = " + ";
        boolean z = true;
        ArrayList<String> a = new ArrayList<String>();
        StringTokenizer q = new StringTokenizer(output, " ");
        while (q.hasMoreElements()) {
            a.add((String) q.nextElement());
        }
        int g = a.size();
        if (g == 1) {
            if (a.get(0).equals("+") || a.get(0).equals("-") || a.get(0).equals("*") || a.get(0).equals("/"))
                return false;
        }
        return z;
    }
}
