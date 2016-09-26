package com.example.astoldbyvee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public static Integer getComputerChoice() {
//Random number for the buttons
        Random rand = new Random();

        int n = rand.nextInt(8) + 1;
        if (n == 1) {
            return R.id.button;
        } else if (n == 2) {
            return R.id.button2;
        } else if (n == 3) {
            return R.id.button3;
        } else if (n == 4) {
            return R.id.button4;
        } else if (n == 5) {
            return R.id.button5;
        } else if (n == 6) {
            return R.id.button6;
        } else if (n == 7) {
            return R.id.button7;
        } else if (n == 8) {
            return R.id.button8;
        } else {
            return R.id.button;
        }
    }

    // for each time a user clicks on button, show an x, and also, and random button will how an o
    public static Integer cardFlip(Integer buttonChoice) {
        if (buttonChoice == R.id.button3) {
            return R.drawable.xx;
            if (buttonChoice == R.id.button2) {
                return R.drawable.xx;
            } else if (buttonChoice == R.id.button) {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;
                    }
                }
            } else if (buttonChoice == R.id.button4) {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;
                    }
                }
            } else if (buttonChoice == R.id.button5) {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;
                    }
                }
            } else if (buttonChoice == R.id.button6) {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;

                    }
                }
            } else if (buttonChoice == R.id.button7) {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;
                    }
                }
            } else if (buttonChoice == R.id.button8) {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;
                    }
                }
            } else {
                return R.drawable.xx;
                {
                    getComputerChoice()
                    {
                        return R.drawable.oh;
                    }
                }
            }
        }
    }
}


    public void  eval( new Random)
    {
        // Horizontal Winners

    if()


    }



