package o;

import android.content.Context;
import com.google.firebase.inject.Provider;

public final class removeViewsInLayout implements Provider {
    private final Context setMax;

    public removeViewsInLayout(Context context) {
        this.setMax = context;
    }

    public final Object get() {
        return HeartBeatInfoStorage.getInstance(this.setMax);
    }
}
