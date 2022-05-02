package o;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;

public final class onFinishInflate {
    private final adjustListItemSelectionBounds setMax;
    private final setMax setMin;

    public interface setMax {
        @NonNull
        <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls);
    }

    static class length {
        /* access modifiers changed from: package-private */
        public void setMax(@NonNull setGroupDividerEnabled setgroupdividerenabled) {
        }

        length() {
        }
    }

    static abstract class getMax extends length implements setMax {
        @NonNull
        public abstract <T extends setGroupDividerEnabled> T setMin(@NonNull String str, @NonNull Class<T> cls);

        getMax() {
        }

        @NonNull
        public <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }
    }

    public onFinishInflate(@NonNull ListMenuItemView listMenuItemView, @NonNull setMax setmax) {
        this(listMenuItemView.getViewModelStore(), setmax);
    }

    public onFinishInflate(@NonNull adjustListItemSelectionBounds adjustlistitemselectionbounds, @NonNull setMax setmax) {
        this.setMin = setmax;
        this.setMax = adjustlistitemselectionbounds;
    }

    @MainThread
    @NonNull
    public final <T extends setGroupDividerEnabled> T setMax(@NonNull Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return length("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName)), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @MainThread
    @NonNull
    private <T extends setGroupDividerEnabled> T length(@NonNull String str, @NonNull Class<T> cls) {
        T t;
        T t2 = (setGroupDividerEnabled) this.setMax.getMax.get(str);
        if (cls.isInstance(t2)) {
            setMax setmax = this.setMin;
            if (setmax instanceof length) {
                ((length) setmax).setMax(t2);
            }
            return t2;
        }
        setMax setmax2 = this.setMin;
        if (setmax2 instanceof getMax) {
            t = ((getMax) setmax2).setMin(str, cls);
        } else {
            t = setmax2.getMin(cls);
        }
        setGroupDividerEnabled put = this.setMax.getMax.put(str, t);
        if (put != null) {
            put.getMin();
        }
        return t;
    }

    public static class setMin implements setMax {
        static setMin getMin;

        @NonNull
        public <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls) {
            try {
                return (setGroupDividerEnabled) cls.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            }
        }
    }

    public static class getMin extends setMin {
        static getMin setMax;
        private Application setMin;

        public getMin(@NonNull Application application) {
            this.setMin = application;
        }

        @NonNull
        public final <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls) {
            if (!onTouchEvent.class.isAssignableFrom(cls)) {
                return super.getMin(cls);
            }
            try {
                return (setGroupDividerEnabled) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.setMin});
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(cls)), e4);
            }
        }
    }
}
