package com.alibaba.ariver.app.api;

public enum EmbedType {
    NO(0),
    FULL(1),
    MINI(2);
    
    private int mType;

    private EmbedType(int i) {
        this.mType = i;
    }

    public final int getTypeValue() {
        return this.mType;
    }

    public final boolean isEmbedPage() {
        return this.mType != NO.getTypeValue();
    }

    public static EmbedType parse(int i) {
        if (i == 1) {
            return FULL;
        }
        if (i == 2) {
            return MINI;
        }
        return NO;
    }
}
