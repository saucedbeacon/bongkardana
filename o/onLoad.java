package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/response/EddAnswerInfoDTOResponse;", "", "answerId", "", "answer", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getAnswerId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onLoad {
    @NotNull
    private final String answer;
    @NotNull
    private final String answerId;

    public static /* synthetic */ onLoad copy$default(onLoad onload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onload.answerId;
        }
        if ((i & 2) != 0) {
            str2 = onload.answer;
        }
        return onload.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.answerId;
    }

    @NotNull
    public final String component2() {
        return this.answer;
    }

    @NotNull
    public final onLoad copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "answerId");
        Intrinsics.checkNotNullParameter(str2, "answer");
        return new onLoad(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onLoad)) {
            return false;
        }
        onLoad onload = (onLoad) obj;
        return Intrinsics.areEqual((Object) this.answerId, (Object) onload.answerId) && Intrinsics.areEqual((Object) this.answer, (Object) onload.answer);
    }

    public final int hashCode() {
        String str = this.answerId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.answer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EddAnswerInfoDTOResponse(answerId=");
        sb.append(this.answerId);
        sb.append(", answer=");
        sb.append(this.answer);
        sb.append(")");
        return sb.toString();
    }

    public onLoad(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "answerId");
        Intrinsics.checkNotNullParameter(str2, "answer");
        this.answerId = str;
        this.answer = str2;
    }

    @NotNull
    public final String getAnswerId() {
        return this.answerId;
    }

    @NotNull
    public final String getAnswer() {
        return this.answer;
    }
}
