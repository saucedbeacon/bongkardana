package com.google.firebase.perf.util;

import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;

public enum StorageUnit {
    TERABYTES(1099511627776L) {
        public final long convert(long j, StorageUnit storageUnit) {
            return storageUnit.toTerabytes(j);
        }
    },
    GIGABYTES(ConvertUtils.GB) {
        public final long convert(long j, StorageUnit storageUnit) {
            return storageUnit.toGigabytes(j);
        }
    },
    MEGABYTES(ConvertUtils.MB) {
        public final long convert(long j, StorageUnit storageUnit) {
            return storageUnit.toMegabytes(j);
        }
    },
    KILOBYTES(ConvertUtils.KB) {
        public final long convert(long j, StorageUnit storageUnit) {
            return storageUnit.toKilobytes(j);
        }
    },
    BYTES(1) {
        public final long convert(long j, StorageUnit storageUnit) {
            return storageUnit.toBytes(j);
        }
    };
    
    long numBytes;

    public abstract long convert(long j, StorageUnit storageUnit);

    private StorageUnit(long j) {
        this.numBytes = j;
    }

    public long toBytes(long j) {
        return j * this.numBytes;
    }

    public long toKilobytes(long j) {
        return (j * this.numBytes) / KILOBYTES.numBytes;
    }

    public long toMegabytes(long j) {
        return (j * this.numBytes) / MEGABYTES.numBytes;
    }

    public long toGigabytes(long j) {
        return (j * this.numBytes) / GIGABYTES.numBytes;
    }

    public long toTerabytes(long j) {
        return (j * this.numBytes) / TERABYTES.numBytes;
    }
}
