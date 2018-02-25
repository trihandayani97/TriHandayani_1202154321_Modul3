package com.example.trihandayani.trihandayani_1202154321_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends Activity {

    //create EditText instances
    EditText username;
    EditText password;
    //create string varables containing username & password used for static login
    String user_name = "EAD";
    String pass = "MOBILE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //get the view
        username = (EditText) findViewById(R.id.editText_username);
        password = (EditText) findViewById(R.id.editText_password);
    }

    //button onClick event method for log in
    public void toItemList(View view) {

        //get the text from the editText
        String uname = username.getText().toString();
        String passw = password.getText().toString();



        //conditions for log in
        if( uname.equals(user_name)&& passw.equals(pass) ){
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
            //create Intent instance
            Intent toItemList = new Intent(this, ItemList.class);
            startActivity(toItemList);
        } else if( uname.equals(user_name) && !(passw.equals(pass)) ){
            Toast.makeText(this, "Incorrect Password!", Toast.LENGTH_SHORT).show();
        } else if( !(uname.equals(user_name)) && passw.equals(pass)){
            Toast.makeText(this,"Incorrect Username!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Username & Password!", Toast.LENGTH_SHORT).show();
        }


    }


}
