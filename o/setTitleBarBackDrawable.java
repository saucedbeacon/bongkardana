package o;

import id.dana.base.BaseActivity;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.sendmoney_v2.recipient.activity.BankRecipientActivity;
import id.dana.sendmoney_v2.recipient.activity.ContactRecipientActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\f\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0014J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rH\u0014J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014¨\u0006\u0012"}, d2 = {"Lid/dana/sendmoney_v2/director/SendMoneyScenarioDirectorV2;", "Lid/dana/sendmoney/SendMoneyScenarioDirector;", "activity", "Lid/dana/base/BaseActivity;", "(Lid/dana/base/BaseActivity;)V", "buildSendToLinkRecipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "kotlin.jvm.PlatformType", "iconUrl", "", "socialLinkModel", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "getSendMoneyToBankActivity", "Ljava/lang/Class;", "getSendMoneyToContactActivity", "Lid/dana/sendmoney_v2/recipient/activity/ContactRecipientActivity;", "startSendMoneyLink", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTitleBarBackDrawable extends getCacheId {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setTitleBarBackDrawable(@NotNull BaseActivity baseActivity) {
        super(baseActivity);
        Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
    }

    @NotNull
    public final Class<?> setMax() {
        return BankRecipientActivity.class;
    }

    @NotNull
    public final Class<ContactRecipientActivity> length() {
        return ContactRecipientActivity.class;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (r7 == null) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(@org.jetbrains.annotations.Nullable java.lang.String r6, @org.jetbrains.annotations.Nullable id.dana.sendmoney_v2.x2l.model.SocialLinkModel r7) {
        /*
            r5 = this;
            id.dana.base.BaseActivity r0 = r5.getMax
            boolean r0 = r0 instanceof id.dana.sendmoney_v2.landing.SendMoneyActivity
            if (r0 == 0) goto L_0x0014
            id.dana.base.BaseActivity r6 = r5.getMax
            java.lang.Class<id.dana.sendmoney_v2.x2l.SendToLinkActivity> r7 = id.dana.sendmoney_v2.x2l.SendToLinkActivity.class
            android.content.Intent r6 = r6.getIntentClassWithTracking(r7)
            id.dana.base.BaseActivity r7 = r5.getMax
            r7.startActivity(r6)
            return
        L_0x0014:
            id.dana.sendmoney.model.RecipientModel$length r0 = new id.dana.sendmoney.model.RecipientModel$length
            java.lang.String r1 = "link"
            r0.<init>(r1)
            java.lang.String r1 = "activity"
            java.lang.String r2 = ""
            if (r7 == 0) goto L_0x0047
            id.dana.base.BaseActivity r3 = r5.getMax
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.String r7 = r7.getMin
            java.lang.String r7 = id.dana.sendmoney_v2.x2l.model.SocialLinkModel.setMax(r3, r7)
            if (r7 != 0) goto L_0x0036
            r7 = r2
        L_0x0036:
            if (r7 == 0) goto L_0x0047
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = "Locale.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r7 = kotlin.text.StringsKt.capitalize(r7, r3)
            if (r7 != 0) goto L_0x0055
        L_0x0047:
            id.dana.base.BaseActivity r7 = r5.getMax
            r3 = 2131888702(0x7f120a3e, float:1.9412047E38)
            java.lang.String r7 = r7.getString(r3)
            java.lang.String r3 = "activity.getString(R.string.send_as_link)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
        L_0x0055:
            r0.isInside = r7
            if (r6 != 0) goto L_0x005a
            r6 = r2
        L_0x005a:
            r0.IsOverlapping = r6
            java.lang.String r6 = r5.setMin
            if (r6 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = r6
        L_0x0062:
            r0.length = r2
            id.dana.base.BaseActivity r6 = r5.getMax
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.String r6 = r6.getSource()
            r0.setMin = r6
            id.dana.sendmoney.model.RecipientModel r6 = r0.length()
            id.dana.base.BaseActivity r7 = r5.getMax
            java.lang.Class<id.dana.sendmoney.summary.SummaryActivity> r0 = id.dana.sendmoney.summary.SummaryActivity.class
            android.content.Intent r7 = r7.getIntentClassWithTracking(r0)
            java.lang.String r0 = "recipientModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.String r0 = "send_money"
            r6.getCause = r0
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            java.lang.String r0 = "data"
            r7.putExtra(r0, r6)
            java.lang.String r6 = "recipientType"
            java.lang.String r0 = "chat"
            r7.putExtra(r6, r0)
            id.dana.base.BaseActivity r6 = r5.getMax
            r6.startActivity(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTitleBarBackDrawable.getMax(java.lang.String, id.dana.sendmoney_v2.x2l.model.SocialLinkModel):void");
    }
}
