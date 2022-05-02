package o;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.initForMode;

public final class onItemClick {
    private static final Class[] setMin;
    public final initForMode.setMax getMax;
    private final Map<String, Object<?>> getMin;
    final Map<String, initForMode.setMax> length;
    final Map<String, Object> setMax;

    private onItemClick(@NonNull Map<String, Object> map) {
        this.length = new HashMap();
        this.getMin = new HashMap();
        this.getMax = new initForMode.setMax() {
            @NonNull
            public final Bundle length() {
                for (Map.Entry entry : new HashMap(onItemClick.this.length).entrySet()) {
                    onItemClick.this.getMax((String) entry.getKey(), ((initForMode.setMax) entry.getValue()).length());
                }
                Set<String> keySet = onItemClick.this.setMax.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String next : keySet) {
                    arrayList.add(next);
                    arrayList2.add(onItemClick.this.setMax.get(next));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.setMax = new HashMap(map);
    }

    public onItemClick() {
        this.length = new HashMap();
        this.getMin = new HashMap();
        this.getMax = new initForMode.setMax() {
            @NonNull
            public final Bundle length() {
                for (Map.Entry entry : new HashMap(onItemClick.this.length).entrySet()) {
                    onItemClick.this.getMax((String) entry.getKey(), ((initForMode.setMax) entry.getValue()).length());
                }
                Set<String> keySet = onItemClick.this.setMax.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String next : keySet) {
                    arrayList.add(next);
                    arrayList2.add(onItemClick.this.setMax.get(next));
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("keys", arrayList);
                bundle.putParcelableArrayList("values", arrayList2);
                return bundle;
            }
        };
        this.setMax = new HashMap();
    }

    public static onItemClick setMin(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new onItemClick();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new onItemClick(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new onItemClick(hashMap);
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        clsArr[4] = Integer.TYPE;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        clsArr[27] = Build.VERSION.SDK_INT >= 21 ? Size.class : Integer.TYPE;
        clsArr[28] = Build.VERSION.SDK_INT >= 21 ? SizeF.class : Integer.TYPE;
        setMin = clsArr;
    }

    @MainThread
    public final <T> void getMax(@NonNull String str, @Nullable T t) {
        if (t != null) {
            Class[] clsArr = setMin;
            int length2 = clsArr.length;
            int i = 0;
            while (i < length2) {
                if (!clsArr[i].isInstance(t)) {
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            sb.append(t.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        CascadingMenuPopup$HorizPosition cascadingMenuPopup$HorizPosition = (CascadingMenuPopup$HorizPosition) this.getMin.get(str);
        if (cascadingMenuPopup$HorizPosition != null) {
            cascadingMenuPopup$HorizPosition.getMax(t);
        } else {
            this.setMax.put(str, t);
        }
    }
}
