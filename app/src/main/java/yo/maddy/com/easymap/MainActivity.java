package yo.maddy.com.easymap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

import yo.maddy.com.maplib.Test;

public class MainActivity extends AppCompatActivity {


    ArrayList<Integer> numbers = new ArrayList<>();
    Random r = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 15; i++) {
            numbers.add(r.nextInt(7)+1);
        }


        double mean = Test.computeMeanInt(numbers);

        Log.d("devdx", "onCreate: ");



    }
}
