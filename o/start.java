package o;

import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.parser.JSONLexer;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.zoloz.wire.Message;
import com.zoloz.wire.ProtoField;
import com.zoloz.wire.WireType;
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
import o.RecyclerView;

public final class start<M extends Message> {
    private static final String FULL_BLOCK = "█";
    private static int IsOverlapping = 1;
    private static final String REDACTED = "██";
    private static short[] getMax = null;
    private static int getMin = -1832146168;
    private static int length = 1046827029;
    private static int setMax = 34;
    private static byte[] setMin = {-29, -71, -107, -96, -83};
    private static int toIntRange;
    private final setTargetPosition<length> fieldInfoMap;
    private final Class<M> messageType;
    private final Map<String, Integer> tagMap = new LinkedHashMap();
    private final isRunning wire;

    public static final class length {
        /* access modifiers changed from: private */
        public final Field builderField;
        final Message.Datatype datatype;
        getViewLayoutPosition<? extends RecyclerView.SavedState> enumAdapter;
        final Class<? extends RecyclerView.SavedState> enumType;
        final Message.Label label;
        start<? extends Message> messageAdapter;
        /* access modifiers changed from: private */
        public final Field messageField;
        final Class<? extends Message> messageType;
        final String name;
        final boolean redacted;
        final int tag;

        /* synthetic */ length(int i, String str, Message.Datatype datatype2, Message.Label label2, boolean z, Class cls, Field field, Field field2, AnonymousClass1 r9) {
            this(i, str, datatype2, label2, z, cls, field, field2);
        }

