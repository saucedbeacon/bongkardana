package o;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J(\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lid/dana/data/geocode/model/GeocoderResult;", "", "results", "", "Lid/dana/data/geocode/model/GeocoderResult$Results;", "status", "", "([Lid/dana/data/geocode/model/GeocoderResult$Results;Ljava/lang/String;)V", "getResults", "()[Lid/dana/data/geocode/model/GeocoderResult$Results;", "[Lid/dana/data/geocode/model/GeocoderResult$Results;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "([Lid/dana/data/geocode/model/GeocoderResult$Results;Ljava/lang/String;)Lid/dana/data/geocode/model/GeocoderResult;", "equals", "", "other", "hashCode", "", "toString", "AddressComponent", "Results", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createDialog {
    @NotNull
    private final setMin[] results;
    @NotNull
    private final String status;

    public static /* synthetic */ createDialog copy$default(createDialog createdialog, setMin[] setminArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            setminArr = createdialog.results;
        }
        if ((i & 2) != 0) {
            str = createdialog.status;
        }
        return createdialog.copy(setminArr, str);
    }

    @NotNull
    public final setMin[] component1() {
        return this.results;
    }

    @NotNull
    public final String component2() {
        return this.status;
    }

    @NotNull
    public final createDialog copy(@NotNull setMin[] setminArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(setminArr, "results");
        Intrinsics.checkNotNullParameter(str, "status");
        return new createDialog(setminArr, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createDialog)) {
            return false;
        }
        createDialog createdialog = (createDialog) obj;
        return Intrinsics.areEqual((Object) this.results, (Object) createdialog.results) && Intrinsics.areEqual((Object) this.status, (Object) createdialog.status);
    }

    public final int hashCode() {
        setMin[] setminArr = this.results;
        int i = 0;
        int hashCode = (setminArr != null ? Arrays.hashCode(setminArr) : 0) * 31;
        String str = this.status;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeocoderResult(results=");
        sb.append(Arrays.toString(this.results));
        sb.append(", status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }

    public createDialog(@NotNull setMin[] setminArr, @NotNull String str) {
        Intrinsics.checkNotNullParameter(setminArr, "results");
        Intrinsics.checkNotNullParameter(str, "status");
        this.results = setminArr;
        this.status = str;
    }

    @NotNull
    public final setMin[] getResults() {
        return this.results;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lid/dana/data/geocode/model/GeocoderResult$Results;", "", "address_components", "", "Lid/dana/data/geocode/model/GeocoderResult$AddressComponent;", "formatted_address", "", "([Lid/dana/data/geocode/model/GeocoderResult$AddressComponent;Ljava/lang/String;)V", "getAddress_components", "()[Lid/dana/data/geocode/model/GeocoderResult$AddressComponent;", "[Lid/dana/data/geocode/model/GeocoderResult$AddressComponent;", "getFormatted_address", "()Ljava/lang/String;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final length[] address_components;
        @NotNull
        private final String formatted_address;

        public setMin(@NotNull length[] lengthArr, @NotNull String str) {
            Intrinsics.checkNotNullParameter(lengthArr, "address_components");
            Intrinsics.checkNotNullParameter(str, "formatted_address");
            this.address_components = lengthArr;
            this.formatted_address = str;
        }

        @NotNull
        public final length[] getAddress_components() {
            return this.address_components;
        }

        @NotNull
        public final String getFormatted_address() {
            return this.formatted_address;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lid/dana/data/geocode/model/GeocoderResult$AddressComponent;", "", "long_name", "", "short_name", "types", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getLong_name", "()Ljava/lang/String;", "getShort_name", "getTypes", "()[Ljava/lang/String;", "[Ljava/lang/String;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull
        private final String long_name;
        @NotNull
        private final String short_name;
        @NotNull
        private final String[] types;

        public length(@NotNull String str, @NotNull String str2, @NotNull String[] strArr) {
            Intrinsics.checkNotNullParameter(str, "long_name");
            Intrinsics.checkNotNullParameter(str2, "short_name");
            Intrinsics.checkNotNullParameter(strArr, "types");
            this.long_name = str;
            this.short_name = str2;
            this.types = strArr;
        }

        @NotNull
        public final String getLong_name() {
            return this.long_name;
        }

        @NotNull
        public final String getShort_name() {
            return this.short_name;
        }

        @NotNull
        public final String[] getTypes() {
            return this.types;
        }
    }
}
