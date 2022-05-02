package o;

import android.util.Base64;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0018B\u0007\b\u0007¢\u0006\u0002\u0010\u0004JP\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\t0\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u0002H\u0002J,\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¨\u0006\u0019"}, d2 = {"Lid/dana/data/deeplink/mapper/DeepLinkPayloadEntityMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/deeplink/repository/source/branch/result/DeepLinkPayloadEntity;", "Lid/dana/domain/deeplink/model/DeepLinkPayload;", "()V", "createParams", "", "", "kotlin.jvm.PlatformType", "", "oldItem", "getAttributes", "attributes", "getExtendedInfo", "Lorg/json/JSONObject;", "payload", "map", "mapOauthParams", "Lid/dana/domain/deeplink/model/OauthParams;", "processEncodedParams", "", "params", "encoding", "encodedParams", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class pushChild extends setSpeed<DeepLinkPayloadEntity, getRequestHeaders> {
    private static final String AUTH_CODE_KEY = "authCode";
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final String ENCODING_BASE64 = "base64";
    private static final String PARAMS = "params=";

    @Nullable
    public final getRequestHeaders map(@Nullable DeepLinkPayloadEntity deepLinkPayloadEntity) {
        if (deepLinkPayloadEntity == null) {
            return null;
        }
        getRequestHeaders getrequestheaders = new getRequestHeaders();
        getrequestheaders.setInnerUrl(deepLinkPayloadEntity.getInnerUrl());
        getrequestheaders.setPath(deepLinkPayloadEntity.getPath());
        getrequestheaders.setDestinationPath(deepLinkPayloadEntity.getDestinationPath());
        getrequestheaders.setOrderId(deepLinkPayloadEntity.getOrderId());
        getrequestheaders.setFullUrl(deepLinkPayloadEntity.getFullUrl());
        getrequestheaders.setSkipHomePage(deepLinkPayloadEntity.isSkipHomePage());
        getrequestheaders.setShortCode(deepLinkPayloadEntity.getShortCode());
        getrequestheaders.setPromoCode(deepLinkPayloadEntity.getPromoCode());
        getrequestheaders.setReferralCode(deepLinkPayloadEntity.getReferralCode());
        getrequestheaders.setAction(deepLinkPayloadEntity.getAction());
        getrequestheaders.setParams(createParams(deepLinkPayloadEntity));
        getrequestheaders.setOauthParams(mapOauthParams(deepLinkPayloadEntity));
        getrequestheaders.setCodeValue(deepLinkPayloadEntity.getCodeValue());
        getrequestheaders.setExtendedInfo(getExtendedInfo(deepLinkPayloadEntity));
        return getrequestheaders;
    }

    private final Map<String, String> createParams(DeepLinkPayloadEntity deepLinkPayloadEntity) {
        Map<String, String> params = deepLinkPayloadEntity.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "it");
        params.put("clientId", deepLinkPayloadEntity.getClientId());
        params.put(BranchLinkConstant.OauthParams.SCOPES, deepLinkPayloadEntity.getScope());
        params.put("state", deepLinkPayloadEntity.getState());
        params.put(BranchLinkConstant.OauthParams.REDIRECT_URL, deepLinkPayloadEntity.getRedirectUrl());
        params.put(BranchLinkConstant.OauthParams.BIND_DANA_TYPE, deepLinkPayloadEntity.getBindDanaType());
        params.put(BranchLinkConstant.OauthParams.ACQ_SITE_ID, deepLinkPayloadEntity.getAcqSiteId());
        params.put("merchantId", deepLinkPayloadEntity.getMerchantId());
        params.put(BranchLinkConstant.OauthParams.MERCHANT_NAME, deepLinkPayloadEntity.getMerchantName());
        params.put(BranchLinkConstant.OauthParams.NET_AUTH_ID, deepLinkPayloadEntity.getNetAuthId());
        params.put(BranchLinkConstant.OauthParams.PAY_SITE_ID, deepLinkPayloadEntity.getPaySiteId());
        params.put(BranchLinkConstant.OauthParams.TERMINAL_TYPE, deepLinkPayloadEntity.getTerminalType());
        params.put(BranchLinkConstant.OauthParams.SIGNATURE, deepLinkPayloadEntity.getSignature());
        params.put(BranchLinkConstant.OauthParams.MCC, deepLinkPayloadEntity.getMcc());
        params.put(BranchLinkConstant.OauthParams.REFERRING_LINK, deepLinkPayloadEntity.getReferringLink());
        params.put(BranchLinkConstant.PaymentParams.OTT, deepLinkPayloadEntity.getOtt());
        params.put(BranchLinkConstant.AcCashierParams.CODE_VALUE, deepLinkPayloadEntity.getCodeValue());
        params.put(BranchLinkConstant.PaymentParams.ANDROID_URL, deepLinkPayloadEntity.getAndroidUrl());
        CharSequence authCode = deepLinkPayloadEntity.getAuthCode();
        boolean z = false;
        if (!(authCode == null || authCode.length() == 0)) {
            params.put("authCode", deepLinkPayloadEntity.getAuthCode());
        }
        CharSequence encoding = deepLinkPayloadEntity.getEncoding();
        if (!(encoding == null || encoding.length() == 0)) {
            CharSequence encodedParams = deepLinkPayloadEntity.getEncodedParams();
            if (encodedParams == null || encodedParams.length() == 0) {
                z = true;
            }
            if (!z) {
                String encoding2 = deepLinkPayloadEntity.getEncoding();
                Intrinsics.checkNotNullExpressionValue(encoding2, "encoding");
                String encodedParams2 = deepLinkPayloadEntity.getEncodedParams();
                Intrinsics.checkNotNullExpressionValue(encodedParams2, "encodedParams");
                processEncodedParams(params, encoding2, encodedParams2);
            }
        }
        return params;
    }

    private final void processEncodedParams(Map<String, String> map, String str, String str2) {
        if (StringsKt.equals(str, ENCODING_BASE64, true)) {
            byte[] decode = Base64.decode(str2, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "Base64.decode(encodedParams, Base64.DEFAULT)");
            for (Map.Entry next : getAttributes(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(new String(decode, Charsets.UTF_8), PARAMS, "", false, 4, (Object) null), "[", "", false, 4, (Object) null), "]", "", false, 4, (Object) null)).entrySet()) {
                map.put(next.getKey(), next.getValue());
            }
        }
    }

    private final Map<String, String> getAttributes(String str) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Matcher matcher = Pattern.compile("(\\w+)=(.*?)(?=,\\w+=|$)").matcher(str);
        while (matcher.find()) {
            if (!(matcher.group(1) == null || matcher.group(2) == null)) {
                String group = matcher.group(1);
                Intrinsics.checkNotNull(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNull(group2);
                linkedHashMap.put(group, group2);
            }
        }
        return linkedHashMap;
    }

    private final JSONObject getExtendedInfo(DeepLinkPayloadEntity deepLinkPayloadEntity) {
        try {
            String extendedInfo = deepLinkPayloadEntity.getExtendedInfo();
            if (extendedInfo == null) {
                extendedInfo = "{}";
            }
            return new JSONObject(extendedInfo);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private final isForMainFrame mapOauthParams(DeepLinkPayloadEntity deepLinkPayloadEntity) {
        String clientId = deepLinkPayloadEntity.getClientId();
        if (clientId == null) {
            return null;
        }
        isForMainFrame isformainframe = new isForMainFrame();
        isformainframe.setClientId(clientId);
        isformainframe.setResponseType(deepLinkPayloadEntity.getResponseType());
        isformainframe.setPhoneNumber(deepLinkPayloadEntity.getPhoneNumber());
        isformainframe.setState(deepLinkPayloadEntity.getState());
        isformainframe.setCodeChallenge(deepLinkPayloadEntity.getCodeChallenge());
        isformainframe.setNeedMobileToken(deepLinkPayloadEntity.isNeedMobileToken());
        isformainframe.setRedirectUrl(deepLinkPayloadEntity.getRedirectUrl());
        isformainframe.setMerchantName(deepLinkPayloadEntity.getMerchantName());
        isformainframe.setReferringLink(deepLinkPayloadEntity.getReferringLink());
        isformainframe.setMerchantId(deepLinkPayloadEntity.getMerchantId());
        if (deepLinkPayloadEntity.getScopes() != null) {
            isformainframe.setScope(deepLinkPayloadEntity.getScopes());
        }
        return isformainframe;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/deeplink/mapper/DeepLinkPayloadEntityMapper$Companion;", "", "()V", "AUTH_CODE_KEY", "", "ENCODING_BASE64", "PARAMS", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
