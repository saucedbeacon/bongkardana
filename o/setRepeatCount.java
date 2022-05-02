package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvLocationInfo;
import com.iap.ac.android.biz.common.constants.ACConstants;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber;
import java.util.HashMap;

public abstract class setRepeatCount<T> extends addAnimatorUpdateListener<T> {
    private final Context context;
    private final onAppResume securityFacade;

    public setRepeatCount(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        super(setisurgentresource, appxloadfailed);
        this.securityFacade = onappresume;
        this.context = context2;
    }

    public Context getContext() {
        return this.context;
    }

    /* access modifiers changed from: protected */
    public String getClientKey() {
        onAppResume onappresume = this.securityFacade;
        if (onappresume == null) {
            return null;
        }
        return onappresume.getClientKey();
    }

    public Context passContext() {
        return getContext();
    }

    @NonNull
    public MobileEnvInfo generateMobileEnvInfo() {
        MobileEnvInfo mobileEnvInfo = new MobileEnvInfo();
        mobileEnvInfo.tokenId = this.securityFacade.getApdidToken();
        String str = "";
        mobileEnvInfo.clientIp = str;
        mobileEnvInfo.terminalType = ACConstants.MerchantType.IS_APP;
        mobileEnvInfo.osType = "android";
        mobileEnvInfo.sourcePlatForm = "MAIN_APP";
        mobileEnvInfo.osVersion = Build.VERSION.RELEASE;
        mobileEnvInfo.locationInfo = generateMobileEnvLocationInfo();
        try {
            str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        mobileEnvInfo.appVersion = str;
        mobileEnvInfo.extendInfo = new HashMap();
        return mobileEnvInfo;
    }

    private MobileEnvLocationInfo generateMobileEnvLocationInfo() {
        LBSLocation latestLocation = handlePushWindow.getLatestLocation(this.context);
        MobileEnvLocationInfo mobileEnvLocationInfo = new MobileEnvLocationInfo();
        try {
            mobileEnvLocationInfo.latitude = String.valueOf(latestLocation.getLatitude());
            mobileEnvLocationInfo.longitude = String.valueOf(latestLocation.getLongitude());
            mobileEnvLocationInfo.updateTime = latestLocation.getTime();
            mobileEnvLocationInfo.type = latestLocation.getType();
            mobileEnvLocationInfo.status = String.valueOf(latestLocation.getErrorCode());
        } catch (Exception unused) {
        }
        return mobileEnvLocationInfo;
    }

    /* access modifiers changed from: protected */
    public String normalizePhoneNumber(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-245531340, oncanceled);
            onCancelLoad.getMin(-245531340, oncanceled);
        }
        try {
            Phonenumber.PhoneNumber parse = PhoneNumberUtil.createInstance(this.context).parse(str, "ID");
            int countryCode = parse.getCountryCode();
            long nationalNumber = parse.getNationalNumber();
            StringBuilder sb = new StringBuilder();
            sb.append(countryCode);
            sb.append("-");
            sb.append(nationalNumber);
            return sb.toString();
        } catch (NumberParseException unused) {
            return str;
        }
    }
}
