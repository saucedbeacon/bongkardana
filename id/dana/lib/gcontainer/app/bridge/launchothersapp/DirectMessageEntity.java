package id.dana.lib.gcontainer.app.bridge.launchothersapp;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONCreator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/launchothersapp/DirectMessageEntity;", "", "application", "", "id", "text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplication", "()Ljava/lang/String;", "setApplication", "(Ljava/lang/String;)V", "getId", "setId", "getText", "setText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class DirectMessageEntity {
    @Nullable
    private String application;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private String f9123id;
    @Nullable
    private String text;

    @JSONCreator
    public DirectMessageEntity() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DirectMessageEntity copy$default(DirectMessageEntity directMessageEntity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directMessageEntity.application;
        }
        if ((i & 2) != 0) {
            str2 = directMessageEntity.f9123id;
        }
        if ((i & 4) != 0) {
            str3 = directMessageEntity.text;
        }
        return directMessageEntity.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.application;
    }

    @Nullable
    public final String component2() {
        return this.f9123id;
    }

    @Nullable
    public final String component3() {
        return this.text;
    }

    @NotNull
    public final DirectMessageEntity copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new DirectMessageEntity(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectMessageEntity)) {
            return false;
        }
        DirectMessageEntity directMessageEntity = (DirectMessageEntity) obj;
        return Intrinsics.areEqual((Object) this.application, (Object) directMessageEntity.application) && Intrinsics.areEqual((Object) this.f9123id, (Object) directMessageEntity.f9123id) && Intrinsics.areEqual((Object) this.text, (Object) directMessageEntity.text);
    }

    public final int hashCode() {
        String str = this.application;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9123id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectMessageEntity(application=");
        sb.append(this.application);
        sb.append(", id=");
        sb.append(this.f9123id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public DirectMessageEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.application = str;
        this.f9123id = str2;
        this.text = str3;
    }

    @Nullable
    public final String getApplication() {
        return this.application;
    }

    public final void setApplication(@Nullable String str) {
        this.application = str;
    }

    @Nullable
    public final String getId() {
        return this.f9123id;
    }

    public final void setId(@Nullable String str) {
        this.f9123id = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DirectMessageEntity(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
