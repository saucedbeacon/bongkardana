package o;

import java.util.ArrayList;
import java.util.List;

public class getWidthAndHeight {
    public SplashEntryInfo transform(maybeSetTextColor maybesettextcolor) {
        if (maybesettextcolor == null) {
            return null;
        }
        SplashEntryInfo splashEntryInfo = new SplashEntryInfo();
        uncheckAllItems.transform(splashEntryInfo, maybesettextcolor);
        splashEntryInfo.setAuthCode(maybesettextcolor.getAuthCode());
        splashEntryInfo.setState(maybesettextcolor.getState());
        splashEntryInfo.setMerchantRedirectUrl(maybesettextcolor.getMerchantRedirectUrl());
        splashEntryInfo.setAction(maybesettextcolor.getAction());
        splashEntryInfo.setPhoneNumber(maybesettextcolor.getPhoneNumber());
        splashEntryInfo.setRiskPhoneNumber(maybesettextcolor.getRiskPhoneNumber());
        splashEntryInfo.setSecurityId(maybesettextcolor.getSecurityId());
        splashEntryInfo.setMerchantInfo(transform(maybesettextcolor.getMerchantInfo()));
        splashEntryInfo.setAgreements(transform(maybesettextcolor.getAgreements()));
        splashEntryInfo.setMobileAuthCode(maybesettextcolor.getMobileAuthCode());
        return splashEntryInfo;
    }

    public MD5Util transform(canAsyncFallback canasyncfallback) {
        if (canasyncfallback == null) {
            return null;
        }
        MD5Util mD5Util = new MD5Util();
        mD5Util.setMerchantLogo(canasyncfallback.getMerchantLogo());
        mD5Util.setMerchantPCLogo(canasyncfallback.getMerchantPCLogo());
        mD5Util.setMerchantName(canasyncfallback.getMerchantName());
        return mD5Util;
    }

    public List<base64> transform(List<originUrl> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (originUrl next : list) {
            base64 base64 = new base64();
            base64.setDescription(next.getDescription());
            base64.setTitle(next.getTitle());
            arrayList.add(base64);
        }
        return arrayList;
    }
}
