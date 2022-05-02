package o;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.RVParams;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/richview/moreforyou/MoreForYouAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/richview/moreforyou/viewholder/MoreForYouItem;", "Lid/dana/richview/moreforyou/model/MoreForYouModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getIndexMoreForYouModel", "", "bizScenario", "", "getItem", "position", "isPositionValid", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setQuality extends IMultiInstanceInvalidationCallback.Stub<APVideoRecordRsp, CameraParams> {
    private final Context getMax;

    public setQuality(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = context;
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new APVideoRecordRsp(this.getMax, viewGroup);
    }

    @NotNull
    /* renamed from: getMin */
    public final CameraParams setMin(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1998391393, oncanceled);
            onCancelLoad.getMin(-1998391393, oncanceled);
        }
        if (!length(i)) {
            return new CameraParams((byte) 0);
        }
        Object obj = getMax().get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
        return (CameraParams) obj;
    }

    public final int length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RVParams.LONG_BIZ_SCENARIO);
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (Intrinsics.areEqual((Object) str, (Object) setMin(i).toFloatRange)) {
                return i;
            }
        }
        return -1;
    }

    private final boolean length(int i) {
        return i >= 0 && i < getItemCount();
    }
}
