package o;

import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lid/dana/domain/kycamledd/model/EddQuestionInfoDTO;", "", "questionId", "", "question", "eddAnswerInfos", "", "Lid/dana/domain/kycamledd/model/EddAnswerInfoDTO;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEddAnswerInfos", "()Ljava/util/List;", "getQuestion", "()Ljava/lang/String;", "getQuestionId", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSingleMonitorThreadExecutor {
    @NotNull
    private final List<setAlwaysShowDiagnosticTool> eddAnswerInfos;
    @NotNull
    private final String question;
    @NotNull
    private final String questionId;

    public getSingleMonitorThreadExecutor(@NotNull String str, @NotNull String str2, @NotNull List<setAlwaysShowDiagnosticTool> list) {
        Intrinsics.checkNotNullParameter(str, "questionId");
        Intrinsics.checkNotNullParameter(str2, RequestConstants.KEY_QUESTION);
        Intrinsics.checkNotNullParameter(list, "eddAnswerInfos");
        this.questionId = str;
        this.question = str2;
        this.eddAnswerInfos = list;
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    @NotNull
    public final List<setAlwaysShowDiagnosticTool> getEddAnswerInfos() {
        return this.eddAnswerInfos;
    }
}
