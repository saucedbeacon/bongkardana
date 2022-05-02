package o;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DummyDataSource;

public final class getEnterAnim implements DataSource.Factory {
    public static final getEnterAnim setMin = new getEnterAnim();

    public final DataSource createDataSource() {
        return new DummyDataSource();
    }
}
