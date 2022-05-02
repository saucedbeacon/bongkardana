package io.split.android.client.dtos;

import com.google.gson.annotations.SerializedName;
import io.split.android.client.storage.InBytesSizable;
import o.dynamicDecryptDDp;

public class KeyImpression implements InBytesSizable, Identifiable {
    static final String FIELD_BUCKETING_KEY = "b";
    static final String FIELD_CHANGE_NUMBER = "c";
    static final String FIELD_KEY_NAME = "k";
    static final String FIELD_LABEL = "r";
    static final String FIELD_PREVIOUS_TIME = "pt";
    static final String FIELD_TIME = "m";
    static final String FIELD_TREATMENT = "t";
    @SerializedName("b")
    public String bucketingKey;
    @SerializedName("c")
    public Long changeNumber;
    public transient String feature;
    @SerializedName("k")
    public String keyName;
    @SerializedName("r")
    public String label;
    @SerializedName("pt")
    public Long previousTime;
    public transient long storageId;
    @SerializedName("m")
    public long time;
    @SerializedName("t")
    public String treatment;

    public long getSizeInBytes() {
        return 150;
    }

    public KeyImpression() {
    }

    public KeyImpression(dynamicDecryptDDp dynamicdecryptddp) {
        this.feature = dynamicdecryptddp.split();
        this.keyName = dynamicdecryptddp.key();
        this.bucketingKey = dynamicdecryptddp.bucketingKey();
        this.label = dynamicdecryptddp.appliedRule();
        this.treatment = dynamicdecryptddp.treatment();
        this.time = dynamicdecryptddp.time();
        this.changeNumber = dynamicdecryptddp.changeNumber();
        this.previousTime = dynamicdecryptddp.previousTime();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyImpression keyImpression = (KeyImpression) obj;
        if (this.time != keyImpression.time) {
            return false;
        }
        String str = this.feature;
        if (str == null ? keyImpression.feature != null : !str.equals(keyImpression.feature)) {
            return false;
        }
        if (!this.keyName.equals(keyImpression.keyName) || !this.treatment.equals(keyImpression.treatment)) {
            return false;
        }
        if (this.bucketingKey == null) {
            return keyImpression.bucketingKey == null;
        }
        if (!this.previousTime.equals(keyImpression.previousTime)) {
            return false;
        }
        return this.bucketingKey.equals(keyImpression.bucketingKey);
    }

    public int hashCode() {
        String str = this.feature;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.keyName.hashCode()) * 31;
        String str2 = this.bucketingKey;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.time;
        return ((((((hashCode + i) * 31) + this.treatment.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.previousTime.hashCode();
    }

    public static KeyImpression fromImpression(dynamicDecryptDDp dynamicdecryptddp) {
        KeyImpression keyImpression = new KeyImpression();
        keyImpression.feature = dynamicdecryptddp.split();
        keyImpression.keyName = dynamicdecryptddp.key();
        keyImpression.bucketingKey = dynamicdecryptddp.bucketingKey();
        keyImpression.time = dynamicdecryptddp.time();
        keyImpression.changeNumber = dynamicdecryptddp.changeNumber();
        keyImpression.treatment = dynamicdecryptddp.treatment();
        keyImpression.label = dynamicdecryptddp.appliedRule();
        keyImpression.previousTime = dynamicdecryptddp.previousTime();
        return keyImpression;
    }

    public long getId() {
        return this.storageId;
    }
}
