package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

class JavaBeanInfo {
    final Constructor<?> creatorConstructor;
    public final String[] creatorConstructorParameters;
    final Constructor<?> defaultConstructor;
    final int defaultConstructorParameterSize;
    final Method factoryMethod;
    final FieldInfo[] fields;
    final JSONType jsonType;
    boolean ordered = false;
    public final int parserFeatures;
    final FieldInfo[] sortedFields;
    final boolean supportBeanToArray;
    public final String typeKey;
    public final String typeName;

    JavaBeanInfo(Class<?> cls, Constructor<?> constructor, Constructor<?> constructor2, Method method, FieldInfo[] fieldInfoArr, FieldInfo[] fieldInfoArr2, JSONType jSONType, String[] strArr) {
        int i;
        boolean z;
        int i2 = 0;
        this.defaultConstructor = constructor;
        this.creatorConstructor = constructor2;
        this.factoryMethod = method;
        this.fields = fieldInfoArr;
        this.jsonType = jSONType;
        String str = null;
        if (strArr == null || strArr.length != fieldInfoArr.length) {
            this.creatorConstructorParameters = strArr;
        } else {
            this.creatorConstructorParameters = null;
        }
        if (jSONType != null) {
            String typeName2 = jSONType.typeName();
            this.typeName = typeName2.length() <= 0 ? cls.getName() : typeName2;
            String typeKey2 = jSONType.typeKey();
            this.typeKey = typeKey2.length() > 0 ? typeKey2 : str;
            i = 0;
            for (Feature feature : jSONType.parseFeatures()) {
                i |= feature.mask;
            }
        } else {
            this.typeName = cls.getName();
            this.typeKey = null;
            i = 0;
        }
        this.parserFeatures = i;
        if (jSONType != null) {
            z = false;
            for (Feature feature2 : jSONType.parseFeatures()) {
                if (feature2 == Feature.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.supportBeanToArray = z;
        FieldInfo[] computeSortedFields = computeSortedFields(fieldInfoArr, fieldInfoArr2);
        this.sortedFields = !Arrays.equals(fieldInfoArr, computeSortedFields) ? computeSortedFields : fieldInfoArr;
        if (constructor != null) {
            i2 = constructor.getParameterTypes().length;
        } else if (method != null) {
            i2 = method.getParameterTypes().length;
        }
        this.defaultConstructorParameterSize = i2;
    }

    private FieldInfo[] computeSortedFields(FieldInfo[] fieldInfoArr, FieldInfo[] fieldInfoArr2) {
        String[] orders;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        JSONType jSONType = this.jsonType;
        if (!(jSONType == null || (orders = jSONType.orders()) == null || orders.length == 0)) {
            int i = 0;
            while (true) {
                if (i >= orders.length) {
                    z = true;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= fieldInfoArr2.length) {
                        z4 = false;
                        break;
                    } else if (fieldInfoArr2[i2].name.equals(orders[i])) {
                        z4 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z4) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                return fieldInfoArr2;
            }
            if (orders.length == fieldInfoArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= orders.length) {
                        z3 = true;
                        break;
                    } else if (!fieldInfoArr2[i3].name.equals(orders[i3])) {
                        z3 = false;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z3) {
                    return fieldInfoArr2;
                }
                FieldInfo[] fieldInfoArr3 = new FieldInfo[fieldInfoArr2.length];
                for (int i4 = 0; i4 < orders.length; i4++) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= fieldInfoArr2.length) {
                            break;
                        } else if (fieldInfoArr2[i5].name.equals(orders[i4])) {
                            fieldInfoArr3[i4] = fieldInfoArr2[i5];
                            break;
                        } else {
                            i5++;
                        }
                    }
                }
                this.ordered = true;
                return fieldInfoArr3;
            }
            int length = fieldInfoArr2.length;
            FieldInfo[] fieldInfoArr4 = new FieldInfo[length];
            for (int i6 = 0; i6 < orders.length; i6++) {
                int i7 = 0;
                while (true) {
                    if (i7 >= fieldInfoArr2.length) {
                        break;
                    } else if (fieldInfoArr2[i7].name.equals(orders[i6])) {
                        fieldInfoArr4[i6] = fieldInfoArr2[i7];
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            int length2 = orders.length;
            for (int i8 = 0; i8 < fieldInfoArr2.length; i8++) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length || i9 >= length2) {
                        z2 = false;
                    } else if (fieldInfoArr4[i8].equals(fieldInfoArr2[i9])) {
                        z2 = true;
                        break;
                    } else {
                        i9++;
                    }
                }
                z2 = false;
                if (!z2) {
                    fieldInfoArr4[length2] = fieldInfoArr2[i8];
                    length2++;
                }
            }
            this.ordered = true;
        }
        return fieldInfoArr2;
    }

    static boolean addField(List<FieldInfo> list, FieldInfo fieldInfo, boolean z) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FieldInfo fieldInfo2 = list.get(i);
                if (fieldInfo2.name.equals(fieldInfo.name) && (!fieldInfo2.getOnly || fieldInfo.getOnly)) {
                    return false;
                }
            }
        }
        list.add(fieldInfo);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: java.lang.Class<? super java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: java.lang.annotation.Annotation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v53, resolved type: java.lang.Class<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.Class<? super java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r1v66, types: [java.lang.annotation.Annotation] */
    /* JADX WARNING: type inference failed for: r0v48, types: [java.lang.reflect.Type[]] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.lang.reflect.Type[]] */
    /* JADX WARNING: type inference failed for: r0v73, types: [java.lang.reflect.Type[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x077f, code lost:
        if (r1.length() > 0) goto L_0x079e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0542  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x05b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.fastjson.parser.JavaBeanInfo build(java.lang.Class<?> r35, int r36, java.lang.reflect.Type r37, boolean r38, boolean r39, boolean r40, boolean r41, com.alibaba.fastjson.PropertyNamingStrategy r42) {
        /*
            r11 = r35
            r12 = r36
            r13 = r38
            r14 = r42
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.reflect.Constructor[] r0 = r35.getDeclaredConstructors()
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.isKotlin(r35)
            r2 = r12 & 1024(0x400, float:1.435E-42)
            r16 = 0
            r9 = 1
            r8 = 0
            if (r2 != 0) goto L_0x0063
            int r3 = r0.length
            if (r3 == r9) goto L_0x0027
            if (r1 != 0) goto L_0x0063
        L_0x0027:
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x002e }
            java.lang.reflect.Constructor r3 = r11.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x002e }
            goto L_0x0030
        L_0x002e:
            r3 = r16
        L_0x0030:
            if (r3 != 0) goto L_0x005e
            boolean r4 = r35.isMemberClass()
            if (r4 == 0) goto L_0x005e
            r4 = r12 & 8
            if (r4 != 0) goto L_0x005e
            int r4 = r0.length
            r5 = 0
        L_0x003e:
            if (r5 >= r4) goto L_0x005e
            r6 = r0[r5]
            java.lang.Class[] r7 = r6.getParameterTypes()
            r17 = r3
            int r3 = r7.length
            if (r3 != r9) goto L_0x0059
            r3 = r7[r8]
            java.lang.Class r7 = r35.getDeclaringClass()
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0059
            r7 = r6
            goto L_0x0065
        L_0x0059:
            int r5 = r5 + 1
            r3 = r17
            goto L_0x003e
        L_0x005e:
            r17 = r3
            r7 = r17
            goto L_0x0065
        L_0x0063:
            r7 = r16
        L_0x0065:
            if (r13 == 0) goto L_0x006c
            r8 = r16
            r9 = r8
            goto L_0x00d4
        L_0x006c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r11
            r5 = r16
        L_0x0074:
            if (r4 == 0) goto L_0x00c9
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r4 == r6) goto L_0x00c9
            java.lang.reflect.Method[] r6 = r4.getDeclaredMethods()
            int r9 = r6.length
        L_0x007f:
            if (r8 >= r9) goto L_0x00c0
            r19 = r9
            r9 = r6[r8]
            r20 = r6
            int r6 = r9.getModifiers()
            r21 = r6 & 8
            if (r21 == 0) goto L_0x00a3
            java.lang.Class<com.alibaba.fastjson.annotation.JSONCreator> r6 = com.alibaba.fastjson.annotation.JSONCreator.class
            boolean r6 = r9.isAnnotationPresent(r6)
            if (r6 == 0) goto L_0x00b5
            if (r5 != 0) goto L_0x009b
            r5 = r9
            goto L_0x00b9
        L_0x009b:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "multi-json creator"
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r21 = r6 & 2
            if (r21 != 0) goto L_0x00b5
            r21 = r5
            r5 = r6 & 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L_0x00b7
            r5 = r6 & 4
            if (r5 != 0) goto L_0x00b7
            r3.add(r9)
            goto L_0x00b7
        L_0x00b5:
            r21 = r5
        L_0x00b7:
            r5 = r21
        L_0x00b9:
            int r8 = r8 + 1
            r9 = r19
            r6 = r20
            goto L_0x007f
        L_0x00c0:
            r21 = r5
            java.lang.Class r4 = r4.getSuperclass()
            r8 = 0
            r9 = 1
            goto L_0x0074
        L_0x00c9:
            int r4 = r3.size()
            java.lang.reflect.Method[] r4 = new java.lang.reflect.Method[r4]
            r3.toArray(r4)
            r8 = r4
            r9 = r5
        L_0x00d4:
            java.lang.reflect.Field[] r6 = r35.getDeclaredFields()
            boolean r3 = r35.isInterface()
            if (r3 != 0) goto L_0x00e3
            if (r2 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r2 = 0
            goto L_0x00e4
        L_0x00e3:
            r2 = 1
        L_0x00e4:
            if (r7 == 0) goto L_0x00f4
            if (r2 == 0) goto L_0x00e9
            goto L_0x00f4
        L_0x00e9:
            r28 = r8
            r14 = r10
            r18 = r16
            r21 = r18
            r8 = 0
            r10 = r6
            goto L_0x03c3
        L_0x00f4:
            int r3 = r0.length
            r4 = 0
        L_0x00f6:
            if (r4 >= r3) goto L_0x010c
            r5 = r0[r4]
            r19 = r3
            java.lang.Class<com.alibaba.fastjson.annotation.JSONCreator> r3 = com.alibaba.fastjson.annotation.JSONCreator.class
            java.lang.annotation.Annotation r3 = r5.getAnnotation(r3)
            com.alibaba.fastjson.annotation.JSONCreator r3 = (com.alibaba.fastjson.annotation.JSONCreator) r3
            if (r3 == 0) goto L_0x0107
            goto L_0x010e
        L_0x0107:
            int r4 = r4 + 1
            r3 = r19
            goto L_0x00f6
        L_0x010c:
            r5 = r16
        L_0x010e:
            java.lang.String r4 = "illegal json creator"
            if (r5 == 0) goto L_0x01e4
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r5, r12)
            java.lang.Class[] r3 = r5.getParameterTypes()
            if (r41 == 0) goto L_0x0122
            java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
            r19 = r0
            goto L_0x0124
        L_0x0122:
            r19 = r3
        L_0x0124:
            java.lang.annotation.Annotation[][] r20 = r5.getParameterAnnotations()
            r2 = 0
        L_0x0129:
            int r0 = r3.length
            if (r2 >= r0) goto L_0x01ab
            r0 = r20[r2]
            int r1 = r0.length
            r21 = r4
            r4 = 0
        L_0x0132:
            if (r4 >= r1) goto L_0x0148
            r22 = r1
            r1 = r0[r4]
            r23 = r0
            boolean r0 = r1 instanceof com.alibaba.fastjson.annotation.JSONField
            if (r0 == 0) goto L_0x0141
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            goto L_0x014a
        L_0x0141:
            int r4 = r4 + 1
            r1 = r22
            r0 = r23
            goto L_0x0132
        L_0x0148:
            r1 = r16
        L_0x014a:
            if (r1 == 0) goto L_0x01a3
            r4 = r3[r2]
            r22 = r19[r2]
            java.lang.String r0 = r1.name()
            java.lang.reflect.Field r0 = com.alibaba.fastjson.util.TypeUtils.getField(r11, r0, r6, r10)
            if (r0 == 0) goto L_0x015d
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r0, r12)
        L_0x015d:
            int r23 = r1.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r24 = r1.serialzeFeatures()
            int r24 = com.alibaba.fastjson.serializer.SerializerFeature.of(r24)
            com.alibaba.fastjson.util.FieldInfo r14 = new com.alibaba.fastjson.util.FieldInfo
            java.lang.String r1 = r1.name()
            r25 = r0
            r0 = r14
            r26 = r2
            r2 = r35
            r27 = r3
            r3 = r4
            r28 = r8
            r8 = r21
            r4 = r22
            r21 = r5
            r5 = r25
            r22 = r10
            r10 = r6
            r6 = r23
            r29 = r7
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            addField(r15, r14, r13)
            int r2 = r26 + 1
            r14 = r42
            r4 = r8
            r6 = r10
            r5 = r21
            r10 = r22
            r3 = r27
            r8 = r28
            r7 = r29
            goto L_0x0129
        L_0x01a3:
            r8 = r21
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r8)
            throw r0
        L_0x01ab:
            r21 = r5
            r29 = r7
            r28 = r8
            r22 = r10
            r10 = r6
            int r0 = r15.size()
            com.alibaba.fastjson.util.FieldInfo[] r1 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r15.toArray(r1)
            com.alibaba.fastjson.util.FieldInfo[] r2 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            java.util.Arrays.sort(r2)
            if (r39 == 0) goto L_0x01cd
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r2 = com.alibaba.fastjson.annotation.JSONType.class
            r11.getAnnotation(r2)
        L_0x01cd:
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
        L_0x01d0:
            if (r3 >= r0) goto L_0x01db
            r4 = r1[r3]
            java.lang.String r4 = r4.name
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x01d0
        L_0x01db:
            r18 = r2
            r14 = r22
            r7 = r29
            r8 = 0
            goto L_0x03c3
        L_0x01e4:
            r21 = r5
            r29 = r7
            r28 = r8
            r22 = r10
            r8 = r4
            r10 = r6
            if (r9 == 0) goto L_0x02a4
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r9, r12)
            java.lang.Class[] r14 = r9.getParameterTypes()
            int r0 = r14.length
            if (r0 <= 0) goto L_0x02a0
            if (r41 == 0) goto L_0x0202
            java.lang.reflect.Type[] r0 = r9.getGenericParameterTypes()
            r12 = r0
            goto L_0x0203
        L_0x0202:
            r12 = r14
        L_0x0203:
            java.lang.annotation.Annotation[][] r17 = r9.getParameterAnnotations()
            r7 = 0
        L_0x0208:
            int r0 = r14.length
            if (r7 >= r0) goto L_0x026a
            r0 = r17[r7]
            int r1 = r0.length
            r2 = 0
        L_0x020f:
            if (r2 >= r1) goto L_0x021d
            r3 = r0[r2]
            boolean r4 = r3 instanceof com.alibaba.fastjson.annotation.JSONField
            if (r4 == 0) goto L_0x021a
            com.alibaba.fastjson.annotation.JSONField r3 = (com.alibaba.fastjson.annotation.JSONField) r3
            goto L_0x021f
        L_0x021a:
            int r2 = r2 + 1
            goto L_0x020f
        L_0x021d:
            r3 = r16
        L_0x021f:
            if (r3 == 0) goto L_0x0264
            r4 = r14[r7]
            r5 = r12[r7]
            java.lang.String r0 = r3.name()
            r6 = r22
            java.lang.reflect.Field r19 = com.alibaba.fastjson.util.TypeUtils.getField(r11, r0, r10, r6)
            int r20 = r3.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = r3.serialzeFeatures()
            int r21 = com.alibaba.fastjson.serializer.SerializerFeature.of(r0)
            com.alibaba.fastjson.util.FieldInfo r2 = new com.alibaba.fastjson.util.FieldInfo
            java.lang.String r1 = r3.name()
            r0 = r2
            r3 = r2
            r2 = r35
            r36 = r12
            r12 = r3
            r3 = r4
            r4 = r5
            r5 = r19
            r19 = r14
            r14 = r6
            r6 = r20
            r20 = r7
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            addField(r15, r12, r13)
            int r7 = r20 + 1
            r12 = r36
            r22 = r14
            r14 = r19
            goto L_0x0208
        L_0x0264:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r8)
            throw r0
        L_0x026a:
            int r0 = r15.size()
            com.alibaba.fastjson.util.FieldInfo[] r5 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r15.toArray(r5)
            com.alibaba.fastjson.util.FieldInfo[] r1 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r1, r2, r0)
            java.util.Arrays.sort(r1)
            boolean r0 = java.util.Arrays.equals(r5, r1)
            if (r0 == 0) goto L_0x0284
            r6 = r5
            goto L_0x0285
        L_0x0284:
            r6 = r1
        L_0x0285:
            if (r39 == 0) goto L_0x0291
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r0 = r11.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r0 = (com.alibaba.fastjson.annotation.JSONType) r0
            r7 = r0
            goto L_0x0293
        L_0x0291:
            r7 = r16
        L_0x0293:
            com.alibaba.fastjson.parser.JavaBeanInfo r10 = new com.alibaba.fastjson.parser.JavaBeanInfo
            r2 = 0
            r3 = 0
            r8 = 0
            r0 = r10
            r1 = r35
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L_0x02a0:
            r14 = r22
            goto L_0x03be
        L_0x02a4:
            r14 = r22
            if (r2 != 0) goto L_0x03be
            java.lang.String r2 = "default constructor not found. "
            if (r1 == 0) goto L_0x03b0
            int r1 = r0.length
            if (r1 <= 0) goto L_0x03b0
            java.lang.String[] r8 = com.alibaba.fastjson.util.TypeUtils.getKoltinConstructorParameters(r35)
            if (r8 == 0) goto L_0x03a2
            int r1 = r0.length
            r7 = r21
            r3 = 0
        L_0x02b9:
            if (r3 >= r1) goto L_0x02e3
            r2 = r0[r3]
            java.lang.Class[] r4 = r2.getParameterTypes()
            int r5 = r4.length
            if (r5 <= 0) goto L_0x02d5
            int r5 = r4.length
            r6 = 1
            int r5 = r5 - r6
            r5 = r4[r5]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "kotlin.jvm.internal.DefaultConstructorMarker"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x02e0
        L_0x02d5:
            if (r7 == 0) goto L_0x02df
            java.lang.Class[] r5 = r7.getParameterTypes()
            int r5 = r5.length
            int r4 = r4.length
            if (r5 >= r4) goto L_0x02e0
        L_0x02df:
            r7 = r2
        L_0x02e0:
            int r3 = r3 + 1
            goto L_0x02b9
        L_0x02e3:
            r2 = 1
            r7.setAccessible(r2)
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r7, r12)
            java.lang.Class[] r6 = r7.getParameterTypes()
            if (r41 == 0) goto L_0x02f7
            java.lang.reflect.Type[] r0 = r7.getGenericParameterTypes()
            r19 = r0
            goto L_0x02f9
        L_0x02f7:
            r19 = r6
        L_0x02f9:
            java.lang.annotation.Annotation[][] r20 = r7.getParameterAnnotations()
            r5 = 0
        L_0x02fe:
            int r0 = r6.length
            if (r5 >= r0) goto L_0x037b
            r0 = r8[r5]
            r1 = r20[r5]
            int r2 = r1.length
            r3 = 0
        L_0x0307:
            if (r3 >= r2) goto L_0x0319
            r4 = r1[r3]
            r21 = r1
            boolean r1 = r4 instanceof com.alibaba.fastjson.annotation.JSONField
            if (r1 == 0) goto L_0x0314
            com.alibaba.fastjson.annotation.JSONField r4 = (com.alibaba.fastjson.annotation.JSONField) r4
            goto L_0x031b
        L_0x0314:
            int r3 = r3 + 1
            r1 = r21
            goto L_0x0307
        L_0x0319:
            r4 = r16
        L_0x031b:
            r3 = r6[r5]
            r21 = r19[r5]
            java.lang.reflect.Field r2 = com.alibaba.fastjson.util.TypeUtils.getField(r11, r0, r10, r14)
            if (r2 == 0) goto L_0x0330
            if (r4 != 0) goto L_0x0330
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r1 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            r4 = r1
            com.alibaba.fastjson.annotation.JSONField r4 = (com.alibaba.fastjson.annotation.JSONField) r4
        L_0x0330:
            if (r4 == 0) goto L_0x034f
            int r1 = r4.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r22 = r4.serialzeFeatures()
            int r22 = com.alibaba.fastjson.serializer.SerializerFeature.of(r22)
            java.lang.String r4 = r4.name()
            int r23 = r4.length()
            if (r23 == 0) goto L_0x0349
            r0 = r4
        L_0x0349:
            r23 = r22
            r22 = r1
            r1 = r0
            goto L_0x0354
        L_0x034f:
            r1 = r0
            r22 = 0
            r23 = 0
        L_0x0354:
            com.alibaba.fastjson.util.FieldInfo r4 = new com.alibaba.fastjson.util.FieldInfo
            r0 = r4
            r24 = r2
            r2 = r35
            r25 = r8
            r8 = r4
            r4 = r21
            r21 = r5
            r5 = r24
            r24 = r6
            r6 = r22
            r22 = r7
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            addField(r15, r8, r13)
            int r5 = r21 + 1
            r7 = r22
            r6 = r24
            r8 = r25
            goto L_0x02fe
        L_0x037b:
            r22 = r7
            int r0 = r15.size()
            com.alibaba.fastjson.util.FieldInfo[] r1 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r15.toArray(r1)
            com.alibaba.fastjson.util.FieldInfo[] r2 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r8 = 0
            java.lang.System.arraycopy(r1, r8, r2, r8, r0)
            java.util.Arrays.sort(r2)
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
        L_0x0392:
            if (r3 >= r0) goto L_0x039d
            r4 = r1[r3]
            java.lang.String r4 = r4.name
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0392
        L_0x039d:
            r18 = r2
            r21 = r22
            goto L_0x03c1
        L_0x03a2:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = java.lang.String.valueOf(r35)
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x03b0:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = java.lang.String.valueOf(r35)
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x03be:
            r8 = 0
            r18 = r16
        L_0x03c1:
            r7 = r29
        L_0x03c3:
            if (r7 == 0) goto L_0x03c8
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r7, r12)
        L_0x03c8:
            r5 = 4
            if (r13 != 0) goto L_0x0606
            r4 = r28
            int r3 = r4.length
            r2 = 0
        L_0x03cf:
            if (r2 >= r3) goto L_0x05fd
            r1 = r4[r2]
            java.lang.String r0 = r1.getName()
            int r6 = r0.length()
            if (r6 < r5) goto L_0x05db
            java.lang.Class r6 = r1.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r6 == r5) goto L_0x03eb
            java.lang.Class r5 = r1.getDeclaringClass()
            if (r6 != r5) goto L_0x05db
        L_0x03eb:
            java.lang.Class[] r5 = r1.getParameterTypes()
            int r5 = r5.length
            r6 = 1
            if (r5 != r6) goto L_0x05db
            if (r40 == 0) goto L_0x03fe
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r5 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r5 = r1.getAnnotation(r5)
            com.alibaba.fastjson.annotation.JSONField r5 = (com.alibaba.fastjson.annotation.JSONField) r5
            goto L_0x0400
        L_0x03fe:
            r5 = r16
        L_0x0400:
            if (r5 != 0) goto L_0x0408
            if (r40 == 0) goto L_0x0408
            com.alibaba.fastjson.annotation.JSONField r5 = com.alibaba.fastjson.util.TypeUtils.getSupperMethodAnnotation(r11, r1)
        L_0x0408:
            r17 = r5
            if (r17 == 0) goto L_0x048c
            boolean r5 = r17.deserialize()
            if (r5 == 0) goto L_0x0478
            int r22 = r17.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r5 = r17.serialzeFeatures()
            int r23 = com.alibaba.fastjson.serializer.SerializerFeature.of(r5)
            java.lang.String r5 = r17.name()
            int r5 = r5.length()
            if (r5 == 0) goto L_0x0467
            java.lang.String r5 = r17.name()
            com.alibaba.fastjson.util.FieldInfo r0 = new com.alibaba.fastjson.util.FieldInfo
            r24 = 0
            r25 = 0
            r26 = r0
            r27 = r1
            r1 = r5
            r28 = r2
            r2 = r27
            r29 = r3
            r3 = r24
            r24 = r4
            r4 = r35
            r5 = r37
            r19 = 1
            r6 = r22
            r20 = r7
            r7 = r23
            r30 = r24
            r8 = r17
            r19 = r9
            r9 = r25
            r24 = r14
            r14 = r10
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            addField(r15, r0, r13)
            r10 = r27
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r10, r12)
            goto L_0x05d4
        L_0x0467:
            r28 = r2
            r29 = r3
            r30 = r4
            r20 = r7
            r19 = r9
            r24 = r14
            r14 = r10
            r10 = r1
            r8 = r22
            goto L_0x049d
        L_0x0478:
            r28 = r2
            r29 = r3
            r30 = r4
            r20 = r7
            r19 = r9
            r24 = r14
            r26 = r24
            r25 = 1
            r24 = r10
            goto L_0x05eb
        L_0x048c:
            r28 = r2
            r29 = r3
            r30 = r4
            r20 = r7
            r19 = r9
            r24 = r14
            r14 = r10
            r10 = r1
            r8 = 0
            r23 = 0
        L_0x049d:
            java.lang.String r1 = "set"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x05d4
            r9 = 3
            char r1 = r0.charAt(r9)
            boolean r2 = java.lang.Character.isUpperCase(r1)
            if (r2 == 0) goto L_0x04dd
            boolean r1 = com.alibaba.fastjson.util.TypeUtils.compatibleWithJavaBean
            if (r1 == 0) goto L_0x04c0
            java.lang.String r0 = r0.substring(r9)
            java.lang.String r0 = com.alibaba.fastjson.util.TypeUtils.decapitalize(r0)
            r6 = r24
            r7 = 4
            goto L_0x050c
        L_0x04c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r2 = r0.charAt(r9)
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.append(r2)
            r7 = 4
            java.lang.String r0 = r0.substring(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x04e6
        L_0x04dd:
            r7 = 4
            r2 = 95
            if (r1 != r2) goto L_0x04e9
            java.lang.String r0 = r0.substring(r7)
        L_0x04e6:
            r6 = r24
            goto L_0x050c
        L_0x04e9:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 != r2) goto L_0x04f2
            java.lang.String r0 = r0.substring(r9)
            goto L_0x04e6
        L_0x04f2:
            int r1 = r0.length()
            r2 = 5
            if (r1 < r2) goto L_0x05d4
            char r1 = r0.charAt(r7)
            boolean r1 = java.lang.Character.isUpperCase(r1)
            if (r1 == 0) goto L_0x05d4
            java.lang.String r0 = r0.substring(r9)
            java.lang.String r0 = com.alibaba.fastjson.util.TypeUtils.decapitalize(r0)
            goto L_0x04e6
        L_0x050c:
            java.lang.reflect.Field r1 = com.alibaba.fastjson.util.TypeUtils.getField(r11, r0, r14, r6)
            if (r1 != 0) goto L_0x0542
            java.lang.Class[] r2 = r10.getParameterTypes()
            r5 = 0
            r2 = r2[r5]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 != r3) goto L_0x0540
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "is"
            r1.<init>(r2)
            char r2 = r0.charAt(r5)
            char r2 = java.lang.Character.toUpperCase(r2)
            r1.append(r2)
            r4 = 1
            java.lang.String r2 = r0.substring(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.reflect.Field r1 = com.alibaba.fastjson.util.TypeUtils.getField(r11, r1, r14, r6)
            goto L_0x0544
        L_0x0540:
            r4 = 1
            goto L_0x0544
        L_0x0542:
            r4 = 1
            r5 = 0
        L_0x0544:
            r3 = r1
            if (r3 == 0) goto L_0x05a2
            if (r40 == 0) goto L_0x0554
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r1 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            r22 = r1
            goto L_0x0556
        L_0x0554:
            r22 = r16
        L_0x0556:
            if (r22 == 0) goto L_0x05a2
            int r8 = r22.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r1 = r22.serialzeFeatures()
            int r23 = com.alibaba.fastjson.serializer.SerializerFeature.of(r1)
            java.lang.String r1 = r22.name()
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0594
            java.lang.String r1 = r22.name()
            com.alibaba.fastjson.util.FieldInfo r2 = new com.alibaba.fastjson.util.FieldInfo
            r0 = r2
            r24 = r14
            r14 = r2
            r2 = r10
            r25 = 1
            r4 = r35
            r10 = 0
            r5 = r37
            r26 = r6
            r6 = r8
            r8 = 4
            r7 = r23
            r8 = r17
            r9 = r22
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            addField(r15, r14, r13)
            goto L_0x05eb
        L_0x0594:
            r26 = r6
            r24 = r14
            r25 = 1
            if (r17 != 0) goto L_0x05a8
            r14 = r42
            r6 = r8
            r8 = r22
            goto L_0x05ad
        L_0x05a2:
            r26 = r6
            r24 = r14
            r25 = 1
        L_0x05a8:
            r14 = r42
            r6 = r8
            r8 = r17
        L_0x05ad:
            r7 = r23
            if (r14 == 0) goto L_0x05b5
            java.lang.String r0 = r14.translate(r0)
        L_0x05b5:
            r1 = r0
            com.alibaba.fastjson.util.FieldInfo r9 = new com.alibaba.fastjson.util.FieldInfo
            r3 = 0
            r17 = 0
            r0 = r9
            r2 = r10
            r4 = r35
            r5 = r37
            r31 = r9
            r9 = r17
            r14 = r10
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r31
            addField(r15, r0, r13)
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r14, r12)
            goto L_0x05eb
        L_0x05d4:
            r26 = r24
            r25 = 1
            r24 = r14
            goto L_0x05eb
        L_0x05db:
            r28 = r2
            r29 = r3
            r30 = r4
            r20 = r7
            r19 = r9
            r24 = r10
            r26 = r14
            r25 = 1
        L_0x05eb:
            int r2 = r28 + 1
            r9 = r19
            r7 = r20
            r10 = r24
            r14 = r26
            r3 = r29
            r4 = r30
            r5 = 4
            r8 = 0
            goto L_0x03cf
        L_0x05fd:
            r30 = r4
            r20 = r7
            r19 = r9
            r24 = r10
            goto L_0x060e
        L_0x0606:
            r20 = r7
            r19 = r9
            r24 = r10
            r30 = r28
        L_0x060e:
            r25 = 1
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r24
            int r2 = r1.length
            r0.<init>(r2)
            int r2 = r1.length
            r8 = 0
        L_0x061a:
            if (r8 >= r2) goto L_0x0652
            r3 = r1[r8]
            int r4 = r3.getModifiers()
            r5 = r4 & 8
            if (r5 != 0) goto L_0x064f
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0644
            java.lang.Class r4 = r3.getType()
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r4)
            if (r5 != 0) goto L_0x0641
            java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L_0x063f
            goto L_0x0641
        L_0x063f:
            r9 = 0
            goto L_0x0642
        L_0x0641:
            r9 = 1
        L_0x0642:
            if (r9 == 0) goto L_0x064f
        L_0x0644:
            int r4 = r3.getModifiers()
            r4 = r4 & 1
            if (r4 == 0) goto L_0x064f
            r0.add(r3)
        L_0x064f:
            int r8 = r8 + 1
            goto L_0x061a
        L_0x0652:
            java.lang.Class r1 = r35.getSuperclass()
        L_0x0656:
            if (r1 == 0) goto L_0x069b
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L_0x069b
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            int r3 = r2.length
            r8 = 0
        L_0x0662:
            if (r8 >= r3) goto L_0x0696
            r4 = r2[r8]
            int r5 = r4.getModifiers()
            r6 = r5 & 8
            if (r6 != 0) goto L_0x0693
            r6 = r5 & 16
            if (r6 == 0) goto L_0x068c
            java.lang.Class r6 = r4.getType()
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 != 0) goto L_0x0689
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L_0x0687
            goto L_0x0689
        L_0x0687:
            r9 = 0
            goto L_0x068a
        L_0x0689:
            r9 = 1
        L_0x068a:
            if (r9 == 0) goto L_0x0693
        L_0x068c:
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0693
            r0.add(r4)
        L_0x0693:
            int r8 = r8 + 1
            goto L_0x0662
        L_0x0696:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x0656
        L_0x069b:
            java.util.Iterator r14 = r0.iterator()
        L_0x069f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0723
            java.lang.Object r0 = r14.next()
            r3 = r0
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r0 = r3.getName()
            int r1 = r15.size()
            r8 = 0
            r9 = 0
        L_0x06b6:
            if (r8 >= r1) goto L_0x06ca
            java.lang.Object r2 = r15.get(r8)
            com.alibaba.fastjson.util.FieldInfo r2 = (com.alibaba.fastjson.util.FieldInfo) r2
            java.lang.String r2 = r2.name
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x06c7
            r9 = 1
        L_0x06c7:
            int r8 = r8 + 1
            goto L_0x06b6
        L_0x06ca:
            if (r9 != 0) goto L_0x069f
            if (r40 == 0) goto L_0x06d8
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r1 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r1 = r3.getAnnotation(r1)
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            r9 = r1
            goto L_0x06da
        L_0x06d8:
            r9 = r16
        L_0x06da:
            if (r9 == 0) goto L_0x06fb
            int r1 = r9.ordinal()
            com.alibaba.fastjson.serializer.SerializerFeature[] r2 = r9.serialzeFeatures()
            int r2 = com.alibaba.fastjson.serializer.SerializerFeature.of(r2)
            java.lang.String r4 = r9.name()
            int r4 = r4.length()
            if (r4 == 0) goto L_0x06f6
            java.lang.String r0 = r9.name()
        L_0x06f6:
            r10 = r42
            r6 = r1
            r7 = r2
            goto L_0x06ff
        L_0x06fb:
            r10 = r42
            r6 = 0
            r7 = 0
        L_0x06ff:
            if (r10 == 0) goto L_0x0705
            java.lang.String r0 = r10.translate(r0)
        L_0x0705:
            r1 = r0
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r3, r12)
            com.alibaba.fastjson.util.FieldInfo r8 = new com.alibaba.fastjson.util.FieldInfo
            r2 = 0
            r17 = 0
            r0 = r8
            r4 = r35
            r5 = r37
            r32 = r8
            r8 = r17
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r32
            addField(r15, r0, r13)
            goto L_0x069f
        L_0x0723:
            if (r13 != 0) goto L_0x07df
            r14 = r30
            int r10 = r14.length
            r9 = 0
        L_0x0729:
            if (r9 >= r10) goto L_0x07df
            r8 = r14[r9]
            java.lang.String r0 = r8.getName()
            int r1 = r0.length()
            r7 = 4
            if (r1 < r7) goto L_0x07d1
            java.lang.String r1 = "get"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x07d1
            r6 = 3
            char r1 = r0.charAt(r6)
            boolean r1 = java.lang.Character.isUpperCase(r1)
            if (r1 == 0) goto L_0x07d1
            java.lang.Class[] r1 = r8.getParameterTypes()
            int r1 = r1.length
            if (r1 != 0) goto L_0x07d1
            java.lang.Class r1 = r8.getReturnType()
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 != 0) goto L_0x0766
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x07d1
        L_0x0766:
            if (r40 == 0) goto L_0x0773
            java.lang.Class<com.alibaba.fastjson.annotation.JSONField> r1 = com.alibaba.fastjson.annotation.JSONField.class
            java.lang.annotation.Annotation r1 = r8.getAnnotation(r1)
            com.alibaba.fastjson.annotation.JSONField r1 = (com.alibaba.fastjson.annotation.JSONField) r1
            r17 = r1
            goto L_0x0775
        L_0x0773:
            r17 = r16
        L_0x0775:
            if (r17 == 0) goto L_0x0782
            java.lang.String r1 = r17.name()
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0782
            goto L_0x079e
        L_0x0782:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char r2 = r0.charAt(r6)
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.append(r2)
            java.lang.String r0 = r0.substring(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r0
        L_0x079e:
            com.alibaba.fastjson.util.FieldInfo r5 = new com.alibaba.fastjson.util.FieldInfo
            r3 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r0 = r5
            r2 = r8
            r4 = r35
            r33 = r5
            r5 = r37
            r25 = 3
            r6 = r22
            r22 = 4
            r7 = r23
            r34 = r8
            r8 = r17
            r17 = r9
            r9 = r24
            r23 = r10
            r10 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r33
            addField(r15, r0, r13)
            r0 = r34
            com.alibaba.fastjson.util.TypeUtils.setAccessible(r11, r0, r12)
            goto L_0x07d9
        L_0x07d1:
            r17 = r9
            r23 = r10
            r22 = 4
            r25 = 3
        L_0x07d9:
            int r9 = r17 + 1
            r10 = r23
            goto L_0x0729
        L_0x07df:
            int r0 = r15.size()
            com.alibaba.fastjson.util.FieldInfo[] r5 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r15.toArray(r5)
            com.alibaba.fastjson.util.FieldInfo[] r6 = new com.alibaba.fastjson.util.FieldInfo[r0]
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r6, r1, r0)
            java.util.Arrays.sort(r6)
            if (r39 == 0) goto L_0x07fd
            java.lang.Class<com.alibaba.fastjson.annotation.JSONType> r0 = com.alibaba.fastjson.annotation.JSONType.class
            java.lang.annotation.Annotation r0 = r11.getAnnotation(r0)
            com.alibaba.fastjson.annotation.JSONType r0 = (com.alibaba.fastjson.annotation.JSONType) r0
            r7 = r0
            goto L_0x07ff
        L_0x07fd:
            r7 = r16
        L_0x07ff:
            com.alibaba.fastjson.parser.JavaBeanInfo r9 = new com.alibaba.fastjson.parser.JavaBeanInfo
            r0 = r9
            r1 = r35
            r2 = r20
            r3 = r21
            r4 = r19
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanInfo.build(java.lang.Class, int, java.lang.reflect.Type, boolean, boolean, boolean, boolean, com.alibaba.fastjson.PropertyNamingStrategy):com.alibaba.fastjson.parser.JavaBeanInfo");
    }
}
