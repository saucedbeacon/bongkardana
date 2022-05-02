package id.dana.miniprogram.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EngineBridgeExtension;
import o.cancelAll;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lid/dana/miniprogram/view/FavoriteButton;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_checked", "", "checked", "isFavorite", "()Z", "setFavorite", "(Z)V", "onCheckedChangeListener", "Lid/dana/miniprogram/view/OnCheckedChangeListener;", "getOnCheckedChangeListener", "()Lid/dana/miniprogram/view/OnCheckedChangeListener;", "setOnCheckedChangeListener", "(Lid/dana/miniprogram/view/OnCheckedChangeListener;)V", "setIcon", "", "setState", "toggle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FavoriteButton extends AppCompatImageView {
    @Nullable
    private EngineBridgeExtension getMax;
    private HashMap getMin;
    private boolean setMax;

    @JvmOverloads
    public FavoriteButton(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public FavoriteButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FavoriteButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FavoriteButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        setState(false);
        setOnClickListener(new View.OnClickListener(this) {
            final /* synthetic */ FavoriteButton length;

            {
                this.length = r1;
            }

            public final void onClick(View view) {
                this.length.toggle();
            }
        });
    }

    @Nullable
    public final EngineBridgeExtension getOnCheckedChangeListener() {
        return this.getMax;
    }

    public final void setOnCheckedChangeListener(@Nullable EngineBridgeExtension engineBridgeExtension) {
        this.getMax = engineBridgeExtension;
    }

    public final boolean isFavorite() {
        return this.setMax;
    }

    public final void setFavorite(boolean z) {
        if (z != this.setMax) {
            setState(z);
            EngineBridgeExtension engineBridgeExtension = this.getMax;
            if (engineBridgeExtension != null) {
                engineBridgeExtension.setMin(z);
            }
        }
    }

    public final void setState(boolean z) {
        this.setMax = z;
        setImageDrawable(cancelAll.getMin(getContext(), z ? R.drawable.ic_star_filled : R.drawable.ic_star));
    }

    public final void toggle() {
        setFavorite(!this.setMax);
    }
}
