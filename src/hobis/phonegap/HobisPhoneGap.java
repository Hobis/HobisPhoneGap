package hobis.phonegap;

import org.apache.cordova.DroidGap;
import android.os.Bundle;

public class HobisPhoneGap extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/HB_Timer.html");
    }  
}
