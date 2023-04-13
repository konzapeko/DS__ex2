package com.example.dsex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView _textView;
    EditText _password,_login;
    Button _button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _textView = (TextView) findViewById(R.id.textView);
        _password=(EditText) findViewById(R.id.password);
        _login=(EditText) findViewById(R.id.login);
        _button =(Button) findViewById(R.id.button);
        _button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String login = _login.getText().toString();
                String password = _password.getText().toString();
                if (password.equals("123456"))
                {

                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    Bundle bundle = new Bundle();
                    intent.putExtra("_login",_login.getText().toString());
                    startActivity(intent);


                } else
                {
                    _password.setHint("mot de passe ou login incorrecte");
                }
            }
        });

    }
}