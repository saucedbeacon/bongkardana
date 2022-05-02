package com.wrapper.proxyapplication;

import android.app.Application;
import android.content.Context;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.List;

class AndroidNClassLoader extends PathClassLoader {
    private static final String TAG = "SecShell";
    private static String baseApkFullPath;
    private static Object oldDexPathListHolder;

    private AndroidNClassLoader(String str, ClassLoader classLoader, Application application) {
        super(str, classLoader);
        try {
            baseApkFullPath = application.getPackageCodePath();
        } catch (Throwable unused) {
        }
    }

    private static Object recreateDexPathList(Object obj, ClassLoader classLoader, boolean z) throws Exception {
        Object obj2 = obj;
        try {
            Constructor<?> findConstructor = ShareReflectUtil.findConstructor(obj2, ClassLoader.class, String.class, String.class, File.class);
            if (z) {
                return findConstructor.newInstance(new Object[]{classLoader, "", null, null});
            }
            Object[] objArr = (Object[]) ShareReflectUtil.findField(obj2, "dexElements").get(obj2);
            List<File> list = (List) ShareReflectUtil.findField(obj2, "nativeLibraryDirectories").get(obj2);
            StringBuilder sb = new StringBuilder();
            Field findField = ShareReflectUtil.findField(objArr.getClass().getComponentType(), "dexFile");
            boolean z2 = true;
            for (Object obj3 : objArr) {
                DexFile dexFile = (DexFile) findField.get(obj3);
                if (dexFile != null) {
                    if (dexFile.getName() != null) {
                        try {
                            if (dexFile.getName().equals(baseApkFullPath)) {
                                if (z2) {
                                    z2 = false;
                                } else {
                                    sb.append(File.pathSeparator);
                                }
                                sb.append(dexFile.getName());
                            }
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                }
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            boolean z3 = true;
            for (File file : list) {
                if (file != null) {
                    if (z3) {
                        z3 = false;
                    } else {
                        sb3.append(File.pathSeparator);
                    }
                    sb3.append(file.getAbsolutePath());
                }
            }
            String sb4 = sb3.toString();
            Object[] objArr2 = new Object[4];
            objArr2[0] = classLoader;
            objArr2[1] = sb2;
            objArr2[2] = sb4;
            try {
                objArr2[3] = null;
                return findConstructor.newInstance(objArr2);
            } catch (Throwable unused2) {
                return null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    private static ClassLoader createAndroidNClassLoader(String str, ClassLoader classLoader, Application application) throws Exception {
        try {
            AndroidNClassLoader androidNClassLoader = new AndroidNClassLoader(str, classLoader, application);
            Field findField = ShareReflectUtil.findField((Object) classLoader, "pathList");
            Object obj = findField.get(classLoader);
            findField.set(androidNClassLoader, recreateDexPathList(obj, androidNClassLoader, false));
            ShareReflectUtil.findField(obj, "definingContext").set(obj, androidNClassLoader);
            oldDexPathListHolder = obj;
            return androidNClassLoader;
        } catch (Throwable unused) {
            return classLoader;
        }
    }

    private static void reflectPackageInfoClassloader(Application application, ClassLoader classLoader) throws Exception {
        try {
            Context context = (Context) ShareReflectUtil.findField((Object) application, "mBase").get(application);
            Object obj = ShareReflectUtil.findField((Object) context, "mPackageInfo").get(context);
            ShareReflectUtil.findField(obj, "mClassLoader").set(obj, classLoader);
        } catch (Throwable unused) {
        }
    }

    public static ClassLoader inject(ClassLoader classLoader, Application application) throws Exception {
        try {
            ClassLoader createAndroidNClassLoader = createAndroidNClassLoader("", classLoader, application);
            reflectPackageInfoClassloader(application, createAndroidNClassLoader);
            return createAndroidNClassLoader;
        } catch (Throwable unused) {
            return null;
        }
    }
}
