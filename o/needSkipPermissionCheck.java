package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecException;
import o.RVResourceUtils;

public class needSkipPermissionCheck implements onSingleFailed {
    private static final String TAG = "SGStorage";
    private RVResourceUtils.getMax builder;
    private BackKeyDownPoint securityGuardFacade;
    private SharedPreferences sharedPreferences;

    public needSkipPermissionCheck(RVResourceUtils.getMax getmax) {
        this.builder = getmax;
        this.securityGuardFacade = new BackKeyDownPoint(getmax.context);
        Context context = getmax.context;
        StringBuilder sb = new StringBuilder();
        sb.append(getmax.preferenceGroup);
        sb.append(TAG);
        this.sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
    }

    public void saveData(String str, String str2) {
        try {
            this.sharedPreferences.edit().putString(getKeyWithPassword(str), getEncryptData(str2)).apply();
        } catch (Exception unused) {
        }
    }

    public String getString(String str) {
        return getDecrptData(this.sharedPreferences.getString(getKeyWithPassword(str), (String) null));
    }

    public void saveData(String str, Integer num) {
        saveData(str, String.valueOf(num));
    }

    public Integer getInteger(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(getString(str)));
        } catch (Exception unused) {
            return 0;
        }
    }

    public void saveData(String str, Long l) {
        saveData(str, String.valueOf(l));
    }

    public Long getLong(String str) {
        try {
            return Long.valueOf(Long.parseLong(getString(str)));
        } catch (Exception unused) {
            return 0L;
        }
    }

    public void saveData(String str, Float f) {
        saveData(str, String.valueOf(f));
    }

    public Float getFloat(String str) {
        try {
            return Float.valueOf(Float.parseFloat(getString(str)));
        } catch (Exception unused) {
            return Float.valueOf(0.0f);
        }
    }

    public void saveData(String str, Boolean bool) {
        saveData(str, String.valueOf(bool));
    }

    public Boolean getBoolean(String str) {
        try {
            return Boolean.valueOf(Boolean.parseBoolean(getString(str)));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public Boolean getBoolean(String str, boolean z) {
        try {
            return Boolean.valueOf(Boolean.parseBoolean(getString(str)));
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public <T> void saveData(String str, T t) {
        saveData(str, this.builder.serializerFacade.serialize(t));
    }

    public <T> T getObject(String str, Class<T> cls) {
        return this.builder.serializerFacade.deserialize(getString(str), cls);
    }

    public void clearData(String str) {
        this.sharedPreferences.edit().remove(getKeyWithPassword(str)).apply();
    }

    public void clearAllData() {
        this.sharedPreferences.edit().clear().apply();
    }

    private String getDecrptData(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.securityGuardFacade.decryptString(str);
        } catch (SecException unused) {
            return null;
        }
    }

    private String getKeyWithPassword(String str) {
        RVResourceUtils.getMax getmax = this.builder;
        if (getmax == null || TextUtils.isEmpty(getmax.password)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.builder.password);
        return sb.toString();
    }

    private String getEncryptData(String str) {
        try {
            return this.securityGuardFacade.encryptString(str);
        } catch (SecException unused) {
            return "";
        }
    }
}
