package o;

import android.content.Context;
import o.b;
import o.registerDataSetObserver;

public final class setTabIndicatorColorResource implements getAdapterPosition<getItemPosition> {
    private final b.C0007b<UpdateAppCallback> getMax;
    private final b.C0007b<GriverRVLoggerProxyImpl> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<registerDataSetObserver.getMin> setMin;

    private setTabIndicatorColorResource(b.C0007b<registerDataSetObserver.getMin> bVar, b.C0007b<GriverRVLoggerProxyImpl> bVar2, b.C0007b<Context> bVar3, b.C0007b<UpdateAppCallback> bVar4) {
        this.setMin = bVar;
        this.length = bVar2;
        this.setMax = bVar3;
        this.getMax = bVar4;
    }

    public static setTabIndicatorColorResource getMin(b.C0007b<registerDataSetObserver.getMin> bVar, b.C0007b<GriverRVLoggerProxyImpl> bVar2, b.C0007b<Context> bVar3, b.C0007b<UpdateAppCallback> bVar4) {
        return new setTabIndicatorColorResource(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getItemPosition(this.setMin.get(), this.length.get(), this.setMax.get(), this.getMax.get());
    }
}
