package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.UShort;

public final class getViewHorizontalDragRange {
    public static String[] setMax(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return setMax(fileInputStream.getChannel());
        } finally {
            fileInputStream.close();
        }
    }

    private static String[] setMax(FileChannel fileChannel) throws IOException {
        long j;
        short s;
        short s2;
        ByteBuffer byteBuffer;
        long j2;
        long j3;
        boolean z;
        String str;
        long j4;
        long j5;
        long j6;
        String str2;
        long j7;
        int i;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        int i2;
        FileChannel fileChannel2 = fileChannel;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        int i3 = 4;
        setMin(fileChannel2, allocate, 4, 0);
        if ((((long) allocate.getInt()) & 4294967295L) == 1179403647) {
            boolean z2 = true;
            if (setMin(fileChannel2, allocate, 4) != 1) {
                z2 = false;
            }
            if (setMin(fileChannel2, allocate, 5) == 2) {
                allocate.order(ByteOrder.BIG_ENDIAN);
            }
            if (z2) {
                setMin(fileChannel2, allocate, 4, 28);
                j = ((long) allocate.getInt()) & 4294967295L;
            } else {
                setMin(fileChannel2, allocate, 8, 32);
                j = allocate.getLong();
            }
            if (z2) {
                setMin(fileChannel2, allocate, 2, 44);
                s = allocate.getShort() & UShort.MAX_VALUE;
            } else {
                setMin(fileChannel2, allocate, 2, 56);
                s = allocate.getShort() & UShort.MAX_VALUE;
            }
            long j13 = (long) s;
            if (z2) {
                setMin(fileChannel2, allocate, 2, 42);
                s2 = allocate.getShort();
            } else {
                setMin(fileChannel2, allocate, 2, 54);
                s2 = allocate.getShort();
            }
            short s3 = s2 & UShort.MAX_VALUE;
            ByteBuffer byteBuffer2 = allocate;
            if (j13 == 65535) {
                if (z2) {
                    byteBuffer = byteBuffer2;
                    setMin(fileChannel2, byteBuffer, 4, 32);
                    j11 = 4294967295L;
                    j12 = ((long) byteBuffer.getInt()) & 4294967295L;
                } else {
                    byteBuffer = byteBuffer2;
                    j11 = 4294967295L;
                    setMin(fileChannel2, byteBuffer, 8, 40);
                    j12 = byteBuffer.getLong();
                }
                if (z2) {
                    setMin(fileChannel2, byteBuffer, 4, j12 + 28);
                    i2 = byteBuffer.getInt();
                } else {
                    setMin(fileChannel2, byteBuffer, 4, j12 + 44);
                    i2 = byteBuffer.getInt();
                }
                j13 = ((long) i2) & j11;
            } else {
                byteBuffer = byteBuffer2;
            }
            long j14 = j;
            long j15 = 0;
            while (true) {
                if (j15 >= j13) {
                    j2 = 0;
                    break;
                }
                setMin(fileChannel2, byteBuffer, 4, j14 + 0);
                if ((((long) byteBuffer.getInt()) & 4294967295L) != 2) {
                    j14 += (long) s3;
                    j15++;
                } else if (z2) {
                    setMin(fileChannel2, byteBuffer, 4, j14 + 4);
                    j2 = ((long) byteBuffer.getInt()) & 4294967295L;
                } else {
                    setMin(fileChannel2, byteBuffer, 8, j14 + 8);
                    j2 = byteBuffer.getLong();
                }
            }
            long j16 = 0;
            if (j2 != 0) {
                long j17 = j2;
                long j18 = 0;
                int i4 = 0;
                while (true) {
                    if (z2) {
                        z = z2;
                        setMin(fileChannel2, byteBuffer, i3, j17 + j16);
                        j3 = ((long) byteBuffer.getInt()) & 4294967295L;
                    } else {
                        z = z2;
                        setMin(fileChannel2, byteBuffer, 8, j17 + j16);
                        j3 = byteBuffer.getLong();
                    }
                    if (j3 == 1) {
                        if (i4 != Integer.MAX_VALUE) {
                            i4++;
                            str = "malformed DT_NEEDED section";
                        } else {
                            throw new getMax("malformed DT_NEEDED section");
                        }
                    } else if (j3 != 5) {
                        str = "malformed DT_NEEDED section";
                    } else if (z) {
                        str = "malformed DT_NEEDED section";
                        setMin(fileChannel2, byteBuffer, 4, j17 + 4);
                        j18 = ((long) byteBuffer.getInt()) & 4294967295L;
                    } else {
                        str = "malformed DT_NEEDED section";
                        setMin(fileChannel2, byteBuffer, 8, j17 + 8);
                        j18 = byteBuffer.getLong();
                    }
                    j17 += z ? 8 : 16;
                    j16 = 0;
                    if (j3 != 0) {
                        z2 = z;
                        i3 = 4;
                    } else if (j18 != 0) {
                        long j19 = j;
                        int i5 = 0;
                        while (true) {
                            if (((long) i5) >= j13) {
                                j4 = j2;
                                j5 = 0;
                                break;
                            }
                            setMin(fileChannel2, byteBuffer, 4, j19 + j16);
                            if ((((long) byteBuffer.getInt()) & 4294967295L) == 1) {
                                if (z) {
                                    setMin(fileChannel2, byteBuffer, 4, j19 + 8);
                                    j8 = ((long) byteBuffer.getInt()) & 4294967295L;
                                } else {
                                    setMin(fileChannel2, byteBuffer, 8, j19 + 16);
                                    j8 = byteBuffer.getLong();
                                }
                                if (z) {
                                    i = i5;
                                    j4 = j2;
                                    setMin(fileChannel2, byteBuffer, 4, j19 + 20);
                                    j9 = ((long) byteBuffer.getInt()) & 4294967295L;
                                } else {
                                    j4 = j2;
                                    i = i5;
                                    setMin(fileChannel2, byteBuffer, 8, j19 + 40);
                                    j9 = byteBuffer.getLong();
                                }
                                if (j8 <= j18 && j18 < j9 + j8) {
                                    if (z) {
                                        setMin(fileChannel2, byteBuffer, 4, j19 + 4);
                                        j10 = ((long) byteBuffer.getInt()) & 4294967295L;
                                    } else {
                                        setMin(fileChannel2, byteBuffer, 8, j19 + 8);
                                        j10 = byteBuffer.getLong();
                                    }
                                    j5 = j10 + (j18 - j8);
                                }
                            } else {
                                j4 = j2;
                                i = i5;
                            }
                            j19 += (long) s3;
                            i5 = i + 1;
                            j2 = j4;
                            j16 = 0;
                        }
                        long j20 = 0;
                        if (j5 != 0) {
                            String[] strArr = new String[i4];
                            int i6 = 0;
                            while (true) {
                                if (z) {
                                    setMin(fileChannel2, byteBuffer, 4, j4 + j20);
                                    j6 = ((long) byteBuffer.getInt()) & 4294967295L;
                                } else {
                                    setMin(fileChannel2, byteBuffer, 8, j4 + j20);
                                    j6 = byteBuffer.getLong();
                                }
                                if (j6 == 1) {
                                    if (z) {
                                        setMin(fileChannel2, byteBuffer, 4, j4 + 4);
                                        j7 = ((long) byteBuffer.getInt()) & 4294967295L;
                                    } else {
                                        setMin(fileChannel2, byteBuffer, 8, j4 + 8);
                                        j7 = byteBuffer.getLong();
                                    }
                                    long j21 = j7 + j5;
                                    StringBuilder sb = new StringBuilder();
                                    while (true) {
                                        long j22 = j21 + 1;
                                        short min = setMin(fileChannel2, byteBuffer, j21);
                                        if (min == 0) {
                                            break;
                                        }
                                        sb.append((char) min);
                                        j21 = j22;
                                    }
                                    strArr[i6] = sb.toString();
                                    if (i6 != Integer.MAX_VALUE) {
                                        i6++;
                                        str2 = str;
                                    } else {
                                        throw new getMax(str);
                                    }
                                } else {
                                    str2 = str;
                                }
                                j4 += z ? 8 : 16;
                                if (j6 != 0) {
                                    str = str2;
                                    j20 = 0;
                                } else if (i6 == i4) {
                                    return strArr;
                                } else {
                                    throw new getMax(str2);
                                }
                            }
                        } else {
                            throw new getMax("did not find file offset of DT_STRTAB table");
                        }
                    } else {
                        throw new getMax("Dynamic section string-table not found");
                    }
                }
            } else {
                throw new getMax("ELF file does not contain dynamic linking information");
            }
        } else {
            throw new getMax("file is not ELF");
        }
    }

    private static void setMin(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new getMax("ELF file truncated");
    }

    private static short setMin(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        setMin(fileChannel, byteBuffer, 1, j);
        return (short) (byteBuffer.get() & 255);
    }

    static class getMax extends RuntimeException {
        getMax(String str) {
            super(str);
        }
    }
}
