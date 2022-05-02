package com.google.android.gms.internal.vision;

public enum zzdy implements zzgb {
    CONTACT_INFO(1),
    zzqw(2),
    ISBN(3),
    zzqy(4),
    PRODUCT(5),
    zzra(6),
    zzrb(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12);
    
    private static final zzgc<zzdy> zzdv = null;
    private final int value;

    public final int zzr() {
        return this.value;
    }

    public static zzdy zzw(int i) {
        switch (i) {
            case 1:
                return CONTACT_INFO;
            case 2:
                return zzqw;
            case 3:
                return ISBN;
            case 4:
                return zzqy;
            case 5:
                return PRODUCT;
            case 6:
                return zzra;
            case 7:
                return zzrb;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            default:
                return null;
        }
    }

    public static zzgd zzah() {
        return zzea.zzhl;
    }

    private zzdy(int i) {
        this.value = i;
    }

    static {
        zzdv = new zzdz();
    }
}
