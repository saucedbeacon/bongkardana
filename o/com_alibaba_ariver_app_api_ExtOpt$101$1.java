package o;

import o.c;

final class com_alibaba_ariver_app_api_ExtOpt$101$1 implements RedDotDrawable {
    private final c.AnonymousClass1 getMax;
    private final String setMax;
    private final Integer setMin;

    public com_alibaba_ariver_app_api_ExtOpt$101$1(c.AnonymousClass1 r1, Integer num, String str) {
        this.getMax = r1;
        this.setMin = num;
        this.setMax = str;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$invokeGetBokuSilentOtp$2(this.setMin, this.setMax, (getAppenderManager) obj);
    }
}
