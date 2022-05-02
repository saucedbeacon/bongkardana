package id.dana.notification;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.alipay.plus.push.core.PushServiceInstance;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.PushNotificationModule;
import id.dana.tracker.TrackerKey;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import o.GriverAppVirtualHostProxy;
import o.NormalResourcePackage;
import o.PrepareException;
import o.TinyAppHostApduService;
import o.VisitUrlPoint;
import o.convertDipToPx;
import o.convertSpToPx;
import o.disableItems;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getSHA1;
import o.imageQuality;
import o.isDecorView;
import o.isNfcEnable;
import o.onCancelLoad;
import o.onCanceled;
import o.onDeactivated;
import o.setTitleFont$core;
import o.sortChildDrawingOrder;
import o.startBluetoothDevicesDiscovery;
import o.stopIgnoring;

public class DanaFirebaseMessagingService extends FirebaseMessagingService implements sortChildDrawingOrder.length {
    public static final String EMPTY = "empty";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_DATA = "MESSAGE_DATA";
    public static final String PREF_KEY_FCM = "fb";
    public static final String REPORT_PUSH_MESSAGE_KEY = "PUSH_MESSAGE_KEY";
    public static final String REPORT_PUSH_TITLE_KEY = "PUSH_TITLE_KEY";
    public static final String TWILIO_CHALLENGE_NOTIFICATION_TYPE = "verify_push_challenge";
    public static final String TWILIO_CHALLENGE_SID = "challenge_sid";
    public static final String TWILIO_FACTOR_SID = "factor_sid";
    public static final String TYPE = "type";
    private boolean getMin;
    @Inject
    public TinyAppHostApduService.AnonymousClass1 notificationDirectorFactory;
    @Inject
    public isDecorView pushNotificationPresenter;

