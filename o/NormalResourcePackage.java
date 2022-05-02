package o;

import android.app.Activity;
import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PromoCenterModule;
import id.dana.di.modules.PushNotificationModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.notification.DanaFirebaseMessagingService;
import id.dana.promocenter.views.PromoCenterActivity;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverPrepareInterceptor;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.Transition;
import o.ZoomRecyclerView;
import o.b;
import o.getDuration;
import o.getRunningAnimators;
import o.onAnimationEnd;
import o.sortChildDrawingOrder;
import o.style;

public final class NormalResourcePackage implements toJSONBytes {
    private b.C0007b<setDefaultFontSize> FastBitmap$CoordinateSystem;
    private b.C0007b<R.styleable> Grayscale$Algorithm;
    private b.C0007b<OnFocusChange> ICustomTabsCallback;
    private b.C0007b<onJsBeforeUnload> ICustomTabsCallback$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Stub;
    private b.C0007b<getScanJobRuntimeMillis> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<setInitTextColor> ICustomTabsService;
    private b.C0007b<getUniqueId> ICustomTabsService$Default;
    private b.C0007b<getRunningAnimators.getMin> ICustomTabsService$Stub;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsService$Stub$Proxy;
    private b.C0007b<onAnimationEnd.length> INotificationSideChannel;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Default;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Stub;
    private b.C0007b<onConnect> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<toUuidString> IPostMessageService;
    private b.C0007b<setEpicenterCallback> IPostMessageService$Default;
    private b.C0007b<getBlockNetworkImage> IPostMessageService$Stub;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IPostMessageService$Stub$Proxy;
    private b.C0007b<GetAuthCode> ITrustedWebActivityCallback;
    private b.C0007b<getAllInstallFiles> ITrustedWebActivityCallback$Default;
    private b.C0007b<getCommonResources> ITrustedWebActivityCallback$Stub;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityService;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Default;
    private b.C0007b<getPlatformCallback> ITrustedWebActivityService$Stub;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<toByteArray> IconCompatParcelizer;
    private b.C0007b<ResourceProviderExtension> IsOverlapping;
    private b.C0007b<requestAppWithAppId> Mean$Arithmetic;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$MediaItem;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<BindInt> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<getPath> MediaDescriptionCompat;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$BitmapKey;
    private b.C0007b<setStartDelay> MediaMetadataCompat$LongKey;
    private b.C0007b<getDuration.length> MediaMetadataCompat$RatingKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$TextKey;
    private b.C0007b<onCharacteristicChanged> RemoteActionCompatParcelizer;
    private b.C0007b<getTargets> areNotificationsEnabled;
    private b.C0007b<addChooseImageCrossOrigin> asBinder;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> asInterface;
    private b.C0007b<AndroidModel> b;
    private b.C0007b<onWebViewDestory> cancel;
    private b.C0007b<Region$1> cancelAll;
    private b.C0007b<notifyCharacteristicValue> cancelNotification;
    private b.C0007b<DataProviderException> create;
    private b.C0007b<GriverPrepareInterceptor> equals;
    private b.C0007b<setBackButton> extraCallback;
    private b.C0007b<MovableFrameLayout> extraCallbackWithResult;
    private b.C0007b<getPropagation> extraCommand;
    private b.C0007b<KitUtils> getActiveNotifications;
    private b.C0007b<BindView.setMax> getCause;
    private b.C0007b<getEpicenter> getDefaultImpl;
    private b.C0007b<updateFootState> getInterfaceDescriptor;
    private b.C0007b<Context> getMax;
    private final PromoCenterModule getMin;
    private b.C0007b<checkBitmap> getSmallIconBitmap;
    private b.C0007b<shouldShowRevokeOpenAuthItem> getSmallIconId;
    private b.C0007b<getPerformanceTracker> hashCode;
    private b.C0007b<onDescriptorWrite> invoke;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> invokeSuspend;
    private b.C0007b<R.id.length> isInside;
    private b.C0007b<method> length;
    private b.C0007b<canGoBackOrForward> mayLaunchUrl;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> newSession;
    private b.C0007b<setSceneRoot> newSessionWithExtras;
    private b.C0007b<style.getMin> notify;
    private b.C0007b<GriverCreatePromptParam> notifyNotificationWithChannel;
    private b.C0007b<enableBackButton> onExtraCallback;
    private b.C0007b<BindView.setMin> onMessageChannelReady;
    private b.C0007b<OnItemLongClick> onNavigationEvent;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onPostMessage;
    private b.C0007b<setPageCacheCapacity> onRelationshipValidationResult;
    private b.C0007b<H5Utils> onTransact;
    private b.C0007b<getMode> postMessage;
    private b.C0007b<didExitRegion> read;
    private b.C0007b<parseBatteryPercentage> receiveFile;
    private b.C0007b<isTransitionRequired> requestPostMessageChannel;
    private b.C0007b<queryAppInfo> requestPostMessageChannelWithExtras;
    private b.C0007b<applySettingsToScheduledJob> setDefaultImpl;
    private b.C0007b<Activity> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<getTinyLocalStorageInfo> toDoubleRange;
    private b.C0007b<appxLoadFailed> toFloatRange;
    private b.C0007b<getScheme> toIntRange;
    private b.C0007b<setDataRequestNotifier> toString;
    private b.C0007b<getTransitionValues> updateVisuals;
    private b.C0007b<getCancelable> validateRelationship;
    private b.C0007b<R.id.getMax> valueOf;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> values;
    private b.C0007b<setNetworkAvailable> warmup;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> write;

