package o;

import android.content.Context;
import o.b;

public final class decodeBitmap implements getAdapterPosition<decodeByImageDecoder> {
    private final b.C0007b<Context> setMin;

    private decodeBitmap(b.C0007b<Context> bVar) {
        this.setMin = bVar;
    }

    public static decodeBitmap getMin(b.C0007b<Context> bVar) {
        return new decodeBitmap(bVar);
    }

    public final /* synthetic */ Object get() {
        return new decodeByImageDecoder(this.setMin.get());
    }
}
