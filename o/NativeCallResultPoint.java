package o;

import android.graphics.Bitmap;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/data/ocr/repository/OCREntityRepository;", "Lid/dana/domain/ocr/OCRRepository;", "ocrEntityDataFactory", "Lid/dana/data/ocr/repository/source/OCREntityDataFactory;", "(Lid/dana/data/ocr/repository/source/OCREntityDataFactory;)V", "firebaseOcrData", "Lid/dana/data/ocr/repository/source/OCREntityData;", "getFirebaseOcrData", "()Lid/dana/data/ocr/repository/source/OCREntityData;", "firebaseOcrData$delegate", "Lkotlin/Lazy;", "processReceiptOcr", "Lio/reactivex/Observable;", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "sourceOcr", "", "rules", "merchantNameAlias", "", "image", "Landroid/graphics/Bitmap;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NativeCallResultPoint implements MetaDataUtils {
    private final Lazy firebaseOcrData$delegate = LazyKt.lazy(new setMin(this));
    /* access modifiers changed from: private */
    public final PageBackInterceptPoint ocrEntityDataFactory;

    private final NativeCallOnInvokePoint getFirebaseOcrData() {
        return (NativeCallOnInvokePoint) this.firebaseOcrData$delegate.getValue();
    }

    @Inject
    public NativeCallResultPoint(@NotNull PageBackInterceptPoint pageBackInterceptPoint) {
        Intrinsics.checkNotNullParameter(pageBackInterceptPoint, "ocrEntityDataFactory");
        this.ocrEntityDataFactory = pageBackInterceptPoint;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/data/ocr/repository/source/OCREntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<NativeCallOnInvokePoint> {
        final /* synthetic */ NativeCallResultPoint this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(NativeCallResultPoint nativeCallResultPoint) {
            super(0);
            this.this$0 = nativeCallResultPoint;
        }

        @NotNull
        public final NativeCallOnInvokePoint invoke() {
            return this.this$0.ocrEntityDataFactory.createData("FIREBASE_VISION");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<NavigationBarCompat> processReceiptOcr(@NotNull String str, @NotNull String str2, @NotNull List<String> list, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(str, "sourceOcr");
        Intrinsics.checkNotNullParameter(str2, "rules");
        Intrinsics.checkNotNullParameter(list, "merchantNameAlias");
        Intrinsics.checkNotNullParameter(bitmap, H5ResourceHandlerUtil.IMAGE);
        TitleBarRightButtonView.AnonymousClass1<NavigationBarCompat> receiptInfoModel = WorkerStore.toReceiptInfoModel(getFirebaseOcrData().getOcrReceiptResponse(new webType(str2, list, bitmap)));
        Intrinsics.checkNotNullExpressionValue(receiptInfoModel, "firebaseOcrData.getOcrRe…    .toReceiptInfoModel()");
        return receiptInfoModel;
    }
}
