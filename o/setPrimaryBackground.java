package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;

public final class setPrimaryBackground {
    @NonNull
    public static <T extends RoomDatabase> RoomDatabase.setMax<T> setMin(@NonNull Context context, @NonNull Class<T> cls, @NonNull String str) {
        if (str != null && str.trim().length() != 0) {
            return new RoomDatabase.setMax<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    @NonNull
    public static <T, C> T setMin(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName.replace('.', '_'));
        sb.append(str);
        String obj = sb.toString();
        try {
            if (name.isEmpty()) {
                str2 = obj;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                str2 = sb2.toString();
            }
            return Class.forName(str2, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder("cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(obj);
            sb3.append(" does not exist");
            throw new RuntimeException(sb3.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb4 = new StringBuilder("Cannot access the constructor");
            sb4.append(cls.getCanonicalName());
            throw new RuntimeException(sb4.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb5 = new StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        }
    }
}
