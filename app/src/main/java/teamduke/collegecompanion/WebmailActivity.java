package teamduke.collegecompanion;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


public class WebmailActivity extends Activity {

    private WebView mailWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mailWebView  = new WebView(this);

        mailWebView.getSettings().setJavaScriptEnabled(true); // enable javascript

        final Activity activity = this;

        mailWebView.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
            }
        });

        mailWebView .loadUrl("https://eu-fed02.federate365.com/adfs/ls/?wa=wsignin1.0&wtrealm=urn:federation:MicrosoftOnline&IACcustid=C002906&wctx=wa%3Dwsignin1%252E0%26wreply%3Dhttps%253A%252F%252Foutlook%252Eoffice365%252Ecom%252Fowa");
        setContentView(mailWebView );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_webmail, menu);
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
}
