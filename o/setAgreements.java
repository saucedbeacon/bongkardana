package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RunningAverageRssiFilter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ8\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "comments", "", "Lid/dana/data/social/repository/source/network/response/CommentResponse;", "maxId", "", "hasNext", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "getComments", "()Ljava/util/List;", "getHasNext", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lid/dana/data/social/repository/source/network/response/FetchActivityCommentsResponse;", "equals", "other", "", "hashCode", "", "toFeedCommentResult", "Lid/dana/domain/social/model/FeedCommentResult;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAgreements extends BaseRpcResult {
    @Nullable
    private final List<getAppLogoLink> comments;
    @Nullable
    private final Boolean hasNext;
    @Nullable
    private final String maxId;

    public static /* synthetic */ setAgreements copy$default(setAgreements setagreements, List<getAppLogoLink> list, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = setagreements.comments;
        }
        if ((i & 2) != 0) {
            str = setagreements.maxId;
        }
        if ((i & 4) != 0) {
            bool = setagreements.hasNext;
        }
        return setagreements.copy(list, str, bool);
    }

    @Nullable
    public final List<getAppLogoLink> component1() {
        return this.comments;
    }

    @Nullable
    public final String component2() {
        return this.maxId;
    }

    @Nullable
    public final Boolean component3() {
        return this.hasNext;
    }

    @NotNull
    public final setAgreements copy(@Nullable List<getAppLogoLink> list, @Nullable String str, @Nullable Boolean bool) {
        return new setAgreements(list, str, bool);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAgreements)) {
            return false;
        }
        setAgreements setagreements = (setAgreements) obj;
        return Intrinsics.areEqual((Object) this.comments, (Object) setagreements.comments) && Intrinsics.areEqual((Object) this.maxId, (Object) setagreements.maxId) && Intrinsics.areEqual((Object) this.hasNext, (Object) setagreements.hasNext);
    }

    public final int hashCode() {
        List<getAppLogoLink> list = this.comments;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.maxId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.hasNext;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchActivityCommentsResponse(comments=");
        sb.append(this.comments);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final List<getAppLogoLink> getComments() {
        return this.comments;
    }

    @Nullable
    public final String getMaxId() {
        return this.maxId;
    }

    @Nullable
    public final Boolean getHasNext() {
        return this.hasNext;
    }

    public setAgreements(@Nullable List<getAppLogoLink> list, @Nullable String str, @Nullable Boolean bool) {
        this.comments = list;
        this.maxId = str;
        this.hasNext = bool;
    }

    @NotNull
    public final RunningAverageRssiFilter.Measurement toFeedCommentResult() {
        List<getAppLogoLink> list = this.comments;
        List access$toComments = list != null ? getAgreements.toComments(list) : null;
        if (access$toComments == null) {
            access$toComments = CollectionsKt.emptyList();
        }
        String str = this.maxId;
        if (str == null) {
            str = "";
        }
        Boolean bool = this.hasNext;
        return new RunningAverageRssiFilter.Measurement(access$toComments, str, bool != null ? bool.booleanValue() : false);
    }
}
