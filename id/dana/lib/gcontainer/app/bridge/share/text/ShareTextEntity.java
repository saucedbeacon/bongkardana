package id.dana.lib.gcontainer.app.bridge.share.text;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/share/text/ShareTextEntity;", "", "message", "", "title", "bizCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizCode", "()Ljava/lang/String;", "setBizCode", "(Ljava/lang/String;)V", "getMessage", "setMessage", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class ShareTextEntity {
    @Nullable
    private String bizCode;
    @Nullable
    private String message;
    @Nullable
    private String title;

    @JSONCreator
    public ShareTextEntity() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShareTextEntity copy$default(ShareTextEntity shareTextEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareTextEntity.message;
        }
        if ((i & 2) != 0) {
            str2 = shareTextEntity.title;
        }
        if ((i & 4) != 0) {
            str3 = shareTextEntity.bizCode;
        }
        return shareTextEntity.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.bizCode;
    }

    @NotNull
    public final ShareTextEntity copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new ShareTextEntity(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareTextEntity)) {
            return false;
        }
        ShareTextEntity shareTextEntity = (ShareTextEntity) obj;
        return Intrinsics.areEqual((Object) this.message, (Object) shareTextEntity.message) && Intrinsics.areEqual((Object) this.title, (Object) shareTextEntity.title) && Intrinsics.areEqual((Object) this.bizCode, (Object) shareTextEntity.bizCode);
    }

    public final int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bizCode;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareTextEntity(message=");
        sb.append(this.message);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", bizCode=");
        sb.append(this.bizCode);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public ShareTextEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.message = str;
        this.title = str2;
        this.bizCode = str3;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareTextEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @Nullable
    public final String getBizCode() {
        return this.bizCode;
    }

    public final void setBizCode(@Nullable String str) {
        this.bizCode = str;
    }
}
