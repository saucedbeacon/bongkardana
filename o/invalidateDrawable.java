package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class invalidateDrawable {
    public CharSequence FastBitmap$CoordinateSystem;
    public boolean Grayscale$Algorithm;
    public boolean IsOverlapping;
    public ArrayList<String> Mean$Arithmetic;
    public int equals;
    private final setVisible getMax;
    public ArrayList<length> getMin;
    public boolean hashCode;
    public CharSequence invoke;
    public ArrayList<String> invokeSuspend;
    public int isInside;
    private final ClassLoader length;
    public int setMax;
    public int toDoubleRange;
    public int toFloatRange;
    public int toIntRange;
    @Nullable
    public String toString;
    ArrayList<Runnable> valueOf;
    public int values;

    public abstract void getMin();

    public abstract int length();

    public abstract void setMax();

    public abstract int setMin();

    public static final class length {
        public Lifecycle.State equals;
        public int getMax;
        public Fragment getMin;
        public Lifecycle.State isInside;
        public int length;
        public int setMax;
        public int setMin;
        public int toIntRange;

        public length() {
        }

        public length(int i, Fragment fragment) {
            this.setMin = i;
            this.getMin = fragment;
            this.equals = Lifecycle.State.RESUMED;
            this.isInside = Lifecycle.State.RESUMED;
        }

        length(@NonNull Fragment fragment, Lifecycle.State state) {
            this.setMin = 10;
            this.getMin = fragment;
            this.equals = fragment.mMaxState;
            this.isInside = state;
        }
    }

    @Deprecated
    public invalidateDrawable() {
        this.getMin = new ArrayList<>();
        this.hashCode = true;
        this.Grayscale$Algorithm = false;
        this.getMax = null;
        this.length = null;
    }

    invalidateDrawable(@NonNull setVisible setvisible, @Nullable ClassLoader classLoader) {
        this.getMin = new ArrayList<>();
        this.hashCode = true;
        this.Grayscale$Algorithm = false;
        this.getMax = setvisible;
        this.length = classLoader;
    }

    public final void getMin(length length2) {
        this.getMin.add(length2);
        length2.getMax = this.setMax;
        length2.setMax = this.isInside;
        length2.length = this.equals;
        length2.toIntRange = this.toIntRange;
    }

    @NonNull
    public final invalidateDrawable setMax(@NonNull Fragment fragment, @Nullable String str) {
        length(0, fragment, str, 1);
        return this;
    }

    public void length(int i, Fragment fragment, @Nullable String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            if (fragment.mTag == null || str.equals(fragment.mTag)) {
                fragment.mTag = str;
            } else {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.mFragmentId == 0 || fragment.mFragmentId == i) {
                fragment.mFragmentId = i;
                fragment.mContainerId = i;
            } else {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        getMin(new length(i2, fragment));
    }

    @NonNull
    public invalidateDrawable length(@NonNull Fragment fragment) {
        getMin(new length(3, fragment));
        return this;
    }

    @NonNull
    public invalidateDrawable setMin(@NonNull Fragment fragment) {
        getMin(new length(4, fragment));
        return this;
    }

    @NonNull
    public invalidateDrawable getMax(@NonNull Fragment fragment) {
        getMin(new length(5, fragment));
        return this;
    }

    @NonNull
    public invalidateDrawable getMin(@NonNull Fragment fragment) {
        getMin(new length(6, fragment));
        return this;
    }

    @NonNull
    public invalidateDrawable getMax(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        getMin(new length(fragment, state));
        return this;
    }

    public boolean toIntRange() {
        return this.getMin.isEmpty();
    }
}
