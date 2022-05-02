package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/domain/nearbyme/model/Tag;", "", "id", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getExtensionFromMimeType {
    @NotNull
    private final String description;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9925id;

    public static /* synthetic */ getExtensionFromMimeType copy$default(getExtensionFromMimeType getextensionfrommimetype, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getextensionfrommimetype.f9925id;
        }
        if ((i & 2) != 0) {
            str2 = getextensionfrommimetype.description;
        }
        return getextensionfrommimetype.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f9925id;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    @NotNull
    public final getExtensionFromMimeType copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "description");
        return new getExtensionFromMimeType(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExtensionFromMimeType)) {
            return false;
        }
        getExtensionFromMimeType getextensionfrommimetype = (getExtensionFromMimeType) obj;
        return Intrinsics.areEqual((Object) this.f9925id, (Object) getextensionfrommimetype.f9925id) && Intrinsics.areEqual((Object) this.description, (Object) getextensionfrommimetype.description);
    }

    public final int hashCode() {
        String str = this.f9925id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(id=");
        sb.append(this.f9925id);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(")");
        return sb.toString();
    }

    public getExtensionFromMimeType(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "description");
        this.f9925id = str;
        this.description = str2;
    }

    @NotNull
    public final String getId() {
        return this.f9925id;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }
}
