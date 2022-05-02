package o;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.InspectableProperty;

public class Keep {
    boolean FastBitmap$CoordinateSystem = true;
    CharSequence IsOverlapping;
    InspectableProperty.FlagEntry[] equals;
    Intent[] getMax;
    Context getMin;
    int hashCode;
    Set<String> isInside;
    String length;
    CharSequence setMax;
    ComponentName setMin;
    boolean toDoubleRange;
    public IconCompat toFloatRange;
    CharSequence toIntRange;
    @Nullable
    flag toString;
    PersistableBundle values;

    Keep() {
    }

    @RequiresApi(25)
    public ShortcutInfo setMax() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.getMin, this.length).setShortLabel(this.setMax).setIntents(this.getMax);
        IconCompat iconCompat = this.toFloatRange;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.getMax(this.getMin));
        }
        if (!TextUtils.isEmpty(this.IsOverlapping)) {
            intents.setLongLabel(this.IsOverlapping);
        }
        if (!TextUtils.isEmpty(this.toIntRange)) {
            intents.setDisabledMessage(this.toIntRange);
        }
        ComponentName componentName = this.setMin;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.isInside;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.hashCode);
        PersistableBundle persistableBundle = this.values;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            InspectableProperty.FlagEntry[] flagEntryArr = this.equals;
            if (flagEntryArr != null && flagEntryArr.length > 0) {
                int length2 = flagEntryArr.length;
                Person[] personArr = new Person[length2];
                for (int i = 0; i < length2; i++) {
                    personArr[i] = this.equals[i].setMax();
                }
                intents.setPersons(personArr);
            }
            flag flag = this.toString;
            if (flag != null) {
                intents.setLocusId(flag.setMin());
            }
            intents.setLongLived(this.toDoubleRange);
        } else {
            intents.setExtras(getMin());
        }
        return intents.build();
    }

    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private PersistableBundle getMin() {
        if (this.values == null) {
            this.values = new PersistableBundle();
        }
        InspectableProperty.FlagEntry[] flagEntryArr = this.equals;
        if (flagEntryArr != null && flagEntryArr.length > 0) {
            this.values.putInt("extraPersonCount", flagEntryArr.length);
            int i = 0;
            while (i < this.equals.length) {
                PersistableBundle persistableBundle = this.values;
                StringBuilder sb = new StringBuilder("extraPerson_");
                int i2 = i + 1;
                sb.append(i2);
                String obj = sb.toString();
                InspectableProperty.FlagEntry flagEntry = this.equals[i];
                PersistableBundle persistableBundle2 = new PersistableBundle();
                persistableBundle2.putString("name", flagEntry.getMax != null ? flagEntry.getMax.toString() : null);
                persistableBundle2.putString("uri", flagEntry.setMin);
                persistableBundle2.putString("key", flagEntry.length);
                persistableBundle2.putBoolean("isBot", flagEntry.setMax);
                persistableBundle2.putBoolean("isImportant", flagEntry.IsOverlapping);
                persistableBundle.putPersistableBundle(obj, persistableBundle2);
                i = i2;
            }
        }
        flag flag = this.toString;
        if (flag != null) {
            this.values.putString("extraLocusId", flag.getMax());
        }
        this.values.putBoolean("extraLongLived", this.toDoubleRange);
        return this.values;
    }

    public static class getMax {
        private final Keep getMax;
        private Map<String, Map<String, List<String>>> getMin;
        private Uri length;
        private Set<String> setMax;
        private boolean setMin;

        public getMax(@NonNull Context context, @NonNull String str) {
            Keep keep = new Keep();
            this.getMax = keep;
            keep.getMin = context;
            this.getMax.length = str;
        }

        @NonNull
        public getMax setMax(@NonNull CharSequence charSequence) {
            this.getMax.setMax = charSequence;
            return this;
        }

        @NonNull
        public getMax getMin(@NonNull CharSequence charSequence) {
            this.getMax.IsOverlapping = charSequence;
            return this;
        }

        @NonNull
        public getMax getMin(@NonNull Intent intent) {
            return setMax(new Intent[]{intent});
        }

        @NonNull
        public getMax setMax(@NonNull Intent[] intentArr) {
            this.getMax.getMax = intentArr;
            return this;
        }

        @NonNull
        public getMax getMin(IconCompat iconCompat) {
            this.getMax.toFloatRange = iconCompat;
            return this;
        }

        @SuppressLint({"UnsafeNewApiCall"})
        @NonNull
        public Keep getMin() {
            String[] strArr;
            if (TextUtils.isEmpty(this.getMax.setMax)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            } else if (this.getMax.getMax == null || this.getMax.getMax.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            } else {
                if (this.setMin) {
                    if (this.getMax.toString == null) {
                        Keep keep = this.getMax;
                        keep.toString = new flag(keep.length);
                    }
                    this.getMax.toDoubleRange = true;
                }
                if (this.setMax != null) {
                    if (this.getMax.isInside == null) {
                        this.getMax.isInside = new HashSet();
                    }
                    this.getMax.isInside.addAll(this.setMax);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    if (this.getMin != null) {
                        if (this.getMax.values == null) {
                            this.getMax.values = new PersistableBundle();
                        }
                        for (String next : this.getMin.keySet()) {
                            Map map = this.getMin.get(next);
                            this.getMax.values.putStringArray(next, (String[]) map.keySet().toArray(new String[0]));
                            for (String str : map.keySet()) {
                                List list = (List) map.get(str);
                                PersistableBundle persistableBundle = this.getMax.values;
                                StringBuilder sb = new StringBuilder();
                                sb.append(next);
                                sb.append("/");
                                sb.append(str);
                                String obj = sb.toString();
                                if (list == null) {
                                    strArr = new String[0];
                                } else {
                                    strArr = (String[]) list.toArray(new String[0]);
                                }
                                persistableBundle.putStringArray(obj, strArr);
                            }
                        }
                    }
                    if (this.length != null) {
                        if (this.getMax.values == null) {
                            this.getMax.values = new PersistableBundle();
                        }
                        this.getMax.values.putString("extraSliceUri", max.setMax(this.length));
                    }
                }
                return this.getMax;
            }
        }
    }
}
