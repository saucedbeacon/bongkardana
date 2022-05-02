package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.R;
import id.dana.di.PerActivity;
import id.dana.oauth.OauthConstant;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import o.GriverOpenAuthExtension;
import o.convertDipToPx;
import o.dispatchOnPageScrolled;
import o.getAssetUrl;
import o.getCharset;
import o.isDomainMatch;
import o.isSdkMatch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J>\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016JT\u0010$\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010\u00182\b\u0010'\u001a\u0004\u0018\u00010\u00182\b\u0010(\u001a\u0004\u0018\u00010\u0018H\u0016J>\u0010)\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010\b\u001a\u00020\u001bH\u0016J\u0012\u0010\u0012\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001bH\u0002J\b\u0010-\u001a\u00020\u001bH\u0016JJ\u0010.\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010\u0018H\u0016JT\u0010.\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\b\u0010&\u001a\u0004\u0018\u00010\u00182\b\u00100\u001a\u0004\u0018\u00010\u0018H\u0016J\u001a\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\"2\b\u00103\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u00104\u001a\u00020\u001b2\b\u00103\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u00105\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lid/dana/contract/oauth/OauthGrantPresenter;", "Lid/dana/contract/oauth/OauthGrantContract$Presenter;", "getScopes", "Lid/dana/domain/oauth/interactor/GetScopes;", "view", "Lid/dana/contract/oauth/OauthGrantContract$View;", "oauthInitModelMapper", "Lid/dana/oauth/mapper/OauthInitModelMapper;", "getPhoneNumber", "Lid/dana/domain/account/interactor/GetPhoneNumber;", "confirmScopes", "Lid/dana/domain/oauth/interactor/ConfirmScopes;", "gnAuthAgreement", "Lid/dana/domain/oauth/interactor/GnAuthAgreement;", "gnAuthApply", "Lid/dana/domain/oauth/interactor/GnAuthApply;", "getGnBindingBenefits", "Lid/dana/domain/oauth/interactor/GetGnBindingBenefits;", "getShowAlipayConnectBrandConfig", "Lid/dana/domain/featureconfig/interactor/GetShowAlipayConnectBrandConfig;", "context", "Landroid/content/Context;", "(Lid/dana/domain/oauth/interactor/GetScopes;Lid/dana/contract/oauth/OauthGrantContract$View;Lid/dana/oauth/mapper/OauthInitModelMapper;Lid/dana/domain/account/interactor/GetPhoneNumber;Lid/dana/domain/oauth/interactor/ConfirmScopes;Lid/dana/domain/oauth/interactor/GnAuthAgreement;Lid/dana/domain/oauth/interactor/GnAuthApply;Lid/dana/domain/oauth/interactor/GetGnBindingBenefits;Lid/dana/domain/featureconfig/interactor/GetShowAlipayConnectBrandConfig;Landroid/content/Context;)V", "merchantSiteNameTemp", "", "tag", "confirmScope", "", "codeChallenge", "clientId", "scopeIds", "", "redirectUrl", "needMobileToken", "", "getBindingBenefits", "getGnAuthAgreement", "netAuthId", "subMerchantId", "signature", "refferingLink", "getOauthScope", "oauthInitModel", "Lid/dana/oauth/model/OauthInitModel;", "handleError", "onDestroy", "submitGnAuthApply", "state", "securityId", "trackGnMerchantAccountBind", "success", "failedReason", "trackGnMerchantLoadingState", "trackGnMerchantRequestOpen", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class infoForPosition implements dispatchOnPageScrolled.length {
    private final GriverOpenAuthExtension.RevokeCallback IsOverlapping;
    private final writeImage equals;
    /* access modifiers changed from: private */
    public final handleSnapshot getMax;
    private final getAssetUrl getMin;
    private final isSdkMatch isInside;
    private String length = "";
    /* access modifiers changed from: private */
    public final String setMax = Reflection.getOrCreateKotlinClass(infoForPosition.class).getSimpleName();
    /* access modifiers changed from: private */
    public final dispatchOnPageScrolled.getMax setMin;
    private final Context toDoubleRange;
    private final getCharset toFloatRange;
    private final isDomainMatch toIntRange;
    private final loadData values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "showAlipayConnectBrandConfig", "Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<shouldOverrideUrlLoading, Unit> {
        final /* synthetic */ captureNXView $oauthInitModel;
        final /* synthetic */ infoForPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(infoForPosition infoforposition, captureNXView capturenxview) {
            super(1);
            this.this$0 = infoforposition;
            this.$oauthInitModel = capturenxview;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((shouldOverrideUrlLoading) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull shouldOverrideUrlLoading shouldoverrideurlloading) {
            Intrinsics.checkNotNullParameter(shouldoverrideurlloading, "showAlipayConnectBrandConfig");
            this.this$0.setMin.showAlipayConnectBrand(this.$oauthInitModel, shouldoverrideurlloading);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ infoForPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(infoForPosition infoforposition) {
            super(1);
            this.this$0 = infoforposition;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.this$0.setMin.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.setMax, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "gnBindingBenefits", "", "Lid/dana/domain/oauth/model/GnBindingBenefit;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<List<? extends getAssetContent>, Unit> {
        final /* synthetic */ infoForPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(infoForPosition infoforposition) {
            super(1);
            this.this$0 = infoforposition;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<getAssetContent>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<getAssetContent> list) {
            Intrinsics.checkNotNullParameter(list, "gnBindingBenefits");
            this.this$0.setMin.onGetBindingBenefitsSuccess(handleSaveToGallery.getMin(new ArrayList(list)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ infoForPosition this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(infoForPosition infoforposition) {
            super(1);
            this.this$0 = infoforposition;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            this.this$0.setMin.onError(th.getMessage());
            updateActionSheetContent.e(this.this$0.setMax, th.getMessage());
        }
    }

    @Inject
    public infoForPosition(@NotNull getAssetUrl getasseturl, @NotNull dispatchOnPageScrolled.getMax getmax, @NotNull handleSnapshot handlesnapshot, @NotNull GriverOpenAuthExtension.RevokeCallback revokeCallback, @NotNull getCharset getcharset, @NotNull isSdkMatch issdkmatch, @NotNull isDomainMatch isdomainmatch, @NotNull writeImage writeimage, @NotNull loadData loaddata, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(getasseturl, "getScopes");
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(handlesnapshot, "oauthInitModelMapper");
        Intrinsics.checkNotNullParameter(revokeCallback, Constants.JS_API_GET_PHONE_NUMBER);
        Intrinsics.checkNotNullParameter(getcharset, "confirmScopes");
        Intrinsics.checkNotNullParameter(issdkmatch, "gnAuthAgreement");
        Intrinsics.checkNotNullParameter(isdomainmatch, "gnAuthApply");
        Intrinsics.checkNotNullParameter(writeimage, "getGnBindingBenefits");
        Intrinsics.checkNotNullParameter(loaddata, "getShowAlipayConnectBrandConfig");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = getasseturl;
        this.setMin = getmax;
        this.getMax = handlesnapshot;
        this.IsOverlapping = revokeCallback;
        this.toFloatRange = getcharset;
        this.isInside = issdkmatch;
        this.toIntRange = isdomainmatch;
        this.equals = writeimage;
        this.values = loaddata;
        this.toDoubleRange = context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/oauth/OauthGrantPresenter$getOauthScope$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/oauth/model/OauthInit;", "onError", "", "e", "", "onNext", "oauthInit", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<getMD5String> {
        final /* synthetic */ List getMax;
        final /* synthetic */ infoForPosition length;

        setMax(infoForPosition infoforposition, List list) {
            this.length = infoforposition;
            this.getMax = list;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getMD5String getmd5string = (getMD5String) obj;
            Intrinsics.checkNotNullParameter(getmd5string, "oauthInit");
            this.length.getMax.setMax = this.getMax;
            this.length.setMin.onGetOauthScopeSuccess((captureNXView) this.length.getMax.apply(getmd5string));
            this.length.setMin.dismissProgress();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.length.setMin.onOauthError("", "", OauthConstant.ErrorPathOauth.TRY_AGAIN);
            this.length.setMin.dismissProgress();
        }
    }

    public final void setMin(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, boolean z) {
        this.setMin.showProgress();
        this.getMin.execute(new setMax(this, list), getAssetUrl.getMin.forGetScopeList(str, str2, list, str3, z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/oauth/OauthGrantPresenter$confirmScope$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/oauth/model/OauthConfirmation;", "onError", "", "e", "", "onNext", "oauthConfirmation", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<getMD5Digest> {
        final /* synthetic */ infoForPosition setMin;

        getMax(infoForPosition infoforposition) {
            this.setMin = infoforposition;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getMD5Digest getmd5digest = (getMD5Digest) obj;
            Intrinsics.checkNotNullParameter(getmd5digest, "oauthConfirmation");
            this.setMin.setMin.dismissConfirmProgress();
            this.setMin.setMin.onConfirmOauthScopeSuccess(getmd5digest.getMobileAuthCode(), getmd5digest.getServerAuthCode());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.setMin.setMin.onOauthError("", "", OauthConstant.ErrorPathOauth.TRY_AGAIN);
            this.setMin.setMin.dismissConfirmProgress();
        }
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, boolean z) {
        this.setMin.showConfirmProgress();
        this.toFloatRange.execute(new getMax(this), getCharset.getMax.forConfirmScopes(str, str2, list, str3, z));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/oauth/OauthGrantPresenter$getGnAuthAgreement$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/authcode/AuthCodeResult;", "onError", "", "e", "", "onNext", "authCodeResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends GriverAppVirtualHostProxy<SplashEntryInfo> {
        final /* synthetic */ infoForPosition getMax;

        getMin(infoForPosition infoforposition) {
            this.getMax = infoforposition;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SplashEntryInfo splashEntryInfo = (SplashEntryInfo) obj;
            Intrinsics.checkNotNullParameter(splashEntryInfo, "authCodeResult");
            this.getMax.setMin.dismissProgress();
            dispatchOnPageScrolled.getMax max = this.getMax.setMin;
            handleSnapshot unused = this.getMax.getMax;
            max.onGetOauthScopeSuccess(handleSnapshot.getMin(splashEntryInfo));
            infoForPosition.length(this.getMax, (String) null);
            infoForPosition infoforposition = this.getMax;
            handleSnapshot unused2 = infoforposition.getMax;
            captureNXView min = handleSnapshot.getMin(splashEntryInfo);
            Intrinsics.checkNotNullExpressionValue(min, "oauthInitModelMapper.map(authCodeResult)");
            infoForPosition.getMin(infoforposition, min);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            infoForPosition.length(this.getMax, th.getMessage());
            super.onError(th);
            this.getMax.setMin.onOauthError("", "", OauthConstant.ErrorPathOauth.TRY_AGAIN);
            this.getMax.setMin.dismissProgress();
        }
    }

    public final void setMax(@Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.setMin.showProgress();
        this.isInside.execute(new getMin(this), new isSdkMatch.setMax(str, list, str2, str3, str4, str5, str6));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/oauth/OauthGrantPresenter$submitGnAuthApply$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/authcode/AuthCodeResult;", "onError", "", "e", "", "onNext", "authCodeResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends GriverAppVirtualHostProxy<SplashEntryInfo> {
        final /* synthetic */ infoForPosition setMin;

        IsOverlapping(infoForPosition infoforposition) {
            this.setMin = infoforposition;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SplashEntryInfo splashEntryInfo = (SplashEntryInfo) obj;
            Intrinsics.checkNotNullParameter(splashEntryInfo, "authCodeResult");
            this.setMin.setMin.dismissConfirmProgress();
            if (splashEntryInfo.isSuccess()) {
                this.setMin.setMin.onGetGnAuthCodeSuccess(splashEntryInfo.getAuthCode(), splashEntryInfo.getState());
            } else {
                this.setMin.setMin.onGetGnAuthCodeRiskFailed(splashEntryInfo.getSecurityId());
            }
            infoForPosition.getMax(this.setMin, splashEntryInfo.isSuccess(), splashEntryInfo.getErrorMessage());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.setMin.setMin.onOauthError("", "", OauthConstant.ErrorPathOauth.TRY_AGAIN);
            this.setMin.setMin.dismissConfirmProgress();
            infoForPosition.getMax(this.setMin, false, th.getMessage());
        }
    }

    public final void setMax(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.setMin.showConfirmProgress();
        this.toIntRange.execute(new IsOverlapping(this), new isDomainMatch.getMin(str, str2, list, str3, str4, str5, ""));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/oauth/OauthGrantPresenter$submitGnAuthApply$2", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/authcode/AuthCodeResult;", "onError", "", "e", "", "onNext", "authCodeResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends GriverAppVirtualHostProxy<SplashEntryInfo> {
        final /* synthetic */ infoForPosition setMax;

        toFloatRange(infoForPosition infoforposition) {
            this.setMax = infoforposition;
        }

        public final /* synthetic */ void onNext(Object obj) {
            SplashEntryInfo splashEntryInfo = (SplashEntryInfo) obj;
            Intrinsics.checkNotNullParameter(splashEntryInfo, "authCodeResult");
            this.setMax.setMin.dismissConfirmProgress();
            this.setMax.setMin.onGetGnAuthCodeSuccess(splashEntryInfo.getAuthCode(), splashEntryInfo.getState());
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.setMax.setMin.onOauthError("", "", OauthConstant.ErrorPathOauth.TRY_AGAIN);
            this.setMax.setMin.dismissConfirmProgress();
            infoForPosition.getMax(this.setMax, false, th.getMessage());
        }
    }

    public final void getMin(@Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.setMin.showConfirmProgress();
        this.toIntRange.execute(new toFloatRange(this), new isDomainMatch.getMin(str, str2, list, str3, str4, str5, str6));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/oauth/OauthGrantPresenter$getPhoneNumber$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "phone", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ infoForPosition setMax;

        equals(infoForPosition infoforposition) {
            this.setMax = infoforposition;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "phone");
            this.setMax.setMin.onGetPhoneNumberSuccess(str);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            super.onError(th);
            this.setMax.setMin.onOauthError("", "", OauthConstant.ErrorPathOauth.TRY_AGAIN);
        }
    }

    public final void getMin() {
        this.IsOverlapping.execute(new equals(this));
    }

    public final void setMin() {
        this.equals.execute(onReceivedIcon.INSTANCE, new setMin(this), new length(this));
    }

    public final void setMax(@Nullable captureNXView capturenxview) {
        this.values.execute(onReceivedIcon.INSTANCE, new isInside(this, capturenxview), new toIntRange(this));
    }

    public final void setMax() {
        this.getMin.dispose();
        this.IsOverlapping.dispose();
        this.toFloatRange.dispose();
        this.isInside.dispose();
        this.toIntRange.dispose();
        this.equals.dispose();
        this.values.dispose();
    }

    public static final /* synthetic */ void length(infoForPosition infoforposition, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(infoforposition.toDoubleRange);
        length2.getMax = TrackerKey.Event.LOADING_STATE;
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (ScreenBrightnessBridgeExtension.Grayscale$Algorithm().length() > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension3 = ScreenBrightnessBridgeExtension.getMin;
            String format = String.format("Binding %s-%s", Arrays.copyOf(new Object[]{ScreenBrightnessBridgeExtension.Grayscale$Algorithm(), ScreenBrightnessBridgeExtension.values()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            length2.setMax("Purpose", format);
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension4 = ScreenBrightnessBridgeExtension.getMin;
            String format2 = String.format("Binding %s-%s", Arrays.copyOf(new Object[]{infoforposition.toDoubleRange.getString(R.string.dana_string), ScreenBrightnessBridgeExtension.values()}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            length2.setMax("Purpose", format2);
        }
        if (str != null) {
            length2.setMax(TrackerKey.Property.FAIL_REASON, str);
            length2.setMin("Success", false);
        } else {
            length2.setMin("Success", true);
        }
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ void getMin(infoForPosition infoforposition, captureNXView capturenxview) {
        convertDipToPx.length length2 = new convertDipToPx.length(infoforposition.toDoubleRange);
        length2.getMax = TrackerKey.Event.ACCESS_REQUEST_OPEN;
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (ScreenBrightnessBridgeExtension.Grayscale$Algorithm().length() > 0) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            length2.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
        } else {
            length2.setMax("Merchant Name", infoforposition.toDoubleRange.getString(R.string.dana_string));
        }
        if (capturenxview.getMax != null) {
            String str = capturenxview.getMax;
            Intrinsics.checkNotNullExpressionValue(str, "oauthInitModel.merchantName");
            infoforposition.length = str;
        }
        length2.setMax(TrackerKey.BindingProperties.MERCHANT_SITE_NAME, infoforposition.length);
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ void getMax(infoForPosition infoforposition, boolean z, String str) {
        convertDipToPx.length length2 = new convertDipToPx.length(infoforposition.toDoubleRange);
        length2.getMax = TrackerKey.Event.ACCOUNT_BIND;
        convertDipToPx.length min = length2.setMin("Success", z);
        if (str != null) {
            min.setMax(TrackerKey.Property.FAIL_REASON, str);
        }
        ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension = ScreenBrightnessBridgeExtension.getMin;
        if (ScreenBrightnessBridgeExtension.Grayscale$Algorithm().length() > 0) {
            ScreenBrightnessBridgeExtension screenBrightnessBridgeExtension2 = ScreenBrightnessBridgeExtension.getMin;
            min.setMax("Merchant Name", ScreenBrightnessBridgeExtension.Grayscale$Algorithm());
        } else {
            min.setMax("Merchant Name", infoforposition.toDoubleRange.getString(R.string.dana_string));
        }
        min.setMax(TrackerKey.BindingProperties.MERCHANT_SITE_NAME, infoforposition.length);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }
}
