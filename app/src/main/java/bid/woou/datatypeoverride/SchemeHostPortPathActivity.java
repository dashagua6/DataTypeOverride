package bid.woou.datatypeoverride;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by cc on 2016/10/15.
 */
public class SchemeHostPortPathActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("指定Scheme、Host、Port、Path匹配的Activity");
        tv.setTextSize(30);
        setContentView(tv);
    }
}
