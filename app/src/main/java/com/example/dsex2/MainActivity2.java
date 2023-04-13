package com.example.dsex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button _button2,_button3;
    EditText _editTextPhone,_editTextTextPersonName,_editTextTextPersonName2,_editTextPhone2,_login;
    TextView _txtlogin,_textView4,_textView6;
    public void call_action()
    {
        String phonum =_editTextPhone.getText().toString();
        Intent callIntent =new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse(phonum));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();
            _txtlogin.setText(extras.getString("_login"));
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        Float.parseFloat(_editTextPhone.getText().toString());
        String simOperatorName = telephonyManager.getSimOperatorName();
        if (simOperatorName=="orange")
        {
            _textView4.setText("votre ligne est orange");
            _textView4.setTextColor(getColor(android.R.color.holo_orange_dark));
            _textView6.setText("entre votre code de recharge(14 chiffres)");
            _editTextTextPersonName2.setBackgroundColor(getColor(android.R.color.holo_orange_light));
        }
        else if (simOperatorName=="Ooredoo")
            {
            _textView4.setText("votre ligne est Ooredoo");
            _textView4.setTextColor(getColor(android.R.color.holo_red_dark));
            _textView6.setText("entre votre code de recharge(14 chiffres)");
            _editTextTextPersonName2.setBackgroundColor(getColor(android.R.color.holo_red_light));
            }
        else if(simOperatorName=="Tunisie Telecome")
        {
            _textView4.setText("votre ligne est Tunisie Telecome");
            _textView4.setTextColor(getColor(android.R.color.holo_blue_dark));
            _textView6.setText("entre votre code de recharge(13 chiffres)");
            _editTextTextPersonName2.setBackgroundColor(getColor(android.R.color.holo_blue_light));

        }
        _button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call_action();
            }
        });
        _button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                call_action();
            }
        });
    }
}
