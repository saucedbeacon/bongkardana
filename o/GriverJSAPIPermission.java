package o;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationService;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\f\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lid/dana/referral/view/ReferralEngagementDialog;", "Lid/dana/base/BaseMaterialDialog;", "Lid/dana/referral/view/ReferralEngagementDialog$Builder;", "context", "Landroid/content/Context;", "builder", "(Landroid/content/Context;Lid/dana/referral/view/ReferralEngagementDialog$Builder;)V", "setup", "", "dialogView", "Landroid/view/View;", "datas", "showDialog", "Builder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverJSAPIPermission extends IMultiInstanceInvalidationService<getMax> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lid/dana/referral/view/ReferralEngagementDialog$Builder;", "Lid/dana/base/BaseMaterialDialog$Cancellation;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "getDismissListener", "()Landroid/content/DialogInterface$OnDismissListener;", "setDismissListener", "(Landroid/content/DialogInterface$OnDismissListener;)V", "onReferNowClicked", "Landroid/view/View$OnClickListener;", "getOnReferNowClicked", "()Landroid/view/View$OnClickListener;", "setOnReferNowClicked", "(Landroid/view/View$OnClickListener;)V", "onShowListener", "Landroid/content/DialogInterface$OnShowListener;", "getOnShowListener", "()Landroid/content/DialogInterface$OnShowListener;", "setOnShowListener", "(Landroid/content/DialogInterface$OnShowListener;)V", "referralEngagementDialogModel", "Lid/dana/onboarding/referral/model/ReferralEngagementDialogModel;", "getReferralEngagementDialogModel", "()Lid/dana/onboarding/referral/model/ReferralEngagementDialogModel;", "setReferralEngagementDialogModel", "(Lid/dana/onboarding/referral/model/ReferralEngagementDialogModel;)V", "build", "Lid/dana/referral/view/ReferralEngagementDialog;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends IMultiInstanceInvalidationService.setMin {
        public DialogInterface.OnDismissListener getMax;
        public vibrateLong getMin;
        public View.OnClickListener length;
        public Context setMax;
        public DialogInterface.OnShowListener setMin;
    }

    public /* synthetic */ GriverJSAPIPermission(Context context, getMax getmax, byte b) {
        this(context, getmax);
    }

    public final /* synthetic */ void setMin(View view, Object obj) {
        getMax getmax = (getMax) obj;
        if (view != null && getmax != null) {
            ((DanaButtonPrimaryView) view.findViewById(resetInternal.setMax.asInterface)).setOnClickListener(new setMin(getmax));
            ((TextView) view.findViewById(resetInternal.setMax.extraCallbackWithResult)).setOnClickListener(new setMax(view, this, getmax));
            isBaselineAligned max = getMax();
            DialogInterface.OnShowListener onShowListener = getmax.setMin;
            if (onShowListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onShowListener");
            }
            max.setOnShowListener(onShowListener);
            if (getmax != null) {
                vibrateLong vibratelong = getmax.getMin;
                if (vibratelong == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("referralEngagementDialogModel");
                }
                if (vibratelong != null) {
                    TextView textView = (TextView) view.findViewById(resetInternal.setMax.launchQuerySearch);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
                    textView.setText(vibratelong.getMin);
                    TextView textView2 = (TextView) view.findViewById(resetInternal.setMax.forceUniformHeight);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tvDescription");
                    textView2.setText(vibratelong.length);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ getMax getMin;

        setMin(getMax getmax) {
            this.getMin = getmax;
        }

        public final void onClick(View view) {
            View.OnClickListener onClickListener = this.getMin.length;
            if (onClickListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onReferNowClicked");
            }
            onClickListener.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/referral/view/ReferralEngagementDialog$setup$1$1$2", "id/dana/referral/view/ReferralEngagementDialog$$special$$inlined$apply$lambda$1"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ View getMax;
        final /* synthetic */ GriverJSAPIPermission getMin;
        final /* synthetic */ getMax setMax;

        setMax(View view, GriverJSAPIPermission griverJSAPIPermission, getMax getmax) {
            this.getMax = view;
            this.getMin = griverJSAPIPermission;
            this.setMax = getmax;
        }

        public final void onClick(View view) {
            this.getMin.setMax();
        }
    }

    public final void setMin() {
        super.setMin();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private GriverJSAPIPermission(android.content.Context r3, o.GriverJSAPIPermission.getMax r4) {
        /*
            r2 = this;
            android.content.DialogInterface$OnDismissListener r0 = r4.getMax
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "dismissListener"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            r1 = 2131558680(0x7f0d0118, float:1.8742683E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r3, r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverJSAPIPermission.<init>(android.content.Context, o.GriverJSAPIPermission$getMax):void");
    }
}
