package com.alibaba.griver.image.framework.decode;

public class ImageDecoder {
    public static DecodeResult decodeBitmap(byte[] bArr, DecodeOptions decodeOptions) {
        return SystemImageDecoder.decodeBitmap(bArr, decodeOptions);
    }
}
