package id.dana.globalsearch.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import o.startBeaconDiscovery;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\u0007H\u0016J&\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\u0015\u001a\u00020\u000bH\u0016R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/globalsearch/view/widget/GlobalSearchErrorStateView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tryAgainClickListener", "Lkotlin/Function0;", "", "getLayout", "setErrorMessage", "icon", "title", "description", "setErrorState", "errCode", "", "setTryAgainClickListener", "setup", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GlobalSearchErrorStateView extends BaseRichView {
    /* access modifiers changed from: private */
    public Function0<Unit> setMax;
    private HashMap setMin;

    @JvmOverloads
    public GlobalSearchErrorStateView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GlobalSearchErrorStateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_global_search_error_state;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GlobalSearchErrorStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GlobalSearchErrorStateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ GlobalSearchErrorStateView getMin;

        getMin(GlobalSearchErrorStateView globalSearchErrorStateView) {
            this.getMin = globalSearchErrorStateView;
        }

        public final void onClick(View view) {
            Function0 access$getTryAgainClickListener$p = this.getMin.setMax;
            if (access$getTryAgainClickListener$p != null) {
                access$getTryAgainClickListener$p.invoke();
            }
        }
    }

    public final void setup() {
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.newSession);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMin(this));
        }
    }

    public final void setTryAgainClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "tryAgainClickListener");
        this.setMax = function0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009f, code lost:
        if (r6.equals("success") != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a1, code lost:
        setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        setMax(id.dana.R.drawable.ic_system_busy, id.dana.R.string.global_search_system_busy_title, id.dana.R.string.global_search_system_busy_desc);
        r6 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) _$_findCachedViewById(o.resetInternal.setMax.newSession);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "btnTryAgainGlobalSearch");
        r6.setVisibility(0);
        setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r6.equals("loading") != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r6.equals(id.dana.globalsearch.constants.GlobalSearchErrorCode.INITIAL_STATE) != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setErrorState(@org.jetbrains.annotations.NotNull java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "errCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r6.hashCode()
            r1 = 8
            java.lang.String r2 = "btnTryAgainGlobalSearch"
            r3 = 0
            switch(r0) {
                case -1867169789: goto L_0x0099;
                case -222831384: goto L_0x0073;
                case 47666: goto L_0x004d;
                case 47667: goto L_0x0027;
                case 189987798: goto L_0x001d;
                case 336650556: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x00a5
        L_0x0013:
            java.lang.String r0 = "loading"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a1
        L_0x001d:
            java.lang.String r0 = "initial_state"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a1
        L_0x0027:
            java.lang.String r0 = "003"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a5
            r6 = 2131232460(0x7f0806cc, float:1.808103E38)
            r0 = 2131887143(0x7f120427, float:1.9408885E38)
            r4 = 2131887142(0x7f120426, float:1.9408883E38)
            r5.setMax(r6, r0, r4)
            int r6 = o.resetInternal.setMax.newSession
            android.view.View r6 = r5._$_findCachedViewById(r6)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r6 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r6.setVisibility(r1)
            r5.setVisibility(r3)
            return
        L_0x004d:
            java.lang.String r0 = "002"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a5
            r6 = 2131232138(0x7f08058a, float:1.8080377E38)
            r0 = 2131887147(0x7f12042b, float:1.9408893E38)
            r1 = 2131887146(0x7f12042a, float:1.940889E38)
            r5.setMax(r6, r0, r1)
            int r6 = o.resetInternal.setMax.newSession
            android.view.View r6 = r5._$_findCachedViewById(r6)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r6 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r6.setVisibility(r3)
            r5.setVisibility(r3)
            return
        L_0x0073:
            java.lang.String r0 = "noKeyword"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a5
            r6 = 2131231913(0x7f0804a9, float:1.807992E38)
            r0 = 2131889051(0x7f120b9b, float:1.9412755E38)
            r4 = 2131889049(0x7f120b99, float:1.941275E38)
            r5.setMax(r6, r0, r4)
            int r6 = o.resetInternal.setMax.newSession
            android.view.View r6 = r5._$_findCachedViewById(r6)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r6 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r6.setVisibility(r1)
            r5.setVisibility(r3)
            return
        L_0x0099:
            java.lang.String r0 = "success"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x00a5
        L_0x00a1:
            r5.setVisibility(r1)
            return
        L_0x00a5:
            r6 = 2131232341(0x7f080655, float:1.8080789E38)
            r0 = 2131887150(0x7f12042e, float:1.9408899E38)
            r1 = 2131887149(0x7f12042d, float:1.9408897E38)
            r5.setMax(r6, r0, r1)
            int r6 = o.resetInternal.setMax.newSession
            android.view.View r6 = r5._$_findCachedViewById(r6)
            id.dana.component.buttoncomponent.DanaButtonPrimaryView r6 = (id.dana.component.buttoncomponent.DanaButtonPrimaryView) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r6.setVisibility(r3)
            r5.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.globalsearch.view.widget.GlobalSearchErrorStateView.setErrorState(java.lang.String):void");
    }

    private final void setMax(@DrawableRes int i, @StringRes int i2, @StringRes int i3) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.onStop);
        if (appCompatImageView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            appCompatImageView.setImageDrawable(startBeaconDiscovery.getMax(context, i));
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setHorizontalGravity);
        if (textView != null) {
            textView.setText(getContext().getString(i2));
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.getOrientation);
        if (textView2 != null) {
            textView2.setText(getContext().getString(i3));
        }
    }
}
