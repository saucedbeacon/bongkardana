package com.alipay.zoloz.toyger;

public interface ToygerState {
    @Deprecated
    int brightness();

    @Deprecated
    int distance();

    int getMessageCode();

    float getProgress();

    int getStaticMessage();

    @Deprecated
    boolean hasTarget();

    @Deprecated
    boolean isGoodQuality();

    @Deprecated
    boolean isInCenter();

    @Deprecated
    boolean isMoving();
}
