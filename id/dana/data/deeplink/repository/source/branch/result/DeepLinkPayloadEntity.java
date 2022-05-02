package id.dana.data.deeplink.repository.source.branch.result;

import androidx.annotation.Keep;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import o.onActivityPreCreated;
import o.updateActionSheetContent;

@Keep
public class DeepLinkPayloadEntity {
    private static final String TAG = DeepLinkPayloadEntity.class.getSimpleName();
    private static long getMax = 0;
    private static int getMin = 1;
    private static int setMin;
    public String acqSiteId;
    public String action;
    public String android_url;
    public String authCode;
    public String bindDanaType;
    public String clientId;
    public String codeChallenge;
    public String codeValue;
    public String destinationPath;
    public String encodedParams;
    public String encoding;
    public String extendedInfo;
    public String fullUrl;
    public String innerUrl;
    public boolean isNeedAuth;
    public String mcc;
    public String merchantId;
    public String merchantName;
    public boolean needMobileToken;
    public String netAuthId;
    public String orderId;
    public String ott;
    public String params;
    public String path;
    public String paySiteId;
    public String phoneNumber;
    public String promoCode;
    public String redirectUrl;
    public String referralCode;
    public String referringLink;
    public String responseType;
    public String scope;
    public String serviceKey;
    public String shortCode;
    public String signature;
    public boolean skipHomePage;
    public String source;
    public String state;
    public String terminalType;
    public String url;

    static void setMin() {
        getMax = 7816011268412119025L;
    }

    static {
        setMin();
        int i = getMin + 49;
        setMin = i % 128;
        if ((i % 2 != 0 ? 15 : Typography.greater) != '>') {
            Object obj = null;
            super.hashCode();
        }
    }

