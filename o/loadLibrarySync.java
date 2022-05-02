package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import io.split.android.client.service.executor.SplitTaskExecutionStatus;
import io.split.android.client.service.executor.SplitTaskType;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public class loadLibrarySync {
    public static final String IS_STREAMING_ENABLED = "IS_STREAMING_ENABLED";
    public static final String IS_VALID_API_KEY = "IS_VALID_API_KEY";
    public static final String NON_SENT_BYTES = "NON_SENT_BYTES";
    public static final String NON_SENT_RECORDS = "NON_SENT_RECORDS";
    public static final String PARSED_SSE_JWT = "PARSED_SSE_JWT";
    public static final String UNEXPECTED_ERROR = "UNEXPECTED_ERROR";
    private final Map<String, Object> data;
    private final SplitTaskExecutionStatus status;
    private final SplitTaskType taskType;

    public static loadLibrarySync success(SplitTaskType splitTaskType) {
        return new loadLibrarySync(splitTaskType, SplitTaskExecutionStatus.SUCCESS, new HashMap());
    }

    public static loadLibrarySync success(SplitTaskType splitTaskType, Map<String, Object> map) {
        return new loadLibrarySync(splitTaskType, SplitTaskExecutionStatus.SUCCESS, map);
    }

    public static loadLibrarySync error(SplitTaskType splitTaskType) {
        return new loadLibrarySync(splitTaskType, SplitTaskExecutionStatus.ERROR, new HashMap());
    }

    public static loadLibrarySync error(SplitTaskType splitTaskType, Map<String, Object> map) {
        return new loadLibrarySync(splitTaskType, SplitTaskExecutionStatus.ERROR, map);
    }

    private loadLibrarySync(SplitTaskType splitTaskType, @NonNull SplitTaskExecutionStatus splitTaskExecutionStatus, @NonNull Map<String, Object> map) {
        this.taskType = (SplitTaskType) Preconditions.checkNotNull(splitTaskType);
        this.status = (SplitTaskExecutionStatus) Preconditions.checkNotNull(splitTaskExecutionStatus);
        this.data = (Map) Preconditions.checkNotNull(map);
    }

    public SplitTaskExecutionStatus getStatus() {
        return this.status;
    }

    public SplitTaskType getTaskType() {
        return this.taskType;
    }

    @Nullable
    public Integer getIntegerValue(String str) {
        Object obj = this.data.get(str);
        if (obj != null) {
            return Integer.valueOf(Integer.parseInt(obj.toString()));
        }
        return null;
    }

    @Nullable
    public Long getLongValue(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1707999411, oncanceled);
            onCancelLoad.getMin(1707999411, oncanceled);
        }
        Object obj = this.data.get(str);
        if (obj != null) {
            return Long.valueOf(Long.parseLong(obj.toString()));
        }
        return null;
    }

    @Nullable
    public String getStringValue(String str) {
        Object obj = this.data.get(str);
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    @Nullable
    public Boolean getBoolValue(String str) {
        Object obj = this.data.get(str);
        if (obj != null) {
            return Boolean.valueOf(Boolean.parseBoolean(obj.toString()));
        }
        return null;
    }

    @Nullable
    public Object getObjectValue(String str) {
        return this.data.get(str);
    }
}
