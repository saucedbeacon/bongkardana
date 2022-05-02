package o;

import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class LongDef<T> {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class setMin extends LongDef<Void> {
        /* renamed from: getMin */
        public Void setMax(List<Keep> list) {
            return null;
        }

        /* renamed from: setMax */
        public Void length() {
            return null;
        }
    }

    @AnyThread
    public abstract T length();

    @AnyThread
    public abstract T setMax(List<Keep> list);
}
