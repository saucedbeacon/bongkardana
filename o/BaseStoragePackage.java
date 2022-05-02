package o;

import android.content.Context;
import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.di.modules.MerchantDetailModule;
import id.dana.di.modules.MerchantModule;
import id.dana.di.modules.NearbyMeModule;
import id.dana.di.modules.OpenBankAccountModule;
import id.dana.nearbyme.di.module.PhotoGalleryModule;
import id.dana.nearbyrevamp.NewNearbyMeActivity;
import id.dana.openbankaccount.OpenBankAccountView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.AppInfoUtils;
import o.GetAboutInfoResult;
import o.GriverBaseActivity;
import o.GriverBaseFragment;
import o.GriverDialog;
import o.GriverOpenSettingActivity;
import o.GriverTransActivity;
import o.PrepareException;
import o.R;
import o.UniformLocalAuthDialogExtensionImpl;
import o.b;
import o.d;
import o.f;
import o.negativeListener;
import o.onPageScrolled;
import o.setTextSpacing;

public final class BaseStoragePackage implements createWebSocketClient {
    private b.C0007b<setTextSpacing.getMin> FastBitmap$CoordinateSystem;
    private b.C0007b<AppInfoUtils.AnonymousClass2> Grayscale$Algorithm;
    private b.C0007b<GriverRVKVStorageProxyImpl> ICustomTabsCallback;
    private b.C0007b<isRAndAbove> ICustomTabsCallback$Default;
    private b.C0007b<GriverTransActivity.Lite1.setMax> ICustomTabsCallback$Stub;
    private b.C0007b<s> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getPluginState> IsOverlapping;
    private b.C0007b<setUserId> Mean$Arithmetic;
    private b.C0007b<negativeString> asBinder;
    private b.C0007b<negativeListener.length> asInterface;
    private b.C0007b<updateAdapter> b;
    private b.C0007b<getCommonResources> create;
    private b.C0007b<isRooted> equals;
    private b.C0007b<GriverTransActivity.Main> extraCallback;
    private b.C0007b<GriverTransActivity.Lite1.setMin> extraCallbackWithResult;
    private b.C0007b<AppStatus> getCause;
    private b.C0007b<negativeListener.getMax> getDefaultImpl;
    private b.C0007b<t> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<getScheme> getMin;
    private b.C0007b<isEmbeddedApp> hashCode;
    private b.C0007b<APWebViewPerformance> invoke;
    private b.C0007b<transferApPathToLocalPath> invokeSuspend;
    private b.C0007b<setDefaultFontSize> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<setTextSpacing.setMin> onMessageChannelReady;
    private b.C0007b<getAllInstallFiles> onNavigationEvent;
    private b.C0007b<isValid> onPostMessage;
    private b.C0007b<setStorageProxy> onRelationshipValidationResult;
    private b.C0007b<APExpansion.AnonymousClass1> onTransact;
    private b.C0007b<GriverBaseFragment.Main> setDefaultImpl;
    private final MerchantModule setMax;
    private b.C0007b<Context> setMin;
    private b.C0007b<getInstallThreadName> toDoubleRange;
    private b.C0007b<setGriverAppVirtualHostProxy> toFloatRange;
    private b.C0007b<installPathValid> toIntRange;
    private b.C0007b<fetchAppList> toString;
    private b.C0007b<deletePreDownloadFileByAppId> valueOf;
    private b.C0007b<getLocalPathFromId> values;

    /* renamed from: o.BaseStoragePackage$1  reason: invalid class name */
    public final class AnonymousClass1 implements startSocketConnect {
        private final PrepareException.AnonymousClass1 getMin;
        private final OpenBankAccountModule setMax;

        public /* synthetic */ AnonymousClass1(OpenBankAccountModule openBankAccountModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(openBankAccountModule, r2);
        }

        private AnonymousClass1(OpenBankAccountModule openBankAccountModule, PrepareException.AnonymousClass1 r2) {
            this.setMax = openBankAccountModule;
            this.getMin = r2;
        }

        /* renamed from: o.BaseStoragePackage$1$getMax */
        public static final class getMax {
            public OpenBankAccountModule getMax;
            public PrepareException.AnonymousClass1 length;

