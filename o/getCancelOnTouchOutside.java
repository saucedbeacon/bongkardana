package o;

import android.content.Context;
import o.b;

public final class getCancelOnTouchOutside implements getAdapterPosition<getCancelable> {
    private final b.C0007b<Context> contextProvider;

    public getCancelOnTouchOutside(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final getCancelable get() {
        return newInstance(this.contextProvider.get());
    }

    public static getCancelOnTouchOutside create(b.C0007b<Context> bVar) {
        return new getCancelOnTouchOutside(bVar);
    }

    public static getCancelable newInstance(Context context) {
        return new getCancelable(context);
    }
}
