package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvLocationInfo;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.android.biz.common.constants.ACConstants;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/data/social/core/SecureBaseNetwork;", "T", "Lid/dana/data/social/core/BaseNetwork;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "(Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;Lid/dana/data/rpc/RpcConnector;)V", "getApSecurityFacade", "()Lid/dana/data/foundation/facade/ApSecurityFacade;", "generateMobileEnvInfo", "Lcom/alipayplus/mobile/component/common/facade/base/MobileEnvInfo;", "generateMobileEnvLocaltionInfo", "Lcom/alipayplus/mobile/component/common/facade/base/MobileEnvLocationInfo;", "getAppVersion", "", "kotlin.jvm.PlatformType", "normalizePhoneNumber", "originFormat", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class getLocalPermissionDialog<T> extends setPermissionModel<T> {
    @NotNull
    private final onAppResume apSecurityFacade;

    @NotNull
    public final onAppResume getApSecurityFacade() {
        return this.apSecurityFacade;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getLocalPermissionDialog(@NotNull onAppResume onappresume, @NotNull Context context, @NotNull setIsUrgentResource setisurgentresource) {
        super(context, setisurgentresource);
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        this.apSecurityFacade = onappresume;
    }

    @NotNull
    public final MobileEnvInfo generateMobileEnvInfo() {
        MobileEnvInfo mobileEnvInfo = new MobileEnvInfo();
        mobileEnvInfo.tokenId = this.apSecurityFacade.getApdidToken();
        mobileEnvInfo.clientIp = "";
        mobileEnvInfo.terminalType = ACConstants.MerchantType.IS_APP;
        mobileEnvInfo.osType = "android";
        mobileEnvInfo.sourcePlatForm = "MAIN_APP";
        mobileEnvInfo.osVersion = Build.VERSION.RELEASE;
        mobileEnvInfo.locationInfo = generateMobileEnvLocaltionInfo();
        mobileEnvInfo.appVersion = getAppVersion();
        mobileEnvInfo.extendInfo = MapsKt.emptyMap();
        return mobileEnvInfo;
    }

    private final String getAppVersion() {
        try {
            return getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private final MobileEnvLocationInfo generateMobileEnvLocaltionInfo() {
        MobileEnvLocationInfo mobileEnvLocationInfo = new MobileEnvLocationInfo();
        LBSLocation latestLocation = handlePushWindow.getLatestLocation(getContext());
        Intrinsics.checkNotNullExpressionValue(latestLocation, "it");
        mobileEnvLocationInfo.latitude = String.valueOf(latestLocation.getLatitude());
        mobileEnvLocationInfo.longitude = String.valueOf(latestLocation.getLongitude());
        mobileEnvLocationInfo.updateTime = latestLocation.getTime();
        mobileEnvLocationInfo.type = latestLocation.getType();
        mobileEnvLocationInfo.status = String.valueOf(latestLocation.getErrorCode());
        return mobileEnvLocationInfo;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String normalizePhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "originFormat");
        try {
            Phonenumber.PhoneNumber parse = PhoneNumberUtil.createInstance(getContext()).parse(str, "ID");
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getCountryCode());
            sb.append('-');
            sb.append(parse.getNationalNumber());
            return sb.toString();
        } catch (NumberParseException unused) {
            return str;
        }
    }
}
