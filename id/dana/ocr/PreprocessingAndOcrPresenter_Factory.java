package id.dana.ocr;

import id.dana.ocr.PreprocessingAndOcrContract;
import o.IRedDotManager;
import o.MonitorUtils;
import o.StaggeredGridLayoutManager;
import o.b;
import o.getActionButton;
import o.getAdapterPosition;
import o.getScheme;

public final class PreprocessingAndOcrPresenter_Factory implements getAdapterPosition<PreprocessingAndOcrPresenter> {
    private final b.C0007b<getActionButton> equals;
    private final b.C0007b<IRedDotManager> getMax;
    private final b.C0007b<MonitorUtils> getMin;
    private final b.C0007b<StaggeredGridLayoutManager> length;
    private final b.C0007b<getScheme> setMax;
    private final b.C0007b<PreprocessingAndOcrContract.View> setMin;

    public final /* synthetic */ Object get() {
        return new PreprocessingAndOcrPresenter(this.setMin.get(), this.setMax.get(), this.getMax.get(), this.getMin.get(), this.length.get(), this.equals.get());
    }
}
