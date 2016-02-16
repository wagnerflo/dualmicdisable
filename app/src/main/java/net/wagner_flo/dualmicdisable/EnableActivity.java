package net.wagner_flo.dualmicdisable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EnableActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.enable_activity);
        BootReciever.disableDuaMic(this);
        
        Button closeButton = (Button) findViewById(R.id.dismiss);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
