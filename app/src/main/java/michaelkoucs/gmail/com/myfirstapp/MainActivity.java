package michaelkoucs.gmail.com.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a button by getting the id from the rev folder
        // Creating a variable that is a type of button that use findviewbyid the find the button in the rev folder
        Button addButton = (Button) findViewById(R.id.addButton);

        // assign an action when you click the button
        addButton.setOnClickListener(new View.OnClickListener() {
            // Clicking onclick event
            @Override
            public void onClick(View view) {
                // Getting the first result from the edittext
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                // Getting the second result from the edittext
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                // Getting the textview
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                // Getting the int value of firstnum
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                // Getting the int value of secondnum
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                // Hold the value of num1 + num2
                int result = num1 + num2;

                //output
                resultTextView.setText(result + "");
            }
        });


    }
}
