package o;

import java.util.Map;

public class dynamicDecryptDDp {
    private final String _appliedRule;
    private final Map<String, Object> _attributes;
    private final String _bucketingKey;
    private final Long _changeNumber;
    private final String _key;
    private Long _previousTime;
    private final String _split;
    private final long _time;
    private final String _treatment;

    public dynamicDecryptDDp(String str, String str2, String str3, String str4, long j, String str5, Long l, Map<String, Object> map) {
        this._key = str;
        this._bucketingKey = str2;
        this._split = str3;
        this._treatment = str4;
        this._time = j;
        this._appliedRule = str5;
        this._changeNumber = l;
        this._attributes = map;
    }

    public String key() {
        return this._key;
    }

    public String bucketingKey() {
        return this._bucketingKey;
    }

    public String split() {
        return this._split;
    }

    public String treatment() {
        return this._treatment;
    }

    public long time() {
        return this._time;
    }

    public String appliedRule() {
        return this._appliedRule;
    }

    public Long changeNumber() {
        return this._changeNumber;
    }

    public Map<String, Object> attributes() {
        return this._attributes;
    }

    public Long previousTime() {
        return this._previousTime;
    }

    public dynamicDecryptDDp withPreviousTime(Long l) {
        this._previousTime = l;
        return this;
    }
}
