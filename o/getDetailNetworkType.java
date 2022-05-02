package o;

import android.content.Context;
import o.b;

public final class getDetailNetworkType implements getAdapterPosition<getSimpleNetworkType> {
    private final b.C0007b<Context> contextProvider;

    public getDetailNetworkType(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final getSimpleNetworkType get() {
        return newInstance(this.contextProvider.get());
    }

    public static getDetailNetworkType create(b.C0007b<Context> bVar) {
        return new getDetailNetworkType(bVar);
    }

    public static getSimpleNetworkType newInstance(Context context) {
        return new getSimpleNetworkType(context);
    }
}
