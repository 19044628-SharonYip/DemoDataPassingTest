package sg.edu.rp.c346.id19044628.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAns=findViewById(R.id.textView3);

        Intent intentReceieved=getIntent();
        double doub=intentReceieved.getDoubleExtra("doub",0);
        tvAns.setText("Double value received is: "+doub);
    }
}