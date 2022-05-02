package o;

import android.content.Context;
import id.dana.challenge.otp.OtpChallengeFragment;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import id.dana.di.modules.OtpChallengeModule;
import o.BluetoothCrashResolver;
import o.FieldSerializer;
import o.GriverManifest;
import o.GriverMonitor;
import o.OuterFileUtils;
import o.PrepareException;
import o.ShareRecyclerAdapter;
import o.WebSocketSession;
import o.b;
import o.endTransaction;

public final class GlobalPackagePool implements WebSocketSession.RVWebSocketCallbackProxy {
    private b.C0007b<setCacheMode> FastBitmap$CoordinateSystem;
    private b.C0007b<setOutFilePathProxy> Grayscale$Algorithm;
    private b.C0007b<sendData> ICustomTabsCallback;
    private b.C0007b<GriverBaseManifest> IsOverlapping;
    private b.C0007b<GriverMonitor.AnonymousClass3> Mean$Arithmetic;
    private b.C0007b<internalBeginTransaction> b;
    private b.C0007b<UpdateAppCallback> create;
    private b.C0007b<requestPermission> equals;
    private b.C0007b<endTransaction.setMax> extraCallback;
    private b.C0007b<ShareRecyclerAdapter.ShareViewHolder> getCause;
    private final ChangePhoneNumberH5EventModule getMax;
    private b.C0007b<Context> getMin;
    private b.C0007b<calculateDistance> hashCode;
    private b.C0007b<GriverLogger> invoke;
    private b.C0007b<internalInitInvalidationTracker> invokeSuspend;
    private b.C0007b<classExist> isInside;
    private final PrepareException.AnonymousClass1 length;
    private b.C0007b<forceFlush> onMessageChannelReady;
    private b.C0007b<getPerformanceTracker> onNavigationEvent;
    private b.C0007b<lambda$beginTransaction$0> onPostMessage;
    private b.C0007b<onBatchScanResults> onRelationshipValidationResult;
    private b.C0007b<endTransaction.length> setMax;
    private b.C0007b<appxLoadFailed> setMin;
    private b.C0007b<setDefaultFontSize> toDoubleRange;
    private b.C0007b<getScheme> toFloatRange;
    private b.C0007b<getFieldValue> toIntRange;
    private b.C0007b<setDistanceCalculator> toString;
    private b.C0007b<onDescriptorWrite> valueOf;
    private b.C0007b<PermissionUtils> values;

    public /* synthetic */ GlobalPackagePool(OtpChallengeModule otpChallengeModule, ChangePhoneNumberH5EventModule changePhoneNumberH5EventModule, PrepareException.AnonymousClass1 r3, byte b2) {
        this(otpChallengeModule, changePhoneNumberH5EventModule, r3);
    }

    private GlobalPackagePool(OtpChallengeModule otpChallengeModule, ChangePhoneNumberH5EventModule changePhoneNumberH5EventModule, PrepareException.AnonymousClass1 r12) {
        this.length = r12;
        this.getMax = changePhoneNumberH5EventModule;
        this.getMin = new setMax(r12);
        this.setMax = isScrap.getMin(GriverExtensionManifest.length(otpChallengeModule));
        this.setMin = new values(r12);
        this.toFloatRange = new toIntRange(r12);
        equals equals2 = new equals(r12);
        this.equals = equals2;
        this.isInside = positivePermissionResult.create(this.setMin, this.toFloatRange, equals2);
        length length2 = new length(r12);
        this.IsOverlapping = length2;
        this.toIntRange = RequestAPIConfigUtils.create(this.setMin, this.toFloatRange, length2);
        IsOverlapping isOverlapping = new IsOverlapping(r12);
        this.toString = isOverlapping;
        this.hashCode = getHardwareEqualityEnforced.create(this.setMin, this.toFloatRange, isOverlapping);
        this.values = OuterFileUtils.AnonymousClass1.create(this.setMin, this.toFloatRange, this.equals);
        getMin getmin = new getMin(r12);
        this.toDoubleRange = getmin;
        getCacheMode create2 = getCacheMode.create(getmin);
        this.FastBitmap$CoordinateSystem = create2;
        this.invokeSuspend = isScrap.getMin(lambda$endTransaction$1.getMax(this.getMin, this.setMax, this.isInside, this.toIntRange, this.hashCode, this.values, create2));
        isInside isinside = new isInside(r12);
        this.invoke = isinside;
        this.Mean$Arithmetic = GriverMonitor.AnonymousClass1.create(this.setMin, this.toFloatRange, isinside);
        this.Grayscale$Algorithm = getOuterRootFileDir.create(this.setMin, this.toFloatRange, this.equals);
        toString tostring = new toString(r12);
        this.valueOf = tostring;
        this.ICustomTabsCallback = onConnectionStateChange.create(this.setMin, this.toFloatRange, tostring);
        this.onNavigationEvent = new getMax(r12);
        this.create = new toFloatRange(r12);
        ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1 min = ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1.setMin(setAllBucketName.setMax());
        this.getCause = min;
        this.b = getTransactionExecutor.setMin(this.setMax, this.Mean$Arithmetic, this.Grayscale$Algorithm, this.values, this.ICustomTabsCallback, this.getMin, this.onNavigationEvent, this.create, min);
        hashCode hashcode = new hashCode(r12);
        this.onRelationshipValidationResult = hashcode;
        BluetoothCrashResolver.AnonymousClass1 create3 = BluetoothCrashResolver.AnonymousClass1.create(this.setMin, this.toFloatRange, hashcode);
        this.onMessageChannelReady = create3;
        RoomDatabase$JournalMode max = RoomDatabase$JournalMode.setMax(this.getMin, this.setMax, this.Grayscale$Algorithm, create3, this.values);
        this.onPostMessage = max;
        this.extraCallback = isScrap.getMin(GriverExtension.setMin(otpChallengeModule, this.invokeSuspend, this.b, max));
    }