    public String getExtendedInfo() {
        int i = setMin + 45;
        getMin = i % 128;
        int i2 = i % 2;
        String str = this.extendedInfo;
        int i3 = getMin + 95;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setExtendedInfo(String str) {
        int i = getMin + 119;
        setMin = i % 128;
        if (i % 2 != 0) {
            this.extendedInfo = str;
            Object[] objArr = null;
            int length = objArr.length;
            return;
        }
        try {
            this.extendedInfo = str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getInnerUrl() {
        String str;
        int i = getMin + 99;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                str = this.innerUrl;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.innerUrl;
        }
        try {
            int i2 = getMin + 37;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setInnerUrl(String str) {
        try {
            int i = getMin + 95;
            try {
                setMin = i % 128;
                boolean z = i % 2 != 0;
                this.innerUrl = str;
                if (z) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getDestinationPath() {
        int i = setMin + 39;
        getMin = i % 128;
        int i2 = i % 2;
        String str = this.destinationPath;
        int i3 = getMin + 39;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setDestinationPath(String str) {
        int i = getMin + 103;
        setMin = i % 128;
        if ((i % 2 != 0 ? (char) 25 : 27) != 25) {
            this.destinationPath = str;
            return;
        }
        try {
            this.destinationPath = str;
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getOrderId() {
        int i = getMin + 103;
        setMin = i % 128;
        int i2 = i % 2;
        String str = this.orderId;
        int i3 = getMin + 105;
        setMin = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public void setOrderId(String str) {
        try {
            int i = setMin + 77;
            getMin = i % 128;
            boolean z = false;
            boolean z2 = i % 2 != 0;
            Object[] objArr = null;
            this.orderId = str;
            if (!z2) {
                int length = objArr.length;
            }
            int i2 = getMin + 89;
            setMin = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (!z) {
                super.hashCode();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public String getPath() {
        int i = setMin + 79;
        getMin = i % 128;
        int i2 = i % 2;
        String str = this.path;
        int i3 = getMin + 65;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setPath(String str) {
        int i = setMin + 19;
        getMin = i % 128;
        int i2 = i % 2;
        this.path = str;
        int i3 = getMin + 85;
        setMin = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getFullUrl() {
        int i = setMin + 7;
        getMin = i % 128;
        if ((i % 2 == 0 ? 22 : 'V') != 22) {
            try {
                return this.fullUrl;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String str = this.fullUrl;
            Object obj = null;
            super.hashCode();
            return str;
        }
    }

    public void setFullUrl(String str) {
        int i = getMin + 23;
        setMin = i % 128;
        char c = i % 2 != 0 ? 'E' : '\\';
        this.fullUrl = str;
        if (c == 'E') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public String getShortCode() {
        int i = getMin + 67;
        setMin = i % 128;
        if (!(i % 2 != 0)) {
            return this.shortCode;
        }
        String str = this.shortCode;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public void setShortCode(String str) {
        int i = getMin + 117;
        setMin = i % 128;
        int i2 = i % 2;
        this.shortCode = str;
        int i3 = getMin + 21;
        setMin = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getReferralCode() {
        int i = setMin + 69;
        getMin = i % 128;
        if ((i % 2 == 0 ? 'Q' : '3') != 'Q') {
            return this.referralCode;
        }
        try {
            String str = this.referralCode;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setReferralCode(String str) {
        int i = setMin + 3;
        getMin = i % 128;
        int i2 = i % 2;
        this.referralCode = str;
        try {
            int i3 = setMin + 69;
            try {
                getMin = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    int i4 = 65 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getAction() {
        int i = getMin + 37;
        setMin = i % 128;
        if ((i % 2 != 0 ? ';' : 'N') != ';') {
            try {
                return this.action;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String str = this.action;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        }
    }

    public void setAction(String str) {
        try {
            int i = getMin + 33;
            setMin = i % 128;
            boolean z = i % 2 != 0;
            Object obj = null;
            this.action = str;
            if (z) {
                super.hashCode();
            }
            try {
                int i2 = setMin + 27;
                getMin = i2 % 128;
                if ((i2 % 2 == 0 ? ':' : '@') == ':') {
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean isSkipHomePage() {
        int i = setMin + 89;
        getMin = i % 128;
        int i2 = i % 2;
        boolean z = this.skipHomePage;
        int i3 = setMin + 9;
        getMin = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        int i4 = 25 / 0;
        return z;
    }

    public void setSkipHomePage(boolean z) {
        int i = setMin + 45;
        getMin = i % 128;
        if ((i % 2 == 0 ? 'X' : '=') != 'X') {
            this.skipHomePage = z;
            return;
        }
        try {
            this.skipHomePage = z;
            Object[] objArr = null;
            int length = objArr.length;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getResponseType() {
        int i = getMin + 17;
        setMin = i % 128;
        int i2 = i % 2;
        String str = this.responseType;
        int i3 = getMin + 125;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setResponseType(String str) {
        int i = getMin + 95;
        setMin = i % 128;
        if (i % 2 != 0) {
            try {
                this.responseType = str;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                this.responseType = str;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = setMin + 23;
        getMin = i2 % 128;
        int i3 = i2 % 2;
    }

    public String getClientId() {
        try {
            int i = setMin + 61;
            getMin = i % 128;
            if (!(i % 2 == 0)) {
                return this.clientId;
            }
            int i2 = 67 / 0;
            return this.clientId;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setClientId(String str) {
        int i = getMin + 109;
        setMin = i % 128;
        boolean z = i % 2 != 0;
        this.clientId = str;
        if (z) {
            int i2 = 55 / 0;
        }
    }

    public String getPhoneNumber() {
        String str;
        int i = setMin + 121;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            str = this.phoneNumber;
        } else {
            str = this.phoneNumber;
            int i2 = 87 / 0;
        }
        int i3 = getMin + 35;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setPhoneNumber(String str) {
        int i = getMin + 111;
        setMin = i % 128;
        int i2 = i % 2;
        this.phoneNumber = str;
        int i3 = getMin + 27;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? 'Y' : '(') != '(') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public String getScope() {
        String str;
        try {
            int i = setMin + 11;
            getMin = i % 128;
            if ((i % 2 == 0 ? 'T' : '@') != 'T') {
                try {
                    str = this.scope;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                str = this.scope;
                Object obj = null;
                super.hashCode();
            }
            int i2 = getMin + 43;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setScope(String str) {
        int i = getMin + 63;
        setMin = i % 128;
        char c = i % 2 != 0 ? '5' : 'b';
        this.scope = str;
        if (c != 'b') {
            int i2 = 45 / 0;
        }
    }

    public String getState() {
        int i = getMin + 35;
        setMin = i % 128;
        int i2 = i % 2;
        String str = this.state;
        try {
            int i3 = setMin + 123;
            getMin = i3 % 128;
            if ((i3 % 2 == 0 ? '!' : '@') == '@') {
                return str;
            }
            int i4 = 3 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setState(String str) {
        int i = setMin + 99;
        getMin = i % 128;
        if ((i % 2 == 0 ? 12 : 'T') != 'T') {
            try {
                this.state = str;
                int i2 = 56 / 0;
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.state = str;
        }
        int i3 = getMin + 119;
        setMin = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getCodeChallenge() {
        String str;
        int i = getMin + 51;
        setMin = i % 128;
        if ((i % 2 != 0 ? '3' : 12) != '3') {
            try {
                str = this.codeChallenge;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                str = this.codeChallenge;
                Object obj = null;
                super.hashCode();
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = getMin + 11;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public void setCodeChallenge(String str) {
        try {
            int i = getMin + 49;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                this.codeChallenge = str;
                int i3 = getMin + 71;
                setMin = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 66 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getRedirectUrl() {
        try {
            int i = getMin + 3;
            setMin = i % 128;
            int i2 = i % 2;
            String str = this.redirectUrl;
            int i3 = setMin + 15;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setRedirectUrl(String str) {
        int i = getMin + 89;
        setMin = i % 128;
        int i2 = i % 2;
        this.redirectUrl = str;
        int i3 = getMin + 29;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? '`' : '-') != '-') {
            int i4 = 35 / 0;
        }
    }

    public boolean isNeedMobileToken() {
        boolean z;
        int i = setMin + 29;
        getMin = i % 128;
        if ((i % 2 == 0 ? 'b' : 8) != 'b') {
            try {
                z = this.needMobileToken;
            } catch (Exception e) {
                throw e;
            }
        } else {
            z = this.needMobileToken;
            Object[] objArr = null;
            int length = objArr.length;
        }
        try {
            int i2 = setMin + 29;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            return z;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setNeedMobileToken(boolean z) {
        int i = setMin + 73;
        getMin = i % 128;
        if ((i % 2 == 0 ? '4' : '1') != '4') {
            try {
                this.needMobileToken = z;
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.needMobileToken = z;
            int i2 = 17 / 0;
        }
    }

    public String getPromoCode() {
        int i = setMin + 47;
        getMin = i % 128;
        int i2 = i % 2;
        String str = this.promoCode;
        int i3 = getMin + 23;
        setMin = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public void setPromoCode(String str) {
        int i = getMin + 117;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            this.promoCode = str;
            int i3 = getMin + 53;
            setMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getSource() {
        int i = setMin + 67;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                return this.source;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String str = this.source;
            Object obj = null;
            super.hashCode();
            return str;
        }
    }

    public String getBindDanaType() {
        int i = getMin + 59;
        setMin = i % 128;
        if (i % 2 == 0) {
            return this.bindDanaType;
        }
        int i2 = 9 / 0;
        return this.bindDanaType;
    }

    public void setBindDanaType(String str) {
        int i = getMin + 113;
        setMin = i % 128;
        if ((i % 2 != 0 ? 25 : '8') != '8') {
            try {
                this.bindDanaType = str;
                Object[] objArr = null;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            this.bindDanaType = str;
        }
        int i2 = getMin + 119;
        setMin = i2 % 128;
        if ((i2 % 2 != 0 ? '4' : 16) != 16) {
            int i3 = 24 / 0;
        }
    }

    public String getAcqSiteId() {
        String str;
        int i = setMin + 89;
        getMin = i % 128;
        if (!(i % 2 != 0)) {
            str = this.acqSiteId;
            int i2 = 68 / 0;
        } else {
            try {
                str = this.acqSiteId;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = getMin + 37;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? 'a' : Typography.greater) == '>') {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public void setAcqSiteId(String str) {
        int i = getMin + 101;
        setMin = i % 128;
        int i2 = i % 2;
        this.acqSiteId = str;
        int i3 = setMin + 41;
        getMin = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
        }
    }

    public String getMerchantId() {
        String str;
        int i = getMin + 81;
        setMin = i % 128;
        if (!(i % 2 != 0)) {
            str = this.merchantId;
        } else {
            str = this.merchantId;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = getMin + 69;
        setMin = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return str;
        }
        int i3 = 56 / 0;
        return str;
    }

    public void setMerchantId(String str) {
        try {
            int i = getMin + 71;
            setMin = i % 128;
            if ((i % 2 != 0 ? 'R' : 30) != 30) {
                try {
                    this.merchantId = str;
                    Object[] objArr = null;
                    int length = objArr.length;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                this.merchantId = str;
            }
            int i2 = getMin + 103;
            setMin = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getMerchantName() {
        String str;
        int i = getMin + 53;
        setMin = i % 128;
        if ((i % 2 != 0 ? 'T' : '-') != '-') {
            try {
                str = this.merchantName;
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            str = this.merchantName;
        }
        int i2 = setMin + 97;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public void setMerchantName(String str) {
        int i = setMin + 59;
        getMin = i % 128;
        int i2 = i % 2;
        this.merchantName = str;
        int i3 = getMin + 83;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? 12 : 'c') == 12) {
            Object obj = null;
            super.hashCode();
        }
    }

    public String getNetAuthId() {
        int i = setMin + 87;
        getMin = i % 128;
        int i2 = i % 2;
        String str = this.netAuthId;
        int i3 = getMin + 29;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setNetAuthId(String str) {
        int i = setMin + 101;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            this.netAuthId = str;
            int i3 = getMin + 57;
            setMin = i3 % 128;
            if ((i3 % 2 != 0 ? '%' : 20) == '%') {
                int i4 = 61 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public String getPaySiteId() {
        int i = getMin + 81;
        setMin = i % 128;
        if (!(i % 2 != 0)) {
            return this.paySiteId;
        }
        String str = this.paySiteId;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public void setPaySiteId(String str) {
        int i = setMin + 79;
        getMin = i % 128;
        int i2 = i % 2;
        this.paySiteId = str;
        int i3 = setMin + 107;
        getMin = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getTerminalType() {
        int i = getMin + 1;
        setMin = i % 128;
        int i2 = i % 2;
        String str = this.terminalType;
        int i3 = getMin + 9;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? '(' : 4) == 4) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    public void setTerminalType(String str) {
        try {
            int i = getMin + 73;
            setMin = i % 128;
            int i2 = i % 2;
            this.terminalType = str;
            try {
                int i3 = setMin + 67;
                getMin = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String getSignature() {
        int i = getMin + 85;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            String str = this.signature;
            int i3 = setMin + 101;
            getMin = i3 % 128;
            if ((i3 % 2 == 0 ? 17 : '?') == '?') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setSignature(String str) {
        int i = setMin + 75;
        getMin = i % 128;
        char c = 2;
        if (i % 2 != 0) {
            c = 'V';
        }
        this.signature = str;
        if (c != 'V') {
            int i2 = 65 / 0;
        }
    }

    public String getMcc() {
        try {
            int i = setMin + 123;
            getMin = i % 128;
            if ((i % 2 == 0 ? '\\' : 'K') == 'K') {
                return this.mcc;
            }
            String str = this.mcc;
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setMcc(String str) {
        int i = getMin + 13;
        setMin = i % 128;
        int i2 = i % 2;
        this.mcc = str;
        int i3 = setMin + 125;
        getMin = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = r4.params
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.params
            java.lang.String r2 = ""
            java.lang.String r3 = "["
            java.lang.String r1 = r1.replace(r3, r2)
            java.lang.String r3 = "]"
            java.lang.String r1 = r1.replace(r3, r2)
            java.util.Map r1 = r4.getAttributes(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            int r2 = getMin
            int r2 = r2 + 109
            int r3 = r2 % 128
            setMin = r3
            int r2 = r2 % 2
        L_0x0034:
            boolean r2 = r1.hasNext()
            r3 = 37
            if (r2 == 0) goto L_0x003f
            r2 = 82
            goto L_0x0041
        L_0x003f:
            r2 = 37
        L_0x0041:
            if (r2 == r3) goto L_0x005d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r0.put(r3, r2)
            goto L_0x0034
        L_0x005d:
            int r1 = setMin     // Catch:{ Exception -> 0x006f }
            int r1 = r1 + 47
            int r2 = r1 % 128
            getMin = r2     // Catch:{ Exception -> 0x006f }
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x006e
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x006c }
            return r0
        L_0x006c:
            r0 = move-exception
            throw r0
        L_0x006e:
            return r0
        L_0x006f:
            r0 = move-exception
            goto L_0x0072
        L_0x0071:
            throw r0
        L_0x0072:
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity.getParams():java.util.Map");
    }

    public void setParams(String str) {
        int i = getMin + 7;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            this.params = str;
            int i3 = getMin + 57;
            setMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private Map<String, String> getAttributes(String str) {
        String group;
        String group2;
        HashMap hashMap = new HashMap();
        Matcher matcher = Pattern.compile("(\\w+)=(.*?)(?=,\\w+=|$)").matcher(str);
        while (true) {
            if (!matcher.find()) {
                return hashMap;
            }
            int i = setMin + 83;
            getMin = i % 128;
            if ((i % 2 == 0 ? Typography.amp : 'b') != 'b') {
                group = matcher.group(1);
                group2 = matcher.group(5);
            } else {
                group = matcher.group(1);
                group2 = matcher.group(2);
            }
            hashMap.put(group, group2);
            try {
                int i2 = setMin + 71;
                getMin = i2 % 128;
                int i3 = i2 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public List<String> getScopes() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        try {
            arrayList.addAll(Arrays.asList(URLDecoder.decode(this.scope, setMin(new char[]{25142, 25187, 64152, 6548, 27965, 13872, 14844, 65026, 15818}).intern()).replaceAll("[\\[\\]\"]", "").split(",")));
            int i = getMin + 39;
            setMin = i % 128;
            int i2 = i % 2;
        } catch (UnsupportedEncodingException e) {
            updateActionSheetContent.e(TAG, e.getMessage());
        }
        int i3 = getMin + 11;
        setMin = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (z) {
            return arrayList;
        }
        Object obj = null;
        super.hashCode();
        return arrayList;
    }

    public boolean isNeedAuth() {
        int i = setMin + 65;
        getMin = i % 128;
        int i2 = i % 2;
        boolean z = this.isNeedAuth;
        try {
            int i3 = setMin + 21;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setNeedAuth(boolean z) {
        int i = getMin + 79;
        setMin = i % 128;
        boolean z2 = i % 2 == 0;
        this.isNeedAuth = z;
        if (!z2) {
            Object obj = null;
            super.hashCode();
        }
        int i2 = getMin + 99;
        setMin = i2 % 128;
        if ((i2 % 2 != 0 ? 6 : '4') == 6) {
            int i3 = 26 / 0;
        }
    }

    public String getServiceKey() {
        int i = getMin + 111;
        setMin = i % 128;
        int i2 = i % 2;
        String str = this.serviceKey;
        try {
            int i3 = setMin + 7;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setServiceKey(String str) {
        int i = getMin + 61;
        setMin = i % 128;
        int i2 = i % 2;
        this.serviceKey = str;
        int i3 = setMin + 89;
        getMin = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public String getAuthCode() {
        try {
            int i = setMin + 13;
            getMin = i % 128;
            if ((i % 2 == 0 ? 'X' : 'F') != 'X') {
                return this.authCode;
            }
            String str = this.authCode;
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setAuthCode(String str) {
        try {
            int i = getMin + 95;
            setMin = i % 128;
            char c = i % 2 != 0 ? 'M' : ',';
            this.authCode = str;
            if (c != ',') {
                int i2 = 8 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public String getOtt() {
        int i = setMin + 17;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            String str = this.ott;
            try {
                int i3 = setMin + 63;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setOtt(String str) {
        int i = setMin + 123;
        getMin = i % 128;
        int i2 = i % 2;
        this.ott = str;
        int i3 = setMin + 75;
        getMin = i3 % 128;
        int i4 = i3 % 2;
    }

    public String getAndroidUrl() {
        try {
            int i = getMin + 47;
            setMin = i % 128;
            int i2 = i % 2;
            String str = this.android_url;
            int i3 = getMin + 71;
            setMin = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setAndroidUrl(String str) {
        int i = setMin + 27;
        getMin = i % 128;
        int i2 = i % 2;
        this.android_url = str;
        try {
            int i3 = setMin + 3;
            getMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getReferringLink() {
        int i = setMin + 49;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            String str = this.referringLink;
            int i3 = getMin + 23;
            setMin = i3 % 128;
            if ((i3 % 2 != 0 ? 'W' : '[') == '[') {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setReferringLink(String str) {
        int i = getMin + 83;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            this.referringLink = str;
            int i3 = setMin + 119;
            getMin = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 27 : 12) != 12) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public String getUrl() {
        int i = getMin + 35;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            String str = this.url;
            int i3 = getMin + 125;
            setMin = i3 % 128;
            if ((i3 % 2 != 0 ? 'D' : 24) != 'D') {
                return str;
            }
            Object[] objArr = null;
            int length = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    public void setUrl(String str) {
        int i = getMin + 31;
        setMin = i % 128;
        boolean z = false;
        boolean z2 = i % 2 != 0;
        Object obj = null;
        this.url = str;
        if (z2) {
            super.hashCode();
        }
        int i2 = getMin + 109;
        setMin = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (z) {
            super.hashCode();
        }
    }

    public String getCodeValue() {
        int i = getMin + 77;
        setMin = i % 128;
        if ((i % 2 != 0 ? '2' : 'K') == 'K') {
            return this.codeValue;
        }
        String str = this.codeValue;
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    public void setCodeValue(String str) {
        int i = getMin + 47;
        setMin = i % 128;
        if ((i % 2 != 0 ? Typography.amp : 5) != 5) {
            this.codeValue = str;
            int i2 = 74 / 0;
        } else {
            this.codeValue = str;
        }
        int i3 = getMin + 123;
        setMin = i3 % 128;
        if ((i3 % 2 != 0 ? 'R' : 'M') == 'R') {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public String getEncodedParams() {
        int i = getMin + 97;
        setMin = i % 128;
        int i2 = i % 2;
        String str = this.encodedParams;
        int i3 = setMin + 23;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setEncodedParams(String str) {
        int i = getMin + 99;
        setMin = i % 128;
        boolean z = i % 2 == 0;
        this.encodedParams = str;
        if (!z) {
            int i2 = 3 / 0;
        }
        try {
            int i3 = setMin + 15;
            getMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public String getEncoding() {
        int i = setMin + 63;
        getMin = i % 128;
        int i2 = i % 2;
        String str = this.encoding;
        int i3 = setMin + 55;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public void setEncoding(String str) {
        try {
            int i = getMin + 61;
            try {
                setMin = i % 128;
                if (!(i % 2 != 0)) {
                    this.encoding = str;
                    return;
                }
                this.encoding = str;
                int i2 = 80 / 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMin(char[] cArr) {
        try {
            char[] length = onActivityPreCreated.length(getMax, cArr);
            int i = 4;
            while (true) {
                if ((i < length.length ? '1' : '-') != '-') {
                    int i2 = setMin + 23;
                    getMin = i2 % 128;
                    int i3 = i2 % 2;
                    length[i] = (char) ((int) (((long) (length[i] ^ length[i % 4])) ^ (((long) (i - 4)) * getMax)));
                    i++;
                } else {
                    String str = new String(length, 4, length.length - 4);
                    int i4 = setMin + 61;
                    getMin = i4 % 128;
                    int i5 = i4 % 2;
                    return str;
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
