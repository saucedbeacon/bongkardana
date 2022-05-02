package com.squareup.wire;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.parser.JSONLexer;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.squareup.wire.Message;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.text.Typography;
import o.printConnMonitorLog;

final class MessageAdapter<M extends Message> {
    private static final String FULL_BLOCK = "█";
    private static int IsOverlapping = 1;
    private static final String REDACTED = "██";
    private static int getMax = -1732320751;
    private static int getMin = 744321170;
    private static byte[] length = {-18, 102, -118, -97, -110};
    private static int setMax = 23;
    private static short[] setMin;
    private static int toIntRange;
    private final TagMap<FieldInfo> fieldInfoMap;
    private final Class<M> messageType;
    private final Map<String, Integer> tagMap = new LinkedHashMap();
    private final Wire wire;

    public static final class FieldInfo {
        /* access modifiers changed from: private */
        public final Field builderField;
        final Message.Datatype datatype;
        EnumAdapter<? extends ProtoEnum> enumAdapter;
        final Class<? extends ProtoEnum> enumType;
        final Message.Label label;
        MessageAdapter<? extends Message> messageAdapter;
        /* access modifiers changed from: private */
        public final Field messageField;
        final Class<? extends Message> messageType;
        final String name;
        final boolean redacted;
        final int tag;

        /* synthetic */ FieldInfo(int i, String str, Message.Datatype datatype2, Message.Label label2, boolean z, Class cls, Field field, Field field2, AnonymousClass1 r9) {
            this(i, str, datatype2, label2, z, cls, field, field2);
        }

        private FieldInfo(int i, String str, Message.Datatype datatype2, Message.Label label2, boolean z, Class<?> cls, Field field, Field field2) {
            this.tag = i;
            this.name = str;
            this.datatype = datatype2;
            this.label = label2;
            this.redacted = z;
            if (datatype2 == Message.Datatype.ENUM) {
                this.enumType = cls;
                this.messageType = null;
            } else if (datatype2 == Message.Datatype.MESSAGE) {
                this.messageType = cls;
                this.enumType = null;
            } else {
                this.enumType = null;
                this.messageType = null;
            }
            this.messageField = field;
            this.builderField = field2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Collection<FieldInfo> getFields() {
        Collection<FieldInfo> collection;
        int i = toIntRange + 57;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? '5' : 'a') != 'a') {
            collection = this.fieldInfoMap.values();
            int i2 = 56 / 0;
        } else {
            collection = this.fieldInfoMap.values();
        }
        int i3 = IsOverlapping + 77;
        toIntRange = i3 % 128;
        if ((i3 % 2 != 0 ? 19 : '1') == '1') {
            return collection;
        }
        Object obj = null;
        super.hashCode();
        return collection;
    }

