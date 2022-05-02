package o;

import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lid/dana/data/kycamledd/repository/source/network/response/EddQuestionInfoDTOResponse;", "", "questionId", "", "question", "eddAnswerInfos", "", "Lid/dana/data/kycamledd/repository/source/network/response/EddAnswerInfoDTOResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEddAnswerInfos", "()Ljava/util/List;", "getQuestion", "()Ljava/lang/String;", "getQuestionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onTabItemClicked {
    @NotNull
    private final List<onLoad> eddAnswerInfos;
    @NotNull
    private final String question;
    @NotNull
    private final String questionId;

    public static /* synthetic */ onTabItemClicked copy$default(onTabItemClicked ontabitemclicked, String str, String str2, List<onLoad> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ontabitemclicked.questionId;
        }
        if ((i & 2) != 0) {
            str2 = ontabitemclicked.question;
        }
        if ((i & 4) != 0) {
            list = ontabitemclicked.eddAnswerInfos;
        }
        return ontabitemclicked.copy(str, str2, list);
    }

    @NotNull
    public final String component1() {
        return this.questionId;
    }

    @NotNull
    public final String component2() {
        return this.question;
    }

    @NotNull
    public final List<onLoad> component3() {
        return this.eddAnswerInfos;
    }

    @NotNull
    public final onTabItemClicked copy(@NotNull String str, @NotNull String str2, @NotNull List<onLoad> list) {
        Intrinsics.checkNotNullParameter(str, "questionId");
        Intrinsics.checkNotNullParameter(str2, RequestConstants.KEY_QUESTION);
        Intrinsics.checkNotNullParameter(list, "eddAnswerInfos");
        return new onTabItemClicked(str, str2, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onTabItemClicked)) {
            return false;
        }
        onTabItemClicked ontabitemclicked = (onTabItemClicked) obj;
        return Intrinsics.areEqual((Object) this.questionId, (Object) ontabitemclicked.questionId) && Intrinsics.areEqual((Object) this.question, (Object) ontabitemclicked.question) && Intrinsics.areEqual((Object) this.eddAnswerInfos, (Object) ontabitemclicked.eddAnswerInfos);
    }

    public final int hashCode() {
        String str = this.questionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.question;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<onLoad> list = this.eddAnswerInfos;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EddQuestionInfoDTOResponse(questionId=");
        sb.append(this.questionId);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", eddAnswerInfos=");
        sb.append(this.eddAnswerInfos);
        sb.append(")");
        return sb.toString();
    }

    public onTabItemClicked(@NotNull String str, @NotNull String str2, @NotNull List<onLoad> list) {
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
    public final List<onLoad> getEddAnswerInfos() {
        return this.eddAnswerInfos;
    }
}
