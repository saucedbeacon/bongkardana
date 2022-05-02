package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/danah5/locationpicker/model/PickLocationResponse;", "", "success", "", "data", "Lid/dana/danah5/locationpicker/model/PickLocationResponse$LocationResult;", "errorCode", "", "(ZLid/dana/danah5/locationpicker/model/PickLocationResponse$LocationResult;Ljava/lang/String;)V", "getData", "()Lid/dana/danah5/locationpicker/model/PickLocationResponse$LocationResult;", "getErrorCode", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "LocationResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setDEFAULT_BEHAVIOR {
    @Nullable
    private final setMax data;
    @NotNull
    private final String errorCode;
    private final boolean success;

    public static /* synthetic */ setDEFAULT_BEHAVIOR copy$default(setDEFAULT_BEHAVIOR setdefault_behavior, boolean z, setMax setmax, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setdefault_behavior.success;
        }
        if ((i & 2) != 0) {
            setmax = setdefault_behavior.data;
        }
        if ((i & 4) != 0) {
            str = setdefault_behavior.errorCode;
        }
        return setdefault_behavior.copy(z, setmax, str);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final setMax component2() {
        return this.data;
    }

    @NotNull
    public final String component3() {
        return this.errorCode;
    }

    @NotNull
    public final setDEFAULT_BEHAVIOR copy(boolean z, @Nullable setMax setmax, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        return new setDEFAULT_BEHAVIOR(z, setmax, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDEFAULT_BEHAVIOR)) {
            return false;
        }
        setDEFAULT_BEHAVIOR setdefault_behavior = (setDEFAULT_BEHAVIOR) obj;
        return this.success == setdefault_behavior.success && Intrinsics.areEqual((Object) this.data, (Object) setdefault_behavior.data) && Intrinsics.areEqual((Object) this.errorCode, (Object) setdefault_behavior.errorCode);
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        setMax setmax = this.data;
        int i2 = 0;
        int hashCode = (i + (setmax != null ? setmax.hashCode() : 0)) * 31;
        String str = this.errorCode;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PickLocationResponse(success=");
        sb.append(this.success);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(")");
        return sb.toString();
    }

    public setDEFAULT_BEHAVIOR(boolean z, @Nullable setMax setmax, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        this.success = z;
        this.data = setmax;
        this.errorCode = str;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final setMax getData() {
        return this.data;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/danah5/locationpicker/model/PickLocationResponse$LocationResult;", "", "lat", "", "long", "name", "details", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "getLat", "getLong", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final String details;
        @NotNull
        private final String lat;
        @NotNull

        /* renamed from: long  reason: not valid java name */
        private final String f0long;
        @NotNull
        private final String name;

        public static /* synthetic */ setMax copy$default(setMax setmax, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setmax.lat;
            }
            if ((i & 2) != 0) {
                str2 = setmax.f0long;
            }
            if ((i & 4) != 0) {
                str3 = setmax.name;
            }
            if ((i & 8) != 0) {
                str4 = setmax.details;
            }
            return setmax.copy(str, str2, str3, str4);
        }

        @NotNull
        public final String component1() {
            return this.lat;
        }

        @NotNull
        public final String component2() {
            return this.f0long;
        }

        @NotNull
        public final String component3() {
            return this.name;
        }

        @NotNull
        public final String component4() {
            return this.details;
        }

        @NotNull
        public final setMax copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "lat");
            Intrinsics.checkNotNullParameter(str2, "long");
            Intrinsics.checkNotNullParameter(str3, "name");
            Intrinsics.checkNotNullParameter(str4, "details");
            return new setMax(str, str2, str3, str4);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            return Intrinsics.areEqual((Object) this.lat, (Object) setmax.lat) && Intrinsics.areEqual((Object) this.f0long, (Object) setmax.f0long) && Intrinsics.areEqual((Object) this.name, (Object) setmax.name) && Intrinsics.areEqual((Object) this.details, (Object) setmax.details);
        }

        public final int hashCode() {
            String str = this.lat;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f0long;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.name;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.details;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("LocationResult(lat=");
            sb.append(this.lat);
            sb.append(", long=");
            sb.append(this.f0long);
            sb.append(", name=");
            sb.append(this.name);
            sb.append(", details=");
            sb.append(this.details);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "lat");
            Intrinsics.checkNotNullParameter(str2, "long");
            Intrinsics.checkNotNullParameter(str3, "name");
            Intrinsics.checkNotNullParameter(str4, "details");
            this.lat = str;
            this.f0long = str2;
            this.name = str3;
            this.details = str4;
        }

        @NotNull
        public final String getLat() {
            return this.lat;
        }

        @NotNull
        public final String getLong() {
            return this.f0long;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getDetails() {
            return this.details;
        }
    }
}
