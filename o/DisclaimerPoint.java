package o;

import android.content.Context;
import o.b;

public final class DisclaimerPoint implements getAdapterPosition<BackKeyDownPoint> {
    private final b.C0007b<Context> contextProvider;

    public DisclaimerPoint(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final BackKeyDownPoint get() {
        return newInstance(this.contextProvider.get());
    }

    public static DisclaimerPoint create(b.C0007b<Context> bVar) {
        return new DisclaimerPoint(bVar);
    }

    public static BackKeyDownPoint newInstance(Context context) {
        return new BackKeyDownPoint(context);
    }
}
