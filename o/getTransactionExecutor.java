package o;

import android.content.Context;
import o.GriverMonitor;
import o.ShareRecyclerAdapter;
import o.b;
import o.endTransaction;

public final class getTransactionExecutor implements getAdapterPosition<internalBeginTransaction> {
    private final b.C0007b<Context> equals;
    private final b.C0007b<setOutFilePathProxy> getMax;
    private final b.C0007b<sendData> getMin;
    private final b.C0007b<getPerformanceTracker> isInside;
    private final b.C0007b<PermissionUtils> length;
    private final b.C0007b<GriverMonitor.AnonymousClass3> setMax;
    private final b.C0007b<endTransaction.length> setMin;
    private final b.C0007b<UpdateAppCallback> toFloatRange;
    private final b.C0007b<ShareRecyclerAdapter.ShareViewHolder> toIntRange;

    private getTransactionExecutor(b.C0007b<endTransaction.length> bVar, b.C0007b<GriverMonitor.AnonymousClass3> bVar2, b.C0007b<setOutFilePathProxy> bVar3, b.C0007b<PermissionUtils> bVar4, b.C0007b<sendData> bVar5, b.C0007b<Context> bVar6, b.C0007b<getPerformanceTracker> bVar7, b.C0007b<UpdateAppCallback> bVar8, b.C0007b<ShareRecyclerAdapter.ShareViewHolder> bVar9) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
        this.getMin = bVar5;
        this.equals = bVar6;
        this.isInside = bVar7;
        this.toFloatRange = bVar8;
        this.toIntRange = bVar9;
    }

    public static getTransactionExecutor setMin(b.C0007b<endTransaction.length> bVar, b.C0007b<GriverMonitor.AnonymousClass3> bVar2, b.C0007b<setOutFilePathProxy> bVar3, b.C0007b<PermissionUtils> bVar4, b.C0007b<sendData> bVar5, b.C0007b<Context> bVar6, b.C0007b<getPerformanceTracker> bVar7, b.C0007b<UpdateAppCallback> bVar8, b.C0007b<ShareRecyclerAdapter.ShareViewHolder> bVar9) {
        return new getTransactionExecutor(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public final /* synthetic */ Object get() {
        internalBeginTransaction internalbegintransaction = new internalBeginTransaction(this.setMin.get(), this.setMax.get(), this.getMax.get(), this.length.get(), this.getMin.get(), this.equals.get(), this.isInside.get(), this.toFloatRange.get());
        getInvalidationTracker.setMin(internalbegintransaction, this.toIntRange.get());
        return internalbegintransaction;
    }
}
