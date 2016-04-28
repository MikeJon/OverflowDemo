package tongchengquwei.overflowdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by wuchu on 16/4/25.
 */
public class LoadingActivity extends ActionBarActivity {

    private byte[] bitmap;

    private TestObj obj ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_main);
        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(LoadingActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3*1000);

        obj = new TestObj(this);
        bitmap = new byte[1024*1024*10];
        TestUtil.startViewAnimation(findViewById(R.id.image),true,this,obj);

    }
}