    /* renamed from: o.NormalResourcePackage$1  reason: invalid class name */
    public final class AnonymousClass1 implements toJSONStringZ {
        private b.C0007b<dataUpdated> FastBitmap$CoordinateSystem;
        private b.C0007b<getCharsetName> IsOverlapping;
        private b.C0007b<isPacketDistinct> equals;
        private final PrepareException.AnonymousClass1 getMax;
        private b.C0007b<appxLoadFailed> getMin;
        private b.C0007b<getDefaultTextEncodingName> isInside;
        private b.C0007b<setDefaultFontSize> length;
        private b.C0007b<sortChildDrawingOrder.length> setMax;
        private b.C0007b<getScheme> setMin;
        private b.C0007b<getSHA1> toFloatRange;
        private b.C0007b<copyToFile> toIntRange;
        private b.C0007b<isDecorView> values;

        public /* synthetic */ AnonymousClass1(PushNotificationModule pushNotificationModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(pushNotificationModule, r2);
        }

        private AnonymousClass1(PushNotificationModule pushNotificationModule, PrepareException.AnonymousClass1 r5) {
            this.getMax = r5;
            this.setMax = isScrap.getMin(isEnable.getMax(pushNotificationModule));
            this.getMin = new getMax(r5);
            this.setMin = new setMin(r5);
            getMin getmin = new getMin(r5);
            this.length = getmin;
            this.isInside = setDefaultTextEncodingName.create(this.getMin, this.setMin, getmin);
            setMax setmax = new setMax(r5);
            this.IsOverlapping = setmax;
            this.toFloatRange = doInstall.create(this.getMin, this.setMin, setmax);
            this.toIntRange = apUrlToFilePath.create(this.getMin, this.setMin, this.IsOverlapping);
            IsOverlapping isOverlapping = new IsOverlapping(r5);
            this.equals = isOverlapping;
            Pdu create = Pdu.create(this.getMin, this.setMin, isOverlapping);
            this.FastBitmap$CoordinateSystem = create;
            this.values = isScrap.getMin(calculatePageOffsets.length(this.setMax, this.isInside, this.toFloatRange, this.toIntRange, create));
        }

        /* renamed from: o.NormalResourcePackage$1$length */
        public static final class length {
            public PushNotificationModule getMax;
            public PrepareException.AnonymousClass1 setMin;

            public /* synthetic */ length(byte b) {
                this();
            }

            private length() {
            }
        }

        /* renamed from: o.NormalResourcePackage$1$getMax */
        static class getMax implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 setMin;

