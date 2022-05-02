package o;

import android.content.Context;
import o.b;
import o.endTransaction;

public final class lambda$endTransaction$1 implements getAdapterPosition<internalInitInvalidationTracker> {
    private final b.C0007b<setCacheMode> IsOverlapping;
    private final b.C0007b<PermissionUtils> equals;
    private final b.C0007b<classExist> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<getFieldValue> length;
    private final b.C0007b<endTransaction.length> setMax;
    private final b.C0007b<calculateDistance> setMin;

    private lambda$endTransaction$1(b.C0007b<Context> bVar, b.C0007b<endTransaction.length> bVar2, b.C0007b<classExist> bVar3, b.C0007b<getFieldValue> bVar4, b.C0007b<calculateDistance> bVar5, b.C0007b<PermissionUtils> bVar6, b.C0007b<setCacheMode> bVar7) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
        this.setMin = bVar5;
        this.equals = bVar6;
        this.IsOverlapping = bVar7;
    }

    public static lambda$endTransaction$1 getMax(b.C0007b<Context> bVar, b.C0007b<endTransaction.length> bVar2, b.C0007b<classExist> bVar3, b.C0007b<getFieldValue> bVar4, b.C0007b<calculateDistance> bVar5, b.C0007b<PermissionUtils> bVar6, b.C0007b<setCacheMode> bVar7) {
        return new lambda$endTransaction$1(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new internalInitInvalidationTracker(this.getMin.get(), this.setMax.get(), this.getMax.get(), this.length.get(), this.setMin.get(), this.equals.get(), this.IsOverlapping.get());
    }
}
