package teamduke.collegecompanion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class login extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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


    public void Log_in(View view)
    {
        EditText username = (EditText) findViewById(R.id.editTextUserName);
        EditText password = (EditText) findViewById(R.id.editTextPassword);


        if   (username.getText().toString().equals("255051") && password.getText().toString().equals("password"))
        {

                Intent getMainActivity = new Intent(this,MainActivity.class);
                final int result = 1;
                username.setText("255051");
                getMainActivity.putExtra("MainActivity", "callingActivity");
                SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
                data.edit().putString("username", username.getText().toString()).commit();
                startActivityForResult(getMainActivity, result);



            }

        if   (username.getText().toString().equals("282889") && password.getText().toString().equals("password"))
        {

            Intent getMainActivity = new Intent(this,MainActivity.class);
            final int result = 1;
            username.setText("282889");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);



        }
        if   (username.getText().toString().equals("284133") && password.getText().toString().equals("password"))
        {

            Intent getMainActivity = new Intent(this,MainActivity.class);
            final int result = 1;
            username.setText("284133");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);



        }
        if   (username.getText().toString().equals("290776") && password.getText().toString().equals("password"))
        {

            Intent getMainActivity = new Intent(this,MainActivity.class);
            final int result = 1;
            username.setText("29077");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);



        }
        if   (username.getText().toString().equals("290959") && password.getText().toString().equals("password"))
        {

            Intent getMainActivity = new Intent(this,MainActivity.class);
            final int result = 1;
            username.setText("290959");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);



        }

            else

                {
                    Toast toast = Toast.makeText(this,"Incorrect please try again",Toast.LENGTH_SHORT);
                    toast.show();
                }
        }

    }

