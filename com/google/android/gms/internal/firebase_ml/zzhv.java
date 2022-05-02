package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class zzhv<K, V> extends AbstractMap<K, V> implements Cloneable {
    int size;
    private Object[] zzaaz;

    final class zzb extends AbstractSet<Map.Entry<K, V>> {
        zzb() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new zzc();
        }

        public final int size() {
            return zzhv.this.size;
        }
    }

    final class zzc implements Iterator<Map.Entry<K, V>> {
        private boolean zzaba;
        private int zzabb;

        zzc() {
        }

        public final boolean hasNext() {
            return this.zzabb < zzhv.this.size;
        }

        public final void remove() {
            int i = this.zzabb - 1;
            if (this.zzaba || i < 0) {
                throw new IllegalArgumentException();
            }
            zzhv.this.remove(i);
            this.zzabb--;
            this.zzaba = true;
        }

        public final /* synthetic */ Object next() {
            int i = this.zzabb;
            if (i != zzhv.this.size) {
                this.zzabb++;
                this.zzaba = false;
                return new zza(i);
            }
            throw new NoSuchElementException();
        }
    }

    public final int size() {
        return this.size;
    }

    final class zza implements Map.Entry<K, V> {
        private int index;

        zza(int i) {
            this.index = i;
        }

        public final K getKey() {
            return zzhv.this.zzag(this.index);
        }

        public final V getValue() {
            return zzhv.this.zzah(this.index);
        }

        public final V setValue(V v) {
            return zzhv.this.set(this.index, v);
        }

        public final int hashCode() {
            Object key = getKey();
            Object value = getValue();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return zzlk.equal(getKey(), entry.getKey()) && zzlk.equal(getValue(), entry.getValue());
        }
    }

    public final K zzag(int i) {
        if (i < 0 || i >= this.size) {
            return null;
        }
        return this.zzaaz[i << 1];
    }

    public final V zzah(int i) {
        if (i < 0 || i >= this.size) {
            return null;
        }
        return zzai((i << 1) + 1);
    }

    public final V set(int i, V v) {
        int i2 = this.size;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V zzai = zzai(i3);
        this.zzaaz[i3] = v;
        return zzai;
    }

    public final V remove(int i) {
        return zzaj(i << 1);
    }

    public final boolean containsKey(Object obj) {
        return -2 != zze(obj);
    }

    public final V get(Object obj) {
        return zzai(zze(obj) + 1);
    }

    public final V put(K k, V v) {
        int i;
        int zze = zze(k) >> 1;
        if (zze == -1) {
            zze = this.size;
        }
        if (zze >= 0) {
            int i2 = zze + 1;
            if (i2 >= 0) {
                Object[] objArr = this.zzaaz;
                int i3 = i2 << 1;
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                if (i3 > i) {
                    int i4 = ((i / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.zzaaz = null;
                    } else {
                        int i5 = this.size;
                        Object[] objArr2 = this.zzaaz;
                        if (i5 == 0 || i3 != objArr2.length) {
                            Object[] objArr3 = new Object[i3];
                            this.zzaaz = objArr3;
                            if (i5 != 0) {
                                System.arraycopy(objArr2, 0, objArr3, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = zze << 1;
                V zzai = zzai(i6 + 1);
                zzb(i6, k, v);
                if (i2 > this.size) {
                    this.size = i2;
                }
                return zzai;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(Object obj) {
        return zzaj(zze(obj));
    }

    private final void zzb(int i, K k, V v) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1262445659, oncanceled);
            onCancelLoad.getMin(1262445659, oncanceled);
        }
        Object[] objArr = this.zzaaz;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private final V zzai(int i) {
        if (i < 0) {
            return null;
        }
        return this.zzaaz[i];
    }

    private final int zze(Object obj) {
        int i = this.size << 1;
        Object[] objArr = this.zzaaz;
        int i2 = 0;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    private final V zzaj(int i) {
        int i2 = this.size << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V zzai = zzai(i + 1);
        Object[] objArr = this.zzaaz;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.size--;
        zzb(i2 - 2, (Object) null, (Object) null);
        return zzai;
    }

    public void clear() {
        this.size = 0;
        this.zzaaz = null;
    }

    public final boolean containsValue(Object obj) {
        int i = this.size << 1;
        Object[] objArr = this.zzaaz;
        int i2 = 1;
        while (i2 < i) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new zzb();
    }

    /* access modifiers changed from: private */
    /* renamed from: zzhi */
    public final zzhv<K, V> clone() {
        try {
            zzhv<K, V> zzhv = (zzhv) super.clone();
            Object[] objArr = this.zzaaz;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                zzhv.zzaaz = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return zzhv;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
