package com.alibaba.griver.image.capture.meta;

import android.hardware.Camera;

public class APVideoRecordRsp {
    public static final int CODE_ERR_CAMERA_OPEN = 100;
    public static final int CODE_ERR_CROP_SIZE = 12;
    public static final int CODE_ERR_DISK_SPACE_NOT_ENOUGH = 300;
    public static final int CODE_ERR_ENCODER_FAILED = 7;
    public static final int CODE_ERR_MIC_BAD_VALUE = 4;
    public static final int CODE_ERR_MIC_INVALID_BUFFER_INDEX = 5;
    public static final int CODE_ERR_MIC_INVALID_OPERATION = 3;
    public static final int CODE_ERR_MIC_OR_CAMERA_IN_USING = 11;
    public static final int CODE_ERR_MIC_PERMISSION_DENIED = 2;
    public static final int CODE_ERR_MIC_STOP_FAILED = 6;
    public static final int CODE_ERR_MIC_UNKNOWN_ERROR = 1;
    public static final int CODE_ERR_NETWORK_FAIL = 8;
    public static final int CODE_ERR_OPERATION = 10;
    public static final int CODE_ERR_SDCARD_UNAVAILABLE = 200;
    public static final int CODE_ERR_UNKNOWN = 9;
    public static final int CODE_INFO_BUFFERING_END = 7002;
    public static final int CODE_INFO_BUFFERING_START = 7001;
    public static final int CODE_INFO_CAMERA_OPEN = 7201;
    public static final int CODE_INFO_CONGESTION_END = 7102;
    public static final int CODE_INFO_CONGESTION_START = 7101;
    public static final int CODE_INFO_MIC_OPEN = 7202;
    public static final int CODE_SUCCESS = 0;
    public long duration;
    public Camera mCamera;
    public String mDestThumbPath;
    public String mDestVideoPath;
    public int mDisplayOrientation;
    public int mHeight;
    public String mId = "";
    public int mOrientation;
    public int mPreviewH;
    public int mPreviewW;
    public int mRspCode = -1;
    public String mTmpPath;
    public int mWidth;
    public RecordPhase recordPhase;
    public long size;

    public String toString() {
        StringBuilder sb = new StringBuilder("APVideoRecordRsp{mId='");
        sb.append(this.mId);
        sb.append('\'');
        sb.append(", mRspCode=");
        sb.append(this.mRspCode);
        sb.append(", mWidth=");
        sb.append(this.mWidth);
        sb.append(", mHeight=");
        sb.append(this.mHeight);
        sb.append(", mCamera=");
        sb.append(this.mCamera);
        sb.append(", mTmpPath='");
        sb.append(this.mTmpPath);
        sb.append('\'');
        sb.append(", mDestVideoPath='");
        sb.append(this.mDestVideoPath);
        sb.append('\'');
        sb.append(", mDestThumbPath='");
        sb.append(this.mDestThumbPath);
        sb.append('\'');
        sb.append(", mOrientation=");
        sb.append(this.mOrientation);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", size=");
        sb.append(this.size);
        sb.append('}');
        return sb.toString();
    }

    public enum RecordPhase {
        INIT(0),
        STARTING(1),
        RECORDING(2),
        PAUSING(3),
        RETRYING(4),
        STOPPING(5),
        CANCELING(6),
        SWITCHCAMERA(7),
        REOPENCAMERA(8),
        RELEASECAMERA(9),
        SNAPSHOTING(10);
        
        int val;

        private RecordPhase(int i) {
            this.val = i;
        }

        public final int getValue() {
            return this.val;
        }
    }
}
