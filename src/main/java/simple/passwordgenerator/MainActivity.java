package simple.passwordgenerator;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView mTextview;

    private String[] alphabetstring;
    private static final Random rgenerator = new Random();

    private String[] symbolstring;
    private static final Random rgenerator1 = new Random();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextview = findViewById(R.id.textView);


        Random r = new Random();
        Button simpleButton1 = findViewById(R.id.button4);
        simpleButton1.setOnClickListener(view -> {
            Resources res = getResources();
            symbolstring = res.getStringArray(R.array.symbolstring);

            alphabetstring = res.getStringArray(R.array.alphabetstring);

            final int a = (int)(Math.random()*9+1);
            final int b = (int)(Math.random()*99+1);
            final int c = (int)(Math.random()*999+1);
            final int d = (int)(Math.random()*9999+1);

            final String v = symbolstring[rgenerator1.nextInt(symbolstring.length)];
            final String w = alphabetstring[rgenerator.nextInt(alphabetstring.length)];
            final String x = alphabetstring[rgenerator.nextInt(alphabetstring.length)];
            final String y = alphabetstring[rgenerator.nextInt(alphabetstring.length)];
            final String z = alphabetstring[rgenerator.nextInt(alphabetstring.length)];

            int result = (a + b + c + d);

            String stringresult = Integer.toString(result);

            String finalresult = (v + w + x + stringresult + y + z);

            TextView output = mTextview;
            output.setText(finalresult);
        });

    }

}


