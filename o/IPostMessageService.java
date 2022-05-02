package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry$1;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public interface IPostMessageService extends setChecked {

    public interface Default<O> {
        void onActivityResult(@SuppressLint({"UnknownNullness"}) O o2);
    }

    @NonNull
    OnBackPressedDispatcher getOnBackPressedDispatcher();

    public interface Stub {
        void length(@NonNull Context context);

        public abstract class Proxy {
            public final transient Map<String, length<?>> IsOverlapping = new HashMap();
            public final Bundle equals = new Bundle();
            public final Map<String, Integer> getMax = new HashMap();
            private final Map<String, setMin> getMin = new HashMap();
            public final Map<Integer, String> length = new HashMap();
            public ArrayList<String> setMax = new ArrayList<>();
            public Random setMin = new Random();
            public final Map<String, Object> toIntRange = new HashMap();

            @MainThread
            public abstract <I, O> void setMin(int i, @NonNull areNotificationsEnabled<I, O> arenotificationsenabled, @SuppressLint({"UnknownNullness"}) I i2, @Nullable name name);

            @NonNull
            public final <I, O> ITrustedWebActivityCallback<I> getMax(@NonNull final String str, @NonNull setChecked setchecked, @NonNull final areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull Default<O> defaultR) {
                Lifecycle lifecycle = setchecked.getLifecycle();
                if (!lifecycle.length().isAtLeast(Lifecycle.State.STARTED)) {
                    final int length2 = length(str);
                    setMin setmin = this.getMin.get(str);
                    if (setmin == null) {
                        setmin = new setMin(lifecycle);
                    }
                    ActivityResultRegistry$1 activityResultRegistry$1 = new ActivityResultRegistry$1(this, str, defaultR, arenotificationsenabled);
                    setmin.setMax.setMax(activityResultRegistry$1);
                    setmin.getMin.add(activityResultRegistry$1);
                    this.getMin.put(str, setmin);
                    return new ITrustedWebActivityCallback<I>() {
                        public final void getMin(I i, @Nullable name name) {
                            Proxy.this.setMax.add(str);
                            Proxy.this.setMin(length2, arenotificationsenabled, i, name);
                        }

                        public final void setMax() {
                            Proxy.this.setMax(str);
                        }
                    };
                }
                StringBuilder sb = new StringBuilder("LifecycleOwner ");
                sb.append(setchecked);
                sb.append(" is attempting to register while current state is ");
                sb.append(lifecycle.length());
                sb.append(". LifecycleOwners must call register before they are STARTED.");
                throw new IllegalStateException(sb.toString());
            }

            @NonNull
            public final <I, O> ITrustedWebActivityCallback<I> getMin(@NonNull final String str, @NonNull final areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull Default<O> defaultR) {
                final int length2 = length(str);
                this.IsOverlapping.put(str, new length(defaultR, arenotificationsenabled));
                if (this.toIntRange.containsKey(str)) {
                    Object obj = this.toIntRange.get(str);
                    this.toIntRange.remove(str);
                    defaultR.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) this.equals.getParcelable(str);
                if (activityResult != null) {
                    this.equals.remove(str);
                    defaultR.onActivityResult(arenotificationsenabled.setMin(activityResult.getMax, activityResult.length));
                }
                return new ITrustedWebActivityCallback<I>() {
                    public final void getMin(I i, @Nullable name name) {
                        Proxy.this.setMax.add(str);
                        Proxy.this.setMin(length2, arenotificationsenabled, i, name);
                    }

                    public final void setMax() {
                        Proxy.this.setMax(str);
                    }
                };
            }

            @MainThread
            public final void setMax(@NonNull String str) {
                Integer remove;
                if (!this.setMax.contains(str) && (remove = this.getMax.remove(str)) != null) {
                    this.length.remove(remove);
                }
                this.IsOverlapping.remove(str);
                if (this.toIntRange.containsKey(str)) {
                    this.toIntRange.get(str);
                    this.toIntRange.remove(str);
                }
                if (this.equals.containsKey(str)) {
                    this.equals.getParcelable(str);
                    this.equals.remove(str);
                }
                setMin setmin = this.getMin.get(str);
                if (setmin != null) {
                    Iterator<setPopupCallback> it = setmin.getMin.iterator();
                    while (it.hasNext()) {
                        setmin.setMax.length(it.next());
                    }
                    setmin.getMin.clear();
                    this.getMin.remove(str);
                }
            }

            @MainThread
            public final boolean getMin(int i, int i2, @Nullable Intent intent) {
                String str = this.length.get(Integer.valueOf(i));
                if (str == null) {
                    return false;
                }
                this.setMax.remove(str);
                length length2 = this.IsOverlapping.get(str);
                if (length2 == null || length2.getMin == null) {
                    this.toIntRange.remove(str);
                    this.equals.putParcelable(str, new ActivityResult(i2, intent));
                    return true;
                }
                length2.getMin.onActivityResult(length2.setMin.setMin(i2, intent));
                return true;
            }

            @MainThread
            public final <O> boolean setMin(int i, @SuppressLint({"UnknownNullness"}) O o2) {
                String str = this.length.get(Integer.valueOf(i));
                if (str == null) {
                    return false;
                }
                this.setMax.remove(str);
                length length2 = this.IsOverlapping.get(str);
                if (length2 == null || length2.getMin == null) {
                    this.equals.remove(str);
                    this.toIntRange.put(str, o2);
                    return true;
                }
                length2.getMin.onActivityResult(o2);
                return true;
            }

            private int length(String str) {
                Integer num = this.getMax.get(str);
                if (num != null) {
                    return num.intValue();
                }
                int length2 = length();
                this.length.put(Integer.valueOf(length2), str);
                this.getMax.put(str, Integer.valueOf(length2));
                return length2;
            }

            private int length() {
                int nextInt = this.setMin.nextInt(2147418112);
                while (true) {
                    int i = nextInt + 65536;
                    if (!this.length.containsKey(Integer.valueOf(i))) {
                        return i;
                    }
                    nextInt = this.setMin.nextInt(2147418112);
                }
            }

            public static class length<O> {
                final Default<O> getMin;
                final areNotificationsEnabled<?, O> setMin;

                public length(Default<O> defaultR, areNotificationsEnabled<?, O> arenotificationsenabled) {
                    this.getMin = defaultR;
                    this.setMin = arenotificationsenabled;
                }
            }

            static class setMin {
                final ArrayList<setPopupCallback> getMin = new ArrayList<>();
                final Lifecycle setMax;

                setMin(@NonNull Lifecycle lifecycle) {
                    this.setMax = lifecycle;
                }
            }
        }
    }
}
