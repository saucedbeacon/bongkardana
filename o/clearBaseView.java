package o;

import o.ColorSchemeModelTemplate;
import o.TitleBarRightButtonView;

final class clearBaseView implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final ColorSchemeModelTemplate.AnonymousClass1 length;

    public clearBaseView(ColorSchemeModelTemplate.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r2) {
        this.length.setEmitter(r2);
    }
}
