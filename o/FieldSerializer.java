package o;

import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import o.GriverManifest;
import o.b;
import o.getSelectedIndex;

public final class FieldSerializer implements getAdapterPosition<getSelectedIndex.length> {
    private final BottomSheetOnBoardingModule getMax;
    private final b.C0007b<setOnOptionPickListener> length;

    private FieldSerializer(BottomSheetOnBoardingModule bottomSheetOnBoardingModule, b.C0007b<setOnOptionPickListener> bVar) {
        this.getMax = bottomSheetOnBoardingModule;
        this.length = bVar;
    }

    public static FieldSerializer getMin(BottomSheetOnBoardingModule bottomSheetOnBoardingModule, b.C0007b<setOnOptionPickListener> bVar) {
        return new FieldSerializer(bottomSheetOnBoardingModule, bVar);
    }

    public final class RuntimeSerializerInfo implements getAdapterPosition<GriverManifest.AnonymousClass16.setMax> {
        private final ChangePhoneNumberH5EventModule getMax;
        private final b.C0007b<GriverManifest.AnonymousClass15> setMax;

        public static GriverManifest.AnonymousClass16.setMax getMax(ChangePhoneNumberH5EventModule changePhoneNumberH5EventModule, GriverManifest.AnonymousClass15 r1) {
            GriverManifest.AnonymousClass16.setMax min = changePhoneNumberH5EventModule.setMin(r1);
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            GriverManifest.AnonymousClass16.setMax min = this.getMax.setMin(this.setMax.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final /* synthetic */ Object get() {
        getSelectedIndex.length max = this.getMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
