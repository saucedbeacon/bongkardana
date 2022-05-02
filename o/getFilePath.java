package o;

import android.content.SharedPreferences;
import android.text.TextUtils;
import o.RVResourceUtils;

public class getFilePath implements onSingleFailed {
    private final RVResourceUtils.getMax builder;
    private SharedPreferences sharedPreferences;

    public getFilePath(RVResourceUtils.getMax getmax) {
        this.builder = getmax;
        if (TextUtils.isEmpty(getmax.password)) {
            this.sharedPreferences = getmax.context.getSharedPreferences(getmax.preferenceGroup, 0);
        } else {
            this.sharedPreferences = new dispatchPendingImportantForAccessibilityChanges(getmax.context, getmax.password, getmax.preferenceGroup);
        }
    }

    public void saveData(String str, String str2) {
        this.sharedPreferences.edit().putString(str, str2).apply();
    }

    public String getString(String str) {
        return this.sharedPreferences.getString(str, (String) null);
    }

    public void saveData(String str, Integer num) {
        this.sharedPreferences.edit().putInt(str, num.intValue()).apply();
    }

    public Integer getInteger(String str) {
        return Integer.valueOf(this.sharedPreferences.getInt(str, -1));
    }

    public void saveData(String str, Long l) {
        this.sharedPreferences.edit().putLong(str, l.longValue()).apply();
    }

    public Long getLong(String str) {
        return Long.valueOf(this.sharedPreferences.getLong(str, -1));
    }

    public void saveData(String str, Float f) {
        this.sharedPreferences.edit().putFloat(str, f.floatValue()).apply();
    }

    public Float getFloat(String str) {
        return Float.valueOf(this.sharedPreferences.getFloat(str, -1.0f));
    }

    public void saveData(String str, Boolean bool) {
        this.sharedPreferences.edit().putBoolean(str, bool.booleanValue()).apply();
    }

    public Boolean getBoolean(String str) {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(str, false));
    }

    public Boolean getBoolean(String str, boolean z) {
        return Boolean.valueOf(this.sharedPreferences.getBoolean(str, z));
    }

    public <T> void saveData(String str, T t) {
        saveData(str, this.builder.serializerFacade.serialize(t));
    }

    public <T> T getObject(String str, Class<T> cls) {
        return this.builder.serializerFacade.deserialize(getString(str), cls);
    }

    public void clearData(String str) {
        this.sharedPreferences.edit().remove(str).apply();
    }

    public void clearAllData() {
        this.sharedPreferences.edit().clear().apply();
    }
}
