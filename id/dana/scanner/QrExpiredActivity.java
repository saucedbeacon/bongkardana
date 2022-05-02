package id.dana.scanner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.associateBy;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lid/dana/scanner/QrExpiredActivity;", "Lid/dana/base/BaseActivity;", "()V", "configToolbar", "", "getLayout", "", "init", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class QrExpiredActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private HashMap setMax;

    @JvmStatic
    @NotNull
    public static final Intent createIntent(@NotNull Activity activity) {
        return getMin.setMax(activity);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMax;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-2118930612, oncanceled);
            onCancelLoad.getMin(-2118930612, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled2 = new onCanceled(i, max, 16);
            onCancelLoad.setMax(-2118930612, oncanceled2);
            onCancelLoad.getMin(-2118930612, oncanceled2);
        }
        if (this.setMax == null) {
            this.setMax = new HashMap();
        }
        View view = (View) this.setMax.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMax.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_qr_expired;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "id/dana/scanner/QrExpiredActivity$init$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ QrExpiredActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(QrExpiredActivity qrExpiredActivity) {
            super(1);
            this.this$0 = qrExpiredActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.backToHomepage((Bundle) null);
        }
    }

    public final void init() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.setChildFrame);
        if (appCompatTextView != null) {
            appCompatTextView.setText(getString(R.string.qr_expired_error_title));
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getNextLocationOffset);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(getString(R.string.qr_expired_error_desc));
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.toIntRange);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setActiveButton(getString(R.string.qr_expired_error_action), (Drawable) null);
            danaButtonPrimaryView.setOnClickListener(new associateBy(new getMax(this)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.hasAttributeId);
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
    }

    public final void configToolbar() {
        setMenuLeftButton((int) R.drawable.arrow_left_white);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/scanner/QrExpiredActivity$Companion;", "", "()V", "createIntent", "Landroid/content/Intent;", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        @NotNull
        public static Intent setMax(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
            return new Intent(activity, QrExpiredActivity.class);
        }
    }
}
