package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import o.onActivityPostCreated;

public final class DefaultContentMetadata implements ContentMetadata {
    public static final DefaultContentMetadata EMPTY = new DefaultContentMetadata(Collections.emptyMap());
    private static final int MAX_VALUE_LENGTH = 10485760;
    private static int equals = 1;
    private static char getMax;
    private static char getMin;
    private static int length;
    private static char setMax;
    private static char setMin;
    private int hashCode;
    private final Map<String, byte[]> metadata;

    static void getMax() {
        setMin = 64613;
        setMax = 34782;
        getMin = 3169;
        getMax = 14567;
    }

    static {
        getMax();
        int i = length + 41;
        equals = i % 128;
        if (i % 2 == 0) {
            int i2 = 87 / 0;
        }
    }

    public static DefaultContentMetadata readFromStream(DataInputStream dataInputStream) throws IOException {
        int readInt;
        try {
            int readInt2 = dataInputStream.readInt();
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                boolean z = true;
                if (i < readInt2) {
                    int i2 = equals + 35;
                    length = i2 % 128;
                    int i3 = i2 % 2;
                    String readUTF = dataInputStream.readUTF();
                    readInt = dataInputStream.readInt();
                    if (readInt < 0) {
                        break;
                    }
                    int i4 = equals + 99;
                    length = i4 % 128;
                    if (i4 % 2 == 0) {
                        z = false;
                    }
                    if (!z) {
                        if (readInt > MAX_VALUE_LENGTH) {
                            break;
                        }
                    } else {
                        Object[] objArr = null;
                        int length2 = objArr.length;
                        if (readInt > MAX_VALUE_LENGTH) {
                            break;
                        }
                    }
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr);
                    hashMap.put(readUTF, bArr);
                    i++;
                } else {
                    return new DefaultContentMetadata(hashMap);
                }
            }
            throw new IOException("Invalid value size: ".concat(String.valueOf(readInt)));
        } catch (Exception e) {
            throw e;
        }
    }

    private DefaultContentMetadata(Map<String, byte[]> map) {
        this.metadata = Collections.unmodifiableMap(map);
    }

    public final DefaultContentMetadata copyWithMutationsApplied(ContentMetadataMutations contentMetadataMutations) {
        Map<String, byte[]> applyMutations = applyMutations(this.metadata, contentMetadataMutations);
        if ((isMetadataEqual(applyMutations) ? 'U' : Typography.dollar) == '$') {
            return new DefaultContentMetadata(applyMutations);
        }
        try {
            int i = length + 73;
            equals = i % 128;
            if ((i % 2 == 0 ? '`' : 'J') != 'J') {
                int i2 = 70 / 0;
            }
            int i3 = equals + 61;
            length = i3 % 128;
            int i4 = i3 % 2;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void writeToStream(DataOutputStream dataOutputStream) throws IOException {
        int i = equals + 5;
        length = i % 128;
        int i2 = i % 2;
        dataOutputStream.writeInt(this.metadata.size());
        Iterator<Map.Entry<String, byte[]>> it = this.metadata.entrySet().iterator();
        int i3 = length + 69;
        equals = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            if ((it.hasNext() ? '`' : 6) == '`') {
                int i5 = length + 49;
                equals = i5 % 128;
                if ((i5 % 2 == 0 ? 'B' : 4) != 'B') {
                    Map.Entry next = it.next();
                    dataOutputStream.writeUTF((String) next.getKey());
                    byte[] bArr = (byte[]) next.getValue();
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                } else {
                    Map.Entry next2 = it.next();
                    dataOutputStream.writeUTF((String) next2.getKey());
                    byte[] bArr2 = (byte[]) next2.getValue();
                    dataOutputStream.writeInt(bArr2.length);
                    dataOutputStream.write(bArr2);
                    int i6 = 16 / 0;
                }
            } else {
                return;
            }
        }
    }

    public final byte[] get(String str, byte[] bArr) {
        int i = length + 73;
        equals = i % 128;
        int i2 = i % 2;
        if ((this.metadata.containsKey(str) ? 17 : '5') == '5') {
            return bArr;
        }
        int i3 = length + 45;
        equals = i3 % 128;
        if ((i3 % 2 == 0 ? 12 : 'C') != 'C') {
            try {
                byte[] bArr2 = this.metadata.get(str);
                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                Object[] objArr = null;
                int length2 = objArr.length;
                return copyOf;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                byte[] bArr3 = this.metadata.get(str);
                return Arrays.copyOf(bArr3, bArr3.length);
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r5.metadata.containsKey(r6) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String get(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = length
            int r0 = r0 + 55
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x0020
            java.util.Map<java.lang.String, byte[]> r0 = r5.metadata
            boolean r0 = r0.containsKey(r6)
            int r4 = r3.length     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x005a
            goto L_0x0028
        L_0x001e:
            r6 = move-exception
            throw r6
        L_0x0020:
            java.util.Map<java.lang.String, byte[]> r0 = r5.metadata
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x005a
        L_0x0028:
            java.util.Map<java.lang.String, byte[]> r7 = r5.metadata
            java.lang.Object r6 = r7.get(r6)
            byte[] r6 = (byte[]) r6
            java.lang.String r7 = new java.lang.String
            r0 = 6
            char[] r0 = new char[r0]
            r0 = {26079, 15414, 3165, 11103, 8813, -13649} // fill-array
            java.lang.String r0 = length(r0)
            java.lang.String r0 = r0.intern()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            r7.<init>(r6, r0)
            int r6 = length
            int r6 = r6 + 43
            int r0 = r6 % 128
            equals = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0054
            r1 = 1
        L_0x0054:
            if (r1 == 0) goto L_0x005a
            int r6 = r3.length     // Catch:{ all -> 0x0058 }
            return r7
        L_0x0058:
            r6 = move-exception
            throw r6
        L_0x005a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.get(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if ((r2.metadata.containsKey(r3) ? '?' : '^') != '?') goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if ((r0 ? 29 : '*') != '*') goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        r3 = equals + 71;
        length = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long get(java.lang.String r3, long r4) {
        /*
            r2 = this;
            int r0 = length     // Catch:{ Exception -> 0x0058 }
            int r0 = r0 + 83
            int r1 = r0 % 128
            equals = r1     // Catch:{ Exception -> 0x0058 }
            int r0 = r0 % 2
            r1 = 37
            if (r0 != 0) goto L_0x0011
            r0 = 37
            goto L_0x0013
        L_0x0011:
            r0 = 15
        L_0x0013:
            if (r0 == r1) goto L_0x0027
            java.util.Map<java.lang.String, byte[]> r0 = r2.metadata
            boolean r0 = r0.containsKey(r3)
            r1 = 63
            if (r0 == 0) goto L_0x0022
            r0 = 63
            goto L_0x0024
        L_0x0022:
            r0 = 94
        L_0x0024:
            if (r0 == r1) goto L_0x003a
            goto L_0x004b
        L_0x0027:
            java.util.Map<java.lang.String, byte[]> r0 = r2.metadata
            boolean r0 = r0.containsKey(r3)
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0056 }
            r1 = 42
            if (r0 == 0) goto L_0x0036
            r0 = 29
            goto L_0x0038
        L_0x0036:
            r0 = 42
        L_0x0038:
            if (r0 == r1) goto L_0x004b
        L_0x003a:
            java.util.Map<java.lang.String, byte[]> r4 = r2.metadata
            java.lang.Object r3 = r4.get(r3)
            byte[] r3 = (byte[]) r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            long r3 = r3.getLong()
            return r3
        L_0x004b:
            int r3 = equals
            int r3 = r3 + 71
            int r0 = r3 % 128
            length = r0
            int r3 = r3 % 2
            return r4
        L_0x0056:
            r3 = move-exception
            throw r3
        L_0x0058:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.get(java.lang.String, long):long");
    }

    public final boolean contains(String str) {
        boolean z;
        int i = equals + 47;
        length = i % 128;
        if ((i % 2 != 0 ? '%' : 'A') != '%') {
            z = this.metadata.containsKey(str);
        } else {
            z = this.metadata.containsKey(str);
            int i2 = 40 / 0;
        }
        try {
            int i3 = equals + 59;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? 'J' : 15) == 15) {
                return z;
            }
            int i4 = 18 / 0;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            int i = length + 43;
            equals = i % 128;
            int i2 = i % 2;
            int i3 = length + 39;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                boolean isMetadataEqual = isMetadataEqual(((DefaultContentMetadata) obj).metadata);
                int i5 = length + 43;
                equals = i5 % 128;
                if ((i5 % 2 == 0 ? 'B' : 'T') != 'B') {
                    return isMetadataEqual;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return isMetadataEqual;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r0 = r4.metadata.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r0.hasNext() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r2 = '[';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r2 = '8';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r2 == '8') goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (java.util.Arrays.equals((byte[]) r2.getValue(), r5.get(r2.getKey())) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r2 = '/';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r2 == '/') goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r5 = equals + 101;
        length = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if ((r5 % 2) == 0) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != r2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r4.metadata.size() != r5.size()) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isMetadataEqual(java.util.Map<java.lang.String, byte[]> r5) {
        /*
            r4 = this;
            int r0 = equals
            int r0 = r0 + 83
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0020
            java.util.Map<java.lang.String, byte[]> r0 = r4.metadata
            int r0 = r0.size()
            int r2 = r5.size()
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x001e }
            if (r0 == r2) goto L_0x0037
            goto L_0x002c
        L_0x001e:
            r5 = move-exception
            throw r5
        L_0x0020:
            java.util.Map<java.lang.String, byte[]> r0 = r4.metadata
            int r0 = r0.size()
            int r2 = r5.size()
            if (r0 == r2) goto L_0x0037
        L_0x002c:
            int r5 = length
            int r5 = r5 + 83
            int r0 = r5 % 128
            equals = r0
            int r5 = r5 % 2
            return r1
        L_0x0037:
            java.util.Map<java.lang.String, byte[]> r0 = r4.metadata
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r2 = r0.hasNext()
            r3 = 56
            if (r2 == 0) goto L_0x004c
            r2 = 91
            goto L_0x004e
        L_0x004c:
            r2 = 56
        L_0x004e:
            if (r2 == r3) goto L_0x008c
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x008a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ Exception -> 0x0088 }
            byte[] r3 = (byte[]) r3     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r2 = r2.getKey()     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ Exception -> 0x0088 }
            byte[] r2 = (byte[]) r2     // Catch:{ Exception -> 0x0088 }
            boolean r2 = java.util.Arrays.equals(r3, r2)     // Catch:{ Exception -> 0x0088 }
            r3 = 47
            if (r2 != 0) goto L_0x0070
            r2 = 4
            goto L_0x0072
        L_0x0070:
            r2 = 47
        L_0x0072:
            if (r2 == r3) goto L_0x0041
            int r5 = equals
            int r5 = r5 + 101
            int r0 = r5 % 128
            length = r0
            int r5 = r5 % 2
            r0 = 57
            if (r5 == 0) goto L_0x0085
            r5 = 11
            goto L_0x0087
        L_0x0085:
            r5 = 57
        L_0x0087:
            return r1
        L_0x0088:
            r5 = move-exception
            throw r5
        L_0x008a:
            r5 = move-exception
            throw r5
        L_0x008c:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.isMetadataEqual(java.util.Map):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r0 == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        if ((r6.hashCode != 0) != true) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r6 = this;
            int r0 = length     // Catch:{ Exception -> 0x0064 }
            int r0 = r0 + 67
            int r1 = r0 % 128
            equals = r1     // Catch:{ Exception -> 0x0062 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0017
            int r0 = r6.hashCode     // Catch:{ Exception -> 0x0062 }
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x005f
            goto L_0x0020
        L_0x0015:
            r0 = move-exception
            throw r0
        L_0x0017:
            int r0 = r6.hashCode     // Catch:{ Exception -> 0x0062 }
            if (r0 != 0) goto L_0x001d
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == r2) goto L_0x005f
        L_0x0020:
            java.util.Map<java.lang.String, byte[]> r0 = r6.metadata
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L_0x002b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 == 0) goto L_0x005d
            int r4 = equals
            int r4 = r4 + 13
            int r5 = r4 % 128
            length = r5
            int r4 = r4 % 2
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.hashCode()
            java.lang.Object r4 = r4.getValue()
            byte[] r4 = (byte[]) r4
            int r4 = java.util.Arrays.hashCode(r4)
            r4 = r4 ^ r5
            int r3 = r3 + r4
            goto L_0x002b
        L_0x005d:
            r6.hashCode = r3
        L_0x005f:
            int r0 = r6.hashCode
            return r0
        L_0x0062:
            r0 = move-exception
            throw r0
        L_0x0064:
            r0 = move-exception
            goto L_0x0067
        L_0x0066:
            throw r0
        L_0x0067:
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.DefaultContentMetadata.hashCode():int");
    }

    private static Map<String, byte[]> applyMutations(Map<String, byte[]> map, ContentMetadataMutations contentMetadataMutations) {
        HashMap hashMap = new HashMap(map);
        try {
            removeValues(hashMap, contentMetadataMutations.getRemovedValues());
            addValues(hashMap, contentMetadataMutations.getEditedValues());
            int i = length + 123;
            equals = i % 128;
            int i2 = i % 2;
            return hashMap;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void removeValues(HashMap<String, byte[]> hashMap, List<String> list) {
        int i = 0;
        int i2 = equals + 105;
        length = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if ((i < list.size() ? Typography.greater : ':') == '>') {
                int i4 = equals + 15;
                length = i4 % 128;
                int i5 = i4 % 2;
                hashMap.remove(list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private static void addValues(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        byte[] bArr;
        String str;
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            if ((it.hasNext() ? 'L' : ']') != ']') {
                int i = length + 25;
                equals = i % 128;
                if (!(i % 2 != 0)) {
                    str = it.next();
                    byte[] bytes = getBytes(map.get(str));
                    int i2 = 15 / 0;
                    bArr = bytes;
                    if (bytes.length > MAX_VALUE_LENGTH) {
                        break;
                    }
                } else {
                    str = it.next();
                    bArr = getBytes(map.get(str));
                    if (bArr.length > MAX_VALUE_LENGTH) {
                        break;
                    }
                }
                try {
                    hashMap.put(str, bArr);
                } catch (Exception e) {
                    throw e;
                }
            } else {
                int i3 = length + 107;
                equals = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
        }
        StringBuilder sb = new StringBuilder("The size of ");
        sb.append(str);
        sb.append(" (");
        sb.append(bArr.length);
        sb.append(") is greater than maximum allowed: 10485760");
        throw new IllegalArgumentException(sb.toString());
    }

    private static byte[] getBytes(Object obj) {
        int i = equals + 79;
        length = i % 128;
        int i2 = i % 2;
        boolean z = false;
        if (!(obj instanceof Long)) {
            if (!(obj instanceof String)) {
                z = true;
            }
            if (!z) {
                return ((String) obj).getBytes(Charset.forName(length(new char[]{26079, 15414, 3165, 11103, 8813, 51887}).intern()));
            }
            if (obj instanceof byte[]) {
                int i3 = equals + 21;
                length = i3 % 128;
                int i4 = i3 % 2;
                return (byte[]) obj;
            }
            throw new IllegalArgumentException();
        }
        int i5 = equals + 9;
        length = i5 % 128;
        return ByteBuffer.allocate(i5 % 2 != 0 ? 109 : 8).putLong(((Long) obj).longValue()).array();
    }

    private static String length(char[] cArr) {
        char[] cArr2;
        char[] cArr3;
        int i = equals + 23;
        length = i % 128;
        if (!(i % 2 == 0)) {
            cArr3 = new char[cArr.length];
            cArr2 = new char[5];
        } else {
            cArr3 = new char[cArr.length];
            cArr2 = new char[2];
        }
        int i2 = 0;
        while (true) {
            if (i2 >= cArr.length) {
                return new String(cArr3, 1, cArr3[0]);
            }
            try {
                int i3 = length + 5;
                equals = i3 % 128;
                int i4 = i3 % 2;
                cArr2[0] = cArr[i2];
                int i5 = i2 + 1;
                cArr2[1] = cArr[i5];
                onActivityPostCreated.setMax(cArr2, setMin, getMax, setMax, getMin);
                cArr3[i2] = cArr2[0];
                cArr3[i5] = cArr2[1];
                i2 += 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
