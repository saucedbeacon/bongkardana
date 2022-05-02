package o;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.initContentView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lid/dana/social/adapter/viewholder/FeedHighlightViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedHighlightModel;", "parent", "Landroid/view/ViewGroup;", "onClick", "Lkotlin/Function1;", "", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class addTextRightView extends Ignore<getContextMenuInfo> {
    public final /* synthetic */ void setMax(Object obj) {
        CharSequence charSequence;
        getContextMenuInfo getcontextmenuinfo = (getContextMenuInfo) obj;
        if (getcontextmenuinfo != null) {
            View view = this.itemView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setBackgroundResource);
            if (appCompatImageView != null) {
                setOverScrollMode.getMax(appCompatImageView, getcontextmenuinfo.setMin, R.drawable.avatar_placeholder);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(resetInternal.setMax.setGroupDividerEnabled);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility((getcontextmenuinfo.length() ? view : null) != null ? 8 : 0);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.setSplitTrack);
            if (appCompatTextView != null) {
                if ((getcontextmenuinfo.getMin.isEmpty() ^ true ? view : null) != null) {
                    initContentView.setMin setmin = initContentView.getMin;
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
                    Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
                    String str = getcontextmenuinfo.setMax;
                    String str2 = getcontextmenuinfo.getMax;
                    HashMap<String, String> hashMap = getcontextmenuinfo.getMin;
                    if (!(hashMap instanceof HashMap)) {
                        hashMap = null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap<>();
                    }
                    Spannable max = initContentView.setMin.getMax(new AUMaskImage(str, str2, hashMap, context, getcontextmenuinfo.IsOverlapping), (Integer) null, false);
                    if (max != null) {
                        charSequence = max;
                        appCompatTextView.setText(charSequence);
                    }
                }
                charSequence = new SpannableString(getcontextmenuinfo.getMax);
                appCompatTextView.setText(charSequence);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public addTextRightView(@NotNull ViewGroup viewGroup, @NotNull final Function1<? super Integer, Unit> function1) {
        super(viewGroup.getContext(), R.layout.item_feed_highlight, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        Intrinsics.checkNotNullParameter(view, "$this$elevate");
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        getBluetoothAdapterState.getMin(view, (int) TypedValue.applyDimension(1, 6.0f, system.getDisplayMetrics()));
        this.itemView.setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ addTextRightView setMin;

            {
                this.setMin = r1;
            }

            public final void onClick(View view) {
                function1.invoke(Integer.valueOf(this.setMin.getAbsoluteAdapterPosition()));
            }
        });
    }
}
