package o;

import com.twilio.verify.models.FactorType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/twilio/verify/domain/factor/models/UpdateFactorPayload;", "Lcom/twilio/verify/domain/factor/models/FactorDataPayload;", "friendlyName", "", "type", "Lcom/twilio/verify/models/FactorType;", "serviceSid", "identity", "config", "", "factorSid", "(Ljava/lang/String;Lcom/twilio/verify/models/FactorType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getConfig", "()Ljava/util/Map;", "getFactorSid", "()Ljava/lang/String;", "getFriendlyName", "getIdentity", "getServiceSid", "getType", "()Lcom/twilio/verify/models/FactorType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class detachViewInternal implements detachViewAt {
    @NotNull
    private final String equals;
    @NotNull
    private final FactorType getMax;
    @NotNull
    public final Map<String, String> getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    private final String setMin;

    public detachViewInternal(@NotNull String str, @NotNull FactorType factorType, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map, @NotNull String str4) {
        Intrinsics.checkParameterIsNotNull(str, "friendlyName");
        Intrinsics.checkParameterIsNotNull(factorType, "type");
        Intrinsics.checkParameterIsNotNull(str2, "serviceSid");
        Intrinsics.checkParameterIsNotNull(str3, "identity");
        Intrinsics.checkParameterIsNotNull(map, "config");
        Intrinsics.checkParameterIsNotNull(str4, "factorSid");
        this.setMax = str;
        this.getMax = factorType;
        this.setMin = str2;
        this.equals = str3;
        this.getMin = map;
        this.length = str4;
    }

    @NotNull
    public final FactorType getMin() {
        return this.getMax;
    }

    @NotNull
    public final String getMax() {
        return this.setMin;
    }

    @NotNull
    public final String setMax() {
        return this.equals;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateFactorPayload(friendlyName=");
        sb.append(this.setMax);
        sb.append(", type=");
        sb.append(this.getMax);
        sb.append(", serviceSid=");
        sb.append(this.setMin);
        sb.append(", identity=");
        sb.append(this.equals);
        sb.append(", config=");
        sb.append(this.getMin);
        sb.append(", factorSid=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FactorType factorType = this.getMax;
        int hashCode2 = (hashCode + (factorType != null ? factorType.hashCode() : 0)) * 31;
        String str2 = this.setMin;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.equals;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.getMin;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String str4 = this.length;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof detachViewInternal)) {
            return false;
        }
        detachViewInternal detachviewinternal = (detachViewInternal) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) detachviewinternal.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) detachviewinternal.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) detachviewinternal.setMin) && Intrinsics.areEqual((Object) this.equals, (Object) detachviewinternal.equals) && Intrinsics.areEqual((Object) this.getMin, (Object) detachviewinternal.getMin) && Intrinsics.areEqual((Object) this.length, (Object) detachviewinternal.length);
    }
}
