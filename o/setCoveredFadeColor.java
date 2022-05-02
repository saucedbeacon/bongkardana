package o;

import id.dana.danah5.bioutility.BioUtilityBridge;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import o.Embedded;
import o.setParallaxDistance;

public final class setCoveredFadeColor implements setParallaxDistance.length {
    /* access modifiers changed from: private */
    public final setParallaxDistance.setMin getMax;
    private final GriverCreateDialogParam getMin;
    private final AccelerometerForH5SensorService setMax;

    @Inject
    public setCoveredFadeColor(AccelerometerForH5SensorService accelerometerForH5SensorService, setParallaxDistance.setMin setmin, GriverCreateDialogParam griverCreateDialogParam) {
        this.setMax = accelerometerForH5SensorService;
        this.getMax = setmin;
        this.getMin = griverCreateDialogParam;
        AnonymousClass5 r4 = new entity() {
            public final void onSuccessVerifyAuth(String str) {
                setCoveredFadeColor.this.getMax.getMax(str);
            }

            public final void onFailVerifyAuth(int i) {
                setCoveredFadeColor.this.getMax.setMax(i);
            }
        };
        AnonymousClass4 r5 = new inheritSuperIndices() {
            public final void onSuccessFaceQuery(String str) {
                setCoveredFadeColor.this.getMax.length(str);
            }

            public final void onFailFaceQuery(int i) {
                setParallaxDistance.setMin unused = setCoveredFadeColor.this.getMax;
            }
        };
        AnonymousClass1 r0 = new viewName() {
            public final void onSuccessVerifyEnrolment() {
                setParallaxDistance.setMin unused = setCoveredFadeColor.this.getMax;
            }

            public final void onFailVerifyEnrolment(int i) {
                setParallaxDistance.setMin unused = setCoveredFadeColor.this.getMax;
            }
        };
        Intrinsics.checkNotNullParameter(r4, "startFaceAuthCallback");
        Intrinsics.checkNotNullParameter(r5, "startFaceQueryCallback");
        Intrinsics.checkNotNullParameter(r0, "startFaceEnrolmentCallback");
        accelerometerForH5SensorService.getMin = r4;
        accelerometerForH5SensorService.length = r5;
        accelerometerForH5SensorService.getMax = r0;
    }

    public final void setMin(String str) {
        AccelerometerForH5SensorService accelerometerForH5SensorService = this.setMax;
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Embedded embedded = accelerometerForH5SensorService.equals;
        entity entity = accelerometerForH5SensorService.getMin;
        if (entity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startFaceAuthCallback");
        }
        Intrinsics.checkNotNullParameter(str, "verifyId");
        Intrinsics.checkNotNullParameter(entity, "callback");
        embedded.length(str, new Embedded.getMax(embedded, entity));
    }

    public final void getMin(String str) {
        AccelerometerForH5SensorService accelerometerForH5SensorService = this.setMax;
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Embedded embedded = accelerometerForH5SensorService.equals;
        viewName viewname = accelerometerForH5SensorService.getMax;
        if (viewname == null) {
            Intrinsics.throwUninitializedPropertyAccessException("startFaceEnrolmentCallback");
        }
        Intrinsics.checkNotNullParameter(str, "verifyId");
        Intrinsics.checkNotNullParameter(viewname, "callback");
        embedded.length(str, new Embedded.setMax(embedded, viewname));
    }

    public final void setMax() {
        this.setMax.IsOverlapping.dispose();
        this.getMin.dispose();
    }
}
