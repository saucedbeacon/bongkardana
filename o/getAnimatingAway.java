package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;

public final class getAnimatingAway implements Provider {
    private final FirebaseApp length;
    private final Context setMax;

    public getAnimatingAway(FirebaseApp firebaseApp, Context context) {
        this.length = firebaseApp;
        this.setMax = context;
    }

    public final Object get() {
        return this.length.lambda$new$0(this.setMax);
    }
}
