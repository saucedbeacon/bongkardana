package o;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity(indices = {@Index({"schedule_requested_at"}), @Index({"period_start_time"})})
public final class getInternalPopup {
    private static final String Grayscale$Algorithm = setSupportBackgroundTintList.length("WorkSpec");
    public static final next<List<length>, List<WorkInfo>> invokeSuspend = new next<List<length>, List<WorkInfo>>() {
        public final /* synthetic */ Object length(Object obj) {
            updateAppearance updateappearance;
            List<length> list = (List) obj;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (length length : list) {
                if (length.IsOverlapping == null || length.IsOverlapping.isEmpty()) {
                    updateappearance = updateAppearance.length;
                } else {
                    updateappearance = length.IsOverlapping.get(0);
                }
                arrayList.add(new WorkInfo(UUID.fromString(length.setMin), length.length, length.getMin, length.getMax, updateappearance, length.setMax));
            }
            return arrayList;
        }
    };
    @ColumnInfo(name = "backoff_policy")
    @NonNull
    public BackoffPolicy FastBitmap$CoordinateSystem = BackoffPolicy.EXPONENTIAL;
    @ColumnInfo(name = "initial_delay")
    public long IsOverlapping;
    @ColumnInfo(name = "flex_duration")
    public long equals;
    @ColumnInfo(name = "id")
    @NonNull
    @PrimaryKey
    public String getMax;
    @ColumnInfo(name = "state")
    @NonNull
    public WorkInfo.State getMin = WorkInfo.State.ENQUEUED;
    @ColumnInfo(name = "minimum_retention_duration")
    public long hashCode;
    @ColumnInfo(name = "schedule_requested_at")
    public long invoke = -1;
    @ColumnInfo(name = "interval_duration")
    public long isInside;
    @ColumnInfo(name = "input_merger_class_name")
    public String length;
    @ColumnInfo(name = "worker_class_name")
    @NonNull
    public String setMax;
    @ColumnInfo(name = "input")
    @NonNull
    public updateAppearance setMin = updateAppearance.length;
    @ColumnInfo(name = "period_start_time")
    public long toDoubleRange;
    @NonNull
    @Embedded
    public setDefaultActionButtonContentDescription toFloatRange = setDefaultActionButtonContentDescription.getMax;
    @ColumnInfo(name = "output")
    @NonNull
    public updateAppearance toIntRange = updateAppearance.length;
    @ColumnInfo(name = "backoff_delay_duration")
    public long toString = 30000;
    @ColumnInfo(name = "run_in_foreground")
    public boolean valueOf;
    @ColumnInfo(name = "run_attempt_count")
    @IntRange(from = 0)
    public int values;

    public getInternalPopup(@NonNull String str, @NonNull String str2) {
        this.getMax = str;
        this.setMax = str2;
    }

    public getInternalPopup(@NonNull getInternalPopup getinternalpopup) {
        this.getMax = getinternalpopup.getMax;
        this.setMax = getinternalpopup.setMax;
        this.getMin = getinternalpopup.getMin;
        this.length = getinternalpopup.length;
        this.setMin = new updateAppearance(getinternalpopup.setMin);
        this.toIntRange = new updateAppearance(getinternalpopup.toIntRange);
        this.IsOverlapping = getinternalpopup.IsOverlapping;
        this.isInside = getinternalpopup.isInside;
        this.equals = getinternalpopup.equals;
        this.toFloatRange = new setDefaultActionButtonContentDescription(getinternalpopup.toFloatRange);
        this.values = getinternalpopup.values;
        this.FastBitmap$CoordinateSystem = getinternalpopup.FastBitmap$CoordinateSystem;
        this.toString = getinternalpopup.toString;
        this.toDoubleRange = getinternalpopup.toDoubleRange;
        this.hashCode = getinternalpopup.hashCode;
        this.invoke = getinternalpopup.invoke;
        this.valueOf = getinternalpopup.valueOf;
    }

    public final boolean length() {
        return this.isInside != 0;
    }

    public final boolean setMax() {
        return this.getMin == WorkInfo.State.ENQUEUED && this.values > 0;
    }

    public final long getMin() {
        long j;
        boolean z = false;
        if (setMax()) {
            if (this.FastBitmap$CoordinateSystem == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.toString * ((long) this.values);
            } else {
                j = (long) Math.scalb((float) this.toString, this.values - 1);
            }
            return this.toDoubleRange + Math.min(18000000, j);
        }
        long j2 = 0;
        if (length()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.toDoubleRange;
            if (j3 == 0) {
                j3 = this.IsOverlapping + currentTimeMillis;
            }
            if (this.equals != this.isInside) {
                z = true;
            }
            if (z) {
                if (this.toDoubleRange == 0) {
                    j2 = this.equals * -1;
                }
                return j3 + this.isInside + j2;
            }
            if (this.toDoubleRange != 0) {
                j2 = this.isInside;
            }
            return j3 + j2;
        }
        long j4 = this.toDoubleRange;
        if (j4 == 0) {
            j4 = System.currentTimeMillis();
        }
        return j4 + this.IsOverlapping;
    }

