package o;

import androidx.sqlite.db.SupportSQLiteStatement;

final class collapseItemActionView implements next {
    public static final collapseItemActionView getMax = new collapseItemActionView();

    public final Object length(Object obj) {
        return Integer.valueOf(((SupportSQLiteStatement) obj).executeUpdateDelete());
    }
}
