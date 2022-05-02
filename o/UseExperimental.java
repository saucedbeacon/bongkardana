package o;

import android.util.Base64;
import androidx.annotation.NonNull;
import id.dana.R;
import java.util.List;

public final class UseExperimental {
    final String getMax;
    final String getMin;
    final String isInside;
    final String length;
    final int setMax;
    final List<List<byte[]>> setMin;

    public UseExperimental(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        if (str != null) {
            this.getMin = str;
            if (str2 != null) {
                this.length = str2;
                if (str3 != null) {
                    this.getMax = str3;
                    if (list != null) {
                        this.setMin = list;
                        this.setMax = 0;
                        StringBuilder sb = new StringBuilder(str);
                        sb.append("-");
                        sb.append(str2);
                        sb.append("-");
                        sb.append(str3);
                        this.isInside = sb.toString();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public UseExperimental(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (str != null) {
            this.getMin = str;
            if (str2 != null) {
                this.length = str2;
                if (str3 != null) {
                    this.getMax = str3;
                    this.setMin = null;
                    this.setMax = R.array.f1182130903041;
                    StringBuilder sb = new StringBuilder(str);
                    sb.append("-");
                    sb.append(str2);
                    sb.append("-");
                    sb.append(str3);
                    this.isInside = sb.toString();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.getMin);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.length);
        sb2.append(", mQuery: ");
        sb2.append(this.getMax);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.setMin.size(); i++) {
            sb.append(" [");
            List list = this.setMin.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.setMax);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
