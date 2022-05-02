package com.alibaba.fastjson.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import id.dana.sendmoney.summary.SummaryActivity;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TypeUtils {
    public static boolean compatibleWithJavaBean = false;
    private static volatile Map<Class, String[]> kotlinIgnores = null;
    private static volatile boolean kotlinIgnores_error = false;
    private static volatile boolean kotlin_class_klass_error = false;
    private static volatile boolean kotlin_error = false;
    private static volatile Constructor kotlin_kclass_constructor = null;
    private static volatile Method kotlin_kclass_getConstructors = null;
    private static volatile Method kotlin_kfunction_getParameters = null;
    private static volatile Method kotlin_kparameter_getName = null;
    private static volatile Class kotlin_metadata = null;
    private static volatile boolean kotlin_metadata_error = false;
    private static final ConcurrentMap<String, Class<?>> mappings;
    private static boolean setAccessibleEnable = true;

    public static boolean isKotlin(Class cls) {
        if (kotlin_metadata == null && !kotlin_metadata_error) {
            try {
                kotlin_metadata = Class.forName("kotlin.Metadata");
            } catch (Throwable unused) {
                kotlin_metadata_error = true;
            }
        }
        if (kotlin_metadata == null) {
            return false;
        }
        return cls.isAnnotationPresent(kotlin_metadata);
    }

    private static boolean isKotlinIgnore(Class cls, String str) {
        String[] strArr;
        if (kotlinIgnores == null && !kotlinIgnores_error) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(Class.forName("kotlin.ranges.CharRange"), new String[]{"getEndInclusive", "isEmpty"});
                hashMap.put(Class.forName("kotlin.ranges.IntRange"), new String[]{"getEndInclusive", "isEmpty"});
                hashMap.put(Class.forName("kotlin.ranges.LongRange"), new String[]{"getEndInclusive", "isEmpty"});
                hashMap.put(Class.forName("kotlin.ranges.ClosedFloatRange"), new String[]{"getEndInclusive", "isEmpty"});
                hashMap.put(Class.forName("kotlin.ranges.ClosedDoubleRange"), new String[]{"getEndInclusive", "isEmpty"});
                kotlinIgnores = hashMap;
            } catch (Throwable unused) {
                kotlinIgnores_error = true;
            }
        }
        if (kotlinIgnores == null || (strArr = kotlinIgnores.get(cls)) == null || Arrays.binarySearch(strArr, str) < 0) {
            return false;
        }
        return true;
    }

    public static String[] getKoltinConstructorParameters(Class cls) {
        if (kotlin_kclass_constructor == null && !kotlin_class_klass_error) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                kotlin_kclass_constructor = cls2.getConstructor(new Class[]{Class.class});
                kotlin_kclass_getConstructors = cls2.getMethod("getConstructors", new Class[0]);
                kotlin_kfunction_getParameters = Class.forName("kotlin.reflect.KFunction").getMethod("getParameters", new Class[0]);
                kotlin_kparameter_getName = Class.forName("kotlin.reflect.KParameter").getMethod("getName", new Class[0]);
            } catch (Throwable unused) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kclass_constructor == null || kotlin_error) {
            return null;
        }
        try {
            Iterator it = ((Iterable) kotlin_kclass_getConstructors.invoke(kotlin_kclass_constructor.newInstance(new Object[]{cls}), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) kotlin_kfunction_getParameters.invoke(next, new Object[0]);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) kotlin_kfunction_getParameters.invoke(obj, new Object[0]);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) kotlin_kparameter_getName.invoke(list2.get(i), new Object[0]);
            }
            return strArr;
        } catch (Throwable unused2) {
            kotlin_error = true;
            return null;
        }
    }

    public static final String castToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static final Byte castToByte(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            return Byte.valueOf(Byte.parseByte(str));
        }
        throw new JSONException("can not cast to byte, value : ".concat(String.valueOf(obj)));
    }

    public static final Character castToChar(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0) {
                return null;
            }
            if (str.length() == 1) {
                return Character.valueOf(str.charAt(0));
            }
            throw new JSONException("can not cast to byte, value : ".concat(String.valueOf(obj)));
        }
        throw new JSONException("can not cast to byte, value : ".concat(String.valueOf(obj)));
    }

    public static final Short castToShort(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            return Short.valueOf(Short.parseShort(str));
        }
        throw new JSONException("can not cast to short, value : ".concat(String.valueOf(obj)));
    }

    public static final BigDecimal castToBigDecimal(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return new BigDecimal(obj2);
    }

    public static final BigInteger castToBigInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return new BigInteger(obj2);
    }

    public static final Float castToFloat(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            String obj2 = obj.toString();
            if (obj2.length() == 0 || "null".equals(obj2)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(obj2));
        }
        throw new JSONException("can not cast to float, value : ".concat(String.valueOf(obj)));
    }

    public static final Double castToDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            String obj2 = obj.toString();
            if (obj2.length() == 0 || "null".equals(obj2) || "NULL".equals(obj2)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(obj2));
        }
        throw new JSONException("can not cast to double, value : ".concat(String.valueOf(obj)));
    }

    public static final Date castToDate(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        long j = -1;
        if (obj instanceof Number) {
            j = ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.indexOf(45) != -1) {
                if (str2.length() == JSON.DEFFAULT_DATE_FORMAT.length()) {
                    str = JSON.DEFFAULT_DATE_FORMAT;
                } else if (str2.length() == 10) {
                    str = "yyyy-MM-dd";
                } else if (str2.length() == 19) {
                    str = "yyyy-MM-dd HH:mm:ss";
                } else {
                    str = (str2.length() == 29 && str2.charAt(26) == ':' && str2.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, JSON.defaultLocale);
                simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
                try {
                    return simpleDateFormat.parse(str2);
                } catch (ParseException unused) {
                    throw new JSONException("can not cast to Date, value : ".concat(String.valueOf(str2)));
                }
            } else if (str2.length() == 0 || "null".equals(str2)) {
                return null;
            } else {
                j = Long.parseLong(str2);
            }
        }
        if (j >= 0) {
            return new Date(j);
        }
        throw new JSONException("can not cast to Date, value : ".concat(String.valueOf(obj)));
    }

    public static final Long castToLong(Object obj) {
        Calendar calendar = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                JSONLexer jSONLexer = new JSONLexer(str);
                if (jSONLexer.scanISO8601DateIfMatch(false)) {
                    calendar = jSONLexer.calendar;
                }
                jSONLexer.close();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new JSONException("can not cast to long, value : ".concat(String.valueOf(obj)));
    }

    public static final Integer castToInt(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
        throw new JSONException("can not cast to int, value : ".concat(String.valueOf(obj)));
    }

    public static final byte[] castToBytes(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return JSONLexer.decodeFast(str, 0, str.length());
        }
        throw new JSONException("can not cast to int, value : ".concat(String.valueOf(obj)));
    }

    public static final Boolean castToBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            boolean z = true;
            if (((Number) obj).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if (SummaryActivity.CHECKED.equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new JSONException("can not cast to int, value : ".concat(String.valueOf(obj)));
    }

    public static final <T> T castToJavaBean(Object obj, Class<T> cls) {
        return cast(obj, cls, ParserConfig.global);
    }

    public static final <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig) {
        return cast(obj, cls, parserConfig, 0);
    }

    public static final <T> T cast(Object obj, Class<T> cls, ParserConfig parserConfig, int i) {
        T t;
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        } else if (cls == obj.getClass()) {
            return obj;
        } else {
            if (!(obj instanceof Map)) {
                int i2 = 0;
                if (cls.isArray()) {
                    if (obj instanceof Collection) {
                        Collection<Object> collection = (Collection) obj;
                        T newInstance = Array.newInstance(cls.getComponentType(), collection.size());
                        for (Object cast : collection) {
                            Array.set(newInstance, i2, cast(cast, cls.getComponentType(), parserConfig));
                            i2++;
                        }
                        return newInstance;
                    } else if (cls == byte[].class) {
                        return castToBytes(obj);
                    }
                }
                if (cls.isAssignableFrom(obj.getClass())) {
                    return obj;
                }
                if (cls == Boolean.TYPE || cls == Boolean.class) {
                    return castToBoolean(obj);
                }
                if (cls == Byte.TYPE || cls == Byte.class) {
                    return castToByte(obj);
                }
                if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
                    String str = (String) obj;
                    if (str.length() == 1) {
                        return Character.valueOf(str.charAt(0));
                    }
                }
                if (cls == Short.TYPE || cls == Short.class) {
                    return castToShort(obj);
                }
                if (cls == Integer.TYPE || cls == Integer.class) {
                    return castToInt(obj);
                }
                if (cls == Long.TYPE || cls == Long.class) {
                    return castToLong(obj);
                }
                if (cls == Float.TYPE || cls == Float.class) {
                    return castToFloat(obj);
                }
                if (cls == Double.TYPE || cls == Double.class) {
                    return castToDouble(obj);
                }
                if (cls == String.class) {
                    return castToString(obj);
                }
                if (cls == BigDecimal.class) {
                    return castToBigDecimal(obj);
                }
                if (cls == BigInteger.class) {
                    return castToBigInteger(obj);
                }
                if (cls == Date.class) {
                    return castToDate(obj);
                }
                if (cls.isEnum()) {
                    return castToEnum(obj, cls, parserConfig);
                }
                if (Calendar.class.isAssignableFrom(cls)) {
                    Date castToDate = castToDate(obj);
                    if (cls == Calendar.class) {
                        t = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
                    } else {
                        try {
                            t = (Calendar) cls.newInstance();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder("can not cast to : ");
                            sb.append(cls.getName());
                            throw new JSONException(sb.toString(), e);
                        }
                    }
                    t.setTime(castToDate);
                    return t;
                }
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() == 0 || "null".equals(str2)) {
                        return null;
                    }
                    if (cls == Currency.class) {
                        return Currency.getInstance(str2);
                    }
                }
                StringBuilder sb2 = new StringBuilder("can not cast to : ");
                sb2.append(cls.getName());
                throw new JSONException(sb2.toString());
            } else if (cls == Map.class) {
                return obj;
            } else {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey(JSON.DEFAULT_TYPE_KEY)) {
                    return castToJavaBean(map, cls, parserConfig, i);
                }
                return obj;
            }
        }
    }

    public static final <T> T castToEnum(Object obj, Class<T> cls, ParserConfig parserConfig) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                return Enum.valueOf(cls, str);
            }
            if (obj instanceof Number) {
                int intValue = ((Number) obj).intValue();
                T[] enumConstants = cls.getEnumConstants();
                if (intValue < enumConstants.length) {
                    return enumConstants[intValue];
                }
            }
            StringBuilder sb = new StringBuilder("can not cast to : ");
            sb.append(cls.getName());
            throw new JSONException(sb.toString());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("can not cast to : ");
            sb2.append(cls.getName());
            throw new JSONException(sb2.toString(), e);
        }
    }

    public static final <T> T cast(Object obj, Type type, ParserConfig parserConfig) {
        if (obj == null) {
            return null;
        }
        if (type instanceof Class) {
            return cast(obj, (Class) type, parserConfig);
        }
        if (type instanceof ParameterizedType) {
            return cast(obj, (ParameterizedType) type, parserConfig);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new JSONException("can not cast to : ".concat(String.valueOf(type)));
    }

    public static final <T> T cast(Object obj, ParameterizedType parameterizedType, ParserConfig parserConfig) {
        T t;
        Type rawType = parameterizedType.getRawType();
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType == Set.class || rawType == HashSet.class) {
                    t = new HashSet();
                } else if (rawType == TreeSet.class) {
                    t = new TreeSet();
                } else {
                    t = new ArrayList();
                }
                for (Object cast : (Iterable) obj) {
                    t.add(cast(cast, type, parserConfig));
                }
                return t;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                T hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    hashMap.put(cast(entry.getKey(), type2, parserConfig), cast(entry.getValue(), type3, parserConfig));
                }
                return hashMap;
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return cast(obj, rawType, parserConfig);
        }
        throw new JSONException("can not cast to : ".concat(String.valueOf(parameterizedType)));
    }

    public static final <T> T castToJavaBean(Map<String, Object> map, Class<T> cls, ParserConfig parserConfig) {
        return castToJavaBean(map, cls, parserConfig, 0);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.alibaba.fastjson.parser.deserializer.ObjectDeserializer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T castToJavaBean(java.util.Map<java.lang.String, java.lang.Object> r4, java.lang.Class<T> r5, com.alibaba.fastjson.parser.ParserConfig r6, int r7) {
        /*
            java.lang.Class<java.lang.StackTraceElement> r0 = java.lang.StackTraceElement.class
            r1 = 0
            if (r5 != r0) goto L_0x0032
            java.lang.String r5 = "className"
            java.lang.Object r5 = r4.get(r5)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r6 = "methodName"
            java.lang.Object r6 = r4.get(r6)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r7 = "fileName"
            java.lang.Object r7 = r4.get(r7)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = "lineNumber"
            java.lang.Object r4 = r4.get(r0)     // Catch:{ Exception -> 0x00d0 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ Exception -> 0x00d0 }
            if (r4 != 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            int r1 = r4.intValue()     // Catch:{ Exception -> 0x00d0 }
        L_0x002c:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement     // Catch:{ Exception -> 0x00d0 }
            r4.<init>(r5, r6, r7, r1)     // Catch:{ Exception -> 0x00d0 }
            return r4
        L_0x0032:
            java.lang.String r0 = "@type"
            java.lang.Object r0 = r4.get(r0)     // Catch:{ Exception -> 0x00d0 }
            boolean r2 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x00d0 }
            r3 = 0
            if (r2 == 0) goto L_0x006b
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d0 }
            if (r6 != 0) goto L_0x0043
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.global     // Catch:{ Exception -> 0x00d0 }
        L_0x0043:
            java.lang.Class r2 = r6.checkAutoType(r0, r3, r7)     // Catch:{ Exception -> 0x00d0 }
            if (r2 == 0) goto L_0x0054
            boolean r0 = r2.equals(r5)     // Catch:{ Exception -> 0x00d0 }
            if (r0 != 0) goto L_0x006b
            java.lang.Object r4 = castToJavaBean(r4, r2, r6, r7)     // Catch:{ Exception -> 0x00d0 }
            return r4
        L_0x0054:
            java.lang.ClassNotFoundException r4 = new java.lang.ClassNotFoundException     // Catch:{ Exception -> 0x00d0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d0 }
            r5.<init>()     // Catch:{ Exception -> 0x00d0 }
            r5.append(r0)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r6 = " not found"
            r5.append(r6)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00d0 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00d0 }
            throw r4     // Catch:{ Exception -> 0x00d0 }
        L_0x006b:
            boolean r7 = r5.isInterface()     // Catch:{ Exception -> 0x00d0 }
            if (r7 == 0) goto L_0x00a5
            boolean r7 = r4 instanceof com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x00d0 }
            if (r7 == 0) goto L_0x0078
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch:{ Exception -> 0x00d0 }
            goto L_0x007e
        L_0x0078:
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x00d0 }
            r7.<init>((java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ Exception -> 0x00d0 }
            r4 = r7
        L_0x007e:
            if (r6 != 0) goto L_0x0084
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance()     // Catch:{ Exception -> 0x00d0 }
        L_0x0084:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r6 = r6.getDeserializer(r5)     // Catch:{ Exception -> 0x00d0 }
            if (r6 == 0) goto L_0x0093
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)     // Catch:{ Exception -> 0x00d0 }
            java.lang.Object r4 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r4, r5)     // Catch:{ Exception -> 0x00d0 }
            return r4
        L_0x0093:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x00d0 }
            java.lang.ClassLoader r6 = r6.getContextClassLoader()     // Catch:{ Exception -> 0x00d0 }
            r7 = 1
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x00d0 }
            r7[r1] = r5     // Catch:{ Exception -> 0x00d0 }
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r6, r7, r4)     // Catch:{ Exception -> 0x00d0 }
            return r4
        L_0x00a5:
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r5 != r7) goto L_0x00b2
            boolean r7 = r4 instanceof com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x00d0 }
            if (r7 == 0) goto L_0x00b2
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00d0 }
            return r4
        L_0x00b2:
            if (r6 != 0) goto L_0x00b6
            com.alibaba.fastjson.parser.ParserConfig r6 = com.alibaba.fastjson.parser.ParserConfig.global     // Catch:{ Exception -> 0x00d0 }
        L_0x00b6:
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r5 = r6.getDeserializer(r5)     // Catch:{ Exception -> 0x00d0 }
            boolean r7 = r5 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer     // Catch:{ Exception -> 0x00d0 }
            if (r7 == 0) goto L_0x00c1
            r3 = r5
            com.alibaba.fastjson.parser.JavaBeanDeserializer r3 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r3     // Catch:{ Exception -> 0x00d0 }
        L_0x00c1:
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r4 = r3.createInstance((java.util.Map<java.lang.String, java.lang.Object>) r4, (com.alibaba.fastjson.parser.ParserConfig) r6)     // Catch:{ Exception -> 0x00d0 }
            return r4
        L_0x00c8:
            com.alibaba.fastjson.JSONException r4 = new com.alibaba.fastjson.JSONException     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r5 = "can not get javaBeanDeserializer"
            r4.<init>(r5)     // Catch:{ Exception -> 0x00d0 }
            throw r4     // Catch:{ Exception -> 0x00d0 }
        L_0x00d0:
            r4 = move-exception
            com.alibaba.fastjson.JSONException r5 = new com.alibaba.fastjson.JSONException
            java.lang.String r6 = r4.getMessage()
            r5.<init>(r6, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.castToJavaBean(java.util.Map, java.lang.Class, com.alibaba.fastjson.parser.ParserConfig, int):java.lang.Object");
    }

    static {
        Class<char[]> cls = char[].class;
        Class<boolean[]> cls2 = boolean[].class;
        Class<double[]> cls3 = double[].class;
        Class<float[]> cls4 = float[].class;
        Class<long[]> cls5 = long[].class;
        Class<int[]> cls6 = int[].class;
        Class<short[]> cls7 = short[].class;
        Class<byte[]> cls8 = byte[].class;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(36, 0.75f, 1);
        mappings = concurrentHashMap;
        concurrentHashMap.put("byte", Byte.TYPE);
        mappings.put("short", Short.TYPE);
        mappings.put("int", Integer.TYPE);
        mappings.put("long", Long.TYPE);
        mappings.put("float", Float.TYPE);
        mappings.put("double", Double.TYPE);
        mappings.put("boolean", Boolean.TYPE);
        mappings.put("char", Character.TYPE);
        mappings.put("[byte", cls8);
        mappings.put("[short", cls7);
        mappings.put("[int", cls6);
        mappings.put("[long", cls5);
        mappings.put("[float", cls4);
        mappings.put("[double", cls3);
        mappings.put("[boolean", cls2);
        mappings.put("[char", cls);
        mappings.put("[B", cls8);
        mappings.put("[S", cls7);
        mappings.put("[I", cls6);
        mappings.put("[J", cls5);
        mappings.put("[F", cls4);
        mappings.put("[D", cls3);
        mappings.put("[C", cls);
        mappings.put("[Z", cls2);
        mappings.put("java.util.HashMap", HashMap.class);
        mappings.put("java.util.TreeMap", TreeMap.class);
        mappings.put("java.util.Date", Date.class);
        mappings.put("com.alibaba.fastjson.JSONObject", JSONObject.class);
        mappings.put("java.util.concurrent.ConcurrentHashMap", ConcurrentHashMap.class);
        mappings.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        mappings.put("java.lang.StackTraceElement", StackTraceElement.class);
        mappings.put("java.lang.RuntimeException", RuntimeException.class);
    }

    public static Class<?> getClassFromMapping(String str) {
        return (Class) mappings.get(str);
    }

    public static Class<?> loadClass(String str, ClassLoader classLoader) {
        return loadClass(str, classLoader, false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:(4:23|24|(1:26)|27)|28|29|(3:32|(2:34|35)|38)|(3:39|40|52)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0080 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC, Splitter:B:34:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?> loadClass(java.lang.String r6, java.lang.ClassLoader r7, boolean r8) {
        /*
            r0 = 0
        L_0x0001:
            r1 = 0
            if (r6 == 0) goto L_0x009a
            int r2 = r6.length()
            if (r2 != 0) goto L_0x000c
            goto L_0x009a
        L_0x000c:
            int r2 = r6.length()
            r3 = 256(0x100, float:3.59E-43)
            if (r2 >= r3) goto L_0x008a
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r2 = mappings
            java.lang.Object r2 = r2.get(r6)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L_0x001f
            return r2
        L_0x001f:
            char r3 = r6.charAt(r0)
            r4 = 91
            r5 = 1
            if (r3 != r4) goto L_0x003c
            java.lang.String r6 = r6.substring(r5)
            java.lang.Class r6 = loadClass(r6, r7, r0)
            if (r6 != 0) goto L_0x0033
            return r1
        L_0x0033:
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r0)
            java.lang.Class r6 = r6.getClass()
            return r6
        L_0x003c:
            java.lang.String r1 = "L"
            boolean r1 = r6.startsWith(r1)
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = ";"
            boolean r1 = r6.endsWith(r1)
            if (r1 == 0) goto L_0x0057
            int r8 = r6.length()
            int r8 = r8 - r5
            java.lang.String r6 = r6.substring(r5, r8)
            r8 = 0
            goto L_0x0001
        L_0x0057:
            if (r7 == 0) goto L_0x0065
            java.lang.Class r2 = r7.loadClass(r6)     // Catch:{ Exception -> 0x0065 }
            if (r8 == 0) goto L_0x0064
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r0 = mappings     // Catch:{ Exception -> 0x0065 }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x0065 }
        L_0x0064:
            return r2
        L_0x0065:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0080 }
            java.lang.ClassLoader r0 = r0.getContextClassLoader()     // Catch:{ Exception -> 0x0080 }
            if (r0 == 0) goto L_0x0080
            if (r0 == r7) goto L_0x0080
            java.lang.Class r7 = r0.loadClass(r6)     // Catch:{ Exception -> 0x0080 }
            if (r8 == 0) goto L_0x007f
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r8 = mappings     // Catch:{ Exception -> 0x007d }
            r8.put(r6, r7)     // Catch:{ Exception -> 0x007d }
            goto L_0x007f
        L_0x007d:
            r2 = r7
            goto L_0x0080
        L_0x007f:
            return r7
        L_0x0080:
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x0089 }
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Class<?>> r7 = mappings     // Catch:{ Exception -> 0x0089 }
            r7.put(r6, r2)     // Catch:{ Exception -> 0x0089 }
        L_0x0089:
            return r2
        L_0x008a:
            com.alibaba.fastjson.JSONException r7 = new com.alibaba.fastjson.JSONException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "className too long. "
            java.lang.String r6 = r8.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.loadClass(java.lang.String, java.lang.ClassLoader, boolean):java.lang.Class");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Class<? super java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.Class<? super java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v42, types: [java.lang.annotation.Annotation[][]] */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0407, code lost:
        if (r0 == null) goto L_0x043c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.alibaba.fastjson.util.FieldInfo> computeGetters(java.lang.Class<?> r41, int r42, boolean r43, com.alibaba.fastjson.annotation.JSONType r44, java.util.Map<java.lang.String, java.lang.String> r45, boolean r46, boolean r47, boolean r48, com.alibaba.fastjson.PropertyNamingStrategy r49) {
        /*
            r11 = r41
            r12 = r42
            r13 = r44
            r14 = r45
            r15 = r49
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.reflect.Field[] r8 = r41.getDeclaredFields()
            r16 = 0
            if (r43 != 0) goto L_0x0489
            boolean r17 = isKotlin(r41)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r11
        L_0x0026:
            if (r1 == 0) goto L_0x0078
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L_0x0078
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()
            int r3 = r2.length
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x0073
            r5 = r2[r4]
            int r6 = r5.getModifiers()
            r19 = r6 & 8
            if (r19 != 0) goto L_0x0070
            r19 = r6 & 2
            if (r19 != 0) goto L_0x0070
            r7 = r6 & 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0070
            r6 = r6 & 4
            if (r6 != 0) goto L_0x0070
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0070
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != 0) goto L_0x0070
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class<java.lang.ClassLoader> r7 = java.lang.ClassLoader.class
            if (r6 == r7) goto L_0x0070
            java.lang.Class r6 = r5.getDeclaringClass()
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r6 == r7) goto L_0x0070
            r0.add(r5)
        L_0x0070:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0073:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x0026
        L_0x0078:
            java.util.Iterator r20 = r0.iterator()
            r0 = r16
            r1 = r0
            r2 = r1
            r3 = r2
        L_0x0081:
            boolean r4 = r20.hasNext()
            if (r4 == 0) goto L_0x0489
            java.lang.Object r4 = r20.next()
            r7 = r4
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r6 = r7.getName()
            java.lang.String r4 = "getMetaClass"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x00aa
            java.lang.Class r4 = r7.getReturnType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "groovy.lang.MetaClass"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0081
        L_0x00aa:
            if (r47 == 0) goto L_0x00b5
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r4 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r4 = r7.getAnnotation(r4)
            com.alibaba.fastjson.annotation.JSONField r4 = (com.alibaba.fastjson.annotation.JSONField) r4
            goto L_0x00b7
        L_0x00b5:
            r4 = r16
        L_0x00b7:
            if (r4 != 0) goto L_0x00bf
            if (r47 == 0) goto L_0x00bf
            com.alibaba.fastjson.annotation.JSONField r4 = getSupperMethodAnnotation(r11, r7)
        L_0x00bf:
            if (r17 == 0) goto L_0x00c7
            boolean r5 = isKotlinIgnore(r11, r6)
            if (r5 != 0) goto L_0x0081
        L_0x00c7:
            java.lang.String r5 = "get"
            r21 = r10
            if (r4 != 0) goto L_0x017f
            if (r17 == 0) goto L_0x017f
            if (r0 != 0) goto L_0x011a
            java.lang.reflect.Constructor[] r0 = r41.getDeclaredConstructors()
            int r10 = r0.length
            r22 = r3
            r3 = 1
            if (r10 != r3) goto L_0x0115
            r10 = 0
            r2 = r0[r10]
            java.lang.annotation.Annotation[][] r2 = r2.getParameterAnnotations()
            java.lang.String[] r3 = getKoltinConstructorParameters(r41)
            if (r3 == 0) goto L_0x010f
            int r1 = r3.length
            java.lang.String[] r1 = new java.lang.String[r1]
            r18 = r0
            int r0 = r3.length
            java.lang.System.arraycopy(r3, r10, r1, r10, r0)
            java.util.Arrays.sort(r1)
            int r0 = r3.length
            short[] r0 = new short[r0]
            r22 = r2
        L_0x00f9:
            int r2 = r3.length
            if (r10 >= r2) goto L_0x0108
            r2 = r3[r10]
            int r2 = java.util.Arrays.binarySearch(r1, r2)
            r0[r2] = r10
            int r10 = r10 + 1
            short r10 = (short) r10
            goto L_0x00f9
        L_0x0108:
            r2 = r1
            r3 = r22
            r1 = r0
            r0 = r18
            goto L_0x011c
        L_0x010f:
            r18 = r0
            r22 = r2
            r2 = r3
            goto L_0x0117
        L_0x0115:
            r18 = r0
        L_0x0117:
            r3 = r22
            goto L_0x011c
        L_0x011a:
            r22 = r3
        L_0x011c:
            if (r2 == 0) goto L_0x0174
            if (r1 == 0) goto L_0x0174
            boolean r10 = r6.startsWith(r5)
            if (r10 == 0) goto L_0x0174
            r10 = 3
            java.lang.String r18 = r6.substring(r10)
            java.lang.String r10 = decapitalize(r18)
            int r18 = java.util.Arrays.binarySearch(r2, r10)
            r22 = r0
            r24 = r4
            if (r18 >= 0) goto L_0x014b
            r0 = 0
        L_0x013a:
            int r4 = r2.length
            if (r0 >= r4) goto L_0x014b
            r4 = r2[r0]
            boolean r4 = r10.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0148
            r18 = r0
            goto L_0x014b
        L_0x0148:
            int r0 = r0 + 1
            goto L_0x013a
        L_0x014b:
            if (r18 < 0) goto L_0x0171
            short r0 = r1[r18]
            r0 = r3[r0]
            if (r0 == 0) goto L_0x0171
            int r4 = r0.length
            r10 = 0
        L_0x0155:
            if (r10 >= r4) goto L_0x0171
            r18 = r1
            r1 = r0[r10]
            r25 = r0
            boolean r0 = r1 instanceof com.alibaba.fastjson.annotation.JSONField
            if (r0 == 0) goto L_0x016a
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            r26 = r1
            r24 = r2
            r25 = r3
            goto L_0x018d
        L_0x016a:
            int r10 = r10 + 1
            r1 = r18
            r0 = r25
            goto L_0x0155
        L_0x0171:
            r18 = r1
            goto L_0x017a
        L_0x0174:
            r22 = r0
            r18 = r1
            r24 = r4
        L_0x017a:
            r25 = r3
            r26 = r24
            goto L_0x018b
        L_0x017f:
            r22 = r3
            r24 = r4
            r18 = r1
            r25 = r22
            r26 = r24
            r22 = r0
        L_0x018b:
            r24 = r2
        L_0x018d:
            if (r26 == 0) goto L_0x0217
            boolean r0 = r26.serialize()
            if (r0 == 0) goto L_0x020a
            int r10 = r26.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r26.serialzeFeatures()
            int r27 = com.alibaba.fastjson.serializer.SerializerFeature.of(r0)
            java.lang.String r0 = r26.name()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0200
            java.lang.String r0 = r26.name()
            if (r14 == 0) goto L_0x01c6
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x01ba
            goto L_0x01c6
        L_0x01ba:
            r15 = r8
            r33 = r9
            r13 = r12
            r10 = r21
            r19 = 0
            r23 = 1
            goto L_0x0475
        L_0x01c6:
            r6 = r0
            setAccessible(r11, r7, r12)
            com.alibaba.fastjson.util.FieldInfo r5 = new com.alibaba.fastjson.util.FieldInfo
            r3 = 0
            r28 = 0
            r29 = 0
            r30 = 1
            r0 = r5
            r1 = r6
            r2 = r7
            r7 = 1
            r4 = r41
            r31 = r5
            r5 = r28
            r32 = r6
            r19 = 0
            r6 = r10
            r23 = 1
            r7 = r27
            r10 = r8
            r8 = r26
            r33 = r9
            r9 = r29
            r15 = r10
            r12 = r21
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r31
            r0 = r32
            r12.put(r0, r1)
            r13 = r42
            goto L_0x034f
        L_0x0200:
            r15 = r8
            r33 = r9
            r12 = r21
            r19 = 0
            r23 = 1
            goto L_0x0223
        L_0x020a:
            r19 = 0
            r23 = 1
            r13 = r42
            r15 = r8
            r33 = r9
            r10 = r21
            goto L_0x0475
        L_0x0217:
            r15 = r8
            r33 = r9
            r12 = r21
            r19 = 0
            r23 = 1
            r10 = 0
            r27 = 0
        L_0x0223:
            boolean r0 = r6.startsWith(r5)
            r9 = 102(0x66, float:1.43E-43)
            r8 = 95
            if (r0 == 0) goto L_0x0352
            int r0 = r6.length()
            r1 = 4
            if (r0 < r1) goto L_0x034b
            java.lang.String r0 = "getClass"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x034b
            r5 = 3
            char r0 = r6.charAt(r5)
            boolean r2 = java.lang.Character.isUpperCase(r0)
            if (r2 == 0) goto L_0x0270
            boolean r0 = compatibleWithJavaBean
            if (r0 == 0) goto L_0x0254
            java.lang.String r0 = r6.substring(r5)
            java.lang.String r0 = decapitalize(r0)
            goto L_0x0297
        L_0x0254:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r2 = r6.charAt(r5)
            char r2 = java.lang.Character.toLowerCase(r2)
            r0.append(r2)
            java.lang.String r1 = r6.substring(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0297
        L_0x0270:
            if (r0 != r8) goto L_0x0277
            java.lang.String r0 = r6.substring(r1)
            goto L_0x0297
        L_0x0277:
            if (r0 != r9) goto L_0x027e
            java.lang.String r0 = r6.substring(r5)
            goto L_0x0297
        L_0x027e:
            int r0 = r6.length()
            r2 = 5
            if (r0 < r2) goto L_0x034b
            char r0 = r6.charAt(r1)
            boolean r0 = java.lang.Character.isUpperCase(r0)
            if (r0 == 0) goto L_0x034b
            java.lang.String r0 = r6.substring(r5)
            java.lang.String r0 = decapitalize(r0)
        L_0x0297:
            boolean r1 = isJSONTypeIgnore(r11, r13, r0)
            if (r1 != 0) goto L_0x034b
            r4 = r33
            java.lang.reflect.Field r3 = getField(r11, r0, r15, r4)
            if (r3 == 0) goto L_0x02f4
            if (r47 == 0) goto L_0x02b0
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r1 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            goto L_0x02b2
        L_0x02b0:
            r1 = r16
        L_0x02b2:
            if (r1 == 0) goto L_0x02ec
            boolean r2 = r1.serialize()
            if (r2 == 0) goto L_0x02e6
            int r10 = r1.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r2 = r1.serialzeFeatures()
            int r27 = com.alibaba.fastjson.serializer.SerializerFeature.of(r2)
            java.lang.String r2 = r1.name()
            int r2 = r2.length()
            if (r2 == 0) goto L_0x02ec
            java.lang.String r0 = r1.name()
            if (r14 == 0) goto L_0x02de
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x02e6
        L_0x02de:
            r2 = r49
            r34 = r15
            r15 = r10
            r10 = r1
            r1 = 1
            goto L_0x02fc
        L_0x02e6:
            r13 = r42
            r33 = r4
            goto L_0x034f
        L_0x02ec:
            r2 = r49
            r34 = r15
            r15 = r10
            r10 = r1
            r1 = 0
            goto L_0x02fc
        L_0x02f4:
            r2 = r49
            r34 = r15
            r1 = 0
            r15 = r10
            r10 = r16
        L_0x02fc:
            if (r2 == 0) goto L_0x0304
            if (r1 != 0) goto L_0x0304
            java.lang.String r0 = r2.translate(r0)
        L_0x0304:
            if (r14 == 0) goto L_0x0318
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x030f
            goto L_0x0318
        L_0x030f:
            r13 = r42
            r33 = r4
            r10 = r12
            r15 = r34
            goto L_0x0475
        L_0x0318:
            r1 = r42
            r40 = r12
            r12 = r0
            r0 = r40
            setAccessible(r11, r7, r1)
            com.alibaba.fastjson.util.FieldInfo r5 = new com.alibaba.fastjson.util.FieldInfo
            r21 = 0
            r14 = r0
            r0 = r5
            r1 = r12
            r2 = r7
            r35 = r4
            r4 = r41
            r11 = r5
            r28 = 3
            r5 = r21
            r36 = r6
            r6 = r15
            r37 = r7
            r7 = r27
            r8 = r26
            r9 = r10
            r43 = r15
            r15 = 3
            r10 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.put(r12, r11)
            r10 = r43
            goto L_0x035c
        L_0x034b:
            r13 = r42
            r14 = r45
        L_0x034f:
            r10 = r12
            goto L_0x0475
        L_0x0352:
            r36 = r6
            r37 = r7
            r14 = r12
            r34 = r15
            r35 = r33
            r15 = 3
        L_0x035c:
            java.lang.String r0 = "is"
            r1 = r36
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x046c
            int r0 = r1.length()
            if (r0 < r15) goto L_0x046c
            r0 = 2
            char r2 = r1.charAt(r0)
            boolean r3 = java.lang.Character.isUpperCase(r2)
            if (r3 == 0) goto L_0x03a0
            boolean r2 = compatibleWithJavaBean
            if (r2 == 0) goto L_0x0384
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r0 = decapitalize(r0)
            goto L_0x03a8
        L_0x0384:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            char r0 = r1.charAt(r0)
            char r0 = java.lang.Character.toLowerCase(r0)
            r2.append(r0)
            java.lang.String r0 = r1.substring(r15)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x03a8
        L_0x03a0:
            r3 = 95
            if (r2 != r3) goto L_0x03ab
            java.lang.String r0 = r1.substring(r15)
        L_0x03a8:
            r11 = r41
            goto L_0x03b4
        L_0x03ab:
            r3 = 102(0x66, float:1.43E-43)
            if (r2 != r3) goto L_0x046c
            java.lang.String r0 = r1.substring(r0)
            goto L_0x03a8
        L_0x03b4:
            boolean r2 = isJSONTypeIgnore(r11, r13, r0)
            if (r2 != 0) goto L_0x046c
            r15 = r34
            r12 = r35
            java.lang.reflect.Field r2 = getField(r11, r0, r15, r12)
            if (r2 != 0) goto L_0x03ca
            java.lang.reflect.Field r1 = getField(r11, r1, r15, r12)
            r3 = r1
            goto L_0x03cb
        L_0x03ca:
            r3 = r2
        L_0x03cb:
            if (r3 == 0) goto L_0x0421
            if (r47 == 0) goto L_0x03d8
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r1 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            goto L_0x03da
        L_0x03d8:
            r1 = r16
        L_0x03da:
            if (r1 == 0) goto L_0x0417
            boolean r2 = r1.serialize()
            if (r2 == 0) goto L_0x0413
            int r2 = r1.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r4 = r1.serialzeFeatures()
            int r4 = com.alibaba.fastjson.serializer.SerializerFeature.of(r4)
            java.lang.String r5 = r1.name()
            int r5 = r5.length()
            if (r5 == 0) goto L_0x040a
            java.lang.String r0 = r1.name()
            r9 = r14
            r14 = r45
            if (r14 == 0) goto L_0x040d
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x043c
            goto L_0x040d
        L_0x040a:
            r9 = r14
            r14 = r45
        L_0x040d:
            r8 = r49
            r10 = r1
            r6 = r2
            r7 = r4
            goto L_0x042b
        L_0x0413:
            r9 = r14
            r14 = r45
            goto L_0x043c
        L_0x0417:
            r9 = r14
            r14 = r45
            r8 = r49
            r6 = r10
            r7 = r27
            r10 = r1
            goto L_0x042b
        L_0x0421:
            r9 = r14
            r14 = r45
            r8 = r49
            r6 = r10
            r10 = r16
            r7 = r27
        L_0x042b:
            if (r8 == 0) goto L_0x0431
            java.lang.String r0 = r8.translate(r0)
        L_0x0431:
            if (r14 == 0) goto L_0x0442
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x043c
            goto L_0x0442
        L_0x043c:
            r13 = r42
            r10 = r9
            r33 = r12
            goto L_0x0475
        L_0x0442:
            r4 = r42
            r5 = r0
            setAccessible(r11, r3, r4)
            r2 = r37
            setAccessible(r11, r2, r4)
            com.alibaba.fastjson.util.FieldInfo r1 = new com.alibaba.fastjson.util.FieldInfo
            r21 = 0
            r0 = r1
            r33 = r12
            r12 = r1
            r1 = r5
            r13 = r4
            r4 = r41
            r11 = r5
            r5 = r21
            r8 = r26
            r38 = r9
            r9 = r10
            r10 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = r38
            r10.put(r11, r12)
            goto L_0x0475
        L_0x046c:
            r13 = r42
            r10 = r14
            r15 = r34
            r33 = r35
            r14 = r45
        L_0x0475:
            r11 = r41
            r12 = r13
            r8 = r15
            r1 = r18
            r0 = r22
            r2 = r24
            r3 = r25
            r9 = r33
            r13 = r44
            r15 = r49
            goto L_0x0081
        L_0x0489:
            r15 = r8
            r13 = r12
            r19 = 0
            r23 = 1
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.length
            r0.<init>(r1)
            int r1 = r15.length
            r6 = 0
        L_0x0497:
            if (r6 >= r1) goto L_0x04be
            r2 = r15[r6]
            int r3 = r2.getModifiers()
            r3 = r3 & 8
            if (r3 != 0) goto L_0x04bb
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "this$0"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x04bb
            int r3 = r2.getModifiers()
            r3 = r3 & 1
            if (r3 == 0) goto L_0x04bb
            r0.add(r2)
        L_0x04bb:
            int r6 = r6 + 1
            goto L_0x0497
        L_0x04be:
            java.lang.Class r1 = r41.getSuperclass()
        L_0x04c2:
            if (r1 == 0) goto L_0x04ed
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L_0x04ed
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            int r3 = r2.length
            r6 = 0
        L_0x04ce:
            if (r6 >= r3) goto L_0x04e8
            r4 = r2[r6]
            int r5 = r4.getModifiers()
            r5 = r5 & 8
            if (r5 != 0) goto L_0x04e5
            int r5 = r4.getModifiers()
            r5 = r5 & 1
            if (r5 == 0) goto L_0x04e5
            r0.add(r4)
        L_0x04e5:
            int r6 = r6 + 1
            goto L_0x04ce
        L_0x04e8:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x04c2
        L_0x04ed:
            java.util.Iterator r11 = r0.iterator()
        L_0x04f1:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x057c
            java.lang.Object r0 = r11.next()
            r3 = r0
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            if (r47 == 0) goto L_0x050a
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r0 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r0 = r3.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONField r0 = (com.alibaba.fastjson.annotation.JSONField) r0
            r9 = r0
            goto L_0x050c
        L_0x050a:
            r9 = r16
        L_0x050c:
            java.lang.String r0 = r3.getName()
            if (r9 == 0) goto L_0x0535
            boolean r1 = r9.serialize()
            if (r1 == 0) goto L_0x04f1
            int r1 = r9.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r2 = r9.serialzeFeatures()
            int r2 = com.alibaba.fastjson.serializer.SerializerFeature.of(r2)
            java.lang.String r4 = r9.name()
            int r4 = r4.length()
            if (r4 == 0) goto L_0x0532
            java.lang.String r0 = r9.name()
        L_0x0532:
            r6 = r1
            r7 = r2
            goto L_0x0537
        L_0x0535:
            r6 = 0
            r7 = 0
        L_0x0537:
            if (r14 == 0) goto L_0x0541
            java.lang.Object r0 = r14.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x04f1
        L_0x0541:
            r12 = r49
            if (r12 == 0) goto L_0x0549
            java.lang.String r0 = r12.translate(r0)
        L_0x0549:
            r15 = r0
            boolean r0 = r10.containsKey(r15)
            if (r0 != 0) goto L_0x0574
            r8 = r41
            setAccessible(r8, r3, r13)
            com.alibaba.fastjson.util.FieldInfo r5 = new com.alibaba.fastjson.util.FieldInfo
            r2 = 0
            r17 = 0
            r18 = 0
            r0 = r5
            r1 = r15
            r4 = r41
            r39 = r5
            r5 = r17
            r8 = r18
            r43 = r11
            r11 = r10
            r10 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r39
            r11.put(r15, r0)
            goto L_0x0577
        L_0x0574:
            r43 = r11
            r11 = r10
        L_0x0577:
            r10 = r11
            r11 = r43
            goto L_0x04f1
        L_0x057c:
            r11 = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r44 == 0) goto L_0x05a2
            java.lang.String[] r1 = r44.orders()
            if (r1 == 0) goto L_0x05a4
            int r2 = r1.length
            int r3 = r11.size()
            if (r2 != r3) goto L_0x05a4
            int r2 = r1.length
            r6 = 0
        L_0x0593:
            if (r6 >= r2) goto L_0x05a0
            r3 = r1[r6]
            boolean r3 = r11.containsKey(r3)
            if (r3 == 0) goto L_0x05a4
            int r6 = r6 + 1
            goto L_0x0593
        L_0x05a0:
            r7 = 1
            goto L_0x05a5
        L_0x05a2:
            r1 = r16
        L_0x05a4:
            r7 = 0
        L_0x05a5:
            if (r7 == 0) goto L_0x05b9
            int r2 = r1.length
            r6 = 0
        L_0x05a9:
            if (r6 >= r2) goto L_0x05d6
            r3 = r1[r6]
            java.lang.Object r3 = r11.get(r3)
            com.alibaba.fastjson.util.FieldInfo r3 = (com.alibaba.fastjson.util.FieldInfo) r3
            r0.add(r3)
            int r6 = r6 + 1
            goto L_0x05a9
        L_0x05b9:
            java.util.Collection r1 = r11.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x05c1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05d1
            java.lang.Object r2 = r1.next()
            com.alibaba.fastjson.util.FieldInfo r2 = (com.alibaba.fastjson.util.FieldInfo) r2
            r0.add(r2)
            goto L_0x05c1
        L_0x05d1:
            if (r46 == 0) goto L_0x05d6
            java.util.Collections.sort(r0)
        L_0x05d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.util.TypeUtils.computeGetters(java.lang.Class, int, boolean, com.alibaba.fastjson.annotation.JSONType, java.util.Map, boolean, boolean, boolean, com.alibaba.fastjson.PropertyNamingStrategy):java.util.List");
    }

    public static JSONField getSupperMethodAnnotation(Class<?> cls, Method method) {
        boolean z;
        JSONField jSONField;
        boolean z2;
        JSONField jSONField2;
        for (Class methods : cls.getInterfaces()) {
            for (Method method2 : methods.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class[] parameterTypes = method2.getParameterTypes();
                    Class[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length == parameterTypes2.length) {
                        int i = 0;
                        while (true) {
                            if (i >= parameterTypes.length) {
                                z2 = true;
                                break;
                            } else if (!parameterTypes[i].equals(parameterTypes2[i])) {
                                z2 = false;
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (z2 && (jSONField2 = (JSONField) method2.getAnnotation(JSONField.class)) != null) {
                            return jSONField2;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= parameterTypes3.length) {
                            z = true;
                            break;
                        } else if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                            z = false;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z && (jSONField = (JSONField) method3.getAnnotation(JSONField.class)) != null) {
                        return jSONField;
                    }
                }
            }
        }
        return null;
    }

    private static boolean isJSONTypeIgnore(Class<?> cls, JSONType jSONType, String str) {
        if (!(jSONType == null || jSONType.ignores() == null)) {
            for (String equalsIgnoreCase : jSONType.ignores()) {
                if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !isJSONTypeIgnore(superclass, (JSONType) superclass.getAnnotation(JSONType.class), str)) ? false : true;
    }

    public static boolean isGenericParamType(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        if (!(type instanceof Class) || (genericSuperclass = ((Class) type).getGenericSuperclass()) == Object.class || !isGenericParamType(genericSuperclass)) {
            return false;
        }
        return true;
    }

    public static Type getGenericParamType(Type type) {
        while (type instanceof Class) {
            type = ((Class) type).getGenericSuperclass();
        }
        return type;
    }

    public static Class<?> getClass(Type type) {
        while (type.getClass() != Class.class) {
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            } else if (type instanceof TypeVariable) {
                return (Class) ((TypeVariable) type).getBounds()[0];
            } else {
                if (!(type instanceof WildcardType)) {
                    return Object.class;
                }
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                if (upperBounds.length != 1) {
                    return Object.class;
                }
                type = upperBounds[0];
            }
        }
        return (Class) type;
    }

    public static String decapitalize(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static boolean setAccessible(Class<?> cls, Member member, int i) {
        if (member != null && setAccessibleEnable) {
            Class<? super Object> superclass = cls.getSuperclass();
            if ((superclass == null || superclass == Object.class) && (member.getModifiers() & 1) != 0 && (i & 1) != 0) {
                return false;
            }
            try {
                ((AccessibleObject) member).setAccessible(true);
                return true;
            } catch (AccessControlException unused) {
                setAccessibleEnable = false;
            }
        }
        return false;
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr) {
        return getField(cls, str, fieldArr, (Map<Class<?>, Field[]>) null);
    }

    public static Field getField(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        Field field0 = getField0(cls, str, fieldArr, map);
        if (field0 == null) {
            field0 = getField0(cls, "_".concat(String.valueOf(str)), fieldArr, map);
        }
        if (field0 == null) {
            field0 = getField0(cls, "m_".concat(String.valueOf(str)), fieldArr, map);
        }
        if (field0 != null) {
            return field0;
        }
        StringBuilder sb = new StringBuilder("m");
        sb.append(str.substring(0, 1).toUpperCase());
        sb.append(str.substring(1));
        return getField0(cls, sb.toString(), fieldArr, map);
    }

    private static Field getField0(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        char charAt;
        char charAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name)) {
                return field;
            }
            if (str.length() > 2 && (charAt = str.charAt(0)) >= 'a' && charAt <= 'z' && (charAt2 = str.charAt(1)) >= 'A' && charAt2 <= 'Z' && str.equalsIgnoreCase(name)) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        Field[] fieldArr2 = null;
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        if (map != null) {
            fieldArr2 = map.get(superclass);
        }
        if (fieldArr2 == null) {
            fieldArr2 = superclass.getDeclaredFields();
            if (map != null) {
                map.put(superclass, fieldArr2);
            }
        }
        return getField(superclass, str, fieldArr2, map);
    }

    public static Type getCollectionItemType(Type type) {
        Type type2;
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                if (upperBounds.length == 1) {
                    type2 = upperBounds[0];
                }
            }
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (!cls.getName().startsWith("java.")) {
                    type2 = getCollectionItemType(cls.getGenericSuperclass());
                }
            }
            type2 = null;
        }
        return type2 == null ? Object.class : type2;
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return cls == Character.TYPE ? '0' : null;
    }

    public static boolean getArgument(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            ParameterizedType parameterizedType = typeArr[i];
            if (parameterizedType instanceof ParameterizedType) {
                ParameterizedType parameterizedType2 = parameterizedType;
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                if (getArgument(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new ParameterizedTypeImpl(actualTypeArguments, parameterizedType2.getOwnerType(), parameterizedType2.getRawType());
                    z = true;
                }
            } else if (parameterizedType instanceof TypeVariable) {
                for (int i2 = 0; i2 < typeVariableArr.length; i2++) {
                    if (parameterizedType.equals(typeVariableArr[i2])) {
                        typeArr[i] = typeArr2[i2];
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static long fnv_64_lower(String str) {
        long j = -3750763034362895579L;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(charAt == '_' || charAt == '-')) {
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                j = (j ^ ((long) charAt)) * 1099511628211L;
            }
        }
        return j;
    }

    public static void addMapping(String str, Class<?> cls) {
        mappings.put(str, cls);
    }

    public static Type checkPrimitiveArray(GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        String str = "[";
        while (genericComponentType instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) genericComponentType).getGenericComponentType();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str);
            str = sb.toString();
        }
        if (!(genericComponentType instanceof Class)) {
            return genericArrayType;
        }
        Class cls = (Class) genericComponentType;
        if (!cls.isPrimitive()) {
            return genericArrayType;
        }
        try {
            if (cls == Boolean.TYPE) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("Z");
                return Class.forName(sb2.toString());
            } else if (cls == Character.TYPE) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append("C");
                return Class.forName(sb3.toString());
            } else if (cls == Byte.TYPE) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(DiskFormatter.B);
                return Class.forName(sb4.toString());
            } else if (cls == Short.TYPE) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("S");
                return Class.forName(sb5.toString());
            } else if (cls == Integer.TYPE) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append("I");
                return Class.forName(sb6.toString());
            } else if (cls == Long.TYPE) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append("J");
                return Class.forName(sb7.toString());
            } else if (cls == Float.TYPE) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append("F");
                return Class.forName(sb8.toString());
            } else if (cls != Double.TYPE) {
                return genericArrayType;
            } else {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append("D");
                return Class.forName(sb9.toString());
            }
        } catch (ClassNotFoundException unused) {
            return genericArrayType;
        }
    }
}
