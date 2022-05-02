package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class getTabContainer implements SupportSQLiteOpenHelper.length {
    @NonNull
    private final SupportSQLiteOpenHelper.length getMax;
    @Nullable
    private final String getMin;
    @Nullable
    private final File setMax;
    @Nullable
    private final Callable<InputStream> setMin;

    public getTabContainer(@Nullable String str, @Nullable File file, @Nullable Callable<InputStream> callable, @NonNull SupportSQLiteOpenHelper.length length) {
        this.getMin = str;
        this.setMax = file;
        this.setMin = callable;
        this.getMax = length;
    }

    @NonNull
    public final SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        return new setTransitioning(configuration.getMax, this.getMin, this.setMax, this.setMin, configuration.length.setMax, this.getMax.create(configuration));
    }
}
