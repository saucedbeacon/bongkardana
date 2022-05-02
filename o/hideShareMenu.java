package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.domain.profilemenu.model.SettingModel;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CornerMarkingDataProvider;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0014\u0010\u0013\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0015\u001a\u00020\u0011*\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/myprofile/settingconfig/InvestmentSettingConfigRunner;", "Lid/dana/domain/profilemenu/settingconfig/SettingConfigurationRunner;", "context", "Landroid/content/Context;", "investmentRepository", "Lid/dana/domain/investment/InvestmentRepository;", "(Landroid/content/Context;Lid/dana/domain/investment/InvestmentRepository;)V", "getAvailableBalance", "", "amount", "", "currencyCode", "getLocalizedString", "resource", "getSettingName", "performConfiguration", "Lio/reactivex/Observable;", "Lid/dana/domain/profilemenu/model/SettingModel;", "settingModel", "applyInvestmentInfo", "Lid/dana/domain/investment/model/UserInvestmentInfo;", "applyNonRegisterUser", "applyRegisteredUser", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class hideShareMenu implements sendUcReceiver {
    private final GriverEnv length;
    private final Context setMax;

    @NotNull
    public final String getSettingName() {
        return "setting_investment";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "investmentInfo", "Lid/dana/domain/investment/model/UserInvestmentInfo;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<getWorkSpaceId, SettingModel> {
        final /* synthetic */ SettingModel getMin;
        final /* synthetic */ hideShareMenu setMin;

        getMax(hideShareMenu hidesharemenu, SettingModel settingModel) {
            this.setMin = hidesharemenu;
            this.getMin = settingModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getWorkSpaceId getworkspaceid = (getWorkSpaceId) obj;
            Intrinsics.checkNotNullParameter(getworkspaceid, "investmentInfo");
            return hideShareMenu.setMax(this.setMin, getworkspaceid, this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/profilemenu/model/SettingModel;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends SettingModel>> {
        final /* synthetic */ SettingModel length;

        setMax(SettingModel settingModel) {
            this.length = settingModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "<anonymous parameter 0>");
            return TitleBarRightButtonView.AnonymousClass1.just(this.length);
        }
    }

    @Inject
    public hideShareMenu(@NotNull Context context, @NotNull GriverEnv griverEnv) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(griverEnv, "investmentRepository");
        this.setMax = context;
        this.length = griverEnv;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SettingModel> performConfiguration(@Nullable SettingModel settingModel) {
        if (settingModel == null) {
            TitleBarRightButtonView.AnonymousClass1<SettingModel> just = TitleBarRightButtonView.AnonymousClass1.just(SettingModel.empty());
            Intrinsics.checkNotNullExpressionValue(just, "Observable.just(SettingModel.empty())");
            return just;
        }
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = this.length.getUserInvestment().map(new getMax(this, settingModel)).onErrorResumeNext(new setMax(settingModel));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "investmentRepository.get…ttingModel)\n            }");
        return onErrorResumeNext;
    }

    private static String length(Context context, String str) {
        int max;
        Context context2 = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        int i = 0;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(465367765, oncanceled);
            onCancelLoad.getMin(465367765, oncanceled);
        }
        if (context != null) {
            context2 = context.getApplicationContext();
        }
        if (context2 != null) {
            if (str != null) {
                i = str.length();
            }
            int min = dispatchOnCancelled.getMin(context2, i);
            if (i != min) {
                onCanceled oncanceled2 = new onCanceled(i, min, 32);
                onCancelLoad.setMax(465367765, oncanceled2);
                onCancelLoad.getMin(465367765, oncanceled2);
            }
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.getDefault()");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return CornerMarkingDataProvider.AnonymousClass3.setMin(context, lowerCase, str);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r1 == null) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ id.dana.domain.profilemenu.model.SettingModel setMax(o.hideShareMenu r5, o.getWorkSpaceId r6, id.dana.domain.profilemenu.model.SettingModel r7) {
        /*
            r0 = 7
            r7.setViewType(r0)
            id.dana.domain.investment.AccountInvestmentStatus r0 = r6.getAccountStatus()
            int[] r1 = o.AppearanceBridgeExtension.getMax
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x00b5
            r7.setUserInvestmentInfo(r6)
            java.lang.String r0 = r7.getCollection()
            if (r0 == 0) goto L_0x003b
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            if (r0 == 0) goto L_0x003b
            java.lang.String r4 = "setting_category_features"
            boolean r0 = kotlin.text.StringsKt.equals(r4, r0, r3)
            if (r0 == 0) goto L_0x003b
            r7.setEnable(r2)
        L_0x003b:
            java.lang.String r0 = r7.getTitle()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0049
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            if (r2 == 0) goto L_0x005a
            android.content.Context r0 = r5.setMax
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131886754(0x7f1202a2, float:1.9408096E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0069
        L_0x005a:
            android.content.Context r0 = r5.setMax
            java.lang.String r2 = r7.getTitle()
            java.lang.String r3 = "model.title"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r0 = length(r0, r2)
        L_0x0069:
            r7.setTitle(r0)
            android.content.Context r5 = r5.setMax
            r0 = 2131887637(0x7f120615, float:1.9409887E38)
            java.lang.String r5 = r5.getString(r0)
            r7.setSubtitle(r5)
            o.isForeground r5 = r6.getAvailableBalance()
            if (r5 == 0) goto L_0x00ad
            java.lang.Long r6 = r5.getAmount()
            if (r6 == 0) goto L_0x00ab
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            int r6 = (int) r0
            if (r6 == 0) goto L_0x00a7
            java.lang.String r5 = r5.getCurrencyCode()
            java.util.Locale r6 = o.WheelView.OnWheelViewListener.getMax
            if (r6 != 0) goto L_0x00a0
            java.util.Locale r6 = new java.util.Locale
            java.lang.String r2 = "in"
            java.lang.String r3 = "ID"
            r6.<init>(r2, r3)
            o.WheelView.OnWheelViewListener.getMax = r6
        L_0x00a0:
            java.util.Locale r6 = o.WheelView.OnWheelViewListener.getMax
            java.lang.String r1 = o.NebulaLoadingView.AnonymousClass1.getMin((java.util.Locale) r6, (long) r0, (java.lang.String) r5)
            goto L_0x00ab
        L_0x00a7:
            java.lang.String r1 = r7.getSubtitle()
        L_0x00ab:
            if (r1 != 0) goto L_0x00b1
        L_0x00ad:
            java.lang.String r1 = r7.getSubtitle()
        L_0x00b1:
            r7.setSubtitle(r1)
            return r7
        L_0x00b5:
            r7.setUserInvestmentInfo(r6)
            r7.setSubtitleIsBelow(r3)
            android.content.Context r6 = r5.setMax
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131887638(0x7f120616, float:1.9409889E38)
            java.lang.String r6 = r6.getString(r0)
            r7.setTitle(r6)
            java.lang.String r6 = r7.getSubtitle()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x00dc
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r6 = 0
            goto L_0x00dd
        L_0x00dc:
            r6 = 1
        L_0x00dd:
            if (r6 == 0) goto L_0x00e9
            android.content.Context r5 = r5.setMax
            r6 = 2131887635(0x7f120613, float:1.9409883E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x00f8
        L_0x00e9:
            android.content.Context r5 = r5.setMax
            java.lang.String r6 = r7.getSubtitle()
            java.lang.String r0 = "model.subtitle"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            java.lang.String r5 = length(r5, r6)
        L_0x00f8:
            r7.setSubtitle(r5)
            java.lang.String r5 = r7.getCollection()
            if (r5 == 0) goto L_0x011d
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x010c
            r6 = 1
            goto L_0x010d
        L_0x010c:
            r6 = 0
        L_0x010d:
            if (r6 == 0) goto L_0x0110
            r1 = r5
        L_0x0110:
            if (r1 == 0) goto L_0x011d
            java.lang.String r5 = "setting_category_user_service"
            boolean r5 = kotlin.text.StringsKt.equals(r5, r1, r3)
            if (r5 == 0) goto L_0x011d
            r7.setEnable(r2)
        L_0x011d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.hideShareMenu.setMax(o.hideShareMenu, o.getWorkSpaceId, id.dana.domain.profilemenu.model.SettingModel):id.dana.domain.profilemenu.model.SettingModel");
    }
}
