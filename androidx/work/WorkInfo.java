package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o.updateAppearance;

public final class WorkInfo {
    private int IsOverlapping;
    @NonNull
    public updateAppearance getMax;
    @NonNull
    public State getMin;
    @NonNull
    private updateAppearance length;
    @NonNull
    public Set<String> setMax;
    @NonNull
    private UUID setMin;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkInfo(@NonNull UUID uuid, @NonNull State state, @NonNull updateAppearance updateappearance, @NonNull List<String> list, @NonNull updateAppearance updateappearance2, int i) {
        this.setMin = uuid;
        this.getMin = state;
        this.length = updateappearance;
        this.setMax = new HashSet(list);
        this.getMax = updateappearance2;
        this.IsOverlapping = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.IsOverlapping == workInfo.IsOverlapping && this.setMin.equals(workInfo.setMin) && this.getMin == workInfo.getMin && this.length.equals(workInfo.length) && this.setMax.equals(workInfo.setMax)) {
            return this.getMax.equals(workInfo.getMax);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.setMin.hashCode() * 31) + this.getMin.hashCode()) * 31) + this.length.hashCode()) * 31) + this.setMax.hashCode()) * 31) + this.getMax.hashCode()) * 31) + this.IsOverlapping;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{mId='");
        sb.append(this.setMin);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.getMin);
        sb.append(", mOutputData=");
        sb.append(this.length);
        sb.append(", mTags=");
        sb.append(this.setMax);
        sb.append(", mProgress=");
        sb.append(this.getMax);
        sb.append('}');
        return sb.toString();
    }

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }
}
