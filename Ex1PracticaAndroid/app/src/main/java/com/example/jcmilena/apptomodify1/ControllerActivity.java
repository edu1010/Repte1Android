package com.example.jcmilena.apptomodify1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ControllerActivity extends AppCompatActivity implements EasyFragment.EasyFragmentListener {

    String fragment_number = "1";
    int fragment_color = R.color.colorFragment1;
    int fragment_container = R.id.fragment_container1;
    String fragment_tag = "Frag1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);

        Fragment fragment = new EasyFragment();


        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.fragment_container1, fragment,fragment_tag).commit();

    }


    @Override
    public void pulsado(String numero) {
        if(numero.equalsIgnoreCase("1")) {
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragmentToRemove = fm.findFragmentByTag("Frag1");
            fm.beginTransaction().remove(fragmentToRemove).commit();

            Fragment fragment2 = EasyFragment.newInstance("2", R.color.colorFragment2);
            fm.beginTransaction().replace(R.id.fragment_container2, fragment2, "Frag2").commit();
        }else{
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragmentToRemove = fm.findFragmentByTag("Frag2");
            fm.beginTransaction().remove(fragmentToRemove).commit();

            Fragment fragment = EasyFragment.newInstance("1",R.color.colorFragment1);
            fm.beginTransaction().replace(R.id.fragment_container1, fragment,"Frag1").commit();

        }

    }


}
