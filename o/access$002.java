package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013Jz\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020'HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\t\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0004\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\n\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0002\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\f\u0010\u0013¨\u0006("}, d2 = {"Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "Ljava/io/Serializable;", "isRealtimeFeedEnabled", "", "isFeedEnabled", "interval", "", "activitiesPerRequest", "isFeedWidgetEnabled", "isFeedCommentEnabled", "isFeedNotificationEnabled", "feedVersion", "isReciprocalFeedEnabled", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getActivitiesPerRequest", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFeedVersion", "getInterval", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;)Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "equals", "other", "", "hashCode", "toFeedHomeConfig", "Lid/dana/domain/social/model/FeedHomeConfig;", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$002 implements Serializable {
    @Nullable
    Integer activitiesPerRequest;
    @Nullable
    Integer feedVersion;
    @Nullable
    Integer interval;
    @Nullable
    Boolean isFeedCommentEnabled;
    @Nullable
    Boolean isFeedEnabled;
    @Nullable
    Boolean isFeedNotificationEnabled;
    @Nullable
    Boolean isFeedWidgetEnabled;
    @Nullable
    Boolean isRealtimeFeedEnabled;
    @Nullable
    Boolean isReciprocalFeedEnabled;

    public /* synthetic */ access$002() {
    }

    public static /* synthetic */ access$002 copy$default(access$002 access_002, Boolean bool, Boolean bool2, Integer num, Integer num2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num3, Boolean bool6, int i, Object obj) {
        access$002 access_0022 = access_002;
        int i2 = i;
        return access_002.copy((i2 & 1) != 0 ? access_0022.isRealtimeFeedEnabled : bool, (i2 & 2) != 0 ? access_0022.isFeedEnabled : bool2, (i2 & 4) != 0 ? access_0022.interval : num, (i2 & 8) != 0 ? access_0022.activitiesPerRequest : num2, (i2 & 16) != 0 ? access_0022.isFeedWidgetEnabled : bool3, (i2 & 32) != 0 ? access_0022.isFeedCommentEnabled : bool4, (i2 & 64) != 0 ? access_0022.isFeedNotificationEnabled : bool5, (i2 & 128) != 0 ? access_0022.feedVersion : num3, (i2 & 256) != 0 ? access_0022.isReciprocalFeedEnabled : bool6);
    }

    @Nullable
    public final Boolean component1() {
        return this.isRealtimeFeedEnabled;
    }

    @Nullable
    public final Boolean component2() {
        return this.isFeedEnabled;
    }

    @Nullable
    public final Integer component3() {
        return this.interval;
    }

    @Nullable
    public final Integer component4() {
        return this.activitiesPerRequest;
    }

    @Nullable
    public final Boolean component5() {
        return this.isFeedWidgetEnabled;
    }

    @Nullable
    public final Boolean component6() {
        return this.isFeedCommentEnabled;
    }

    @Nullable
    public final Boolean component7() {
        return this.isFeedNotificationEnabled;
    }

    @Nullable
    public final Integer component8() {
        return this.feedVersion;
    }

    @Nullable
    public final Boolean component9() {
        return this.isReciprocalFeedEnabled;
    }

    @NotNull
    public final access$002 copy(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Integer num3, @Nullable Boolean bool6) {
        return new access$002(bool, bool2, num, num2, bool3, bool4, bool5, num3, bool6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$002)) {
            return false;
        }
        access$002 access_002 = (access$002) obj;
        return Intrinsics.areEqual((Object) this.isRealtimeFeedEnabled, (Object) access_002.isRealtimeFeedEnabled) && Intrinsics.areEqual((Object) this.isFeedEnabled, (Object) access_002.isFeedEnabled) && Intrinsics.areEqual((Object) this.interval, (Object) access_002.interval) && Intrinsics.areEqual((Object) this.activitiesPerRequest, (Object) access_002.activitiesPerRequest) && Intrinsics.areEqual((Object) this.isFeedWidgetEnabled, (Object) access_002.isFeedWidgetEnabled) && Intrinsics.areEqual((Object) this.isFeedCommentEnabled, (Object) access_002.isFeedCommentEnabled) && Intrinsics.areEqual((Object) this.isFeedNotificationEnabled, (Object) access_002.isFeedNotificationEnabled) && Intrinsics.areEqual((Object) this.feedVersion, (Object) access_002.feedVersion) && Intrinsics.areEqual((Object) this.isReciprocalFeedEnabled, (Object) access_002.isReciprocalFeedEnabled);
    }

    public final int hashCode() {
        Boolean bool = this.isRealtimeFeedEnabled;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.isFeedEnabled;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.interval;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.activitiesPerRequest;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Boolean bool3 = this.isFeedWidgetEnabled;
        int hashCode5 = (hashCode4 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.isFeedCommentEnabled;
        int hashCode6 = (hashCode5 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.isFeedNotificationEnabled;
        int hashCode7 = (hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Integer num3 = this.feedVersion;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool6 = this.isReciprocalFeedEnabled;
        if (bool6 != null) {
            i = bool6.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedHomeConfigResult(isRealtimeFeedEnabled=");
        sb.append(this.isRealtimeFeedEnabled);
        sb.append(", isFeedEnabled=");
        sb.append(this.isFeedEnabled);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", activitiesPerRequest=");
        sb.append(this.activitiesPerRequest);
        sb.append(", isFeedWidgetEnabled=");
        sb.append(this.isFeedWidgetEnabled);
        sb.append(", isFeedCommentEnabled=");
        sb.append(this.isFeedCommentEnabled);
        sb.append(", isFeedNotificationEnabled=");
        sb.append(this.isFeedNotificationEnabled);
        sb.append(", feedVersion=");
        sb.append(this.feedVersion);
        sb.append(", isReciprocalFeedEnabled=");
        sb.append(this.isReciprocalFeedEnabled);
        sb.append(")");
        return sb.toString();
    }

    public access$002(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Integer num3, @Nullable Boolean bool6) {
        this.isRealtimeFeedEnabled = bool;
        this.isFeedEnabled = bool2;
        this.interval = num;
        this.activitiesPerRequest = num2;
        this.isFeedWidgetEnabled = bool3;
        this.isFeedCommentEnabled = bool4;
        this.isFeedNotificationEnabled = bool5;
        this.feedVersion = num3;
        this.isReciprocalFeedEnabled = bool6;
    }

    @Nullable
    public final Boolean isRealtimeFeedEnabled() {
        return this.isRealtimeFeedEnabled;
    }

    @Nullable
    public final Boolean isFeedEnabled() {
        return this.isFeedEnabled;
    }

    @Nullable
    public final Integer getInterval() {
        return this.interval;
    }

    @Nullable
    public final Integer getActivitiesPerRequest() {
        return this.activitiesPerRequest;
    }

    @Nullable
    public final Boolean isFeedWidgetEnabled() {
        return this.isFeedWidgetEnabled;
    }

    @Nullable
    public final Boolean isFeedCommentEnabled() {
        return this.isFeedCommentEnabled;
    }

    @Nullable
    public final Boolean isFeedNotificationEnabled() {
        return this.isFeedNotificationEnabled;
    }

    @Nullable
    public final Integer getFeedVersion() {
        return this.feedVersion;
    }

    @Nullable
    public final Boolean isReciprocalFeedEnabled() {
        return this.isReciprocalFeedEnabled;
    }

    @NotNull
    public final getMonitoringStatus toFeedHomeConfig() {
        Boolean bool = this.isRealtimeFeedEnabled;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.isFeedEnabled;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Integer num = this.interval;
        int intValue = num != null ? num.intValue() : 30000;
        Integer num2 = this.activitiesPerRequest;
        int intValue2 = num2 != null ? num2.intValue() : 10;
        Boolean bool3 = this.isFeedWidgetEnabled;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = this.isFeedCommentEnabled;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = this.isFeedNotificationEnabled;
        boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Integer num3 = this.feedVersion;
        int intValue3 = num3 != null ? num3.intValue() : 3;
        Boolean bool6 = this.isReciprocalFeedEnabled;
        return new getMonitoringStatus(booleanValue, booleanValue2, intValue, intValue2, booleanValue3, booleanValue4, booleanValue5, intValue3, bool6 != null ? bool6.booleanValue() : false);
    }
}
