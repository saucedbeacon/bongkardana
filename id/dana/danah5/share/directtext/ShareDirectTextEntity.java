package id.dana.danah5.share.directtext;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/danah5/share/directtext/ShareDirectTextEntity;", "", "message", "", "externalApp", "(Ljava/lang/String;Ljava/lang/String;)V", "getExternalApp", "()Ljava/lang/String;", "setExternalApp", "(Ljava/lang/String;)V", "getMessage", "setMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class ShareDirectTextEntity {
    @Nullable
    private String externalApp;
    @Nullable
    private String message;

    @JSONCreator
    public ShareDirectTextEntity() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ShareDirectTextEntity copy$default(ShareDirectTextEntity shareDirectTextEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareDirectTextEntity.message;
        }
        if ((i & 2) != 0) {
            str2 = shareDirectTextEntity.externalApp;
        }
        return shareDirectTextEntity.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.message;
    }

    @Nullable
    public final String component2() {
        return this.externalApp;
    }

    @NotNull
    public final ShareDirectTextEntity copy(@Nullable String str, @Nullable String str2) {
        return new ShareDirectTextEntity(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareDirectTextEntity)) {
            return false;
        }
        ShareDirectTextEntity shareDirectTextEntity = (ShareDirectTextEntity) obj;
        return Intrinsics.areEqual((Object) this.message, (Object) shareDirectTextEntity.message) && Intrinsics.areEqual((Object) this.externalApp, (Object) shareDirectTextEntity.externalApp);
    }

    public final int hashCode() {
        String str = this.message;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.externalApp;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareDirectTextEntity(message=");
        sb.append(this.message);
        sb.append(", externalApp=");
        sb.append(this.externalApp);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public ShareDirectTextEntity(@Nullable String str, @Nullable String str2) {
        this.message = str;
        this.externalApp = str2;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShareDirectTextEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @Nullable
    public final String getExternalApp() {
        return this.externalApp;
    }

    public final void setExternalApp(@Nullable String str) {
        this.externalApp = str;
    }
}