            public /* synthetic */ getMax(byte b) {
                this();
            }

            private getMax() {
            }
        }

        public final void length(OpenBankAccountView openBankAccountView) {
            OpenBankAccountModule openBankAccountModule = this.setMax;
            onPageScrolled.setMin min = GriverBridgeCallNotFoundEvent.setMin(this.setMax);
            GriverOpenSettingActivity.AnonymousClass2 r3 = new setSpeed<OuterFileUtils, ChooseFileBridgeExtension>() {
                public final /* synthetic */ Object map(Object obj) {
                    OuterFileUtils outerFileUtils = (OuterFileUtils) obj;
                    ChooseFileBridgeExtension chooseFileBridgeExtension = outerFileUtils != null ? new ChooseFileBridgeExtension(setMax(outerFileUtils.getBankAccountList()), true) : null;
                    if (chooseFileBridgeExtension != null) {
                        return chooseFileBridgeExtension;
                    }
                    List emptyList = Collections.emptyList();
                    Intrinsics.checkNotNullExpressionValue(emptyList, "Collections.emptyList()");
                    return new ChooseFileBridgeExtension(emptyList, false);
                }

                /* renamed from: o.GriverOpenSettingActivity$2$1  reason: invalid class name */
                public final class AnonymousClass1 implements getBindingAdapter<OpenBankAccountView> {
                    @InjectedFieldSignature("id.dana.openbankaccount.OpenBankAccountView.presenter")
                    public static void length(OpenBankAccountView openBankAccountView, onPageScrolled.setMax setmax) {
                        openBankAccountView.presenter = setmax;
                    }
                }

                private static List<ChooseFileActivityResultExtensionImpl> setMax(List<checkType> list) {
                    List<ChooseFileActivityResultExtensionImpl> arrayList = new ArrayList<>();
                    for (checkType checktype : list) {
                        arrayList.add(new ChooseFileActivityResultExtensionImpl(checktype.getInstId(), checktype.getStatus(), checktype.getBankName()));
                    }
                    return arrayList;
                }
            };
            appxLoadFailed length = this.getMin.length();
            if (length != null) {
                appxLoadFailed appxloadfailed = length;
                getScheme min2 = this.getMin.getMin();
                if (min2 != null) {
                    getScheme getscheme = min2;
                    isShown MediaMetadataCompat$BitmapKey = this.getMin.MediaMetadataCompat$BitmapKey();
                    if (MediaMetadataCompat$BitmapKey != null) {
                        OfficeFileType officeFileType = new OfficeFileType(appxloadfailed, getscheme, MediaMetadataCompat$BitmapKey);
                        appxLoadFailed length2 = this.getMin.length();
                        if (length2 != null) {
                            appxLoadFailed appxloadfailed2 = length2;
                            getScheme min3 = this.getMin.getMin();
                            if (min3 != null) {
                                getScheme getscheme2 = min3;
                                NetworkUtils MediaMetadataCompat$RatingKey = this.getMin.MediaMetadataCompat$RatingKey();
                                if (MediaMetadataCompat$RatingKey != null) {
                                    GriverOpenSettingActivity.AnonymousClass2.AnonymousClass1.length(openBankAccountView, handleBridgeCallNotFound.length(openBankAccountModule, new pageScrolled(min, r3, officeFileType, new getNetworkError(appxloadfailed2, getscheme2, MediaMetadataCompat$RatingKey), new FileManifest())));
                                    return;
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public /* synthetic */ BaseStoragePackage(NearbyMeModule nearbyMeModule, MerchantDetailModule merchantDetailModule, MerchantModule merchantModule, PhotoGalleryModule photoGalleryModule, PrepareException.AnonymousClass1 r5, byte b2) {
        this(nearbyMeModule, merchantDetailModule, merchantModule, photoGalleryModule, r5);
    }

    private BaseStoragePackage(NearbyMeModule nearbyMeModule, MerchantDetailModule merchantDetailModule, MerchantModule merchantModule, PhotoGalleryModule photoGalleryModule, PrepareException.AnonymousClass1 r26) {
        NearbyMeModule nearbyMeModule2 = nearbyMeModule;
        PrepareException.AnonymousClass1 r2 = r26;
        this.getMax = r2;
        this.setMax = merchantModule;
        this.setMin = new getMin(r2);
        this.length = new IsOverlapping(r2);
        this.getMin = new toFloatRange(r2);
        length length2 = new length(r2);
        this.isInside = length2;
        this.IsOverlapping = getAllowFileAccessFromFileURLs.create(this.length, this.getMin, length2);
        toIntRange tointrange = new toIntRange(r2);
        this.equals = tointrange;
        this.toIntRange = isCommonRes.create(this.length, this.getMin, tointrange);
        this.toFloatRange = getEmbeddedAppMainUrl.create(this.length, this.getMin, this.equals);
        this.FastBitmap$CoordinateSystem = isScrap.getMin(isJSONTypeIgnore.setMin(nearbyMeModule));
        this.toString = getUrlCodec.setMin(getShareShortUrl.getMax(), GriverBaseActivity.Lite1.setMin());
        this.toDoubleRange = convertToAppInfo.create(this.length, this.getMin, this.equals);
        this.values = APIContextUtils.create(this.length, this.getMin, this.equals);
        this.hashCode = getVhostProxy.create(this.length, this.getMin, this.equals);
        this.Mean$Arithmetic = FetchAppsByIdsRequest.length(setAllBucketName.setMax());
        this.valueOf = getPreDownloadFile.create(this.length, this.getMin, this.equals);
        isInside isinside = new isInside(r2);
        this.invoke = isinside;
        this.invokeSuspend = getTypeFromMimeType.create(this.length, this.getMin, isinside);
        this.Grayscale$Algorithm = contextIsValid.create(this.length, this.getMin, this.equals);
        this.ICustomTabsCallback = matchLocalId.create(this.length, this.getMin, this.equals);
        setMin setmin = new setMin(r2);
        this.create = setmin;
        this.getCause = getPresetResourcePath.create(this.length, this.getMin, setmin);
        installPathExist create2 = installPathExist.create(this.isInside);
        this.onNavigationEvent = create2;
        setInternalPageChangeListener max = setInternalPageChangeListener.getMax(this.setMin, this.IsOverlapping, this.toIntRange, this.toFloatRange, this.FastBitmap$CoordinateSystem, this.toString, this.toDoubleRange, this.values, this.hashCode, this.Mean$Arithmetic, this.valueOf, this.invokeSuspend, this.Grayscale$Algorithm, this.ICustomTabsCallback, this.getCause, create2, getAppAlias.setMin());
        this.b = max;
        this.onMessageChannelReady = isScrap.getMin(getSupperMethodAnnotation.getMax(nearbyMeModule2, max));
        this.extraCallbackWithResult = isScrap.getMin(findClass.length(merchantDetailModule));
        equals equals2 = new equals(r2);
        this.onRelationshipValidationResult = equals2;
        getAppInfoDaoDescComparator create3 = getAppInfoDaoDescComparator.create(equals2);
        this.onPostMessage = create3;
        GriverTransActivity.LiteBase max2 = GriverTransActivity.LiteBase.setMax(this.extraCallbackWithResult, create3, UniformLocalAuthDialogExtensionImpl.UniformLocalAuthDialog.ClickNameListener.length());
        this.extraCallback = max2;
        this.ICustomTabsCallback$Stub = isScrap.getMin(getActualTypeArguments.getMin(merchantDetailModule, max2));
        this.asBinder = isScrap.getMin(onPrepared.length(photoGalleryModule));
        this.asInterface = isScrap.getMin(f.AnonymousClass6.getMax(photoGalleryModule));
        getMax getmax = new getMax(r2);
        this.onTransact = getmax;
        AppInfoUtils create4 = AppInfoUtils.create(this.onRelationshipValidationResult, getmax);
        this.ICustomTabsCallback$Default = create4;
        GriverDialog.DialogParam max3 = GriverDialog.DialogParam.setMax(this.asBinder, this.asInterface, create4);
        this.setDefaultImpl = max3;
        this.getDefaultImpl = isScrap.getMin(f.AnonymousClass7.setMin(photoGalleryModule, max3));
        d.AnonymousClass3.AnonymousClass1 length3 = d.AnonymousClass3.AnonymousClass1.length(this.setMin);
        this.ICustomTabsCallback$Stub$Proxy = length3;
        this.getInterfaceDescriptor = isScrap.getMin(getGenericParamType.length(nearbyMeModule2, length3));
    }

    public static final class setMax {
        public MerchantDetailModule getMax;
        public PrepareException.AnonymousClass1 getMin;
        public MerchantModule length;
        public PhotoGalleryModule setMax;
        public NearbyMeModule setMin;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class getMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMax;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 length;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length2 = this.length.length();
            if (length2 != null) {
                return length2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 setMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<isRooted> {
        private final PrepareException.AnonymousClass1 getMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            isRooted ITrustedWebActivityService = this.getMax.ITrustedWebActivityService();
            if (ITrustedWebActivityService != null) {
                return ITrustedWebActivityService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<APWebViewPerformance> {
        private final PrepareException.AnonymousClass1 getMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            APWebViewPerformance RatingCompat$StarStyle = this.getMax.RatingCompat$StarStyle();
            if (RatingCompat$StarStyle != null) {
                return RatingCompat$StarStyle;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.getMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 length;

        equals(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.length.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<APExpansion.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            APExpansion.AnonymousClass1 intRange = this.getMax.toIntRange();
            if (intRange != null) {
                return intRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(NewNearbyMeActivity newNearbyMeActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(newNearbyMeActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub2 = this.getMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub2 != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub2;
                appxLoadFailed length2 = this.getMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(newNearbyMeActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            Context max = this.getMax.getMax();
                            if (max != null) {
                                R.xml.getMax(newNearbyMeActivity, new GriverDefaultLoadingView(max));
                                R.xml.getMax(newNearbyMeActivity, this.onMessageChannelReady.get());
                                R.xml.setMin(newNearbyMeActivity, this.ICustomTabsCallback$Stub.get());
                                MerchantModule merchantModule = this.setMax;
                                GetAboutInfoResult.getMin min2 = castToShort.getMin(this.setMax);
                                appxLoadFailed length3 = this.getMax.length();
                                if (length3 != null) {
                                    appxLoadFailed appxloadfailed2 = length3;
                                    getScheme min3 = this.getMax.getMin();
                                    if (min3 != null) {
                                        getScheme getscheme2 = min3;
                                        workerType smallIconBitmap = this.getMax.getSmallIconBitmap();
                                        if (smallIconBitmap != null) {
                                            deployVersion deployversion = new deployVersion(appxloadfailed2, getscheme2, smallIconBitmap);
                                            appxLoadFailed length4 = this.getMax.length();
                                            if (length4 != null) {
                                                appxLoadFailed appxloadfailed3 = length4;
                                                getScheme min4 = this.getMax.getMin();
                                                if (min4 != null) {
                                                    getScheme getscheme3 = min4;
                                                    setDefaultFontSize updateVisuals2 = this.getMax.updateVisuals();
                                                    if (updateVisuals2 != null) {
                                                        env env = new env(appxloadfailed3, getscheme3, updateVisuals2);
                                                        workerType smallIconBitmap2 = this.getMax.getSmallIconBitmap();
                                                        if (smallIconBitmap2 != null) {
                                                            requestUrl requesturl = new requestUrl(smallIconBitmap2);
                                                            l lVar = new l();
                                                            workerType smallIconBitmap3 = this.getMax.getSmallIconBitmap();
                                                            if (smallIconBitmap3 != null) {
                                                                R.xml.setMax(newNearbyMeActivity, castToBigInteger.getMin(merchantModule, new getLastModifiedDate(min2, deployversion, env, requesturl, lVar, new GriverTransport(smallIconBitmap3))));
                                                                R.xml.setMin(newNearbyMeActivity, this.getDefaultImpl.get());
                                                                R.xml.setMin(newNearbyMeActivity, this.getInterfaceDescriptor.get());
                                                                return;
                                                            }
                                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                        }
                                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                    }
                                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                                }
                                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                            }
                                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                        }
                                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                    }
                                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                                }
                                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
