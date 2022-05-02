package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.google.gson.Gson;
import id.dana.data.foundation.RpcException;
import id.dana.ocr.constant.ErrorOcr;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class getPositiveString {
    private static final String CHARSET = "UTF-8";
    private static final String TAG = "JsonUtil";
    private static int getMax = 1;
    private static int setMin;

    public static <T> T parseObject(String str, TypeReference<T> typeReference) throws RpcException {
        try {
            return JSON.parseObject(str, typeReference, new Feature[0]);
        } catch (Exception e) {
            updateActionSheetContent.e(TAG, e.getMessage());
            throw new RpcException(ErrorOcr.FILE_NOT_FOUND);
        }
    }

    public static JSONObject parseObject(Object obj) {
        try {
            return new JSONObject(new Gson().toJson(obj));
        } catch (Exception unused) {
            updateActionSheetContent.e(TAG, "Fail converting to JSON Array");
            return null;
        }
    }

    public static JSONArray parseArray(String str) {
        try {
            return (JSONArray) new Gson().fromJson(str, JSONArray.class);
        } catch (Exception unused) {
            updateActionSheetContent.e(TAG, "Fail converting to JSON Object");
            return null;
        }
    }

    public static com.alibaba.fastjson.JSONObject parseObject(JSONObject jSONObject) {
        if (jSONObject != null) {
            return JSON.parseObject(jSONObject.toString());
        }
        return null;
    }

    public static JSONObject parseObject(com.alibaba.fastjson.JSONObject jSONObject) throws JSONException {
        return new JSONObject(jSONObject.toJSONString());
    }

    public static com.alibaba.fastjson.JSONArray parseArray(JSONArray jSONArray) {
        return JSON.parseArray(jSONArray.toString());
    }

    public static String toJSONString(Object obj) {
        return JSON.toJSONString(obj);
    }

    @Nullable
    public static com.alibaba.fastjson.JSONArray getJSONArraySafe(@NonNull com.alibaba.fastjson.JSONObject jSONObject, @NonNull String str) {
        try {
            return jSONObject.getJSONArray(str);
        } catch (Exception unused) {
            updateActionSheetContent.e(TAG, "Take it easy, can not get JSONArray of key: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Nullable
    public static com.alibaba.fastjson.JSONObject getJSONObjectSafe(@NonNull com.alibaba.fastjson.JSONObject jSONObject, @NonNull String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (Exception unused) {
            updateActionSheetContent.e(TAG, "Take it easy, can not get JSONObject of key: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Nullable
    public static JSONObject getJSONObjectSafe(@NonNull JSONObject jSONObject, @NonNull String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (Exception unused) {
            updateActionSheetContent.e(TAG, "Take it easy, can not get JSONObject of key: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static String loadJSONFromAsset(Context context, String str) {
        try {
            AssetManager assets = context.getAssets();
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = assets;
            String readJsonFromInputStream = readJsonFromInputStream((InputStream) ((Class) upFrom.setMax(View.combineMeasuredStates(0, 0) + 19, TextUtils.indexOf("", '0') + 1, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 56348))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr));
            int i = setMin + 99;
            getMax = i % 128;
            int i2 = i % 2;
            int i3 = getMax + 11;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            return readJsonFromInputStream;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static String loadJSONFromInternalStorage(Context context, String str) {
        try {
            return readJsonFromInputStream(context.openFileInput(str));
        } catch (IOException unused) {
            return null;
        }
    }

    private static String readJsonFromInputStream(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    inputStream.close();
                    return sb.toString();
                }
            } catch (IOException unused) {
                return null;
            }
        }
    }
}
