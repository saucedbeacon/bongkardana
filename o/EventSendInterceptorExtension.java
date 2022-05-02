package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/data/social/model/OwnReactionResult;", "", "id", "", "kind", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getKind", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toOwnReaction", "Lid/dana/domain/social/model/OwnReaction;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EventSendInterceptorExtension {
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9908id;
    @NotNull
    private final String kind;

    public static /* synthetic */ EventSendInterceptorExtension copy$default(EventSendInterceptorExtension eventSendInterceptorExtension, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventSendInterceptorExtension.f9908id;
        }
        if ((i & 2) != 0) {
            str2 = eventSendInterceptorExtension.kind;
        }
        return eventSendInterceptorExtension.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f9908id;
    }

    @NotNull
    public final String component2() {
        return this.kind;
    }

    @NotNull
    public final EventSendInterceptorExtension copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "kind");
        return new EventSendInterceptorExtension(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventSendInterceptorExtension)) {
            return false;
        }
        EventSendInterceptorExtension eventSendInterceptorExtension = (EventSendInterceptorExtension) obj;
        return Intrinsics.areEqual((Object) this.f9908id, (Object) eventSendInterceptorExtension.f9908id) && Intrinsics.areEqual((Object) this.kind, (Object) eventSendInterceptorExtension.kind);
    }

    public final int hashCode() {
        String str = this.f9908id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.kind;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnReactionResult(id=");
        sb.append(this.f9908id);
        sb.append(", kind=");
        sb.append(this.kind);
        sb.append(")");
        return sb.toString();
    }

    public EventSendInterceptorExtension(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "kind");
        this.f9908id = str;
        this.kind = str2;
    }

    @NotNull
    public final String getId() {
        return this.f9908id;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    @NotNull
    public final getRangedRegionState toOwnReaction() {
        return new getRangedRegionState(this.f9908id, this.kind);
    }
}