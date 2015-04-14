package teamduke.collegecompanion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Open_moodle(View view) {
        Intent getMoodleActivity = new Intent(this,MoodleActivity.class);

        final int result = 1;
        getMoodleActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getMoodleActivity, result);

    }

    public void open_Webmail(View view) {
        Intent getWebmailActivity = new Intent(this,WebmailActivity.class);

        final int result = 1;
        getWebmailActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getWebmailActivity, result);
    }

    public void Open_Library(View view) {
        Intent getLibraryActivity = new Intent(this,LibraryActivity.class);

        final int result = 1;
        getLibraryActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getLibraryActivity, result);
    }

    public void Open_Buildings(View view) {
        Intent getBuildingActivity = new Intent(this,BuildingActivity.class);

        final int result = 1;
        getBuildingActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getBuildingActivity, result);
    }

    public void Open_Registration(View view) {
        Intent getRegistrationActivity = new Intent(this,RegistrationActivity.class);

        final int result = 1;
        getRegistrationActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getRegistrationActivity, result);
    }

    public void Open_StudentCard(View view) {
        Intent getStudentActivity = new Intent(this,StudentCardActivity.class);

        final int result = 1;
        getStudentActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getStudentActivity, result);
    }
}
