package bid.woou.datatypeoverride;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SchemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("仅指定Scheme匹配的Activity");
        tv.setTextSize(30);
        setContentView(tv);
    }
}
