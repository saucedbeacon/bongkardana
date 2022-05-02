package id.dana.richview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.getBluetoothAdapterState;
import o.getInsetDodgeRect;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001:\u0001LB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020.J\u0006\u00102\u001a\u000203J\b\u00104\u001a\u00020\u000eH\u0016J\u0006\u00105\u001a\u00020.J\b\u00106\u001a\u00020.H\u0002J\u0012\u00107\u001a\u00020.2\b\u00108\u001a\u0004\u0018\u000100H\u0016J\u001c\u00109\u001a\u00020.2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010:\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0002J\u0010\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020\u0019H\u0002J\u0010\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020\bH\u0002J\u0010\u0010C\u001a\u00020.2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010D\u001a\u00020.2\u0006\u0010B\u001a\u00020\bH\u0002J\u0010\u0010E\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020$H\u0002J\u0010\u0010F\u001a\u00020.2\u0006\u0010B\u001a\u00020\bH\u0002J\b\u0010G\u001a\u00020.H\u0016J\u0010\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020\u000eH\u0002J\b\u0010J\u001a\u00020.H\u0002J\u0006\u0010K\u001a\u00020.R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R$\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR$\u0010%\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013¨\u0006M"}, d2 = {"Lid/dana/richview/HomeWidgetBase;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "buttonText", "getButtonText", "()Ljava/lang/String;", "setButtonText", "(Ljava/lang/String;)V", "", "buttonVisibility", "getButtonVisibility", "()I", "setButtonVisibility", "(I)V", "descriptionText", "getDescriptionText", "setDescriptionText", "onAutoDismiss", "Lid/dana/richview/HomeWidgetBase$AutoDismissListener;", "Landroid/view/View$OnClickListener;", "onButtonClickListener", "getOnButtonClickListener", "()Landroid/view/View$OnClickListener;", "setOnButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "titleText", "getTitleText", "setTitleText", "", "widgetHeaderVisible", "getWidgetHeaderVisible", "()Z", "setWidgetHeaderVisible", "(Z)V", "widgetSkeletonLayout", "getWidgetSkeletonLayout", "setWidgetSkeletonLayout", "addCustomViewButton", "", "buttonView", "Landroid/view/View;", "dismissWidget", "getButtonView", "Lid/dana/component/buttoncomponent/DanaButtonSecondaryView;", "getLayout", "hideSkeletonLoading", "moveChildViewToFrameLayout", "onViewAdded", "child", "parseAttrs", "attrs", "setHomeWidgetBasePadding", "topPadding", "", "bottomPadding", "setWidgetButtonClickListener", "clickListener", "setWidgetButtonText", "text", "setWidgetButtonVisibility", "setWidgetDescriptionText", "setWidgetHeaderVisibility", "setWidgetTitleText", "setup", "setupSkeletonLoading", "skeletonLayout", "setupWidgetButtonLeftAndRightPaddings", "showSkeletonLoading", "AutoDismissListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class HomeWidgetBase extends BaseRichView {
    private HashMap IsOverlapping;
    @NotNull
    private View.OnClickListener equals = setMax.setMax;
    private boolean getMax = true;
    private int getMin = R.layout.default_home_widget_skeleton;
    @NotNull
    private String isInside = "";
    private int length;
    /* access modifiers changed from: private */
    public onDetachedFromLayoutParams setMax;
    @NotNull
    private String setMin = "";
    @NotNull
    private String toIntRange = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final void onClick(View view) {
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayout() {
        return R.layout.view_home_widget_base;
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$getSkeletonScreen$p(HomeWidgetBase homeWidgetBase) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = homeWidgetBase.setMax;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
        }
        return ondetachedfromlayoutparams;
    }

    @NotNull
    public final String getButtonText() {
        return this.setMin;
    }

    public final void setButtonText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.setMin = str;
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.onEvent);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setActiveButton(str, (Drawable) null);
        }
    }

    public final int getButtonVisibility() {
        return this.length;
    }

    public final void setButtonVisibility(int i) {
        this.length = i;
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.onEvent);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setVisibility(i);
        }
    }

    public final boolean getWidgetHeaderVisible() {
        return this.getMax;
    }

    public final void setWidgetHeaderVisible(boolean z) {
        this.getMax = z;
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setRepeatMode);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final int getWidgetSkeletonLayout() {
        return this.getMin;
    }

    public final void setWidgetSkeletonLayout(int i) {
        this.getMin = i;
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setRepeatMode));
        setmax.getMax = i;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 0;
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        Intrinsics.checkNotNullExpressionValue(getinsetdodgerect, "Skeleton.bind(cl_base_ho…le(0)\n            .show()");
        onDetachedFromLayoutParams ondetachedfromlayoutparams = getinsetdodgerect;
        this.setMax = ondetachedfromlayoutparams;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
        }
        ondetachedfromlayoutparams.length();
    }

    @NotNull
    public final String getTitleText() {
        return this.isInside;
    }

    public final void setTitleText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.isInside = str;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.ShareTarget$RequestMethod);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @NotNull
    public final String getDescriptionText() {
        return this.toIntRange;
    }

    public final void setDescriptionText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.toIntRange = str;
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setUseCompatPadding);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @NotNull
    public final View.OnClickListener getOnButtonClickListener() {
        return this.equals;
    }

    public final void setOnButtonClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "value");
        this.equals = onClickListener;
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.onEvent);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeWidgetBase(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    public void onViewAdded(@Nullable View view) {
        super.onViewAdded(view);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, SecurityConstants.KEY_VALUE);
            int id2 = childAt.getId();
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.access$201);
            if (frameLayout == null || id2 != frameLayout.getId()) {
                removeViewAt(i);
                FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.RestrictTo);
                if (frameLayout2 != null) {
                    frameLayout2.addView(childAt);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r5 = r5.getTheme();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void parseAttrs(@org.jetbrains.annotations.Nullable android.content.Context r5, @org.jetbrains.annotations.Nullable android.util.AttributeSet r6) {
        /*
            r4 = this;
            super.parseAttrs(r5, r6)
            if (r6 == 0) goto L_0x008b
            r0 = 0
            if (r5 == 0) goto L_0x0015
            android.content.res.Resources$Theme r5 = r5.getTheme()
            if (r5 == 0) goto L_0x0015
            int[] r1 = o.resetInternal.getMin.onCaptioningEnabledChanged
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r1, r0, r0)
            goto L_0x0016
        L_0x0015:
            r5 = 0
        L_0x0016:
            if (r5 == 0) goto L_0x008b
            java.lang.String r6 = r5.getString(r0)
            java.lang.String r1 = ""
            if (r6 != 0) goto L_0x0021
            r6 = r1
        L_0x0021:
            r4.setButtonText(r6)
            r6 = 7
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L_0x002c
            r6 = r1
        L_0x002c:
            r4.setTitleText(r6)
            r6 = 2
            java.lang.String r6 = r5.getString(r6)
            if (r6 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = r6
        L_0x0038:
            r4.setDescriptionText(r1)
            r6 = 1
            boolean r1 = r5.getBoolean(r6, r0)
            if (r1 == 0) goto L_0x0044
            r1 = 0
            goto L_0x0046
        L_0x0044:
            r1 = 8
        L_0x0046:
            r4.setButtonVisibility(r1)
            r1 = 3
            boolean r6 = r5.getBoolean(r1, r6)
            r4.setWidgetHeaderVisible(r6)
            r6 = 6
            r1 = 2131558650(0x7f0d00fa, float:1.8742622E38)
            int r6 = r5.getResourceId(r6, r1)
            r4.setWidgetSkeletonLayout(r6)
            r6 = 5
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131165587(0x7f070193, float:1.7945395E38)
            float r1 = r1.getDimension(r2)
            float r6 = r5.getDimension(r6, r1)
            r1 = 4
            android.content.res.Resources r3 = r4.getResources()
            float r2 = r3.getDimension(r2)
            float r1 = r5.getDimension(r1, r2)
            int r2 = o.resetInternal.setMax.onItemVisibleChanged
            android.view.View r2 = r4._$_findCachedViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            if (r2 == 0) goto L_0x0088
            int r6 = (int) r6
            int r1 = (int) r1
            r2.setPadding(r0, r6, r0, r1)
        L_0x0088:
            r5.recycle()
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.richview.HomeWidgetBase.parseAttrs(android.content.Context, android.util.AttributeSet):void");
    }

    public final void showSkeletonLoading() {
        if (this.setMax != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
            }
            ondetachedfromlayoutparams.getMin();
            return;
        }
        getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.setRepeatMode));
        setmax.getMax = this.getMin;
        setmax.setMax = 1500;
        setmax.length = true;
        setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
        setmax.isInside = 0;
        getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
        getinsetdodgerect.getMin();
        Intrinsics.checkNotNullExpressionValue(getinsetdodgerect, "Skeleton.bind(cl_base_ho…)\n                .show()");
        this.setMax = getinsetdodgerect;
    }

    public final void hideSkeletonLoading() {
        if (this.setMax != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMax;
            if (ondetachedfromlayoutparams == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
            }
            ondetachedfromlayoutparams.length();
        }
    }

    @NotNull
    public final DanaButtonSecondaryView getButtonView() {
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.onEvent);
        Intrinsics.checkNotNullExpressionValue(danaButtonSecondaryView, "btn_widget_button");
        return danaButtonSecondaryView;
    }

    public final void addCustomViewButton(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "buttonView");
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.allOf);
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
        removeViewInLayout((DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.onEvent));
    }

    public final void dismissWidget() {
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(resetInternal.setMax.access$201);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public void setup() {
        ConstraintLayout constraintLayout = (ConstraintLayout) getButtonView().findViewById(R.id.f39222131362401);
        if (constraintLayout instanceof ConstraintLayout) {
            getBluetoothAdapterState.getMax(constraintLayout, 0, (Integer) null, 0, (Integer) null, 10);
        }
    }
}