    /* access modifiers changed from: package-private */
    public final FieldInfo getField(String str) {
        int i = toIntRange + 45;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            Integer num = this.tagMap.get(str);
            boolean z = true;
            if (!(num == null)) {
                return this.fieldInfoMap.get(num.intValue());
            }
            int i3 = toIntRange + 109;
            IsOverlapping = i3 % 128;
            if (i3 % 2 != 0) {
                z = false;
            }
            FieldInfo fieldInfo = null;
            if (!z) {
                return fieldInfo;
            }
            super.hashCode();
            return fieldInfo;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object getFieldValue(M m, FieldInfo fieldInfo) {
        try {
            int i = toIntRange + 45;
            try {
                IsOverlapping = i % 128;
                int i2 = i % 2;
                if (fieldInfo.messageField != null) {
                    try {
                        Object obj = fieldInfo.messageField.get(m);
                        int i3 = toIntRange + 69;
                        IsOverlapping = i3 % 128;
                        int i4 = i3 % 2;
                        return obj;
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                } else {
                    throw new AssertionError("Field is not of type \"Message\"");
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public final void setBuilderField(M m, int i, Object obj) {
        int i2 = IsOverlapping + 55;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.fieldInfoMap.get(i).builderField.set(m, obj);
            try {
                int i4 = IsOverlapping + 13;
                try {
                    toIntRange = i4 % 128;
                    if (!(i4 % 2 == 0)) {
                        Object[] objArr = null;
                        int length2 = objArr.length;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Class<com.squareup.wire.Message>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Class<java.lang.Enum>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        if (r10 == com.squareup.wire.Message.Datatype.ENUM) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r10 == r11) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (r10 != com.squareup.wire.Message.Datatype.MESSAGE) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r11 == true) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r9 = getMessageType(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r11 = toIntRange + 63;
        IsOverlapping = r11 % 128;
        r11 = r11 % 2;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d0, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    MessageAdapter(com.squareup.wire.Wire r19, java.lang.Class<M> r20) {
        /*
            r18 = this;
            r1 = r18
            r18.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.tagMap = r0
            r0 = r19
            r1.wire = r0
            r0 = r20
            r1.messageType = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.reflect.Field[] r0 = r20.getDeclaredFields()
            int r3 = r0.length
            r5 = 0
        L_0x001f:
            if (r5 >= r3) goto L_0x00d8
            int r6 = toIntRange
            int r6 = r6 + 41
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
            r14 = r0[r5]
            java.lang.Class<com.squareup.wire.ProtoField> r6 = com.squareup.wire.ProtoField.class
            java.lang.annotation.Annotation r6 = r14.getAnnotation(r6)
            com.squareup.wire.ProtoField r6 = (com.squareup.wire.ProtoField) r6
            r7 = 75
            if (r6 == 0) goto L_0x003c
            r8 = 82
            goto L_0x003e
        L_0x003c:
            r8 = 75
        L_0x003e:
            if (r8 == r7) goto L_0x00d4
            int r7 = IsOverlapping     // Catch:{ Exception -> 0x00df }
            int r7 = r7 + 19
            int r8 = r7 % 128
            toIntRange = r8     // Catch:{ Exception -> 0x00df }
            int r7 = r7 % 2
            r8 = 48
            if (r7 == 0) goto L_0x0051
            r7 = 48
            goto L_0x0053
        L_0x0051:
            r7 = 62
        L_0x0053:
            r9 = 0
            if (r7 == r8) goto L_0x0070
            int r7 = r6.tag()
            java.lang.String r8 = r14.getName()
            java.util.Map<java.lang.String, java.lang.Integer> r10 = r1.tagMap
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r10.put(r8, r11)
            com.squareup.wire.Message$Datatype r10 = r6.type()
            com.squareup.wire.Message$Datatype r11 = com.squareup.wire.Message.Datatype.ENUM
            if (r10 != r11) goto L_0x0092
            goto L_0x008a
        L_0x0070:
            int r7 = r6.tag()
            java.lang.String r8 = r14.getName()
            java.util.Map<java.lang.String, java.lang.Integer> r10 = r1.tagMap
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r10.put(r8, r11)
            com.squareup.wire.Message$Datatype r10 = r6.type()
            com.squareup.wire.Message$Datatype r11 = com.squareup.wire.Message.Datatype.ENUM
            int r12 = r9.length     // Catch:{ all -> 0x00d1 }
            if (r10 != r11) goto L_0x0092
        L_0x008a:
            java.lang.Class r9 = r1.getEnumType(r14)
        L_0x008e:
            r13 = r9
            r9 = r8
            r8 = r7
            goto L_0x00ac
        L_0x0092:
            com.squareup.wire.Message$Datatype r11 = com.squareup.wire.Message.Datatype.MESSAGE
            r12 = 1
            if (r10 != r11) goto L_0x0099
            r11 = 1
            goto L_0x009a
        L_0x0099:
            r11 = 0
        L_0x009a:
            if (r11 == r12) goto L_0x009d
            goto L_0x008e
        L_0x009d:
            java.lang.Class r9 = r1.getMessageType(r14)
            int r11 = toIntRange     // Catch:{ Exception -> 0x00cf }
            int r11 = r11 + 63
            int r12 = r11 % 128
            IsOverlapping = r12     // Catch:{ Exception -> 0x00cf }
            int r11 = r11 % 2
            goto L_0x008e
        L_0x00ac:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            com.squareup.wire.MessageAdapter$FieldInfo r12 = new com.squareup.wire.MessageAdapter$FieldInfo
            com.squareup.wire.Message$Label r11 = r6.label()
            boolean r6 = r6.redacted()
            java.lang.reflect.Field r16 = r1.getBuilderField(r9)
            r17 = 0
            r7 = r12
            r4 = r12
            r12 = r6
            r6 = r15
            r15 = r16
            r16 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.put(r6, r4)
            goto L_0x00d4
        L_0x00cf:
            r0 = move-exception
            throw r0
        L_0x00d1:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00d4:
            int r5 = r5 + 1
            goto L_0x001f
        L_0x00d8:
            com.squareup.wire.TagMap r0 = com.squareup.wire.TagMap.of(r2)     // Catch:{ Exception -> 0x00df }
            r1.fieldInfoMap = r0
            return
        L_0x00df:
            r0 = move-exception
            goto L_0x00e2
        L_0x00e1:
            throw r0
        L_0x00e2:
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.<init>(com.squareup.wire.Wire, java.lang.Class):void");
    }

    private Class<Message.Builder<M>> getBuilderType(Class<M> cls) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append("$Builder");
            Class<?> cls2 = Class.forName(sb.toString(), true, cls.getClassLoader());
            int i = toIntRange + 85;
            IsOverlapping = i % 128;
            if ((i % 2 == 0 ? 18 : '_') == '_') {
                return cls2;
            }
            Object obj = null;
            super.hashCode();
            return cls2;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("No builder class found for message type ");
            sb2.append(cls.getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private Field getBuilderField(String str) {
        try {
            int i = toIntRange + 83;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            try {
                Field field = this.messageType.getField(str);
                int i3 = toIntRange + 25;
                IsOverlapping = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return field;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return field;
            } catch (NoSuchFieldException unused) {
                StringBuilder sb = new StringBuilder("No builder field ");
                sb.append(this.messageType.getName());
                sb.append(".");
                sb.append(str);
                throw new AssertionError(sb.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private Class<Message> getMessageType(Field field) {
        Class<?> type = field.getType();
        boolean z = true;
        Class<Message> cls = null;
        if (Message.class.isAssignableFrom(type)) {
            int i = toIntRange + 95;
            IsOverlapping = i % 128;
            if ((i % 2 == 0 ? Typography.greater : '*') != '>') {
                return type;
            }
            super.hashCode();
            return type;
        }
        if (List.class.isAssignableFrom(type)) {
            int i2 = toIntRange + 31;
            IsOverlapping = i2 % 128;
            int i3 = i2 % 2;
            try {
                Type type2 = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    try {
                        if (!Message.class.isAssignableFrom((Class) type2)) {
                            z = false;
                        }
                        if (z) {
                            return (Class) type2;
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return cls;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        if (r3 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r0 != false) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Class<java.lang.Enum> getEnumType(java.lang.reflect.Field r6) {
        /*
            r5 = this;
            java.lang.Class r0 = r6.getType()
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r1 = r1.isAssignableFrom(r0)
            r2 = 29
            r3 = 0
            if (r1 == 0) goto L_0x0020
            int r6 = IsOverlapping
            int r6 = r6 + 93
            int r1 = r6 % 128
            toIntRange = r1
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x001f
            int r2 = r2 / r3
            return r0
        L_0x001d:
            r6 = move-exception
            throw r6
        L_0x001f:
            return r0
        L_0x0020:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            boolean r0 = r1.isAssignableFrom(r0)
            r1 = 11
            if (r0 == 0) goto L_0x002d
            r0 = 11
            goto L_0x002f
        L_0x002d:
            r0 = 89
        L_0x002f:
            r4 = 0
            if (r0 == r1) goto L_0x0033
            goto L_0x0085
        L_0x0033:
            int r0 = toIntRange
            int r0 = r0 + r2
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            java.lang.reflect.Type r6 = r6.getGenericType()
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            r6 = r6[r3]
            boolean r0 = r6 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0085
            int r0 = toIntRange     // Catch:{ Exception -> 0x0083 }
            int r0 = r0 + 79
            int r1 = r0 % 128
            IsOverlapping = r1     // Catch:{ Exception -> 0x0083 }
            int r0 = r0 % 2
            r1 = 62
            if (r0 != 0) goto L_0x005d
            r0 = 62
            goto L_0x005f
        L_0x005d:
            r0 = 78
        L_0x005f:
            if (r0 == r1) goto L_0x0070
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            r1 = r6
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L_0x006d
            r3 = 1
        L_0x006d:
            if (r3 == 0) goto L_0x0085
            goto L_0x007e
        L_0x0070:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            r1 = r6
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r0 = r0.isAssignableFrom(r1)
            super.hashCode()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0085
        L_0x007e:
            java.lang.Class r6 = (java.lang.Class) r6
            return r6
        L_0x0081:
            r6 = move-exception
            throw r6
        L_0x0083:
            r6 = move-exception
            throw r6
        L_0x0085:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.getEnumType(java.lang.reflect.Field):java.lang.Class");
    }

    /* access modifiers changed from: package-private */
    public final int getSerializedSize(M m) {
        Iterator<FieldInfo> it;
        int i;
        int i2 = IsOverlapping + 27;
        toIntRange = i2 % 128;
        char c = 0;
        if (i2 % 2 != 0) {
            try {
                try {
                    it = getFields().iterator();
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            it = getFields().iterator();
        }
        int i3 = 0;
        while (it.hasNext()) {
            FieldInfo next = it.next();
            Object fieldValue = getFieldValue(m, next);
            if (fieldValue != null) {
                int i4 = next.tag;
                Message.Datatype datatype = next.datatype;
                Message.Label label = next.label;
                if (!(label.isRepeated())) {
                    i = getSerializedSize(i4, fieldValue, datatype);
                } else {
                    int i5 = toIntRange + 119;
                    IsOverlapping = i5 % 128;
                    int i6 = i5 % 2;
                    if ((label.isPacked() ? '!' : '^') != '^') {
                        i = getPackedSize((List) fieldValue, i4, datatype);
                    } else {
                        i = getRepeatedSize((List) fieldValue, i4, datatype);
                    }
                }
                i3 += i;
            }
        }
        if (m instanceof ExtendableMessage) {
            int i7 = toIntRange + 1;
            IsOverlapping = i7 % 128;
            int i8 = i7 % 2;
            ExtendableMessage extendableMessage = (ExtendableMessage) m;
            if (extendableMessage.extensionMap != null) {
                c = 'Q';
            }
            if (c != 0) {
                int i9 = IsOverlapping + 13;
                toIntRange = i9 % 128;
                int i10 = i9 % 2;
                i3 += getExtensionsSerializedSize(extendableMessage.extensionMap);
            }
        }
        return i3 + m.getUnknownFieldsSerializedSize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r3.isRepeated() != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if ((r3.isRepeated() ? kotlin.text.Typography.greater : 22) != 22) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        r3 = getSerializedSize(r6, r5, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T extends com.squareup.wire.ExtendableMessage<?>> int getExtensionsSerializedSize(com.squareup.wire.ExtensionMap<T> r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0003:
            int r3 = r11.size()
            r4 = 1
            if (r1 >= r3) goto L_0x009e
            int r3 = IsOverlapping
            int r3 = r3 + 33
            int r5 = r3 % 128
            toIntRange = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x0018
            r3 = 0
            goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            if (r3 == r4) goto L_0x003b
            com.squareup.wire.Extension r3 = r11.getExtension(r1)
            java.lang.Object r5 = r11.getExtensionValue(r1)
            int r6 = r3.getTag()
            com.squareup.wire.Message$Datatype r7 = r3.getDatatype()
            com.squareup.wire.Message$Label r3 = r3.getLabel()
            boolean r8 = r3.isRepeated()
            r9 = 23
            int r9 = r9 / r0
            if (r8 == 0) goto L_0x0095
            goto L_0x005e
        L_0x0039:
            r11 = move-exception
            throw r11
        L_0x003b:
            com.squareup.wire.Extension r3 = r11.getExtension(r1)
            java.lang.Object r5 = r11.getExtensionValue(r1)
            int r6 = r3.getTag()
            com.squareup.wire.Message$Datatype r7 = r3.getDatatype()
            com.squareup.wire.Message$Label r3 = r3.getLabel()
            boolean r8 = r3.isRepeated()
            r9 = 22
            if (r8 == 0) goto L_0x005a
            r8 = 62
            goto L_0x005c
        L_0x005a:
            r8 = 22
        L_0x005c:
            if (r8 == r9) goto L_0x0095
        L_0x005e:
            boolean r3 = r3.isPacked()
            r8 = 16
            if (r3 == 0) goto L_0x0069
            r3 = 16
            goto L_0x006b
        L_0x0069:
            r3 = 36
        L_0x006b:
            if (r3 == r8) goto L_0x0074
            java.util.List r5 = (java.util.List) r5
            int r3 = r10.getRepeatedSize(r5, r6, r7)
            goto L_0x0099
        L_0x0074:
            int r3 = toIntRange     // Catch:{ Exception -> 0x0093 }
            int r3 = r3 + 53
            int r8 = r3 % 128
            IsOverlapping = r8     // Catch:{ Exception -> 0x0093 }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r4 = 0
        L_0x0082:
            if (r4 == 0) goto L_0x008c
            java.util.List r5 = (java.util.List) r5
            int r3 = r10.getPackedSize(r5, r6, r7)
            int r2 = r2 << r3
            goto L_0x009a
        L_0x008c:
            java.util.List r5 = (java.util.List) r5
            int r3 = r10.getPackedSize(r5, r6, r7)
            goto L_0x0099
        L_0x0093:
            r11 = move-exception
            throw r11
        L_0x0095:
            int r3 = r10.getSerializedSize(r6, r5, r7)
        L_0x0099:
            int r2 = r2 + r3
        L_0x009a:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x009e:
            int r11 = toIntRange
            int r11 = r11 + r4
            int r0 = r11 % 128
            IsOverlapping = r0
            int r11 = r11 % 2
            if (r11 != 0) goto L_0x00b0
            r11 = 0
            super.hashCode()     // Catch:{ all -> 0x00ae }
            return r2
        L_0x00ae:
            r11 = move-exception
            throw r11
        L_0x00b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.getExtensionsSerializedSize(com.squareup.wire.ExtensionMap):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r7 != r0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if (r7 != r0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getRepeatedSize(java.util.List<?> r6, int r7, com.squareup.wire.Message.Datatype r8) {
        /*
            r5 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 93
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = o.dispatchOnCancelled.setMax(r7)
            r3 = 41
            int r3 = r3 / r2
            if (r7 == r0) goto L_0x002e
            goto L_0x0020
        L_0x0018:
            r6 = move-exception
            throw r6
        L_0x001a:
            int r0 = o.dispatchOnCancelled.setMax(r7)
            if (r7 == r0) goto L_0x002e
        L_0x0020:
            o.onCanceled r3 = new o.onCanceled
            r3.<init>(r7, r0, r1)
            r0 = 1280828182(0x4c57e316, float:5.6593496E7)
            o.onCancelLoad.setMax(r0, r3)
            o.onCancelLoad.getMin(r0, r3)
        L_0x002e:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x006c }
            r0 = 0
        L_0x0033:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x003b
            r3 = 0
            goto L_0x003c
        L_0x003b:
            r3 = 1
        L_0x003c:
            if (r3 == r1) goto L_0x0054
            int r3 = toIntRange     // Catch:{ Exception -> 0x0052 }
            int r3 = r3 + 3
            int r4 = r3 % 128
            IsOverlapping = r4     // Catch:{ Exception -> 0x0052 }
            int r3 = r3 % 2
            java.lang.Object r3 = r6.next()
            int r3 = r5.getSerializedSize(r7, r3, r8)
            int r0 = r0 + r3
            goto L_0x0033
        L_0x0052:
            r6 = move-exception
            throw r6
        L_0x0054:
            int r6 = toIntRange
            int r6 = r6 + 11
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            if (r1 == 0) goto L_0x006b
            r6 = 0
            super.hashCode()     // Catch:{ all -> 0x0069 }
            return r0
        L_0x0069:
            r6 = move-exception
            throw r6
        L_0x006b:
            return r0
        L_0x006c:
            r6 = move-exception
            goto L_0x006f
        L_0x006e:
            throw r6
        L_0x006f:
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.getRepeatedSize(java.util.List, int, com.squareup.wire.Message$Datatype):int");
    }

    private int getPackedSize(List<?> list, int i, Message.Datatype datatype) {
        Iterator<?> it = list.iterator();
        int i2 = IsOverlapping + 117;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (it.hasNext()) {
            try {
                int i5 = toIntRange + 27;
                IsOverlapping = i5 % 128;
                if (i5 % 2 == 0) {
                    i4 >>= getSerializedSizeNoTag(it.next(), datatype);
                } else {
                    try {
                        i4 += getSerializedSizeNoTag(it.next(), datatype);
                    } catch (Exception e) {
                        throw e;
                    }
                }
                int i6 = IsOverlapping + 47;
                toIntRange = i6 % 128;
                int i7 = i6 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        int varint32Size = WireOutput.varint32Size(WireOutput.makeTag(i, WireType.LENGTH_DELIMITED)) + WireOutput.varint32Size(i4) + i4;
        int i8 = toIntRange + 37;
        IsOverlapping = i8 % 128;
        if (i8 % 2 != 0) {
            return varint32Size;
        }
        Object obj = null;
        super.hashCode();
        return varint32Size;
    }

    /* access modifiers changed from: package-private */
    public final void write(M m, WireOutput wireOutput) throws IOException {
        Iterator<FieldInfo> it = getFields().iterator();
        while (true) {
            boolean z = true;
            if (!(it.hasNext())) {
                break;
            }
            FieldInfo next = it.next();
            Object fieldValue = getFieldValue(m, next);
            if ((fieldValue != null ? (char) 9 : 0) != 0) {
                int i = IsOverlapping + 109;
                toIntRange = i % 128;
                int i2 = i % 2;
                int i3 = next.tag;
                Message.Datatype datatype = next.datatype;
                Message.Label label = next.label;
                if (!(label.isRepeated())) {
                    writeValue(wireOutput, i3, fieldValue, datatype);
                    try {
                        int i4 = toIntRange + 43;
                        IsOverlapping = i4 % 128;
                        int i5 = i4 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    if (!label.isPacked()) {
                        z = false;
                    }
                    if (z) {
                        writePacked(wireOutput, (List) fieldValue, i3, datatype);
                    } else {
                        writeRepeated(wireOutput, (List) fieldValue, i3, datatype);
                        int i6 = toIntRange + 123;
                        IsOverlapping = i6 % 128;
                        int i7 = i6 % 2;
                    }
                }
            }
        }
        if (m instanceof ExtendableMessage) {
            ExtendableMessage extendableMessage = (ExtendableMessage) m;
            if (extendableMessage.extensionMap != null) {
                writeExtensions(wireOutput, extendableMessage.extensionMap);
            }
        }
        m.writeUnknownFieldMap(wireOutput);
        int i8 = toIntRange + 35;
        IsOverlapping = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if ((r7) != true) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if ((!r3.isRepeated()) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r3.isPacked() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r3 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r3 = '*';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        if (r3 == '*') goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        writePacked(r10, (java.util.List) r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008d, code lost:
        writeRepeated(r10, (java.util.List) r4, r5, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T extends com.squareup.wire.ExtendableMessage<?>> void writeExtensions(com.squareup.wire.WireOutput r10, com.squareup.wire.ExtensionMap<T> r11) throws java.io.IOException {
        /*
            r9 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 5
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            int r3 = r11.size()     // Catch:{ Exception -> 0x0097 }
            if (r0 >= r3) goto L_0x0096
            int r3 = toIntRange
            int r3 = r3 + 17
            int r4 = r3 % 128
            IsOverlapping = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0049
            com.squareup.wire.Extension r3 = r11.getExtension(r0)
            java.lang.Object r4 = r11.getExtensionValue(r0)
            int r5 = r3.getTag()
            com.squareup.wire.Message$Datatype r6 = r3.getDatatype()
            com.squareup.wire.Message$Label r3 = r3.getLabel()
            boolean r7 = r3.isRepeated()
            r8 = 0
            super.hashCode()     // Catch:{ all -> 0x0047 }
            if (r7 == 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 == r2) goto L_0x0078
            goto L_0x0068
        L_0x0047:
            r10 = move-exception
            throw r10
        L_0x0049:
            com.squareup.wire.Extension r3 = r11.getExtension(r0)
            java.lang.Object r4 = r11.getExtensionValue(r0)
            int r5 = r3.getTag()
            com.squareup.wire.Message$Datatype r6 = r3.getDatatype()
            com.squareup.wire.Message$Label r3 = r3.getLabel()
            boolean r7 = r3.isRepeated()
            if (r7 == 0) goto L_0x0065
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            if (r7 == 0) goto L_0x0078
        L_0x0068:
            r9.writeValue(r10, r5, r4, r6)
            int r3 = IsOverlapping     // Catch:{ Exception -> 0x0076 }
            int r3 = r3 + 3
            int r4 = r3 % 128
            toIntRange = r4     // Catch:{ Exception -> 0x0076 }
            int r3 = r3 % 2
            goto L_0x0092
        L_0x0076:
            r10 = move-exception
            throw r10
        L_0x0078:
            boolean r3 = r3.isPacked()
            r7 = 42
            if (r3 == 0) goto L_0x0083
            r3 = 26
            goto L_0x0085
        L_0x0083:
            r3 = 42
        L_0x0085:
            if (r3 == r7) goto L_0x008d
            java.util.List r4 = (java.util.List) r4
            r9.writePacked(r10, r4, r5, r6)
            goto L_0x0092
        L_0x008d:
            java.util.List r4 = (java.util.List) r4
            r9.writeRepeated(r10, r4, r5, r6)
        L_0x0092:
            int r0 = r0 + 1
            goto L_0x0011
        L_0x0096:
            return
        L_0x0097:
            r10 = move-exception
            goto L_0x009a
        L_0x0099:
            throw r10
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.writeExtensions(com.squareup.wire.WireOutput, com.squareup.wire.ExtensionMap):void");
    }

    private void writeRepeated(WireOutput wireOutput, List<?> list, int i, Message.Datatype datatype) throws IOException {
        Iterator<?> it = list.iterator();
        int i2 = IsOverlapping + 63;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            try {
                if (!(!it.hasNext())) {
                    try {
                        int i4 = IsOverlapping + 55;
                        toIntRange = i4 % 128;
                        if ((i4 % 2 != 0 ? 'D' : 12) != 12) {
                            writeValue(wireOutput, i, it.next(), datatype);
                            int i5 = 5 / 0;
                        } else {
                            writeValue(wireOutput, i, it.next(), datatype);
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    int i6 = IsOverlapping + 89;
                    toIntRange = i6 % 128;
                    int i7 = i6 % 2;
                    return;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    private void writePacked(WireOutput wireOutput, List<?> list, int i, Message.Datatype datatype) throws IOException {
        int i2 = 0;
        Iterator<?> it = list.iterator();
        while (true) {
            try {
                if ((it.hasNext() ? 30 : 'A') == 'A') {
                    break;
                }
                i2 += getSerializedSizeNoTag(it.next(), datatype);
            } catch (Exception e) {
                throw e;
            }
        }
        wireOutput.writeTag(i, WireType.LENGTH_DELIMITED);
        wireOutput.writeVarint32(i2);
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            int i3 = IsOverlapping + 107;
            toIntRange = i3 % 128;
            if ((i3 % 2 != 0 ? 18 : ')') != ')') {
                writeValueNoTag(wireOutput, it2.next(), datatype);
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                writeValueNoTag(wireOutput, it2.next(), datatype);
            }
            int i4 = IsOverlapping + 9;
            toIntRange = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] toByteArray(M m) {
        int i = IsOverlapping + 63;
        toIntRange = i % 128;
        int i2 = i % 2;
        try {
            byte[] bArr = new byte[getSerializedSize(m)];
            try {
                write(m, WireOutput.newInstance(bArr));
                int i3 = IsOverlapping + 111;
                toIntRange = i3 % 128;
                int i4 = i3 % 2;
                return bArr;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final String toString(M m) {
        Object obj;
        FieldInfo fieldInfo;
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append("{");
        Iterator<FieldInfo> it = getFields().iterator();
        String str = "";
        while (true) {
            if ((it.hasNext() ? (char) 22 : 7) != 22) {
                if ((m instanceof ExtendableMessage ? 'C' : '*') == 'C') {
                    sb.append(str);
                    sb.append("{extensions=");
                    sb.append(((ExtendableMessage) m).extensionsToString());
                    sb.append("}");
                    int i = IsOverlapping + 93;
                    toIntRange = i % 128;
                    int i2 = i % 2;
                }
                sb.append("}");
                return sb.toString();
            }
            int i3 = IsOverlapping + 63;
            toIntRange = i3 % 128;
            boolean z = false;
            if ((i3 % 2 != 0 ? 'W' : Typography.quote) != 'W') {
                fieldInfo = it.next();
                obj = getFieldValue(m, fieldInfo);
                if ((obj != null ? '%' : Typography.dollar) == '$') {
                }
            } else {
                fieldInfo = it.next();
                obj = getFieldValue(m, fieldInfo);
                Object[] objArr = null;
                int length2 = objArr.length;
                if (obj == null) {
                }
            }
            try {
                sb.append(str);
                str = ", ";
                sb.append(fieldInfo.name);
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                if (fieldInfo.redacted) {
                    z = true;
                }
                if (z) {
                    obj = REDACTED;
                }
                sb.append(obj);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private int getSerializedSize(int i, Object obj, Message.Datatype datatype) {
        int i2 = toIntRange + 63;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        try {
            int varintTagSize = WireOutput.varintTagSize(i) + getSerializedSizeNoTag(obj, datatype);
            int i4 = IsOverlapping + 115;
            toIntRange = i4 % 128;
            int i5 = i4 % 2;
            return varintTagSize;
        } catch (Exception e) {
            throw e;
        }
    }

    private int getSerializedSizeNoTag(Object obj, Message.Datatype datatype) {
        int i = IsOverlapping + 57;
        toIntRange = i % 128;
        int i2 = i % 2;
        boolean z = true;
        switch (AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
                return WireOutput.int32Size(((Integer) obj).intValue());
            case 2:
            case 3:
                try {
                    try {
                        return WireOutput.varint64Size(((Long) obj).longValue());
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            case 4:
                return WireOutput.varint32Size(((Integer) obj).intValue());
            case 5:
                int varint32Size = WireOutput.varint32Size(WireOutput.zigZag32(((Integer) obj).intValue()));
                int i3 = IsOverlapping + 57;
                toIntRange = i3 % 128;
                int i4 = i3 % 2;
                return varint32Size;
            case 6:
                return WireOutput.varint64Size(WireOutput.zigZag64(((Long) obj).longValue()));
            case 7:
                return 1;
            case 8:
                return getEnumSize((ProtoEnum) obj);
            case 9:
                int utf8Length = utf8Length((String) obj);
                return WireOutput.varint32Size(utf8Length) + utf8Length;
            case 10:
                int size = ((printConnMonitorLog) obj).size();
                return WireOutput.varint32Size(size) + size;
            case 11:
                return getMessageSize((Message) obj);
            case 12:
            case 13:
            case 14:
                int i5 = IsOverlapping + 95;
                toIntRange = i5 % 128;
                if (i5 % 2 != 0) {
                    z = false;
                }
                if (z) {
                    return 4;
                }
                Object obj2 = null;
                super.hashCode();
                return 4;
            case 15:
            case 16:
            case 17:
                return 8;
            default:
                throw new RuntimeException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r3 <= 'N') goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if ((r3 <= 127 ? 'P' : 'b') != 'b') goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r3 > 2047) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r3 = toIntRange + 41;
        IsOverlapping = r3 % 128;
        r3 = r3 % 2;
        r2 = r2 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (java.lang.Character.isHighSurrogate(r3) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        r2 = r2 + 4;
        r1 = r1 + 1;
        r3 = IsOverlapping + 81;
        toIntRange = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int utf8Length(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 45
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            int r0 = r7.length()
            int r1 = toIntRange     // Catch:{ Exception -> 0x007a }
            int r1 = r1 + 37
            int r2 = r1 % 128
            IsOverlapping = r2     // Catch:{ Exception -> 0x007a }
            int r1 = r1 % 2
            r1 = 0
            r2 = 0
        L_0x001a:
            r3 = 10
            if (r1 >= r0) goto L_0x0021
            r4 = 55
            goto L_0x0023
        L_0x0021:
            r4 = 10
        L_0x0023:
            if (r4 == r3) goto L_0x0079
            int r3 = toIntRange
            int r3 = r3 + 119
            int r4 = r3 % 128
            IsOverlapping = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x003a
            char r3 = r7.charAt(r1)
            r4 = 78
            if (r3 > r4) goto L_0x004e
            goto L_0x004b
        L_0x003a:
            char r3 = r7.charAt(r1)     // Catch:{ Exception -> 0x007a }
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 98
            if (r3 > r4) goto L_0x0047
            r4 = 80
            goto L_0x0049
        L_0x0047:
            r4 = 98
        L_0x0049:
            if (r4 == r5) goto L_0x004e
        L_0x004b:
            int r2 = r2 + 1
            goto L_0x0076
        L_0x004e:
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r3 > r4) goto L_0x005f
            int r3 = toIntRange
            int r3 = r3 + 41
            int r4 = r3 % 128
            IsOverlapping = r4
            int r3 = r3 % 2
            int r2 = r2 + 2
            goto L_0x0076
        L_0x005f:
            boolean r3 = java.lang.Character.isHighSurrogate(r3)
            if (r3 == 0) goto L_0x0074
            int r2 = r2 + 4
            int r1 = r1 + 1
            int r3 = IsOverlapping
            int r3 = r3 + 81
            int r4 = r3 % 128
            toIntRange = r4
            int r3 = r3 % 2
            goto L_0x0076
        L_0x0074:
            int r2 = r2 + 3
        L_0x0076:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0079:
            return r2
        L_0x007a:
            r7 = move-exception
            goto L_0x007d
        L_0x007c:
            throw r7
        L_0x007d:
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.utf8Length(java.lang.String):int");
    }

    private <E extends ProtoEnum> int getEnumSize(E e) {
        try {
            int i = toIntRange + 11;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            int varint32Size = WireOutput.varint32Size(this.wire.enumAdapter(e.getClass()).toInt(e));
            int i3 = toIntRange + 67;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? 'X' : 'R') != 'X') {
                return varint32Size;
            }
            Object obj = null;
            super.hashCode();
            return varint32Size;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private <M extends Message> int getMessageSize(M m) {
        int i;
        int i2 = IsOverlapping + 15;
        toIntRange = i2 % 128;
        if (i2 % 2 == 0) {
            int serializedSize = m.getSerializedSize();
            i = WireOutput.varint32Size(serializedSize) + serializedSize;
        } else {
            int serializedSize2 = m.getSerializedSize();
            i = WireOutput.varint32Size(serializedSize2) / serializedSize2;
        }
        int i3 = IsOverlapping + 45;
        toIntRange = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    private void writeValue(WireOutput wireOutput, int i, Object obj, Message.Datatype datatype) throws IOException {
        int i2 = IsOverlapping + 99;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        try {
            wireOutput.writeTag(i, datatype.wireType());
            writeValueNoTag(wireOutput, obj, datatype);
            int i4 = IsOverlapping + 69;
            toIntRange = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private void writeValueNoTag(WireOutput wireOutput, Object obj, Message.Datatype datatype) throws IOException {
        int i = 1;
        switch (AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
                wireOutput.writeSignedVarint32(((Integer) obj).intValue());
                return;
            case 2:
            case 3:
                wireOutput.writeVarint64(((Long) obj).longValue());
                return;
            case 4:
                wireOutput.writeVarint32(((Integer) obj).intValue());
                return;
            case 5:
                wireOutput.writeVarint32(WireOutput.zigZag32(((Integer) obj).intValue()));
                return;
            case 6:
                wireOutput.writeVarint64(WireOutput.zigZag64(((Long) obj).longValue()));
                return;
            case 7:
                if (!(((Boolean) obj).booleanValue())) {
                    i = 0;
                } else {
                    int i2 = toIntRange + 57;
                    IsOverlapping = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                }
                wireOutput.writeRawByte(i);
                return;
            case 8:
                writeEnum((ProtoEnum) obj, wireOutput);
                return;
            case 9:
                byte[] bytes = ((String) obj).getBytes(setMax(-23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 108), Color.argb(0, 0, 0, 0) + 1732320751, -744321085 - KeyEvent.normalizeMetaState(0), (short) (1 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)))).intern());
                wireOutput.writeVarint32(bytes.length);
                wireOutput.writeRawBytes(bytes);
                return;
            case 10:
                printConnMonitorLog printconnmonitorlog = (printConnMonitorLog) obj;
                wireOutput.writeVarint32(printconnmonitorlog.size());
                wireOutput.writeRawBytes(printconnmonitorlog.toByteArray());
                return;
            case 11:
                writeMessage((Message) obj, wireOutput);
                return;
            case 12:
            case 13:
                wireOutput.writeFixed32(((Integer) obj).intValue());
                return;
            case 14:
                try {
                    wireOutput.writeFixed32(Float.floatToIntBits(((Float) obj).floatValue()));
                    return;
                } catch (Exception e) {
                    throw e;
                }
            case 15:
            case 16:
                wireOutput.writeFixed64(((Long) obj).longValue());
                int i3 = IsOverlapping + 53;
                toIntRange = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 18 / 0;
                    return;
                }
                return;
            case 17:
                wireOutput.writeFixed64(Double.doubleToLongBits(((Double) obj).doubleValue()));
                return;
            default:
                throw new RuntimeException();
        }
        throw e;
    }

    private <M extends Message> void writeMessage(M m, WireOutput wireOutput) throws IOException {
        int i = IsOverlapping + 87;
        toIntRange = i % 128;
        if ((i % 2 != 0 ? '5' : 1) != '5') {
            wireOutput.writeVarint32(m.getSerializedSize());
            this.wire.messageAdapter(m.getClass()).write(m, wireOutput);
            return;
        }
        wireOutput.writeVarint32(m.getSerializedSize());
        this.wire.messageAdapter(m.getClass()).write(m, wireOutput);
        Object[] objArr = null;
        int length2 = objArr.length;
    }

    private <E extends ProtoEnum> void writeEnum(E e, WireOutput wireOutput) throws IOException {
        int i = IsOverlapping + 83;
        toIntRange = i % 128;
        int i2 = i % 2;
        try {
            wireOutput.writeVarint32(this.wire.enumAdapter(e.getClass()).toInt(e));
            try {
                int i3 = IsOverlapping + 103;
                toIntRange = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.squareup.wire.MessageAdapter$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.squareup.wire.Extension} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.squareup.wire.Extension<com.squareup.wire.ExtendableMessage<?>, ?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.squareup.wire.Extension} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r0.hasNext() == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r5 = r0.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r1.fieldInfoMap.containsKey(r5) == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r6 = toIntRange + 7;
        IsOverlapping = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if ((r6 % 2) != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        setBuilderField(r2, r5, r3.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        setBuilderField(r2, r5, r3.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        setExtension((com.squareup.wire.ExtendableMessage) r2, getExtension(r5), r3.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = r3.getTags().iterator();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M read(com.squareup.wire.WireInput r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.Class<M> r2 = r1.messageType     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.Message r2 = (com.squareup.wire.Message) r2     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.MessageAdapter$Storage r3 = new com.squareup.wire.MessageAdapter$Storage     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r4 = 0
            r3.<init>(r4)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
        L_0x0012:
            int r5 = r18.readTag()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r6 = r5 >> 3
            com.squareup.wire.WireType r5 = com.squareup.wire.WireType.valueOf((int) r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r7 = 96
            if (r6 != 0) goto L_0x0023
            r8 = 27
            goto L_0x0025
        L_0x0023:
            r8 = 96
        L_0x0025:
            if (r8 == r7) goto L_0x0079
            java.util.Set r0 = r3.getTags()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
        L_0x002f:
            boolean r5 = r0.hasNext()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r5 == 0) goto L_0x0078
            java.lang.Object r5 = r0.next()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.TagMap<com.squareup.wire.MessageAdapter$FieldInfo> r6 = r1.fieldInfoMap     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            boolean r6 = r6.containsKey(r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r6 == 0) goto L_0x0069
            int r6 = toIntRange
            int r6 = r6 + 7
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0061
            java.util.List r6 = r3.get(r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r1.setBuilderField(r2, r5, r6)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            super.hashCode()     // Catch:{ all -> 0x005e }
            goto L_0x002f
        L_0x005e:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0061:
            java.util.List r6 = r3.get(r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r1.setBuilderField(r2, r5, r6)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x002f
        L_0x0069:
            r6 = r2
            com.squareup.wire.ExtendableMessage r6 = (com.squareup.wire.ExtendableMessage) r6     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.Extension r7 = r1.getExtension((int) r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            java.util.List r5 = r3.get(r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r1.setExtension(r6, r7, r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x002f
        L_0x0078:
            return r2
        L_0x0079:
            com.squareup.wire.TagMap<com.squareup.wire.MessageAdapter$FieldInfo> r7 = r1.fieldInfoMap     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.MessageAdapter$FieldInfo r7 = (com.squareup.wire.MessageAdapter.FieldInfo) r7     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r7 == 0) goto L_0x008a
            com.squareup.wire.Message$Datatype r8 = r7.datatype     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.Message$Label r7 = r7.label     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r9 = r8
            r8 = r4
            goto L_0x00a3
        L_0x008a:
            com.squareup.wire.Extension r7 = r1.getExtension((int) r6)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r7 != 0) goto L_0x0095
            r1.readUnknownField(r2, r0, r6, r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x0012
        L_0x0095:
            com.squareup.wire.Message$Datatype r8 = r7.getDatatype()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.Message$Label r9 = r7.getLabel()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r16 = r8
            r8 = r7
            r7 = r9
            r9 = r16
        L_0x00a3:
            boolean r10 = r7.isPacked()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r10 == 0) goto L_0x0123
            int r10 = toIntRange
            int r10 = r10 + 105
            int r11 = r10 % 128
            IsOverlapping = r11
            int r10 = r10 % 2
            com.squareup.wire.WireType r10 = com.squareup.wire.WireType.LENGTH_DELIMITED     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r11 = 69
            if (r5 != r10) goto L_0x00bc
            r5 = 56
            goto L_0x00be
        L_0x00bc:
            r5 = 69
        L_0x00be:
            if (r5 == r11) goto L_0x0123
            int r5 = r18.readVarint32()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r7 = r18.getPosition()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r10 = r0.pushLimit(r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
        L_0x00cc:
            long r11 = r18.getPosition()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r13 = (long) r5     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r13 = r13 + r7
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x010e
            java.lang.Object r11 = r1.readValue(r0, r6, r9)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.Message$Datatype r12 = com.squareup.wire.Message.Datatype.ENUM     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r9 != r12) goto L_0x010a
            boolean r12 = r11 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r12 == 0) goto L_0x010a
            int r12 = toIntRange
            int r12 = r12 + 65
            int r13 = r12 % 128
            IsOverlapping = r13
            int r12 = r12 % 2
            if (r12 != 0) goto L_0x00ff
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r11 = r11.intValue()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r11 = (long) r11     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r2.addVarint(r6, r11)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            super.hashCode()     // Catch:{ all -> 0x00fc }
            goto L_0x00cc
        L_0x00fc:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00ff:
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r11 = r11.intValue()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r11 = (long) r11     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r2.addVarint(r6, r11)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x00cc
        L_0x010a:
            r3.add(r6, r11)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x00cc
        L_0x010e:
            r0.popLimit(r10)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r5 = r18.getPosition()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x011b
            goto L_0x0012
        L_0x011b:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            java.lang.String r2 = "Packed data had wrong length!"
            r0.<init>(r2)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            throw r0     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
        L_0x0123:
            java.lang.Object r5 = r1.readValue(r0, r6, r9)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            com.squareup.wire.Message$Datatype r10 = com.squareup.wire.Message.Datatype.ENUM     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r9 != r10) goto L_0x0145
            int r9 = IsOverlapping
            int r9 = r9 + 77
            int r10 = r9 % 128
            toIntRange = r10
            int r9 = r9 % 2
            boolean r9 = r5 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r9 == 0) goto L_0x0145
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            long r7 = (long) r5     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r2.addVarint(r6, r7)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x0012
        L_0x0145:
            boolean r7 = r7.isRepeated()     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            if (r7 == 0) goto L_0x0150
            r3.add(r6, r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x0012
        L_0x0150:
            if (r8 == 0) goto L_0x0154
            r7 = 0
            goto L_0x0155
        L_0x0154:
            r7 = 1
        L_0x0155:
            if (r7 == 0) goto L_0x015c
            r1.setBuilderField(r2, r6, r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x0012
        L_0x015c:
            int r6 = toIntRange
            int r6 = r6 + 119
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0176
            r6 = r2
            com.squareup.wire.ExtendableMessage r6 = (com.squareup.wire.ExtendableMessage) r6     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r1.setExtension(r6, r8, r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            super.hashCode()     // Catch:{ all -> 0x0173 }
            goto L_0x0012
        L_0x0173:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0176:
            r6 = r2
            com.squareup.wire.ExtendableMessage r6 = (com.squareup.wire.ExtendableMessage) r6     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            r1.setExtension(r6, r8, r5)     // Catch:{ IllegalAccessException -> 0x0185, InstantiationException -> 0x017e }
            goto L_0x0012
        L_0x017e:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x0185:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            goto L_0x018d
        L_0x018c:
            throw r2
        L_0x018d:
            goto L_0x018c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.read(com.squareup.wire.WireInput):com.squareup.wire.Message");
    }

    private Object readValue(WireInput wireInput, int i, Message.Datatype datatype) throws IOException {
        int i2 = toIntRange + 53;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        try {
            switch (AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype[datatype.ordinal()]) {
                case 1:
                case 4:
                    return Integer.valueOf(wireInput.readVarint32());
                case 2:
                case 3:
                    return Long.valueOf(wireInput.readVarint64());
                case 5:
                    return Integer.valueOf(WireInput.decodeZigZag32(wireInput.readVarint32()));
                case 6:
                    return Long.valueOf(WireInput.decodeZigZag64(wireInput.readVarint64()));
                case 7:
                    return Boolean.valueOf(!(wireInput.readVarint32() == 0));
                case 8:
                    EnumAdapter<? extends ProtoEnum> enumAdapter = getEnumAdapter(i);
                    int readVarint32 = wireInput.readVarint32();
                    try {
                        return enumAdapter.fromInt(readVarint32);
                    } catch (IllegalArgumentException unused) {
                        return Integer.valueOf(readVarint32);
                    }
                case 9:
                    try {
                        return wireInput.readString();
                    } catch (Exception e) {
                        throw e;
                    }
                case 10:
                    return wireInput.readBytes();
                case 11:
                    return readMessage(wireInput, i);
                case 12:
                case 13:
                    return Integer.valueOf(wireInput.readFixed32());
                case 14:
                    return Float.valueOf(Float.intBitsToFloat(wireInput.readFixed32()));
                case 15:
                case 16:
                    return Long.valueOf(wireInput.readFixed64());
                case 17:
                    Double valueOf = Double.valueOf(Double.longBitsToDouble(wireInput.readFixed64()));
                    int i4 = toIntRange + 83;
                    IsOverlapping = i4 % 128;
                    int i5 = i4 % 2;
                    return valueOf;
                default:
                    throw new RuntimeException();
            }
            throw e;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r6.recursionDepth < 44) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        throw new java.io.IOException("Wire recursion limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r6.recursionDepth < 64) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.wire.Message readMessage(com.squareup.wire.WireInput r6, int r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = toIntRange
            int r0 = r0 + 11
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == 0) goto L_0x0020
            int r0 = r6.readVarint32()     // Catch:{ Exception -> 0x001e }
            int r3 = r6.recursionDepth     // Catch:{ Exception -> 0x001e }
            r4 = 64
            if (r3 >= r4) goto L_0x0062
            goto L_0x002a
        L_0x001e:
            r6 = move-exception
            goto L_0x006a
        L_0x0020:
            int r0 = r6.readVarint32()
            int r3 = r6.recursionDepth
            r4 = 44
            if (r3 >= r4) goto L_0x0062
        L_0x002a:
            int r0 = r6.pushLimit(r0)
            int r3 = r6.recursionDepth
            int r3 = r3 + r2
            r6.recursionDepth = r3
            com.squareup.wire.MessageAdapter r7 = r5.getMessageAdapter(r7)
            com.squareup.wire.Message r7 = r7.read(r6)
            r6.checkLastTagWas(r1)
            int r3 = r6.recursionDepth
            int r3 = r3 - r2
            r6.recursionDepth = r3
            r6.popLimit(r0)
            int r6 = toIntRange
            int r6 = r6 + 119
            int r0 = r6 % 128
            IsOverlapping = r0
            int r6 = r6 % 2
            r0 = 73
            if (r6 != 0) goto L_0x0057
            r6 = 62
            goto L_0x0059
        L_0x0057:
            r6 = 73
        L_0x0059:
            if (r6 == r0) goto L_0x0061
            r6 = 55
            int r6 = r6 / r1
            return r7
        L_0x005f:
            r6 = move-exception
            throw r6
        L_0x0061:
            return r7
        L_0x0062:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Wire recursion limit exceeded"
            r6.<init>(r7)
            throw r6
        L_0x006a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.readMessage(com.squareup.wire.WireInput, int):com.squareup.wire.Message");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.squareup.wire.MessageAdapter<? extends com.squareup.wire.Message> getMessageAdapter(int r4) {
        /*
            r3 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x0061 }
            int r0 = r0 + 85
            int r1 = r0 % 128
            toIntRange = r1     // Catch:{ Exception -> 0x0061 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x001b
            com.squareup.wire.TagMap<com.squareup.wire.MessageAdapter$FieldInfo> r0 = r3.fieldInfoMap
            java.lang.Object r0 = r0.get(r4)
            com.squareup.wire.MessageAdapter$FieldInfo r0 = (com.squareup.wire.MessageAdapter.FieldInfo) r0
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0040
            goto L_0x0025
        L_0x0019:
            r4 = move-exception
            throw r4
        L_0x001b:
            com.squareup.wire.TagMap<com.squareup.wire.MessageAdapter$FieldInfo> r0 = r3.fieldInfoMap     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x005f }
            com.squareup.wire.MessageAdapter$FieldInfo r0 = (com.squareup.wire.MessageAdapter.FieldInfo) r0     // Catch:{ Exception -> 0x0061 }
            if (r0 == 0) goto L_0x0040
        L_0x0025:
            int r1 = toIntRange
            int r1 = r1 + 117
            int r2 = r1 % 128
            IsOverlapping = r2
            int r1 = r1 % 2
            com.squareup.wire.MessageAdapter<? extends com.squareup.wire.Message> r1 = r0.messageAdapter
            r2 = 46
            if (r1 == 0) goto L_0x0038
            r1 = 46
            goto L_0x003a
        L_0x0038:
            r1 = 50
        L_0x003a:
            if (r1 == r2) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            com.squareup.wire.MessageAdapter<? extends com.squareup.wire.Message> r4 = r0.messageAdapter
            return r4
        L_0x0040:
            com.squareup.wire.Wire r1 = r3.wire
            java.lang.Class r4 = r3.getMessageClass(r4)
            com.squareup.wire.MessageAdapter r4 = r1.messageAdapter(r4)
            r1 = 1
            if (r0 == 0) goto L_0x004f
            r2 = 0
            goto L_0x0050
        L_0x004f:
            r2 = 1
        L_0x0050:
            if (r2 == r1) goto L_0x005e
            r0.messageAdapter = r4
            int r0 = IsOverlapping
            int r0 = r0 + 5
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
        L_0x005e:
            return r4
        L_0x005f:
            r4 = move-exception
            throw r4
        L_0x0061:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.getMessageAdapter(int):com.squareup.wire.MessageAdapter");
    }

    private EnumAdapter<? extends ProtoEnum> getEnumAdapter(int i) {
        int i2 = IsOverlapping + 11;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        try {
            FieldInfo fieldInfo = this.fieldInfoMap.get(i);
            if (!(fieldInfo == null)) {
                if ((fieldInfo.enumAdapter != null ? 15 : 'K') != 'K') {
                    int i4 = IsOverlapping + 123;
                    toIntRange = i4 % 128;
                    int i5 = i4 % 2;
                    return fieldInfo.enumAdapter;
                }
            }
            EnumAdapter<? extends ProtoEnum> enumAdapter = this.wire.enumAdapter(getEnumClass(i));
            if ((fieldInfo != null ? Typography.less : '!') == '<') {
                fieldInfo.enumAdapter = enumAdapter;
            }
            return enumAdapter;
        } catch (Exception e) {
            throw e;
        }
    }

    private Class<Message> getMessageClass(int i) {
        Class<? extends Message> cls;
        Class<? extends Message> messageType2;
        FieldInfo fieldInfo = this.fieldInfoMap.get(i);
        Class<? extends Message> cls2 = null;
        if (fieldInfo == null) {
            cls = cls2;
        } else {
            cls = fieldInfo.messageType;
        }
        boolean z = false;
        if (!(cls == null)) {
            return cls;
        }
        try {
            int i2 = toIntRange + 31;
            IsOverlapping = i2 % 128;
            int i3 = i2 % 2;
            Extension<ExtendableMessage<?>, ?> extension = getExtension(i);
            if ((extension != null ? '7' : '!') == '!') {
                return cls;
            }
            int i4 = toIntRange + 1;
            IsOverlapping = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
            if (!z) {
                try {
                    messageType2 = extension.getMessageType();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                messageType2 = extension.getMessageType();
                super.hashCode();
            }
            return messageType2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: com.squareup.wire.MessageAdapter$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$Message$Datatype;
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$WireType;

        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00bb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00d3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0103 */
        static {
            /*
                com.squareup.wire.WireType[] r0 = com.squareup.wire.WireType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$WireType = r0
                r1 = 1
                com.squareup.wire.WireType r2 = com.squareup.wire.WireType.VARINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.wire.WireType r3 = com.squareup.wire.WireType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.wire.WireType r4 = com.squareup.wire.WireType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.wire.WireType r5 = com.squareup.wire.WireType.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.wire.WireType r6 = com.squareup.wire.WireType.START_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.wire.WireType r7 = com.squareup.wire.WireType.END_GROUP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.squareup.wire.Message$Datatype[] r6 = com.squareup.wire.Message.Datatype.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                $SwitchMap$com$squareup$wire$Message$Datatype = r6
                com.squareup.wire.Message$Datatype r7 = com.squareup.wire.Message.Datatype.INT32     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.squareup.wire.Message$Datatype r6 = com.squareup.wire.Message.Datatype.INT64     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x006e }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.UINT64     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.UINT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SINT32     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x008c }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SINT64     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.BOOL     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.ENUM     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00af }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.STRING     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00bb }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.BYTES     // Catch:{ NoSuchFieldError -> 0x00bb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bb }
            L_0x00bb:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00d3 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.FIXED32     // Catch:{ NoSuchFieldError -> 0x00d3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d3 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d3 }
            L_0x00d3:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00df }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00df }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00df }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00eb }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.FLOAT     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00f7 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.FIXED64     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0103 }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0103 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0103 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0103 }
            L_0x0103:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x010f }
                com.squareup.wire.Message$Datatype r1 = com.squareup.wire.Message.Datatype.DOUBLE     // Catch:{ NoSuchFieldError -> 0x010f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010f }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010f }
            L_0x010f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.ensureUnknownFieldMap().addLengthDelimited(r6, r5.readBytes(r5.readVarint32()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r4.ensureUnknownFieldMap().addFixed64(r6, java.lang.Long.valueOf(r5.readFixed64()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r4.ensureUnknownFieldMap().addFixed32(r6, java.lang.Integer.valueOf(r5.readFixed32()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r4.ensureUnknownFieldMap().addVarint(r6, java.lang.Long.valueOf(r5.readVarint64()));
        r4 = IsOverlapping + 5;
        toIntRange = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0081, code lost:
        if ((r4 % 2) == 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r4 == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        throw new java.lang.RuntimeException("Unsupported wire type: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readUnknownField(com.squareup.wire.Message r4, com.squareup.wire.WireInput r5, int r6, com.squareup.wire.WireType r7) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = toIntRange
            int r0 = r0 + 13
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 39
            if (r0 != 0) goto L_0x0011
            r0 = 36
            goto L_0x0013
        L_0x0011:
            r0 = 39
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0025
            int[] r0 = com.squareup.wire.MessageAdapter.AnonymousClass1.$SwitchMap$com$squareup$wire$WireType
            int r1 = r7.ordinal()
            r0 = r0[r1]
            int r1 = r2.length     // Catch:{ all -> 0x0023 }
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x0058;
                case 3: goto L_0x0048;
                case 4: goto L_0x0036;
                case 5: goto L_0x0032;
                case 6: goto L_0x0031;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x008d
        L_0x0023:
            r4 = move-exception
            throw r4
        L_0x0025:
            int[] r0 = com.squareup.wire.MessageAdapter.AnonymousClass1.$SwitchMap$com$squareup$wire$WireType
            int r1 = r7.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0068;
                case 2: goto L_0x0058;
                case 3: goto L_0x0048;
                case 4: goto L_0x0036;
                case 5: goto L_0x0032;
                case 6: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x008d
        L_0x0031:
            return
        L_0x0032:
            r5.skipGroup()
            return
        L_0x0036:
            int r7 = r5.readVarint32()     // Catch:{ Exception -> 0x0046 }
            com.squareup.wire.UnknownFieldMap r4 = r4.ensureUnknownFieldMap()     // Catch:{ Exception -> 0x009d }
            o.printConnMonitorLog r5 = r5.readBytes(r7)     // Catch:{ Exception -> 0x009d }
            r4.addLengthDelimited(r6, r5)     // Catch:{ Exception -> 0x009d }
            return
        L_0x0046:
            r4 = move-exception
            throw r4
        L_0x0048:
            com.squareup.wire.UnknownFieldMap r4 = r4.ensureUnknownFieldMap()
            long r0 = r5.readFixed64()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r4.addFixed64(r6, r5)
            return
        L_0x0058:
            com.squareup.wire.UnknownFieldMap r4 = r4.ensureUnknownFieldMap()
            int r5 = r5.readFixed32()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.addFixed32(r6, r5)
            return
        L_0x0068:
            com.squareup.wire.UnknownFieldMap r4 = r4.ensureUnknownFieldMap()
            long r0 = r5.readVarint64()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r4.addVarint(r6, r5)
            int r4 = IsOverlapping
            int r4 = r4 + 5
            int r5 = r4 % 128
            toIntRange = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0085
            r4 = 0
            goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            if (r4 == 0) goto L_0x0089
            return
        L_0x0089:
            int r4 = r2.length     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r4 = move-exception
            throw r4
        L_0x008d:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Unsupported wire type: "
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r5 = r5.concat(r6)
            r4.<init>(r5)
            throw r4
        L_0x009d:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.readUnknownField(com.squareup.wire.Message, com.squareup.wire.WireInput, int, com.squareup.wire.WireType):void");
    }

    static class Storage {
        private Map<Integer, ImmutableList<Object>> map;

        private Storage() {
        }

        /* synthetic */ Storage(AnonymousClass1 r1) {
            this();
        }

        /* access modifiers changed from: package-private */
        public void add(int i, Object obj) {
            Map<Integer, ImmutableList<Object>> map2 = this.map;
            ImmutableList immutableList = map2 == null ? null : map2.get(Integer.valueOf(i));
            if (immutableList == null) {
                immutableList = new ImmutableList();
                if (this.map == null) {
                    this.map = new LinkedHashMap();
                }
                this.map.put(Integer.valueOf(i), immutableList);
            }
            immutableList.list.add(obj);
        }

        /* access modifiers changed from: package-private */
        public Set<Integer> getTags() {
            Map<Integer, ImmutableList<Object>> map2 = this.map;
            if (map2 == null) {
                return Collections.emptySet();
            }
            return map2.keySet();
        }

        /* access modifiers changed from: package-private */
        public List<Object> get(int i) {
            Map<Integer, ImmutableList<Object>> map2 = this.map;
            if (map2 == null) {
                return null;
            }
            return map2.get(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.squareup.wire.Extension<com.squareup.wire.ExtendableMessage<?>, ?>] */
    private Extension<ExtendableMessage<?>, ?> getExtension(int i) {
        try {
            ExtensionRegistry extensionRegistry = this.wire.registry;
            ? r4 = 0;
            if (!(extensionRegistry != null)) {
                int i2 = IsOverlapping + 107;
                toIntRange = i2 % 128;
                if ((i2 % 2 != 0 ? 'Q' : JSONLexer.EOI) != 26) {
                    int i3 = 93 / 0;
                }
                return r4;
            }
            try {
                Extension<ExtendableMessage<?>, ?> extension = extensionRegistry.getExtension(this.messageType, i);
                int i4 = toIntRange + 109;
                IsOverlapping = i4 % 128;
                if (i4 % 2 != 0) {
                    return extension;
                }
                int length2 = r4.length;
                return extension;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Extension<ExtendableMessage<?>, ?> getExtension(String str) {
        int i = toIntRange + 83;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            ExtensionRegistry extensionRegistry = this.wire.registry;
            if (!(extensionRegistry == null)) {
                return extensionRegistry.getExtension(this.messageType, str);
            }
            int i3 = toIntRange + 63;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            int i5 = toIntRange + 91;
            IsOverlapping = i5 % 128;
            int i6 = i5 % 2;
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    private void setExtension(ExtendableMessage extendableMessage, Extension<?, ?> extension, Object obj) {
        int i = IsOverlapping + 51;
        toIntRange = i % 128;
        boolean z = true;
        if (i % 2 == 0) {
            extendableMessage.setExtension(extension, obj);
        } else {
            try {
                extendableMessage.setExtension(extension, obj);
                Object obj2 = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i2 = toIntRange + 17;
            IsOverlapping = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            }
            if (!z) {
                int i3 = 31 / 0;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if ((r0 != null) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r0 == null ? 9 : '%') != '%') goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Class<? extends com.squareup.wire.ProtoEnum> getEnumClass(int r7) {
        /*
            r6 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 47
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0028
            com.squareup.wire.TagMap<com.squareup.wire.MessageAdapter$FieldInfo> r0 = r6.fieldInfoMap
            java.lang.Object r0 = r0.get(r7)
            com.squareup.wire.MessageAdapter$FieldInfo r0 = (com.squareup.wire.MessageAdapter.FieldInfo) r0
            super.hashCode()     // Catch:{ all -> 0x0026 }
            r4 = 37
            if (r0 != 0) goto L_0x0021
            r5 = 9
            goto L_0x0023
        L_0x0021:
            r5 = 37
        L_0x0023:
            if (r5 == r4) goto L_0x0037
            goto L_0x003a
        L_0x0026:
            r7 = move-exception
            throw r7
        L_0x0028:
            com.squareup.wire.TagMap<com.squareup.wire.MessageAdapter$FieldInfo> r0 = r6.fieldInfoMap     // Catch:{ Exception -> 0x0089 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x0089 }
            com.squareup.wire.MessageAdapter$FieldInfo r0 = (com.squareup.wire.MessageAdapter.FieldInfo) r0     // Catch:{ Exception -> 0x0089 }
            if (r0 != 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x003a
        L_0x0037:
            java.lang.Class<? extends com.squareup.wire.ProtoEnum> r0 = r0.enumType
            goto L_0x003b
        L_0x003a:
            r0 = r1
        L_0x003b:
            r4 = 72
            if (r0 != 0) goto L_0x0042
            r5 = 72
            goto L_0x0044
        L_0x0042:
            r5 = 92
        L_0x0044:
            if (r5 == r4) goto L_0x0047
            goto L_0x0088
        L_0x0047:
            int r4 = toIntRange
            int r4 = r4 + 83
            int r5 = r4 % 128
            IsOverlapping = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0062
            com.squareup.wire.Extension r7 = r6.getExtension((int) r7)
            r4 = 54
            int r4 = r4 / r2
            if (r7 == 0) goto L_0x005d
            r2 = 1
        L_0x005d:
            if (r2 == r3) goto L_0x006c
            goto L_0x0088
        L_0x0060:
            r7 = move-exception
            throw r7
        L_0x0062:
            com.squareup.wire.Extension r7 = r6.getExtension((int) r7)
            if (r7 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = 1
        L_0x006a:
            if (r2 == r3) goto L_0x0088
        L_0x006c:
            int r0 = toIntRange
            int r0 = r0 + 53
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0084
            java.lang.Class r0 = r7.getEnumType()     // Catch:{ Exception -> 0x0082 }
            super.hashCode()     // Catch:{ all -> 0x0080 }
            goto L_0x0088
        L_0x0080:
            r7 = move-exception
            throw r7
        L_0x0082:
            r7 = move-exception
            throw r7
        L_0x0084:
            java.lang.Class r0 = r7.getEnumType()
        L_0x0088:
            return r0
        L_0x0089:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.getEnumClass(int):java.lang.Class");
    }

    static class ImmutableList<T> extends AbstractList<T> implements Cloneable, RandomAccess, Serializable {
        /* access modifiers changed from: private */
        public final List<T> list = new ArrayList();

        public Object clone() {
            return this;
        }

        ImmutableList() {
        }

        public int size() {
            return this.list.size();
        }

        public T get(int i) {
            return this.list.get(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if ((length != null ? (char) 24 : 1) != 24) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        if ((r6 != null ? kotlin.text.Typography.amp : 'U') != 'U') goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r6 = (short) (setMin[getMax + r8] + setMax);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, int r8, int r9, short r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = setMax     // Catch:{ Exception -> 0x00b1 }
            int r6 = r6 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r6 != r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x005d
            int r6 = toIntRange
            int r6 = r6 + 11
            int r4 = r6 % 128
            IsOverlapping = r4
            int r6 = r6 % 2
            r4 = 55
            if (r6 != 0) goto L_0x0023
            r6 = 55
            goto L_0x0025
        L_0x0023:
            r6 = 99
        L_0x0025:
            if (r6 == r4) goto L_0x0034
            byte[] r6 = length
            r4 = 24
            if (r6 == 0) goto L_0x0030
            r6 = 24
            goto L_0x0031
        L_0x0030:
            r6 = 1
        L_0x0031:
            if (r6 == r4) goto L_0x0043
            goto L_0x004f
        L_0x0034:
            byte[] r6 = length
            r4 = 0
            int r4 = r4.length     // Catch:{ all -> 0x005b }
            r4 = 85
            if (r6 == 0) goto L_0x003f
            r6 = 38
            goto L_0x0041
        L_0x003f:
            r6 = 85
        L_0x0041:
            if (r6 == r4) goto L_0x004f
        L_0x0043:
            byte[] r6 = length
            int r4 = getMax
            int r4 = r4 + r8
            byte r6 = r6[r4]
            int r4 = setMax
            int r6 = r6 + r4
            byte r6 = (byte) r6
            goto L_0x005d
        L_0x004f:
            short[] r6 = setMin
            int r4 = getMax
            int r4 = r4 + r8
            short r6 = r6[r4]
            int r4 = setMax
            int r6 = r6 + r4
            short r6 = (short) r6
            goto L_0x005d
        L_0x005b:
            r6 = move-exception
            throw r6
        L_0x005d:
            if (r6 <= 0) goto L_0x00ac
            int r4 = toIntRange
            int r4 = r4 + 51
            int r5 = r4 % 128
            IsOverlapping = r5
            int r4 = r4 % 2
            int r8 = r8 + r6
            int r8 = r8 + -2
            int r4 = getMax
            int r8 = r8 + r4
            if (r1 == 0) goto L_0x0073
            r1 = 1
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r8 = r8 + r1
            int r1 = getMin
            int r9 = r9 + r1
            char r9 = (char) r9
            r0.append(r9)
            r1 = 1
        L_0x007d:
            if (r1 >= r6) goto L_0x0081
            r4 = 0
            goto L_0x0082
        L_0x0081:
            r4 = 1
        L_0x0082:
            if (r4 == r3) goto L_0x00ac
            byte[] r4 = length     // Catch:{ Exception -> 0x00aa }
            if (r4 == 0) goto L_0x008a
            r4 = 1
            goto L_0x008b
        L_0x008a:
            r4 = 0
        L_0x008b:
            if (r4 == r3) goto L_0x009b
            short[] r4 = setMin     // Catch:{ Exception -> 0x00b1 }
            int r5 = r8 + -1
            short r8 = r4[r8]
            int r8 = r8 + r10
            short r8 = (short) r8
        L_0x0095:
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
            r9 = r8
            r8 = r5
            goto L_0x00a4
        L_0x009b:
            byte[] r4 = length
            int r5 = r8 + -1
            byte r8 = r4[r8]
            int r8 = r8 + r10
            byte r8 = (byte) r8
            goto L_0x0095
        L_0x00a4:
            r0.append(r9)
            int r1 = r1 + 1
            goto L_0x007d
        L_0x00aa:
            r6 = move-exception
            throw r6
        L_0x00ac:
            java.lang.String r6 = r0.toString()
            return r6
        L_0x00b1:
            r6 = move-exception
            goto L_0x00b4
        L_0x00b3:
            throw r6
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.wire.MessageAdapter.setMax(int, byte, int, int, short):java.lang.String");
    }
}
