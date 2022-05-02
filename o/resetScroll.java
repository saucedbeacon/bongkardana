package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import o.calculateDtToFit;

@RequiresApi(21)
public final class resetScroll extends findInterceptingOnItemTouchListener {
    /* access modifiers changed from: private */
    public Integer hashCode;
    /* access modifiers changed from: private */
    public Integer invokeSuspend;
    private final setHasFixedSize toDoubleRange;
    private final getFullClassName toString;
    private final boolean values;

    class setMax extends setScrollingTouchSlop {
        private setMax() {
        }

        /* synthetic */ setMax(resetScroll resetscroll, byte b) {
            this();
        }

        public final void length(@NonNull getFullClassName getfullclassname) {
            super.length(getfullclassname);
            cancelScroll.FastBitmap$CoordinateSystem.getMax(1, "FlashAction:", "Parameters locked, opening torch.");
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.FLASH_MODE, 2);
            getfullclassname.Grayscale$Algorithm().set(CaptureRequest.CONTROL_AE_MODE, 1);
            getfullclassname.valueOf();
        }

        public final void getMin(@NonNull getFullClassName getfullclassname, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            super.getMin(getfullclassname, captureRequest, totalCaptureResult);
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
            if (num == null) {
                cancelScroll.FastBitmap$CoordinateSystem.getMax(2, "FlashAction:", "Waiting flash, but flashState is null!", "Taking snapshot.");
                getMax(Integer.MAX_VALUE);
            } else if (num.intValue() == 3) {
                cancelScroll.FastBitmap$CoordinateSystem.getMax(1, "FlashAction:", "Waiting flash and we have FIRED state!", "Taking snapshot.");
                getMax(Integer.MAX_VALUE);
            } else {
                cancelScroll.FastBitmap$CoordinateSystem.getMax(1, "FlashAction:", "Waiting flash but flashState is", num, ". Waiting...");
            }
        }
    }

    class setMin extends setScrollingTouchSlop {
        private setMin() {
        }

        /* synthetic */ setMin(resetScroll resetscroll, byte b) {
            this();
        }

        public final void length(@NonNull getFullClassName getfullclassname) {
            super.length(getfullclassname);
            try {
                cancelScroll.FastBitmap$CoordinateSystem.getMax(1, "ResetFlashAction:", "Reverting the flash changes.");
                CaptureRequest.Builder Grayscale$Algorithm = getfullclassname.Grayscale$Algorithm();
                Grayscale$Algorithm.set(CaptureRequest.CONTROL_AE_MODE, 1);
                Grayscale$Algorithm.set(CaptureRequest.FLASH_MODE, 0);
                getfullclassname.setMax(Grayscale$Algorithm);
                Grayscale$Algorithm.set(CaptureRequest.CONTROL_AE_MODE, resetScroll.this.hashCode);
                Grayscale$Algorithm.set(CaptureRequest.FLASH_MODE, resetScroll.this.invokeSuspend);
                getfullclassname.valueOf();
            } catch (CameraAccessException unused) {
            }
        }
    }

    public resetScroll(@NonNull calculateDtToFit.length length, @NonNull initAutofill initautofill, @NonNull setItemAnimator setitemanimator, @NonNull predictiveItemAnimationsEnabled predictiveitemanimationsenabled) {
        super(length, initautofill, setitemanimator, predictiveitemanimationsenabled);
        Integer num;
        this.toString = initautofill;
        boolean z = false;
        swapAdapter swapadapter = new swapAdapter(Arrays.asList(new setScrollingTouchSlop[]{new getClipToPadding(2500, new removeRecyclerListener()), new setMax(this, (byte) 0)}));
        this.toDoubleRange = swapadapter;
        swapadapter.getMin((hasFixedSize) new setClipToPadding() {
            public final void length() {
                cancelScroll.FastBitmap$CoordinateSystem.getMax(1, "Taking picture with super.take().");
                resetScroll.super.getMax();
            }
        });
        TotalCaptureResult Mean$Arithmetic = this.toString.Mean$Arithmetic();
        if (Mean$Arithmetic == null) {
            FastBitmap$CoordinateSystem.getMax(2, "Picture snapshot requested very early, before the first preview frame.", "Metering might not work as intended.");
        }
        if (Mean$Arithmetic == null) {
            num = null;
        } else {
            num = (Integer) Mean$Arithmetic.get(CaptureResult.CONTROL_AE_STATE);
        }
        if (initautofill.IPostMessageService() && num != null && num.intValue() == 4) {
            z = true;
        }
        this.values = z;
        this.hashCode = (Integer) this.toString.Grayscale$Algorithm().get(CaptureRequest.CONTROL_AE_MODE);
        this.invokeSuspend = (Integer) this.toString.Grayscale$Algorithm().get(CaptureRequest.FLASH_MODE);
    }

    public final void getMax() {
        if (!this.values) {
            FastBitmap$CoordinateSystem.getMax(1, "take:", "Engine does no metering or needs no flash.", "Taking fast snapshot.");
            super.getMax();
            return;
        }
        FastBitmap$CoordinateSystem.getMax(1, "take:", "Engine needs flash. Starting action");
        this.toDoubleRange.getMin(this.toString);
    }

    /* access modifiers changed from: protected */
    public final void getMin() {
        new setMin(this, (byte) 0).getMin(this.toString);
        super.getMin();
    }
}
