package id.dana.nearbyrevamp.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ap.zoloz.hummer.biz.HummerConstants;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J;\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192%\b\u0002\u0010\u001a\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001bJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0016H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantActionView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "actionDrawableActive", "Landroid/graphics/drawable/Drawable;", "actionDrawablePassive", "actionText", "", "activeStyle", "initialState", "isStateEnabled", "", "getLayout", "parseAttrs", "", "setOnActionClickListener", "onEnabled", "Lkotlin/Function0;", "onDisabled", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "setState", "enabled", "type", "setup", "setupState", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantActionView extends BaseRichView {
    public static final int ACTIVE = 1;
    public static final int ACTIVE_AZURE = 2;
    public static final int ACTIVE_STYLE_AZURE = 1;
    public static final int ACTIVE_STYLE_DEFAULT = 0;
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    public static final int PASSIVE = 0;
    private HashMap equals;
    private Drawable getMax;
    /* access modifiers changed from: private */
    public String getMin;
    private int length;
    private int setMax;
    private Drawable setMin;
    /* access modifiers changed from: private */
    public boolean toFloatRange;

    @JvmOverloads
    public MerchantActionView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public MerchantActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_action;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MerchantActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MerchantActionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public MerchantActionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public final void parseAttrs(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.setCaptioningEnabled);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "getContext()\n           …eable.MerchantActionView)");
            try {
                this.setMax = obtainStyledAttributes.getInt(1, 0);
                this.length = obtainStyledAttributes.getInt(0, 0);
                this.getMin = obtainStyledAttributes.getString(4);
                this.getMax = obtainStyledAttributes.getDrawable(2);
                this.setMin = obtainStyledAttributes.getDrawable(3);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setup() {
        TextView textView;
        String str = this.getMin;
        if (!(str == null || (textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setShowDividers)) == null)) {
            textView.setText(str);
        }
        setMin();
    }

    private final void setMin() {
        this.toFloatRange = this.setMax != 0;
        int i = this.setMax;
        if (i == 0) {
            setMin(0);
            super.setEnabled(false);
        } else if (i == 1) {
            super.setEnabled(true);
            if (this.length == 0) {
                setMin(1);
            } else {
                setMin(2);
            }
        }
    }

    public final void setState(boolean z) {
        this.setMax = z ? 1 : 0;
        setMin();
    }

    public static /* synthetic */ void setOnActionClickListener$default(MerchantActionView merchantActionView, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        merchantActionView.setOnActionClickListener(function0, function1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ MerchantActionView getMax;
        final /* synthetic */ Function0 getMin;
        final /* synthetic */ Function1 setMin;

        getMin(MerchantActionView merchantActionView, Function0 function0, Function1 function1) {
            this.getMax = merchantActionView;
            this.getMin = function0;
            this.setMin = function1;
        }

        public final void onClick(View view) {
            if (this.getMax.toFloatRange) {
                this.getMin.invoke();
                return;
            }
            Function1 function1 = this.setMin;
            if (function1 != null) {
                function1.invoke(String.valueOf(this.getMax.getMin));
            }
        }
    }

    public final void setOnActionClickListener(@NotNull Function0<Unit> function0, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function0, "onEnabled");
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.getRepeatMode);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new getMin(this, function0, function1));
        }
    }

    private final void setMin(int i) {
        if (i == 0) {
            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.setCursor);
            if (circleImageView != null) {
                circleImageView.setImageResource(R.color.f20332131099945);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setOnKeyListener);
            if (appCompatImageView != null) {
                appCompatImageView.setImageDrawable(this.setMin);
            }
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setShowDividers);
            if (textView != null) {
                textView.setTextColor(IntRange.setMax(getContext(), R.color.f20362131099948));
            }
        } else if (i == 1) {
            CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.setCursor);
            if (circleImageView2 != null) {
                circleImageView2.setImageResource(R.color.f18602131099740);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setOnKeyListener);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageDrawable(this.getMax);
            }
            TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setShowDividers);
            if (textView2 != null) {
                textView2.setTextColor(IntRange.setMax(getContext(), R.color.f18392131099713));
            }
        } else if (i == 2) {
            CircleImageView circleImageView3 = (CircleImageView) _$_findCachedViewById(resetInternal.setMax.setCursor);
            if (circleImageView3 != null) {
                circleImageView3.setImageResource(R.color.f18632131099744);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setOnKeyListener);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setImageDrawable(this.getMax);
            }
            TextView textView3 = (TextView) _$_findCachedViewById(resetInternal.setMax.setShowDividers);
            if (textView3 != null) {
                textView3.setTextColor(IntRange.setMax(getContext(), R.color.f18392131099713));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/view/MerchantActionView$Companion;", "", "()V", "ACTIVE", "", "ACTIVE_AZURE", "ACTIVE_STYLE_AZURE", "ACTIVE_STYLE_DEFAULT", "PASSIVE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }
}
