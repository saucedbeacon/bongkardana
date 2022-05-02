package o;

import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "clickListener", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class cancelListener extends IMultiInstanceInvalidationCallback.Stub<AboutMenu, MerchantImageModel> {
    private final Function1<Integer, Unit> getMin;

    /* JADX WARNING: type inference failed for: r0v0, types: [o.FeedbackMenu] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.valueOf onCreateViewHolder(android.view.ViewGroup r2, int r3) {
        /*
            r1 = this;
            java.lang.String r3 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            o.AboutMenu r3 = new o.AboutMenu
            r3.<init>(r2)
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> r2 = r1.getMin
            if (r2 == 0) goto L_0x0014
            o.FeedbackMenu r0 = new o.FeedbackMenu
            r0.<init>(r2)
            r2 = r0
        L_0x0014:
            o.Ignore$setMin r2 = (o.Ignore.setMin) r2
            r3.setMin(r2)
            androidx.recyclerview.widget.RecyclerView$valueOf r3 = (androidx.recyclerview.widget.RecyclerView.valueOf) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancelListener.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$valueOf");
    }

    public cancelListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "clickListener");
        this.getMin = function1;
    }
}
