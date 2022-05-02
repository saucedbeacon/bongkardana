package o;

public final class getDynamicDataStoreComp {
    private final Long _changeNumber;
    private final String _configurations;
    private final String _label;
    private final String _treatment;

    public getDynamicDataStoreComp(String str, String str2) {
        this(str, str2, (Long) null);
    }

    private getDynamicDataStoreComp(String str, String str2, Long l) {
        this(str, str2, l, (String) null);
    }

    public getDynamicDataStoreComp(String str, String str2, Long l, String str3) {
        this._treatment = str;
        this._label = str2;
        this._changeNumber = l;
        this._configurations = str3;
    }

    public final String getTreatment() {
        return this._treatment;
    }

    public final String getLabel() {
        return this._label;
    }

    public final Long getChangeNumber() {
        return this._changeNumber;
    }

    public final String getConfigurations() {
        return this._configurations;
    }
}
