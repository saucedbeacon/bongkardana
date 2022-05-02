package id.dana.ocr;

import android.text.TextUtils;
import id.dana.ocr.UploadSnapReceiptContract;
import id.dana.ocr.constant.ErrorUploadReceipt;
import id.dana.ocr.model.OCRRequestModel;
import id.dana.ocr.model.OCRResultModel;
import id.dana.ocr.model.SubmitReceiptResultModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverMonitorAnalyticsConfigManager;
import o.MonitorManager;
import o.MonitorMap;
import o.code;
import o.exceedThreshold;
import o.getThreshold;
import o.setContentViewAfter;
import o.threshold;
import o.updateActionSheetContent;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J(\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0018\u0010\n\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0018\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J(\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002J\u0018\u0010!\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010!\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\f\u0010\"\u001a\u00020#*\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/ocr/UploadSnapReceiptPresenter;", "Lid/dana/ocr/UploadSnapReceiptContract$Presenter;", "view", "Lid/dana/ocr/UploadSnapReceiptContract$View;", "submitSnapReceipt", "Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt;", "saveReceiptData", "Lid/dana/domain/loyalty/interactor/SaveReceiptData;", "getReceiptData", "Lid/dana/domain/loyalty/interactor/GetReceiptData;", "removeReceiptData", "Lid/dana/domain/loyalty/interactor/RemoveReceiptData;", "(Lid/dana/ocr/UploadSnapReceiptContract$View;Lid/dana/domain/loyalty/interactor/SubmitSnapReceipt;Lid/dana/domain/loyalty/interactor/SaveReceiptData;Lid/dana/domain/loyalty/interactor/GetReceiptData;Lid/dana/domain/loyalty/interactor/RemoveReceiptData;)V", "onDestroy", "", "onSuccessSubmitReceipt", "taskId", "", "result", "Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "reUploadReceipt", "base64ReceiptLoyaltyBuilder", "Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty$Builder;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "filePath", "userLoyaltyId", "removeTemporaryImage", "ocrResultModel", "Lid/dana/ocr/model/OCRResultModel;", "submitting", "base64ReceiptLoyalty", "Lid/dana/domain/loyalty/model/Base64ReceiptLoyalty;", "uploadReceipt", "toSubmitReceiptResultModel", "Lid/dana/ocr/model/SubmitReceiptResultModel;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UploadSnapReceiptPresenter implements UploadSnapReceiptContract.Presenter {
    /* access modifiers changed from: private */
    public static final String equals;
    @NotNull
    public static final Companion setMin = new Companion((byte) 0);
    private final MonitorManager IsOverlapping;
    private final getThreshold getMax;
    private final exceedThreshold getMin;
    /* access modifiers changed from: private */
    public final UploadSnapReceiptContract.View length;
    private final GriverMonitorAnalyticsConfigManager.AnonymousClass1 setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ String $taskId;
        final /* synthetic */ UploadSnapReceiptPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, String str) {
            super(1);
            this.this$0 = uploadSnapReceiptPresenter;
            this.$taskId = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.getMin(this.$taskId, "011");
            this.this$0.length.dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            String max = UploadSnapReceiptPresenter.equals;
            StringBuilder sb = new StringBuilder("Error to remove receipt data on db because of ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(max, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            String max = UploadSnapReceiptPresenter.equals;
            StringBuilder sb = new StringBuilder("Error to save receipt data into db because of ");
            sb.append(th.getMessage());
            updateActionSheetContent.e(max, sb.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ String $taskId;
        final /* synthetic */ UploadSnapReceiptPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, String str) {
            super(1);
            this.this$0 = uploadSnapReceiptPresenter;
            this.$taskId = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.getMin(this.$taskId, ErrorUploadReceipt.DATA_NOT_FOUND);
            this.this$0.length.dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/loyalty/model/SubmitReceiptResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<threshold, Unit> {
        final /* synthetic */ MonitorMap $base64ReceiptLoyalty;
        final /* synthetic */ String $filePath;
        final /* synthetic */ String $taskId;
        final /* synthetic */ UploadSnapReceiptPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, String str, MonitorMap monitorMap, String str2) {
            super(1);
            this.this$0 = uploadSnapReceiptPresenter;
            this.$taskId = str;
            this.$base64ReceiptLoyalty = monitorMap;
            this.$filePath = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((threshold) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull threshold threshold) {
            Intrinsics.checkNotNullParameter(threshold, "it");
            this.this$0.length.dismissProgress();
            UploadSnapReceiptPresenter.setMax(this.this$0, this.$taskId, threshold);
            this.this$0.IsOverlapping.execute(MonitorManager.setMax.Companion.create(this.$base64ReceiptLoyalty.getUserLoyaltyId()), new setMax(this.this$0, this.$filePath), getMax.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $filePath;
        final /* synthetic */ UploadSnapReceiptPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, String str) {
            super(1);
            this.this$0 = uploadSnapReceiptPresenter;
            this.$filePath = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                this.this$0.length.setMax(this.$filePath);
            } else {
                updateActionSheetContent.e(UploadSnapReceiptPresenter.equals, "Fail to remove receipt data");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Boolean, Unit> {
        public static final setMin INSTANCE = new setMin();

        setMin() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/loyalty/model/FileOcrReceiptLoyalty;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<code, Unit> {
        final /* synthetic */ OCRRequestModel $ocrRequestModel;
        final /* synthetic */ String $taskId;
        final /* synthetic */ UploadSnapReceiptPresenter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, OCRRequestModel oCRRequestModel, String str) {
            super(1);
            this.this$0 = uploadSnapReceiptPresenter;
            this.$ocrRequestModel = oCRRequestModel;
            this.$taskId = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((code) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull code code) {
            Intrinsics.checkNotNullParameter(code, "it");
            UploadSnapReceiptPresenter.getMin(this.this$0, this.$taskId, new MonitorMap.setMin(code.getOrderId(), code.getMerchantName(), code.getOrderAmount(), code.getTimestamp(), code.getRawText(), this.$ocrRequestModel.length, this.$ocrRequestModel.setMax), this.$ocrRequestModel, code.getFilePath());
        }
    }

    @Inject
    public UploadSnapReceiptPresenter(@NotNull UploadSnapReceiptContract.View view, @NotNull exceedThreshold exceedthreshold, @NotNull getThreshold getthreshold, @NotNull GriverMonitorAnalyticsConfigManager.AnonymousClass1 r5, @NotNull MonitorManager monitorManager) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(exceedthreshold, "submitSnapReceipt");
        Intrinsics.checkNotNullParameter(getthreshold, "saveReceiptData");
        Intrinsics.checkNotNullParameter(r5, "getReceiptData");
        Intrinsics.checkNotNullParameter(monitorManager, "removeReceiptData");
        this.length = view;
        this.getMin = exceedthreshold;
        this.getMax = getthreshold;
        this.setMax = r5;
        this.IsOverlapping = monitorManager;
    }

    public final void length(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        this.length.showProgress();
        this.setMax.execute(GriverMonitorAnalyticsConfigManager.AnonymousClass1.length.Companion.create(oCRRequestModel.setMax), new toIntRange(this, oCRRequestModel, str), new isInside(this, str));
    }

    public final void length(@NotNull String str, @NotNull OCRRequestModel oCRRequestModel, @NotNull OCRResultModel oCRResultModel) {
        Intrinsics.checkNotNullParameter(str, "taskId");
        Intrinsics.checkNotNullParameter(oCRRequestModel, "ocrRequestModel");
        Intrinsics.checkNotNullParameter(oCRResultModel, "ocrResultModel");
        this.length.showProgress();
        String max = setContentViewAfter.getMax(oCRResultModel.equals);
        if (TextUtils.isEmpty(max)) {
            this.length.dismissProgress();
            this.length.getMin(str, "009");
            updateActionSheetContent.e(equals, "fail convert snap receipt to base 64");
            return;
        }
        MonitorMap build = new MonitorMap.setMin(oCRResultModel.getMax, oCRResultModel.setMin, oCRResultModel.length, oCRResultModel.setMax, oCRResultModel.toIntRange, oCRRequestModel.length, oCRRequestModel.setMax).withReceipt(max).build();
        this.getMax.execute(getThreshold.setMin.Companion.create(new code(oCRResultModel.getMax, oCRResultModel.setMin, oCRResultModel.length, oCRResultModel.setMax, oCRResultModel.toIntRange, oCRRequestModel.length, oCRRequestModel.setMax, oCRResultModel.equals)), setMin.INSTANCE, getMin.INSTANCE);
        length(build, oCRRequestModel, str, oCRResultModel.equals);
    }

    private final void length(MonitorMap monitorMap, OCRRequestModel oCRRequestModel, String str, String str2) {
        this.length.getMin(str);
        this.getMin.execute(exceedThreshold.setMin.Companion.create(monitorMap, oCRRequestModel.getMax), new length(this, str, monitorMap, str2), new equals(this, str));
    }

    public final void setMax() {
        this.getMax.dispose();
        this.setMax.dispose();
        this.IsOverlapping.dispose();
        this.getMin.dispose();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/ocr/UploadSnapReceiptPresenter$Companion;", "", "()V", "TAG", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    static {
        String simpleName = UploadSnapReceiptPresenter.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "UploadSnapReceiptPresenter::class.java.simpleName");
        equals = simpleName;
    }

    public static final /* synthetic */ void getMin(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, String str, MonitorMap.setMin setmin, OCRRequestModel oCRRequestModel, String str2) {
        String max = setContentViewAfter.getMax(str2);
        if (TextUtils.isEmpty(max)) {
            uploadSnapReceiptPresenter.length.dismissProgress();
            uploadSnapReceiptPresenter.length.getMin(str, "009");
            updateActionSheetContent.e(equals, "fail convert snap receipt to base 64");
            return;
        }
        uploadSnapReceiptPresenter.length(setmin.withReceipt(max).build(), oCRRequestModel, str, str2);
    }

    public static final /* synthetic */ void setMax(UploadSnapReceiptPresenter uploadSnapReceiptPresenter, String str, threshold threshold) {
        UploadSnapReceiptContract.View view = uploadSnapReceiptPresenter.length;
        SubmitReceiptResultModel submitReceiptResultModel = r1;
        SubmitReceiptResultModel submitReceiptResultModel2 = new SubmitReceiptResultModel(threshold.getId(), threshold.getCreatedDate(), threshold.getModifiedDate(), threshold.getOrderId(), threshold.getMerchantId(), threshold.getMerchantName(), threshold.getLoyaltyMerchantName(), threshold.getOriginalMerchantName(), threshold.getOrderDate(), threshold.getOrderAmount(), threshold.getImageAssetUrl(), threshold.getUserLoyaltyId(), threshold.getReceiptStatus(), threshold.getReceiptResultType(), threshold.getReceiptApprovalStatus(), threshold.getPointGenerated(), threshold.getReasonId(), threshold.getReasonEn());
        view.setMin(str, submitReceiptResultModel);
    }
}
