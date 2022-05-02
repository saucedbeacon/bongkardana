package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;

public class APImageDownloadRsp {
    public long setMin = 999999999;

    public APImageDownloadRsp() {
    }

    public APImageDownloadRsp(long j) {
        this.setMin = j;
    }

    public APImageDownloadRsp(String str) {
        long j;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    j = Long.parseLong(isOriginHasAppInfo.getCleanAll(str));
                    this.setMin = j;
                }
            } catch (NumberFormatException unused) {
                this.setMin = 0;
                return;
            }
        }
        j = 0;
        this.setMin = j;
    }

    public final boolean setMin() {
        return toString().length() <= 11;
    }

    @NonNull
    public String toString() {
        return String.valueOf(this.setMin);
    }

    public final boolean length(APImageDownloadRsp aPImageDownloadRsp) {
        return this.setMin > aPImageDownloadRsp.setMin;
    }
}
