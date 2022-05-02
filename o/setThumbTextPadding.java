package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public final class setThumbTextPadding implements getSwitchPadding {
    @NonNull
    private final HttpURLConnection getMax;

    public setThumbTextPadding(@NonNull HttpURLConnection httpURLConnection) {
        this.getMax = httpURLConnection;
    }

    public final boolean getMax() {
        try {
            return this.getMax.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @NonNull
    public final InputStream length() throws IOException {
        return this.getMax.getInputStream();
    }

    @Nullable
    public final String setMax() {
        return this.getMax.getContentType();
    }

    @Nullable
    public final String getMin() {
        try {
            if (getMax()) {
                return null;
            }
            StringBuilder sb = new StringBuilder("Unable to fetch ");
            sb.append(this.getMax.getURL());
            sb.append(". Failed with ");
            sb.append(this.getMax.getResponseCode());
            sb.append("\n");
            sb.append(getMax(this.getMax));
            return sb.toString();
        } catch (IOException e) {
            setTitleMargin.setMin("get error failed ");
            return e.getMessage();
        }
    }

    public final void close() {
        this.getMax.disconnect();
    }

    private static String getMax(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }
}
