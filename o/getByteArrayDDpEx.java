package o;

import androidx.annotation.NonNull;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class getByteArrayDDpEx {
    private Map<String, String> mParams;
    private String mPath;
    private String mQueryString;
    private URI mRootURI;

    public getByteArrayDDpEx(@NonNull URI uri, String str) {
        URI uri2 = (URI) Preconditions.checkNotNull(uri);
        this.mRootURI = uri2;
        String path = uri2.getPath();
        if (str != null && path != null) {
            String format = String.format("%s/%s", new Object[]{path, str});
            this.mPath = format;
            String replace = format.replace("///", "/");
            this.mPath = replace;
            this.mPath = replace.replace("//", "/");
        } else if (path != null) {
            this.mPath = path;
            this.mQueryString = uri.getQuery();
        } else {
            this.mPath = str;
        }
        this.mParams = new HashMap();
    }

    public getByteArrayDDpEx(@NonNull URI uri) {
        this(uri, (String) null);
    }

    public getByteArrayDDpEx addParameter(@NonNull String str, @NonNull String str2) {
        if (!(str == null || str2 == null)) {
            this.mParams.put(str, str2);
        }
        return this;
    }

    public getByteArrayDDpEx defaultQueryString(@NonNull String str) {
        if (!Strings.isNullOrEmpty(str)) {
            this.mQueryString = str;
        }
        return this;
    }

    public URI build() throws URISyntaxException {
        String str;
        if (this.mParams.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : this.mParams.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb.append((String) next.getValue());
                sb.append("&");
            }
            str = sb.substring(0, sb.length() - 1);
        } else {
            str = null;
        }
        if (!Strings.isNullOrEmpty(this.mQueryString)) {
            if (!Strings.isNullOrEmpty(str)) {
                if (!"&".equals(this.mQueryString.substring(0, 1))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("&");
                    str = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(this.mQueryString);
                str = sb3.toString();
            } else {
                str = this.mQueryString;
            }
        }
        return new URI(this.mRootURI.getScheme(), (String) null, this.mRootURI.getHost(), this.mRootURI.getPort(), this.mPath, str, (String) null);
    }
}
