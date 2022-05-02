package o;

import java.lang.reflect.Type;
import javax.annotation.Nullable;
import o.LogContextImpl;

final class writeFile<R> implements LogContextImpl.AppendWorker<R, Object> {
    private final boolean equals;
    @Nullable
    private final hasCornerMarking getMax;
    private final boolean getMin;
    private final boolean isInside;
    private final boolean length;
    private final boolean setMax;
    private final Type setMin;
    private final boolean toFloatRange;
    private final boolean toIntRange;

    writeFile(Type type, @Nullable hasCornerMarking hascornermarking, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.setMin = type;
        this.getMax = hascornermarking;
        this.setMax = z;
        this.getMin = z2;
        this.length = z3;
        this.toFloatRange = z4;
        this.equals = z5;
        this.toIntRange = z6;
        this.isInside = z7;
    }

    public final Type getMin() {
        return this.setMin;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object setMax(o.initLater<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.setMax
            if (r0 == 0) goto L_0x000a
            o.AnalyticsLogAppender r0 = new o.AnalyticsLogAppender
            r0.<init>(r2)
            goto L_0x000f
        L_0x000a:
            o.getFile r0 = new o.getFile
            r0.<init>(r2)
        L_0x000f:
            boolean r2 = r1.getMin
            if (r2 == 0) goto L_0x001a
            o.onAppend r2 = new o.onAppend
            r2.<init>(r0)
        L_0x0018:
            r0 = r2
            goto L_0x0024
        L_0x001a:
            boolean r2 = r1.length
            if (r2 == 0) goto L_0x0024
            o.getCurrentProcessName r2 = new o.getCurrentProcessName
            r2.<init>(r0)
            goto L_0x0018
        L_0x0024:
            o.hasCornerMarking r2 = r1.getMax
            if (r2 == 0) goto L_0x002c
            o.TitleBarRightButtonView$1 r0 = r0.subscribeOn(r2)
        L_0x002c:
            boolean r2 = r1.toFloatRange
            if (r2 == 0) goto L_0x0037
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            o.setBadgeData r2 = r0.toFlowable(r2)
            return r2
        L_0x0037:
            boolean r2 = r1.equals
            if (r2 == 0) goto L_0x0040
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = r0.singleOrError()
            return r2
        L_0x0040:
            boolean r2 = r1.toIntRange
            if (r2 == 0) goto L_0x0049
            o.isCornerMarkingShow r2 = r0.singleElement()
            return r2
        L_0x0049:
            boolean r2 = r1.isInside
            if (r2 == 0) goto L_0x0052
            o.setFavoriteBtnVisibility r2 = r0.ignoreElements()
            return r2
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.writeFile.setMax(o.initLater):java.lang.Object");
    }
}
