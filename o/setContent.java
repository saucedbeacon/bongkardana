package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/social/repository/source/network/request/DeleteCommentRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setContent extends BaseRpcRequest {
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9942id;

    public static /* synthetic */ setContent copy$default(setContent setcontent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setcontent.f9942id;
        }
        return setcontent.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.f9942id;
    }

    @NotNull
    public final setContent copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return new setContent(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setContent) && Intrinsics.areEqual((Object) this.f9942id, (Object) ((setContent) obj).f9942id);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f9942id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteCommentRequest(id=");
        sb.append(this.f9942id);
        sb.append(")");
        return sb.toString();
    }

    public setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.f9942id = str;
    }

    @NotNull
    public final String getId() {
        return this.f9942id;
    }
}
