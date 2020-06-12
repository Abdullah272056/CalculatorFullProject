package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,
            button_8,button_9, mul_button,div_button,sub_button,sum_button,dot_button,
            equal_button,clearButton,backSpaceButton,on_offButton;
    LinearLayout displayLayout;

    TextView textView;
    String firstNumberString,secondNumberString;
    String operator;
    double firstNumber,secondNumber,result;
    int dot=0;
    int enableValue;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl ();
        enable();

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

                case R.id.btnId0 :
                    if (textView.getText()=="0"){
                        textView.setText("0");
                    }
                    else {
                        textView.setText(textView.getText() + "0");
                    }

                break;

                 case R.id.btnId1 :
                     if (textView.getText()=="0"){
                         textView.setText("1");
                     }
                     else {
                         textView.setText(textView.getText() + "1");
                     }
                break;

                case R.id.btnId2 :

                    if (textView.getText()=="0"){
                        textView.setText("2");
                    }
                    else {
                        textView.setText(textView.getText()+"2");
                    }

                break;

                case R.id.btnId3 :
                    if (textView.getText()=="0"){
                        textView.setText("3");
                    }
                    else {
                        textView.setText(textView.getText()+"3");
                    }
                break;

                case R.id.btnId4 :
                    if (textView.getText()=="0"){
                        textView.setText("4");
                    }
                    else {
                        textView.setText(textView.getText()+"4");
                    }
                break;

                case R.id.btnId5 :
                    if (textView.getText()=="0"){
                        textView.setText("5");
                    }
                    else {
                        textView.setText(textView.getText()+"5");
                    }
                break;

                case R.id.btnId6 :
                    if (textView.getText()=="0"){
                        textView.setText("6");
                    }
                    else {
                        textView.setText(textView.getText()+"6");
                    }
                break;

                case R.id.btnId7 :
                    if (textView.getText()=="0"){
                        textView.setText("7");
                    }
                    else {
                        textView.setText(textView.getText()+"7");
                    }
                break;

                case R.id.btnId8 :
                    if (textView.getText()=="0"){
                        textView.setText("8");
                    }
                    else {
                        textView.setText(textView.getText()+"8");
                    }
                break;

                case R.id.btnId9 :
                    if (textView.getText()=="0"){
                        textView.setText("9");
                    }
                    else {
                        textView.setText(textView.getText()+"9");
                    }
                break;
            case R.id.dot_btnId :
