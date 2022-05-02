package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Patterns;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.danah5.share.directtext.ShareDirectTextEntity;
import id.dana.danah5.share.directtext.ShareDirectTextResultFactory;
import id.dana.data.risk.riskevent.sharetextbroadcast.ShareTextBroadcastReceiver;
import id.dana.lib.gcontainer.app.bridge.share.text.ShareTextEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CornerMarkingDataProvider;
import o.DatePickerBridgeExtension;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002J&\u0010\u0013\u001a\u00020\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u0016\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u001f\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u001a\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\n2\u0006\u0010\"\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/danah5/share/text/ShareTextManager;", "", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "shareTextBroadcastReceiver", "Lid/dana/data/risk/riskevent/sharetextbroadcast/ShareTextBroadcastReceiver;", "(Landroid/app/Activity;Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;Lid/dana/data/risk/riskevent/sharetextbroadcast/ShareTextBroadcastReceiver;)V", "extractLinks", "", "text", "getReceiverPendingIntent", "Landroid/app/PendingIntent;", "extraMessage", "bizCode", "getResult", "Lcom/alibaba/fastjson/JSONObject;", "resultType", "openChooseDialog", "", "title", "processEvent", "shareDirectTextEntity", "Lid/dana/danah5/share/directtext/ShareDirectTextEntity;", "shareTextEntity", "Lid/dana/lib/gcontainer/app/bridge/share/text/ShareTextEntity;", "registerReceiver", "sendUnknownError", "shareNoApplicationFound", "shareNoMessageResult", "shareText", "shareToExternalApp", "message", "packageName", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class updateTextColor {
    private static final String ACTION = "broadcast_risk_event";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final int SHARE_TEXT_REQUEST_CODE = CornerMarkingDataProvider.AnonymousClass2.setMax();
    private static final String TAG = updateTextColor.class.getSimpleName();
    /* access modifiers changed from: private */
    public final Activity activity;
    /* access modifiers changed from: private */
    public final BridgeCallback bridgeCallback;
    /* access modifiers changed from: private */
    public final ShareTextBroadcastReceiver shareTextBroadcastReceiver;

    public updateTextColor(@NotNull Activity activity2, @NotNull BridgeCallback bridgeCallback2, @NotNull ShareTextBroadcastReceiver shareTextBroadcastReceiver2) {
        Intrinsics.checkNotNullParameter(activity2, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(shareTextBroadcastReceiver2, "shareTextBroadcastReceiver");
        this.activity = activity2;
        this.bridgeCallback = bridgeCallback2;
        this.shareTextBroadcastReceiver = shareTextBroadcastReceiver2;
    }

    public final void processEvent(@Nullable ShareTextEntity shareTextEntity) {
        if (shareTextEntity != null) {
            shareText(shareTextEntity);
        } else {
            this.bridgeCallback.sendJSONResponse(getResult("NO_CONTENT_INFO"));
        }
    }

    public final void processEvent(@Nullable ShareDirectTextEntity shareDirectTextEntity) {
        if (shareDirectTextEntity != null) {
            shareText(shareDirectTextEntity);
        } else {
            this.bridgeCallback.sendJSONResponse(getResult("NO_CONTENT_INFO"));
        }
    }

    private final void shareText(ShareTextEntity shareTextEntity) {
        String str;
        String str2 = null;
        CharSequence message = shareTextEntity != null ? shareTextEntity.getMessage() : null;
        boolean z = false;
        if (message == null || message.length() == 0) {
            shareNoMessageResult();
            return;
        }
        if (shareTextEntity != null) {
            str2 = shareTextEntity.getTitle();
        }
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            str = "Share via";
        } else {
            Intrinsics.checkNotNull(shareTextEntity);
            str = shareTextEntity.getTitle();
        }
        Intrinsics.checkNotNull(shareTextEntity);
        openChooseDialog(shareTextEntity.getMessage(), str, shareTextEntity.getBizCode());
    }

    private final void shareText(ShareDirectTextEntity shareDirectTextEntity) {
        CharSequence message = shareDirectTextEntity != null ? shareDirectTextEntity.getMessage() : null;
        if (message == null || message.length() == 0) {
            shareNoMessageResult();
            return;
        }
        Context applicationContext = this.activity.getApplicationContext();
        Intrinsics.checkNotNull(shareDirectTextEntity);
        findBestPreviewSizeValue length = isActivityLandscape.length(applicationContext, shareDirectTextEntity.getExternalApp());
        if (length != null) {
            String message2 = shareDirectTextEntity.getMessage();
            String str = length.getMax;
            Intrinsics.checkNotNullExpressionValue(str, "socialShareModel.appPackageName");
            shareToExternalApp(message2, str);
        }
    }

    private final void shareToExternalApp(String str, String str2) {
        try {
            Intent min = getLineColor.getMin(str);
            if (getLineColor.getMax(this.activity, str2)) {
                min.setPackage(str2);
                this.activity.startActivity(min);
                return;
            }
            shareNoMessageResult();
        } catch (ActivityNotFoundException unused) {
            shareNoApplicationFound();
        }
    }

    private final void shareNoMessageResult() {
        this.bridgeCallback.sendJSONResponse(ShareDirectTextResultFactory.INSTANCE.getResult("NO_MESSAGE"));
    }

    private final void shareNoApplicationFound() {
        this.bridgeCallback.sendJSONResponse(ShareDirectTextResultFactory.INSTANCE.getResult("APPLICATION_NOT_FOUND"));
    }

    private final void openChooseDialog(String str, String str2, String str3) {
        registerReceiver();
        Intent addFlags = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(addFlags, "Intent(Intent.ACTION_SEN…t.FLAG_ACTIVITY_NEW_TASK)");
        if (!DatePickerBridgeExtension.AnonymousClass8.length(addFlags, WindowBridgeExtension.AnonymousClass1.getMax())) {
            sendUnknownError();
        } else if (CornerMarkingDataProvider.toIntRange()) {
            this.activity.startActivity(Intent.createChooser(addFlags, str2, getReceiverPendingIntent(str, str3).getIntentSender()));
        } else {
            this.activity.startActivity(Intent.createChooser(addFlags, str2));
        }
    }

    private final void registerReceiver() {
        try {
            this.activity.registerReceiver(this.shareTextBroadcastReceiver, new IntentFilter(ACTION));
        } catch (Exception e) {
            updateActionSheetContent.e(TAG, "registerReceiver", e);
        }
        this.shareTextBroadcastReceiver.setListener(new setMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onReceive"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements RVDownloadRequest {
        final /* synthetic */ updateTextColor this$0;

        setMax(updateTextColor updatetextcolor) {
            this.this$0 = updatetextcolor;
        }

        public final void onReceive(boolean z) {
            this.this$0.bridgeCallback.sendJSONResponse(this.this$0.getResult("SUCCESS"));
            getContentInsetEnd.getMax((Context) this.this$0.activity, (BroadcastReceiver) this.this$0.shareTextBroadcastReceiver);
        }
    }

    private final PendingIntent getReceiverPendingIntent(String str, String str2) {
        Intent putExtra = new Intent(ACTION).putExtra("URL", extractLinks(str)).putExtra("bizCode", str2);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION)\n         …ceiver.BIZ_CODE, bizCode)");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.activity, SHARE_TEXT_REQUEST_CODE, putExtra, 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…tent.FLAG_UPDATE_CURRENT)");
        return broadcast;
    }

    private final void sendUnknownError() {
        this.bridgeCallback.sendJSONResponse(getResult("UNKNOWN_ERROR"));
    }

    /* access modifiers changed from: private */
    public final JSONObject getResult(String str) {
        String str2;
        if (Intrinsics.areEqual((Object) str, (Object) "SUCCESS")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        Map map = jSONObject2;
        map.put("success", Boolean.FALSE);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 532999017) {
                if (hashCode == 1415358098 && str.equals("NO_CONTENT_INFO")) {
                    str2 = "002";
                    map.put("error", str2);
                    return jSONObject2;
                }
            } else if (str.equals("NO_MESSAGE")) {
                str2 = "003";
                map.put("error", str2);
                return jSONObject2;
            }
        }
        str2 = "001";
        map.put("error", str2);
        return jSONObject2;
    }

    private final String extractLinks(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        Collection collection = arrayList;
        Object[] array = collection.toArray(new String[0]);
        if (array != null) {
            if (!(!(array.length == 0))) {
                return "";
            }
            Object[] array2 = collection.toArray(new String[0]);
            if (array2 != null) {
                return ((String[]) array2)[0];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/danah5/share/text/ShareTextManager$Companion;", "", "()V", "ACTION", "", "SHARE_TEXT_REQUEST_CODE", "", "TAG", "kotlin.jvm.PlatformType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
