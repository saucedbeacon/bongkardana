package o;

import o.TitleBarRightButtonView;

final class BaseManifest implements RedDotDrawable {
    private final getServiceBeans getMin;

    /* renamed from: o.BaseManifest$1  reason: invalid class name */
    public interface AnonymousClass1 {
        TitleBarRightButtonView.AnonymousClass1<setProjectManifest> changePayMethod(String str, String str2, String str3);

        TitleBarRightButtonView.AnonymousClass1<RVMain> queryPayMethod(String str, String str2);
    }

    public BaseManifest(getServiceBeans getservicebeans) {
        this.getMin = getservicebeans;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((setProjectManifest) obj);
    }
}
