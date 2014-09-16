package controller;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;



import com.example.samaire.random.R;

/**
 * Created by samaire on 16/09/14.
 */
public class controller {

    public String setRandom() {

        java.util.Random randGen = new java.util.Random();
        int randomInt = randGen.nextInt(101);

        String a = Integer.toString(randomInt);

        return a;

    }
}
