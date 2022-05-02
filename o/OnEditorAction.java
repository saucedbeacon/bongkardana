package o;

import o.BindView;
import o.b;

public final class OnEditorAction implements getAdapterPosition<OnFocusChange> {
    private final b.C0007b<DataProviderException> getMax;
    private final b.C0007b<BindView.setMax> setMin;

    private OnEditorAction(b.C0007b<BindView.setMax> bVar, b.C0007b<DataProviderException> bVar2) {
        this.setMin = bVar;
        this.getMax = bVar2;
    }

    public static OnEditorAction getMin(b.C0007b<BindView.setMax> bVar, b.C0007b<DataProviderException> bVar2) {
        return new OnEditorAction(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new OnFocusChange(this.setMin.get(), this.getMax.get());
    }
}
