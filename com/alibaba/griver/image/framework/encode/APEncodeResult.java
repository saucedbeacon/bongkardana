package com.alibaba.griver.image.framework.encode;

import com.alibaba.griver.image.framework.meta.APImageInfo;

public class APEncodeResult {
    public int code = -1;
    public byte[] encodeData;
    public String encodeFilePath;
    public int extra;
    public APImageInfo imageInfo;

    public interface CODE {
        public static final int ERROR = -1;
        public static final int SUCCESS = 0;
    }

    public interface EXTRA {
    }

    public boolean isSuccess() {
        return this.code == 0;
    }
}