    public static final class setMin {
        public OtpChallengeModule getMax;
        public PrepareException.AnonymousClass1 getMin;
        public ChangePhoneNumberH5EventModule setMax;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class setMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMin;

        values(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.setMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.length.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<requestPermission> {
        private final PrepareException.AnonymousClass1 getMin;

        equals(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            requestPermission values = this.getMin.values();
            if (values != null) {
                return values;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<GriverBaseManifest> {
        private final PrepareException.AnonymousClass1 getMax;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBaseManifest invokeSuspend = this.getMax.invokeSuspend();
            if (invokeSuspend != null) {
                return invokeSuspend;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<setDistanceCalculator> {
        private final PrepareException.AnonymousClass1 getMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDistanceCalculator valueOf = this.getMax.valueOf();
            if (valueOf != null) {
                return valueOf;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<GriverLogger> {
        private final PrepareException.AnonymousClass1 length;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverLogger Mean$Arithmetic = this.length.Mean$Arithmetic();
            if (Mean$Arithmetic != null) {
                return Mean$Arithmetic;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.setMax.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.getMax.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<UpdateAppCallback> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            UpdateAppCallback onRepeatModeChanged = this.length.onRepeatModeChanged();
            if (onRepeatModeChanged != null) {
                return onRepeatModeChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<onBatchScanResults> {
        private final PrepareException.AnonymousClass1 setMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onBatchScanResults validateRelationship = this.setMax.validateRelationship();
            if (validateRelationship != null) {
                return validateRelationship;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(OtpChallengeFragment otpChallengeFragment) {
        ChangePhoneNumberH5EventModule changePhoneNumberH5EventModule = this.getMax;
        appxLoadFailed length2 = this.length.length();
        if (length2 != null) {
            appxLoadFailed appxloadfailed = length2;
            getScheme min = this.length.getMin();
            if (min != null) {
                getQueryExecutor.getMax(otpChallengeFragment, FieldSerializer.RuntimeSerializerInfo.getMax(changePhoneNumberH5EventModule, new GriverManifest.AnonymousClass16.setMax(new GriverAmcsConfig(appxloadfailed, min, JSONSerializable.getMin(this.getMax, TabBar.newInstance())), JSONSerializer.length(this.getMax)) {
                    private GriverAppVirtualHostProxy<Boolean> getMax;
                    /* access modifiers changed from: private */
                    public final AnonymousClass16.getMin getMin;
                    private final GriverAmcsConfig length;

                    {
                        this.length = r1;
                        this.getMin = r2;
                    }

                    public final void length() {
                        GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.getMax;
                        if (griverAppVirtualHostProxy != null) {
                            griverAppVirtualHostProxy.dispose();
                            this.getMax = null;
                        }
                    }

                    public final void setMin() {
                        GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.getMax;
                        if (griverAppVirtualHostProxy != null) {
                            griverAppVirtualHostProxy.dispose();
                            this.getMax = null;
                        }
                        GriverAmcsConfig griverAmcsConfig = this.length;
                        if (this.getMax == null) {
                            this.getMax = new GriverAppVirtualHostProxy<Boolean>() {
                                public final /* synthetic */ void onNext(Object obj) {
                                    AnonymousClass15.this.getMin.setMax(((Boolean) obj).booleanValue());
                                }
                            };
                        }
                        griverAmcsConfig.execute(this.getMax);
                    }

                    public final void setMax() {
                        GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.getMax;
                        if (griverAppVirtualHostProxy != null) {
                            griverAppVirtualHostProxy.dispose();
                            this.getMax = null;
                        }
                        this.length.dispose();
                    }
                }));
                getQueryExecutor.getMax(otpChallengeFragment, this.extraCallback.get());
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
