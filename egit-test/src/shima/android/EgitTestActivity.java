package shima.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EgitTestActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout linear = (LinearLayout)findViewById(R.id.linearLayout);
		TextView titleView = new TextView(this);
		titleView.setText("user-Bが６月９日２０時55分に追加修正し、GitHubにプッシュ");
		titleView.setTextSize(18);
		titleView.setTextColor(Color.GREEN);
		titleView.setBackgroundColor(Color.LTGRAY);
		titleView.setHeight(120);
		titleView.setGravity(Gravity.CENTER);
		linear.addView(titleView);
    }
}