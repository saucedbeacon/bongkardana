package com.alipay.multimedia.adjuster.api.data;

import android.content.Context;
import android.net.Uri;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class APMInsertReq {
    private final String mBizType;
    private final Context mContext;
    private final String mDescription;
    private final String mDisplayName;
    private final String mMimeType;
    private final Object mSourceData;
    private final Uri mUri;
    private final String savePrimaryDir;
    private final String saveSecondaryDir;

    private APMInsertReq(Builder builder) {
        this.mUri = builder.mUri;
        this.mContext = builder.mContext;
        this.mMimeType = builder.mMimeType;
        this.mDisplayName = builder.mDisplayName;
        this.mDescription = builder.mDescription;
        this.mSourceData = builder.mSourceData;
        this.mBizType = builder.mBizType;
        this.savePrimaryDir = builder.savePrimaryDir;
        this.saveSecondaryDir = builder.saveSecondaryDir;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getMimeType() {
        return this.mMimeType;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Object getSourceData() {
        return this.mSourceData;
    }

    public String getBizType() {
        return this.mBizType;
    }

    public String getSavePrimaryDir() {
        return this.savePrimaryDir;
    }

    public String getSaveSecondaryDir() {
        return this.saveSecondaryDir;
    }

    public static class Builder {
        /* access modifiers changed from: private */
        public String mBizType = null;
        /* access modifiers changed from: private */
        public Context mContext = null;
        /* access modifiers changed from: private */
        public String mDescription = "";
        /* access modifiers changed from: private */
        public String mDisplayName = "";
        /* access modifiers changed from: private */
        public String mMimeType = "";
        /* access modifiers changed from: private */
        public Object mSourceData = null;
        /* access modifiers changed from: private */
        public Uri mUri = null;
        /* access modifiers changed from: private */
        public String savePrimaryDir;
        /* access modifiers changed from: private */
        public String saveSecondaryDir;

        public Builder(Uri uri, Object obj, String str) {
            this.mUri = uri;
            this.mSourceData = obj;
            this.mDisplayName = str;
        }

        public Builder mimeType(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(6574341, oncanceled);
                onCancelLoad.getMin(6574341, oncanceled);
            }
            this.mMimeType = str;
            return this;
        }

        public Builder description(String str) {
            this.mDescription = str;
            return this;
        }

        public Builder context(Context context) {
            this.mContext = context;
            return this;
        }

        public Builder bizType(String str) {
            this.mBizType = str;
            return this;
        }

        public Builder setSavePrimaryDir(String str) {
            this.savePrimaryDir = str;
            return this;
        }

        public Builder setSaveSecondaryDir(String str) {
            this.saveSecondaryDir = str;
            return this;
        }

        public APMInsertReq build() {
            return new APMInsertReq(this);
        }
    }
}
