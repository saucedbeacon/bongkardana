package id.dana.promocenter.model;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DownloadFileHandle;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.removeString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001eB'\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001b\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u000fJ\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/promocenter/model/PromoSectionModel;", "", "adapter", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/promocenter/model/PromoModel;", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "(Lid/dana/base/BaseRecyclerViewAdapter;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V", "getAdapter", "()Lid/dana/base/BaseRecyclerViewAdapter;", "getLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "state", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/promocenter/model/PromoSectionModel$State;", "component1", "component2", "copy", "equals", "", "other", "getCurrentState", "getStateObservable", "hashCode", "", "setState", "", "toString", "", "State", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PromoSectionModel {
    public final removeString<State> getMax;
    @NotNull
    public final RecyclerView.IsOverlapping getMin;
    @NotNull
    public final IMultiInstanceInvalidationCallback.Stub<Ignore<DownloadFileHandle>, DownloadFileHandle> length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/promocenter/model/PromoSectionModel$State;", "", "(Ljava/lang/String;I)V", "STATE_SHOW_LOADING", "STATE_HIDE_LOADING", "STATE_SHOW", "STATE_HIDDEN", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum State {
        STATE_SHOW_LOADING,
        STATE_HIDE_LOADING,
        STATE_SHOW,
        STATE_HIDDEN
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoSectionModel)) {
            return false;
        }
        PromoSectionModel promoSectionModel = (PromoSectionModel) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) promoSectionModel.length) && Intrinsics.areEqual((Object) this.getMin, (Object) promoSectionModel.getMin);
    }

    public final int hashCode() {
        IMultiInstanceInvalidationCallback.Stub<Ignore<DownloadFileHandle>, DownloadFileHandle> stub = this.length;
        int i = 0;
        int hashCode = (stub != null ? stub.hashCode() : 0) * 31;
        RecyclerView.IsOverlapping isOverlapping = this.getMin;
        if (isOverlapping != null) {
            i = isOverlapping.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoSectionModel(adapter=");
        sb.append(this.length);
        sb.append(", layoutManager=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public PromoSectionModel(@NotNull IMultiInstanceInvalidationCallback.Stub<Ignore<DownloadFileHandle>, DownloadFileHandle> stub, @NotNull RecyclerView.IsOverlapping isOverlapping) {
        Intrinsics.checkNotNullParameter(stub, "adapter");
        Intrinsics.checkNotNullParameter(isOverlapping, "layoutManager");
        this.length = stub;
        this.getMin = isOverlapping;
        removeString<State> min = removeString.setMin(State.STATE_SHOW_LOADING);
        Intrinsics.checkNotNullExpressionValue(min, "BehaviorSubject.createDe…State.STATE_SHOW_LOADING)");
        this.getMax = min;
    }
}
