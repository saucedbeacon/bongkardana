package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.model.CurrencyAmountModel;
import id.dana.model.PayMethodModel;
import id.dana.sendmoney.confirmation.ConfirmationType;
import id.dana.sendmoney.contact.provider.ContactProvider;
import id.dana.sendmoney.model.ConfirmationModel;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.VoucherModel;
import id.dana.sendmoney.model.WithdrawOTCModel;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BeaconManager;
import o.LoadInfo;
import o.PhotoResolver;
import o.SaveImageToAlbumBridgeExtension;
import o.TitleBarRightButtonView;
import o.setMaxTrackingAge;
import o.setProxy;
import org.jetbrains.annotations.NotNull;

public final class getPhotoPreview implements setProxy.length {
    /* access modifiers changed from: private */
    public final Context FastBitmap$CoordinateSystem;
    private final BeaconManager.ConsumerInfo IsOverlapping;
    private final BeaconManager.BeaconServiceConnection equals;
    /* access modifiers changed from: private */
    public final PhotoResolver.AnonymousClass1 getMax;
    private final isAnyConsumerBound getMin;
    private final canGoBack isInside;
    private final setMaxTrackingAge length;
    private final getBackgroundMode setMax;
    /* access modifiers changed from: private */
    public final SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1 setMin;
    private final getAppByUrl toFloatRange;
    private final requestStateForRegion toIntRange;
    /* access modifiers changed from: private */
    public final setProxy.setMax toString;
    private GriverAppVirtualHostProxy<Integer> values;

    @Inject
    public getPhotoPreview(Context context, BeaconManager.BeaconServiceConnection beaconServiceConnection, PhotoResolver.AnonymousClass1 r3, SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1 r4, getAppByUrl getappbyurl, setProxy.setMax setmax, getBackgroundMode getbackgroundmode, isAnyConsumerBound isanyconsumerbound, setMaxTrackingAge setmaxtrackingage, canGoBack cangoback, requestStateForRegion requeststateforregion, BeaconManager.ConsumerInfo consumerInfo) {
        this.FastBitmap$CoordinateSystem = context;
        this.equals = beaconServiceConnection;
        this.getMax = r3;
        this.setMin = r4;
        this.toString = setmax;
        this.setMax = getbackgroundmode;
        this.getMin = isanyconsumerbound;
        this.length = setmaxtrackingage;
        this.toFloatRange = getappbyurl;
        this.isInside = cangoback;
        this.toIntRange = requeststateforregion;
        this.IsOverlapping = consumerInfo;
    }

