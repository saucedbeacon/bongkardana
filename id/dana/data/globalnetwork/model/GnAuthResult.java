package id.dana.data.globalnetwork.model;

import androidx.annotation.Keep;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 B2\u00020\u0001:\u0001BBm\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jq\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010=\u001a\u00020'2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b&\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010*8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006C"}, d2 = {"Lid/dana/data/globalnetwork/model/GnAuthResult;", "", "clientId", "", "scopes", "", "oAuthCodeFlowType", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthCodeFlowType;", "extendInfo", "", "authCode", "agreedOn", "", "callback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/acl/oauth/OAuthResult;", "(Ljava/lang/String;Ljava/util/Set;Lcom/alipay/iap/android/wallet/acl/oauth/OAuthCodeFlowType;Ljava/util/Map;Ljava/lang/String;JLcom/alipay/iap/android/wallet/acl/base/Callback;)V", "getAgreedOn", "()J", "setAgreedOn", "(J)V", "appName", "getAppName", "()Ljava/lang/String;", "getAuthCode", "setAuthCode", "(Ljava/lang/String;)V", "getCallback", "()Lcom/alipay/iap/android/wallet/acl/base/Callback;", "setCallback", "(Lcom/alipay/iap/android/wallet/acl/base/Callback;)V", "getClientId", "getExtendInfo", "()Ljava/util/Map;", "setExtendInfo", "(Ljava/util/Map;)V", "iconUrl", "getIconUrl", "isExpired", "", "()Z", "languages", "Lorg/json/JSONObject;", "getLanguages", "()Lorg/json/JSONObject;", "getOAuthCodeFlowType", "()Lcom/alipay/iap/android/wallet/acl/oauth/OAuthCodeFlowType;", "setOAuthCodeFlowType", "(Lcom/alipay/iap/android/wallet/acl/oauth/OAuthCodeFlowType;)V", "getScopes", "()Ljava/util/Set;", "setScopes", "(Ljava/util/Set;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class GnAuthResult {
    private static final int AUTH_CODE_LIFETIME = 600000;
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    public long agreedOn;
    @Nullable
    public String authCode;
    @Nullable
    public Callback<OAuthResult> callback;
    @NotNull
    public String clientId;
    @Nullable
    public Map<String, String> extendInfo;
    @Nullable
    public OAuthCodeFlowType oAuthCodeFlowType;
    @Nullable
    public Set<String> scopes;

    public /* synthetic */ GnAuthResult() {
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str) {
        this(str, (Set) null, (OAuthCodeFlowType) null, (Map) null, (String) null, 0, (Callback) null, 126, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str, @Nullable Set<String> set) {
        this(str, set, (OAuthCodeFlowType) null, (Map) null, (String) null, 0, (Callback) null, 124, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str, @Nullable Set<String> set, @Nullable OAuthCodeFlowType oAuthCodeFlowType2) {
        this(str, set, oAuthCodeFlowType2, (Map) null, (String) null, 0, (Callback) null, 120, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str, @Nullable Set<String> set, @Nullable OAuthCodeFlowType oAuthCodeFlowType2, @Nullable Map<String, String> map) {
        this(str, set, oAuthCodeFlowType2, map, (String) null, 0, (Callback) null, 112, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str, @Nullable Set<String> set, @Nullable OAuthCodeFlowType oAuthCodeFlowType2, @Nullable Map<String, String> map, @Nullable String str2) {
        this(str, set, oAuthCodeFlowType2, map, str2, 0, (Callback) null, 96, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str, @Nullable Set<String> set, @Nullable OAuthCodeFlowType oAuthCodeFlowType2, @Nullable Map<String, String> map, @Nullable String str2, long j) {
        this(str, set, oAuthCodeFlowType2, map, str2, j, (Callback) null, 64, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GnAuthResult copy$default(GnAuthResult gnAuthResult, String str, Set set, OAuthCodeFlowType oAuthCodeFlowType2, Map map, String str2, long j, Callback callback2, int i, Object obj) {
        GnAuthResult gnAuthResult2 = gnAuthResult;
        return gnAuthResult.copy((i & 1) != 0 ? gnAuthResult2.clientId : str, (i & 2) != 0 ? gnAuthResult2.scopes : set, (i & 4) != 0 ? gnAuthResult2.oAuthCodeFlowType : oAuthCodeFlowType2, (i & 8) != 0 ? gnAuthResult2.extendInfo : map, (i & 16) != 0 ? gnAuthResult2.authCode : str2, (i & 32) != 0 ? gnAuthResult2.agreedOn : j, (i & 64) != 0 ? gnAuthResult2.callback : callback2);
    }

    @NotNull
    public final String component1() {
        return this.clientId;
    }

    @Nullable
    public final Set<String> component2() {
        return this.scopes;
    }

    @Nullable
    public final OAuthCodeFlowType component3() {
        return this.oAuthCodeFlowType;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.extendInfo;
    }

    @Nullable
    public final String component5() {
        return this.authCode;
    }

    public final long component6() {
        return this.agreedOn;
    }

    @Nullable
    public final Callback<OAuthResult> component7() {
        return this.callback;
    }

    @NotNull
    public final GnAuthResult copy(@NotNull String str, @Nullable Set<String> set, @Nullable OAuthCodeFlowType oAuthCodeFlowType2, @Nullable Map<String, String> map, @Nullable String str2, long j, @Nullable Callback<OAuthResult> callback2) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        return new GnAuthResult(str, set, oAuthCodeFlowType2, map, str2, j, callback2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GnAuthResult)) {
            return false;
        }
        GnAuthResult gnAuthResult = (GnAuthResult) obj;
        return Intrinsics.areEqual((Object) this.clientId, (Object) gnAuthResult.clientId) && Intrinsics.areEqual((Object) this.scopes, (Object) gnAuthResult.scopes) && Intrinsics.areEqual((Object) this.oAuthCodeFlowType, (Object) gnAuthResult.oAuthCodeFlowType) && Intrinsics.areEqual((Object) this.extendInfo, (Object) gnAuthResult.extendInfo) && Intrinsics.areEqual((Object) this.authCode, (Object) gnAuthResult.authCode) && this.agreedOn == gnAuthResult.agreedOn && Intrinsics.areEqual((Object) this.callback, (Object) gnAuthResult.callback);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GnAuthResult(clientId=");
        sb.append(this.clientId);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", oAuthCodeFlowType=");
        sb.append(this.oAuthCodeFlowType);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(", authCode=");
        sb.append(this.authCode);
        sb.append(", agreedOn=");
        sb.append(this.agreedOn);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.append(")");
        return sb.toString();
    }

    @JvmOverloads
    public GnAuthResult(@NotNull String str, @Nullable Set<String> set, @Nullable OAuthCodeFlowType oAuthCodeFlowType2, @Nullable Map<String, String> map, @Nullable String str2, long j, @Nullable Callback<OAuthResult> callback2) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        this.clientId = str;
        this.scopes = set;
        this.oAuthCodeFlowType = oAuthCodeFlowType2;
        this.extendInfo = map;
        this.authCode = str2;
        this.agreedOn = j;
        this.callback = callback2;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @Nullable
    public final Set<String> getScopes() {
        return this.scopes;
    }

    public final void setScopes(@Nullable Set<String> set) {
        this.scopes = set;
    }

    @Nullable
    public final OAuthCodeFlowType getOAuthCodeFlowType() {
        return this.oAuthCodeFlowType;
    }

    public final void setOAuthCodeFlowType(@Nullable OAuthCodeFlowType oAuthCodeFlowType2) {
        this.oAuthCodeFlowType = oAuthCodeFlowType2;
    }

    @Nullable
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    public final void setExtendInfo(@Nullable Map<String, String> map) {
        this.extendInfo = map;
    }

    @Nullable
    public final String getAuthCode() {
        return this.authCode;
    }

    public final void setAuthCode(@Nullable String str) {
        this.authCode = str;
    }

    public final long getAgreedOn() {
        return this.agreedOn;
    }

    public final void setAgreedOn(long j) {
        this.agreedOn = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GnAuthResult(java.lang.String r9, java.util.Set r10, com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType r11, java.util.Map r12, java.lang.String r13, long r14, com.alipay.iap.android.wallet.acl.base.Callback r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r10
        L_0x0008:
            r2 = r17 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r11
        L_0x000f:
            r3 = r17 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r12
        L_0x0016:
            r4 = r17 & 16
            if (r4 == 0) goto L_0x001c
            r4 = r1
            goto L_0x001d
        L_0x001c:
            r4 = r13
        L_0x001d:
            r5 = r17 & 32
            if (r5 == 0) goto L_0x0024
            r5 = 0
            goto L_0x0025
        L_0x0024:
            r5 = r14
        L_0x0025:
            r7 = r17 & 64
            if (r7 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r1 = r16
        L_0x002c:
            r10 = r8
            r11 = r9
            r12 = r0
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r18 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.data.globalnetwork.model.GnAuthResult.<init>(java.lang.String, java.util.Set, com.alipay.iap.android.wallet.acl.oauth.OAuthCodeFlowType, java.util.Map, java.lang.String, long, com.alipay.iap.android.wallet.acl.base.Callback, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Callback<OAuthResult> getCallback() {
        return this.callback;
    }

    public final void setCallback(@Nullable Callback<OAuthResult> callback2) {
        this.callback = callback2;
    }

    private final JSONObject getLanguages() {
        String str;
        Map<String, String> map = this.extendInfo;
        if (map == null || (str = map.get("languages")) == null) {
            return null;
        }
        String obj = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "Locale.getDefault().toString()");
        return new JSONObject(str).getJSONObject(StringsKt.endsWith$default(obj, "ID", false, 2, (Object) null) ? "id_ID" : "en_US");
    }

    @Nullable
    public final String getAppName() {
        JSONObject languages = getLanguages();
        if (languages != null) {
            return languages.getString("description");
        }
        return null;
    }

    @Nullable
    public final String getIconUrl() {
        JSONObject languages = getLanguages();
        if (languages != null) {
            return languages.getString("iconUrl");
        }
        return null;
    }

    public final boolean isExpired() {
        return System.currentTimeMillis() > this.agreedOn + 600000;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/globalnetwork/model/GnAuthResult$Companion;", "", "()V", "AUTH_CODE_LIFETIME", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int hashCode() {
        String str = this.clientId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<String> set = this.scopes;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        OAuthCodeFlowType oAuthCodeFlowType2 = this.oAuthCodeFlowType;
        int hashCode3 = (hashCode2 + (oAuthCodeFlowType2 != null ? oAuthCodeFlowType2.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        int hashCode4 = (hashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.authCode;
        int hashCode5 = (((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.valueOf(this.agreedOn).hashCode()) * 31;
        Callback<OAuthResult> callback2 = this.callback;
        if (callback2 != null) {
            i = callback2.hashCode();
        }
        return hashCode5 + i;
    }
}
