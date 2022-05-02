package o;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteStatement;

final class ActionBarOverlayLayout extends setHasNonEmbeddedTabs implements SupportSQLiteStatement {
    private final SQLiteStatement setMax;

    @RequiresApi(21)
    class LayoutParams extends ActionMenuView {
        private static boolean getMax = true;
        private static boolean getMin = true;
        private static boolean length = true;

        LayoutParams() {
        }

        @SuppressLint({"NewApi"})
        public void getMax(@NonNull View view, @NonNull Matrix matrix) {
            if (getMin) {
                try {
                    view.transformMatrixToGlobal(matrix);
                } catch (NoSuchMethodError unused) {
                    getMin = false;
                }
            }
        }

        @SuppressLint({"NewApi"})
        public void setMax(@NonNull View view, @NonNull Matrix matrix) {
            if (getMax) {
                try {
                    view.transformMatrixToLocal(matrix);
                } catch (NoSuchMethodError unused) {
                    getMax = false;
                }
            }
        }
    }

    ActionBarOverlayLayout(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.setMax = sQLiteStatement;
    }

    public final int executeUpdateDelete() {
        return this.setMax.executeUpdateDelete();
    }

    public final long executeInsert() {
        return this.setMax.executeInsert();
    }
}
