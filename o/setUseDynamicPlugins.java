package o;

import o.TitleBarRightButtonView;

final class setUseDynamicPlugins implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
    private final getAppenderManager length;
    private final getPageLaunchParams setMax;
    private final int setMin;

    public setUseDynamicPlugins(getPageLaunchParams getpagelaunchparams, getAppenderManager getappendermanager, int i) {
        this.setMax = getpagelaunchparams;
        this.length = getappendermanager;
        this.setMin = i;
    }

    public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r4) {
        this.setMax.lambda$downloadConfig$0(this.length, this.setMin, r4);
    }
}
