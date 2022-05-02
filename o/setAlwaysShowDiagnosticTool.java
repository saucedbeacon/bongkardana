package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/kycamledd/model/EddAnswerInfoDTO;", "", "answerId", "", "answer", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getAnswerId", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setAlwaysShowDiagnosticTool {
    @NotNull
    private final String answer;
    @NotNull
    private final String answerId;

    public setAlwaysShowDiagnosticTool(@NotNull String str, @NotNull String str2) {
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
