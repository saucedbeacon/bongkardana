package o;

import o.TitleBarRightButtonView;

final class findExtensions implements RedDotDrawable {
    private final TitleBarRightButtonView.AnonymousClass1 getMin;
    private final DefaultExtensionRegistry setMin;

    public findExtensions(DefaultExtensionRegistry defaultExtensionRegistry, TitleBarRightButtonView.AnonymousClass1 r2) {
        this.setMin = defaultExtensionRegistry;
        this.getMin = r2;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getKey$4(this.getMin, (Throwable) obj);
    }
}
