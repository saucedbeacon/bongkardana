package o;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Jc\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\u0006\u00101\u001a\u00020,J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00063"}, d2 = {"Lid/dana/contract/deeplink/path/IpgRegistrationPayload;", "Ljava/io/Serializable;", "params", "", "action", "bizType", "logo", "idTitle", "enTitle", "tncUrl", "userConsentConfigKey", "userConsentSyncKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getBizType", "setBizType", "getEnTitle", "setEnTitle", "getIdTitle", "setIdTitle", "getLogo", "setLogo", "getParams", "setParams", "getTncUrl", "setTncUrl", "getUserConsentConfigKey", "setUserConsentConfigKey", "getUserConsentSyncKey", "setUserConsentSyncKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "isValid", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onAnimationStart implements Serializable {
    @SerializedName("action")
    @NotNull
    private String action;
    @SerializedName("bizType")
    @NotNull
    private String bizType;
    @SerializedName("enTitle")
    @NotNull
    private String enTitle;
    @SerializedName("idTitle")
    @NotNull
    private String idTitle;
    @SerializedName("logo")
    @NotNull
    private String logo;
    @SerializedName("path")
    @NotNull
    private String params;
    @SerializedName("tnc")
    @NotNull
    private String tncUrl;
    @SerializedName("userConsentConfigKey")
    @NotNull
    private String userConsentConfigKey;
    @SerializedName("userConsentSyncKey")
    @NotNull
    private String userConsentSyncKey;

    public static /* synthetic */ onAnimationStart copy$default(onAnimationStart onanimationstart, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        onAnimationStart onanimationstart2 = onanimationstart;
        int i2 = i;
        return onanimationstart.copy((i2 & 1) != 0 ? onanimationstart2.params : str, (i2 & 2) != 0 ? onanimationstart2.action : str2, (i2 & 4) != 0 ? onanimationstart2.bizType : str3, (i2 & 8) != 0 ? onanimationstart2.logo : str4, (i2 & 16) != 0 ? onanimationstart2.idTitle : str5, (i2 & 32) != 0 ? onanimationstart2.enTitle : str6, (i2 & 64) != 0 ? onanimationstart2.tncUrl : str7, (i2 & 128) != 0 ? onanimationstart2.userConsentConfigKey : str8, (i2 & 256) != 0 ? onanimationstart2.userConsentSyncKey : str9);
    }

    @NotNull
    public final String component1() {
        return this.params;
    }

    @NotNull
    public final String component2() {
        return this.action;
    }

    @NotNull
    public final String component3() {
        return this.bizType;
    }

    @NotNull
    public final String component4() {
        return this.logo;
    }

    @NotNull
    public final String component5() {
        return this.idTitle;
    }

    @NotNull
    public final String component6() {
        return this.enTitle;
    }

    @NotNull
    public final String component7() {
        return this.tncUrl;
    }

    @NotNull
    public final String component8() {
        return this.userConsentConfigKey;
    }

    @NotNull
    public final String component9() {
        return this.userConsentSyncKey;
    }

    @NotNull
    public final onAnimationStart copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "params");
        Intrinsics.checkNotNullParameter(str2, "action");
        Intrinsics.checkNotNullParameter(str3, "bizType");
        Intrinsics.checkNotNullParameter(str4, "logo");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "idTitle");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "enTitle");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, "tncUrl");
        String str13 = str8;
        Intrinsics.checkNotNullParameter(str13, "userConsentConfigKey");
        String str14 = str9;
        Intrinsics.checkNotNullParameter(str14, "userConsentSyncKey");
        return new onAnimationStart(str, str2, str3, str4, str10, str11, str12, str13, str14);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onAnimationStart)) {
            return false;
        }
        onAnimationStart onanimationstart = (onAnimationStart) obj;
        return Intrinsics.areEqual((Object) this.params, (Object) onanimationstart.params) && Intrinsics.areEqual((Object) this.action, (Object) onanimationstart.action) && Intrinsics.areEqual((Object) this.bizType, (Object) onanimationstart.bizType) && Intrinsics.areEqual((Object) this.logo, (Object) onanimationstart.logo) && Intrinsics.areEqual((Object) this.idTitle, (Object) onanimationstart.idTitle) && Intrinsics.areEqual((Object) this.enTitle, (Object) onanimationstart.enTitle) && Intrinsics.areEqual((Object) this.tncUrl, (Object) onanimationstart.tncUrl) && Intrinsics.areEqual((Object) this.userConsentConfigKey, (Object) onanimationstart.userConsentConfigKey) && Intrinsics.areEqual((Object) this.userConsentSyncKey, (Object) onanimationstart.userConsentSyncKey);
    }

    public final int hashCode() {
        String str = this.params;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bizType;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.logo;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.idTitle;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enTitle;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.tncUrl;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.userConsentConfigKey;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userConsentSyncKey;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IpgRegistrationPayload(params=");
        sb.append(this.params);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", idTitle=");
        sb.append(this.idTitle);
        sb.append(", enTitle=");
        sb.append(this.enTitle);
        sb.append(", tncUrl=");
        sb.append(this.tncUrl);
        sb.append(", userConsentConfigKey=");
        sb.append(this.userConsentConfigKey);
        sb.append(", userConsentSyncKey=");
        sb.append(this.userConsentSyncKey);
        sb.append(")");
        return sb.toString();
    }

    public onAnimationStart(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "params");
        Intrinsics.checkNotNullParameter(str2, "action");
        Intrinsics.checkNotNullParameter(str3, "bizType");
        Intrinsics.checkNotNullParameter(str4, "logo");
        Intrinsics.checkNotNullParameter(str5, "idTitle");
        Intrinsics.checkNotNullParameter(str6, "enTitle");
        Intrinsics.checkNotNullParameter(str7, "tncUrl");
        Intrinsics.checkNotNullParameter(str8, "userConsentConfigKey");
        Intrinsics.checkNotNullParameter(str9, "userConsentSyncKey");
        this.params = str;
        this.action = str2;
        this.bizType = str3;
        this.logo = str4;
        this.idTitle = str5;
        this.enTitle = str6;
        this.tncUrl = str7;
        this.userConsentConfigKey = str8;
        this.userConsentSyncKey = str9;
    }

    @NotNull
    public final String getParams() {
        return this.params;
    }

    public final void setParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.params = str;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action = str;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizType = str;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logo = str;
    }

    @NotNull
    public final String getIdTitle() {
        return this.idTitle;
    }

    public final void setIdTitle(@NotNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-452719587, oncanceled);
            onCancelLoad.getMin(-452719587, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idTitle = str;
    }

    @NotNull
    public final String getEnTitle() {
        return this.enTitle;
    }

    public final void setEnTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.enTitle = str;
    }

    @NotNull
    public final String getTncUrl() {
        return this.tncUrl;
    }

    public final void setTncUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tncUrl = str;
    }

    @NotNull
    public final String getUserConsentConfigKey() {
        return this.userConsentConfigKey;
    }

    public final void setUserConsentConfigKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userConsentConfigKey = str;
    }

    @NotNull
    public final String getUserConsentSyncKey() {
        return this.userConsentSyncKey;
    }

    public final void setUserConsentSyncKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userConsentSyncKey = str;
    }

    public final boolean isValid() {
        if (this.bizType.length() > 0) {
            if (this.userConsentConfigKey.length() > 0) {
                if (this.userConsentConfigKey.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