    public final boolean setMin() {
        return !setDefaultActionButtonContentDescription.getMax.equals(this.toFloatRange);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInternalPopup)) {
            return false;
        }
        getInternalPopup getinternalpopup = (getInternalPopup) obj;
        if (this.IsOverlapping != getinternalpopup.IsOverlapping || this.isInside != getinternalpopup.isInside || this.equals != getinternalpopup.equals || this.values != getinternalpopup.values || this.toString != getinternalpopup.toString || this.toDoubleRange != getinternalpopup.toDoubleRange || this.hashCode != getinternalpopup.hashCode || this.invoke != getinternalpopup.invoke || this.valueOf != getinternalpopup.valueOf || !this.getMax.equals(getinternalpopup.getMax) || this.getMin != getinternalpopup.getMin || !this.setMax.equals(getinternalpopup.setMax)) {
            return false;
        }
        String str = this.length;
        if (str == null ? getinternalpopup.length == null : str.equals(getinternalpopup.length)) {
            return this.setMin.equals(getinternalpopup.setMin) && this.toIntRange.equals(getinternalpopup.toIntRange) && this.toFloatRange.equals(getinternalpopup.toFloatRange) && this.FastBitmap$CoordinateSystem == getinternalpopup.FastBitmap$CoordinateSystem;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode2 = ((((this.getMax.hashCode() * 31) + this.getMin.hashCode()) * 31) + this.setMax.hashCode()) * 31;
        String str = this.length;
        int hashCode3 = str != null ? str.hashCode() : 0;
        long j = this.IsOverlapping;
        long j2 = this.isInside;
        long j3 = this.equals;
        long j4 = this.toString;
        long j5 = this.toDoubleRange;
        long j6 = this.hashCode;
        long j7 = this.invoke;
        return ((((((((((((((((((((((((((hashCode2 + hashCode3) * 31) + this.setMin.hashCode()) * 31) + this.toIntRange.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.toFloatRange.hashCode()) * 31) + this.values) * 31) + this.FastBitmap$CoordinateSystem.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.valueOf ? 1 : 0);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.getMax);
        sb.append("}");
        return sb.toString();
    }

    public static class setMax {
        @ColumnInfo(name = "id")
        public String getMax;
        @ColumnInfo(name = "state")
        public WorkInfo.State setMin;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            if (this.setMin != setmax.setMin) {
                return false;
            }
            return this.getMax.equals(setmax.getMax);
        }

        public final int hashCode() {
            return (this.getMax.hashCode() * 31) + this.setMin.hashCode();
        }
    }

    public static class length {
        @Relation(entity = performClick.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<updateAppearance> IsOverlapping;
        @Relation(entity = setPrompt.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> getMax;
        @ColumnInfo(name = "output")
        public updateAppearance getMin;
        @ColumnInfo(name = "state")
        public WorkInfo.State length;
        @ColumnInfo(name = "run_attempt_count")
        public int setMax;
        @ColumnInfo(name = "id")
        public String setMin;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length2 = (length) obj;
            if (this.setMax != length2.setMax) {
                return false;
            }
            String str = this.setMin;
            if (str == null ? length2.setMin != null : !str.equals(length2.setMin)) {
                return false;
            }
            if (this.length != length2.length) {
                return false;
            }
            updateAppearance updateappearance = this.getMin;
            if (updateappearance == null ? length2.getMin != null : !updateappearance.equals(length2.getMin)) {
                return false;
            }
            List<String> list = this.getMax;
            if (list == null ? length2.getMax != null : !list.equals(length2.getMax)) {
                return false;
            }
            List<updateAppearance> list2 = this.IsOverlapping;
            List<updateAppearance> list3 = length2.IsOverlapping;
            if (list2 != null) {
                return list2.equals(list3);
            }
            return list3 == null;
        }

        public final int hashCode() {
            String str = this.setMin;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            WorkInfo.State state = this.length;
            int hashCode2 = (hashCode + (state != null ? state.hashCode() : 0)) * 31;
            updateAppearance updateappearance = this.getMin;
            int hashCode3 = (((hashCode2 + (updateappearance != null ? updateappearance.hashCode() : 0)) * 31) + this.setMax) * 31;
            List<String> list = this.getMax;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<updateAppearance> list2 = this.IsOverlapping;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return hashCode4 + i;
        }
    }
}
