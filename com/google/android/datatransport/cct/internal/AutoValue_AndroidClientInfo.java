package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;

final class AutoValue_AndroidClientInfo extends AndroidClientInfo {
    private final String applicationBuild;
    private final String country;
    private final String device;
    private final String fingerprint;
    private final String hardware;
    private final String locale;
    private final String manufacturer;
    private final String mccMnc;
    private final String model;
    private final String osBuild;
    private final String product;
    private final Integer sdkVersion;

    private AutoValue_AndroidClientInfo(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.sdkVersion = num;
        this.model = str;
        this.hardware = str2;
        this.device = str3;
        this.product = str4;
        this.osBuild = str5;
        this.manufacturer = str6;
        this.fingerprint = str7;
        this.locale = str8;
        this.country = str9;
        this.mccMnc = str10;
        this.applicationBuild = str11;
    }

    @Nullable
    public final Integer getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getHardware() {
        return this.hardware;
    }

    @Nullable
    public final String getDevice() {
        return this.device;
    }

    @Nullable
    public final String getProduct() {
        return this.product;
    }

    @Nullable
    public final String getOsBuild() {
        return this.osBuild;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @Nullable
    public final String getLocale() {
        return this.locale;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getMccMnc() {
        return this.mccMnc;
    }

    @Nullable
    public final String getApplicationBuild() {
        return this.applicationBuild;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", model=");
        sb.append(this.model);
        sb.append(", hardware=");
        sb.append(this.hardware);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", product=");
        sb.append(this.product);
        sb.append(", osBuild=");
        sb.append(this.osBuild);
        sb.append(", manufacturer=");
        sb.append(this.manufacturer);
        sb.append(", fingerprint=");
        sb.append(this.fingerprint);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", mccMnc=");
        sb.append(this.mccMnc);
        sb.append(", applicationBuild=");
        sb.append(this.applicationBuild);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AndroidClientInfo) {
            AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
            Integer num = this.sdkVersion;
            if (num != null ? num.equals(androidClientInfo.getSdkVersion()) : androidClientInfo.getSdkVersion() == null) {
                String str = this.model;
                if (str != null ? str.equals(androidClientInfo.getModel()) : androidClientInfo.getModel() == null) {
                    String str2 = this.hardware;
                    if (str2 != null ? str2.equals(androidClientInfo.getHardware()) : androidClientInfo.getHardware() == null) {
                        String str3 = this.device;
                        if (str3 != null ? str3.equals(androidClientInfo.getDevice()) : androidClientInfo.getDevice() == null) {
                            String str4 = this.product;
                            if (str4 != null ? str4.equals(androidClientInfo.getProduct()) : androidClientInfo.getProduct() == null) {
                                String str5 = this.osBuild;
                                if (str5 != null ? str5.equals(androidClientInfo.getOsBuild()) : androidClientInfo.getOsBuild() == null) {
                                    String str6 = this.manufacturer;
                                    if (str6 != null ? str6.equals(androidClientInfo.getManufacturer()) : androidClientInfo.getManufacturer() == null) {
                                        String str7 = this.fingerprint;
                                        if (str7 != null ? str7.equals(androidClientInfo.getFingerprint()) : androidClientInfo.getFingerprint() == null) {
                                            String str8 = this.locale;
                                            if (str8 != null ? str8.equals(androidClientInfo.getLocale()) : androidClientInfo.getLocale() == null) {
                                                String str9 = this.country;
                                                if (str9 != null ? str9.equals(androidClientInfo.getCountry()) : androidClientInfo.getCountry() == null) {
                                                    String str10 = this.mccMnc;
                                                    if (str10 != null ? str10.equals(androidClientInfo.getMccMnc()) : androidClientInfo.getMccMnc() == null) {
                                                        String str11 = this.applicationBuild;
                                                        return str11 != null ? str11.equals(androidClientInfo.getApplicationBuild()) : androidClientInfo.getApplicationBuild() == null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        Integer num = this.sdkVersion;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.model;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.hardware;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.device;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.product;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.osBuild;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.manufacturer;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.fingerprint;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.locale;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.country;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mccMnc;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.applicationBuild;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode11 ^ i;
    }

    static final class Builder extends AndroidClientInfo.Builder {
        private String applicationBuild;
        private String country;
        private String device;
        private String fingerprint;
        private String hardware;
        private String locale;
        private String manufacturer;
        private String mccMnc;
        private String model;
        private String osBuild;
        private String product;
        private Integer sdkVersion;

        Builder() {
        }

        public final AndroidClientInfo.Builder setSdkVersion(@Nullable Integer num) {
            this.sdkVersion = num;
            return this;
        }

        public final AndroidClientInfo.Builder setModel(@Nullable String str) {
            this.model = str;
            return this;
        }

        public final AndroidClientInfo.Builder setHardware(@Nullable String str) {
            this.hardware = str;
            return this;
        }

        public final AndroidClientInfo.Builder setDevice(@Nullable String str) {
            this.device = str;
            return this;
        }

        public final AndroidClientInfo.Builder setProduct(@Nullable String str) {
            this.product = str;
            return this;
        }

        public final AndroidClientInfo.Builder setOsBuild(@Nullable String str) {
            this.osBuild = str;
            return this;
        }

        public final AndroidClientInfo.Builder setManufacturer(@Nullable String str) {
            this.manufacturer = str;
            return this;
        }

        public final AndroidClientInfo.Builder setFingerprint(@Nullable String str) {
            this.fingerprint = str;
            return this;
        }

        public final AndroidClientInfo.Builder setLocale(@Nullable String str) {
            this.locale = str;
            return this;
        }

        public final AndroidClientInfo.Builder setCountry(@Nullable String str) {
            this.country = str;
            return this;
        }

        public final AndroidClientInfo.Builder setMccMnc(@Nullable String str) {
            this.mccMnc = str;
            return this;
        }

        public final AndroidClientInfo.Builder setApplicationBuild(@Nullable String str) {
            this.applicationBuild = str;
            return this;
        }

        public final AndroidClientInfo build() {
            return new AutoValue_AndroidClientInfo(this.sdkVersion, this.model, this.hardware, this.device, this.product, this.osBuild, this.manufacturer, this.fingerprint, this.locale, this.country, this.mccMnc, this.applicationBuild);
        }
    }
}
