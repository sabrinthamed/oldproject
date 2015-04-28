package unt.infiniteblackboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends ActionBarActivity {

    private static TextView txtLink1;
    public static final int TOTAL_QUESTION = 6;
    public static final String PREF_QUESTIONS_CORRECT = "pref_questions_correct";
    private ListView mainListView ;
    private ArrayAdapter<String> listAdapter ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the ListView resource.
        mainListView = (ListView) findViewById( R.id.mainListView );
        String[] sections = getResources().getStringArray(R.array.sections);
        ArrayList<String> sectionList = new ArrayList<String>();
        sectionList.addAll( Arrays.asList(sections) );
        // Create ArrayAdapter
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, sectionList);
        mainListView.setAdapter( listAdapter );



        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id)
            {

                switch(position)
                {
                    case 0:
                    Intent intent = new Intent(MainActivity.this, ConstantVelocityActivity.class);
                    startActivity(intent);
                    break;

                    case 1:
                        intent = new Intent(MainActivity.this, ConstantVelocityQAActivity.class);
                        startActivity(intent);
                        break;

<<<<<<< HEAD
                    case 6:
                         intent = new Intent(MainActivity.this, AccelerationActivity.class);
=======
/*                    case 2:
                        intent = new Intent(MainActivity.this, AverageVelocityActivity.class);
                        startActivity(intent);
                        break;

                    case 3:
                        intent = new Intent(MainActivity.this, AverageVelocityQAActivity.class);
                        startActivity(intent);
                        break;
*/
                    case 4:
                        intent = new Intent(MainActivity.this, SpeedActivity.class);
                        startActivity(intent);
                        break;

                    case 5:
                        intent = new Intent(MainActivity.this, SpeedQAActivity.class);
                        startActivity(intent);
                        break;

                    case 6:
                        intent = new Intent(MainActivity.this, AccelerationActivity.class);
>>>>>>> c893bd775030faf9fc84ded0102a29439ba0895d
                        startActivity(intent);
                        break;

                    case 7:
                        intent = new Intent(MainActivity.this, AccelerationQAActivity.class);
                        startActivity(intent);
                        break;

<<<<<<< HEAD
=======
                    case 8:
                        intent = new Intent(MainActivity.this, OneDMotionActivity.class);
                        startActivity(intent);
                        break;

                    case 9:
                        intent = new Intent(MainActivity.this, OneDMotionQAActivity.class);
                        startActivity(intent);
                        break;

                    case 10:
                        intent = new Intent(MainActivity.this, TwoDMotionActivity.class);
                        startActivity(intent);
                        break;

                    case 11:
                        intent = new Intent(MainActivity.this, TwoDMotionQAActivity.class);
                        startActivity(intent);
                        break;
>>>>>>> c893bd775030faf9fc84ded0102a29439ba0895d
                }

            }
        });



        ScoreKeeper.clearScore(this);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //    return true;
        //}

        //return super.onOptionsItemSelected(item);

        Toast.makeText(getApplicationContext(), item.getTitle() + " selected", Toast.LENGTH_SHORT).show();

/*        switch (item.getItemId()) {
            case R.id.displacement_menu:
                Intent myIntent = new Intent(MainActivity.this,
                        ConstantVelocityActivity.class);
                startActivity(myIntent);
                break;
            case R.id.speed_menu:
                Intent myIntent1 = new Intent(MainActivity.this,
                        SpeedActivity.class);
                startActivity(myIntent1);
                break;

            case R.id.velocity_menu:
                Intent myIntent2 = new Intent(MainActivity.this,
                        VelocityActivity.class);
                startActivity(myIntent2);
                break;

            case R.id.acceleration_menu:
                Intent myIntent3 = new Intent(MainActivity.this,
                        AccelerationActivity.class);
                startActivity(myIntent3);
                break;

            case R.id.oneD_Motion_menu:
                Intent myIntent4 = new Intent(MainActivity.this,
                        OneDMotionActivity.class);
                startActivity(myIntent4);
                break;

            case R.id.twoD_Motion_menu:
                Intent myIntent5 = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent5);
                break;

            case R.id.formulas_menu:
                Intent myIntent6 = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent6);
                break;

            case R.id.review_menu:
                Intent myIntent7 = new Intent(MainActivity.this,
                        TwoDMotionActivity.class);
                startActivity(myIntent7);
                break;


*/       //}
        //return true;

    return true;
    }
}