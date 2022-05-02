package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.richview.EllipseTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000bB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lid/dana/globalsearch/adapter/PopularSearchAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/globalsearch/adapter/PopularSearchAdapter$PopularSearchViewHolder;", "", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "Companion", "PopularSearchViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getEventManifests extends IMultiInstanceInvalidationCallback.Stub<setMax, String> {
    @NotNull
    public static final setMin getMin = new setMin((byte) 0);

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setMax(viewGroup);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/globalsearch/adapter/PopularSearchAdapter$PopularSearchViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends Ignore<String> {
        public final /* synthetic */ void setMax(Object obj) {
            CharSequence charSequence;
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "data");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            EllipseTextView ellipseTextView = (EllipseTextView) view.findViewById(resetInternal.setMax.MainThread);
            if (ellipseTextView != null) {
                ellipseTextView.setBackgroundColor(IntRange.setMax(ellipseTextView.getContext(), R.color.f24762131100430));
                ellipseTextView.setTextColor(IntRange.setMax(ellipseTextView.getContext(), R.color.f18562131099735));
                ellipseTextView.setStrokeColor(IntRange.setMax(ellipseTextView.getContext(), R.color.f24642131100414));
                Context context = ellipseTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                ellipseTextView.setCornerRadius(context.getResources().getDimension(R.dimen.f26272131165275));
                getBluetoothAdapterState.getMax((View) ellipseTextView, (Integer) 0, (Integer) 0, (Integer) 16, (Integer) 16);
                if (str.length() > 20) {
                    StringBuilder sb = new StringBuilder();
                    String substring = str.substring(0, 20);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("...");
                    charSequence = sb.toString();
                } else {
                    charSequence = str;
                }
                ellipseTextView.setText(charSequence);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.view_ellipse_text, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/globalsearch/adapter/PopularSearchAdapter$Companion;", "", "()V", "ELLIPSIS", "", "MAX_CHARACTER", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }
}
