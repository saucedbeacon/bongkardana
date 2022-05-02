package com.alibaba.griver.image.capture.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.griver.image.R;

public class CaptureBtn extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Type f10466a;
    public ImageView takePictureBtn;

    public enum Type {
        NONE,
        VIDEO,
        PICTURE
    }

    public CaptureBtn(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public CaptureBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CaptureBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10466a = Type.NONE;
        LayoutInflater.from(context).inflate(R.layout.griver_image_view_capture_btn, this, true);
        this.takePictureBtn = (ImageView) findViewById(R.id.takePicture);
        a();
    }

    /* renamed from: com.alibaba.griver.image.capture.widget.CaptureBtn$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$griver$image$capture$widget$CaptureBtn$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.alibaba.griver.image.capture.widget.CaptureBtn$Type[] r0 = com.alibaba.griver.image.capture.widget.CaptureBtn.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$alibaba$griver$image$capture$widget$CaptureBtn$Type = r0
                com.alibaba.griver.image.capture.widget.CaptureBtn$Type r1 = com.alibaba.griver.image.capture.widget.CaptureBtn.Type.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$alibaba$griver$image$capture$widget$CaptureBtn$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.griver.image.capture.widget.CaptureBtn$Type r1 = com.alibaba.griver.image.capture.widget.CaptureBtn.Type.VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$alibaba$griver$image$capture$widget$CaptureBtn$Type     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.alibaba.griver.image.capture.widget.CaptureBtn$Type r1 = com.alibaba.griver.image.capture.widget.CaptureBtn.Type.PICTURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.capture.widget.CaptureBtn.AnonymousClass1.<clinit>():void");
        }
    }

    private void a() {
        int i = AnonymousClass1.$SwitchMap$com$alibaba$griver$image$capture$widget$CaptureBtn$Type[this.f10466a.ordinal()];
        if (i == 1) {
            this.takePictureBtn.setVisibility(8);
        } else if (i == 2) {
            this.takePictureBtn.setVisibility(8);
        } else if (i == 3) {
            this.takePictureBtn.setVisibility(0);
        }
    }

    public void setViewType(Type type) {
        this.f10466a = type;
        a();
    }
}
