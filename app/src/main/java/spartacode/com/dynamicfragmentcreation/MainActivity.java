package spartacode.com.dynamicfragmentcreation;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.layout_container,new FragmentA()).commit();
        fragmentManager.beginTransaction().replace(R.id.layout_container,new FragmentB()).addToBackStack("FragmentB").commit();
    }
}
