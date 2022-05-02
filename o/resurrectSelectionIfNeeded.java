package o;

import id.dana.social.state.FeedCommentModelState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\u0006\u0010'\u001a\u00020\bJ\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lid/dana/social/model/FeedCommentModel;", "", "id", "", "user", "Lid/dana/social/model/ActivityReactionsUserModel;", "content", "ownComment", "", "createdTime", "state", "Lid/dana/social/state/FeedCommentModelState;", "(Ljava/lang/String;Lid/dana/social/model/ActivityReactionsUserModel;Ljava/lang/String;ZLjava/lang/String;Lid/dana/social/state/FeedCommentModelState;)V", "getContent", "()Ljava/lang/String;", "getCreatedTime", "setCreatedTime", "(Ljava/lang/String;)V", "getId", "setId", "getOwnComment", "()Z", "getState", "()Lid/dana/social/state/FeedCommentModelState;", "setState", "(Lid/dana/social/state/FeedCommentModelState;)V", "getUser", "()Lid/dana/social/model/ActivityReactionsUserModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "isUserIdEmpty", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class resurrectSelectionIfNeeded {
    private final boolean equals;
    @NotNull
    public String getMax;
    @NotNull
    public FeedCommentModelState getMin;
    @NotNull
    public final recycleOnMeasure length;
    @NotNull
    public final String setMax;
    @NotNull
    public String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resurrectSelectionIfNeeded)) {
            return false;
        }
        resurrectSelectionIfNeeded resurrectselectionifneeded = (resurrectSelectionIfNeeded) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) resurrectselectionifneeded.getMax) && Intrinsics.areEqual((Object) this.length, (Object) resurrectselectionifneeded.length) && Intrinsics.areEqual((Object) this.setMax, (Object) resurrectselectionifneeded.setMax) && this.equals == resurrectselectionifneeded.equals && Intrinsics.areEqual((Object) this.setMin, (Object) resurrectselectionifneeded.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) resurrectselectionifneeded.getMin);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        recycleOnMeasure recycleonmeasure = this.length;
        int hashCode2 = (hashCode + (recycleonmeasure != null ? recycleonmeasure.hashCode() : 0)) * 31;
        String str2 = this.setMax;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.equals;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.setMin;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        FeedCommentModelState feedCommentModelState = this.getMin;
        if (feedCommentModelState != null) {
            i = feedCommentModelState.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedCommentModel(id=");
        sb.append(this.getMax);
        sb.append(", user=");
        sb.append(this.length);
        sb.append(", content=");
        sb.append(this.setMax);
        sb.append(", ownComment=");
        sb.append(this.equals);
        sb.append(", createdTime=");
        sb.append(this.setMin);
        sb.append(", state=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public resurrectSelectionIfNeeded(@NotNull String str, @NotNull recycleOnMeasure recycleonmeasure, @NotNull String str2, boolean z, @NotNull String str3, @NotNull FeedCommentModelState feedCommentModelState) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(recycleonmeasure, "user");
        Intrinsics.checkNotNullParameter(str2, "content");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        Intrinsics.checkNotNullParameter(feedCommentModelState, "state");
        this.getMax = str;
        this.length = recycleonmeasure;
        this.setMax = str2;
        this.equals = z;
        this.setMin = str3;
        this.getMin = feedCommentModelState;
    }

    public final boolean length() {
        return this.equals;
    }

    public final boolean setMin() {
        CharSequence charSequence = this.length.getMax;
        return charSequence == null || charSequence.length() == 0;
    }
}
