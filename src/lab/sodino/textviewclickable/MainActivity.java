package lab.sodino.textviewclickable;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txtLab = (TextView)findViewById(R.id.txtLab);
		ClickableSpan clickableSpan1 = new ClickableSpan() {  
            @Override  
            public void onClick(View widget) {
            	Log.d("ANDROID_LAB", "clickable span");
            }  
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {  
        	@Override  
        	public void onClick(View widget) {
        		Log.d("ANDROID_LAB", "clickable 2");
        	}  
        };
        SpannableString sp = new SpannableString("0123456789");  
        sp.setSpan(clickableSpan1, 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sp.setSpan(clickableSpan2, 5, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtLab.setText(sp);  
        txtLab.setLinkTextColor(Color.RED);  
        txtLab.setMovementMethod(LinkMovementMethod.getInstance());  
        txtLab.setFocusable(false);  
        txtLab.setClickable(false);  
        txtLab.setLongClickable(false);  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
