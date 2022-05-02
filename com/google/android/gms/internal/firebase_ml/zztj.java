package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzti;
import com.google.android.gms.internal.firebase_ml.zztj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zztj<MessageType extends zztj<MessageType, BuilderType>, BuilderType extends zzti<MessageType, BuilderType>> implements zzwi {
    protected int zzbvi = 0;

    public final zztq zzrs() {
        try {
            zzty zzcs = zztq.zzcs(zzth());
            zzb(zzcs.zzsh());
            return zzcs.zzsg();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final byte[] toByteArray() {
        try {
            byte[] bArr = new byte[zzth()];
            zzuh zzg = zzuh.zzg(bArr);
            zzb(zzg);
            zzg.zzsk();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int zzrt() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void zzcm(int i) {
        throw new UnsupportedOperationException();
    }

    protected static <T> void zza(Iterable<T> iterable, List<? super T> list) {
        zzva.checkNotNull(iterable);
        if (iterable instanceof zzvp) {
            List<?> zzty = ((zzvp) iterable).zzty();
            zzvp zzvp = (zzvp) list;
            int size = list.size();
            for (Object next : zzty) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(zzvp.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size2 = zzvp.size() - 1; size2 >= size; size2--) {
                        zzvp.remove(size2);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof zztq) {
                    zzvp.zze((zztq) next);
                } else {
                    zzvp.add((String) next);
                }
            }
        } else if (iterable instanceof zzwu) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (T next2 : iterable) {
                if (next2 == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next2);
            }
        }
    }
}
