package com.example.admin.listview1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.admin.listview1.CustomAdapter;
import com.example.admin.listview1.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv_Contact);
        ArrayList<Contact> arrContact = new ArrayList<>();

        Contact contact1 = new Contact("Da Nang city","0236xxx", Color.RED);
        Contact contact2 = new Contact("Ha Tinh city","0239xxx", Color.GREEN);
        Contact contact3 = new Contact("Can Tho city","0292xxx", Color.GRAY);
        Contact contact4 = new Contact(" Quang Nam city","235xxx", Color.YELLOW);
        Contact contact5 = new Contact("Hai Phong city","0225xxx", Color.BLACK);
        Contact contact6 = new Contact("Quang Binh city","0232xxx", Color.BLUE);
        Contact contact7 = new Contact("Hue city","0234xxx", Color.CYAN);

        arrContact.add(contact1);
        arrContact.add(contact2);
        arrContact.add(contact3);
        arrContact.add(contact4);
        arrContact.add(contact5);
        arrContact.add(contact6);
        arrContact.add(contact7);

        CustomAdapter customAdaper = new CustomAdapter(this,R.layout.row_listview,arrContact);
        lvContact.setAdapter(customAdaper);

    }
}
