package o;

import android.graphics.Bitmap;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/ocr/interactor/GetOcrFromReceipt;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/ocr/model/ReceiptInfoModel;", "Lid/dana/domain/ocr/interactor/GetOcrFromReceipt$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "ocrRepository", "Lid/dana/domain/ocr/OCRRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/ocr/OCRRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class MonitorUtils extends parseFailed<NavigationBarCompat, setMax> {
    private final MetaDataUtils ocrRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public MonitorUtils(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull MetaDataUtils metaDataUtils) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(metaDataUtils, "ocrRepository");
        this.ocrRepository = metaDataUtils;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<NavigationBarCompat> buildUseCaseObservable(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.ocrRepository.processReceiptOcr("FIREBASE_VISION", setmax.getRules(), setmax.getMerchantNameAlias(), setmax.getImage());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lid/dana/domain/ocr/interactor/GetOcrFromReceipt$Params;", "", "rules", "", "merchantNameAlias", "", "image", "Landroid/graphics/Bitmap;", "(Ljava/lang/String;Ljava/util/List;Landroid/graphics/Bitmap;)V", "getImage", "()Landroid/graphics/Bitmap;", "getMerchantNameAlias", "()Ljava/util/List;", "getRules", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final Bitmap image;
        @NotNull
        private final List<String> merchantNameAlias;
        @NotNull
        private final String rules;

        public setMax(@NotNull String str, @NotNull List<String> list, @NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(str, "rules");
            Intrinsics.checkNotNullParameter(list, "merchantNameAlias");
            Intrinsics.checkNotNullParameter(bitmap, H5ResourceHandlerUtil.IMAGE);
            this.rules = str;
            this.merchantNameAlias = list;
            this.image = bitmap;
        }

        @NotNull
        public final Bitmap getImage() {
            return this.image;
        }

        @NotNull
        public final List<String> getMerchantNameAlias() {
            return this.merchantNameAlias;
        }

        @NotNull
        public final String getRules() {
            return this.rules;
        }
    }
}
