package o;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003Jc\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0012¨\u0006#"}, d2 = {"Lid/dana/domain/social/model/FeedHomeConfig;", "Ljava/io/Serializable;", "isRealtimeFeedEnabled", "", "isFeedEnabled", "interval", "", "activitiesPerRequest", "isFeedWidgetEnabled", "isFeedCommentEnabled", "isFeedNotificationEnabled", "feedVersion", "isReciprocalFeedEnabled", "(ZZIIZZZIZ)V", "getActivitiesPerRequest", "()I", "getFeedVersion", "getInterval", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getMonitoringStatus implements Serializable {
    private final int activitiesPerRequest;
    private final int feedVersion;
    private final int interval;
    private final boolean isFeedCommentEnabled;
    private final boolean isFeedEnabled;
    private final boolean isFeedNotificationEnabled;
    private final boolean isFeedWidgetEnabled;
    private final boolean isRealtimeFeedEnabled;
    private final boolean isReciprocalFeedEnabled;

    public static /* synthetic */ getMonitoringStatus copy$default(getMonitoringStatus getmonitoringstatus, boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, boolean z6, int i4, Object obj) {
        getMonitoringStatus getmonitoringstatus2 = getmonitoringstatus;
        int i5 = i4;
        return getmonitoringstatus.copy((i5 & 1) != 0 ? getmonitoringstatus2.isRealtimeFeedEnabled : z, (i5 & 2) != 0 ? getmonitoringstatus2.isFeedEnabled : z2, (i5 & 4) != 0 ? getmonitoringstatus2.interval : i, (i5 & 8) != 0 ? getmonitoringstatus2.activitiesPerRequest : i2, (i5 & 16) != 0 ? getmonitoringstatus2.isFeedWidgetEnabled : z3, (i5 & 32) != 0 ? getmonitoringstatus2.isFeedCommentEnabled : z4, (i5 & 64) != 0 ? getmonitoringstatus2.isFeedNotificationEnabled : z5, (i5 & 128) != 0 ? getmonitoringstatus2.feedVersion : i3, (i5 & 256) != 0 ? getmonitoringstatus2.isReciprocalFeedEnabled : z6);
    }

    public final boolean component1() {
        return this.isRealtimeFeedEnabled;
    }

    public final boolean component2() {
        return this.isFeedEnabled;
    }

    public final int component3() {
        return this.interval;
    }

    public final int component4() {
        return this.activitiesPerRequest;
    }

    public final boolean component5() {
        return this.isFeedWidgetEnabled;
    }

    public final boolean component6() {
        return this.isFeedCommentEnabled;
    }

    public final boolean component7() {
        return this.isFeedNotificationEnabled;
    }

    public final int component8() {
        return this.feedVersion;
    }

    public final boolean component9() {
        return this.isReciprocalFeedEnabled;
    }

    @NotNull
    public final getMonitoringStatus copy(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, boolean z6) {
        return new getMonitoringStatus(z, z2, i, i2, z3, z4, z5, i3, z6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMonitoringStatus)) {
            return false;
        }
        getMonitoringStatus getmonitoringstatus = (getMonitoringStatus) obj;
        return this.isRealtimeFeedEnabled == getmonitoringstatus.isRealtimeFeedEnabled && this.isFeedEnabled == getmonitoringstatus.isFeedEnabled && this.interval == getmonitoringstatus.interval && this.activitiesPerRequest == getmonitoringstatus.activitiesPerRequest && this.isFeedWidgetEnabled == getmonitoringstatus.isFeedWidgetEnabled && this.isFeedCommentEnabled == getmonitoringstatus.isFeedCommentEnabled && this.isFeedNotificationEnabled == getmonitoringstatus.isFeedNotificationEnabled && this.feedVersion == getmonitoringstatus.feedVersion && this.isReciprocalFeedEnabled == getmonitoringstatus.isReciprocalFeedEnabled;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedHomeConfig(isRealtimeFeedEnabled=");
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

    public getMonitoringStatus(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, boolean z6) {
        this.isRealtimeFeedEnabled = z;
        this.isFeedEnabled = z2;
        this.interval = i;
        this.activitiesPerRequest = i2;
        this.isFeedWidgetEnabled = z3;
        this.isFeedCommentEnabled = z4;
        this.isFeedNotificationEnabled = z5;
        this.feedVersion = i3;
        this.isReciprocalFeedEnabled = z6;
    }

    public final boolean isRealtimeFeedEnabled() {
        return this.isRealtimeFeedEnabled;
    }

    public final boolean isFeedEnabled() {
        return this.isFeedEnabled;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final int getActivitiesPerRequest() {
        return this.activitiesPerRequest;
    }

    public final boolean isFeedWidgetEnabled() {
        return this.isFeedWidgetEnabled;
    }

    public final boolean isFeedCommentEnabled() {
        return this.isFeedCommentEnabled;
    }

    public final boolean isFeedNotificationEnabled() {
        return this.isFeedNotificationEnabled;
    }

    public final int getFeedVersion() {
        return this.feedVersion;
    }

    public final boolean isReciprocalFeedEnabled() {
        return this.isReciprocalFeedEnabled;
    }

    public final int hashCode() {
        boolean z = this.isRealtimeFeedEnabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.isFeedEnabled;
        if (z3) {
            z3 = true;
        }
        int hashCode = (((((i + (z3 ? 1 : 0)) * 31) + Integer.valueOf(this.interval).hashCode()) * 31) + Integer.valueOf(this.activitiesPerRequest).hashCode()) * 31;
        boolean z4 = this.isFeedWidgetEnabled;
        if (z4) {
            z4 = true;
        }
        int i2 = (hashCode + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isFeedCommentEnabled;
        if (z5) {
            z5 = true;
        }
        int i3 = (i2 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.isFeedNotificationEnabled;
        if (z6) {
            z6 = true;
        }
        int hashCode2 = (((i3 + (z6 ? 1 : 0)) * 31) + Integer.valueOf(this.feedVersion).hashCode()) * 31;
        boolean z7 = this.isReciprocalFeedEnabled;
        if (!z7) {
            z2 = z7;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }
}
