package o;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

public final class expandItemActionView implements SupportSQLiteOpenHelper.length {
    @NonNull
    private final setHeaderTitleInt getMax;
    @NonNull
    private final SupportSQLiteOpenHelper.length setMin;

    public expandItemActionView(@NonNull SupportSQLiteOpenHelper.length length, @NonNull setHeaderTitleInt setheadertitleint) {
        this.setMin = length;
        this.getMax = setheadertitleint;
    }

    @NonNull
    public final /* synthetic */ SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new setHeaderInternal(this.setMin.create(configuration), this.getMax);
    }
}
