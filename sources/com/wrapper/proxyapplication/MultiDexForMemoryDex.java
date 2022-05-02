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

public class MultiDexForMemoryDex {
    static final String TAG = "MultiDexForMemoryDex";
    static int hasInjected;

    private MultiDexForMemoryDex() {
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

    private static ArrayList<Object> installDexes(ClassLoader classLoader, ByteBuffer[] byteBufferArr, boolean z, boolean z2) {
        try {
            try {
                return V26.install(classLoader, findField(classLoader, "pathList"), byteBufferArr, z, z2);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            } catch (NoSuchMethodException e4) {
                e4.printStackTrace();
                return null;
            }
        } catch (NoSuchFieldException unused) {
            return null;
        }
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
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, ByteBuffer[] byteBufferArr, boolean z, boolean z2) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
            IOException[] iOExceptionArr;
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, byteBufferArr, arrayList);
            if (makeDexElements == null || makeDexElements.length != byteBufferArr.length) {
                return null;
            }
            ArrayList<Object> arrayList2 = new ArrayList<>();
            for (Object obj2 : makeDexElements) {
                Object obj3 = MultiDexForMemoryDex.findField(obj2, "dexFile").get(obj2);
                Field access$100 = MultiDexForMemoryDex.findField(obj3, "mCookie");
                if (access$100.getType().getName().equals("int")) {
                    arrayList2.add(Integer.valueOf(access$100.getInt(obj3)));
                } else if (access$100.getType().getName().equals("long")) {
                    arrayList2.add(Long.valueOf(access$100.getLong(obj3)));
                    if (z) {
                        access$100.setLong(obj3, 0);
                    }
                } else {
                    if (z2) {
                        arrayList2.add(obj3);
                    }
                    arrayList2.add(access$100.get(obj3));
                    if (z) {
                        access$100.set(obj3, (Object) null);
                    }
                }
            }
            MultiDexForMemoryDex.expandFieldArray(obj, "dexElements", makeDexElements);
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field access$1002 = MultiDexForMemoryDex.findField(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) access$1002.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                access$1002.set(obj, iOExceptionArr);
            }
            MultiDexForMemoryDex.hasInjected = 1;
            return arrayList2;
        }

        private static Object[] makeDexElements(Object obj, ByteBuffer[] byteBufferArr, List<IOException> list) {
            try {
                try {
                    return (Object[]) MultiDexForMemoryDex.findMethod(obj, "makeInMemoryDexElements", ByteBuffer[].class, List.class).invoke(obj, new Object[]{byteBufferArr, list});
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
            } catch (NoSuchMethodException unused) {
            }
        }
    }
}
