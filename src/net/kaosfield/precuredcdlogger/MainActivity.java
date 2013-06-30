package net.kaosfield.precuredcdlogger;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebChromeClient;

public class MainActivity extends Activity {

  private WebView wv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    wv = (WebView) findViewById(R.id.webview);
    wv.getSettings().setJavaScriptEnabled(true);
    wv.setWebChromeClient(new WebChromeClient());
    wv.loadUrl("file:///android_asset/index.html");
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

}
