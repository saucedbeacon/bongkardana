package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/danah5/ocrreceipt/usecase/GetOcrPreprocessingConfig;", "", "ocrConfigRepository", "Lid/dana/appcontainer/plugin/ocrreceipt/repository/OcrConfigRepository;", "(Lid/dana/appcontainer/plugin/ocrreceipt/repository/OcrConfigRepository;)V", "invoke", "Lio/reactivex/Single;", "Lid/dana/danah5/ocrreceipt/usecase/model/OcrImagePreprocessingConfigModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getActionButton {
    private final shouldBeKeptAsChild ocrConfigRepository;

    @Inject
    public getActionButton(@NotNull shouldBeKeptAsChild shouldbekeptaschild) {
        Intrinsics.checkNotNullParameter(shouldbekeptaschild, "ocrConfigRepository");
        this.ocrConfigRepository = shouldbekeptaschild;
    }

    @NotNull
    public final TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<hasActionButtons> invoke() {
        return this.ocrConfigRepository.getImagePreprocessingConfig();
    }
}
