package o;

import com.twilio.verify.models.FactorType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003Jg\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/twilio/verify/domain/factor/models/CreateFactorPayload;", "Lcom/twilio/verify/domain/factor/models/FactorDataPayload;", "friendlyName", "", "type", "Lcom/twilio/verify/models/FactorType;", "serviceSid", "identity", "config", "", "binding", "accessToken", "(Ljava/lang/String;Lcom/twilio/verify/models/FactorType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getBinding", "()Ljava/util/Map;", "getConfig", "getFriendlyName", "getIdentity", "getServiceSid", "getType", "()Lcom/twilio/verify/models/FactorType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class attachView implements detachViewAt {
    @NotNull
    public final Map<String, String> equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String isInside;
    @NotNull
    public final String length;
    @NotNull
    public final FactorType setMax;
    @NotNull
    public final Map<String, String> setMin;

    public attachView(@NotNull String str, @NotNull FactorType factorType, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull Map<String, String> map2, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "friendlyName");
        Intrinsics.checkParameterIsNotNull(factorType, "type");
        Intrinsics.checkParameterIsNotNull(str2, "serviceSid");
        Intrinsics.checkParameterIsNotNull(str3, "identity");
        Intrinsics.checkParameterIsNotNull(map, "config");
        Intrinsics.checkParameterIsNotNull(map2, "binding");
        Intrinsics.checkParameterIsNotNull(str4, "accessToken");
        this.length = str;
        this.setMax = factorType;
        this.getMin = str2;
        this.getMax = str3;
        this.setMin = map;
        this.equals = map2;
        this.isInside = str4;
    }

    @NotNull
    public final FactorType getMin() {
        return this.setMax;
    }

    @NotNull
    public final String getMax() {
        return this.getMin;
    }

    @NotNull
    public final String setMax() {
        return this.getMax;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateFactorPayload(friendlyName=");
        sb.append(this.length);
        sb.append(", type=");
        sb.append(this.setMax);
        sb.append(", serviceSid=");
        sb.append(this.getMin);
        sb.append(", identity=");
        sb.append(this.getMax);
        sb.append(", config=");
        sb.append(this.setMin);
        sb.append(", binding=");
        sb.append(this.equals);
        sb.append(", accessToken=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FactorType factorType = this.setMax;
        int hashCode2 = (hashCode + (factorType != null ? factorType.hashCode() : 0)) * 31;
        String str2 = this.getMin;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.setMin;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.equals;
        int hashCode6 = (hashCode5 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str4 = this.isInside;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 + i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof attachView)) {
            return false;
        }
        attachView attachview = (attachView) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) attachview.length) && Intrinsics.areEqual((Object) this.setMax, (Object) attachview.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) attachview.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) attachview.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) attachview.setMin) && Intrinsics.areEqual((Object) this.equals, (Object) attachview.equals) && Intrinsics.areEqual((Object) this.isInside, (Object) attachview.isInside);
    }
}