//                if (textView.getText().length() > 0) {
//                    int ln=textView.getText ().length();
//                    for (int i=ln;i>=0;i--){
//
//                    }
//
//                    String text1 = textView.getText ().toString ();
//                    String str1 = text1.substring (textView.getText ().length ()-1, textView.getText ().length ());
//
//                    if (str1.equals (".")){
//                        Toast.makeText (this,". have", Toast.LENGTH_SHORT).show ();
//
//                    }
//                    else {
//                        textView.setText(textView.getText()+".");
//                    }
//
//                }
                if (dot==0){
                    textView.setText(textView.getText()+".");
                }if (dot==1){
                Toast.makeText (this, ". is already used", Toast.LENGTH_SHORT).show ();
            }
                dot=1;

                break;



                case R.id.mul_btnId :
                    operationButtonClicked ("x");

                break;

                case R.id.div_btnId :
                    operationButtonClicked ("/");
                break;

                case R.id.sum_btnId :
                    operationButtonClicked ("+");
                break;

                case R.id.sub_btnId :
                    operationButtonClicked ("-");
                break;

                case R.id.clearButtonId :
                    result=0;
                textView.setText("");
                break;
                    //BackSpace Button effect set Start
                case R.id.backSpaceButtonId :
                    //String backedNumber = null;
                    if (textView.getText().length() > 0 && textView!=null) {

                        String text=textView.getText ().toString ();
                        textView.setText (text.substring (0
                                ,textView.getText().length()-1));
                       // textView.setText (value.substring (textView.getText().length()-1,textView.getText().length()));

                        //String value= textView.getText ().toString ();
                        // StringBuilder stringBuilder = new StringBuilder(textView.getText());
                     //stringBuilder.deleteCharAt(textView.getText().length()-1);
                       // backedNumber = stringBuilder.toString();


                    }
                    else {
                        Toast.makeText(this, "TextView  field is empty", Toast.LENGTH_SHORT).show();
                    }

                      //  textView.setText(backedNumber); //set the updated text
                    //BackSpace Button effect setting end

        break;
            case R.id.equalbtnId :
                result=0;
                try {
                    firstNumber=Double.parseDouble (firstNumberString);
                    secondNumberString=textView.getText ().toString ();
                    secondNumber=Double.parseDouble (secondNumberString);
                    switch (operator){
                        case "+":
                            result=firstNumber+secondNumber;
                            break;
                        case "-":
                            result=firstNumber-secondNumber;
                            break;
                        case "/":
                            result=firstNumber/secondNumber;
                            break;
                        case "x":
                            result=firstNumber*secondNumber;
                            break;
                    }
                    textView.setText (String.valueOf(result));
                    dot=1;
                    break;
                }catch (Exception e){
                    e.printStackTrace();
                }
            case R.id.on_offButtonId:
                if (enableValue==0){
                    enable();
                }
               else if (enableValue==1){
                    disable ();
                }
               else {
                    Toast.makeText (this, "Some Error! please restart this app", Toast.LENGTH_SHORT).show ();
                }

                break;



            default : // Optional
                break;



        }

    }

    public void initControl(){
        textView=findViewById(R.id.textViewId);
        button_0=findViewById(R.id.btnId0);
        button_1=findViewById(R.id.btnId1);
        button_2=findViewById(R.id.btnId2);
        button_3=findViewById(R.id.btnId3);
        button_4=findViewById(R.id.btnId4);
        button_5=findViewById(R.id.btnId5);
        button_6=findViewById(R.id.btnId6);
        button_7=findViewById(R.id.btnId7);
        button_8=findViewById(R.id.btnId8);
        button_9=findViewById(R.id.btnId9);
        button_0=findViewById(R.id.btnId0);


        mul_button=findViewById(R.id.mul_btnId);
        div_button=findViewById(R.id.div_btnId);
        sub_button=findViewById(R.id.sub_btnId);
        sum_button=findViewById(R.id.sum_btnId);
        dot_button=findViewById(R.id.dot_btnId);
        equal_button=findViewById(R.id.equalbtnId);
        clearButton=findViewById(R.id.clearButtonId);
        backSpaceButton=findViewById(R.id.backSpaceButtonId);
        on_offButton=findViewById (R.id.on_offButtonId);
        displayLayout=findViewById (R.id.displayLayoutId);

        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);

        mul_button.setOnClickListener(this);
        div_button.setOnClickListener(this);
        sub_button.setOnClickListener(this);
        sum_button.setOnClickListener(this);
        dot_button.setOnClickListener(this);
        equal_button.setOnClickListener(this);
        clearButton.setOnClickListener(this);
        backSpaceButton.setOnClickListener(this);
        on_offButton.setOnClickListener(this);
    }
    public void disable(){
        button_0.setEnabled (false);
        button_1.setEnabled (false);
        button_2.setEnabled (false);
        button_3.setEnabled (false);
        button_4.setEnabled (false);
        button_5.setEnabled (false);
        button_6.setEnabled (false);
        button_7.setEnabled (false);
        button_8.setEnabled (false);
        button_9.setEnabled (false);
        dot_button.setEnabled (false);
        sub_button.setEnabled (false);
        sum_button.setEnabled (false);
        div_button.setEnabled (false);
        mul_button.setEnabled (false);
        equal_button.setEnabled (false);
        clearButton.setEnabled (false);
        backSpaceButton.setEnabled (false);
        textView.setEnabled (false);
        on_offButton.setText ("OFF");
        on_offButton.setTextColor (Color.rgb (255,0,0));
        

        enableValue=0;

    }
    public void enable(){
        button_0.setEnabled (true);
        button_1.setEnabled (true);
        button_2.setEnabled (true);
        button_3.setEnabled (true);
        button_4.setEnabled (true);
        button_5.setEnabled (true);
        button_6.setEnabled (true);
        button_7.setEnabled (true);
        button_8.setEnabled (true);
        button_9.setEnabled (true);
        dot_button.setEnabled (true);
        sub_button.setEnabled (true);
        sum_button.setEnabled (true);
        div_button.setEnabled (true);
        mul_button.setEnabled (true);
        equal_button.setEnabled (true);
        clearButton.setEnabled (true);
        backSpaceButton.setEnabled (true);
        textView.setEnabled (true);
        on_offButton.setText ("ON");
        on_offButton.setTextColor (Color.rgb (0,255,0));
        enableValue=1;

    }

    public void operationButtonClicked(String operator){
        firstNumberString=textView.getText ().toString ();
        textView.setText("");
        this.operator=operator;
        dot=0;


    }
}
