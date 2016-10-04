package com.example.codetribe.birthdaycard;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    String NameFrom , NameTo;
    TextView to,from,HBD;
    ImageView imgCard;
    int countClicks =1;
    Bitmap myBitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = (TextView)findViewById(R.id.txtTo);
        from = (TextView)findViewById(R.id.txtFrom);
        HBD =(TextView)findViewById(R.id.txtHBD);
        imgCard =(ImageView)findViewById(R.id.image);

            imgCard.setImageResource(R.drawable.birthday1);


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final EditText editText =new EditText(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);



        if(item.getItemId() == R.id.action_from){

            builder.setTitle("From");
            builder.setMessage("Enter your name:");
            editText.setLayoutParams(lp);
            builder.setView(editText);
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    from.setText("From :"+editText.getText().toString().toUpperCase());
                }
            });
            builder.setNegativeButton("Cancel",null);
            builder.show();


        }
        else if(item.getItemId() == R.id.action_to)
        {
            builder.setTitle("To");
            builder.setMessage("Enter your name:");
            editText.setLayoutParams(lp);
            builder.setView(editText);
            builder.setCancelable(false);
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    to.setText("To :"+editText.getText().toString().toUpperCase());

                }
            });
            builder.setNegativeButton("Cancel",null);
            builder.show();
        }
        else if (item.getItemId() == R.id.action_Next)
        {
                countClicks++;
            if(countClicks==1)
            {
                imgCard.setImageResource(R.drawable.birthday1);
            }
            else if(countClicks==2)
            {
                imgCard.setImageResource(R.drawable.birthday2);
            }
            else if(countClicks==3)
            {
                imgCard.setImageResource(R.drawable.birthday3);
            }
            else if(countClicks==4)
            {
                imgCard.setImageResource(R.drawable.birthday4);
            }
            else if(countClicks==5)
            {
                imgCard.setImageResource(R.drawable.birthday5);
            }
            else if(countClicks==6)
            {
                imgCard.setImageResource(R.drawable.birthday6);
            }
            else if(countClicks==7)
            {
                imgCard.setImageResource(R.drawable.birthday7);
            }
            else if(countClicks > 8)
            {
                countClicks = 0;
            }

        }
        else if(item.getItemId() == R.id.action_Previous)
        {
            countClicks--;
            if(countClicks==0)
            {
                imgCard.setImageResource(R.drawable.birthday1);
            }
            else if(countClicks==1)
            {
                imgCard.setImageResource(R.drawable.birthday2);
            }
            else if(countClicks==2)
            {
                imgCard.setImageResource(R.drawable.birthday3);
            }
            else if(countClicks==3)
            {
                imgCard.setImageResource(R.drawable.birthday4);
            }
            else if(countClicks==4)
            {
                imgCard.setImageResource(R.drawable.birthday5);
            }
            else if(countClicks==5)
            {
                imgCard.setImageResource(R.drawable.birthday6);
            }
            else if(countClicks==6)
            {
                imgCard.setImageResource(R.drawable.birthday7);
            }
            else if(countClicks > 7)
            {
                countClicks = 0;
            }
        }
        else  if (item.getItemId() == R.id.action_share)
        {

        }

            return super.onOptionsItemSelected(item);

    }




}
