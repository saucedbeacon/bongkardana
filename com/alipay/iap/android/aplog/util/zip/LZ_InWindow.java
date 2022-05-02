package com.alipay.iap.android.aplog.util.zip;

import java.io.IOException;
import java.io.InputStream;

public class LZ_InWindow {
    public int _blockSize;
    public byte[] _bufferBase;
    public int _bufferOffset;
    int _keepSizeAfter;
    int _keepSizeBefore;
    int _pointerToLastSafePosition;
    public int _pos;
    int _posLimit;
    InputStream _stream;
    boolean _streamEndWasReached;
    public int _streamPos;

    public void MoveBlock() {
        int i = (this._bufferOffset + this._pos) - this._keepSizeBefore;
        if (i > 0) {
            i--;
        }
        int i2 = (this._bufferOffset + this._streamPos) - i;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this._bufferBase;
            bArr[i3] = bArr[i + i3];
        }
        this._bufferOffset -= i;
    }

    public void ReadBlock() throws IOException {
        if (!this._streamEndWasReached) {
            while (true) {
                int i = this._bufferOffset;
                int i2 = (0 - i) + this._blockSize;
                int i3 = this._streamPos;
                int i4 = i2 - i3;
                if (i4 != 0) {
                    int read = this._stream.read(this._bufferBase, i + i3, i4);
                    if (read == -1) {
                        int i5 = this._streamPos;
                        this._posLimit = i5;
                        int i6 = this._bufferOffset;
                        int i7 = i5 + i6;
                        int i8 = this._pointerToLastSafePosition;
                        if (i7 > i8) {
                            this._posLimit = i8 - i6;
                        }
                        this._streamEndWasReached = true;
                        return;
                    }
                    int i9 = this._streamPos + read;
                    this._streamPos = i9;
                    int i10 = this._pos;
                    int i11 = this._keepSizeAfter;
                    if (i9 >= i10 + i11) {
                        this._posLimit = i9 - i11;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Free() {
        this._bufferBase = null;
    }

    public void Create(int i, int i2, int i3) {
        this._keepSizeBefore = i;
        this._keepSizeAfter = i2;
        int i4 = i + i2 + i3;
        if (this._bufferBase == null || this._blockSize != i4) {
            Free();
            this._blockSize = i4;
            this._bufferBase = new byte[i4];
        }
        this._pointerToLastSafePosition = this._blockSize - i2;
    }

    public void SetStream(InputStream inputStream) {
        this._stream = inputStream;
    }

    public void ReleaseStream() {
        this._stream = null;
    }

    public void Init() throws IOException {
        this._bufferOffset = 0;
        this._pos = 0;
        this._streamPos = 0;
        this._streamEndWasReached = false;
        ReadBlock();
    }

    public void MovePos() throws IOException {
        int i = this._pos + 1;
        this._pos = i;
        if (i > this._posLimit) {
            if (this._bufferOffset + i > this._pointerToLastSafePosition) {
                MoveBlock();
            }
            ReadBlock();
        }
    }

    public byte GetIndexByte(int i) {
        return this._bufferBase[this._bufferOffset + this._pos + i];
    }

    public int GetMatchLen(int i, int i2, int i3) {
        if (this._streamEndWasReached) {
            int i4 = this._pos;
            int i5 = i4 + i + i3;
            int i6 = this._streamPos;
            if (i5 > i6) {
                i3 = i6 - (i4 + i);
            }
        }
        int i7 = i2 + 1;
        int i8 = this._bufferOffset + this._pos + i;
        int i9 = 0;
        while (i9 < i3) {
            byte[] bArr = this._bufferBase;
            int i10 = i8 + i9;
            if (bArr[i10] != bArr[i10 - i7]) {
                break;
            }
            i9++;
        }
        return i9;
    }

    public int GetNumAvailableBytes() {
        return this._streamPos - this._pos;
    }

    public void ReduceOffsets(int i) {
        this._bufferOffset += i;
        this._posLimit -= i;
        this._pos -= i;
        this._streamPos -= i;
    }
}
