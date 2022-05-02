package com.alipay.multimedia.adjuster.api.data;

import android.content.Context;

public class APMSaveReq {
    private final String mBizType;
    private final Context mContext;
    private final String mSavePth;
    private final String mUri;

    private APMSaveReq(Builder builder) {
        this.mUri = builder.mUri;
        this.mContext = builder.mContext;
        this.mBizType = builder.mBizType;
        this.mSavePth = builder.mSavePth;
    }

    public String getUri() {
        return this.mUri;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getBizType() {
        return this.mBizType;
    }

    public String getSavePth() {
        return this.mSavePth;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public String mBizType = null;
        /* access modifiers changed from: private */
        public Context mContext = null;
        /* access modifiers changed from: private */
        public String mSavePth;
        /* access modifiers changed from: private */
        public String mUri = null;

        public Builder(String str, String str2) {
            this.mUri = str;
            this.mBizType = str2;
        }

        public Builder context(Context context) {
            this.mContext = context;
            return this;
        }

        public Builder bizType(String str) {
            this.mBizType = str;
            return this;
        }

        public Builder savePath(String str) {
            this.mSavePth = str;
            return this;
        }

        public APMSaveReq build() {
            return new APMSaveReq(this);
        }
    }
}
