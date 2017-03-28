package a67yjh00.com.example.lg.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/{
    EditText edit1, edit2;
    Button but1, but2, but3, but4;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.edit_first);
        edit2 = (EditText)findViewById(R.id.edit_second);
        but1 = (Button)findViewById(R.id.but_plus);
        but2 = (Button)findViewById(R.id.but_minus);
        but3 = (Button)findViewById(R.id.but_multiply);
        but4 = (Button)findViewById(R.id.but_division);
        textview=(TextView)findViewById(R.id.text_view);

        but1.setOnClickListener(butHandler);
        but2.setOnClickListener(butHandler);
        but3.setOnClickListener(butHandler);
        but4.setOnClickListener(butHandler);//setOnClickListener를 안 쓰면 아무리 눌러도 버튼이 작동안함.
        //이벤트가 발생되었을 때 감시자(OnClickListener), 처리자(감시자 상속받은거)가 있다.
        /*
        but1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
               int num1=Integer.parseInt(edit1.getText().toString());
               int num2=Integer.parseInt(edit2.getText().toString());
               textview.setText(num1+num2+"");
           }
        });
        but2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1=Integer.parseInt(edit1.getText().toString());
                int num2=Integer.parseInt(edit2.getText().toString());
                textview.setText(num1-num2+"");
            }
        });
        but3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1=Integer.parseInt(edit1.getText().toString());
                int num2=Integer.parseInt(edit2.getText().toString());
                textview.setText(num1*num2+"");
            }
        });
        but4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int num1=Integer.parseInt(edit1.getText().toString());
                int num2=Integer.parseInt(edit2.getText().toString());
                textview.setText(num1/num2+"");
            }
        });*/
    }//end oncreate
    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1=Integer.parseInt(edit1.getText().toString());
            int num2=Integer.parseInt(edit2.getText().toString());
            int result=0;

            switch(view.getId()){
                case R.id.but_plus:
                    result=num1+num2;
                    break;
                case R.id.but_minus:
                    result=num1-num2;
                    break;
                case R.id.but_multiply:
                    result=num1*num2;
                    break;
                case R.id.but_division:
                    result=num1/num2;
                    break;
            }
            textview.setText(result+"");
        }
    };
    /*
    @Override
    public void onClick(View view) {
        int num1=Integer.parseInt(edit1.getText().toString());
        int num2=Integer.parseInt(edit2.getText().toString());
        int result=0;

        switch(view.getId()){
            case R.id.but_plus:
                result=num1+num2;
                break;
            case R.id.but_minus:
                result=num1-num2;
                break;
            case R.id.but_multiply:
                result=num1*num2;
                break;
            case R.id.but_division:
                result=num1/num2;
                break;
        }
        textview.setText(result+"");
    }*/
}
