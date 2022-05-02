package o;

import o.AUNoticeDialog;
import o.b;

public final class BaseMessagePopItemView implements getAdapterPosition<setTitleTextSize> {
    private final b.C0007b<AppStatus> getMax;
    private final b.C0007b<AUNoticeDialog.OnClickNegativeListener.setMax> length;

    private BaseMessagePopItemView(b.C0007b<AUNoticeDialog.OnClickNegativeListener.setMax> bVar, b.C0007b<AppStatus> bVar2) {
        this.length = bVar;
        this.getMax = bVar2;
    }

    public static BaseMessagePopItemView getMin(b.C0007b<AUNoticeDialog.OnClickNegativeListener.setMax> bVar, b.C0007b<AppStatus> bVar2) {
        return new BaseMessagePopItemView(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new setTitleTextSize(this.length.get(), this.getMax.get());
    }
}
