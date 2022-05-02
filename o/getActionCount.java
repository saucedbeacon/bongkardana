package o;

import o.TitleBarRightButtonView;

final class getActionCount implements RedDotDrawable {
    private final TitleBarRightButtonView.AnonymousClass1 setMax;

    public getActionCount(TitleBarRightButtonView.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final Object apply(Object obj) {
        return DefaultExtensionRegistry.lambda$getKey$2(this.setMax, (String) obj);
    }
}
