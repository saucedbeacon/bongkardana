package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\f\u0010\u000f\u001a\u00020\f*\u00020\u0010H\u0002J\u001e\u0010\u0011\u001a\u0002H\u0012\"\n\b\u0000\u0010\u0012\u0018\u0001*\u00020\u0013*\u00020\bH\b¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/danah5/ocrreceipt/repository/DefaultOcrConfigRepository;", "Lid/dana/appcontainer/plugin/ocrreceipt/repository/OcrConfigRepository;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "serializer", "Lid/dana/data/storage/Serializer;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;Lid/dana/data/storage/Serializer;)V", "getDefaultImagePreprocessingConfig", "Lcom/alibaba/fastjson/JSONObject;", "getImagePreprocessingAmcs", "getImagePreprocessingConfig", "Lio/reactivex/Single;", "Lid/dana/danah5/ocrreceipt/usecase/model/OcrImagePreprocessingConfigModel;", "getSnapSizeLimit", "", "mapToOcrImagePreprocessingConfigModel", "Lid/dana/danah5/ocrreceipt/repository/model/OcrImagePreprocessingConfigResult;", "toObject", "T", "", "(Lcom/alibaba/fastjson/JSONObject;)Ljava/lang/Object;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class inferTheme implements shouldBeKeptAsChild {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    public static final boolean DEFAULT_PREPROCESSING_SWITCH = false;
    public static final long DEFAULT_PREPROCESSING_TIMEOUT = 60;
    public static final long DEFAULT_SIZE_LIMIT_MB = 2097152;
    /* access modifiers changed from: private */
    public final PluginInstallCallback serializer;

    @Inject
    public inferTheme(@NotNull onCallBack oncallback, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
        oncallback.createData("network");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [o.TitleBarRightButtonView$CornerMarkingUIController$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<java.lang.Long> getSnapSizeLimit() {
        /*
            r9 = this;
            o.inferTheme$getMax r0 = o.inferTheme.getMax.INSTANCE
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(r0)
            o.inferTheme$setMax r1 = o.inferTheme.setMax.INSTANCE
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            java.lang.String r2 = "mapper is null"
            o.setRefreshAnimation.getMax(r1, (java.lang.String) r2)
            o.releaseViewList r2 = new o.releaseViewList
            r2.<init>(r0, r1)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r0 = o.SecuritySignature.toString
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = o.SecuritySignature.getMax(r0, r2)
            r2 = r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x0021:
            r4 = r2
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            o.hasCornerMarking r8 = o.getSecureSignatureComp.getMin()
            java.lang.String r0 = "unit is null"
            o.setRefreshAnimation.getMax(r7, (java.lang.String) r0)
            java.lang.String r0 = "scheduler is null"
            o.setRefreshAnimation.getMax(r8, (java.lang.String) r0)
            o.setBackHomeButtonColor r0 = new o.setBackHomeButtonColor
            r5 = 1
            r3 = r0
            r3.<init>(r4, r5, r7, r8)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r1 = o.SecuritySignature.toString
            if (r1 == 0) goto L_0x0044
            java.lang.Object r0 = o.SecuritySignature.getMax(r1, r0)
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r0
        L_0x0044:
            r1 = 2097152(0x200000, double:1.0361308E-317)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "value is null"
            o.setRefreshAnimation.getMax(r1, (java.lang.String) r2)
            o.setOptionMenuColor r2 = new o.setOptionMenuColor
            r3 = 0
            r2.<init>(r0, r3, r1)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r0 = o.SecuritySignature.toString
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = o.SecuritySignature.getMax(r0, r2)
            r2 = r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x0062:
            java.lang.String r0 = "Single\n            .from…em(DEFAULT_SIZE_LIMIT_MB)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.inferTheme.getSnapSizeLimit():o.TitleBarRightButtonView$CornerMarkingUIController$1");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Long;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<V> implements Callable<Long> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
        }

        public final Long call() {
            return Long.valueOf(setLeftSelected.getMin("loyalty_snap_size_limit", (Number) 2097152L).longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "apply", "(Ljava/lang/Long;)Ljava/lang/Long;"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Long, Long> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
        }

        public final Long apply(@NotNull Long l) {
            Intrinsics.checkNotNullParameter(l, "it");
            return Long.valueOf(l.longValue() == 0 ? 2097152 : l.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/alibaba/fastjson/JSONObject;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<JSONObject> {
        final /* synthetic */ inferTheme this$0;

        length(inferTheme infertheme) {
            this.this$0 = infertheme;
        }

        public final JSONObject call() {
            return this.this$0.getImagePreprocessingAmcs();
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [o.TitleBarRightButtonView$CornerMarkingUIController$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<o.hasActionButtons> getImagePreprocessingConfig() {
        /*
            r9 = this;
            o.inferTheme$length r0 = new o.inferTheme$length
            r0.<init>(r9)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(r0)
            o.inferTheme$getMin r1 = new o.inferTheme$getMin
            r1.<init>(r9)
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            java.lang.String r2 = "mapper is null"
            o.setRefreshAnimation.getMax(r1, (java.lang.String) r2)
            o.releaseViewList r2 = new o.releaseViewList
            r2.<init>(r0, r1)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r0 = o.SecuritySignature.toString
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = o.SecuritySignature.getMax(r0, r2)
            r2 = r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x0027:
            r4 = r2
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            o.hasCornerMarking r8 = o.getSecureSignatureComp.getMin()
            java.lang.String r0 = "unit is null"
            o.setRefreshAnimation.getMax(r7, (java.lang.String) r0)
            java.lang.String r0 = "scheduler is null"
            o.setRefreshAnimation.getMax(r8, (java.lang.String) r0)
            o.setBackHomeButtonColor r0 = new o.setBackHomeButtonColor
            r5 = 1
            r3 = r0
            r3.<init>(r4, r5, r7, r8)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r1 = o.SecuritySignature.toString
            if (r1 == 0) goto L_0x004a
            java.lang.Object r0 = o.SecuritySignature.getMax(r1, r0)
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r0 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r0
        L_0x004a:
            com.alibaba.fastjson.JSONObject r1 = r9.getDefaultImagePreprocessingConfig()
            o.PluginInstallCallback r2 = r9.serializer
            java.lang.String r1 = r1.toString()
            java.lang.Class<o.setActionButtonEnabled> r3 = o.setActionButtonEnabled.class
            java.lang.Object r1 = r2.deserialize(r1, r3)
            java.lang.String r2 = "serializer.deserialize(\n…oString(), T::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            o.setActionButtonEnabled r1 = (o.setActionButtonEnabled) r1
            o.hasActionButtons r1 = r9.mapToOcrImagePreprocessingConfigModel(r1)
            java.lang.String r2 = "value is null"
            o.setRefreshAnimation.getMax(r1, (java.lang.String) r2)
            o.setOptionMenuColor r2 = new o.setOptionMenuColor
            r3 = 0
            r2.<init>(r0, r3, r1)
            o.RedDotDrawable<? super o.TitleBarRightButtonView$CornerMarkingUIController$1, ? extends o.TitleBarRightButtonView$CornerMarkingUIController$1> r0 = o.SecuritySignature.toString
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = o.SecuritySignature.getMax(r0, r2)
            r2 = r0
            o.TitleBarRightButtonView$CornerMarkingUIController$1 r2 = (o.TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) r2
        L_0x007e:
            java.lang.String r0 = "Single\n            .from…eprocessingConfigModel())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.inferTheme.getImagePreprocessingConfig():o.TitleBarRightButtonView$CornerMarkingUIController$1");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/danah5/ocrreceipt/usecase/model/OcrImagePreprocessingConfigModel;", "kotlin.jvm.PlatformType", "it", "Lcom/alibaba/fastjson/JSONObject;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<JSONObject, hasActionButtons> {
        final /* synthetic */ inferTheme this$0;

        getMin(inferTheme infertheme) {
            this.this$0 = infertheme;
        }

        public final hasActionButtons apply(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "it");
            inferTheme infertheme = this.this$0;
            Object deserialize = infertheme.serializer.deserialize(jSONObject.toString(), setActionButtonEnabled.class);
            Intrinsics.checkNotNullExpressionValue(deserialize, "serializer.deserialize(\n…oString(), T::class.java)");
            return infertheme.mapToOcrImagePreprocessingConfigModel((setActionButtonEnabled) deserialize);
        }
    }

    /* access modifiers changed from: private */
    public final JSONObject getImagePreprocessingAmcs() {
        JSONObject min = setLeftSelected.setMin("loyalty_image_preprocessing_config", getDefaultImagePreprocessingConfig());
        return min == null ? getDefaultImagePreprocessingConfig() : min;
    }

    /* access modifiers changed from: private */
    public final /* synthetic */ <T> T toObject(JSONObject jSONObject) {
        PluginInstallCallback access$getSerializer$p = this.serializer;
        String obj = jSONObject.toString();
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        T deserialize = access$getSerializer$p.deserialize(obj, Object.class);
        Intrinsics.checkNotNullExpressionValue(deserialize, "serializer.deserialize(\n…oString(), T::class.java)");
        return deserialize;
    }

    /* access modifiers changed from: private */
    public final hasActionButtons mapToOcrImagePreprocessingConfigModel(setActionButtonEnabled setactionbuttonenabled) {
        return new hasActionButtons(setactionbuttonenabled.getEnable(), setactionbuttonenabled.getTimeout());
    }

    private final JSONObject getDefaultImagePreprocessingConfig() {
        Object json = JSON.toJSON(new setActionButtonEnabled(false, 60));
        if (json != null) {
            return (JSONObject) json;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/danah5/ocrreceipt/repository/DefaultOcrConfigRepository$Companion;", "", "()V", "DEFAULT_PREPROCESSING_SWITCH", "", "DEFAULT_PREPROCESSING_TIMEOUT", "", "DEFAULT_SIZE_LIMIT_MB", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
