package o;

import android.content.Context;
import androidx.room.RoomDatabase;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.base.BasePersistenceDao;
import id.dana.data.base.SqlCipherUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SupportFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/base/DbFactory;", "", "()V", "PRODUCTION", "", "create", "Lid/dana/data/base/BasePersistenceDao;", "context", "Landroid/content/Context;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class removeUpdateListener {
    @NotNull
    public static final removeUpdateListener INSTANCE = new removeUpdateListener();
    @NotNull
    public static final String PRODUCTION = "production";

    private removeUpdateListener() {
    }

    @JvmStatic
    @NotNull
    public static final BasePersistenceDao create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        RoomDatabase.setMax<BasePersistenceDao> min = setPrimaryBackground.setMin(context, BasePersistenceDao.class, "DB-id.dana.data-production");
        min.IsOverlapping = false;
        min.toIntRange = true;
        RoomDatabase.setMax<BasePersistenceDao> max = min.setMax(reverseAnimationSpeed.MIGRATION_3_4, reverseAnimationSpeed.MIGRATION_4_5, reverseAnimationSpeed.MIGRATION_5_6, reverseAnimationSpeed.MIGRATION_6_7, reverseAnimationSpeed.MIGRATION_7_8, reverseAnimationSpeed.MIGRATION_9_10, reverseAnimationSpeed.MIGRATION_10_11, reverseAnimationSpeed.MIGRATION_11_12, reverseAnimationSpeed.MIGRATION_12_13, reverseAnimationSpeed.MIGRATION_13_14, reverseAnimationSpeed.MIGRATION_14_15, reverseAnimationSpeed.MIGRATION_15_16);
        max.getMin = true;
        max.length = RoomDatabase.JournalMode.AUTOMATIC;
        Intrinsics.checkNotNullExpressionValue(max, "Room.databaseBuilder(con…se.JournalMode.AUTOMATIC)");
        if (StringsKt.equals("production", "production", true)) {
            char[] charArray = "96eaf0ab910921d5456e8fe2ebd5a2ecc205ca7d".toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
            byte[] bytes = SQLiteDatabase.getBytes(charArray);
            if (SqlCipherUtils.State.UNENCRYPTED == SqlCipherUtils.getDatabaseState(context, "DB-id.dana.data-production")) {
                Intrinsics.checkNotNullExpressionValue(bytes, "passphrase");
                SqlCipherUtils.encrypt(context, "DB-id.dana.data-production", bytes);
            }
            max.setMin = new SupportFactory(bytes);
        }
        BasePersistenceDao min2 = max.getMin();
        Intrinsics.checkNotNullExpressionValue(min2, "builder.build()");
        return min2;
    }
}
