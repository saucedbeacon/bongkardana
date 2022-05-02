package o;

import android.graphics.Bitmap;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/data/ocr/model/RequestReceiptInfo;", "", "rules", "", "merchantNameAlias", "", "image", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "getMerchantNameAlias", "()Ljava/util/List;", "getRules", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class webType {
    @NotNull
    private final Bitmap image;
    @NotNull
    private final List<String> merchantNameAlias;
    @NotNull
    private final String rules;

    public static /* synthetic */ webType copy$default(webType webtype, String str, List<String> list, Bitmap bitmap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webtype.rules;
        }
        if ((i & 2) != 0) {
            list = webtype.merchantNameAlias;
        }
        if ((i & 4) != 0) {
            bitmap = webtype.image;
        }
        return webtype.copy(str, list, bitmap);
    }

    @NotNull
    public final String component1() {
        return this.rules;
    }

    @NotNull
    public final List<String> component2() {
        return this.merchantNameAlias;
    }

    @NotNull
    public final Bitmap component3() {
        return this.image;
    }

    @NotNull
    public final webType copy(@NotNull String str, @NotNull List<String> list, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(str, "rules");
        Intrinsics.checkNotNullParameter(list, "merchantNameAlias");
        Intrinsics.checkNotNullParameter(bitmap, H5ResourceHandlerUtil.IMAGE);
        return new webType(str, list, bitmap);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof webType)) {
            return false;
        }
        webType webtype = (webType) obj;
        return Intrinsics.areEqual((Object) this.rules, (Object) webtype.rules) && Intrinsics.areEqual((Object) this.merchantNameAlias, (Object) webtype.merchantNameAlias) && Intrinsics.areEqual((Object) this.image, (Object) webtype.image);
    }

    public final int hashCode() {
        String str = this.rules;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.merchantNameAlias;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Bitmap bitmap = this.image;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestReceiptInfo(rules=");
        sb.append(this.rules);
        sb.append(", merchantNameAlias=");
        sb.append(this.merchantNameAlias);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(")");
        return sb.toString();
    }

    public webType(@NotNull String str, @NotNull List<String> list, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(str, "rules");
        Intrinsics.checkNotNullParameter(list, "merchantNameAlias");
        Intrinsics.checkNotNullParameter(bitmap, H5ResourceHandlerUtil.IMAGE);
        this.rules = str;
        this.merchantNameAlias = list;
        this.image = bitmap;
    }

    @NotNull
    public final String getRules() {
        return this.rules;
    }

    @NotNull
    public final List<String> getMerchantNameAlias() {
        return this.merchantNameAlias;
    }

    @NotNull
    public final Bitmap getImage() {
        return this.image;
    }
}
