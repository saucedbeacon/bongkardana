package androidx.multidex;

import android.app.Application;
import android.content.Context;
import o.addIntentOptions;

public class MultiDexApplication extends Application {
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        addIntentOptions.getMax((Context) this);
    }
}
