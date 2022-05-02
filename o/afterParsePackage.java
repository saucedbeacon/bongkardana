package o;

import id.dana.di.modules.NoteModule;
import id.dana.sendmoney.remarks.NoteBottomSheetDialogFragment;
import o.PrepareException;
import o.RVWebSocketManager;
import o.b;
import o.setPhotoSize;

public final class afterParsePackage implements RVWebSocketManager.AnonymousClass1 {
    private b.C0007b<setThumb> getMax;
    private b.C0007b<setPhotoSize.getMin> getMin;
    private b.C0007b<setPhotoSize.setMin> length;
    private b.C0007b<isBackgroundModeUninitialized> setMax;
    private b.C0007b<setDefaultFontSize> setMin;

    public /* synthetic */ afterParsePackage(NoteModule noteModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(noteModule, r2);
    }

    private afterParsePackage(NoteModule noteModule, PrepareException.AnonymousClass1 r3) {
        getMax getmax = new getMax(r3);
        this.setMin = getmax;
        this.setMax = removeRangeNotifier.create(getmax);
        b.C0007b<setPhotoSize.getMin> min = isScrap.getMin(isWeb.length(noteModule));
        this.getMin = min;
        getFail max = getFail.getMax(this.setMax, min);
        this.getMax = max;
        this.length = isScrap.getMin(checkPrimitiveArray.getMax(noteModule, max));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 length;
        public NoteModule setMin;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class getMax implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.length.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(NoteBottomSheetDialogFragment noteBottomSheetDialogFragment) {
        setModifiedTime.length(noteBottomSheetDialogFragment, this.length.get());
    }
}
