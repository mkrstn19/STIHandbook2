package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GradeCalculator extends AppCompatActivity {
    EditText prelimEditText, midtermEditText, prefinalsEditText, finalEditText;
    Button clearButton, calculateButton;
    TextView averageTextView, gwaTextView, grTextView;
    Double prelimDouble, midtermDouble, prefinalsDouble, finalDouble, averageDouble;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_calculator);

        //EditText
        prelimEditText = findViewById(R.id.prelimEditText);
        midtermEditText = findViewById(R.id.midtermEditText);
        prefinalsEditText = findViewById(R.id.prefinalsEditText);
        finalEditText = findViewById(R.id.finalEditText);

        //Buttons

        clearButton = findViewById(R.id.clearButton);
        calculateButton = findViewById(R.id.calculateButton);

        //TextView
        averageTextView = findViewById(R.id.averageTextView);
        gwaTextView = findViewById(R.id.gwaTextView);
        grTextView = findViewById(R.id.grTextView);


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                prelimDouble = Double.parseDouble(prelimEditText.getText().toString());
                midtermDouble = Double.parseDouble(midtermEditText.getText().toString());
                prefinalsDouble = Double.parseDouble(prefinalsEditText.getText().toString());
                finalDouble = Double.parseDouble(finalEditText.getText().toString());

                //compute average
                averageDouble = (prelimDouble *.20 + midtermDouble *.20 + prefinalsDouble *.20 + finalDouble *.40);

                averageTextView.setText((String.format("%.2f", averageDouble)));

                if (averageDouble >=97.50)  {
                    gwaTextView.setText("1.00");
                    grTextView.setText("Excellent");
                    }

                else if (averageDouble >=94.50) {
                    gwaTextView.setText("1.25");
                    grTextView.setText("Very Good");

                    }

                else if (averageDouble >=91.50) {
                    gwaTextView.setText("1.50");
                    grTextView.setText("Very Good");
                    }

                else if (averageDouble >=88.50) {
                    gwaTextView.setText("1.75");
                    grTextView.setText("Very Good");

                     }

                else if (averageDouble >=85.50)
                    {
                        gwaTextView.setText("2.00");
                    grTextView.setText("Satisfactory");
                    }

                else if (averageDouble >=82.50)
                    {
                        gwaTextView.setText("2.25");
                    grTextView.setText("Satisfactory");
                    }

                else if (averageDouble >=79.50) {
                    gwaTextView.setText("2.75");
                    grTextView.setText("Satisfactory");
                     }

                else if (averageDouble >=76.50) {
                    gwaTextView.setText("3.00");
                    grTextView.setText("Fair");
                    }

                else if (averageDouble >= 74.50) {
                    gwaTextView.setText("3:00");
                    grTextView.setText("Fair");
                    }
                else
                {
                    gwaTextView.setText("5.00");
                    grTextView.setText("Failed");
                }


                     clearButton.setOnClickListener(new View.OnClickListener() {
                     @Override
                    public void onClick(View v) {

                        prelimEditText.getText().clear();
                        midtermEditText.getText().clear();
                        prefinalsEditText.getText().clear();
                        finalEditText.getText().clear();
                        grTextView.setText("Remarks");

                     }


                        });
            }



});




            }

}