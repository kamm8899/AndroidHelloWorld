package edu.stevens.cs522.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSubmit;
    EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = (Button) findViewById(R.id.button);
        edtName = (EditText) findViewById(R.id.textbox);


        btnSubmit.setOnClickListener(this);


        //--An alternative method is to just create an onClick inline like this
        /*

         btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

         */

    }

    @Override
    public void onClick(View view) {
        //Grab the text from the Edit Text box and pass it to another page (activity)

        //what would I replace this if I did the non alternative method
       Intent intent = new Intent(this, ShowActivity.class);
       String text = edtName.getText().toString();
       intent.putExtra(ShowActivity.MESSAGE_KEY, text);
        startActivity(intent);


    }
    }
