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
        
        
        LinearLayout linear = (LinearLayout)findViewById(R.id.linear);
 		TextView titleView = new TextView(this);
 		titleView.setText("user-A���U���X��21��15���ɒǉ��C�����A���[�J���ɃR�~�b�g");
 		titleView.setTextSize(12);
 		titleView.setTextColor(Color.BLUE);
 		titleView.setBackgroundColor(Color.LTGRAY);
 		titleView.setHeight(50);
 		titleView.setGravity(Gravity.CENTER);
 		linear.addView(titleView);
    }
}