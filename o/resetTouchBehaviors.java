package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class resetTouchBehaviors {
    private final Map<String, List<getMax<?, ?>>> getMax = new HashMap();
    private final List<String> getMin = new ArrayList();

    public final synchronized void getMin(@NonNull List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.getMin);
        this.getMin.clear();
        for (String add : list) {
            this.getMin.add(add);
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.getMin.add(str);
            }
        }
    }

    @NonNull
    public final synchronized <T, R> List<setElevation<T, R>> getMin(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.getMin) {
            List<getMax> list = this.getMax.get(str);
            if (list != null) {
                for (getMax getmax : list) {
                    if (getmax.getMax(cls, cls2)) {
                        arrayList.add(getmax.getMin);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized <T, R> List<Class<R>> getMax(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.getMin) {
            List<getMax> list = this.getMax.get(str);
            if (list != null) {
                for (getMax getmax : list) {
                    if (getmax.getMax(cls, cls2) && !arrayList.contains(getmax.setMin)) {
                        arrayList.add(getmax.setMin);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T, R> void getMax(@NonNull String str, @NonNull setElevation<T, R> setelevation, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        getMin(str).add(new getMax(cls, cls2, setelevation));
    }

    @NonNull
    private synchronized List<getMax<?, ?>> getMin(@NonNull String str) {
        List<getMax<?, ?>> list;
        if (!this.getMin.contains(str)) {
            this.getMin.add(str);
        }
        list = this.getMax.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.getMax.put(str, list);
        }
        return list;
    }

    static class getMax<T, R> {
        private final Class<T> getMax;
        final setElevation<T, R> getMin;
        final Class<R> setMin;

        public getMax(@NonNull Class<T> cls, @NonNull Class<R> cls2, setElevation<T, R> setelevation) {
            this.getMax = cls;
            this.setMin = cls2;
            this.getMin = setelevation;
        }

        public final boolean getMax(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.getMax.isAssignableFrom(cls) && cls2.isAssignableFrom(this.setMin);
        }
    }
}
