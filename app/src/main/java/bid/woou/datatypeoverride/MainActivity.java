package bid.woou.datatypeoverride;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void scheme(View view) {
        Intent intent = new Intent();
        //intent.setType("abc/xyz");
        intent.setData(Uri.parse("lee://www.fkjava.org:1234/test"));
        startActivity(intent);

    }
    public void schemeHostPort(View view) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("lee://www.fkjava.org:8888/test"));
        startActivity(intent);
    }
    public void schemeHostPath(View view) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("lee://www.fkjava.org:1234/mypath"));
        startActivity(intent);
    }
    public void schemeHostPortPath(View view) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("lee://www.fkjava.org:8888/mypath"));
        startActivity(intent);
    }
    public void schemeHostPortPathType(View view) {
        Intent intent = new Intent();
        intent.setDataAndType(Uri.parse("lee://www.fkjava.org:8888/mypath")
            , "abc/xyz");
        startActivity(intent);
    }
}
