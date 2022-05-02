package id.dana.nearbyme;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016¨\u0006\u0013"}, d2 = {"Lid/dana/nearbyme/NearbyWidgetEmptyStateView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "display", "", "type", "onButtonClickListener", "Landroid/view/View$OnClickListener;", "getLayout", "setup", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NearbyWidgetEmptyStateView extends BaseRichView {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    public static final int NO_LOCATION_PERMISSION = 2;
    public static final int NO_NEARBY_MERCHANT = 1;
    private HashMap length;

    @JvmOverloads
    public NearbyWidgetEmptyStateView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NearbyWidgetEmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.length;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.length == null) {
            this.length = new HashMap();
        }
        View view = (View) this.length.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.length.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.layout_empty_state_nearby;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NearbyWidgetEmptyStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbyWidgetEmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NearbyWidgetEmptyStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void display(int i, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onButtonClickListener");
        if (i == 1) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.hitThumb);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_error_description");
            textView.setText(getContext().getString(R.string.nearby_no_merchant_available));
            ((ImageView) _$_findCachedViewById(resetInternal.setMax.createImageButton)).setImageResource(R.drawable.ic_merchant_not_available);
            Button button = (Button) _$_findCachedViewById(resetInternal.setMax.requestPostMessageChannelWithExtras);
            Intrinsics.checkNotNullExpressionValue(button, "btn_action_emptystate");
            button.setText(getContext().getString(R.string.find_others));
        } else if (i == 2) {
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.hitThumb);
            Intrinsics.checkNotNullExpressionValue(textView2, "tv_error_description");
            textView2.setText(getContext().getString(R.string.nearby_no_location_permission));
            ((ImageView) _$_findCachedViewById(resetInternal.setMax.createImageButton)).setImageResource(R.drawable.ic_no_location_permission);
            Button button2 = (Button) _$_findCachedViewById(resetInternal.setMax.requestPostMessageChannelWithExtras);
            Intrinsics.checkNotNullExpressionValue(button2, "btn_action_emptystate");
            button2.setText(getContext().getString(R.string.activate));
        }
        ((Button) _$_findCachedViewById(resetInternal.setMax.requestPostMessageChannelWithExtras)).setOnClickListener(onClickListener);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyme/NearbyWidgetEmptyStateView$Companion;", "", "()V", "NO_LOCATION_PERMISSION", "", "NO_NEARBY_MERCHANT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
