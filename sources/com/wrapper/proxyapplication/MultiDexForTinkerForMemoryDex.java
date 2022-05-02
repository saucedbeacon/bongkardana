package com.wrapper.proxyapplication;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MultiDexForTinkerForMemoryDex {
    static final String TAG = "MultiDexForTinkerForMemoryDex";
    static int hasInjected;

    private MultiDexForTinkerForMemoryDex() {
    }

    private static ArrayList<File> splitPaths(String str) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (str != null) {
            for (String file : str.split(File.pathSeparator)) {
                arrayList.add(new File(file));
            }
        }
        return arrayList;
    }

    private static String getprefixname(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str = str.substring(lastIndexOf + 1);
        }
        int lastIndexOf2 = str.lastIndexOf(".");
        return lastIndexOf2 >= 0 ? str.substring(0, lastIndexOf2) : str;
    }

    private static ArrayList<Object> openallDexes(ClassLoader classLoader, String str, String str2) {
        Method findMethod;
        ArrayList<Object> arrayList;
        ArrayList<File> splitPaths = splitPaths(str);
        File file = new File(str2);
        ArrayList<Object> arrayList2 = null;
        try {
            try {
                Object obj = findField(classLoader, "pathList").get(classLoader);
                try {
                    findMethod = findMethod(obj, "loadDexFile", File.class, File.class);
                    try {
                        arrayList = new ArrayList<>();
                    } catch (InvocationTargetException e) {
                        e = e;
                        e.printStackTrace();
                        return arrayList2;
                    }
                } catch (NoSuchMethodException e2) {
                    e = e2;
                }
                try {
                    Iterator<File> it = splitPaths.iterator();
                    while (it.hasNext()) {
                        arrayList.add(findMethod.invoke(obj, new Object[]{it.next(), file}));
                    }
                    return arrayList;
                } catch (InvocationTargetException e3) {
                    e = e3;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    return arrayList2;
                } catch (NoSuchMethodException e4) {
                    e = e4;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    return arrayList2;
                } catch (IllegalAccessException e5) {
                    e = e5;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    return arrayList2;
                } catch (IllegalArgumentException e6) {
                    e = e6;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    return arrayList2;
                } catch (NoSuchFieldException e7) {
                    e = e7;
                    arrayList2 = arrayList;
                    e.printStackTrace();
                    return arrayList2;
                }
            } catch (IllegalAccessException e8) {
                e = e8;
            } catch (IllegalArgumentException e9) {
                e = e9;
                e.printStackTrace();
                return arrayList2;
            }
        } catch (NoSuchFieldException e10) {
            e = e10;
            e.printStackTrace();
            return arrayList2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void installDexes(java.lang.ClassLoader r1, java.nio.ByteBuffer[] r2) throws java.io.IOException {
        /*
            java.lang.String r0 = "pathList"
            java.lang.reflect.Field r0 = findField(r1, r0)     // Catch:{ NoSuchFieldException -> 0x0025 }
            com.wrapper.proxyapplication.MultiDexForTinkerForMemoryDex.V26.install(r1, r0, r2)     // Catch:{ IllegalArgumentException -> 0x0021, IllegalAccessException -> 0x001c, InvocationTargetException -> 0x0017, NoSuchMethodException -> 0x0012, IOException -> 0x000a }
            goto L_0x0025
        L_0x000a:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ NoSuchFieldException -> 0x0025 }
            java.lang.String r2 = "v26,load dex fail"
            r1.<init>(r2)     // Catch:{ NoSuchFieldException -> 0x0025 }
            throw r1     // Catch:{ NoSuchFieldException -> 0x0025 }
        L_0x0012:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0025 }
            goto L_0x0025
        L_0x0017:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0025 }
            goto L_0x0025
        L_0x001c:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0025 }
            goto L_0x0025
        L_0x0021:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0025 }
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.MultiDexForTinkerForMemoryDex.installDexes(java.lang.ClassLoader, java.nio.ByteBuffer[]):void");
    }

    /* access modifiers changed from: private */
    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    private static Method findMethodinClazz(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class<? super Object> cls2;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                Class<? super Object> superclass = cls2.getSuperclass();
                cls2 = cls;
                cls2 = superclass;
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls2);
    }

    /* access modifiers changed from: private */
    public static Method findMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    /* access modifiers changed from: private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field findField = findField(obj, str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        if (Build.VERSION.SDK_INT == 28 && hasInjected == 0 && objArr2.length > 1) {
            System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length - 1);
            System.arraycopy(objArr, 0, objArr3, objArr2.length - 1, objArr.length);
            System.arraycopy(objArr2, objArr2.length - 1, objArr3, (objArr.length + objArr2.length) - 1, 1);
        } else {
            System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
            System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        }
        findField.set(obj, objArr3);
    }

    private static final class V26 {
        private V26() {
        }

        /* access modifiers changed from: private */
        public static void install(ClassLoader classLoader, Field field, ByteBuffer[] byteBufferArr) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, byteBufferArr, arrayList);
            if (makeDexElements.length == byteBufferArr.length) {
                MultiDexForTinkerForMemoryDex.expandFieldArray(obj, "dexElements", makeDexElements);
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IOException iOException = (IOException) it.next();
                    }
                    Field access$200 = MultiDexForTinkerForMemoryDex.findField(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) access$200.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                        arrayList.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    access$200.set(obj, iOExceptionArr);
                }
                MultiDexForTinkerForMemoryDex.hasInjected = 1;
                return;
            }
            throw new IOException("load dex failed");
        }

        private static Object[] makeDexElements(Object obj, ByteBuffer[] byteBufferArr, ArrayList<IOException> arrayList) {
            try {
                try {
                    return (Object[]) MultiDexForTinkerForMemoryDex.findMethod(obj, "makeInMemoryDexElements", ByteBuffer[].class, List.class).invoke(obj, new Object[]{byteBufferArr, arrayList});
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return null;
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                    return null;
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                    return null;
                } catch (RuntimeException e4) {
                    e4.printStackTrace();
                    return null;
                }
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }
}
