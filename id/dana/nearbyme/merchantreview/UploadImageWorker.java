package id.dana.nearbyme.merchantreview;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.io.File;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.PrepareException;
import o.forThisDevice;
import o.getMac;
import o.updateAppearance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0014J\u0014\u0010\u001c\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d*\u00020\u001fH\u0002J\f\u0010 \u001a\u00020\u001f*\u00020\u0002H\u0002R\u0014\u0010\b\u001a\u00020\tXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lid/dana/nearbyme/merchantreview/UploadImageWorker;", "Lid/dana/nearbyme/merchantreview/MerchantReviewWorker;", "", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "maxRetry", "", "getMaxRetry", "()I", "uploadImage", "Lid/dana/domain/nearbyme/interactor/merchantreview/UploadMerchantReviewImage;", "getUploadImage", "()Lid/dana/domain/nearbyme/interactor/merchantreview/UploadMerchantReviewImage;", "setUploadImage", "(Lid/dana/domain/nearbyme/interactor/merchantreview/UploadMerchantReviewImage;)V", "execute", "Lid/dana/domain/social/Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "injectDependency", "", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "onSuccess", "Landroidx/work/ListenableWorker$Result;", "data", "toImageFile", "Ljava/io/File;", "kotlin.jvm.PlatformType", "Landroidx/work/Data;", "toOutputData", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class UploadImageWorker extends MerchantReviewWorker<String> {
    @NotNull
    public static final length getMin = new length((byte) 0);
    private final int getMax = 1;
    @Inject
    public getMac uploadImage;

    public final /* synthetic */ ListenableWorker.setMax getMax(Object obj) {
        String str = (String) obj;
        Intrinsics.checkNotNullParameter(str, "data");
        updateAppearance.getMin getmin = new updateAppearance.getMin();
        getmin.length.put("imageUrl", str);
        updateAppearance updateappearance = new updateAppearance((Map<String, ?>) getmin.length);
        updateAppearance.setMax(updateappearance);
        Intrinsics.checkNotNullExpressionValue(updateappearance, "Data.Builder().putString…_IMAGE_URL, this).build()");
        ListenableWorker.setMax min = ListenableWorker.setMax.setMin(updateappearance);
        Intrinsics.checkNotNullExpressionValue(min, "Result.success(data.toOutputData())");
        return min;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UploadImageWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(workerParameters, "params");
    }

    /* access modifiers changed from: protected */
    public final int setMax() {
        return this.getMax;
    }

    /* access modifiers changed from: protected */
    public final void setMax(@NotNull PrepareException.AnonymousClass1 r2) {
        Intrinsics.checkNotNullParameter(r2, "applicationComponent");
        r2.length(this);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object length(@NotNull Continuation<? super forThisDevice<String>> continuation) {
        String str;
        getMac getmac = this.uploadImage;
        if (getmac == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uploadImage");
        }
        updateAppearance inputData = getInputData();
        Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
        Context applicationContext = getApplicationContext();
        Object obj = inputData.setMin.get("imageFile");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        File max = ConfirmPopup.AnonymousClass2.setMax(applicationContext, str);
        Intrinsics.checkNotNullExpressionValue(max, "inputData.toImageFile()");
        return getmac.invoke(max, continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002J\f\u0010\n\u001a\u00020\u000b*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/nearbyme/merchantreview/UploadImageWorker$Companion;", "", "()V", "KEY_IMAGE_FILE", "", "KEY_IMAGE_URL", "invoke", "", "Landroidx/work/OneTimeWorkRequest;", "imageUris", "toInputData", "Landroidx/work/Data;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
