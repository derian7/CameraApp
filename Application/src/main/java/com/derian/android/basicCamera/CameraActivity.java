

package com.derian.android.basicCamera;

import android.app.Activity;
import android.os.Bundle;

import com.facebook.FacebookSdk;

public class CameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FacebookSdk.sdkInitialize(getApplicationContext());

        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, CameraFragment.newInstance())
                    .commit();
        }
    }

}
