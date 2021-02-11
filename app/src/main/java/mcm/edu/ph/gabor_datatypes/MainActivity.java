package mcm.edu.ph.gabor_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstname = "Annie Shannel";
        char middleInitial ='R';
        String lastname = "Gabor";
        int myAge = 18;
        float myDreamTVLGrade = 95;
        double myMoney = 999.99;


        //Sting.valueOf(myMoney);
        display.setText("My name is "+firstname+ " "
                +String.valueOf(middleInitial)+ " "
                +lastname+ "\nand my age is "
                +myAge+ ".\nI want my grade in TVL to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;





    }
}