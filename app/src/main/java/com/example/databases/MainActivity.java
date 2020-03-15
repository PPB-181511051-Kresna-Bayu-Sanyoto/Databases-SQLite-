package com.example.databases;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBAdapter db = new DBAdapter(this);

//        db.open();
//        long id = db.insertContact("Jennifer Ann", "jenniferann@gmail.com");
//        id = db.insertContact("Oscar Diggs", "oscar@kim.com");
//        db.close();
        //--Displayall
//        db.open();
//        Cursor c = db.getAllContacts();
//        if (c.moveToFirst()){
//            do{
//                DisplayContact(c);
//            }while (c.moveToNext());
//        }
//        db.close();
        //--Display 1
//        db.open();
//        Cursor c = db.getContact(2);
//        if (c.moveToFirst()){
//            DisplayContact(c);
//        }else{
//            Toast.makeText(this,"No contact found",Toast.LENGTH_LONG).show();
//        }
//        db.close();
//        //--Update data
//        db.open();
//        if (db.updateContact(1,"Rhio kepet", "rhio@kepet.com"))Toast.makeText(this,"Update successfull.",Toast.LENGTH_LONG).show();
//        else Toast.makeText(this,"Update failed.",Toast.LENGTH_LONG).show();
//        db.close();
        //---delete a contact---
        db.open();
        if (db.deleteContact(2))
            Toast.makeText(this, "Delete successful.",
                    Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Delete failed.", Toast.LENGTH_LONG).show();
        db.close();

    }

    private void DisplayContact(Cursor c) {
        Toast.makeText(this,"id: "+c.getString(0)+"\n"+"Name; "+ c.getString(1)+"\n"+
                "Email: " + c.getString(2),Toast.LENGTH_LONG).show();
    }
}
