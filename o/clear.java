package o;

import id.dana.data.constant.BranchLinkConstant;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

final class clear {

    static class length {
        long getMax;
        long setMin;

        length() {
        }
    }

    clear() {
    }

    static long getMax(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, BranchLinkConstant.PayloadKey.REFERRAL);
        try {
            return getMin(randomAccessFile, getMin(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    private static length getMin(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length2 = randomAccessFile.length() - 22;
        long j = 0;
        if (length2 >= 0) {
            long j2 = length2 - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length2);
                if (randomAccessFile.readInt() != reverseBytes) {
                    length2--;
                } else {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    length length3 = new length();
                    length3.setMin = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    length3.getMax = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return length3;
                }
            } while (length2 >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder sb = new StringBuilder("File too short to be a zip file: ");
        sb.append(randomAccessFile.length());
        throw new ZipException(sb.toString());
    }

    private static long getMin(RandomAccessFile randomAccessFile, length length2) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = length2.setMin;
        randomAccessFile.seek(length2.getMax);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
        }
        return crc32.getValue();
    }
}