        private length(int i, String str, Message.Datatype datatype2, Message.Label label2, boolean z, Class<?> cls, Field field, Field field2) {
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
    public final Collection<length> getFields() {
        int i = toIntRange + 115;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        Collection<length> values = this.fieldInfoMap.values();
        int i3 = IsOverlapping + 47;
        toIntRange = i3 % 128;
        int i4 = i3 % 2;
        return values;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r4 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        return r3.fieldInfoMap.get(r4.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 != true) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.start.length getField(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 113
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
            if (r0 == r2) goto L_0x0022
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.tagMap
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            if (r1 == r2) goto L_0x004c
            goto L_0x002f
        L_0x0022:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.tagMap
            java.lang.Object r4 = r0.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0 = 14
            int r0 = r0 / r1
            if (r4 != 0) goto L_0x004c
        L_0x002f:
            int r4 = IsOverlapping
            int r4 = r4 + 35
            int r0 = r4 % 128
            toIntRange = r0
            int r4 = r4 % 2
            r0 = 9
            if (r4 == 0) goto L_0x0040
            r4 = 36
            goto L_0x0042
        L_0x0040:
            r4 = 9
        L_0x0042:
            r1 = 0
            if (r4 == r0) goto L_0x004b
            super.hashCode()     // Catch:{ all -> 0x0049 }
            return r1
        L_0x0049:
            r4 = move-exception
            throw r4
        L_0x004b:
            return r1
        L_0x004c:
            o.setTargetPosition<o.start$length> r0 = r3.fieldInfoMap
            int r4 = r4.intValue()
            java.lang.Object r4 = r0.get(r4)
            o.start$length r4 = (o.start.length) r4
            return r4
        L_0x0059:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.getField(java.lang.String):o.start$length");
    }

    /* access modifiers changed from: package-private */
    public final Object getFieldValue(M m, length length2) {
        int i = toIntRange + 85;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            if (length2.messageField != null) {
                try {
                    Object obj = length2.messageField.get(m);
                    try {
                        int i3 = toIntRange + 11;
                        IsOverlapping = i3 % 128;
                        int i4 = i3 % 2;
                        return obj;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            } else {
                throw new AssertionError("Field is not of type \"Message\"");
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public final void setBuilderField(M m, int i, Object obj) {
        int i2 = IsOverlapping + 49;
        toIntRange = i2 % 128;
        if ((i2 % 2 != 0 ? 6 : 'a') != 6) {
            try {
                this.fieldInfoMap.get(i).builderField.set(m, obj);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } else {
            this.fieldInfoMap.get(i).builderField.set(m, obj);
            Object[] objArr = null;
            int length2 = objArr.length;
        }
    }

    start(isRunning isrunning, Class<M> cls) {
        ProtoField protoField;
        Field field;
        this.wire = isrunning;
        this.messageType = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        int length2 = declaredFields.length;
        int i = 0;
        while (true) {
            if ((i < length2 ? 31 : '0') != '0') {
                int i2 = IsOverlapping + 125;
                toIntRange = i2 % 128;
                if (i2 % 2 != 0) {
                    field = declaredFields[i];
                    protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                    try {
                        int i3 = 51 / 0;
                        if ((protoField != null ? '[' : 'P') != '[') {
                            i++;
                            int i4 = toIntRange + 89;
                            IsOverlapping = i4 % 128;
                            int i5 = i4 % 2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    field = declaredFields[i];
                    protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                    if ((protoField != null ? '4' : 24) != '4') {
                        i++;
                        int i42 = toIntRange + 89;
                        IsOverlapping = i42 % 128;
                        int i52 = i42 % 2;
                    }
                }
                try {
                    int tag = protoField.tag();
                    String name = field.getName();
                    this.tagMap.put(name, Integer.valueOf(tag));
                    Class cls2 = null;
                    Message.Datatype type = protoField.type();
                    if (type == Message.Datatype.ENUM) {
                        int i6 = IsOverlapping + 63;
                        toIntRange = i6 % 128;
                        int i7 = i6 % 2;
                        cls2 = getEnumType(field);
                    } else {
                        if ((type == Message.Datatype.MESSAGE ? (char) 27 : 13) == 27) {
                            cls2 = getMessageType(field);
                        }
                    }
                    linkedHashMap.put(Integer.valueOf(tag), new length(tag, name, type, protoField.label(), protoField.redacted(), cls2, field, getBuilderField(name), (AnonymousClass1) null));
                    i++;
                    int i422 = toIntRange + 89;
                    IsOverlapping = i422 % 128;
                    int i522 = i422 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                this.fieldInfoMap = setTargetPosition.of(linkedHashMap);
                return;
            }
        }
    }

    private Class<Message.setMax<M>> getBuilderType(Class<M> cls) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append("$Builder");
            boolean z = true;
            Class<?> cls2 = Class.forName(sb.toString(), true, cls.getClassLoader());
            int i = toIntRange + 69;
            IsOverlapping = i % 128;
            if (i % 2 != 0) {
                z = false;
            }
            if (!z) {
                return cls2;
            }
            int i2 = 76 / 0;
            return cls2;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("No builder class found for message type ");
            sb2.append(cls.getName());
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private Field getBuilderField(String str) {
        int i = IsOverlapping + 85;
        toIntRange = i % 128;
        int i2 = i % 2;
        try {
            Field field = this.messageType.getField(str);
            int i3 = toIntRange + 99;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb = new StringBuilder("No builder field ");
            sb.append(this.messageType.getName());
            sb.append(".");
            sb.append(str);
            throw new AssertionError(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if ((com.zoloz.wire.Message.class.isAssignableFrom(r0) ? (char) 19 : 30) != 19) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (com.zoloz.wire.Message.class.isAssignableFrom(r0) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (java.util.List.class.isAssignableFrom(r0) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r0 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0 = ']';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r0 == 22) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        r0 = toIntRange + 69;
        IsOverlapping = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if ((r0 % 2) != 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r6 = ((java.lang.reflect.ParameterizedType) r6.getGenericType()).getActualTypeArguments()[1];
        r0 = r6 instanceof java.lang.Class;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        r6 = ((java.lang.reflect.ParameterizedType) r6.getGenericType()).getActualTypeArguments()[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if ((r6 instanceof java.lang.Class) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        r0 = 'I';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r0 = 'b';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r0 == 'b') goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r0 = toIntRange + 37;
        IsOverlapping = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (com.zoloz.wire.Message.class.isAssignableFrom((java.lang.Class) r6) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r0 = toIntRange + 81;
        IsOverlapping = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009e, code lost:
        if ((r0 % 2) != 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a0, code lost:
        r0 = 'A';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        r0 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r0 == 19) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3 = 69 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00aa, code lost:
        return (java.lang.Class) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00af, code lost:
        return (java.lang.Class) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b0, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b1, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Class<com.zoloz.wire.Message> getMessageType(java.lang.reflect.Field r6) {
        /*
            r5 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x00b4 }
            int r0 = r0 + 123
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 19
            if (r0 == 0) goto L_0x0028
            java.lang.Class r0 = r6.getType()
            java.lang.Class<com.zoloz.wire.Message> r3 = com.zoloz.wire.Message.class
            boolean r3 = r3.isAssignableFrom(r0)
            r4 = 70
            int r4 = r4 / r1
            if (r3 == 0) goto L_0x0021
            r3 = 19
            goto L_0x0023
        L_0x0021:
            r3 = 30
        L_0x0023:
            if (r3 == r2) goto L_0x0034
            goto L_0x0035
        L_0x0026:
            r6 = move-exception
            throw r6
        L_0x0028:
            java.lang.Class r0 = r6.getType()
            java.lang.Class<com.zoloz.wire.Message> r3 = com.zoloz.wire.Message.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L_0x0035
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.Class<java.util.List> r3 = java.util.List.class
            boolean r0 = r3.isAssignableFrom(r0)
            r3 = 22
            if (r0 == 0) goto L_0x0042
            r0 = 22
            goto L_0x0044
        L_0x0042:
            r0 = 93
        L_0x0044:
            if (r0 == r3) goto L_0x0047
            goto L_0x00b2
        L_0x0047:
            int r0 = toIntRange
            r3 = 69
            int r0 = r0 + r3
            int r4 = r0 % 128
            IsOverlapping = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0066
            java.lang.reflect.Type r6 = r6.getGenericType()
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            r0 = 1
            r6 = r6[r0]
            boolean r0 = r6 instanceof java.lang.Class
            if (r0 == 0) goto L_0x00b2
            goto L_0x007f
        L_0x0066:
            java.lang.reflect.Type r6 = r6.getGenericType()
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type[] r6 = r6.getActualTypeArguments()
            r6 = r6[r1]
            boolean r0 = r6 instanceof java.lang.Class
            r4 = 98
            if (r0 == 0) goto L_0x007b
            r0 = 73
            goto L_0x007d
        L_0x007b:
            r0 = 98
        L_0x007d:
            if (r0 == r4) goto L_0x00b2
        L_0x007f:
            int r0 = toIntRange
            int r0 = r0 + 37
            int r4 = r0 % 128
            IsOverlapping = r4
            int r0 = r0 % 2
            java.lang.Class<com.zoloz.wire.Message> r0 = com.zoloz.wire.Message.class
            r4 = r6
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ Exception -> 0x00b0 }
            boolean r0 = r0.isAssignableFrom(r4)     // Catch:{ Exception -> 0x00b0 }
            if (r0 == 0) goto L_0x00b2
            int r0 = toIntRange
            int r0 = r0 + 81
            int r4 = r0 % 128
            IsOverlapping = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00a3
            r0 = 65
            goto L_0x00a5
        L_0x00a3:
            r0 = 19
        L_0x00a5:
            if (r0 == r2) goto L_0x00ad
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ Exception -> 0x00b4 }
            int r3 = r3 / r1
            return r6
        L_0x00ab:
            r6 = move-exception
            throw r6
        L_0x00ad:
            java.lang.Class r6 = (java.lang.Class) r6
            return r6
        L_0x00b0:
            r6 = move-exception
            throw r6
        L_0x00b2:
            r6 = 0
            return r6
        L_0x00b4:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.getMessageType(java.lang.reflect.Field):java.lang.Class");
    }

    private Class<Enum> getEnumType(Field field) {
        try {
            Class<?> type = field.getType();
            Class<Enum> cls = null;
            if (Enum.class.isAssignableFrom(type)) {
                int i = toIntRange + 103;
                IsOverlapping = i % 128;
                int i2 = i % 2;
                int i3 = toIntRange + 101;
                IsOverlapping = i3 % 128;
                if (i3 % 2 != 0) {
                    return type;
                }
                super.hashCode();
                return type;
            }
            if ((List.class.isAssignableFrom(type) ? (char) 16 : 18) == 16) {
                try {
                    boolean z = false;
                    Type type2 = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        int i4 = toIntRange + 115;
                        IsOverlapping = i4 % 128;
                        int i5 = i4 % 2;
                        Class<Enum> cls2 = (Class) type2;
                        if (!Enum.class.isAssignableFrom(cls2)) {
                            z = true;
                        }
                        if (!z) {
                            return cls2;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            return cls;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int getSerializedSize(M m) {
        int repeatedSize;
        int i = toIntRange + 35;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        Iterator<length> it = getFields().iterator();
        int i3 = 0;
        while (true) {
            try {
                if ((it.hasNext() ? 12 : ']') == ']') {
                    break;
                }
                length next = it.next();
                Object fieldValue = getFieldValue(m, next);
                if (fieldValue != null) {
                    int i4 = next.tag;
                    Message.Datatype datatype = next.datatype;
                    Message.Label label = next.label;
                    if (!label.isRepeated()) {
                        i3 += getSerializedSize(i4, fieldValue, datatype);
                        int i5 = IsOverlapping + 99;
                        toIntRange = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        int i7 = IsOverlapping + 89;
                        toIntRange = i7 % 128;
                        int i8 = i7 % 2;
                        if (label.isPacked()) {
                            int i9 = toIntRange + 21;
                            IsOverlapping = i9 % 128;
                            int i10 = i9 % 2;
                            repeatedSize = getPackedSize((List) fieldValue, i4, datatype);
                        } else {
                            repeatedSize = getRepeatedSize((List) fieldValue, i4, datatype);
                        }
                        i3 += repeatedSize;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        if (m instanceof getAbsoluteAdapterPosition) {
            getAbsoluteAdapterPosition getabsoluteadapterposition = (getAbsoluteAdapterPosition) m;
            if (getabsoluteadapterposition.extensionMap != null) {
                i3 += getExtensionsSerializedSize(getabsoluteadapterposition.extensionMap);
            }
        }
        return i3 + m.getUnknownFieldsSerializedSize();
    }

    private <T extends getAbsoluteAdapterPosition<?>> int getExtensionsSerializedSize(getViewPosition<T> getviewposition) {
        int serializedSize;
        int i = toIntRange + 27;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if ((i3 < getviewposition.size() ? 'c' : 'L') == 'L') {
                return i4;
            }
            getViewAdapterPosition<T, ?> extension = getviewposition.getExtension(i3);
            Object extensionValue = getviewposition.getExtensionValue(i3);
            int tag = extension.getTag();
            Message.Datatype datatype = extension.getDatatype();
            Message.Label label = extension.getLabel();
            if (label.isRepeated()) {
                if ((label.isPacked() ? '4' : 8) != '4') {
                    i4 += getRepeatedSize((List) extensionValue, tag, datatype);
                    int i5 = IsOverlapping + 63;
                    toIntRange = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    int i7 = toIntRange + 21;
                    IsOverlapping = i7 % 128;
                    if (i7 % 2 == 0) {
                        i4 -= getPackedSize((List) extensionValue, tag, datatype);
                    } else {
                        serializedSize = getPackedSize((List) extensionValue, tag, datatype);
                    }
                }
                i3++;
            } else {
                serializedSize = getSerializedSize(tag, extensionValue, datatype);
            }
            i4 += serializedSize;
            i3++;
        }
    }

    private int getRepeatedSize(List<?> list, int i, Message.Datatype datatype) {
        try {
            int i2 = IsOverlapping + 115;
            try {
                toIntRange = i2 % 128;
                int i3 = i2 % 2;
                Iterator<?> it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        return i4;
                    }
                    i4 += getSerializedSize(i, it.next(), datatype);
                    int i5 = toIntRange + 65;
                    IsOverlapping = i5 % 128;
                    int i6 = i5 % 2;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private int getPackedSize(List<?> list, int i, Message.Datatype datatype) {
        int i2 = 0;
        try {
            Iterator<?> it = list.iterator();
            try {
                int i3 = toIntRange + 39;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                while (true) {
                    if ((it.hasNext() ? '8' : 16) == 16) {
                        return onAnimation.varint32Size(onAnimation.makeTag(i, WireType.LENGTH_DELIMITED)) + onAnimation.varint32Size(i2) + i2;
                    }
                    int i5 = IsOverlapping + 85;
                    toIntRange = i5 % 128;
                    int i6 = i5 % 2;
                    i2 += getSerializedSizeNoTag(it.next(), datatype);
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2.isRepeated() != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if ((r6) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        writeValue(r9, r3, r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(M r8, o.onAnimation r9) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = toIntRange
            int r0 = r0 + 5
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0019
            java.util.Collection r0 = r7.getFields()
            java.util.Iterator r0 = r0.iterator()
            int r2 = r1.length     // Catch:{ all -> 0x0017 }
            goto L_0x0021
        L_0x0017:
            r8 = move-exception
            throw r8
        L_0x0019:
            java.util.Collection r0 = r7.getFields()     // Catch:{ Exception -> 0x00b4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00b4 }
        L_0x0021:
            boolean r2 = r0.hasNext()
            r3 = 93
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0096 }
            o.start$length r2 = (o.start.length) r2     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object r4 = r7.getFieldValue(r8, r2)     // Catch:{ Exception -> 0x00b4 }
            if (r4 == 0) goto L_0x0021
            int r5 = toIntRange
            int r5 = r5 + r3
            int r3 = r5 % 128
            IsOverlapping = r3
            int r5 = r5 % 2
            r3 = 8
            if (r5 != 0) goto L_0x0045
            r5 = 8
            goto L_0x0047
        L_0x0045:
            r5 = 57
        L_0x0047:
            if (r5 == r3) goto L_0x0056
            int r3 = r2.tag
            com.zoloz.wire.Message$Datatype r5 = r2.datatype
            com.zoloz.wire.Message$Label r2 = r2.label
            boolean r6 = r2.isRepeated()
            if (r6 == 0) goto L_0x0090
            goto L_0x006a
        L_0x0056:
            int r3 = r2.tag
            com.zoloz.wire.Message$Datatype r5 = r2.datatype
            com.zoloz.wire.Message$Label r2 = r2.label
            boolean r6 = r2.isRepeated()
            super.hashCode()     // Catch:{ all -> 0x0094 }
            if (r6 == 0) goto L_0x0067
            r6 = 1
            goto L_0x0068
        L_0x0067:
            r6 = 0
        L_0x0068:
            if (r6 == 0) goto L_0x0090
        L_0x006a:
            boolean r2 = r2.isPacked()
            if (r2 == 0) goto L_0x008a
            int r2 = IsOverlapping
            int r2 = r2 + 35
            int r6 = r2 % 128
            toIntRange = r6
            int r2 = r2 % 2
            java.util.List r4 = (java.util.List) r4
            r7.writePacked(r9, r4, r3, r5)
            int r2 = IsOverlapping
            int r2 = r2 + 9
            int r3 = r2 % 128
            toIntRange = r3
            int r2 = r2 % 2
            goto L_0x0021
        L_0x008a:
            java.util.List r4 = (java.util.List) r4
            r7.writeRepeated(r9, r4, r3, r5)
            goto L_0x0021
        L_0x0090:
            r7.writeValue(r9, r3, r4, r5)
            goto L_0x0021
        L_0x0094:
            r8 = move-exception
            throw r8
        L_0x0096:
            r8 = move-exception
            throw r8
        L_0x0098:
            boolean r0 = r8 instanceof o.getAbsoluteAdapterPosition
            if (r0 == 0) goto L_0x009f
            r0 = 93
            goto L_0x00a1
        L_0x009f:
            r0 = 83
        L_0x00a1:
            if (r0 == r3) goto L_0x00a4
            goto L_0x00b0
        L_0x00a4:
            r0 = r8
            o.getAbsoluteAdapterPosition r0 = (o.getAbsoluteAdapterPosition) r0
            o.getViewPosition<T> r1 = r0.extensionMap
            if (r1 == 0) goto L_0x00b0
            o.getViewPosition<T> r0 = r0.extensionMap
            r7.writeExtensions(r9, r0)
        L_0x00b0:
            r8.writeUnknownFieldMap(r9)
            return
        L_0x00b4:
            r8 = move-exception
            goto L_0x00b7
        L_0x00b6:
            throw r8
        L_0x00b7:
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.write(com.zoloz.wire.Message, o.onAnimation):void");
    }

    private <T extends getAbsoluteAdapterPosition<?>> void writeExtensions(onAnimation onanimation, getViewPosition<T> getviewposition) throws IOException {
        int i = IsOverlapping + 51;
        toIntRange = i % 128;
        if (i % 2 != 0) {
        }
        int i2 = 0;
        while (true) {
            if ((i2 < getviewposition.size() ? 13 : '8') == 13) {
                getViewAdapterPosition<T, ?> extension = getviewposition.getExtension(i2);
                Object extensionValue = getviewposition.getExtensionValue(i2);
                int tag = extension.getTag();
                Message.Datatype datatype = extension.getDatatype();
                Message.Label label = extension.getLabel();
                if (label.isRepeated()) {
                    try {
                        if (label.isPacked()) {
                            try {
                                int i3 = toIntRange + 47;
                                IsOverlapping = i3 % 128;
                                if (i3 % 2 == 0) {
                                    writePacked(onanimation, (List) extensionValue, tag, datatype);
                                    Object[] objArr = null;
                                    int length2 = objArr.length;
                                } else {
                                    writePacked(onanimation, (List) extensionValue, tag, datatype);
                                }
                            } catch (Exception e) {
                                throw e;
                            }
                        } else {
                            writeRepeated(onanimation, (List) extensionValue, tag, datatype);
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    writeValue(onanimation, tag, extensionValue, datatype);
                }
                i2++;
                int i4 = IsOverlapping + 53;
                toIntRange = i4 % 128;
                int i5 = i4 % 2;
            } else {
                return;
            }
        }
    }

    private void writeRepeated(onAnimation onanimation, List<?> list, int i, Message.Datatype datatype) throws IOException {
        Iterator<?> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i2 = IsOverlapping + 43;
                toIntRange = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = toIntRange + 125;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            try {
                writeValue(onanimation, i, it.next(), datatype);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private void writePacked(onAnimation onanimation, List<?> list, int i, Message.Datatype datatype) throws IOException {
        int i2 = toIntRange + 87;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        Iterator<?> it = list.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                try {
                    break;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                i4 += getSerializedSizeNoTag(it.next(), datatype);
            }
        }
        onanimation.writeTag(i, WireType.LENGTH_DELIMITED);
        onanimation.writeVarint32(i4);
        Iterator<?> it2 = list.iterator();
        int i5 = toIntRange + 101;
        IsOverlapping = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            if (!(!it2.hasNext())) {
                try {
                    int i7 = toIntRange + 39;
                    IsOverlapping = i7 % 128;
                    int i8 = i7 % 2;
                    writeValueNoTag(onanimation, it2.next(), datatype);
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                return;
            }
        }
    }

    public final byte[] toByteArray(M m) {
        byte[] bArr;
        int i = IsOverlapping + 11;
        toIntRange = i % 128;
        if (!(i % 2 == 0)) {
            bArr = new byte[getSerializedSize(m)];
            try {
                write(m, onAnimation.newInstance(bArr));
                Object obj = null;
                super.hashCode();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            bArr = new byte[getSerializedSize(m)];
            write(m, onAnimation.newInstance(bArr));
        }
        try {
            int i2 = toIntRange + 95;
            try {
                IsOverlapping = i2 % 128;
                int i3 = i2 % 2;
                return bArr;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public final String toString(M m) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append("{");
        Iterator<length> it = getFields().iterator();
        String str = "";
        while (true) {
            if ((it.hasNext() ? (char) 16 : 23) != 16) {
                if ((m instanceof getAbsoluteAdapterPosition ? 'J' : JSONLexer.EOI) == 'J') {
                    try {
                        getAbsoluteAdapterPosition getabsoluteadapterposition = (getAbsoluteAdapterPosition) m;
                        sb.append(str);
                        sb.append("{extensions=");
                        sb.append(getabsoluteadapterposition.extensionsToString());
                        sb.append("}");
                    } catch (Exception e) {
                        throw e;
                    }
                }
                sb.append("}");
                return sb.toString();
            }
            length next = it.next();
            Object fieldValue = getFieldValue(m, next);
            if ((fieldValue != null ? ' ' : 'H') == ' ') {
                int i = IsOverlapping + 41;
                toIntRange = i % 128;
                int i2 = i % 2;
                sb.append(str);
                sb.append(next.name);
                sb.append(SimpleComparison.EQUAL_TO_OPERATION);
                if ((next.redacted ? 9 : 'U') == 9) {
                    int i3 = IsOverlapping + 7;
                    toIntRange = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object[] objArr = null;
                        int length2 = objArr.length;
                    }
                    fieldValue = REDACTED;
                }
                sb.append(fieldValue);
                str = ", ";
            }
        }
    }

    private int getSerializedSize(int i, Object obj, Message.Datatype datatype) {
        int i2 = toIntRange + 101;
        IsOverlapping = i2 % 128;
        if (i2 % 2 == 0) {
        }
        int varintTagSize = onAnimation.varintTagSize(i) + getSerializedSizeNoTag(obj, datatype);
        int i3 = toIntRange + 3;
        IsOverlapping = i3 % 128;
        int i4 = i3 % 2;
        return varintTagSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r4 = ((o.printConnMonitorLog) r4).size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        return o.onAnimation.varint32Size(r4) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r4 = utf8Length((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        return o.onAnimation.varint32Size(r4) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return getEnumSize((o.RecyclerView.SavedState) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r4 = toIntRange + 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        IsOverlapping = r4 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if ((r4 % 2) != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r4 == true) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4 = 24 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        return o.onAnimation.varint64Size(o.onAnimation.zigZag64(((java.lang.Long) r4).longValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        return o.onAnimation.varint32Size(o.onAnimation.zigZag32(((java.lang.Integer) r4).intValue()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0095, code lost:
        r4 = o.onAnimation.varint32Size(((java.lang.Integer) r4).intValue());
        r5 = IsOverlapping + 103;
        toIntRange = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b4, code lost:
        return o.onAnimation.varint64Size(((java.lang.Long) r4).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b5, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c1, code lost:
        return o.onAnimation.int32Size(((java.lang.Integer) r4).intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c7, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:43:0x00aa=Splitter:B:43:0x00aa, B:20:0x005e=Splitter:B:20:0x005e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getSerializedSizeNoTag(java.lang.Object r4, com.zoloz.wire.Message.Datatype r5) {
        /*
            r3 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 35
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 98
            if (r0 == 0) goto L_0x0011
            r0 = 98
            goto L_0x0013
        L_0x0011:
            r0 = 38
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0023
            int[] r0 = o.start.AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x00b7;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00aa;
                case 4: goto L_0x0095;
                case 5: goto L_0x0086;
                case 6: goto L_0x0077;
                case 7: goto L_0x005e;
                case 8: goto L_0x0057;
                case 9: goto L_0x004b;
                case 10: goto L_0x003f;
                case 11: goto L_0x0038;
                case 12: goto L_0x0036;
                case 13: goto L_0x0036;
                case 14: goto L_0x0036;
                case 15: goto L_0x0033;
                case 16: goto L_0x0033;
                case 17: goto L_0x0033;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00c2
        L_0x0023:
            int[] r0 = o.start.AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 82
            int r0 = r0 / r2
            switch(r5) {
                case 1: goto L_0x00b7;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00aa;
                case 4: goto L_0x0095;
                case 5: goto L_0x0086;
                case 6: goto L_0x0077;
                case 7: goto L_0x005e;
                case 8: goto L_0x0057;
                case 9: goto L_0x004b;
                case 10: goto L_0x003f;
                case 11: goto L_0x0038;
                case 12: goto L_0x0036;
                case 13: goto L_0x0036;
                case 14: goto L_0x0036;
                case 15: goto L_0x0033;
                case 16: goto L_0x0033;
                case 17: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x00c2
        L_0x0033:
            r4 = 8
            return r4
        L_0x0036:
            r4 = 4
            return r4
        L_0x0038:
            com.zoloz.wire.Message r4 = (com.zoloz.wire.Message) r4
            int r4 = r3.getMessageSize(r4)
            return r4
        L_0x003f:
            o.printConnMonitorLog r4 = (o.printConnMonitorLog) r4
            int r4 = r4.size()
            int r5 = o.onAnimation.varint32Size(r4)
            int r5 = r5 + r4
            return r5
        L_0x004b:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r3.utf8Length(r4)
            int r5 = o.onAnimation.varint32Size(r4)
            int r5 = r5 + r4
            return r5
        L_0x0057:
            o.RecyclerView$SavedState r4 = (o.RecyclerView.SavedState) r4
            int r4 = r3.getEnumSize(r4)
            return r4
        L_0x005e:
            int r4 = toIntRange     // Catch:{ Exception -> 0x00b5 }
            int r4 = r4 + 53
            int r5 = r4 % 128
            IsOverlapping = r5     // Catch:{ Exception -> 0x00b5 }
            int r4 = r4 % 2
            r5 = 1
            if (r4 != 0) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 == r5) goto L_0x0071
            return r5
        L_0x0071:
            r4 = 24
            int r4 = r4 / r2
            return r5
        L_0x0075:
            r4 = move-exception
            throw r4
        L_0x0077:
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = o.onAnimation.zigZag64(r4)
            int r4 = o.onAnimation.varint64Size(r4)
            return r4
        L_0x0086:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = o.onAnimation.zigZag32(r4)
            int r4 = o.onAnimation.varint32Size(r4)
            return r4
        L_0x0095:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = o.onAnimation.varint32Size(r4)
            int r5 = IsOverlapping
            int r5 = r5 + 103
            int r0 = r5 % 128
            toIntRange = r0
            int r5 = r5 % 2
            return r4
        L_0x00aa:
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x00b5 }
            long r4 = r4.longValue()     // Catch:{ Exception -> 0x00b5 }
            int r4 = o.onAnimation.varint64Size(r4)     // Catch:{ Exception -> 0x00b5 }
            return r4
        L_0x00b5:
            r4 = move-exception
            throw r4
        L_0x00b7:
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r4 = o.onAnimation.int32Size(r4)
            return r4
        L_0x00c2:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>()
            throw r4
        L_0x00c8:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.getSerializedSizeNoTag(java.lang.Object, com.zoloz.wire.Message$Datatype):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r5 <= 'S') goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5 <= 127) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r5 > 2047) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r5 = IsOverlapping + 1;
        toIntRange = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        if ((r5 % 2) == 0) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r5 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r3 = r3 + 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r3 = r3 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (java.lang.Character.isHighSurrogate(r5) == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        r5 = 'H';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r5 = kotlin.text.Typography.amp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        if (r5 == '&') goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        r5 = toIntRange + 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        IsOverlapping = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        r5 = r5 % 2;
        r3 = r3 + 4;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006a, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0078, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0079, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int utf8Length(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0007:
            r4 = 1
            if (r2 >= r0) goto L_0x000c
            r5 = 0
            goto L_0x000d
        L_0x000c:
            r5 = 1
        L_0x000d:
            if (r5 == r4) goto L_0x007a
            int r5 = IsOverlapping
            int r5 = r5 + 107
            int r6 = r5 % 128
            toIntRange = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0026
            char r5 = r8.charAt(r2)     // Catch:{ Exception -> 0x0024 }
            r6 = 83
            if (r5 > r6) goto L_0x0031
            goto L_0x002e
        L_0x0024:
            r8 = move-exception
            goto L_0x0069
        L_0x0026:
            char r5 = r8.charAt(r2)
            r6 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L_0x0031
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x006c
        L_0x0031:
            r6 = 2047(0x7ff, float:2.868E-42)
            if (r5 > r6) goto L_0x004b
            int r5 = IsOverlapping
            int r5 = r5 + r4
            int r6 = r5 % 128
            toIntRange = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            if (r5 == 0) goto L_0x0048
            int r3 = r3 + 15
            goto L_0x006c
        L_0x0048:
            int r3 = r3 + 2
            goto L_0x006c
        L_0x004b:
            boolean r5 = java.lang.Character.isHighSurrogate(r5)
            r6 = 38
            if (r5 == 0) goto L_0x0056
            r5 = 72
            goto L_0x0058
        L_0x0056:
            r5 = 38
        L_0x0058:
            if (r5 == r6) goto L_0x006a
            int r5 = toIntRange     // Catch:{ Exception -> 0x0078 }
            int r5 = r5 + 15
            int r6 = r5 % 128
            IsOverlapping = r6     // Catch:{ Exception -> 0x0024 }
            int r5 = r5 % 2
            int r3 = r3 + 4
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0069:
            throw r8
        L_0x006a:
            int r3 = r3 + 3
        L_0x006c:
            int r2 = r2 + r4
            int r4 = toIntRange     // Catch:{ Exception -> 0x0078 }
            int r4 = r4 + 125
            int r5 = r4 % 128
            IsOverlapping = r5     // Catch:{ Exception -> 0x0078 }
            int r4 = r4 % 2
            goto L_0x0007
        L_0x0078:
            r8 = move-exception
            throw r8
        L_0x007a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.utf8Length(java.lang.String):int");
    }

    private <E extends RecyclerView.SavedState> int getEnumSize(E e) {
        int i = toIntRange + 65;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        int varint32Size = onAnimation.varint32Size(this.wire.enumAdapter(e.getClass()).toInt(e));
        int i3 = toIntRange + 97;
        IsOverlapping = i3 % 128;
        int i4 = i3 % 2;
        return varint32Size;
    }

    private <M extends Message> int getMessageSize(M m) {
        try {
            int i = IsOverlapping + 69;
            toIntRange = i % 128;
            if (i % 2 != 0) {
                int serializedSize = m.getSerializedSize();
                return onAnimation.varint32Size(serializedSize) / serializedSize;
            }
            int serializedSize2 = m.getSerializedSize();
            return onAnimation.varint32Size(serializedSize2) + serializedSize2;
        } catch (Exception e) {
            throw e;
        }
    }

    private void writeValue(onAnimation onanimation, int i, Object obj, Message.Datatype datatype) throws IOException {
        int i2 = toIntRange + 19;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        onanimation.writeTag(i, datatype.wireType());
        writeValueNoTag(onanimation, obj, datatype);
        int i4 = IsOverlapping + 79;
        toIntRange = i4 % 128;
        int i5 = i4 % 2;
    }

    private void writeValueNoTag(onAnimation onanimation, Object obj, Message.Datatype datatype) throws IOException {
        int i = IsOverlapping + 7;
        toIntRange = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        switch (AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
                onanimation.writeSignedVarint32(((Integer) obj).intValue());
                int i4 = toIntRange + 107;
                IsOverlapping = i4 % 128;
                int i5 = i4 % 2;
                return;
            case 2:
            case 3:
                onanimation.writeVarint64(((Long) obj).longValue());
                return;
            case 4:
                onanimation.writeVarint32(((Integer) obj).intValue());
                return;
            case 5:
                onanimation.writeVarint32(onAnimation.zigZag32(((Integer) obj).intValue()));
                return;
            case 6:
                onanimation.writeVarint64(onAnimation.zigZag64(((Long) obj).longValue()));
                return;
            case 7:
                if ((((Boolean) obj).booleanValue() ? 'I' : 0) != 0) {
                    i3 = 1;
                }
                onanimation.writeRawByte(i3);
                return;
            case 8:
                writeEnum((RecyclerView.SavedState) obj, onanimation);
                return;
            case 9:
                byte[] bytes = ((String) obj).getBytes(length((ViewConfiguration.getFadingEdgeLength() >> 16) - 35, (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), -1046827029 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1832146253 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (82 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern());
                onanimation.writeVarint32(bytes.length);
                onanimation.writeRawBytes(bytes);
                return;
            case 10:
                try {
                    printConnMonitorLog printconnmonitorlog = (printConnMonitorLog) obj;
                    onanimation.writeVarint32(printconnmonitorlog.size());
                    onanimation.writeRawBytes(printconnmonitorlog.toByteArray());
                    return;
                } catch (Exception e) {
                    throw e;
                }
            case 11:
                writeMessage((Message) obj, onanimation);
                return;
            case 12:
            case 13:
                onanimation.writeFixed32(((Integer) obj).intValue());
                return;
            case 14:
                onanimation.writeFixed32(Float.floatToIntBits(((Float) obj).floatValue()));
                return;
            case 15:
            case 16:
                onanimation.writeFixed64(((Long) obj).longValue());
                return;
            case 17:
                onanimation.writeFixed64(Double.doubleToLongBits(((Double) obj).doubleValue()));
                return;
            default:
                throw new RuntimeException();
        }
    }

    private <M extends Message> void writeMessage(M m, onAnimation onanimation) throws IOException {
        int i = IsOverlapping + 3;
        toIntRange = i % 128;
        if ((i % 2 != 0 ? 'C' : Typography.less) != 'C') {
            onanimation.writeVarint32(m.getSerializedSize());
            this.wire.messageAdapter(m.getClass()).write(m, onanimation);
            return;
        }
        onanimation.writeVarint32(m.getSerializedSize());
        this.wire.messageAdapter(m.getClass()).write(m, onanimation);
        int i2 = 58 / 0;
    }

    private <E extends RecyclerView.SavedState> void writeEnum(E e, onAnimation onanimation) throws IOException {
        int i = IsOverlapping + 73;
        toIntRange = i % 128;
        if ((i % 2 != 0 ? 'I' : '3') != 'I') {
            onanimation.writeVarint32(this.wire.enumAdapter(e.getClass()).toInt(e));
            return;
        }
        onanimation.writeVarint32(this.wire.enumAdapter(e.getClass()).toInt(e));
        Object obj = null;
        super.hashCode();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [o.start$1] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        setExtension((o.getAbsoluteAdapterPosition) r2, getExtension(r5), r3.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b7, code lost:
        if ((r9 instanceof java.lang.Integer) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c0, code lost:
        if ((r9 instanceof java.lang.Integer) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0119, code lost:
        r0 = r3.getTags().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0127, code lost:
        if (r0.hasNext() == false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0129, code lost:
        r5 = 'Y';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012c, code lost:
        r5 = ')';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x012e, code lost:
        if (r5 == 'Y') goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0130, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0131, code lost:
        r5 = r0.next().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0141, code lost:
        if (r1.fieldInfoMap.containsKey(r5) == false) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r6 = IsOverlapping + 29;
        toIntRange = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014d, code lost:
        if ((r6 % 2) == 0) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        setBuilderField(r2, r5, r3.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r5 = r4.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x015a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        setBuilderField(r2, r5, r3.get(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0163, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0164, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final M read(o.instantScrollToPosition r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.Class<M> r2 = r1.messageType     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            java.lang.Object r2 = r2.newInstance()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            com.zoloz.wire.Message r2 = (com.zoloz.wire.Message) r2     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            o.start$setMax r3 = new o.start$setMax     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
        L_0x0012:
            int r5 = r19.readTag()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r6 = r5 >> 3
            com.zoloz.wire.WireType r5 = com.zoloz.wire.WireType.valueOf((int) r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r7 = 81
            if (r6 != 0) goto L_0x0023
            r8 = 81
            goto L_0x0024
        L_0x0023:
            r8 = 4
        L_0x0024:
            if (r8 == r7) goto L_0x0119
            o.setTargetPosition<o.start$length> r7 = r1.fieldInfoMap     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            o.start$length r7 = (o.start.length) r7     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r8 = 1
            if (r7 == 0) goto L_0x0038
            com.zoloz.wire.Message$Datatype r10 = r7.datatype     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            com.zoloz.wire.Message$Label r7 = r7.label     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r11 = r10
            r10 = r4
            goto L_0x0067
        L_0x0038:
            o.getViewAdapterPosition r7 = r1.getExtension((int) r6)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r7 != 0) goto L_0x0059
            int r7 = IsOverlapping
            int r7 = r7 + 27
            int r10 = r7 % 128
            toIntRange = r10
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x004b
            r8 = 0
        L_0x004b:
            if (r8 == 0) goto L_0x0051
            r1.readUnknownField(r2, r0, r6, r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0012
        L_0x0051:
            r1.readUnknownField(r2, r0, r6, r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r5 = r4.length     // Catch:{ all -> 0x0056 }
            goto L_0x0012
        L_0x0056:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0059:
            com.zoloz.wire.Message$Datatype r10 = r7.getDatatype()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            com.zoloz.wire.Message$Label r11 = r7.getLabel()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r17 = r10
            r10 = r7
            r7 = r11
            r11 = r17
        L_0x0067:
            boolean r12 = r7.isPacked()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r12 == 0) goto L_0x00e7
            com.zoloz.wire.WireType r12 = com.zoloz.wire.WireType.LENGTH_DELIMITED     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r5 != r12) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r8 = 0
        L_0x0073:
            if (r8 == 0) goto L_0x00e7
            int r5 = toIntRange
            r7 = 99
            int r5 = r5 + r7
            int r8 = r5 % 128
            IsOverlapping = r8
            int r5 = r5 % 2
            int r5 = r19.readVarint32()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            long r12 = r19.getPosition()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r8 = r0.pushLimit(r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
        L_0x008c:
            long r14 = r19.getPosition()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            long r9 = (long) r5     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            long r9 = r9 + r12
            int r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r16 >= 0) goto L_0x0099
            r14 = 21
            goto L_0x009b
        L_0x0099:
            r14 = 99
        L_0x009b:
            if (r14 == r7) goto L_0x00d2
            java.lang.Object r9 = r1.readValue(r0, r6, r11)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            com.zoloz.wire.Message$Datatype r10 = com.zoloz.wire.Message.Datatype.ENUM     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r11 != r10) goto L_0x00cd
            int r10 = IsOverlapping
            int r10 = r10 + 77
            int r14 = r10 % 128
            toIntRange = r14
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x00bd
            boolean r10 = r9 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r14 = 50
            r15 = 0
            int r14 = r14 / r15
            if (r10 == 0) goto L_0x00ce
            goto L_0x00c2
        L_0x00ba:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x00bd:
            r15 = 0
            boolean r10 = r9 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r10 == 0) goto L_0x00ce
        L_0x00c2:
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r9 = r9.intValue()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            long r9 = (long) r9     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r2.addVarint(r6, r9)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x008c
        L_0x00cd:
            r15 = 0
        L_0x00ce:
            r3.add(r6, r9)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x008c
        L_0x00d2:
            r0.popLimit(r8)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            long r5 = r19.getPosition()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x00df
            goto L_0x0012
        L_0x00df:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            java.lang.String r2 = "Packed data had wrong length!"
            r0.<init>(r2)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            throw r0     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
        L_0x00e7:
            java.lang.Object r5 = r1.readValue(r0, r6, r11)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            com.zoloz.wire.Message$Datatype r8 = com.zoloz.wire.Message.Datatype.ENUM     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r11 != r8) goto L_0x00ff
            boolean r8 = r5 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r8 == 0) goto L_0x00ff
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            long r7 = (long) r5     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r2.addVarint(r6, r7)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0012
        L_0x00ff:
            boolean r7 = r7.isRepeated()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r7 == 0) goto L_0x010a
            r3.add(r6, r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0012
        L_0x010a:
            if (r10 == 0) goto L_0x0114
            r6 = r2
            o.getAbsoluteAdapterPosition r6 = (o.getAbsoluteAdapterPosition) r6     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r1.setExtension(r6, r10, r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0012
        L_0x0114:
            r1.setBuilderField(r2, r6, r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0012
        L_0x0119:
            java.util.Set r0 = r3.getTags()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
        L_0x0121:
            boolean r5 = r0.hasNext()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r6 = 89
            if (r5 == 0) goto L_0x012c
            r5 = 89
            goto L_0x012e
        L_0x012c:
            r5 = 41
        L_0x012e:
            if (r5 == r6) goto L_0x0131
            return r2
        L_0x0131:
            java.lang.Object r5 = r0.next()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r5 = r5.intValue()     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            o.setTargetPosition<o.start$length> r6 = r1.fieldInfoMap     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            boolean r6 = r6.containsKey(r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            if (r6 == 0) goto L_0x0165
            int r6 = IsOverlapping     // Catch:{ Exception -> 0x0163 }
            int r6 = r6 + 29
            int r7 = r6 % 128
            toIntRange = r7     // Catch:{ Exception -> 0x0163 }
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x015b
            java.util.List r6 = r3.get(r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r1.setBuilderField(r2, r5, r6)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            int r5 = r4.length     // Catch:{ all -> 0x0158 }
            goto L_0x0121
        L_0x0158:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x015b:
            java.util.List r6 = r3.get(r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r1.setBuilderField(r2, r5, r6)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0121
        L_0x0163:
            r0 = move-exception
            throw r0
        L_0x0165:
            r6 = r2
            o.getAbsoluteAdapterPosition r6 = (o.getAbsoluteAdapterPosition) r6     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            o.getViewAdapterPosition r7 = r1.getExtension((int) r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            java.util.List r5 = r3.get(r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            r1.setExtension(r6, r7, r5)     // Catch:{ IllegalAccessException -> 0x017b, InstantiationException -> 0x0174 }
            goto L_0x0121
        L_0x0174:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x017b:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            goto L_0x0183
        L_0x0182:
            throw r2
        L_0x0183:
            goto L_0x0182
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.read(o.instantScrollToPosition):com.zoloz.wire.Message");
    }

    private Object readValue(instantScrollToPosition instantscrolltoposition, int i, Message.Datatype datatype) throws IOException {
        switch (AnonymousClass1.$SwitchMap$com$squareup$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
            case 4:
                return Integer.valueOf(instantscrolltoposition.readVarint32());
            case 2:
            case 3:
                return Long.valueOf(instantscrolltoposition.readVarint64());
            case 5:
                return Integer.valueOf(instantScrollToPosition.decodeZigZag32(instantscrolltoposition.readVarint32()));
            case 6:
                return Long.valueOf(instantScrollToPosition.decodeZigZag64(instantscrolltoposition.readVarint64()));
            case 7:
                boolean z = false;
                if (!(instantscrolltoposition.readVarint32() == 0)) {
                    int i2 = IsOverlapping + 93;
                    toIntRange = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                getViewLayoutPosition<? extends RecyclerView.SavedState> enumAdapter = getEnumAdapter(i);
                int readVarint32 = instantscrolltoposition.readVarint32();
                try {
                    return enumAdapter.fromInt(readVarint32);
                } catch (IllegalArgumentException unused) {
                    return Integer.valueOf(readVarint32);
                }
            case 9:
                return instantscrolltoposition.readString();
            case 10:
                return instantscrolltoposition.readBytes();
            case 11:
                Message readMessage = readMessage(instantscrolltoposition, i);
                int i4 = toIntRange + 69;
                IsOverlapping = i4 % 128;
                int i5 = i4 % 2;
                return readMessage;
            case 12:
            case 13:
                return Integer.valueOf(instantscrolltoposition.readFixed32());
            case 14:
                return Float.valueOf(Float.intBitsToFloat(instantscrolltoposition.readFixed32()));
            case 15:
            case 16:
                return Long.valueOf(instantscrolltoposition.readFixed64());
            case 17:
                try {
                    try {
                        return Double.valueOf(Double.longBitsToDouble(instantscrolltoposition.readFixed64()));
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            default:
                throw new RuntimeException();
        }
        throw e2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        throw new java.io.IOException("Wire recursion limit exceeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r6.recursionDepth < 35) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r6.recursionDepth < 64) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.zoloz.wire.Message readMessage(o.instantScrollToPosition r6, int r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 121
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
            if (r0 == 0) goto L_0x001e
            int r0 = r6.readVarint32()
            int r3 = r6.recursionDepth
            r4 = 35
            if (r3 >= r4) goto L_0x0061
            goto L_0x0028
        L_0x001e:
            int r0 = r6.readVarint32()     // Catch:{ Exception -> 0x0069 }
            int r3 = r6.recursionDepth     // Catch:{ Exception -> 0x0069 }
            r4 = 64
            if (r3 >= r4) goto L_0x0061
        L_0x0028:
            int r0 = r6.pushLimit(r0)     // Catch:{ Exception -> 0x0069 }
            int r3 = r6.recursionDepth
            int r3 = r3 + r2
            r6.recursionDepth = r3
            o.start r7 = r5.getMessageAdapter(r7)
            com.zoloz.wire.Message r7 = r7.read(r6)
            r6.checkLastTagWas(r1)
            int r1 = r6.recursionDepth
            int r1 = r1 - r2
            r6.recursionDepth = r1
            r6.popLimit(r0)
            int r6 = IsOverlapping     // Catch:{ Exception -> 0x0069 }
            int r6 = r6 + 113
            int r0 = r6 % 128
            toIntRange = r0     // Catch:{ Exception -> 0x0069 }
            int r6 = r6 % 2
            r0 = 65
            if (r6 == 0) goto L_0x0055
            r6 = 65
            goto L_0x0057
        L_0x0055:
            r6 = 72
        L_0x0057:
            if (r6 == r0) goto L_0x005a
            return r7
        L_0x005a:
            r6 = 0
            super.hashCode()     // Catch:{ all -> 0x005f }
            return r7
        L_0x005f:
            r6 = move-exception
            throw r6
        L_0x0061:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r7 = "Wire recursion limit exceeded"
            r6.<init>(r7)
            throw r6
        L_0x0069:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.readMessage(o.instantScrollToPosition, int):com.zoloz.wire.Message");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if ((r0 != null ? 'J' : 9) != 'J') goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if ((r0 == null) != true) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.start<? extends com.zoloz.wire.Message> getMessageAdapter(int r5) {
        /*
            r4 = this;
            int r0 = toIntRange
            int r0 = r0 + 63
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0021
            o.setTargetPosition<o.start$length> r0 = r4.fieldInfoMap
            java.lang.Object r0 = r0.get(r5)
            o.start$length r0 = (o.start.length) r0
            int r2 = r1.length     // Catch:{ all -> 0x001f }
            r2 = 1
            if (r0 == 0) goto L_0x001b
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = 1
        L_0x001c:
            if (r3 == r2) goto L_0x003e
            goto L_0x0035
        L_0x001f:
            r5 = move-exception
            throw r5
        L_0x0021:
            o.setTargetPosition<o.start$length> r0 = r4.fieldInfoMap
            java.lang.Object r0 = r0.get(r5)
            o.start$length r0 = (o.start.length) r0
            r2 = 74
            if (r0 == 0) goto L_0x0030
            r3 = 74
            goto L_0x0032
        L_0x0030:
            r3 = 9
        L_0x0032:
            if (r3 == r2) goto L_0x0035
            goto L_0x003e
        L_0x0035:
            o.start<? extends com.zoloz.wire.Message> r2 = r0.messageAdapter
            if (r2 == 0) goto L_0x003e
            o.start<? extends com.zoloz.wire.Message> r5 = r0.messageAdapter     // Catch:{ Exception -> 0x003c }
            return r5
        L_0x003c:
            r5 = move-exception
            throw r5
        L_0x003e:
            o.isRunning r2 = r4.wire
            java.lang.Class r5 = r4.getMessageClass(r5)
            o.start r5 = r2.messageAdapter(r5)
            r2 = 41
            if (r0 == 0) goto L_0x004f
            r3 = 41
            goto L_0x0051
        L_0x004f:
            r3 = 22
        L_0x0051:
            if (r3 == r2) goto L_0x0054
            goto L_0x0060
        L_0x0054:
            int r2 = IsOverlapping
            int r2 = r2 + 67
            int r3 = r2 % 128
            toIntRange = r3
            int r2 = r2 % 2
            r0.messageAdapter = r5
        L_0x0060:
            int r0 = toIntRange
            int r0 = r0 + 65
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0072
            super.hashCode()     // Catch:{ all -> 0x0070 }
            return r5
        L_0x0070:
            r5 = move-exception
            throw r5
        L_0x0072:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.getMessageAdapter(int):o.start");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if ((r0 != null) != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ((r0 != null ? '0' : 'b') != 'b') goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.getViewLayoutPosition<? extends o.RecyclerView.SavedState> getEnumAdapter(int r4) {
        /*
            r3 = this;
            int r0 = toIntRange
            int r0 = r0 + 9
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0026
            o.setTargetPosition<o.start$length> r0 = r3.fieldInfoMap
            java.lang.Object r0 = r0.get(r4)
            o.start$length r0 = (o.start.length) r0
            r1 = 0
            super.hashCode()     // Catch:{ all -> 0x0024 }
            r1 = 98
            if (r0 == 0) goto L_0x001f
            r2 = 48
            goto L_0x0021
        L_0x001f:
            r2 = 98
        L_0x0021:
            if (r2 == r1) goto L_0x003c
            goto L_0x0035
        L_0x0024:
            r4 = move-exception
            throw r4
        L_0x0026:
            o.setTargetPosition<o.start$length> r0 = r3.fieldInfoMap     // Catch:{ Exception -> 0x0055 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0055 }
            o.start$length r0 = (o.start.length) r0     // Catch:{ Exception -> 0x0055 }
            if (r0 == 0) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            if (r1 == 0) goto L_0x003c
        L_0x0035:
            o.getViewLayoutPosition<? extends o.RecyclerView$SavedState> r1 = r0.enumAdapter
            if (r1 == 0) goto L_0x003c
            o.getViewLayoutPosition<? extends o.RecyclerView$SavedState> r4 = r0.enumAdapter
            return r4
        L_0x003c:
            o.isRunning r1 = r3.wire
            java.lang.Class r4 = r3.getEnumClass(r4)
            o.getViewLayoutPosition r4 = r1.enumAdapter(r4)
            if (r0 == 0) goto L_0x0054
            r0.enumAdapter = r4
            int r0 = toIntRange     // Catch:{ Exception -> 0x0055 }
            int r0 = r0 + 3
            int r1 = r0 % 128
            IsOverlapping = r1     // Catch:{ Exception -> 0x0055 }
            int r0 = r0 % 2
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.getEnumAdapter(int):o.getViewLayoutPosition");
    }

    private Class<Message> getMessageClass(int i) {
        getViewAdapterPosition<getAbsoluteAdapterPosition<?>, ?> extension;
        try {
            int i2 = IsOverlapping + 7;
            toIntRange = i2 % 128;
            int i3 = i2 % 2;
            try {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(801638936, oncanceled);
                    onCancelLoad.getMin(801638936, oncanceled);
                }
                length length2 = this.fieldInfoMap.get(i);
                Class<? extends Message> cls = null;
                boolean z = false;
                if (length2 == null) {
                    int i4 = IsOverlapping + 19;
                    toIntRange = i4 % 128;
                    if (i4 % 2 != 0) {
                        super.hashCode();
                    }
                } else {
                    cls = length2.messageType;
                }
                if (cls == null) {
                    z = true;
                }
                if (!z || (extension = getExtension(i)) == null) {
                    return cls;
                }
                Class<? extends Message> messageType2 = extension.getMessageType();
                int i5 = toIntRange + 29;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
                return messageType2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: o.start$1  reason: invalid class name */
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
                com.zoloz.wire.WireType[] r0 = com.zoloz.wire.WireType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$squareup$wire$WireType = r0
                r1 = 1
                com.zoloz.wire.WireType r2 = com.zoloz.wire.WireType.VARINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.zoloz.wire.WireType r3 = com.zoloz.wire.WireType.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.zoloz.wire.WireType r4 = com.zoloz.wire.WireType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.zoloz.wire.WireType r5 = com.zoloz.wire.WireType.LENGTH_DELIMITED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.zoloz.wire.WireType r6 = com.zoloz.wire.WireType.START_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$com$squareup$wire$WireType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.zoloz.wire.WireType r7 = com.zoloz.wire.WireType.END_GROUP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.zoloz.wire.Message$Datatype[] r6 = com.zoloz.wire.Message.Datatype.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                $SwitchMap$com$squareup$wire$Message$Datatype = r6
                com.zoloz.wire.Message$Datatype r7 = com.zoloz.wire.Message.Datatype.INT32     // Catch:{ NoSuchFieldError -> 0x005a }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                int[] r1 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.zoloz.wire.Message$Datatype r6 = com.zoloz.wire.Message.Datatype.INT64     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r1[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x006e }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.UINT64     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.UINT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.SINT32     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x008c }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.SINT64     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.BOOL     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.ENUM     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00af }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.STRING     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00bb }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.BYTES     // Catch:{ NoSuchFieldError -> 0x00bb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bb }
            L_0x00bb:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00d3 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.FIXED32     // Catch:{ NoSuchFieldError -> 0x00d3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d3 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d3 }
            L_0x00d3:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00df }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00df }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00df }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00eb }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.FLOAT     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x00f7 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.FIXED64     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x0103 }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0103 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0103 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0103 }
            L_0x0103:
                int[] r0 = $SwitchMap$com$squareup$wire$Message$Datatype     // Catch:{ NoSuchFieldError -> 0x010f }
                com.zoloz.wire.Message$Datatype r1 = com.zoloz.wire.Message.Datatype.DOUBLE     // Catch:{ NoSuchFieldError -> 0x010f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010f }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010f }
            L_0x010f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.start.AnonymousClass1.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r3.ensureUnknownFieldMap().addLengthDelimited(r5, r4.readBytes(r4.readVarint32()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r3.ensureUnknownFieldMap().addFixed64(r5, java.lang.Long.valueOf(r4.readFixed64()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r3.ensureUnknownFieldMap().addFixed32(r5, java.lang.Integer.valueOf(r4.readFixed32()));
        r3 = IsOverlapping + 15;
        toIntRange = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.ensureUnknownFieldMap().addVarint(r5, java.lang.Long.valueOf(r4.readVarint64()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        throw new java.lang.RuntimeException("Unsupported wire type: ".concat(java.lang.String.valueOf(r6)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readUnknownField(com.zoloz.wire.Message r3, o.instantScrollToPosition r4, int r5, com.zoloz.wire.WireType r6) throws java.io.IOException {
        /*
            r2 = this;
            int r0 = toIntRange
            int r0 = r0 + 83
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 72
            if (r0 != 0) goto L_0x0011
            r0 = 72
            goto L_0x0013
        L_0x0011:
            r0 = 74
        L_0x0013:
            if (r0 == r1) goto L_0x0021
            int[] r0 = o.start.AnonymousClass1.$SwitchMap$com$squareup$wire$WireType
            int r1 = r6.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0058;
                case 3: goto L_0x0046;
                case 4: goto L_0x0036;
                case 5: goto L_0x0032;
                case 6: goto L_0x0031;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0085
        L_0x0021:
            int[] r0 = o.start.AnonymousClass1.$SwitchMap$com$squareup$wire$WireType
            int r1 = r6.ordinal()
            r0 = r0[r1]
            r1 = 82
            int r1 = r1 / 0
            switch(r0) {
                case 1: goto L_0x0072;
                case 2: goto L_0x0058;
                case 3: goto L_0x0046;
                case 4: goto L_0x0036;
                case 5: goto L_0x0032;
                case 6: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0085
        L_0x0031:
            return
        L_0x0032:
            r4.skipGroup()
            return
        L_0x0036:
            int r6 = r4.readVarint32()
            o.isPendingInitialRun r3 = r3.ensureUnknownFieldMap()
            o.printConnMonitorLog r4 = r4.readBytes(r6)
            r3.addLengthDelimited(r5, r4)
            return
        L_0x0046:
            o.isPendingInitialRun r3 = r3.ensureUnknownFieldMap()     // Catch:{ Exception -> 0x0056 }
            long r0 = r4.readFixed64()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.addFixed64(r5, r4)
            return
        L_0x0056:
            r3 = move-exception
            goto L_0x0082
        L_0x0058:
            o.isPendingInitialRun r3 = r3.ensureUnknownFieldMap()
            int r4 = r4.readFixed32()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.addFixed32(r5, r4)
            int r3 = IsOverlapping
            int r3 = r3 + 15
            int r4 = r3 % 128
            toIntRange = r4
            int r3 = r3 % 2
            return
        L_0x0072:
            o.isPendingInitialRun r3 = r3.ensureUnknownFieldMap()     // Catch:{ Exception -> 0x0083 }
            long r0 = r4.readVarint64()     // Catch:{ Exception -> 0x0056 }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0056 }
            r3.addVarint(r5, r4)     // Catch:{ Exception -> 0x0056 }
            return
        L_0x0082:
            throw r3
        L_0x0083:
            r3 = move-exception
            throw r3
        L_0x0085:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r5 = "Unsupported wire type: "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            throw r3
        L_0x0095:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.readUnknownField(com.zoloz.wire.Message, o.instantScrollToPosition, int, com.zoloz.wire.WireType):void");
    }

    static class setMax {
        private Map<Integer, setMin<Object>> map;

        private setMax() {
        }

        /* synthetic */ setMax(AnonymousClass1 r1) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final void add(int i, Object obj) {
            Map<Integer, setMin<Object>> map2 = this.map;
            setMin setmin = map2 == null ? null : map2.get(Integer.valueOf(i));
            if (setmin == null) {
                setmin = new setMin();
                if (this.map == null) {
                    this.map = new LinkedHashMap();
                }
                this.map.put(Integer.valueOf(i), setmin);
            }
            setmin.list.add(obj);
        }

        /* access modifiers changed from: package-private */
        public final Set<Integer> getTags() {
            Map<Integer, setMin<Object>> map2 = this.map;
            if (map2 == null) {
                return Collections.emptySet();
            }
            return map2.keySet();
        }

        /* access modifiers changed from: package-private */
        public final List<Object> get(int i) {
            Map<Integer, setMin<Object>> map2 = this.map;
            if (map2 == null) {
                return null;
            }
            return map2.get(Integer.valueOf(i));
        }
    }

    private getViewAdapterPosition<getAbsoluteAdapterPosition<?>, ?> getExtension(int i) {
        try {
            int i2 = IsOverlapping + 69;
            toIntRange = i2 % 128;
            int i3 = i2 % 2;
            try {
                getBindingAdapterPosition getbindingadapterposition = this.wire.registry;
                if ((getbindingadapterposition == null ? 'O' : 'C') == 'C') {
                    return getbindingadapterposition.getExtension(this.messageType, i);
                }
                int i4 = IsOverlapping + 111;
                toIntRange = i4 % 128;
                getViewAdapterPosition<getAbsoluteAdapterPosition<?>, ?> getviewadapterposition = null;
                if (i4 % 2 == 0) {
                    return getviewadapterposition;
                }
                super.hashCode();
                return getviewadapterposition;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final getViewAdapterPosition<getAbsoluteAdapterPosition<?>, ?> getExtension(String str) {
        int i;
        int i2 = IsOverlapping + 121;
        toIntRange = i2 % 128;
        int i3 = i2 % 2;
        if ((str != null ? 10 : 'R') != 'R') {
            i = str.length();
        } else {
            i = 0;
            try {
                int i4 = toIntRange + 81;
                IsOverlapping = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1821327011, oncanceled);
                onCancelLoad.getMin(1821327011, oncanceled);
            }
            getBindingAdapterPosition getbindingadapterposition = this.wire.registry;
            if ((getbindingadapterposition == null ? '/' : 31) != '/') {
                return getbindingadapterposition.getExtension(this.messageType, str);
            }
            return null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void setExtension(getAbsoluteAdapterPosition getabsoluteadapterposition, getViewAdapterPosition<?, ?> getviewadapterposition, Object obj) {
        int i = IsOverlapping + 45;
        toIntRange = i % 128;
        if ((i % 2 != 0 ? ')' : ' ') != ')') {
            getabsoluteadapterposition.setExtension(getviewadapterposition, obj);
            return;
        }
        getabsoluteadapterposition.setExtension(getviewadapterposition, obj);
        int i2 = 32 / 0;
    }

    private Class<? extends RecyclerView.SavedState> getEnumClass(int i) {
        try {
            try {
                length length2 = this.fieldInfoMap.get(i);
                Class<? extends RecyclerView.SavedState> cls = length2 == null ? null : length2.enumType;
                if ((cls == null ? '=' : 'K') != 'K') {
                    int i2 = IsOverlapping + 101;
                    toIntRange = i2 % 128;
                    int i3 = i2 % 2;
                    getViewAdapterPosition<getAbsoluteAdapterPosition<?>, ?> extension = getExtension(i);
                    if ((extension != null ? Typography.quote : 16) == '\"') {
                        int i4 = IsOverlapping + 123;
                        toIntRange = i4 % 128;
                        int i5 = i4 % 2;
                        cls = extension.getEnumType();
                    }
                }
                int i6 = toIntRange + 83;
                IsOverlapping = i6 % 128;
                int i7 = i6 % 2;
                return cls;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static class setMin<T> extends AbstractList<T> implements Cloneable, RandomAccess, Serializable {
        /* access modifiers changed from: private */
        public final List<T> list = new ArrayList();

        public Object clone() {
            return this;
        }

        setMin() {
        }

        public int size() {
            return this.list.size();
        }

        public T get(int i) {
            return this.list.get(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (setMin != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (setMin != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        r6 = (short) (getMax[length + r8] + setMax);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(int r6, byte r7, int r8, int r9, short r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = setMax
            int r6 = r6 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r6 != r1) goto L_0x002e
            int r1 = toIntRange
            int r1 = r1 + 9
            int r4 = r1 % 128
            IsOverlapping = r4
            int r1 = r1 % 2
            r4 = 5
            if (r1 != 0) goto L_0x001c
            r1 = 5
            goto L_0x001e
        L_0x001c:
            r1 = 97
        L_0x001e:
            if (r1 == r4) goto L_0x0022
            r1 = 1
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            int r4 = toIntRange
            int r4 = r4 + 83
            int r5 = r4 % 128
            IsOverlapping = r5
            int r4 = r4 % 2
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x006e
            int r6 = IsOverlapping     // Catch:{ Exception -> 0x006c }
            int r6 = r6 + 15
            int r4 = r6 % 128
            toIntRange = r4     // Catch:{ Exception -> 0x006c }
            int r6 = r6 % 2
            r4 = 77
            if (r6 == 0) goto L_0x0042
            r6 = 77
            goto L_0x0044
        L_0x0042:
            r6 = 34
        L_0x0044:
            if (r6 == r4) goto L_0x004b
            byte[] r6 = setMin
            if (r6 == 0) goto L_0x005e
            goto L_0x0052
        L_0x004b:
            byte[] r6 = setMin
            r4 = 78
            int r4 = r4 / r2
            if (r6 == 0) goto L_0x005e
        L_0x0052:
            byte[] r6 = setMin
            int r4 = length
            int r4 = r4 + r8
            byte r6 = r6[r4]
            int r4 = setMax
            int r6 = r6 + r4
            byte r6 = (byte) r6
            goto L_0x006e
        L_0x005e:
            short[] r6 = getMax     // Catch:{ Exception -> 0x006c }
            int r4 = length
            int r4 = r4 + r8
            short r6 = r6[r4]
            int r4 = setMax
            int r6 = r6 + r4
            short r6 = (short) r6
            goto L_0x006e
        L_0x006a:
            r6 = move-exception
            throw r6
        L_0x006c:
            r6 = move-exception
            goto L_0x00b4
        L_0x006e:
            if (r6 <= 0) goto L_0x00b5
            int r8 = r8 + r6
            int r8 = r8 + -2
            int r4 = length
            int r8 = r8 + r4
            if (r1 == 0) goto L_0x007a
            r1 = 1
            goto L_0x007b
        L_0x007a:
            r1 = 0
        L_0x007b:
            if (r1 == 0) goto L_0x008c
            int r1 = toIntRange
            int r1 = r1 + 45
            int r4 = r1 % 128
            IsOverlapping = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r2 = 1
        L_0x008b:
            r2 = 1
        L_0x008c:
            int r8 = r8 + r2
            int r1 = getMin     // Catch:{ Exception -> 0x006c }
            int r9 = r9 + r1
            char r9 = (char) r9     // Catch:{ Exception -> 0x006c }
            r0.append(r9)     // Catch:{ Exception -> 0x006c }
        L_0x0094:
            if (r3 >= r6) goto L_0x00b5
            byte[] r1 = setMin
            if (r1 == 0) goto L_0x00a1
            int r2 = r8 + -1
            byte r8 = r1[r8]
            int r8 = r8 + r10
            byte r8 = (byte) r8
            goto L_0x00a9
        L_0x00a1:
            short[] r1 = getMax
            int r2 = r8 + -1
            short r8 = r1[r8]
            int r8 = r8 + r10
            short r8 = (short) r8
        L_0x00a9:
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
            r9 = r8
            r8 = r2
            r0.append(r9)
            int r3 = r3 + 1
            goto L_0x0094
        L_0x00b4:
            throw r6
        L_0x00b5:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.start.length(int, byte, int, int, short):java.lang.String");
    }
}
