package com.example.ashekhawat.loop;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    String msg = "Running Main Activity: ";
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.d(msg,"OnCreate()");
        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.ashekhawat.loop.LAUNCH",Uri.parse("http://www.example.com"));
                startActivity(i);
            }
        });
    }
    public void onClickListener(View view){
        Intent i =new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("http://www.example.com"));
        startActivity(i);
    }





//    public void broadcastIntent(View view){
//        Intent intent = new Intent();
//        intent.setAction("com.example.ashekhawat.loop.MY_CUSTOM_INTENT");
//        sendBroadcast(intent);
//   }
//
//    public void onClickAdd(View view){
//        ContentValues values = new ContentValues();
//        values.put(MyProvider.NAME, ((EditText)findViewById(R.id.editText2)).getText().toString());
//        values.put(MyProvider.GRADE, ((EditText)findViewById(R.id.editText3)).getText().toString());
//        Uri uri = getContentResolver().insert(
//                MyProvider.CONTENT_URI, values);
//       Toast.makeText(getBaseContext(), uri.toString(), Toast.LENGTH_LONG).show();
//    }
//    public void onClickRetrieve(View view){
//        String URL = "content://"+MyProvider.PROVIDER_NAME;
//        Uri uri = Uri.parse(URL);
//        Cursor c = managedQuery(uri, null, null, null, "name");
//        if(c.moveToFirst()){
//            do{
//                Toast.makeText(this,
//                        c.getString(c.getColumnIndex(MyProvider._ID))+
//                                ","+
//                                c.getString(c.getColumnIndex(MyProvider.NAME))+
//                                ","+
//                                c.getString((c.getColumnIndex(MyProvider.GRADE))),
//                        Toast.LENGTH_LONG).show();
//            }while(c.moveToNext());
//        }
//    }




//    public void startService(View view) {
//        startService(new Intent(getBaseContext(), MyService.class));
//    }
//
//    public void stopService(View view){
//        stopService(new Intent(getBaseContext(), MyService.class));
//    }
}
