package id.dana.promocenter.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
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
import o.doDismissWithAnimation;
import o.resetInternal;
import o.setOnMenuWindowDismissListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014J\b\u0010\u0018\u001a\u00020\u0016H\u0016R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/promocenter/views/PromoCenterSeePromosView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "title", "", "buttonTitle", "getButtonTitle", "()Ljava/lang/CharSequence;", "setButtonTitle", "(Ljava/lang/CharSequence;)V", "imageAttacherFactory", "Lid/dana/utils/glide/ImageAttacherFactory;", "getLayout", "getTitle", "", "setButtonIcon", "", "iconUrl", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PromoCenterSeePromosView extends BaseRichView {
    private HashMap getMax;
    private final doDismissWithAnimation getMin;

    @JvmOverloads
    public PromoCenterSeePromosView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public PromoCenterSeePromosView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMax == null) {
            this.getMax = new HashMap();
        }
        View view = (View) this.getMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_promo_center_entry_point;
    }

    public final void setup() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromoCenterSeePromosView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PromoCenterSeePromosView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = new doDismissWithAnimation();
    }

    @Nullable
    public final CharSequence getButtonTitle() {
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.launchQuerySearch);
        if (textView != null) {
            return textView.getText();
        }
        return null;
    }

    public final void setButtonTitle(@Nullable CharSequence charSequence) {
        String str;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        if (str == null) {
            getResources().getString(R.string.view_promos);
        }
    }

    public final void setButtonIcon(@Nullable String str) {
        doDismissWithAnimation dodismisswithanimation = this.getMin;
        Context context = getContext();
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.invalidateOptionsMenu);
        if (str == null) {
            str = "";
        }
        dodismisswithanimation.getMax(context, imageView, str, R.drawable.ic_gift_promo_center, (setOnMenuWindowDismissListener.length) null);
    }
}
