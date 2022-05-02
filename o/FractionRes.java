package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashSet;
import o.PlaybackStateCompat;
import o.setPositiveButtonIcon;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class FractionRes<T> {
    private final HashSet<T> getMax = new HashSet<>();
    private final ArrayList<T> length = new ArrayList<>();
    public final PlaybackStateCompat.RepeatMode<T, ArrayList<T>> setMax = new PlaybackStateCompat.RepeatMode<>();
    public final setPositiveButtonIcon.length<ArrayList<T>> setMin = new setPositiveButtonIcon.getMin(10);

    public final boolean length(@NonNull T t) {
        return this.setMax.containsKey(t);
    }

    public final boolean getMin(@NonNull T t) {
        int size = this.setMax.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.setMax.isInside[(i << 1) + 1];
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public final ArrayList<T> getMax() {
        this.length.clear();
        this.getMax.clear();
        int size = this.setMax.size();
        for (int i = 0; i < size; i++) {
            setMin(this.setMax.isInside[i << 1], this.length, this.getMax);
        }
        return this.length;
    }

    private void setMin(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.setMax.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        setMin(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
