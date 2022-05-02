package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.PropertyNamingStrategy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaBeanSerializer implements ObjectSerializer {
    private static final char[] false_chars = {'f', 'a', 'l', 's', 'e'};
    private static final char[] true_chars = {'t', 'r', 'u', 'e'};
    protected int features;
    private final FieldSerializer[] getters;
    private final FieldSerializer[] sortedGetters;
    protected final String typeKey;
    protected final String typeName;

    public JavaBeanSerializer(Class<?> cls) {
        this(cls, (PropertyNamingStrategy) null);
    }

    public JavaBeanSerializer(Class<?> cls, PropertyNamingStrategy propertyNamingStrategy) {
        this(cls, cls.getModifiers(), (Map<String, String>) null, false, true, true, true, propertyNamingStrategy);
    }

    public JavaBeanSerializer(Class<?> cls, String... strArr) {
        this(cls, cls.getModifiers(), map(strArr), false, true, true, true, (PropertyNamingStrategy) null);
    }

    private static Map<String, String> map(String... strArr) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, str);
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r16v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        r5 = r3.naming();
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JavaBeanSerializer(java.lang.Class<?> r16, int r17, java.util.Map<java.lang.String, java.lang.String> r18, boolean r19, boolean r20, boolean r21, boolean r22, com.alibaba.fastjson.PropertyNamingStrategy r23) {
        /*
            r15 = this;
            r0 = r15
            r15.<init>()
            r1 = 0
            r0.features = r1
            r2 = 0
            if (r20 == 0) goto L_0x0015
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r3 = com.alibaba.fastjson.annotation.JSONType.class
            r13 = r16
            java.lang.annotation.Annotation r3 = r13.getAnnotation(r3)
            com.alibaba.fastjson.annotation.JSONType r3 = (com.alibaba.fastjson.annotation.JSONType) r3
            goto L_0x0018
        L_0x0015:
            r13 = r16
            r3 = r2
        L_0x0018:
            if (r3 == 0) goto L_0x008e
            com.alibaba.fastjson.serializer.SerializerFeature[] r4 = r3.serialzeFeatures()
            int r4 = com.alibaba.fastjson.serializer.SerializerFeature.of(r4)
            r0.features = r4
            java.lang.String r4 = r3.typeName()
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0031
            r4 = r2
            r6 = r4
            goto L_0x007f
        L_0x0031:
            java.lang.Class r5 = r16.getSuperclass()
            r6 = r2
        L_0x0036:
            if (r5 == 0) goto L_0x0055
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r5 == r7) goto L_0x0055
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r7 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            com.alibaba.fastjson.annotation.JSONType r7 = (com.alibaba.fastjson.annotation.JSONType) r7
            if (r7 == 0) goto L_0x0055
            java.lang.String r6 = r7.typeKey()
            int r7 = r6.length()
            if (r7 != 0) goto L_0x0055
            java.lang.Class r5 = r5.getSuperclass()
            goto L_0x0036
        L_0x0055:
            java.lang.Class[] r5 = r16.getInterfaces()
            int r7 = r5.length
            r8 = 0
        L_0x005b:
            if (r8 >= r7) goto L_0x0076
            r9 = r5[r8]
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r10 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r9 = r9.getAnnotation(r10)
            com.alibaba.fastjson.annotation.JSONType r9 = (com.alibaba.fastjson.annotation.JSONType) r9
            if (r9 == 0) goto L_0x0073
            java.lang.String r6 = r9.typeKey()
            int r9 = r6.length()
            if (r9 != 0) goto L_0x0076
        L_0x0073:
            int r8 = r8 + 1
            goto L_0x005b
        L_0x0076:
            if (r6 == 0) goto L_0x007f
            int r5 = r6.length()
            if (r5 != 0) goto L_0x007f
            r6 = r2
        L_0x007f:
            if (r23 != 0) goto L_0x008b
            com.alibaba.fastjson.PropertyNamingStrategy r5 = r3.naming()
            com.alibaba.fastjson.PropertyNamingStrategy r7 = com.alibaba.fastjson.PropertyNamingStrategy.CamelCase
            if (r5 == r7) goto L_0x008b
            r14 = r5
            goto L_0x0092
        L_0x008b:
            r14 = r23
            goto L_0x0092
        L_0x008e:
            r14 = r23
            r4 = r2
            r6 = r4
        L_0x0092:
            r0.typeName = r4
            r0.typeKey = r6
            r9 = 0
            r4 = r16
            r5 = r17
            r6 = r19
            r7 = r3
            r8 = r18
            r10 = r21
            r11 = r22
            r12 = r14
            java.util.List r4 = com.alibaba.fastjson.util.TypeUtils.computeGetters(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b2:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00c7
            java.lang.Object r6 = r4.next()
            com.alibaba.fastjson.util.FieldInfo r6 = (com.alibaba.fastjson.util.FieldInfo) r6
            com.alibaba.fastjson.serializer.FieldSerializer r7 = new com.alibaba.fastjson.serializer.FieldSerializer
            r7.<init>(r6)
            r5.add(r7)
            goto L_0x00b2
        L_0x00c7:
            int r4 = r5.size()
            com.alibaba.fastjson.serializer.FieldSerializer[] r4 = new com.alibaba.fastjson.serializer.FieldSerializer[r4]
            java.lang.Object[] r4 = r5.toArray(r4)
            com.alibaba.fastjson.serializer.FieldSerializer[] r4 = (com.alibaba.fastjson.serializer.FieldSerializer[]) r4
            r0.getters = r4
            if (r3 == 0) goto L_0x00db
            java.lang.String[] r2 = r3.orders()
        L_0x00db:
            if (r2 == 0) goto L_0x0120
            int r2 = r2.length
            if (r2 == 0) goto L_0x0120
            r9 = 1
            r4 = r16
            r5 = r17
            r6 = r19
            r7 = r3
            r8 = r18
            r10 = r21
            r11 = r22
            r12 = r14
            java.util.List r1 = com.alibaba.fastjson.util.TypeUtils.computeGetters(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00fc:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r1.next()
            com.alibaba.fastjson.util.FieldInfo r3 = (com.alibaba.fastjson.util.FieldInfo) r3
            com.alibaba.fastjson.serializer.FieldSerializer r4 = new com.alibaba.fastjson.serializer.FieldSerializer
            r4.<init>(r3)
            r2.add(r4)
            goto L_0x00fc
        L_0x0111:
            int r1 = r2.size()
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = new com.alibaba.fastjson.serializer.FieldSerializer[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = (com.alibaba.fastjson.serializer.FieldSerializer[]) r1
            r0.sortedGetters = r1
            return
        L_0x0120:
            com.alibaba.fastjson.serializer.FieldSerializer[] r2 = r0.getters
            int r3 = r2.length
            com.alibaba.fastjson.serializer.FieldSerializer[] r3 = new com.alibaba.fastjson.serializer.FieldSerializer[r3]
            int r4 = r2.length
            java.lang.System.arraycopy(r2, r1, r3, r1, r4)
            java.util.Arrays.sort(r3)
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r0.getters
            boolean r1 = java.util.Arrays.equals(r3, r1)
            if (r1 == 0) goto L_0x0139
            com.alibaba.fastjson.serializer.FieldSerializer[] r1 = r0.getters
            r0.sortedGetters = r1
            return
        L_0x0139:
            r0.sortedGetters = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.<init>(java.lang.Class, int, java.util.Map, boolean, boolean, boolean, boolean, com.alibaba.fastjson.PropertyNamingStrategy):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0148 A[SYNTHETIC, Splitter:B:105:0x0148] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x015d A[Catch:{ Exception -> 0x0626, all -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x015f A[Catch:{ Exception -> 0x0626, all -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0169 A[Catch:{ Exception -> 0x0626, all -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016b A[Catch:{ Exception -> 0x0626, all -> 0x0622 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x017e A[SYNTHETIC, Splitter:B:125:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x021f A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0261 A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0266 A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x03ff A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x042b A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x042f A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x043b A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x04d0 A[Catch:{ Exception -> 0x05b4, all -> 0x05ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x05c3  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x05e7 A[SYNTHETIC, Splitter:B:438:0x05e7] */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x05ff A[SYNTHETIC, Splitter:B:445:0x05ff] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0630 A[SYNTHETIC, Splitter:B:468:0x0630] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f7 A[Catch:{ Exception -> 0x00a5, all -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0123 A[SYNTHETIC, Splitter:B:93:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(com.alibaba.fastjson.serializer.JSONSerializer r36, java.lang.Object r37, java.lang.Object r38, java.lang.reflect.Type r39) throws java.io.IOException {
        /*
            r35 = this;
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            com.alibaba.fastjson.serializer.SerializeWriter r6 = r2.out
            if (r3 != 0) goto L_0x0012
            r6.writeNull()
            return
        L_0x0012:
            com.alibaba.fastjson.serializer.SerialContext r7 = r2.context
            if (r7 == 0) goto L_0x0021
            com.alibaba.fastjson.serializer.SerialContext r7 = r2.context
            int r7 = r7.features
            com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect
            int r8 = r8.mask
            r7 = r7 & r8
            if (r7 != 0) goto L_0x0031
        L_0x0021:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r7 = r2.references
            if (r7 == 0) goto L_0x0031
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r7 = r2.references
            boolean r7 = r7.containsKey(r3)
            if (r7 == 0) goto L_0x0031
            r36.writeReference(r37)
            return
        L_0x0031:
            int r7 = r6.features
            com.alibaba.fastjson.serializer.SerializerFeature r8 = com.alibaba.fastjson.serializer.SerializerFeature.SortField
            int r8 = r8.mask
            r7 = r7 & r8
            if (r7 == 0) goto L_0x003d
            com.alibaba.fastjson.serializer.FieldSerializer[] r7 = r1.sortedGetters
            goto L_0x003f
        L_0x003d:
            com.alibaba.fastjson.serializer.FieldSerializer[] r7 = r1.getters
        L_0x003f:
            com.alibaba.fastjson.serializer.SerialContext r8 = r2.context
            int r9 = r6.features
            com.alibaba.fastjson.serializer.SerializerFeature r10 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect
            int r10 = r10.mask
            r9 = r9 & r10
            if (r9 != 0) goto L_0x0065
            com.alibaba.fastjson.serializer.SerialContext r9 = new com.alibaba.fastjson.serializer.SerialContext
            int r10 = r1.features
            r9.<init>(r8, r3, r4, r10)
            r2.context = r9
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r9 = r2.references
            if (r9 != 0) goto L_0x005e
            java.util.IdentityHashMap r9 = new java.util.IdentityHashMap
            r9.<init>()
            r2.references = r9
        L_0x005e:
            java.util.IdentityHashMap<java.lang.Object, com.alibaba.fastjson.serializer.SerialContext> r9 = r2.references
            com.alibaba.fastjson.serializer.SerialContext r10 = r2.context
            r9.put(r3, r10)
        L_0x0065:
            int r9 = r1.features
            com.alibaba.fastjson.serializer.SerializerFeature r10 = com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray
            int r10 = r10.mask
            r9 = r9 & r10
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x007c
            int r9 = r6.features
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray
            int r12 = r12.mask
            r9 = r9 & r12
            if (r9 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r9 = 0
            goto L_0x007d
        L_0x007c:
            r9 = 1
        L_0x007d:
            if (r9 == 0) goto L_0x0082
            r12 = 91
            goto L_0x0084
        L_0x0082:
            r12 = 123(0x7b, float:1.72E-43)
        L_0x0084:
            if (r9 == 0) goto L_0x0089
            r13 = 93
            goto L_0x008b
        L_0x0089:
            r13 = 125(0x7d, float:1.75E-43)
        L_0x008b:
            int r14 = r6.count     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r14 = r14 + r11
            char[] r15 = r6.buf     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r15 = r15.length     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            if (r14 <= r15) goto L_0x00aa
            java.io.Writer r15 = r6.writer     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r15 != 0) goto L_0x009b
            r6.expandCapacity(r14)     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            goto L_0x00aa
        L_0x009b:
            r6.flush()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r14 = 1
            goto L_0x00aa
        L_0x00a0:
            r0 = move-exception
            r4 = r0
            r3 = r8
            goto L_0x064c
        L_0x00a5:
            r0 = move-exception
            r4 = r0
            r3 = r8
            goto L_0x0629
        L_0x00aa:
            char[] r15 = r6.buf     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r11 = r6.count     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r15[r11] = r12     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r6.count = r14     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r11 = r7.length     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            if (r11 <= 0) goto L_0x00c4
            int r11 = r6.features     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            int r12 = r12.mask     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r11 = r11 & r12
            if (r11 == 0) goto L_0x00c4
            r36.incrementIndent()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r36.println()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
        L_0x00c4:
            int r11 = r1.features     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r12 = r12.mask     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00ee
            int r11 = r6.features     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            int r12 = r12.mask     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r11 = r11 & r12
            if (r11 == 0) goto L_0x00ec
            if (r5 != 0) goto L_0x00ee
            int r11 = r6.features     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            com.alibaba.fastjson.serializer.SerializerFeature r12 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteRootClassName     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            int r12 = r12.mask     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r11 = r11 & r12
            if (r11 == 0) goto L_0x00ee
            com.alibaba.fastjson.serializer.SerialContext r11 = r2.context     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r11 == 0) goto L_0x00ec
            com.alibaba.fastjson.serializer.SerialContext r11 = r2.context     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            com.alibaba.fastjson.serializer.SerialContext r11 = r11.parent     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r11 == 0) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r11 = 0
            goto L_0x00ef
        L_0x00ee:
            r11 = 1
        L_0x00ef:
            if (r11 == 0) goto L_0x0116
            java.lang.Class r11 = r37.getClass()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r11 == r5) goto L_0x0116
            java.lang.String r5 = r1.typeKey     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = r1.typeKey     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            goto L_0x0102
        L_0x00fe:
            com.alibaba.fastjson.serializer.SerializeConfig r5 = r2.config     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            java.lang.String r5 = r5.typeKey     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
        L_0x0102:
            r6.writeFieldName(r5, r10)     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            java.lang.String r5 = r1.typeName     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r5 != 0) goto L_0x0111
            java.lang.Class r5 = r37.getClass()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
        L_0x0111:
            r2.write((java.lang.String) r5)     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r5 = 1
            goto L_0x0117
        L_0x0116:
            r5 = 0
        L_0x0117:
            r11 = 44
            if (r5 == 0) goto L_0x011e
            r5 = 44
            goto L_0x011f
        L_0x011e:
            r5 = 0
        L_0x011f:
            java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> r12 = r2.beforeFilters     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            if (r12 == 0) goto L_0x013a
            java.util.List<com.alibaba.fastjson.serializer.BeforeFilter> r12 = r2.beforeFilters     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
        L_0x0129:
            boolean r14 = r12.hasNext()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            if (r14 == 0) goto L_0x013a
            java.lang.Object r14 = r12.next()     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            com.alibaba.fastjson.serializer.BeforeFilter r14 = (com.alibaba.fastjson.serializer.BeforeFilter) r14     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            char r5 = r14.writeBefore(r2, r3, r5)     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            goto L_0x0129
        L_0x013a:
            if (r5 != r11) goto L_0x013e
            r5 = 1
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            int r12 = r6.features     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            com.alibaba.fastjson.serializer.SerializerFeature r14 = com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r14 = r14.mask     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r12 = r12 & r14
            if (r12 == 0) goto L_0x0153
            int r12 = r6.features     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            com.alibaba.fastjson.serializer.SerializerFeature r14 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            int r14 = r14.mask     // Catch:{ Exception -> 0x00a5, all -> 0x00a0 }
            r12 = r12 & r14
            if (r12 != 0) goto L_0x0153
            r12 = 1
            goto L_0x0154
        L_0x0153:
            r12 = 0
        L_0x0154:
            int r14 = r6.features     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            com.alibaba.fastjson.serializer.SerializerFeature r15 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r15 = r15.mask     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r14 = r14 & r15
            if (r14 == 0) goto L_0x015f
            r14 = 1
            goto L_0x0160
        L_0x015f:
            r14 = 0
        L_0x0160:
            int r15 = r6.features     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            com.alibaba.fastjson.serializer.SerializerFeature r11 = com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            int r11 = r11.mask     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r11 = r11 & r15
            if (r11 == 0) goto L_0x016b
            r11 = 1
            goto L_0x016c
        L_0x016b:
            r11 = 0
        L_0x016c:
            java.util.List<com.alibaba.fastjson.serializer.PropertyFilter> r15 = r2.propertyFilters     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            java.util.List<com.alibaba.fastjson.serializer.NameFilter> r10 = r2.nameFilters     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r16 = r5
            java.util.List<com.alibaba.fastjson.serializer.ValueFilter> r5 = r2.valueFilters     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            java.util.List<com.alibaba.fastjson.serializer.PropertyPreFilter> r4 = r2.propertyPreFilters     // Catch:{ Exception -> 0x0626, all -> 0x0622 }
            r17 = r8
            r18 = r13
            r8 = 0
        L_0x017b:
            int r13 = r7.length     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            if (r8 >= r13) goto L_0x05ba
            r13 = r7[r8]     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r19 = r7
            com.alibaba.fastjson.util.FieldInfo r7 = r13.fieldInfo     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r20 = r8
            java.lang.Class<?> r8 = r7.fieldClass     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r21 = r14
            java.lang.String r14 = r7.name     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r22 = r12
            int r12 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r23 = r11
            com.alibaba.fastjson.serializer.SerializerFeature r11 = com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r11 = r11.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r11 = r11 & r12
            if (r11 == 0) goto L_0x01a1
            java.lang.reflect.Field r11 = r7.field     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r11 == 0) goto L_0x01a1
            boolean r11 = r7.fieldTransient     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r11 != 0) goto L_0x058d
        L_0x01a1:
            java.lang.String r11 = r1.typeKey     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r11 == 0) goto L_0x01ad
            java.lang.String r11 = r1.typeKey     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            boolean r11 = r11.equals(r14)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r11 != 0) goto L_0x058d
        L_0x01ad:
            if (r4 == 0) goto L_0x01c7
            java.util.Iterator r11 = r4.iterator()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x01b3:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r12 == 0) goto L_0x01c7
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.PropertyPreFilter r12 = (com.alibaba.fastjson.serializer.PropertyPreFilter) r12     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            boolean r12 = r12.apply(r2, r3, r14)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r12 != 0) goto L_0x01b3
            r11 = 0
            goto L_0x01c8
        L_0x01c7:
            r11 = 1
        L_0x01c8:
            if (r11 == 0) goto L_0x058d
            r11 = 0
            r24 = 0
            boolean r12 = r7.fieldAccess     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r12 == 0) goto L_0x0210
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r12) goto L_0x01e5
            java.lang.reflect.Field r12 = r7.field     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r12 = r12.getInt(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r27 = r24
            r24 = 0
            r26 = 0
            r25 = r12
            r12 = 1
            goto L_0x021d
        L_0x01e5:
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r12) goto L_0x01f5
            java.lang.reflect.Field r12 = r7.field     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            long r24 = r12.getLong(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r27 = r24
            r12 = 1
            r24 = 0
            goto L_0x0219
        L_0x01f5:
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r12) goto L_0x0209
            java.lang.reflect.Field r12 = r7.field     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            boolean r12 = r12.getBoolean(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r26 = r12
            r27 = r24
            r12 = 1
            r24 = 0
            r25 = 0
            goto L_0x021d
        L_0x0209:
            java.lang.reflect.Field r11 = r7.field     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.lang.Object r11 = r11.get(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0214
        L_0x0210:
            java.lang.Object r11 = r13.getPropertyValue(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x0214:
            r27 = r24
            r12 = 0
            r24 = 1
        L_0x0219:
            r25 = 0
            r26 = 0
        L_0x021d:
            if (r15 == 0) goto L_0x0261
            if (r12 == 0) goto L_0x0240
            r29 = r4
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x022e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r25)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x022b:
            r24 = 1
            goto L_0x0242
        L_0x022e:
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x0237
            java.lang.Long r11 = java.lang.Long.valueOf(r27)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x022b
        L_0x0237:
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x0242
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r26)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x022b
        L_0x0240:
            r29 = r4
        L_0x0242:
            java.util.Iterator r4 = r15.iterator()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x0246:
            boolean r30 = r4.hasNext()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r30 == 0) goto L_0x0263
            java.lang.Object r30 = r4.next()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r31 = r4
            r4 = r30
            com.alibaba.fastjson.serializer.PropertyFilter r4 = (com.alibaba.fastjson.serializer.PropertyFilter) r4     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            boolean r4 = r4.apply(r3, r14, r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r4 != 0) goto L_0x025e
            r4 = 0
            goto L_0x0264
        L_0x025e:
            r4 = r31
            goto L_0x0246
        L_0x0261:
            r29 = r4
        L_0x0263:
            r4 = 1
        L_0x0264:
            if (r4 == 0) goto L_0x058f
            if (r10 == 0) goto L_0x02a8
            if (r12 == 0) goto L_0x028a
            if (r24 != 0) goto L_0x028a
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x0278
            java.lang.Integer r4 = java.lang.Integer.valueOf(r25)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x0274:
            r11 = r4
            r24 = 1
            goto L_0x028a
        L_0x0278:
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x0281
            java.lang.Long r4 = java.lang.Long.valueOf(r27)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0274
        L_0x0281:
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x028a
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r26)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0274
        L_0x028a:
            java.util.Iterator r4 = r10.iterator()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r30 = r10
            r10 = r14
        L_0x0291:
            boolean r31 = r4.hasNext()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r31 == 0) goto L_0x02ab
            java.lang.Object r31 = r4.next()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r32 = r4
            r4 = r31
            com.alibaba.fastjson.serializer.NameFilter r4 = (com.alibaba.fastjson.serializer.NameFilter) r4     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.lang.String r10 = r4.process(r3, r10, r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r4 = r32
            goto L_0x0291
        L_0x02a8:
            r30 = r10
            r10 = r14
        L_0x02ab:
            if (r5 == 0) goto L_0x02ef
            if (r12 == 0) goto L_0x02ce
            if (r24 != 0) goto L_0x02ce
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x02bc
            java.lang.Integer r11 = java.lang.Integer.valueOf(r25)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x02b9:
            r24 = 1
            goto L_0x02ce
        L_0x02bc:
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x02c5
            java.lang.Long r11 = java.lang.Long.valueOf(r27)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x02b9
        L_0x02c5:
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r4) goto L_0x02ce
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r26)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x02b9
        L_0x02ce:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r31 = r5
            r5 = r11
        L_0x02d5:
            boolean r32 = r4.hasNext()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r32 == 0) goto L_0x02ec
            java.lang.Object r32 = r4.next()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r33 = r4
            r4 = r32
            com.alibaba.fastjson.serializer.ValueFilter r4 = (com.alibaba.fastjson.serializer.ValueFilter) r4     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.lang.Object r5 = r4.process(r3, r14, r5)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r4 = r33
            goto L_0x02d5
        L_0x02ec:
            r4 = r11
            r11 = r5
            goto L_0x02f2
        L_0x02ef:
            r31 = r5
            r4 = r11
        L_0x02f2:
            java.lang.String r5 = ""
            if (r24 == 0) goto L_0x03b9
            if (r11 != 0) goto L_0x03b9
            r32 = r11
            int r11 = r7.serialzeFeatures     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r33 = r15
            int r15 = r1.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r11 = r11 | r15
            int r15 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r11 = r11 | r15
            java.lang.Class<java.lang.Boolean> r15 = java.lang.Boolean.class
            if (r8 != r15) goto L_0x032e
            com.alibaba.fastjson.serializer.SerializerFeature r15 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullBooleanAsFalse     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r15 = r15.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r3.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 | r15
            if (r9 != 0) goto L_0x031f
            r34 = r11 & r3
            if (r34 != 0) goto L_0x031f
            r34 = r7
            int r7 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r7
            if (r3 == 0) goto L_0x0595
            goto L_0x0321
        L_0x031f:
            r34 = r7
        L_0x0321:
            r3 = r11 & r15
            if (r3 != 0) goto L_0x032a
            int r3 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r15
            if (r3 == 0) goto L_0x03bf
        L_0x032a:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x03c1
        L_0x032e:
            r34 = r7
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r8 != r3) goto L_0x0354
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r3.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = r7 | r3
            if (r9 != 0) goto L_0x0348
            r15 = r11 & r7
            if (r15 != 0) goto L_0x0348
            int r15 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = r7 & r15
            if (r7 == 0) goto L_0x0595
        L_0x0348:
            r7 = r11 & r3
            if (r7 != 0) goto L_0x0351
            int r7 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r7
            if (r3 == 0) goto L_0x03bf
        L_0x0351:
            r11 = r5
            goto L_0x03c1
        L_0x0354:
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            boolean r3 = r3.isAssignableFrom(r8)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x037f
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r3.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = r7 | r3
            if (r9 != 0) goto L_0x0370
            r15 = r11 & r7
            if (r15 != 0) goto L_0x0370
            int r15 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = r7 & r15
            if (r7 == 0) goto L_0x0595
        L_0x0370:
            r7 = r11 & r3
            if (r7 != 0) goto L_0x0379
            int r7 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r7
            if (r3 == 0) goto L_0x03bf
        L_0x0379:
            r3 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x03c1
        L_0x037f:
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r8)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x03aa
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r3.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = r7 | r3
            if (r9 != 0) goto L_0x039b
            r15 = r11 & r7
            if (r15 != 0) goto L_0x039b
            int r15 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = r7 & r15
            if (r7 == 0) goto L_0x0595
        L_0x039b:
            r7 = r11 & r3
            if (r7 != 0) goto L_0x03a4
            int r7 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r7
            if (r3 == 0) goto L_0x03bf
        L_0x03a4:
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r11 = r3
            goto L_0x03c1
        L_0x03aa:
            if (r9 != 0) goto L_0x03bf
            boolean r3 = r13.writeNull     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 != 0) goto L_0x03bf
            com.alibaba.fastjson.serializer.SerializerFeature r3 = com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            boolean r3 = r6.isEnabled(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x0595
            goto L_0x03bf
        L_0x03b9:
            r34 = r7
            r32 = r11
            r33 = r15
        L_0x03bf:
            r11 = r32
        L_0x03c1:
            if (r24 == 0) goto L_0x03fd
            if (r11 == 0) goto L_0x03fd
            if (r23 == 0) goto L_0x03fd
            java.lang.Class r3 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 == r3) goto L_0x03df
            java.lang.Class r3 = java.lang.Short.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 == r3) goto L_0x03df
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 == r3) goto L_0x03df
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 == r3) goto L_0x03df
            java.lang.Class r3 = java.lang.Float.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 == r3) goto L_0x03df
            java.lang.Class r3 = java.lang.Double.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r3) goto L_0x03ec
        L_0x03df:
            boolean r3 = r11 instanceof java.lang.Number     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x03ec
            r3 = r11
            java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            byte r3 = r3.byteValue()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x0595
        L_0x03ec:
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r3) goto L_0x03fd
            boolean r3 = r11 instanceof java.lang.Boolean     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x03fd
            r3 = r11
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x0595
        L_0x03fd:
            if (r16 == 0) goto L_0x042b
            int r3 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = 1
            int r3 = r3 + r7
            char[] r7 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 <= r7) goto L_0x0414
            java.io.Writer r7 = r6.writer     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r7 != 0) goto L_0x0410
            r6.expandCapacity(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0414
        L_0x0410:
            r6.flush()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = 1
        L_0x0414:
            char[] r7 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r15 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r32 = 44
            r7[r15] = r32     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r6.count = r3     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r7
            if (r3 == 0) goto L_0x042d
            r36.println()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x042d
        L_0x042b:
            r32 = 44
        L_0x042d:
            if (r10 == r14) goto L_0x043b
            if (r9 != 0) goto L_0x0435
            r3 = 1
            r6.writeFieldName(r10, r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x0435:
            r2.write((java.lang.Object) r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x0438:
            r4 = 0
            goto L_0x058a
        L_0x043b:
            if (r4 == r11) goto L_0x0446
            if (r9 != 0) goto L_0x0442
            r13.writePrefix(r2)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x0442:
            r2.write((java.lang.Object) r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x0446:
            if (r9 != 0) goto L_0x048b
            if (r22 == 0) goto L_0x0488
            char[] r3 = r13.name_chars     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r3.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7 + r4
            char[] r10 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r10 = r10.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r7 <= r10) goto L_0x047d
            java.io.Writer r10 = r6.writer     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r10 != 0) goto L_0x045d
            r6.expandCapacity(r7)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x047d
        L_0x045d:
            r7 = 0
        L_0x045e:
            char[] r10 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r10 = r10.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r14 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r10 = r10 - r14
            char[] r14 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r15 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.lang.System.arraycopy(r3, r7, r14, r15, r10)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            char[] r14 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r14 = r14.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r6.count = r14     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r6.flush()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r4 - r10
            int r7 = r7 + r10
            char[] r10 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r10 = r10.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r4 > r10) goto L_0x045e
            r10 = r7
            r7 = r4
            goto L_0x047e
        L_0x047d:
            r10 = 0
        L_0x047e:
            char[] r14 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r15 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.lang.System.arraycopy(r3, r10, r14, r15, r4)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r6.count = r7     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x048b
        L_0x0488:
            r13.writePrefix(r2)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x048b:
            if (r12 == 0) goto L_0x050a
            if (r24 != 0) goto L_0x050a
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r3) goto L_0x04dd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r25
            if (r12 != r3) goto L_0x049f
            java.lang.String r3 = "-2147483648"
            r6.write(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x049f:
            if (r12 >= 0) goto L_0x04a3
            int r3 = -r12
            goto L_0x04a4
        L_0x04a3:
            r3 = r12
        L_0x04a4:
            r4 = 0
        L_0x04a5:
            int[] r5 = com.alibaba.fastjson.serializer.SerializeWriter.sizeTable     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r5 = r5[r4]     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 > r5) goto L_0x04da
            int r4 = r4 + 1
            if (r12 >= 0) goto L_0x04b1
            int r4 = r4 + 1
        L_0x04b1:
            int r3 = r6.count     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r3 + r4
            char[] r5 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r5 = r5.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 <= r5) goto L_0x04cd
            java.io.Writer r5 = r6.writer     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r5 != 0) goto L_0x04c1
            r6.expandCapacity(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x04cd
        L_0x04c1:
            char[] r5 = new char[r4]     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            long r7 = (long) r12     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializeWriter.getChars(r7, r4, r5)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = 0
            r6.write(r5, r7, r4)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r4 = 1
            goto L_0x04ce
        L_0x04cd:
            r4 = 0
        L_0x04ce:
            if (r4 != 0) goto L_0x0438
            long r4 = (long) r12     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            char[] r7 = r6.buf     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializeWriter.getChars(r4, r3, r7)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r6.count = r3     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x04da:
            int r4 = r4 + 1
            goto L_0x04a5
        L_0x04dd:
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r3) goto L_0x04ea
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r4 = r27
            r3.writeLong(r4)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x04ea:
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r8 != r3) goto L_0x0438
            if (r26 == 0) goto L_0x04fd
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            char[] r4 = true_chars     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            char[] r5 = true_chars     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r5 = r5.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = 0
            r3.write(r4, r7, r5)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x04fd:
            com.alibaba.fastjson.serializer.SerializeWriter r3 = r2.out     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            char[] r4 = false_chars     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            char[] r5 = false_chars     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r5 = r5.length     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r7 = 0
            r3.write(r4, r7, r5)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x050a:
            if (r9 != 0) goto L_0x0586
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r8 != r3) goto L_0x0542
            int r3 = r13.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r1.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 | r4
            if (r11 != 0) goto L_0x0532
            int r4 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r7 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r7 = r7.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r4 = r4 & r7
            if (r4 != 0) goto L_0x052d
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r4.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0528
            goto L_0x052d
        L_0x0528:
            r6.writeNull()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x052d:
            r6.writeString(r5)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x0532:
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r21 == 0) goto L_0x053b
            r6.writeStringWithSingleQuote(r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x053b:
            r3 = 0
            r4 = 1
            r6.writeStringWithDoubleQuote(r11, r3, r4)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x0542:
            r3 = r34
            boolean r3 = r3.isEnum     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r3 == 0) goto L_0x0581
            if (r11 == 0) goto L_0x057c
            int r3 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r4.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0571
            java.lang.Enum r11 = (java.lang.Enum) r11     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.lang.String r3 = r11.toString()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r5 = com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r5 = r5.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0564
            r4 = 1
            goto L_0x0565
        L_0x0564:
            r4 = 0
        L_0x0565:
            if (r4 == 0) goto L_0x056c
            r6.writeStringWithSingleQuote(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x0438
        L_0x056c:
            r4 = 0
            r6.writeStringWithDoubleQuote(r3, r4, r4)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x058a
        L_0x0571:
            r4 = 0
            java.lang.Enum r11 = (java.lang.Enum) r11     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r3 = r11.ordinal()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r6.writeInt(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x058a
        L_0x057c:
            r4 = 0
            r6.writeNull()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x058a
        L_0x0581:
            r4 = 0
            r13.writeValue(r2, r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x058a
        L_0x0586:
            r4 = 0
            r13.writeValue(r2, r11)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x058a:
            r16 = 1
            goto L_0x0598
        L_0x058d:
            r29 = r4
        L_0x058f:
            r31 = r5
            r30 = r10
            r33 = r15
        L_0x0595:
            r4 = 0
            r32 = 44
        L_0x0598:
            int r8 = r20 + 1
            r3 = r37
            r7 = r19
            r14 = r21
            r12 = r22
            r11 = r23
            r4 = r29
            r10 = r30
            r5 = r31
            r15 = r33
            goto L_0x017b
        L_0x05ae:
            r0 = move-exception
            r4 = r0
            r3 = r17
            goto L_0x064c
        L_0x05b4:
            r0 = move-exception
            r4 = r0
            r3 = r17
            goto L_0x0629
        L_0x05ba:
            r19 = r7
            r4 = 0
            r32 = 44
            java.util.List<com.alibaba.fastjson.serializer.AfterFilter> r3 = r2.afterFilters     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            if (r3 == 0) goto L_0x05e2
            if (r16 == 0) goto L_0x05c8
            r10 = 44
            goto L_0x05c9
        L_0x05c8:
            r10 = 0
        L_0x05c9:
            java.util.List<com.alibaba.fastjson.serializer.AfterFilter> r3 = r2.afterFilters     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x05cf:
            boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r4 == 0) goto L_0x05e2
            java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.AfterFilter r4 = (com.alibaba.fastjson.serializer.AfterFilter) r4     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r5 = r37
            char r10 = r4.writeAfter(r2, r5, r10)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x05cf
        L_0x05e2:
            r7 = r19
            int r3 = r7.length     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            if (r3 <= 0) goto L_0x05f6
            int r3 = r6.features     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            com.alibaba.fastjson.serializer.SerializerFeature r4 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            int r4 = r4.mask     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r3 = r3 & r4
            if (r3 == 0) goto L_0x05f6
            r36.decrementIdent()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r36.println()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
        L_0x05f6:
            int r3 = r6.count     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            r4 = 1
            int r3 = r3 + r4
            char[] r5 = r6.buf     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            int r5 = r5.length     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            if (r3 <= r5) goto L_0x060c
            java.io.Writer r5 = r6.writer     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            if (r5 != 0) goto L_0x0607
            r6.expandCapacity(r3)     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            goto L_0x060c
        L_0x0607:
            r6.flush()     // Catch:{ Exception -> 0x05b4, all -> 0x05ae }
            r11 = 1
            goto L_0x060d
        L_0x060c:
            r11 = r3
        L_0x060d:
            char[] r3 = r6.buf     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            int r4 = r6.count     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            r3[r4] = r18     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            r6.count = r11     // Catch:{ Exception -> 0x061e, all -> 0x061a }
            r3 = r17
            r2.context = r3
            return
        L_0x061a:
            r0 = move-exception
            r3 = r17
            goto L_0x0624
        L_0x061e:
            r0 = move-exception
            r3 = r17
            goto L_0x0628
        L_0x0622:
            r0 = move-exception
            r3 = r8
        L_0x0624:
            r4 = r0
            goto L_0x064c
        L_0x0626:
            r0 = move-exception
            r3 = r8
        L_0x0628:
            r4 = r0
        L_0x0629:
            java.lang.String r5 = "write javaBean error, fastjson version 1.1.70"
            r6 = r38
            if (r6 == 0) goto L_0x0644
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x064a }
            r7.<init>()     // Catch:{ all -> 0x064a }
            r7.append(r5)     // Catch:{ all -> 0x064a }
            java.lang.String r5 = ", fieldName : "
            r7.append(r5)     // Catch:{ all -> 0x064a }
            r7.append(r6)     // Catch:{ all -> 0x064a }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x064a }
        L_0x0644:
            com.alibaba.fastjson.JSONException r6 = new com.alibaba.fastjson.JSONException     // Catch:{ all -> 0x064a }
            r6.<init>(r5, r4)     // Catch:{ all -> 0x064a }
            throw r6     // Catch:{ all -> 0x064a }
        L_0x064a:
            r0 = move-exception
            goto L_0x0624
        L_0x064c:
            r2.context = r3
            goto L_0x0650
        L_0x064f:
            throw r4
        L_0x0650:
            goto L_0x064f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.JavaBeanSerializer.write(com.alibaba.fastjson.serializer.JSONSerializer, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }

    public Map<String, Object> getFieldValuesMap(Object obj) throws Exception {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.sortedGetters.length);
        for (FieldSerializer fieldSerializer : this.sortedGetters) {
            linkedHashMap.put(fieldSerializer.fieldInfo.name, fieldSerializer.getPropertyValue(obj));
        }
        return linkedHashMap;
    }
}
