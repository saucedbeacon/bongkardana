package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/data/config/model/BindingBenefitEntity;", "", "icon", "", "name", "nameInBahasa", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getName", "getNameInBahasa", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class JsonReader$Token {
    @NotNull
    String icon;
    @NotNull
    String name;
    @NotNull
    String nameInBahasa;

    public /* synthetic */ JsonReader$Token() {
    }

    public static /* synthetic */ JsonReader$Token copy$default(JsonReader$Token jsonReader$Token, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jsonReader$Token.icon;
        }
        if ((i & 2) != 0) {
            str2 = jsonReader$Token.name;
        }
        if ((i & 4) != 0) {
            str3 = jsonReader$Token.nameInBahasa;
        }
        return jsonReader$Token.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.icon;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.nameInBahasa;
    }

    @NotNull
    public final JsonReader$Token copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "icon");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "nameInBahasa");
        return new JsonReader$Token(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JsonReader$Token)) {
            return false;
        }
        JsonReader$Token jsonReader$Token = (JsonReader$Token) obj;
        return Intrinsics.areEqual((Object) this.icon, (Object) jsonReader$Token.icon) && Intrinsics.areEqual((Object) this.name, (Object) jsonReader$Token.name) && Intrinsics.areEqual((Object) this.nameInBahasa, (Object) jsonReader$Token.nameInBahasa);
    }

    public final int hashCode() {
        String str = this.icon;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nameInBahasa;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BindingBenefitEntity(icon=");
        sb.append(this.icon);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", nameInBahasa=");
        sb.append(this.nameInBahasa);
        sb.append(")");
        return sb.toString();
    }

    public JsonReader$Token(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "icon");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "nameInBahasa");
        this.icon = str;
        this.name = str2;
        this.nameInBahasa = str3;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNameInBahasa() {
        return this.nameInBahasa;
    }
}
