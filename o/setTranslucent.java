package o;

import io.split.android.client.validators.ValidationMessageLogger;
import java.util.ArrayList;

public final class setTranslucent implements ValidationMessageLogger {
    private String sanitizeTag(String str) {
        return str != null ? str : "";
    }

    public final void log(setTranslucentForCoordinatorLayout settranslucentforcoordinatorlayout, String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-904357318, oncanceled);
            onCancelLoad.getMin(-904357318, oncanceled);
        }
        if (!settranslucentforcoordinatorlayout.isError() || settranslucentforcoordinatorlayout.getErrorMessage() == null) {
            w(settranslucentforcoordinatorlayout, str);
        } else {
            e(settranslucentforcoordinatorlayout, str);
        }
    }

    public final void e(setTranslucentForCoordinatorLayout settranslucentforcoordinatorlayout, String str) {
        e(str, settranslucentforcoordinatorlayout.getErrorMessage());
    }

    public final void w(setTranslucentForCoordinatorLayout settranslucentforcoordinatorlayout, String str) {
        for (String w : new ArrayList(settranslucentforcoordinatorlayout.getWarnings().values())) {
            w(str, w);
        }
    }

    public final void e(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(972981697, oncanceled);
            onCancelLoad.getMin(972981697, oncanceled);
        }
        logError(str, str2);
    }

    public final void w(String str, String str2) {
        logWarning(str, str2);
    }

    private void logError(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(sanitizeTag(str2));
        sb.append(": ");
        sb.append(str);
        createLoadingDialog.e(sb.toString());
    }

    private void logWarning(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(sanitizeTag(str2));
        sb.append(": ");
        sb.append(str);
        createLoadingDialog.w(sb.toString());
    }
}
