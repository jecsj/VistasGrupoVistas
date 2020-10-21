package com.example.vistasgrupovistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

   // CheckBox checkBox =(CheckBox) findViewById(R.id.checkbox_milk);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSwitchClicked(View view)
    {
        boolean on = ((Switch) view).isChecked();
        if(on)
        {
            //ok
        }
        else{
            //of
        }
    }
    public void onToggleButtonClicked(View view)
    {
        boolean on = ((ToggleButton) view).isChecked();
        if(on)
        {
            //ok
        }
        else{
            //of
        }
    }
/*
    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox)view).isChecked();

        switch (view.getId())
        {
            case R.id.checkbox_milk:
                if(checked) {
                    //Milky
                }
                    else
                        //black as
                break;
            case R.id.checkbox_sugar:
                if(checked) {
                    //Sweet
                }
                    else
                //keep it bitter
                break;
        }
    }

 */

}