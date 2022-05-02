package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class zzgt implements zzis {
    public static final String MEDIA_TYPE = new zzgf("application/x-www-form-urlencoded").zza(zzhy.UTF_8).zzfg();

    public static void zze(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (str2 != null) {
            try {
                StringReader stringReader = new StringReader(str2);
                Class<?> cls = obj.getClass();
                zzib zzc = zzib.zzc(cls);
                List asList = Arrays.asList(new Type[]{cls});
                zzii zzii = zzii.class.isAssignableFrom(cls) ? (zzii) obj2 : null;
                Map map = Map.class.isAssignableFrom(cls) ? (Map) obj2 : null;
                zzhx zzhx = new zzhx(obj2);
                StringWriter stringWriter = new StringWriter();
                StringWriter stringWriter2 = new StringWriter();
                boolean z = true;
                while (true) {
                    int read = stringReader.read();
                    if (read == -1 || read == 38) {
                        String zzap = zzjc.zzap(stringWriter.toString());
                        if (zzap.length() != 0) {
                            String zzap2 = zzjc.zzap(stringWriter2.toString());
                            zzij zzal = zzc.zzal(zzap);
                            if (zzal != null) {
                                Type zza = zzid.zza((List<Type>) asList, zzal.getGenericType());
                                if (zziy.zzc(zza)) {
                                    Class<?> zzb = zziy.zzb(asList, zziy.zzd(zza));
                                    zzhx.zza(zzal.zzhp(), zzb, zza((Type) zzb, (List<Type>) asList, zzap2));
                                } else if (zziy.zza(zziy.zzb(asList, zza), (Class<?>) Iterable.class)) {
                                    Collection<Object> collection = (Collection) zzal.zzh(obj2);
                                    if (collection == null) {
                                        collection = zzid.zzb(zza);
                                        zzal.zzb(obj2, collection);
                                    }
                                    collection.add(zza(zza == Object.class ? null : zziy.zze(zza), (List<Type>) asList, zzap2));
                                } else {
                                    zzal.zzb(obj2, zza(zza, (List<Type>) asList, zzap2));
                                }
                            } else if (map != null) {
                                ArrayList arrayList = (ArrayList) map.get(zzap);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    if (zzii != null) {
                                        zzii.zzb(zzap, arrayList);
                                    } else {
                                        map.put(zzap, arrayList);
                                    }
                                }
                                arrayList.add(zzap2);
                            }
                        }
                        StringWriter stringWriter3 = new StringWriter();
                        StringWriter stringWriter4 = new StringWriter();
                        if (read == -1) {
                            zzhx.zzhk();
                            return;
                        }
                        stringWriter2 = stringWriter4;
                        z = true;
                        stringWriter = stringWriter3;
                    } else if (read != 61) {
                        if (z) {
                            stringWriter.write(read);
                        } else {
                            stringWriter2.write(read);
                        }
                    } else if (z) {
                        z = false;
                    } else {
                        stringWriter2.write(read);
                    }
                }
            } catch (IOException e) {
                throw zzlw.zza(e);
            }
        }
    }

    private static Object zza(Type type, List<Type> list, String str) {
        return zzid.zza(zzid.zza(list, type), str);
    }

    public final <T> T zza(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        throw new NoSuchMethodError();
    }
}