    public final void setMax() {
        this.equals.dispose();
        this.setMax.dispose();
        this.getMin.dispose();
        this.length.dispose();
        this.toFloatRange.dispose();
        this.isInside.dispose();
        GriverAppVirtualHostProxy<Integer> griverAppVirtualHostProxy = this.values;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            this.values = null;
        }
    }

    public final void setMin(boolean z) {
        if (z) {
            this.getMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getPhotoPreview.this.toString.onGetX2XVoucherSuccess(((Boolean) obj).booleanValue());
                }
            });
        } else {
            this.setMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(Object obj) {
                    getPhotoPreview.this.toString.onGetX2XVoucherSuccess(((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final void setMax(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, VoucherModel voucherModel) {
        ConfirmationModel min = this.setMin.getMin(recipientModel, recipientModel.getCause, currencyAmountModel, payMethodModel, str, ConfirmationType.Destination.CONTACT);
        min.ICustomTabsCallback = recipientModel.getMin();
        min.getDefaultImpl = recipientModel.b;
        min.IsOverlapping = recipientModel.length();
        min.equals = recipientModel.isInside;
        min.FastBitmap$CoordinateSystem = recipientModel.getMax();
        min.isInside = recipientModel.IsOverlapping();
        min.warmup = payMethodModel.Mean$Arithmetic;
        min.ICustomTabsService$Stub$Proxy = recipientModel.FastBitmap$CoordinateSystem;
        min.ICustomTabsService$Stub = recipientModel.toFloatRange();
        if (!(voucherModel == null || voucherModel.setMax == null)) {
            min.newSession = voucherModel.setMax.getMax;
            min.newSessionWithExtras = voucherModel.setMin;
        }
        setMax(min);
    }

    public final void setMax(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, VoucherModel voucherModel, WithdrawOTCModel withdrawOTCModel) {
        this.toString.showProgress();
        final RecipientModel recipientModel2 = recipientModel;
        final CurrencyAmountModel currencyAmountModel2 = currencyAmountModel;
        final PayMethodModel payMethodModel2 = payMethodModel;
        final String str2 = str;
        final VoucherModel voucherModel2 = voucherModel;
        final WithdrawOTCModel withdrawOTCModel2 = withdrawOTCModel;
        this.length.execute(new GriverAppVirtualHostProxy<getBeaconAdvertisementData>() {
            public final /* synthetic */ void onNext(Object obj) {
                getBeaconAdvertisementData getbeaconadvertisementdata = (getBeaconAdvertisementData) obj;
                SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1 max = getPhotoPreview.this.setMin;
                RecipientModel recipientModel = recipientModel2;
                CurrencyAmountModel currencyAmountModel = currencyAmountModel2;
                PayMethodModel payMethodModel = payMethodModel2;
                String str = str2;
                String str2 = recipientModel.getCause;
                VoucherModel voucherModel = voucherModel2;
                SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.getMax getmax = new SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.getMax();
                getmax.getMin = getbeaconadvertisementdata.getAcceptExpiryTimeUnit();
                getmax.length = getbeaconadvertisementdata.getAcceptExpiryTimeValue();
                getmax.setMax = withdrawOTCModel2;
                getmax.getMax = getbeaconadvertisementdata;
                ConfirmationModel min = max.getMin(recipientModel, str2, currencyAmountModel, payMethodModel, str, ConfirmationType.Destination.OTC);
                min.IsOverlapping = recipientModel.length();
                min.equals = recipientModel.isInside;
                min.requestPostMessageChannel = recipientModel.extraCallback;
                min.toFloatRange = getmax.getMin;
                min.toIntRange = getmax.length;
                WithdrawOTCModel withdrawOTCModel = getmax.setMax;
                WithdrawOTCModel withdrawOTCModel2 = new WithdrawOTCModel();
                withdrawOTCModel2.getMin = withdrawOTCModel.getMin;
                withdrawOTCModel2.toIntRange = withdrawOTCModel.toIntRange;
                withdrawOTCModel2.setMax = withdrawOTCModel.setMax;
                withdrawOTCModel2.IsOverlapping = withdrawOTCModel.IsOverlapping;
                withdrawOTCModel2.toFloatRange = withdrawOTCModel.toFloatRange;
                withdrawOTCModel2.setMin = payMethodModel.IsOverlapping;
                withdrawOTCModel2.getMax = payMethodModel.values;
                withdrawOTCModel2.length = payMethodModel.invokeSuspend;
                min.requestPostMessageChannelWithExtras = withdrawOTCModel2;
                if (SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.setMin(getmax)) {
                    min.values = getmax.getMax.getTransferMethod().get(0).getChargeAmount().getAmount();
                }
                if (!(voucherModel == null || voucherModel.setMax == null)) {
                    min.newSession = voucherModel.setMax.getMax;
                    min.newSessionWithExtras = voucherModel.setMin;
                }
                getPhotoPreview.this.setMax(min);
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                getPhotoPreview.this.toString.dismissProgress();
                setProxy.setMax max = getPhotoPreview.this.toString;
                Context min = getPhotoPreview.this.FastBitmap$CoordinateSystem;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min.getString(R.string.general_error_msg);
                }
                max.onError(str);
                updateActionSheetContent.e(DanaLogConstants.BizType.TRANSFER_MONEY, th.getMessage());
            }
        }, setMaxTrackingAge.getMin.forTransferOTCInit(currencyAmountModel.getMax, payMethodModel.toFloatRange));
    }

    public final void length(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, VoucherModel voucherModel) {
        this.toString.showProgress();
        BeaconManager.BeaconServiceConnection beaconServiceConnection = this.equals;
        final RecipientModel recipientModel2 = recipientModel;
        final CurrencyAmountModel currencyAmountModel2 = currencyAmountModel;
        final PayMethodModel payMethodModel2 = payMethodModel;
        final String str2 = str;
        final VoucherModel voucherModel2 = voucherModel;
        AnonymousClass5 r1 = new GriverAppVirtualHostProxy<parseHex>() {
            public final /* synthetic */ void onNext(Object obj) {
                parseHex parsehex = (parseHex) obj;
                if (parsehex != null) {
                    PhotoResolver.AnonymousClass1 unused = getPhotoPreview.this.getMax;
                    getProxy min = PhotoResolver.AnonymousClass1.setMin(parsehex);
                    SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1 max = getPhotoPreview.this.setMin;
                    RecipientModel recipientModel = recipientModel2;
                    CurrencyAmountModel currencyAmountModel = currencyAmountModel2;
                    PayMethodModel payMethodModel = payMethodModel2;
                    String str = str2;
                    VoucherModel voucherModel = voucherModel2;
                    ConfirmationModel max2 = SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.setMax(recipientModel, payMethodModel);
                    max2.IsOverlapping = min.getMax;
                    max2.equals = recipientModel.isInside;
                    max2.getMin(min.setMin);
                    max2.FastBitmap$CoordinateSystem = recipientModel.getMax();
                    max2.hashCode = currencyAmountModel.getMax;
                    max2.valueOf = currencyAmountModel.length;
                    max2.invoke = ConfirmationType.Destination.BANK;
                    max2.Grayscale$Algorithm = str;
                    max2.extraCallbackWithResult = payMethodModel.toDoubleRange;
                    max2.asInterface = payMethodModel.length() ? ConfirmationType.Origin.DANA : ConfirmationType.Origin.BANK;
                    max2.onTransact = !TextUtils.isEmpty(payMethodModel.IsOverlapping) ? String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", new Object[]{payMethodModel.IsOverlapping.toLowerCase()}) : null;
                    max2.onPostMessage = payMethodModel.getMin;
                    max2.asBinder = payMethodModel.setMin(max.getMin);
                    max2.ICustomTabsCallback$Default = payMethodModel.equals();
                    max2.onMessageChannelReady = payMethodModel.IsOverlapping;
                    SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.length(recipientModel, payMethodModel, max2);
                    max2.ICustomTabsCallback$Stub$Proxy = min.getMin;
                    max2.ICustomTabsService = recipientModel.toFloatRange;
                    max2.onNavigationEvent = min.length;
                    max2.getInterfaceDescriptor = recipientModel.equals;
                    max2.getCause = payMethodModel.toFloatRange;
                    max2.setDefaultImpl = recipientModel.onPostMessage;
                    max2.toString = recipientModel.setMin;
                    max2.warmup = payMethodModel.Mean$Arithmetic;
                    max2.extraCommand = (int) payMethodModel.isInside;
                    max2.ICustomTabsService$Default = recipientModel.onRelationshipValidationResult;
                    max2.ICustomTabsService$Stub$Proxy = recipientModel.FastBitmap$CoordinateSystem;
                    max2.ICustomTabsService$Stub = recipientModel.toFloatRange();
                    if (!(voucherModel == null || voucherModel.setMax == null)) {
                        max2.newSession = voucherModel.setMax.getMax;
                        max2.newSessionWithExtras = voucherModel.setMin;
                    }
                    getPhotoPreview.this.setMax(max2);
                    return;
                }
                getPhotoPreview.this.toString.onError(getPhotoPreview.this.FastBitmap$CoordinateSystem.getString(R.string.general_error_msg));
            }

            public final void onError(Throwable th) {
                String str;
                getPhotoPreview.this.toString.dismissProgress();
                setProxy.setMax max = getPhotoPreview.this.toString;
                Context min = getPhotoPreview.this.FastBitmap$CoordinateSystem;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min.getString(R.string.general_error_msg);
                }
                max.onError(str);
                StringBuilder sb = new StringBuilder("nameCheck error: ");
                sb.append(th.toString());
                updateActionSheetContent.exception(DanaLogConstants.TAG.SENDMONEY_NAMECHECK_TAG, DanaLogConstants.Prefix.NAME_CHECK, sb.toString());
                setStateOff.length(DanaLogConstants.TAG.SENDMONEY_NAMECHECK_TAG, th.getMessage(), th);
            }
        };
        setAllowPduOverflow setallowpduoverflow = new setAllowPduOverflow();
        if (!TextUtils.isEmpty(recipientModel.equals())) {
            setallowpduoverflow.setSavedAccount(true);
            setallowpduoverflow.setSavedAccountHolderName(recipientModel.length());
        }
        setallowpduoverflow.setInstId(recipientModel.getMin());
        setallowpduoverflow.setAmountToSent(currencyAmountModel.getMax);
        setallowpduoverflow.setSenderName(recipientModel.equals);
        setallowpduoverflow.setCardIndexNo(recipientModel.onMessageChannelReady);
        setallowpduoverflow.setCardNo(recipientModel.isInside);
        setallowpduoverflow.setWithdrawInstLocalName(recipientModel.length);
        setallowpduoverflow.setWithdrawPayMethod(recipientModel.toIntRange);
        setallowpduoverflow.setWithdrawPayOption(recipientModel.toFloatRange);
        setallowpduoverflow.setCardCredential("");
        setallowpduoverflow.setFundAmount(new stopBleScan(currencyAmountModel.getMax, currencyAmountModel.length));
        beaconServiceConnection.execute(r1, BeaconManager.BeaconServiceConnection.getMax.forSendMoneyNameCheck(setallowpduoverflow));
    }

    public final void setMin(RecipientModel recipientModel, CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, String str, String str2, String str3, VoucherModel voucherModel) {
        SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1 r0 = this.setMin;
        ConfirmationModel max = SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.setMax(recipientModel, payMethodModel);
        max.IsOverlapping = r0.getMin.getString(R.string.chat);
        max.equals = recipientModel.isInside;
        max.getMin(recipientModel.isInside);
        max.hashCode = currencyAmountModel.getMax;
        max.valueOf = currencyAmountModel.length;
        max.FastBitmap$CoordinateSystem = recipientModel.getMax();
        max.invoke = ConfirmationType.Destination.LINK;
        max.Grayscale$Algorithm = str3;
        max.extraCallbackWithResult = payMethodModel.toDoubleRange;
        max.asInterface = payMethodModel.length() ? ConfirmationType.Origin.DANA : ConfirmationType.Origin.BANK;
        max.onTransact = !TextUtils.isEmpty(payMethodModel.IsOverlapping) ? String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", new Object[]{payMethodModel.IsOverlapping.toLowerCase()}) : null;
        max.onPostMessage = payMethodModel.getMin;
        max.asBinder = payMethodModel.setMin(r0.getMin);
        max.ICustomTabsCallback$Default = payMethodModel.equals();
        max.toIntRange = str2;
        max.toFloatRange = str;
        SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1.length(recipientModel, payMethodModel, max);
        max.ICustomTabsService = recipientModel.toFloatRange;
        max.getInterfaceDescriptor = recipientModel.equals;
        max.getCause = payMethodModel.toFloatRange;
        max.onMessageChannelReady = payMethodModel.IsOverlapping;
        max.warmup = payMethodModel.Mean$Arithmetic;
        max.extraCommand = (int) payMethodModel.isInside;
        if (!(voucherModel == null || voucherModel.setMax == null)) {
            max.newSession = voucherModel.setMax.getMax;
            max.newSessionWithExtras = voucherModel.setMin;
        }
        setMax(max);
    }

    public final void getMin() {
        this.toFloatRange.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(Object obj) {
                getPhotoPreview.this.toString.onGetUserAvatar((String) obj);
            }
        });
    }

    public final void length() {
        this.isInside.execute(onReceivedIcon.INSTANCE, new PhotoGrid(this), new Function1(this) {
            private final getPhotoPreview getMin;

            public final java.lang.Object invoke(
/*
Method generation error in method: o.LoadInfo.1.invoke(java.lang.Object):java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LoadInfo.1.invoke(java.lang.Object):java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }

    public final void getMax() {
        this.toIntRange.execute(onReceivedIcon.INSTANCE, new setDefaultDrawable(this), new Function1(this) {
            private final getPhotoPreview setMin;

            public final java.lang.Object invoke(
/*
Method generation error in method: o.LoadInfo.3.invoke(java.lang.Object):java.lang.Object, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LoadInfo.3.invoke(java.lang.Object):java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
    }

    public final void length(String str) {
        this.IsOverlapping.execute(BeaconManager.ConsumerInfo.getMax.create(str), LoadInfo.AnonymousClass2.length, new isChecked(this));
    }

    /* access modifiers changed from: private */
    public void setMax(final ConfirmationModel confirmationModel) {
        if (!setStateOn.getMin(this.FastBitmap$CoordinateSystem, "android.permission.READ_CONTACTS")) {
            this.toString.dismissProgress();
            this.toString.goToConfirmation(confirmationModel);
            return;
        }
        this.values = (GriverAppVirtualHostProxy) TitleBarRightButtonView.AnonymousClass1.fromCallable(new PermissionHelper(new ContactProvider(this.FastBitmap$CoordinateSystem.getContentResolver(), ""))).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).subscribeWith(new GriverAppVirtualHostProxy<Integer>() {
            public final /* synthetic */ void onNext(@NotNull Object obj) {
                getPhotoPreview.this.toString.dismissProgress();
                confirmationModel.setMin = ((Integer) obj).intValue();
                getPhotoPreview.this.toString.goToConfirmation(confirmationModel);
                getPhotoPreview.getMin(getPhotoPreview.this);
            }

            public final void onError(Throwable th) {
                getPhotoPreview.this.toString.dismissProgress();
                getPhotoPreview.this.toString.goToConfirmation(confirmationModel);
                getPhotoPreview.getMin(getPhotoPreview.this);
            }
        });
    }

    public final void getMax(CurrencyAmountModel currencyAmountModel, PayMethodModel payMethodModel, boolean z) {
        if (currencyAmountModel != null && payMethodModel != null) {
            if (currencyAmountModel.getMin(payMethodModel.hashCode)) {
                this.toString.onMinimumAmountReached(payMethodModel.hashCode.getMax);
            } else if (currencyAmountModel.length(payMethodModel.FastBitmap$CoordinateSystem)) {
                this.toString.onMaximumAmountReached(payMethodModel.FastBitmap$CoordinateSystem.getMax);
            } else if (z) {
                this.toString.onAmountValidAndActionConfirmed();
            } else {
                this.toString.onAmountValid();
            }
        }
    }

    static /* synthetic */ void getMin(getPhotoPreview getphotopreview) {
        GriverAppVirtualHostProxy<Integer> griverAppVirtualHostProxy = getphotopreview.values;
        if (griverAppVirtualHostProxy != null) {
            griverAppVirtualHostProxy.dispose();
            getphotopreview.values = null;
        }
    }

    static /* synthetic */ Unit setMax(getPhotoPreview getphotopreview, Throwable th) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.TAG.SEND_MONEY_TAG);
        sb.append(getphotopreview.getClass().getName());
        sb.append(":onErrorGetSplitConfig");
        sb.append(th.toString());
        updateActionSheetContent.e(getCurrentNetworkType.TAG, sb.toString());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit toFloatRange(getPhotoPreview getphotopreview) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.TAG.SEND_MONEY_TAG);
        sb.append(getphotopreview.getClass().getName());
        sb.append(":onError");
        updateActionSheetContent.e(getCurrentNetworkType.TAG, sb.toString());
        return Unit.INSTANCE;
    }

    static /* synthetic */ Unit isInside(getPhotoPreview getphotopreview) {
        StringBuilder sb = new StringBuilder(DanaLogConstants.TAG.SEND_MONEY_TAG);
        sb.append(getphotopreview.getClass().getName());
        sb.append(":onError");
        updateActionSheetContent.e(getCurrentNetworkType.TAG, sb.toString());
        return Unit.INSTANCE;
    }
}
