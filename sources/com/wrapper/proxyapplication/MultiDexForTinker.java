package com.wrapper.proxyapplication;

import android.os.Build;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

public class MultiDexForTinker {
    static final String TAG = "MultiDexForTinker";
    static IOException[] dexElementsSuppressedExceptions;
    static int hasInjected;
    static int injectDexBeginIndex;
    static Object[] injectDexsObj;
    static Object[] injectFilesObj;
    static Object[] injectPathListObj;
    static Object[] injectPathsObj;
    static Object[] injectZipsObj;

    private MultiDexForTinker() {
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

    /* access modifiers changed from: private */
    public static String getprefixname(String str) {
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

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.Object> installDexes(java.lang.ClassLoader r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
        /*
            java.util.ArrayList r3 = splitPaths(r3)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r4 = "pathList"
            java.lang.reflect.Field r4 = findField(r2, r4)     // Catch:{ NoSuchFieldException -> 0x0030 }
            java.util.ArrayList r2 = com.wrapper.proxyapplication.MultiDexForTinker.V19.install(r2, r4, r3, r0)     // Catch:{ IllegalArgumentException -> 0x002b, IllegalAccessException -> 0x0026, InvocationTargetException -> 0x0021, NoSuchMethodException -> 0x001c, IOException -> 0x0014 }
            return r2
        L_0x0014:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ NoSuchFieldException -> 0x0030 }
            java.lang.String r1 = "v19,load dex fail"
            r4.<init>(r1)     // Catch:{ NoSuchFieldException -> 0x0030 }
            throw r4     // Catch:{ NoSuchFieldException -> 0x0030 }
        L_0x001c:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x0021:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x0026:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x002b:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x0030:
            java.lang.String r4 = "path"
            java.lang.reflect.Field r4 = findField(r2, r4)     // Catch:{ NoSuchFieldException -> 0x004d }
            java.util.ArrayList r2 = com.wrapper.proxyapplication.MultiDexForTinker.V4.install(r2, r4, r3, r0)     // Catch:{ IllegalArgumentException -> 0x0048, IllegalAccessException -> 0x0043, IOException -> 0x003b }
            return r2
        L_0x003b:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ NoSuchFieldException -> 0x004d }
            java.lang.String r3 = "v4, load dex fail"
            r2.<init>(r3)     // Catch:{ NoSuchFieldException -> 0x004d }
            throw r2     // Catch:{ NoSuchFieldException -> 0x004d }
        L_0x0043:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x004d }
            goto L_0x0054
        L_0x0048:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x004d }
            goto L_0x0054
        L_0x004d:
            java.lang.String r2 = "MultiDexForTinker"
            java.lang.String r3 = "Strange!no pathlist&path,a new or modified android version "
            android.util.Log.w(r2, r3)
        L_0x0054:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.MultiDexForTinker.installDexes(java.lang.ClassLoader, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.Object> installDexes(java.lang.ClassLoader r2, java.lang.String r3, java.lang.String r4, int r5) throws java.io.IOException {
        /*
            java.util.ArrayList r3 = splitPaths(r3)
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.String r4 = "pathList"
            java.lang.reflect.Field r4 = findField(r2, r4)     // Catch:{ NoSuchFieldException -> 0x0030 }
            java.util.ArrayList r2 = com.wrapper.proxyapplication.MultiDexForTinker.V19.install(r2, r4, r3, r0, r5)     // Catch:{ IllegalArgumentException -> 0x002b, IllegalAccessException -> 0x0026, InvocationTargetException -> 0x0021, NoSuchMethodException -> 0x001c, IOException -> 0x0014 }
            return r2
        L_0x0014:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ NoSuchFieldException -> 0x0030 }
            java.lang.String r1 = "v19,load dex fail"
            r4.<init>(r1)     // Catch:{ NoSuchFieldException -> 0x0030 }
            throw r4     // Catch:{ NoSuchFieldException -> 0x0030 }
        L_0x001c:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x0021:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x0026:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x002b:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x0030 }
            goto L_0x0054
        L_0x0030:
            java.lang.String r4 = "path"
            java.lang.reflect.Field r4 = findField(r2, r4)     // Catch:{ NoSuchFieldException -> 0x004d }
            java.util.ArrayList r2 = com.wrapper.proxyapplication.MultiDexForTinker.V4.install(r2, r4, r3, r0, r5)     // Catch:{ IllegalArgumentException -> 0x0048, IllegalAccessException -> 0x0043, IOException -> 0x003b }
            return r2
        L_0x003b:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ NoSuchFieldException -> 0x004d }
            java.lang.String r3 = "v4, load dex fail"
            r2.<init>(r3)     // Catch:{ NoSuchFieldException -> 0x004d }
            throw r2     // Catch:{ NoSuchFieldException -> 0x004d }
        L_0x0043:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x004d }
            goto L_0x0054
        L_0x0048:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ NoSuchFieldException -> 0x004d }
            goto L_0x0054
        L_0x004d:
            java.lang.String r2 = "MultiDexForTinker"
            java.lang.String r3 = "Strange!no pathlist&path,a new or modified android version "
            android.util.Log.w(r2, r3)
        L_0x0054:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wrapper.proxyapplication.MultiDexForTinker.installDexes(java.lang.ClassLoader, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    private static void preparetoinstallDexes(ClassLoader classLoader, int i) throws IOException {
        try {
            try {
                prepareexpandFieldArray(findField(classLoader, "pathList").get(classLoader), "dexElements", i);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        } catch (NoSuchFieldException unused) {
            try {
                findField(classLoader, "path");
                try {
                    prepareexpandFieldArray(classLoader, "mPaths", i);
                    prepareexpandFieldArray(classLoader, "mFiles", i);
                    prepareexpandFieldArray(classLoader, "mZips", i);
                    prepareexpandFieldArray(classLoader, "mDexs", i);
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            } catch (NoSuchFieldException unused2) {
                Log.w(TAG, "Strange!no pathlist&path,a new or modified android version ");
            }
        }
    }

    private static void finishinstallDexes(ClassLoader classLoader) {
        try {
            try {
                Object obj = findField(classLoader, "pathList").get(classLoader);
                findField(obj, "dexElements").set(obj, injectPathListObj);
                if (dexElementsSuppressedExceptions != null) {
                    findField(obj, "dexElementsSuppressedExceptions").set(obj, dexElementsSuppressedExceptions);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
        } catch (NoSuchFieldException unused) {
            try {
                try {
                    Object obj2 = findField(classLoader, "path").get(classLoader);
                    findField(obj2, "mPaths").set(obj2, injectPathsObj);
                    findField(obj2, "mFiles").set(obj2, injectFilesObj);
                    findField(obj2, "mZips").set(obj2, injectZipsObj);
                    findField(obj2, "mDexs").set(obj2, injectDexsObj);
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                }
            } catch (NoSuchFieldException unused2) {
            }
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

    /* access modifiers changed from: private */
    public static void expandFieldArray(Object obj, String str, Object[] objArr, int i) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        findField(obj, str);
        if (str.equals("dexElements")) {
            System.arraycopy(objArr, 0, injectPathListObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mPaths")) {
            System.arraycopy(objArr, 0, injectPathsObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mFiles")) {
            System.arraycopy(objArr, 0, injectFilesObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mDexs")) {
            System.arraycopy(objArr, 0, injectDexsObj, injectDexBeginIndex + i, objArr.length);
        } else if (str.equals("mZips")) {
            System.arraycopy(objArr, 0, injectZipsObj, injectDexBeginIndex + i, objArr.length);
        }
    }

    private static void prepareexpandFieldArray(Object obj, String str, int i) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Object[] objArr = (Object[]) findField(obj, str).get(obj);
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + i);
        if (Build.VERSION.SDK_INT == 28 && hasInjected == 0 && objArr.length > 1) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length - 1);
            injectDexBeginIndex = objArr.length - 1;
            System.arraycopy(objArr, objArr.length - 1, objArr2, (i + objArr.length) - 1, 1);
        } else {
            System.arraycopy(objArr, 0, objArr2, i, objArr.length);
        }
        if (str.equals("dexElements")) {
            injectPathListObj = objArr2;
        } else if (str.equals("mPaths")) {
            injectPathsObj = objArr2;
        } else if (str.equals("mFiles")) {
            injectFilesObj = objArr2;
        } else if (str.equals("mZips")) {
            injectZipsObj = objArr2;
        } else if (str.equals("mDexs")) {
            injectDexsObj = objArr2;
        }
    }

    private static final class V19 {
        private V19() {
        }

        /* access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, new ArrayList(list), file, arrayList);
            if (makeDexElements.length == list.size()) {
                ArrayList<Object> arrayList2 = new ArrayList<>();
                for (Object obj2 : makeDexElements) {
                    Object obj3 = MultiDexForTinker.findField(obj2, "dexFile").get(obj2);
                    Field access$400 = MultiDexForTinker.findField(obj3, "mCookie");
                    if (access$400.getType().getName().equals("int")) {
                        arrayList2.add(Integer.valueOf(access$400.getInt(obj3)));
                    } else if (access$400.getType().getName().equals("long")) {
                        arrayList2.add(Long.valueOf(access$400.getLong(obj3)));
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                MultiDexForTinker.expandFieldArray(obj, "dexElements", makeDexElements);
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IOException iOException = (IOException) it.next();
                    }
                    Field access$4002 = MultiDexForTinker.findField(obj, "dexElementsSuppressedExceptions");
                    IOException[] iOExceptionArr2 = (IOException[]) access$4002.get(obj);
                    if (iOExceptionArr2 == null) {
                        iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                    } else {
                        IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                        arrayList.toArray(iOExceptionArr3);
                        System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                        iOExceptionArr = iOExceptionArr3;
                    }
                    access$4002.set(obj, iOExceptionArr);
                }
                MultiDexForTinker.hasInjected = 1;
                return arrayList2;
            }
            throw new IOException("load dex failed");
        }

        /* access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file, int i) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            Object obj = field.get(classLoader);
            ArrayList arrayList = new ArrayList();
            Object[] makeDexElements = makeDexElements(obj, new ArrayList(list), file, arrayList);
            if (makeDexElements.length == list.size()) {
                ArrayList<Object> arrayList2 = new ArrayList<>();
                for (Object obj2 : makeDexElements) {
                    Object obj3 = MultiDexForTinker.findField(obj2, "dexFile").get(obj2);
                    Field access$400 = MultiDexForTinker.findField(obj3, "mCookie");
                    if (access$400.getType().getName().equals("int")) {
                        arrayList2.add(Integer.valueOf(access$400.getInt(obj3)));
                    } else if (access$400.getType().getName().equals("long")) {
                        arrayList2.add(Long.valueOf(access$400.getLong(obj3)));
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                MultiDexForTinker.expandFieldArray(obj, "dexElements", makeDexElements, i);
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        IOException iOException = (IOException) it.next();
                    }
                    MultiDexForTinker.dexElementsSuppressedExceptions = (IOException[]) MultiDexForTinker.findField(obj, "dexElementsSuppressedExceptions").get(obj);
                    if (MultiDexForTinker.dexElementsSuppressedExceptions == null) {
                        MultiDexForTinker.dexElementsSuppressedExceptions = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                    } else {
                        IOException[] iOExceptionArr = new IOException[(arrayList.size() + MultiDexForTinker.dexElementsSuppressedExceptions.length)];
                        arrayList.toArray(iOExceptionArr);
                        System.arraycopy(MultiDexForTinker.dexElementsSuppressedExceptions, 0, iOExceptionArr, arrayList.size(), MultiDexForTinker.dexElementsSuppressedExceptions.length);
                        MultiDexForTinker.dexElementsSuppressedExceptions = iOExceptionArr;
                    }
                }
                MultiDexForTinker.hasInjected = 1;
                return arrayList2;
            }
            throw new IOException("load dex failed");
        }

        private static Object[] makeDexElements(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            try {
                try {
                    return (Object[]) MultiDexForTinker.findMethod(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, new Object[]{arrayList, file});
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
                try {
                    try {
                        return (Object[]) MultiDexForTinker.findMethod(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    } catch (IllegalArgumentException e7) {
                        e7.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    } catch (InvocationTargetException e8) {
                        e8.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    } catch (RuntimeException e9) {
                        e9.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    }
                } catch (NoSuchMethodException e10) {
                    try {
                    } catch (NoSuchMethodException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        return (Object[]) MultiDexForTinker.findMethod(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, new Object[]{arrayList, file, arrayList2});
                    } catch (IllegalAccessException e12) {
                        e12.printStackTrace();
                        e10.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    } catch (IllegalArgumentException e13) {
                        e13.printStackTrace();
                        e10.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    } catch (InvocationTargetException e14) {
                        e14.printStackTrace();
                        e10.printStackTrace();
                        e5.printStackTrace();
                        return null;
                    }
                }
            }
        }
    }

    private static final class V4 {
        private V4() {
        }

        /* access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            StringBuilder sb = new StringBuilder((String) field.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            if (dexFileArr.length == size) {
                ArrayList<Object> arrayList = new ArrayList<>();
                ListIterator<File> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    File next = listIterator.next();
                    String absolutePath = next.getAbsolutePath();
                    String absolutePath2 = file.getAbsolutePath();
                    String access$800 = MultiDexForTinker.getprefixname(absolutePath);
                    sb.append(':');
                    sb.append(absolutePath);
                    int previousIndex = listIterator.previousIndex();
                    strArr[previousIndex] = absolutePath;
                    fileArr[previousIndex] = next;
                    zipFileArr[previousIndex] = new ZipFile(next);
                    dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath2 + "/" + access$800 + ".dex", 0);
                    arrayList.add(Integer.valueOf(MultiDexForTinker.findField(dexFileArr[previousIndex], "mCookie").getInt(dexFileArr[previousIndex])));
                }
                field.set(classLoader, sb.toString());
                MultiDexForTinker.expandFieldArray(classLoader, "mPaths", strArr);
                MultiDexForTinker.expandFieldArray(classLoader, "mFiles", fileArr);
                MultiDexForTinker.expandFieldArray(classLoader, "mZips", zipFileArr);
                MultiDexForTinker.expandFieldArray(classLoader, "mDexs", dexFileArr);
                MultiDexForTinker.hasInjected = 1;
                return arrayList;
            }
            throw new IOException("load dex failed");
        }

        /* access modifiers changed from: private */
        public static ArrayList<Object> install(ClassLoader classLoader, Field field, List<File> list, File file, int i) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            ClassLoader classLoader2 = classLoader;
            Field field2 = field;
            int i2 = i;
            int size = list.size();
            StringBuilder sb = new StringBuilder((String) field2.get(classLoader2));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            if (dexFileArr.length == size) {
                ArrayList<Object> arrayList = new ArrayList<>();
                ListIterator<File> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    File next = listIterator.next();
                    String absolutePath = next.getAbsolutePath();
                    String absolutePath2 = file.getAbsolutePath();
                    String access$800 = MultiDexForTinker.getprefixname(absolutePath);
                    sb.append(':');
                    sb.append(absolutePath);
                    int previousIndex = listIterator.previousIndex();
                    strArr[previousIndex] = absolutePath;
                    fileArr[previousIndex] = next;
                    zipFileArr[previousIndex] = new ZipFile(next);
                    dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath2 + "/" + access$800 + ".dex", 0);
                    arrayList.add(Integer.valueOf(MultiDexForTinker.findField(dexFileArr[previousIndex], "mCookie").getInt(dexFileArr[previousIndex])));
                }
                field2.set(classLoader2, sb.toString());
                MultiDexForTinker.expandFieldArray(classLoader2, "mPaths", strArr, i2);
                MultiDexForTinker.expandFieldArray(classLoader2, "mFiles", fileArr, i2);
                MultiDexForTinker.expandFieldArray(classLoader2, "mZips", zipFileArr, i2);
                MultiDexForTinker.expandFieldArray(classLoader2, "mDexs", dexFileArr, i2);
                MultiDexForTinker.hasInjected = 1;
                if (arrayList.size() == 0) {
                    return null;
                }
                return arrayList;
            }
            throw new IOException("load dex failed");
        }
    }
}
