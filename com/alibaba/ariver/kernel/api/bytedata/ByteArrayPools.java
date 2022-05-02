package com.alibaba.ariver.kernel.api.bytedata;

class ByteArrayPools {
    ByteArrayPools() {
    }

    static abstract class ByteArrayPool extends Pool<byte[]> {
        private ByteArrayPool() {
            super(1, 8);
        }

        public synchronized byte[] obtain() {
            return (byte[]) super.obtain();
        }

        public synchronized void free(byte[] bArr) {
            super.free(bArr);
        }
    }

    static class ByteArray2Pool extends ByteArrayPool {
        /* access modifiers changed from: protected */
        public byte[] newObject() {
            return new byte[2];
        }

        ByteArray2Pool() {
            super();
        }
    }

    static class ByteArray4Pool extends ByteArrayPool {
        /* access modifiers changed from: protected */
        public byte[] newObject() {
            return new byte[4];
        }

        ByteArray4Pool() {
            super();
        }
    }

    static class ByteArray8Pool extends ByteArrayPool {
        /* access modifiers changed from: protected */
        public byte[] newObject() {
            return new byte[8];
        }

        ByteArray8Pool() {
            super();
        }
    }

    static class ByteArray127Pool extends ByteArrayPool {
        /* access modifiers changed from: protected */
        public byte[] newObject() {
            return new byte[127];
        }

        ByteArray127Pool() {
            super();
        }
    }
}