            getMax(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.NormalResourcePackage$1$setMin */
        static class setMin implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 getMax;

            setMin(PrepareException.AnonymousClass1 r1) {
                this.getMax = r1;
            }

            public final /* synthetic */ Object get() {
                getScheme min = this.getMax.getMin();
                if (min != null) {
                    return min;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.NormalResourcePackage$1$getMin */
        static class getMin implements b.C0007b<setDefaultFontSize> {
            private final PrepareException.AnonymousClass1 getMin;

            getMin(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                setDefaultFontSize updateVisuals = this.getMin.updateVisuals();
                if (updateVisuals != null) {
                    return updateVisuals;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.NormalResourcePackage$1$setMax */
        static class setMax implements b.C0007b<getCharsetName> {
            private final PrepareException.AnonymousClass1 length;

            setMax(PrepareException.AnonymousClass1 r1) {
                this.length = r1;
            }

            public final /* synthetic */ Object get() {
                getCharsetName ICustomTabsCallback$Stub$Proxy = this.length.ICustomTabsCallback$Stub$Proxy();
                if (ICustomTabsCallback$Stub$Proxy != null) {
                    return ICustomTabsCallback$Stub$Proxy;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.NormalResourcePackage$1$IsOverlapping */
        static class IsOverlapping implements b.C0007b<isPacketDistinct> {
            private final PrepareException.AnonymousClass1 getMin;

            IsOverlapping(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                isPacketDistinct mayLaunchUrl = this.getMin.mayLaunchUrl();
                if (mayLaunchUrl != null) {
                    return mayLaunchUrl;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void getMax(DanaFirebaseMessagingService danaFirebaseMessagingService) {
            hasFeatureHCE.setMax(danaFirebaseMessagingService, this.values.get());
            getShortName ITrustedWebActivityCallback$Default = this.getMax.ITrustedWebActivityCallback$Default();
            if (ITrustedWebActivityCallback$Default != null) {
                hasFeatureHCE.setMax(danaFirebaseMessagingService, new Object(ITrustedWebActivityCallback$Default) {
                    private final getShortName setMax;

                    {
                        this.setMax = r1;
                    }

                    public final o.isNfcEnable setMax(android.content.Context r4, id.dana.notification.NotificationData r5) {
                        /*
                            r3 = this;
                            java.lang.String r0 = r5.getMax
                            if (r0 == 0) goto L_0x00a3
                            r1 = -1
                            int r2 = r0.hashCode()
                            switch(r2) {
                                case -2035039290: goto L_0x0053;
                                case -1983828400: goto L_0x0049;
                                case -805752590: goto L_0x003f;
                                case 66575: goto L_0x0035;
                                case 191796002: goto L_0x002b;
                                case 1469380567: goto L_0x0021;
                                case 1544398073: goto L_0x0017;
                                case 2107599432: goto L_0x000d;
                                default: goto L_0x000c;
                            }
                        L_0x000c:
                            goto L_0x005c
                        L_0x000d:
                            java.lang.String r2 = "GN_AML"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 4
                            goto L_0x005c
                        L_0x0017:
                            java.lang.String r2 = "ipgRegistration"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 5
                            goto L_0x005c
                        L_0x0021:
                            java.lang.String r2 = "OCR_RECEIPT"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 6
                            goto L_0x005c
                        L_0x002b:
                            java.lang.String r2 = "VOUCHER_DETAIL"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 1
                            goto L_0x005c
                        L_0x0035:
                            java.lang.String r2 = "CDP"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 2
                            goto L_0x005c
                        L_0x003f:
                            java.lang.String r2 = "TRANSACTION_DETAIL"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 0
                            goto L_0x005c
                        L_0x0049:
                            java.lang.String r2 = "TWILIO_CHALLENGE"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 7
                            goto L_0x005c
                        L_0x0053:
                            java.lang.String r2 = "INNER_URL"
                            boolean r0 = r0.equals(r2)
                            if (r0 == 0) goto L_0x005c
                            r1 = 3
                        L_0x005c:
                            switch(r1) {
                                case 0: goto L_0x009d;
                                case 1: goto L_0x0095;
                                case 2: goto L_0x008f;
                                case 3: goto L_0x0089;
                                case 4: goto L_0x0083;
                                case 5: goto L_0x0071;
                                case 6: goto L_0x006b;
                                case 7: goto L_0x0065;
                                default: goto L_0x005f;
                            }
                        L_0x005f:
                            o.HCEBridgeExtension$1 r0 = new o.HCEBridgeExtension$1
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0065:
                            o.makePhoneCall r0 = new o.makePhoneCall
                            r0.<init>(r4, r5)
                            return r0
                        L_0x006b:
                            o.processCommandApdu r0 = new o.processCommandApdu
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0071:
                            boolean r0 = r5.getMax()
                            if (r0 == 0) goto L_0x007d
                            o.TinyAppConstants r0 = new o.TinyAppConstants
                            r0.<init>(r4, r5)
                            return r0
                        L_0x007d:
                            o.HCEBridgeExtension$1 r0 = new o.HCEBridgeExtension$1
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0083:
                            o.hasFeatureNfc r0 = new o.hasFeatureNfc
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0089:
                            o.MakePhoneCallBridgeExtension r0 = new o.MakePhoneCallBridgeExtension
                            r0.<init>(r4, r5)
                            return r0
                        L_0x008f:
                            o.byteArrayToHexString r0 = new o.byteArrayToHexString
                            r0.<init>(r4, r5)
                            return r0
                        L_0x0095:
                            o.ChoosePhoneContactBridgeExtension$1 r0 = new o.ChoosePhoneContactBridgeExtension$1
                            o.getShortName r1 = r3.setMax
                            r0.<init>(r4, r5, r1)
                            return r0
                        L_0x009d:
                            o.contact r0 = new o.contact
                            r0.<init>(r4, r5)
                            return r0
                        L_0x00a3:
                            r4 = 0
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: o.TinyAppHostApduService.AnonymousClass1.setMax(android.content.Context, id.dana.notification.NotificationData):o.isNfcEnable");
                    }
                });
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public /* synthetic */ NormalResourcePackage(PromoCenterModule promoCenterModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(promoCenterModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r8);
    }

    private NormalResourcePackage(PromoCenterModule promoCenterModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.setMin = r6;
        this.getMin = promoCenterModule;
        this.getMax = new setMin(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.setMax = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.length = min2;
        this.isInside = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toFloatRange = new NormalResourcePackage$Mean$Arithmetic(r6);
        this.toIntRange = new hashCode(r6);
        values values2 = new values(r6);
        this.equals = values2;
        this.IsOverlapping = GriverPrepareInterceptor.AnonymousClass2.create(this.toFloatRange, this.toIntRange, values2);
        this.values = beforeQuery.create(this.toFloatRange, this.toIntRange, this.equals);
        this.toDoubleRange = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.hashCode = new IsOverlapping(r6);
        equals equals2 = new equals(r6);
        this.FastBitmap$CoordinateSystem = equals2;
        this.toString = getDataRequestNotifier.create(equals2);
        create create2 = new create(r6);
        this.invoke = create2;
        this.invokeSuspend = onCharacteristicWrite.create(create2, this.toFloatRange, this.toIntRange);
        localIdToBytes create3 = localIdToBytes.create(this.equals);
        this.Mean$Arithmetic = create3;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.getMax, this.isInside, this.IsOverlapping, this.values, this.toDoubleRange, this.hashCode, this.toString, this.invokeSuspend, create3));
        this.Grayscale$Algorithm = min3;
        this.valueOf = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.onNavigationEvent = min4;
        this.getCause = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        NormalResourcePackage$Grayscale$Algorithm normalResourcePackage$Grayscale$Algorithm = new NormalResourcePackage$Grayscale$Algorithm(r6);
        this.b = normalResourcePackage$Grayscale$Algorithm;
        NullBeaconDataFactory create4 = NullBeaconDataFactory.create(this.toFloatRange, this.toIntRange, normalResourcePackage$Grayscale$Algorithm);
        this.create = create4;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.getCause, create4));
        this.ICustomTabsCallback = min5;
        this.onMessageChannelReady = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        NormalResourcePackage$FastBitmap$CoordinateSystem normalResourcePackage$FastBitmap$CoordinateSystem = new NormalResourcePackage$FastBitmap$CoordinateSystem(r6);
        this.onPostMessage = normalResourcePackage$FastBitmap$CoordinateSystem;
        this.extraCallbackWithResult = GriverBizManifest.create(this.toFloatRange, this.toIntRange, normalResourcePackage$FastBitmap$CoordinateSystem);
        this.onRelationshipValidationResult = APWebSettings.PluginState.create(this.FastBitmap$CoordinateSystem);
        this.extraCallback = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        isInside isinside = new isInside(r6);
        this.asInterface = isinside;
        this.ICustomTabsCallback$Default = onConsoleMessage.create(this.toFloatRange, this.toIntRange, isinside);
        invoke invoke2 = new invoke(r6);
        this.onTransact = invoke2;
        this.asBinder = H5ResourceCORSUtil.AnonymousClass1.create(this.toFloatRange, this.toIntRange, invoke2);
        toIntRange tointrange = new toIntRange(r6);
        this.ICustomTabsCallback$Stub = tointrange;
        this.getDefaultImpl = capturePropagationValues.getMin(this.asBinder, tointrange);
        valueOf valueof = new valueOf(r6);
        this.ICustomTabsCallback$Stub$Proxy = valueof;
        this.setDefaultImpl = ScanState.create(this.toFloatRange, this.toIntRange, valueof);
        this.ICustomTabsService = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.ICustomTabsService);
        this.getInterfaceDescriptor = length2;
        this.newSessionWithExtras = Transition.MatchOrder.length(this.setDefaultImpl, length2);
        this.mayLaunchUrl = setInitialScale.create(this.toFloatRange, this.toIntRange, this.FastBitmap$CoordinateSystem);
        postUrl create5 = postUrl.create(this.toFloatRange, this.toIntRange, this.FastBitmap$CoordinateSystem);
        this.warmup = create5;
        this.extraCommand = getName.setMin(this.mayLaunchUrl, create5, manuallyReleaseCamera.setMax());
        toString tostring = new toString(r6);
        this.newSession = tostring;
        saveAppInfos create6 = saveAppInfos.create(tostring);
        this.requestPostMessageChannelWithExtras = create6;
        this.updateVisuals = captureHierarchy.length(create6, OpenInBrowserBridgeExtension.setMax());
        this.requestPostMessageChannel = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.getMax));
        this.validateRelationship = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.extraCallbackWithResult, this.onRelationshipValidationResult, this.extraCallback, this.ICustomTabsCallback$Default, this.getDefaultImpl, this.newSessionWithExtras, this.extraCommand, this.updateVisuals, this.requestPostMessageChannel, min6, this.toString));
        this.postMessage = min7;
        this.ICustomTabsService$Stub = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.IPostMessageService = todoublerange;
        this.ICustomTabsService$Default = didRangeBeaconsInRegion.create(this.toFloatRange, this.toIntRange, todoublerange);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.getMax);
        this.ICustomTabsService$Stub$Proxy = max;
        this.receiveFile = getSystemInfo.setMax(max);
        getMin getmin = new getMin(r6);
        this.onExtraCallback = getmin;
        setOptionMenu create7 = setOptionMenu.create(getmin);
        this.ITrustedWebActivityCallback = create7;
        this.IPostMessageService$Default = isScrap.getMin(setPropagation.length(this.ICustomTabsService$Stub, this.ICustomTabsService$Default, this.receiveFile, create7, this.hashCode));
        this.IPostMessageService$Stub = getLoadsImagesAutomatically.create(this.toFloatRange, this.toIntRange, this.FastBitmap$CoordinateSystem);
        this.IPostMessageService$Stub$Proxy = setWebContentsDebuggingEnabled.create(this.FastBitmap$CoordinateSystem);
        installPathExist create8 = installPathExist.create(this.FastBitmap$CoordinateSystem);
        this.ITrustedWebActivityCallback$Default = create8;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.ICustomTabsService$Stub, this.IPostMessageService$Default, this.IPostMessageService$Stub, this.IPostMessageService$Stub$Proxy, create8));
        this.areNotificationsEnabled = min8;
        this.ITrustedWebActivityService = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityCallback$Stub$Proxy = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMax getmax = new getMax(r6);
        this.ITrustedWebActivityCallback$Stub = getmax;
        this.getSmallIconId = GriverOpenAuthExtension.create(getmax);
        this.cancelNotification = BLEManager.AnonymousClass2.create(this.toFloatRange, this.toIntRange, this.invoke);
        this.notifyNotificationWithChannel = GriverDialogExtension.create(this.toFloatRange, this.toIntRange, this.ITrustedWebActivityCallback$Stub);
        this.getActiveNotifications = checkSuffixSupported.create(this.FastBitmap$CoordinateSystem);
        this.getSmallIconBitmap = isImage.create(this.FastBitmap$CoordinateSystem);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Stub$Proxy, startListenScreenshot.setMin(), this.getSmallIconId, this.cancelNotification, this.notifyNotificationWithChannel, this.getActiveNotifications, this.getSmallIconBitmap);
        this.ITrustedWebActivityService$Stub = max2;
        this.INotificationSideChannel = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.notify = BindFont.length(servicesModule);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.ITrustedWebActivityService$Stub$Proxy = onnavigationevent;
        this.ITrustedWebActivityService$Default = onStartBleScan.create(this.toFloatRange, this.toIntRange, onnavigationevent);
        this.INotificationSideChannel$Stub$Proxy = onGetBluetoothCharacteristics.create(this.toFloatRange, this.toIntRange, this.ITrustedWebActivityService$Stub$Proxy);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.cancel = tofloatrange;
        this.INotificationSideChannel$Default = matchesBeacon.create(this.IPostMessageService, tofloatrange);
        this.cancelAll = validateMac.create(this.toFloatRange, this.toIntRange, this.IPostMessageService);
        this.INotificationSideChannel$Stub = IntentHandler.create(this.toFloatRange, this.toIntRange, this.IPostMessageService, this.cancel);
        this.IconCompatParcelizer = toUuid.create(this.FastBitmap$CoordinateSystem);
        this.read = didDetermineStateForRegion.create(this.IPostMessageService);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.RemoteActionCompatParcelizer = invokesuspend;
        this.MediaBrowserCompat$CustomActionResultReceiver = BLEManager.AnonymousClass3.create(invokesuspend);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.RemoteActionCompatParcelizer);
        this.write = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.getMax, this.notify, this.ITrustedWebActivityCallback, this.receiveFile, this.ITrustedWebActivityService$Default, this.INotificationSideChannel$Stub$Proxy, this.INotificationSideChannel$Default, this.cancelAll, this.ICustomTabsService$Default, this.INotificationSideChannel$Stub, this.IconCompatParcelizer, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, create9));
        this.MediaBrowserCompat$SearchResultReceiver = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.valueOf, this.onMessageChannelReady, this.ITrustedWebActivityService, this.INotificationSideChannel, min9));
        this.MediaDescriptionCompat = min10;
        this.MediaBrowserCompat$MediaItem = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        length length3 = new length(r29);
        this.MediaBrowserCompat$ItemReceiver = length3;
        this.MediaBrowserCompat$MediaItem$Flags = APWebMessagePort.APWebMessageCallback.create(this.toFloatRange, this.toIntRange, length3);
        this.MediaMetadataCompat$BitmapKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.toFloatRange, this.toIntRange, this.ITrustedWebActivityCallback$Stub);
        this.MediaMetadataCompat$TextKey = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$MediaItem$Flags, this.MediaMetadataCompat$BitmapKey, create10));
        this.MediaMetadataCompat$LongKey = min11;
        this.MediaMetadataCompat$RatingKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class setMax {
        public OauthModule IsOverlapping;
        public DeepLinkModule getMax;
        public PromoCenterModule getMin;
        public PrepareException.AnonymousClass1 isInside;
        public ScanQrModule length;
        public FeatureModule setMax;
        public RestoreUrlModule setMin;
        public ServicesModule toFloatRange;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 setMin;

        values(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.setMin.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem != null) {
                return FastBitmap$CoordinateSystem;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.setMin.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMin;

        equals(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.getMin.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMax;

        create(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.getMax.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 getMin;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.getMin.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invoke implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 getMax;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.getMax.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getAppPerfKey ICustomTabsService$Stub$Proxy = this.getMin.ICustomTabsService$Stub$Proxy();
            if (ICustomTabsService$Stub$Proxy != null) {
                return ICustomTabsService$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 setMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.setMax.ITrustedWebActivityService$Default();
            if (ITrustedWebActivityService$Default != null) {
                return ITrustedWebActivityService$Default;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.setMin.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 setMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.setMin.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.length.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.setMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class onNavigationEvent implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 length;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.length.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.length.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMax;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onCharacteristicChanged write = this.getMax.write();
            if (write != null) {
                return write;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setSupportZoom ICustomTabsService$Stub = this.setMin.ICustomTabsService$Stub();
            if (ICustomTabsService$Stub != null) {
                return ICustomTabsService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void length(PromoCenterActivity promoCenterActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(promoCenterActivity, IPostMessageService$Stub$Proxy2);
            applyChanges ICustomTabsCallback$Stub2 = this.setMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub2 != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub2;
                appxLoadFailed length2 = this.setMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals2 = this.setMin.updateVisuals();
                        if (updateVisuals2 != null) {
                            matchInfo.length(promoCenterActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            PromoCenterModule promoCenterModule = this.getMin;
                            getTags min2 = getInputData.getMin(GriverEnvExtension.setMin(promoCenterModule), new ZoomRecyclerView.GestureListener(new onDoubleTapEvent()), new onDoubleTap(new onDoubleTapEvent()), new onDoubleTapEvent());
                            appxLoadFailed length3 = this.setMin.length();
                            if (length3 != null) {
                                appxLoadFailed appxloadfailed2 = length3;
                                getScheme min3 = this.setMin.getMin();
                                if (min3 != null) {
                                    getScheme getscheme2 = min3;
                                    GriverResourceManager INotificationSideChannel2 = this.setMin.INotificationSideChannel();
                                    if (INotificationSideChannel2 != null) {
                                        WebViewType webViewType = new WebViewType(appxloadfailed2, getscheme2, INotificationSideChannel2);
                                        appxLoadFailed length4 = this.setMin.length();
                                        if (length4 != null) {
                                            appxLoadFailed appxloadfailed3 = length4;
                                            getScheme min4 = this.setMin.getMin();
                                            if (min4 != null) {
                                                getScheme getscheme3 = min4;
                                                GriverResourceManager INotificationSideChannel3 = this.setMin.INotificationSideChannel();
                                                if (INotificationSideChannel3 != null) {
                                                    getDefaultAsyncJsApiList getdefaultasyncjsapilist = new getDefaultAsyncJsApiList(appxloadfailed3, getscheme3, INotificationSideChannel3);
                                                    setDefaultFontSize updateVisuals3 = this.setMin.updateVisuals();
                                                    if (updateVisuals3 != null) {
                                                        WorkerApiConfig workerApiConfig = new WorkerApiConfig(updateVisuals3);
                                                        GriverResourceManager INotificationSideChannel4 = this.setMin.INotificationSideChannel();
                                                        if (INotificationSideChannel4 != null) {
                                                            GriverResourceManager griverResourceManager = INotificationSideChannel4;
                                                            appxLoadFailed length5 = this.setMin.length();
                                                            if (length5 != null) {
                                                                appxLoadFailed appxloadfailed4 = length5;
                                                                getScheme min5 = this.setMin.getMin();
                                                                if (min5 != null) {
                                                                    getTriggeredContentAuthorities.getMin(min2, webViewType, getdefaultasyncjsapilist, workerApiConfig, new useSysWebWillCrash(griverResourceManager, appxloadfailed4, min5));
                                                                    GriverH5AppInstallManager$2.setMax(promoCenterActivity, getSectionConfig.getMin(promoCenterModule, min2));
                                                                    GriverH5AppInstallManager$2.setMax(promoCenterActivity, this.MediaMetadataCompat$RatingKey.get());
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
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
