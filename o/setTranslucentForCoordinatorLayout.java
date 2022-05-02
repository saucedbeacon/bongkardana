package o;

import java.util.HashMap;
import java.util.Map;

public class setTranslucentForCoordinatorLayout {
    public static final int ERROR_SOME = 200;
    static final int MAX_WARNING_CODE = 102;
    static final int MIN_WARNING_CODE = 100;
    public static final int WARNING_SPLIT_NAME_SHOULD_BE_TRIMMED = 100;
    public static final int WARNING_TRAFFIC_TYPE_HAS_UPPERCASE_CHARS = 101;
    public static final int WARNING_TRAFFIC_TYPE_WITHOUT_SPLIT_IN_ENVIRONMENT = 102;
    private Integer mError;
    private String mErrorMessage;
    private Map<Integer, String> mWarnings;

    setTranslucentForCoordinatorLayout(int i, String str) {
        this(i, str, false);
    }

    setTranslucentForCoordinatorLayout(int i, String str, boolean z) {
        this.mError = null;
        HashMap hashMap = new HashMap();
        this.mWarnings = hashMap;
        if (!z) {
            this.mError = Integer.valueOf(i);
            this.mErrorMessage = str;
            return;
        }
        hashMap.put(Integer.valueOf(i), str);
    }

    public Integer getError() {
        return this.mError;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public Map<Integer, String> getWarnings() {
        return this.mWarnings;
    }

    public boolean isError() {
        return this.mError != null;
    }

    public void addWarning(int i, String str) {
        if (str != null) {
            this.mWarnings.put(Integer.valueOf(i), str);
        }
    }

    public boolean hasWarning(int i) {
        return this.mWarnings.get(Integer.valueOf(i)) != null;
    }
}
