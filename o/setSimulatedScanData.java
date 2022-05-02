package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/social/model/ReportReasons;", "", "reasonId", "", "id", "en", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEn", "()Ljava/lang/String;", "getId", "getReasonId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setSimulatedScanData {
    @NotNull
    private final String en;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9947id;
    @NotNull
    private final String reasonId;

    public static /* synthetic */ setSimulatedScanData copy$default(setSimulatedScanData setsimulatedscandata, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setsimulatedscandata.reasonId;
        }
        if ((i & 2) != 0) {
            str2 = setsimulatedscandata.f9947id;
        }
        if ((i & 4) != 0) {
            str3 = setsimulatedscandata.en;
        }
        return setsimulatedscandata.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.reasonId;
    }

    @NotNull
    public final String component2() {
        return this.f9947id;
    }

    @NotNull
    public final String component3() {
        return this.en;
    }

    @NotNull
    public final setSimulatedScanData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "reasonId");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, startH5OpenAuth.KEY_EN);
        return new setSimulatedScanData(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSimulatedScanData)) {
            return false;
        }
        setSimulatedScanData setsimulatedscandata = (setSimulatedScanData) obj;
        return Intrinsics.areEqual((Object) this.reasonId, (Object) setsimulatedscandata.reasonId) && Intrinsics.areEqual((Object) this.f9947id, (Object) setsimulatedscandata.f9947id) && Intrinsics.areEqual((Object) this.en, (Object) setsimulatedscandata.en);
    }

    public final int hashCode() {
        String str = this.reasonId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9947id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.en;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportReasons(reasonId=");
        sb.append(this.reasonId);
        sb.append(", id=");
        sb.append(this.f9947id);
        sb.append(", en=");
        sb.append(this.en);
        sb.append(")");
        return sb.toString();
    }

    public setSimulatedScanData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "reasonId");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, startH5OpenAuth.KEY_EN);
        this.reasonId = str;
        this.f9947id = str2;
        this.en = str3;
    }

    @NotNull
    public final String getReasonId() {
        return this.reasonId;
    }

    @NotNull
    public final String getId() {
        return this.f9947id;
    }

    @NotNull
    public final String getEn() {
        return this.en;
    }
}
