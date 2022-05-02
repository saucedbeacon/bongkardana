package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "", "show", "", "imageUrl", "", "(ZLjava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getShow", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class shouldOverrideUrlLoading {
    @Nullable
    private final String imageUrl;
    private final boolean show;

    public static /* synthetic */ shouldOverrideUrlLoading copy$default(shouldOverrideUrlLoading shouldoverrideurlloading, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shouldoverrideurlloading.show;
        }
        if ((i & 2) != 0) {
            str = shouldoverrideurlloading.imageUrl;
        }
        return shouldoverrideurlloading.copy(z, str);
    }

    public final boolean component1() {
        return this.show;
    }

    @Nullable
    public final String component2() {
        return this.imageUrl;
    }

    @NotNull
    public final shouldOverrideUrlLoading copy(boolean z, @Nullable String str) {
        return new shouldOverrideUrlLoading(z, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shouldOverrideUrlLoading)) {
            return false;
        }
        shouldOverrideUrlLoading shouldoverrideurlloading = (shouldOverrideUrlLoading) obj;
        return this.show == shouldoverrideurlloading.show && Intrinsics.areEqual((Object) this.imageUrl, (Object) shouldoverrideurlloading.imageUrl);
    }

    public final int hashCode() {
        boolean z = this.show;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.imageUrl;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowAlipayConnectBrandConfig(show=");
        sb.append(this.show);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(")");
        return sb.toString();
    }

    public shouldOverrideUrlLoading(boolean z, @Nullable String str) {
        this.show = z;
        this.imageUrl = str;
    }

    public final boolean getShow() {
        return this.show;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }
}