    private String setMax(String str) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(793976855, oncanceled);
            onCancelLoad.getMin(793976855, oncanceled);
        }
        return str != null ? str : "";
    }

    public void dismissProgress() {
    }

    public void onError(String str) {
    }

    public void onReportDeviceFailed() {
    }

    public void onReportDeviceSuccess() {
    }

    public void showProgress() {
    }

    public void onCreate() {
        super.onCreate();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && !(defaultUncaughtExceptionHandler instanceof setTitleFont$core)) {
            Thread.setDefaultUncaughtExceptionHandler(new setTitleFont$core(defaultUncaughtExceptionHandler, (Application) null));
        }
        NormalResourcePackage.AnonymousClass1.length length = new NormalResourcePackage.AnonymousClass1.length((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) getApplication()).getApplicationComponent();
        if (applicationComponent != null) {
            length.setMin = applicationComponent;
            length.getMax = new PushNotificationModule(this);
            stopIgnoring.setMin(length.getMax, PushNotificationModule.class);
            stopIgnoring.setMin(length.setMin, PrepareException.AnonymousClass1.class);
            new NormalResourcePackage.AnonymousClass1(length.getMax, length.setMin, (byte) 0).getMax(this);
            isDecorView isdecorview = this.pushNotificationPresenter;
            isdecorview.getMax.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final /* synthetic */ void onNext(
/*
Method generation error in method: o.isDecorView.2.onNext(java.lang.Object):void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.isDecorView.2.onNext(java.lang.Object):void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
            return;
        }
        throw null;
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        if (remoteMessage != null) {
            if (this.getMin && PushServiceInstance.getPushService() != null) {
                PushServiceInstance.getPushService().dispatchMessage(remoteMessage);
            }
            getString(R.string.notif_title);
            getString(R.string.notif_message);
            if (remoteMessage.getNotification() != null) {
                str2 = remoteMessage.getNotification().getTitle();
                str = remoteMessage.getNotification().getBody();
            } else {
                str2 = remoteMessage.getData().get("title");
                str = remoteMessage.getData().get(TtmlNode.TAG_BODY);
            }
            if (remoteMessage.getData().size() > 0) {
                remoteMessage.getData();
                Map<String, String> data = remoteMessage.getData();
                if (data != null) {
                    NotificationData length = length(str2, str, data);
                    if (length.equals != null && length.hashCode != null) {
                        getMax(length.equals, length.hashCode, data);
                    } else if (length.toFloatRange != null) {
                        Uri parse = Uri.parse(length.toFloatRange);
                        try {
                            str3 = parse.getQueryParameter("contextCode");
                        } catch (UnsupportedOperationException unused) {
                            str3 = null;
                        }
                        try {
                            str4 = parse.getQueryParameter("contextValue");
                        } catch (UnsupportedOperationException unused2) {
                            str4 = null;
                        }
                        if (str3 == null || str4 == null) {
                            getMax((String) null, (String) null, data);
                        } else {
                            getMax(str3, str4, data);
                        }
                    } else {
                        getMax((String) null, (String) null, data);
                    }
                    isNfcEnable max = this.notificationDirectorFactory.setMax(getApplicationContext(), length(str2, str, data));
                    if (max != null) {
                        max.setMax();
                    }
                }
            }
            Map<String, String> data2 = remoteMessage.getData();
            HashMap hashMap = new HashMap();
            hashMap.put(REPORT_PUSH_TITLE_KEY, str2);
            hashMap.put(REPORT_PUSH_MESSAGE_KEY, str);
            if (data2 != null) {
                hashMap.putAll(data2);
            }
            VisitUrlPoint.behaviour(DanaLogConstants.SeedId.PUSH_RECEIVED, DanaLogConstants.BizType.PUSH_NOTIFICATION, hashMap);
            onDeactivated.setMax().getMax.onNext(Boolean.TRUE);
        }
    }

    private void getMax(String str, String str2, Map<String, String> map) {
        convertDipToPx.length length = new convertDipToPx.length(getApplication());
        length.getMax = TrackerKey.Event.NOTIFICATION_PUSH_RECEIVED;
        for (Map.Entry next : map.entrySet()) {
            if (!"contextCode".equalsIgnoreCase((String) next.getKey()) && !"contextValue".equalsIgnoreCase((String) next.getValue())) {
                length.setMax(startBluetoothDevicesDiscovery.camelToSentenceCase((String) next.getKey()), (String) next.getValue());
            }
        }
        if (str != null) {
            length.setMax(TrackerKey.Property.CONTEXT_CODE, str);
        }
        if (str2 != null) {
            length.setMax(TrackerKey.Property.CONTEXT_VALUE, str2);
        }
        length.setMax(TrackerKey.Property.PAYLOAD, map.toString());
        length.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    private NotificationData length(String str, String str2, Map<String, String> map) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-618052281, oncanceled);
            onCancelLoad.getMin(-618052281, oncanceled);
        }
        NotificationData notificationData = new NotificationData();
        notificationData.setMax = str;
        notificationData.getMin = str2;
        notificationData.length = map.get("contentType");
        notificationData.setMin = map.get("iconUrl");
        notificationData.getMax = map.get("redirectType");
        notificationData.toFloatRange = map.get("redirectValue");
        notificationData.IsOverlapping = map.get("imageUrl");
        notificationData.FastBitmap$CoordinateSystem = new HashMap<>(map);
        notificationData.toIntRange = map.get("sound");
        notificationData.equals = map.get("contextCode");
        notificationData.hashCode = map.get("contextValue");
        if (getMin(map)) {
            setMax(map, map.get("twilioEvent"));
            notificationData.setMax = getString(R.string.twilio_notification_title);
            notificationData.getMax = RedirectType.TWILIO_CHALLENGE;
            notificationData.toDoubleRange = map.get(TWILIO_CHALLENGE_SID);
            notificationData.toString = map.get(TWILIO_FACTOR_SID);
            notificationData.getMin = map.get("message");
        }
        return notificationData;
    }

    private void setMax(Map<String, String> map, String str) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1703684444, oncanceled);
            onCancelLoad.getMin(-1703684444, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getApplication());
        length2.getMax = TrackerKey.Event.PUSH_VERIFY_NOTIFICATION_RECEIVED;
        length2.setMax("Source", "Login");
        length2.setMax(TrackerKey.Property.TIME, startBluetoothDevicesDiscovery.getDateTime("HH:mm:ss, d, MMM, yyyy", Locale.ENGLISH, "Asia/Jakarta"));
        length2.setMax(TrackerKey.Property.CHALLENGE_SID, setMax(map.get(TWILIO_CHALLENGE_SID)));
        length2.setMax(TrackerKey.Property.FACTOR_SID, setMax(map.get(TWILIO_FACTOR_SID)));
        length2.setMax(TrackerKey.Property.NOTIFICATION_TYPE, "Twilio");
        length2.setMax(TrackerKey.Property.DEVICE_SOURCE, setMin(str));
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    private static String setMin(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1156906798, oncanceled);
            onCancelLoad.getMin(1156906798, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1156906798, oncanceled2);
            onCancelLoad.getMin(1156906798, oncanceled2);
        }
        return (str == null || !str.equals(disableItems.VERIFY_SECURITY_PRODUCT_POST_LOGIN)) ? "Other Device" : "Same Device";
    }

    private static boolean getMin(Map<String, String> map) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(995532342, oncanceled);
            onCancelLoad.getMin(995532342, oncanceled);
        }
        return TWILIO_CHALLENGE_NOTIFICATION_TYPE.equals(map.get("type"));
    }

    public void onCheckPushNotifDiagnosticFeatureeSuccess(boolean z) {
        this.getMin = z;
    }

    public void onNewToken(String str) {
        isDecorView isdecorview = this.pushNotificationPresenter;
        isdecorview.setMax.execute(new GriverAppVirtualHostProxy<imageQuality>() {
            public final void onError(
/*
Method generation error in method: o.isDecorView.3.onError(java.lang.Throwable):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.isDecorView.3.onError(java.lang.Throwable):void, class status: UNLOADED
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

            public final /* synthetic */ void onNext(
/*
Method generation error in method: o.isDecorView.3.onNext(java.lang.Object):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.isDecorView.3.onNext(java.lang.Object):void, class status: UNLOADED
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
        }, getSHA1.getMax.forReportDevice(str, "", "", ((DanaApplication) getApplication()).getNetworkType()));
        isDecorView isdecorview2 = this.pushNotificationPresenter;
        isdecorview2.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* bridge */ /* synthetic */ void onNext(
/*
Method generation error in method: o.isDecorView.4.onNext(java.lang.Object):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.isDecorView.4.onNext(java.lang.Object):void, class status: UNLOADED
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
        }, str);
    }
}
