package com.google.protobuf;

import android.os.Process;
import android.text.AndroidCharacter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final ByteBuffer EMPTY_BYTE_BUFFER;
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(EMPTY_BYTE_ARRAY);
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName(setMax(new char[]{1, 2, 0, 5, 129}, AndroidCharacter.getMirror('0') - '+', (byte) ((Process.myPid() >> 22) + 73)).intern());
    private static int getMin = 0;
    private static char[] length = null;
    private static char setMax = '\u0000';
    private static int setMin = 1;

    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        BooleanList mutableCopyWithCapacity(int i);

        boolean setBoolean(int i, boolean z);
    }

    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d);

        double getDouble(int i);

        DoubleList mutableCopyWithCapacity(int i);

        double setDouble(int i, double d);
    }

    public interface EnumLite {
        int getNumber();
    }

    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    public interface EnumVerifier {
        boolean isInRange(int i);
    }

    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f);

        float getFloat(int i);

        FloatList mutableCopyWithCapacity(int i);

        float setFloat(int i, float f);
    }

    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i);

        int getInt(int i);

        IntList mutableCopyWithCapacity(int i);

        int setInt(int i, int i2);
    }

    public interface LongList extends ProtobufList<Long> {
        void addLong(long j);

        long getLong(int i);

        LongList mutableCopyWithCapacity(int i);

        long setLong(int i, long j);
    }

    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i);
    }

    static void getMin() {
        setMax = 3;
        length = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    private Internal() {
    }

    static {
        getMin();
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_BYTE_BUFFER = ByteBuffer.wrap(bArr);
        int i = getMin + 41;
        setMin = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 20 / 0;
        }
    }

    static <T> T checkNotNull(T t) {
        int i = getMin + 17;
        setMin = i % 128;
        int i2 = i % 2;
        if (t != null) {
            int i3 = setMin + 59;
            getMin = i3 % 128;
            if (!(i3 % 2 != 0)) {
                return t;
            }
            int i4 = 87 / 0;
            return t;
        }
        throw null;
    }

    static <T> T checkNotNull(T t, String str) {
        int i = setMin + 45;
        getMin = i % 128;
        int i2 = i % 2;
        if (t != null) {
            int i3 = setMin + 11;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String stringDefaultValue(String str) {
        String str2 = new String(str.getBytes(ISO_8859_1), UTF_8);
        int i = getMin + 65;
        setMin = i % 128;
        int i2 = i % 2;
        return str2;
    }

    public static ByteString bytesDefaultValue(String str) {
        ByteString byteString;
        int i = getMin + 107;
        setMin = i % 128;
        if (!(i % 2 != 0)) {
            byteString = ByteString.copyFrom(str.getBytes(ISO_8859_1));
            int i2 = 31 / 0;
        } else {
            byteString = ByteString.copyFrom(str.getBytes(ISO_8859_1));
        }
        int i3 = setMin + 25;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return byteString;
    }

    public static byte[] byteArrayDefaultValue(String str) {
        byte[] bArr;
        int i = getMin + 77;
        setMin = i % 128;
        if (i % 2 == 0) {
            bArr = str.getBytes(ISO_8859_1);
            Object obj = null;
            super.hashCode();
        } else {
            try {
                try {
                    bArr = str.getBytes(ISO_8859_1);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        int i2 = setMin + 17;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        int i = setMin + 75;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayDefaultValue(str));
            int i3 = getMin + 11;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            return wrap;
        } catch (Exception e) {
            throw e;
        }
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        int i = setMin + 13;
        getMin = i % 128;
        int i2 = i % 2;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        int i3 = getMin + 13;
        setMin = i3 % 128;
        if (i3 % 2 != 0) {
            return allocate;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return allocate;
    }

    public static boolean isValidUtf8(ByteString byteString) {
        int i = getMin + 27;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            boolean isValidUtf8 = byteString.isValidUtf8();
            int i3 = getMin + 85;
            setMin = i3 % 128;
            if (!(i3 % 2 == 0)) {
                return isValidUtf8;
            }
            int i4 = 78 / 0;
            return isValidUtf8;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean isValidUtf8(byte[] bArr) {
        char c = 'I';
        int i = getMin + 73;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            boolean isValidUtf8 = Utf8.isValidUtf8(bArr);
            int i3 = getMin + 53;
            setMin = i3 % 128;
            if (i3 % 2 != 0) {
                c = 'U';
            }
            if (c == 'U') {
                return isValidUtf8;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return isValidUtf8;
        } catch (Exception e) {
            throw e;
        }
    }

    public static byte[] toByteArray(String str) {
        int i = getMin + 81;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            byte[] bytes = str.getBytes(UTF_8);
            int i3 = setMin + 115;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? 30 : 'W') != 30) {
                return bytes;
            }
            int i4 = 19 / 0;
            return bytes;
        } catch (Exception e) {
            throw e;
        }
    }

    public static String toStringUtf8(byte[] bArr) {
        String str = new String(bArr, UTF_8);
        try {
            int i = setMin + 39;
            try {
                getMin = i % 128;
                if (!(i % 2 != 0)) {
                    return str;
                }
                Object obj = null;
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int hashLong(long j) {
        int i = getMin + 107;
        setMin = i % 128;
        int i2 = (int) (i % 2 == 0 ? j * (j >> 70) : j ^ (j >>> 32));
        int i3 = setMin + 93;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return i2;
    }

    public static int hashBoolean(boolean z) {
        int i = getMin + 47;
        setMin = i % 128;
        boolean z2 = true;
        if ((i % 2 == 0 ? 1 : '9') != 1) {
            if ((z ? (char) 14 : 7) == 14) {
                return 1231;
            }
        } else {
            Object[] objArr = null;
            int length2 = objArr.length;
            if (!z) {
                z2 = false;
            }
            if (z2) {
                return 1231;
            }
        }
        int i2 = getMin + 35;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        return 1237;
    }

    public static int hashEnum(EnumLite enumLite) {
        int i = getMin + 21;
        setMin = i % 128;
        int i2 = i % 2;
        int number = enumLite.getNumber();
        try {
            int i3 = setMin + 79;
            try {
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return number;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        int i = 1;
        Iterator<? extends EnumLite> it = list.iterator();
        int i2 = setMin + 119;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if ((it.hasNext() ? 'F' : 17) == 17) {
                return i;
            }
            int i4 = setMin + 99;
            getMin = i4 % 128;
            if (i4 % 2 != 0) {
                i = (119 << i) - hashEnum((EnumLite) it.next());
            } else {
                try {
                    i = (i * 31) + hashEnum((EnumLite) it.next());
                } catch (Exception e) {
                    throw e;
                }
            }
        }
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            try {
                int i = getMin + 75;
                setMin = i % 128;
                int i2 = i % 2;
                return false;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = setMin + 75;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                if ((i5 < list.size() ? ']' : '`') != ']') {
                    try {
                        int i6 = setMin + 55;
                        getMin = i6 % 128;
                        int i7 = i6 % 2;
                        return true;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else {
                    if ((!Arrays.equals(list.get(i5), list2.get(i5)) ? 30 : Typography.amp) != '&') {
                        return false;
                    }
                    i5++;
                }
            }
        }
    }

    public static int hashCode(List<byte[]> list) {
        try {
            int i = setMin + 103;
            getMin = i % 128;
            if (i % 2 != 0) {
            }
            Iterator<byte[]> it = list.iterator();
            int i2 = 1;
            while (true) {
                if (!(it.hasNext())) {
                    return i2;
                }
                int i3 = setMin + 21;
                getMin = i3 % 128;
                i2 = i3 % 2 != 0 ? (1 / i2) >> hashCode(it.next()) : (i2 * 31) + hashCode(it.next());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public static int hashCode(byte[] bArr) {
        int i = setMin + 7;
        getMin = i % 128;
        int i2 = i % 2;
        int hashCode = hashCode(bArr, 0, bArr.length);
        int i3 = getMin + 7;
        setMin = i3 % 128;
        if ((i3 % 2 == 0 ? '2' : 5) != '2') {
            return hashCode;
        }
        Object obj = null;
        super.hashCode();
        return hashCode;
    }

    static int hashCode(byte[] bArr, int i, int i2) {
        int i3 = getMin + 89;
        setMin = i3 % 128;
        if (i3 % 2 == 0) {
            int partialHash = partialHash(i2, bArr, i, i2);
            int i4 = 57 / 0;
            if ((partialHash == 0 ? (char) 16 : 2) == 2) {
                return partialHash;
            }
        } else {
            try {
                int partialHash2 = partialHash(i2, bArr, i, i2);
                if ((partialHash2 == 0 ? '=' : 'X') == 'X') {
                    return partialHash2;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i5 = getMin + 11;
        setMin = i5 % 128;
        int i6 = i5 % 2;
        return 1;
    }

    static int partialHash(int i, byte[] bArr, int i2, int i3) {
        int i4 = setMin + 33;
        getMin = i4 % 128;
        if ((i4 % 2 != 0 ? 21 : 'F') == 21) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        int i5 = i2;
        while (i5 < i2 + i3) {
            int i6 = getMin + 15;
            setMin = i6 % 128;
            if (i6 % 2 == 0) {
                i = (i % 11) >> bArr[i5];
                i5 += 90;
            } else {
                i = (i * 31) + bArr[i5];
                i5++;
            }
        }
        return i;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if ((byteBuffer.capacity() != byteBuffer2.capacity() ? '8' : 15) != '8') {
            boolean equals = byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
            try {
                int i = getMin + 69;
                try {
                    setMin = i % 128;
                    if (i % 2 != 0) {
                        return equals;
                    }
                    int i2 = 57 / 0;
                    return equals;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            int i3 = setMin + 1;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            int i = getMin + 39;
            setMin = i % 128;
            int i2 = i % 2;
            int i3 = setMin + 111;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? 'T' : 19) == 19) {
                return false;
            }
            Object obj = null;
            super.hashCode();
            return false;
        }
        int i4 = 0;
        while (true) {
            if (!(i4 < list.size())) {
                return true;
            }
            try {
                if (!equalsByteBuffer(list.get(i4), list2.get(i4))) {
                    int i5 = setMin + 27;
                    getMin = i5 % 128;
                    if (i5 % 2 != 0) {
                    }
                    return false;
                }
                i4++;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        int i = 1;
        Iterator<ByteBuffer> it = list.iterator();
        try {
            int i2 = getMin + 21;
            setMin = i2 % 128;
            while (true) {
                int i3 = i2 % 2;
                if ((it.hasNext() ? 'Q' : '=') == '=') {
                    return i;
                }
                try {
                    int i4 = getMin + 57;
                    setMin = i4 % 128;
                    i = (i4 % 2 == 0 ? Typography.greater : '0') != '0' ? (32 % i) >> hashCodeByteBuffer(it.next()) : (i * 31) + hashCodeByteBuffer(it.next());
                    i2 = getMin + 45;
                    setMin = i2 % 128;
                } catch (Exception e) {
                    throw e;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        int i;
        boolean z = false;
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash != 0) {
                z = true;
            }
            if (z) {
                return partialHash;
            }
            int i2 = setMin + 117;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            return 1;
        }
        int i4 = 4096;
        if (byteBuffer.capacity() <= 4096) {
            i4 = byteBuffer.capacity();
        }
        byte[] bArr = new byte[i4];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity = byteBuffer.capacity();
        while (true) {
            if ((duplicate.remaining() > 0 ? Typography.less : 'L') != '<') {
                break;
            }
            try {
                if ((duplicate.remaining() <= i4 ? 25 : '-') != '-') {
                    i = duplicate.remaining();
                    int i5 = getMin + 103;
                    setMin = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    i = i4;
                }
                duplicate.get(bArr, 0, i);
                capacity = partialHash(capacity, bArr, 0, i);
            } catch (Exception e) {
                throw e;
            }
        }
        if (capacity == 0) {
            return 1;
        }
        return capacity;
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        T invoke;
        int i = getMin + 95;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                Method method = cls.getMethod("getDefaultInstance", new Class[0]);
                invoke = method.invoke(method, new Object[0]);
            } catch (Exception e) {
                throw new RuntimeException("Failed to get default instance for ".concat(String.valueOf(cls)), e);
            }
        } else {
            Method method2 = cls.getMethod("getDefaultInstance", new Class[0]);
            invoke = method2.invoke(method2, new Object[0]);
        }
        return (MessageLite) invoke;
    }

    static Object mergeMessage(Object obj, Object obj2) {
        int i = setMin + 113;
        getMin = i % 128;
        int i2 = i % 2;
        MessageLite buildPartial = ((MessageLite) obj).toBuilder().mergeFrom((MessageLite) obj2).buildPartial();
        int i3 = getMin + 23;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return buildPartial;
    }

    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter2) {
            this.fromList = list;
            this.converter = converter2;
        }

        public T get(int i) {
            return this.converter.convert(this.fromList.get(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        /* access modifiers changed from: private */
        public final Converter<RealValue, V> valueConverter;

        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a2);
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> enumLiteMap, final T t) {
            return new Converter<Integer, T>() {
                public final T doForward(Integer num) {
                    T findValueByNumber = enumLiteMap.findValueByNumber(num.intValue());
                    return findValueByNumber == null ? t : findValueByNumber;
                }

                public final Integer doBackward(T t) {
                    return Integer.valueOf(t.getNumber());
                }
            };
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.realMap = map;
            this.valueConverter = converter;
        }

        public V get(Object obj) {
            RealValue realvalue = this.realMap.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.valueConverter.doForward(realvalue);
        }

        public V put(K k, V v) {
            RealValue put = this.realMap.put(k, this.valueConverter.doBackward(v));
            if (put == null) {
                return null;
            }
            return this.valueConverter.doForward(put);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new SetAdapter(this.realMap.entrySet());
        }

        class SetAdapter extends AbstractSet<Map.Entry<K, V>> {
            private final Set<Map.Entry<K, RealValue>> realSet;

            public SetAdapter(Set<Map.Entry<K, RealValue>> set) {
                this.realSet = set;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new IteratorAdapter(this.realSet.iterator());
            }

            public int size() {
                return this.realSet.size();
            }
        }

        class IteratorAdapter implements Iterator<Map.Entry<K, V>> {
            private final Iterator<Map.Entry<K, RealValue>> realIterator;

            public IteratorAdapter(Iterator<Map.Entry<K, RealValue>> it) {
                this.realIterator = it;
            }

            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            public Map.Entry<K, V> next() {
                return new EntryAdapter(this.realIterator.next());
            }

            public void remove() {
                this.realIterator.remove();
            }
        }

        class EntryAdapter implements Map.Entry<K, V> {
            private final Map.Entry<K, RealValue> realEntry;

            public EntryAdapter(Map.Entry<K, RealValue> entry) {
                this.realEntry = entry;
            }

            public K getKey() {
                return this.realEntry.getKey();
            }

            public V getValue() {
                return MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            public V setValue(V v) {
                RealValue value = this.realEntry.setValue(MapAdapter.this.valueConverter.doBackward(v));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.valueConverter.doForward(value);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof Map.Entry) && getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
            }

            public int hashCode() {
                return this.realEntry.hashCode();
            }
        }
    }

    private static String setMax(char[] cArr, int i, byte b) {
        char[] cArr2 = length;
        char c = setMax;
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i--;
            cArr3[i] = (char) (cArr[i] - b);
        }
        if (i > 1) {
            for (int i2 = 0; i2 < i; i2 += 2) {
                char c2 = cArr[i2];
                int i3 = i2 + 1;
                char c3 = cArr[i3];
                if (c2 == c3) {
                    cArr3[i2] = (char) (c2 - b);
                    cArr3[i3] = (char) (c3 - b);
                    int i4 = getMin + 37;
                    setMin = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    int min = onActivityPreStopped.setMin(c2, c);
                    int length2 = onActivityPreStopped.length(c2, c);
                    int min2 = onActivityPreStopped.setMin(c3, c);
                    int length3 = onActivityPreStopped.length(c3, c);
                    if ((length2 == length3 ? ':' : ' ') == ':') {
                        int max = onActivityPreStopped.setMax(min, c);
                        int max2 = onActivityPreStopped.setMax(min2, c);
                        int max3 = onActivityPreStopped.getMax(max, length2, c);
                        int max4 = onActivityPreStopped.getMax(max2, length3, c);
                        cArr3[i2] = cArr2[max3];
                        cArr3[i3] = cArr2[max4];
                    } else if (min == min2) {
                        try {
                            int i6 = getMin + 119;
                            setMin = i6 % 128;
                            int i7 = i6 % 2;
                            int max5 = onActivityPreStopped.setMax(length2, c);
                            int max6 = onActivityPreStopped.setMax(length3, c);
                            int max7 = onActivityPreStopped.getMax(min, max5, c);
                            int max8 = onActivityPreStopped.getMax(min2, max6, c);
                            cArr3[i2] = cArr2[max7];
                            cArr3[i3] = cArr2[max8];
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        int max9 = onActivityPreStopped.getMax(min, length3, c);
                        int max10 = onActivityPreStopped.getMax(min2, length2, c);
                        cArr3[i2] = cArr2[max9];
                        cArr3[i3] = cArr2[max10];
                        int i8 = setMin + 99;
                        getMin = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
            }
        }
        return new String(cArr3);
    }
}
