package com.alibaba.griver.image.capture.widget;

import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Looper;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.alibaba.griver.image.capture.meta.APTakePicRsp;
import com.alibaba.griver.image.capture.meta.APTakePictureOption;
import com.alibaba.griver.image.capture.meta.APVideoRecordRsp;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class SightCameraView extends FrameLayout {
    public static final int BUFFER_TYPE_AAC = 2;
    public static final int BUFFER_TYPE_PCM = 1;
    public static final int FRAME_TYPE_TEXTUREID = 1;
    public static final int FRAME_TYPE_YUV = 2;
    public static final int MODE_PHOTO = 1;
    public static final int MODE_VIDEO = 0;

    @Retention(RetentionPolicy.CLASS)
    public @interface BufferType {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface FrameType {
    }

    public interface APTakePictureListener extends TakePictureListener {
        void onPictureProcessFinish(APTakePicRsp aPTakePicRsp);
    }

    public interface ICameraFrameListener {
        void onFrameData(Object obj, @FrameType int i, Bundle bundle);
    }

    public interface OnRecordListener {
        void onCancel();

        void onError(APVideoRecordRsp aPVideoRecordRsp);

        void onFinish(APVideoRecordRsp aPVideoRecordRsp);

        void onInfo(int i, Bundle bundle);

        void onPrepared(APVideoRecordRsp aPVideoRecordRsp);

        void onStart();
    }

    public interface OnScrollListener {
        boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);

        boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2);
    }

    public interface TakePictureListener {
        public static final int ERROR_DECODE_TAKEN_PICTURE = 2;
        public static final int ERROR_RENDER_NOT_EXISTS = 101;
        public static final int ERROR_RENDER_PROCESS = 102;
        public static final int ERROR_SAVE_PROCESS_PICTURE = 103;
        public static final int ERROR_TAKEN_PICTURE = 1;

        void onPictureProcessError(int i, byte[] bArr);

        void onPictureProcessFinish(String str, int i, int i2, int i3);

        void onPictureProcessStart();

        void onPictureTaken(byte[] bArr, Camera camera);

        void onPictureTakenError(int i, Camera camera);
    }

    public interface TakePictureMPListener extends TakePictureListener {
        void onPictureProcessFinish(String str, int i, int i2, int i3, Bundle bundle);
    }

    public Camera getCamera() {
        return null;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void releaseCamera() {
    }

    public void setOnRecordListener(OnRecordListener onRecordListener) {
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
    }

    public Camera switchCamera() {
        return null;
    }

    public void takePicture(TakePictureListener takePictureListener, Looper looper, APTakePictureOption aPTakePictureOption) {
    }

    public SightCameraView(Context context) {
        super(context);
    }
}
