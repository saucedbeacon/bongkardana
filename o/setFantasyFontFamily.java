package o;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\u001aP\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u000326\u0010\u0004\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0005H\bø\u0001\u0000\u001a\u0010\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u0003\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0010\u001a\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\f*\u00020\u0003\u001a\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0003\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f*\u00020\u0003\u001a/\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002H\u00190\u0017\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\b\u001a/\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002H\u00190\u0017\"\u0006\b\u0000\u0010\u0019\u0018\u0001*\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\b\u001a*\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u0001*\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\b¢\u0006\u0002\u0010\u001e\u001a*\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u0001*\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\b¢\u0006\u0002\u0010\u001f\u001a*\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\u0006\b\u0000\u0010\u001c\u0018\u0001*\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\b¢\u0006\u0002\u0010 \u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\f*\u00020\u0018\u001a\u0010\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"*\u00020\u0003\u0002\u0007\n\u0005\b20\u0001¨\u0006#"}, d2 = {"forEach", "", "E", "Lorg/json/JSONArray;", "action", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "element", "toBooleanList", "", "", "toBundle", "Landroid/os/Bundle;", "Lorg/json/JSONObject;", "toDoubleList", "", "toIntList", "toLongList", "", "toMap", "", "", "V", "key", "toSerializedJson", "T", "Lcom/google/gson/JsonObject;", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Object;", "toStringList", "", "domain_release"}, k = 2, mv = {1, 4, 2})
public final class setFantasyFontFamily {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length extends TypeReference<Map<String, ? extends V>> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$1", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends TypeReference<Map<String, ? extends V>> {
    }

    public static final /* synthetic */ <E> void forEach(JSONArray jSONArray, Function2<? super Integer, ? super E, Unit> function2) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$forEach");
        Intrinsics.checkNotNullParameter(function2, "action");
        int length2 = jSONArray.length();
        for (int i = 0; i < length2; i++) {
            Integer valueOf = Integer.valueOf(i);
            Object obj = jSONArray.get(i);
            Intrinsics.reifiedOperationMarker(1, "E");
            function2.invoke(valueOf, obj);
        }
    }

    @NotNull
    public static final List<String> toStringList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "$this$toStringList");
        try {
            return toStringList(new JSONArray(str));
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final List<String> toStringList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toStringList");
        List arrayList = new ArrayList();
        int length2 = jSONArray.length();
        for (int i = 0; i < length2; i++) {
            String string = jSONArray.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(index)");
            arrayList.add(string);
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (!Intrinsics.areEqual((Object) (String) next, (Object) "null")) {
                arrayList2.add(next);
            }
        }
        return CollectionsKt.toMutableList((List) arrayList2);
    }

    @NotNull
    public static final List<Integer> toIntList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toIntList");
        List<Integer> arrayList = new ArrayList<>();
        int length2 = jSONArray.length();
        for (int i = 0; i < length2; i++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
        }
        return arrayList;
    }

    public static final /* synthetic */ <V> Map<String, V> toMap(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            try {
                return MapsKt.emptyMap();
            } catch (Exception unused) {
                return MapsKt.emptyMap();
            }
        } else {
            if (str != null) {
                jSONObject = jSONObject.getJSONObject(str);
            }
            Object parseObject = JSON.parseObject(jSONObject.toString(), new setMin(), new Feature[0]);
            Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
            return (Map) parseObject;
        }
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if (jSONObject == null) {
            try {
                return MapsKt.emptyMap();
            } catch (Exception unused) {
                return MapsKt.emptyMap();
            }
        } else {
            if (str != null) {
                jSONObject = jSONObject.getJSONObject(str);
            }
            Object parseObject = JSON.parseObject(jSONObject.toString(), new setMin(), new Feature[0]);
            Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
            return (Map) parseObject;
        }
    }

    public static final /* synthetic */ <V> Map<String, V> toMap(String str, String str2) {
        try {
            if (str == null) {
                return MapsKt.emptyMap();
            }
            JSONObject jSONObject = new JSONObject(str);
            if (str2 != null) {
                jSONObject = jSONObject.getJSONObject(str2);
            }
            Object parseObject = JSON.parseObject(jSONObject.toString(), new length(), new Feature[0]);
            Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
            return (Map) parseObject;
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }

    public static /* synthetic */ Map toMap$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        try {
            if (str == null) {
                return MapsKt.emptyMap();
            }
            JSONObject jSONObject = new JSONObject(str);
            if (str2 != null) {
                jSONObject = jSONObject.getJSONObject(str2);
            }
            Object parseObject = JSON.parseObject(jSONObject.toString(), new length(), new Feature[0]);
            Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
            return (Map) parseObject;
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }

    @NotNull
    public static final List<Long> toLongList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toLongList");
        List<Long> arrayList = new ArrayList<>();
        int length2 = jSONArray.length();
        for (int i = 0; i < length2; i++) {
            arrayList.add(Long.valueOf(jSONArray.getLong(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Double> toDoubleList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toDoubleList");
        List<Double> arrayList = new ArrayList<>();
        int length2 = jSONArray.length();
        for (int i = 0; i < length2; i++) {
            arrayList.add(Double.valueOf(jSONArray.getDouble(i)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<Boolean> toBooleanList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "$this$toBooleanList");
        List<Boolean> arrayList = new ArrayList<>();
        int length2 = jSONArray.length();
        for (int i = 0; i < length2; i++) {
            arrayList.add(Boolean.valueOf(jSONArray.getBoolean(i)));
        }
        return arrayList;
    }

    public static final /* synthetic */ <T> T toSerializedJson(String str, String str2) {
        try {
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (str2 != null) {
                jSONObject = jSONObject.getJSONObject(str2);
            }
            Gson gson = new Gson();
            String jSONObject2 = jSONObject.toString();
            Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
            return gson.fromJson(jSONObject2, Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object toSerializedJson$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = null;
        }
        try {
            if (str == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (str2 != null) {
                jSONObject = jSONObject.getJSONObject(str2);
            }
            Gson gson = new Gson();
            String jSONObject2 = jSONObject.toString();
            Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
            return gson.fromJson(jSONObject2, Object.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final /* synthetic */ <T> T toSerializedJson(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (str != null) {
            try {
                jSONObject = jSONObject.getJSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
        Gson gson = new Gson();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        return gson.fromJson(jSONObject2, Object.class);
    }

    public static /* synthetic */ Object toSerializedJson$default(JSONObject jSONObject, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if (jSONObject == null) {
            return null;
        }
        if (str != null) {
            try {
                jSONObject = jSONObject.getJSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
        Gson gson = new Gson();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        return gson.fromJson(jSONObject2, Object.class);
    }

    public static final /* synthetic */ <T> T toSerializedJson(JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            return null;
        }
        if (str != null) {
            try {
                jsonObject = jsonObject.getAsJsonObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        return new GsonBuilder().disableHtmlEscaping().create().fromJson((JsonElement) jsonObject, Object.class);
    }

    public static /* synthetic */ Object toSerializedJson$default(JsonObject jsonObject, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if (jsonObject == null) {
            return null;
        }
        if (str != null) {
            try {
                jsonObject = jsonObject.getAsJsonObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
        return new GsonBuilder().disableHtmlEscaping().create().fromJson((JsonElement) jsonObject, Object.class);
    }

    @NotNull
    public static final Bundle toBundle(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "$this$toBundle");
        Bundle bundle = new Bundle(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null && (!Intrinsics.areEqual((Object) opt.toString(), (Object) "null"))) {
                if (opt instanceof Integer) {
                    bundle.putInt(next, ((Number) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Number) opt).longValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Number) opt).doubleValue());
                } else if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (!(opt instanceof JSONArray)) {
                    bundle.putString(next, opt.toString());
                } else if (((JSONArray) opt).length() > 0) {
                    try {
                        Object opt2 = ((JSONArray) opt).opt(0);
                        if (opt2 instanceof Integer) {
                            bundle.putIntArray(next, CollectionsKt.toIntArray(toIntList((JSONArray) opt)));
                        } else if (opt2 instanceof Long) {
                            bundle.putLongArray(next, CollectionsKt.toLongArray(toLongList((JSONArray) opt)));
                        } else if (opt2 instanceof Double) {
                            bundle.putDoubleArray(next, CollectionsKt.toDoubleArray(toDoubleList((JSONArray) opt)));
                        } else if (opt2 instanceof Boolean) {
                            bundle.putBooleanArray(next, CollectionsKt.toBooleanArray(toBooleanList((JSONArray) opt)));
                        } else {
                            Object[] array = toStringList((JSONArray) opt).toArray(new String[0]);
                            if (array != null) {
                                bundle.putStringArray(next, (String[]) array);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                        }
                    } catch (JSONException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return bundle;
    }
}
