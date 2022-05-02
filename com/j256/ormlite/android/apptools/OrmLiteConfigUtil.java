package com.j256.ormlite.android.apptools;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.db.SqliteAndroidDatabaseType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.table.DatabaseTableConfig;
import com.j256.ormlite.table.DatabaseTableConfigLoader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrmLiteConfigUtil {
    protected static final String RAW_DIR_NAME = "raw";
    protected static final String RESOURCE_DIR_NAME = "res";
    private static final DatabaseType databaseType = new SqliteAndroidDatabaseType();
    protected static int maxFindSourceLevel = 20;

    public static void main(String[] strArr) throws Exception {
        if (strArr.length == 1) {
            writeConfigFile(strArr[0]);
            return;
        }
        throw new IllegalArgumentException("Main can take a single file-name argument.");
    }

    public static void writeConfigFile(String str) throws SQLException, IOException {
        ArrayList arrayList = new ArrayList();
        findAnnotatedClasses(arrayList, new File("."), 0);
        writeConfigFile(str, (Class<?>[]) (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }

    public static void writeConfigFile(String str, Class<?>[] clsArr) throws SQLException, IOException {
        File findRawDir = findRawDir(new File("."));
        if (findRawDir == null) {
            System.err.println("Could not find raw directory which is typically in the res directory");
        } else {
            writeConfigFile(new File(findRawDir, str), clsArr);
        }
    }

    public static void writeConfigFile(File file) throws SQLException, IOException {
        writeConfigFile(file, new File("."));
    }

    public static void writeConfigFile(File file, File file2) throws SQLException, IOException {
        ArrayList arrayList = new ArrayList();
        findAnnotatedClasses(arrayList, file2, 0);
        writeConfigFile(file, (Class<?>[]) (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }

    public static void writeConfigFile(File file, Class<?>[] clsArr) throws SQLException, IOException {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder("Writing configurations to ");
        sb.append(file.getAbsolutePath());
        printStream.println(sb.toString());
        writeConfigFile((OutputStream) new FileOutputStream(file), clsArr);
    }

    public static void writeConfigFile(OutputStream outputStream, File file) throws SQLException, IOException {
        ArrayList arrayList = new ArrayList();
        findAnnotatedClasses(arrayList, file, 0);
        writeConfigFile(outputStream, (Class<?>[]) (Class[]) arrayList.toArray(new Class[arrayList.size()]));
    }

    public static void writeConfigFile(OutputStream outputStream, Class<?>[] clsArr) throws SQLException, IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream), 4096);
        try {
            writeHeader(bufferedWriter);
            for (Class<?> writeConfigForTable : clsArr) {
                writeConfigForTable(bufferedWriter, writeConfigForTable);
            }
            System.out.println("Done.");
        } finally {
            bufferedWriter.close();
        }
    }

    protected static File findRawDir(File file) {
        int i = 0;
        while (file != null && i < 20) {
            File findResRawDir = findResRawDir(file);
            if (findResRawDir != null) {
                return findResRawDir;
            }
            file = file.getParentFile();
            i++;
        }
        return null;
    }

    private static void writeHeader(BufferedWriter bufferedWriter) throws IOException {
        bufferedWriter.append('#');
        bufferedWriter.newLine();
        bufferedWriter.append("# generated on ").append(new SimpleDateFormat("yyyy/MM/dd hh:mm:ss").format(new Date()));
        bufferedWriter.newLine();
        bufferedWriter.append('#');
        bufferedWriter.newLine();
    }

    private static void findAnnotatedClasses(List<Class<?>> list, File file, int i) throws SQLException, IOException {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (i < maxFindSourceLevel) {
                    findAnnotatedClasses(list, file2, i + 1);
                }
            } else if (file2.getName().endsWith(".java")) {
                String packageOfClass = getPackageOfClass(file2);
                if (packageOfClass == null) {
                    System.err.println("Could not find package name for: ".concat(String.valueOf(file2)));
                } else {
                    String name = file2.getName();
                    String substring = name.substring(0, name.length() - 5);
                    StringBuilder sb = new StringBuilder();
                    sb.append(packageOfClass);
                    sb.append(".");
                    sb.append(substring);
                    try {
                        Class<?> cls = Class.forName(sb.toString());
                        if (classHasAnnotations(cls)) {
                            list.add(cls);
                        }
                        try {
                            for (Class cls2 : cls.getDeclaredClasses()) {
                                if (classHasAnnotations(cls2)) {
                                    list.add(cls2);
                                }
                            }
                        } catch (Throwable th) {
                            System.err.println("Could not load inner classes for: ".concat(String.valueOf(cls)));
                            System.err.println("     ".concat(String.valueOf(th)));
                        }
                    } catch (Throwable th2) {
                        System.err.println("Could not load class file for: ".concat(String.valueOf(file2)));
                        System.err.println("     ".concat(String.valueOf(th2)));
                    }
                }
            }
        }
    }

    private static void writeConfigForTable(BufferedWriter bufferedWriter, Class<?> cls) throws SQLException, IOException {
        String extractTableName = DatabaseTableConfig.extractTableName(cls);
        ArrayList arrayList = new ArrayList();
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                for (Field fromField : cls2.getDeclaredFields()) {
                    DatabaseFieldConfig fromField2 = DatabaseFieldConfig.fromField(databaseType, extractTableName, fromField);
                    if (fromField2 != null) {
                        arrayList.add(fromField2);
                    }
                }
                cls2 = cls2.getSuperclass();
            } catch (Error e) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("Skipping ");
                sb.append(cls);
                sb.append(" because we got an error finding its definition: ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
                return;
            }
        }
        if (arrayList.isEmpty()) {
            PrintStream printStream2 = System.out;
            StringBuilder sb2 = new StringBuilder("Skipping ");
            sb2.append(cls);
            sb2.append(" because no annotated fields found");
            printStream2.println(sb2.toString());
            return;
        }
        DatabaseTableConfigLoader.write(bufferedWriter, new DatabaseTableConfig(cls, extractTableName, (List<DatabaseFieldConfig>) arrayList));
        bufferedWriter.append("#################################");
        bufferedWriter.newLine();
        System.out.println("Wrote config for ".concat(String.valueOf(cls)));
    }

    private static boolean classHasAnnotations(Class<?> cls) {
        Class<? super Object> cls2 = cls;
        while (cls2 != null) {
            if (cls2.getAnnotation(DatabaseTable.class) != null) {
                return true;
            }
            try {
                for (Field field : cls2.getDeclaredFields()) {
                    if (field.getAnnotation(DatabaseField.class) != null || field.getAnnotation(ForeignCollectionField.class) != null) {
                        return true;
                    }
                }
                try {
                    cls2 = cls2.getSuperclass();
                } catch (Throwable th) {
                    System.err.println("Could not get super class for: ".concat(String.valueOf(cls2)));
                    System.err.println("     ".concat(String.valueOf(th)));
                    return false;
                }
            } catch (Throwable th2) {
                System.err.println("Could not load get delcared fields from: ".concat(String.valueOf(cls2)));
                System.err.println("     ".concat(String.valueOf(th2)));
            }
        }
        return false;
    }

    private static String getPackageOfClass(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return null;
                } else if (readLine.contains("package")) {
                    String[] split = readLine.split("[ \t;]");
                    if (split.length > 1 && split[0].equals("package")) {
                        return split[1];
                    }
                }
            } finally {
                bufferedReader.close();
            }
        }
    }

    private static File findResRawDir(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.getName().equals(RESOURCE_DIR_NAME) && file2.isDirectory()) {
                File[] listFiles = file2.listFiles(new FileFilter() {
                    public final boolean accept(File file) {
                        return file.getName().equals(OrmLiteConfigUtil.RAW_DIR_NAME) && file.isDirectory();
                    }
                });
                if (listFiles.length == 1) {
                    return listFiles[0];
                }
            }
        }
        return null;
    }
}
