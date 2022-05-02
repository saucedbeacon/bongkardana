package com.zhuinden.statebundle;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class StateBundle implements Parcelable {
    public static final Parcelable.Creator<StateBundle> CREATOR = new Parcelable.Creator<StateBundle>() {
        public final /* synthetic */ Object[] newArray(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1546406343, oncanceled);
                onCancelLoad.getMin(1546406343, oncanceled);
            }
            return new StateBundle[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new StateBundle(parcel);
        }
    };
    public Map<String, Integer> length = new LinkedHashMap();
    public Map<String, Object> setMin = new LinkedHashMap();

    public int describeContents() {
        return 0;
    }

    static class TypeElement implements Parcelable {
        public static final Parcelable.Creator<TypeElement> CREATOR = new Parcelable.Creator<TypeElement>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new TypeElement[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new TypeElement(parcel);
            }
        };
        String getMax;
        int length;

        public int describeContents() {
            return 0;
        }

        TypeElement() {
        }

        TypeElement(String str, int i) {
            this.getMax = str;
            this.length = i;
        }

        protected TypeElement(Parcel parcel) {
            this.getMax = parcel.readString();
            this.length = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.getMax);
            parcel.writeInt(this.length);
        }
    }

    public StateBundle() {
    }

    public StateBundle(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            TypeElement typeElement = (TypeElement) parcel.readParcelable(TypeElement.class.getClassLoader());
            Object readValue = parcel.readValue(getClass().getClassLoader());
            int i2 = typeElement.length;
            if (i2 == 26) {
                String str = typeElement.getMax;
                this.setMin.put(str, (StateBundle) readValue);
                this.length.put(str, 26);
            } else if (i2 == 27) {
                String str2 = typeElement.getMax;
                Parcelable parcelable = (Parcelable) readValue;
                int length2 = str2 != null ? str2.length() : 0;
                int max = dispatchOnCancelled.setMax(length2);
                if (length2 != max) {
                    onCanceled oncanceled = new onCanceled(length2, max, 1);
                    onCancelLoad.setMax(-196848470, oncanceled);
                    onCancelLoad.getMin(-196848470, oncanceled);
                }
                this.setMin.put(str2, parcelable);
                this.length.put(str2, 27);
            } else if (i2 == 29) {
                String str3 = typeElement.getMax;
                this.setMin.put(str3, (ArrayList) readValue);
                this.length.put(str3, 29);
            } else if (i2 != 30) {
                switch (i2) {
                    case 0:
                        String str4 = typeElement.getMax;
                        this.setMin.put(str4, Boolean.valueOf(((Boolean) readValue).booleanValue()));
                        this.length.put(str4, 0);
                        break;
                    case 1:
                        String str5 = typeElement.getMax;
                        this.setMin.put(str5, Byte.valueOf(((Byte) readValue).byteValue()));
                        this.length.put(str5, 1);
                        break;
                    case 2:
                        String str6 = typeElement.getMax;
                        this.setMin.put(str6, Character.valueOf(((Character) readValue).charValue()));
                        this.length.put(str6, 2);
                        break;
                    case 3:
                        String str7 = typeElement.getMax;
                        this.setMin.put(str7, Short.valueOf(((Short) readValue).shortValue()));
                        this.length.put(str7, 3);
                        break;
                    case 4:
                        String str8 = typeElement.getMax;
                        this.setMin.put(str8, Integer.valueOf(((Integer) readValue).intValue()));
                        this.length.put(str8, 4);
                        break;
                    case 5:
                        String str9 = typeElement.getMax;
                        this.setMin.put(str9, Long.valueOf(((Long) readValue).longValue()));
                        this.length.put(str9, 5);
                        break;
                    case 6:
                        String str10 = typeElement.getMax;
                        this.setMin.put(str10, Float.valueOf(((Float) readValue).floatValue()));
                        this.length.put(str10, 6);
                        break;
                    case 7:
                        String str11 = typeElement.getMax;
                        this.setMin.put(str11, Double.valueOf(((Double) readValue).doubleValue()));
                        this.length.put(str11, 7);
                        break;
                    case 8:
                        String str12 = typeElement.getMax;
                        this.setMin.put(str12, (String) readValue);
                        this.length.put(str12, 8);
                        break;
                    case 9:
                        String str13 = typeElement.getMax;
                        this.setMin.put(str13, (CharSequence) readValue);
                        this.length.put(str13, 9);
                        break;
                    case 10:
                        String str14 = typeElement.getMax;
                        this.setMin.put(str14, (Serializable) readValue);
                        this.length.put(str14, 10);
                        break;
                    case 11:
                        String str15 = typeElement.getMax;
                        this.setMin.put(str15, (ArrayList) readValue);
                        this.length.put(str15, 11);
                        break;
                    case 12:
                        String str16 = typeElement.getMax;
                        this.setMin.put(str16, (ArrayList) readValue);
                        this.length.put(str16, 12);
                        break;
                    case 13:
                        String str17 = typeElement.getMax;
                        this.setMin.put(str17, (ArrayList) readValue);
                        this.length.put(str17, 13);
                        break;
                    case 14:
                        String str18 = typeElement.getMax;
                        this.setMin.put(str18, (boolean[]) readValue);
                        this.length.put(str18, 14);
                        break;
                    case 15:
                        String str19 = typeElement.getMax;
                        this.setMin.put(str19, (byte[]) readValue);
                        this.length.put(str19, 15);
                        break;
                    case 16:
                        String str20 = typeElement.getMax;
                        this.setMin.put(str20, (short[]) readValue);
                        this.length.put(str20, 16);
                        break;
                    case 17:
                        String str21 = typeElement.getMax;
                        this.setMin.put(str21, (char[]) readValue);
                        this.length.put(str21, 17);
                        break;
                    case 18:
                        String str22 = typeElement.getMax;
                        this.setMin.put(str22, (int[]) readValue);
                        this.length.put(str22, 18);
                        break;
                    case 19:
                        String str23 = typeElement.getMax;
                        this.setMin.put(str23, (long[]) readValue);
                        this.length.put(str23, 19);
                        break;
                    case 20:
                        String str24 = typeElement.getMax;
                        this.setMin.put(str24, (float[]) readValue);
                        this.length.put(str24, 20);
                        break;
                    case 21:
                        String str25 = typeElement.getMax;
                        this.setMin.put(str25, (double[]) readValue);
                        this.length.put(str25, 21);
                        break;
                }
            } else {
                String str26 = typeElement.getMax;
                this.setMin.put(str26, (SparseArray) readValue);
                this.length.put(str26, 30);
            }
        }
    }

    private boolean setMin(String str) {
        return this.setMin.containsKey(str);
    }

    @Nullable
    public final <T extends Parcelable> ArrayList<T> getMin(@Nullable String str) {
        Object obj = this.setMin.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Key ");
            sb.append(str);
            sb.append(" expected ");
            sb.append("ArrayList");
            sb.append(" but value was a ");
            sb.append(obj.getClass().getName());
            sb.append(".  The default value ");
            sb.append("<null>");
            sb.append(" was returned.");
            System.out.println(sb.toString());
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setMin.keySet().size());
        for (String next : this.setMin.keySet()) {
            parcel.writeParcelable(new TypeElement(next, this.length.get(next).intValue()), 0);
            parcel.writeValue(this.setMin.get(next));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<String, Object>> entrySet = this.setMin.entrySet();
        if (entrySet.isEmpty()) {
            sb.append("[]");
        } else {
            int i = 0;
            for (Map.Entry next : entrySet) {
                sb.append("{[");
                sb.append((String) next.getKey());
                sb.append("]::[");
                int intValue = this.length.get(next.getKey()).intValue();
                if (next.getValue() == null) {
                    sb.append("<null>");
                } else if (intValue == 14) {
                    sb.append(Arrays.toString((boolean[]) next.getValue()));
                } else if (intValue == 15) {
                    sb.append(Arrays.toString((byte[]) next.getValue()));
                } else if (intValue == 16) {
                    sb.append(Arrays.toString((short[]) next.getValue()));
                } else if (intValue == 17) {
                    sb.append(Arrays.toString((char[]) next.getValue()));
                } else if (intValue == 18) {
                    sb.append(Arrays.toString((int[]) next.getValue()));
                } else if (intValue == 19) {
                    sb.append(Arrays.toString((long[]) next.getValue()));
                } else if (intValue == 20) {
                    sb.append(Arrays.toString((float[]) next.getValue()));
                } else if (intValue == 21) {
                    sb.append(Arrays.toString((double[]) next.getValue()));
                } else {
                    sb.append(next.getValue());
                }
                sb.append("]}");
                i++;
                if (i < entrySet.size()) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }

    public int hashCode() {
        int hashCode;
        int i = 0;
        for (Map.Entry next : this.setMin.entrySet()) {
            int hashCode2 = i + (((String) next.getKey()).hashCode() * 31);
            int intValue = this.length.get(next.getKey()).intValue();
            if (next.getValue() == null) {
                i = hashCode2 + 0;
            } else {
                if (intValue == 14) {
                    hashCode = Arrays.hashCode((boolean[]) next.getValue());
                } else if (intValue == 15) {
                    hashCode = Arrays.hashCode((byte[]) next.getValue());
                } else if (intValue == 16) {
                    hashCode = Arrays.hashCode((short[]) next.getValue());
                } else if (intValue == 17) {
                    hashCode = Arrays.hashCode((char[]) next.getValue());
                } else if (intValue == 18) {
                    hashCode = Arrays.hashCode((int[]) next.getValue());
                } else if (intValue == 19) {
                    hashCode = Arrays.hashCode((long[]) next.getValue());
                } else if (intValue == 20) {
                    hashCode = Arrays.hashCode((float[]) next.getValue());
                } else if (intValue == 21) {
                    hashCode = Arrays.hashCode((double[]) next.getValue());
                } else {
                    hashCode = next.getValue().hashCode();
                }
                i = hashCode2 + (hashCode * 31);
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof StateBundle)) {
            return false;
        }
        StateBundle stateBundle = (StateBundle) obj;
        for (Map.Entry next : this.setMin.entrySet()) {
            if (!stateBundle.setMin((String) next.getKey()) || !stateBundle.length.containsKey(next.getKey())) {
                return false;
            }
            int intValue = this.length.get(next.getKey()).intValue();
            if (!stateBundle.length.get(next.getKey()).equals(Integer.valueOf(intValue))) {
                return false;
            }
            Object value = next.getValue();
            Object obj2 = stateBundle.setMin.get((String) next.getKey());
            if (value != null || obj2 != null) {
                if ((value == null && obj2 != null) || (value != null && obj2 == null)) {
                    return false;
                }
                if (intValue == 14) {
                    if (!Arrays.equals((boolean[]) value, (boolean[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 15) {
                    if (!Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 16) {
                    if (!Arrays.equals((short[]) value, (short[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 17) {
                    if (!Arrays.equals((char[]) value, (char[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 18) {
                    if (!Arrays.equals((int[]) value, (int[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 19) {
                    if (!Arrays.equals((long[]) value, (long[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 20) {
                    if (!Arrays.equals((float[]) value, (float[]) obj2)) {
                        return false;
                    }
                } else if (intValue == 21) {
                    if (!Arrays.equals((double[]) value, (double[]) obj2)) {
                        return false;
                    }
                } else if (!value.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
