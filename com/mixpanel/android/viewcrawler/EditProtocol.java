package com.mixpanel.android.viewcrawler;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.mixpanel.android.util.ImageStore;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import id.dana.lib.gcontainer.app.bridge.subapp.CloseSubAppEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.findFirstVisibleChildClosestToEnd;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.findOneVisibleChild;
import o.getHorizontalSnapPreference;
import o.getVerticalSnapPreference;
import o.getVerticalSnapPreference$FastBitmap$CoordinateSystem;
import o.onSeekTargetStep;
import o.onTargetFound;
import o.validateChildOrder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class EditProtocol {
    private static final List<onTargetFound.length> isInside = Collections.emptyList();
    private static final Class<?>[] length = new Class[0];
    private final ImageStore getMax;
    private final Context getMin;
    private final getVerticalSnapPreference.IsOverlapping setMax;
    private final findFirstVisibleChildClosestToEnd setMin;

    public static class BadInstructionsException extends Exception {
        private static final long serialVersionUID = -4062004792184145311L;

        public BadInstructionsException(String str) {
            super(str);
        }

        public BadInstructionsException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class InapplicableInstructionsException extends BadInstructionsException {
        private static final long serialVersionUID = 3977056710817909104L;

        public InapplicableInstructionsException(String str) {
            super(str);
        }
    }

    public static class CantGetEditAssetsException extends Exception {
        public CantGetEditAssetsException(String str) {
            super(str);
        }

        public CantGetEditAssetsException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static class length {
        public final List<String> getMax;
        public final getVerticalSnapPreference setMax;

        /* synthetic */ length(getVerticalSnapPreference getverticalsnappreference, List list, byte b) {
            this(getverticalsnappreference, list);
        }

        private length(getVerticalSnapPreference getverticalsnappreference, List<String> list) {
            this.setMax = getverticalsnappreference;
            this.getMax = list;
        }
    }

    public EditProtocol(Context context, findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend, ImageStore imageStore, getVerticalSnapPreference.IsOverlapping isOverlapping) {
        this.getMin = context;
        this.setMin = findfirstvisiblechildclosesttoend;
        this.getMax = imageStore;
        this.setMax = isOverlapping;
    }

    public final getVerticalSnapPreference setMax(JSONObject jSONObject, getVerticalSnapPreference.isInside isinside) throws BadInstructionsException {
        try {
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("event_type");
            List<onTargetFound.length> max = setMax(jSONObject.getJSONArray("path"), this.setMin);
            if (max.size() == 0) {
                StringBuilder sb = new StringBuilder("event '");
                sb.append(string);
                sb.append("' will not be bound to any element in the UI.");
                throw new InapplicableInstructionsException(sb.toString());
            } else if ("click".equals(string2)) {
                return new getVerticalSnapPreference.length(max, 1, string, isinside);
            } else {
                if ("selected".equals(string2)) {
                    return new getVerticalSnapPreference.length(max, 4, string, isinside);
                }
                if ("text_changed".equals(string2)) {
                    return new getVerticalSnapPreference.setMin(max, string, isinside);
                }
                if ("detected".equals(string2)) {
                    return new getVerticalSnapPreference$FastBitmap$CoordinateSystem(max, string, isinside);
                }
                StringBuilder sb2 = new StringBuilder("Mixpanel can't track event type \"");
                sb2.append(string2);
                sb2.append("\"");
                throw new BadInstructionsException(sb2.toString());
            }
        } catch (JSONException e) {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", e);
        }
    }

    public final length getMax(JSONObject jSONObject) throws BadInstructionsException, CantGetEditAssetsException {
        getVerticalSnapPreference getverticalsnappreference;
        Integer num;
        String string;
        validateChildOrder validatechildorder;
        ArrayList arrayList = new ArrayList();
        try {
            List<onTargetFound.length> max = setMax(jSONObject.getJSONArray("path"), this.setMin);
            if (max.size() != 0) {
                if (jSONObject.getString("change_type").equals("property")) {
                    string = jSONObject.getJSONObject("property").getString("classname");
                    if (string != null) {
                        onSeekTargetStep length2 = length(Class.forName(string), jSONObject.getJSONObject("property"));
                        JSONArray jSONArray = jSONObject.getJSONArray("args");
                        Object[] objArr = new Object[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                            objArr[i] = setMax(jSONArray2.get(0), jSONArray2.getString(1), arrayList);
                        }
                        if (length2.getMax == null) {
                            validatechildorder = null;
                        } else {
                            validatechildorder = new validateChildOrder(length2.setMin, length2.getMax, objArr, Void.TYPE);
                        }
                        if (validatechildorder != null) {
                            getverticalsnappreference = new getVerticalSnapPreference.toIntRange(max, validatechildorder, length2.getMin);
                        } else {
                            StringBuilder sb = new StringBuilder("Can't update a read-only property ");
                            sb.append(length2.length);
                            sb.append(" (add a mutator to make this work)");
                            throw new BadInstructionsException(sb.toString());
                        }
                    } else {
                        throw new BadInstructionsException("Can't bind an edit property without a target class");
                    }
                } else if (jSONObject.getString("change_type").equals(TtmlNode.TAG_LAYOUT)) {
                    JSONArray jSONArray3 = jSONObject.getJSONArray("args");
                    ArrayList arrayList2 = new ArrayList();
                    int length3 = jSONArray3.length();
                    for (int i2 = 0; i2 < length3; i2++) {
                        JSONObject optJSONObject = jSONArray3.optJSONObject(i2);
                        String string2 = optJSONObject.getString("view_id_name");
                        String string3 = optJSONObject.getString("anchor_id_name");
                        Integer min = getMin(-1, string2, this.setMin);
                        if (string3.equals("0")) {
                            num = 0;
                        } else if (string3.equals("-1")) {
                            num = -1;
                        } else {
                            num = getMin(-1, string3, this.setMin);
                        }
                        if (min != null) {
                            if (num != null) {
                                arrayList2.add(new getVerticalSnapPreference.toFloatRange(min.intValue(), optJSONObject.getInt("verb"), num.intValue()));
                            }
                        }
                        findOnePartiallyOrCompletelyInvisibleChild.isInside();
                    }
                    getverticalsnappreference = new getVerticalSnapPreference.equals(max, arrayList2, jSONObject.getString("name"), this.setMax);
                } else {
                    throw new BadInstructionsException("Can't figure out the edit type");
                }
                return new length(getverticalsnappreference, arrayList, (byte) 0);
            }
            throw new InapplicableInstructionsException("Edit will not be bound to any element in the UI.");
        } catch (ClassNotFoundException e) {
            throw new BadInstructionsException("Can't find class for visit path: ".concat(String.valueOf(string)), e);
        } catch (NoSuchMethodException e2) {
            throw new BadInstructionsException("Can't create property mutator", e2);
        } catch (JSONException e3) {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", e3);
        }
    }

    public final getHorizontalSnapPreference getMin(JSONObject jSONObject) throws BadInstructionsException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("config").getJSONArray("classes");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                Class<?> cls = Class.forName(jSONObject2.getString("name"));
                JSONArray jSONArray2 = jSONObject2.getJSONArray("properties");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList.add(length(cls, jSONArray2.getJSONObject(i2)));
                }
            }
            return new getHorizontalSnapPreference(this.getMin, arrayList, this.setMin);
        } catch (JSONException e) {
            throw new BadInstructionsException("Can't read snapshot configuration", e);
        } catch (ClassNotFoundException e2) {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", e2);
        }
    }

    public static findOneVisibleChild<String, Object> setMax(JSONObject jSONObject) throws BadInstructionsException {
        Object obj;
        try {
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            if ("number".equals(string2)) {
                String string3 = jSONObject.getString("encoding");
                if ("d".equals(string3)) {
                    obj = Double.valueOf(jSONObject.getDouble("value"));
                } else if ("l".equals(string3)) {
                    obj = Long.valueOf(jSONObject.getLong("value"));
                } else {
                    throw new BadInstructionsException("number must have encoding of type \"l\" for long or \"d\" for double in: ".concat(String.valueOf(jSONObject)));
                }
            } else if ("boolean".equals(string2)) {
                obj = Boolean.valueOf(jSONObject.getBoolean("value"));
            } else if ("string".equals(string2)) {
                obj = jSONObject.getString("value");
            } else {
                StringBuilder sb = new StringBuilder("Unrecognized tweak type ");
                sb.append(string2);
                sb.append(" in: ");
                sb.append(jSONObject);
                throw new BadInstructionsException(sb.toString());
            }
            return new findOneVisibleChild<>(string, obj);
        } catch (JSONException e) {
            throw new BadInstructionsException("Can't read tweak update", e);
        }
    }

    private static List<onTargetFound.length> setMax(JSONArray jSONArray, findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String str5 = null;
            if (!jSONObject.has("prefix") || jSONObject.isNull("prefix")) {
                str = null;
            } else {
                str = jSONObject.getString("prefix");
            }
            if (!jSONObject.has("view_class") || jSONObject.isNull("view_class")) {
                str2 = null;
            } else {
                str2 = jSONObject.getString("view_class");
            }
            int optInt = jSONObject.optInt("index", -1);
            if (!jSONObject.has("contentDescription") || jSONObject.isNull("contentDescription")) {
                str3 = null;
            } else {
                str3 = jSONObject.getString("contentDescription");
            }
            int optInt2 = jSONObject.optInt("id", -1);
            if (!jSONObject.has("mp_id_name") || jSONObject.isNull("mp_id_name")) {
                str4 = null;
            } else {
                str4 = jSONObject.getString("mp_id_name");
            }
            if (jSONObject.has("tag") && !jSONObject.isNull("tag")) {
                str5 = jSONObject.getString("tag");
            }
            String str6 = str5;
            if ("shortest".equals(str)) {
                i = 1;
            } else if (str == null) {
                i = 0;
            } else {
                findOnePartiallyOrCompletelyInvisibleChild.isInside();
                return isInside;
            }
            Integer min = getMin(optInt2, str4, findfirstvisiblechildclosesttoend);
            if (min == null) {
                return isInside;
            }
            arrayList.add(new onTargetFound.length(i, str2, optInt, min.intValue(), str3, str6));
        }
        return arrayList;
    }

    private static Integer getMin(int i, String str, findFirstVisibleChildClosestToEnd findfirstvisiblechildclosesttoend) {
        int i2;
        if (str == null) {
            i2 = -1;
        } else if (findfirstvisiblechildclosesttoend.length(str)) {
            i2 = findfirstvisiblechildclosesttoend.getMax(str);
        } else {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            return null;
        }
        if (-1 != i2 && -1 != i && i2 != i) {
            findOnePartiallyOrCompletelyInvisibleChild.toFloatRange();
            return null;
        } else if (-1 != i2) {
            return Integer.valueOf(i2);
        } else {
            return Integer.valueOf(i);
        }
    }

    private static onSeekTargetStep length(Class<?> cls, JSONObject jSONObject) throws BadInstructionsException {
        validateChildOrder validatechildorder;
        try {
            String string = jSONObject.getString("name");
            String str = null;
            if (jSONObject.has(ContactEventType.CONTACT_GET)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(ContactEventType.CONTACT_GET);
                validatechildorder = new validateChildOrder(cls, jSONObject2.getString("selector"), length, Class.forName(jSONObject2.getJSONObject("result").getString("type")));
            } else {
                validatechildorder = null;
            }
            if (jSONObject.has("set")) {
                str = jSONObject.getJSONObject("set").getString("selector");
            }
            return new onSeekTargetStep(string, cls, validatechildorder, str);
        } catch (NoSuchMethodException e) {
            throw new BadInstructionsException("Can't create property reader", e);
        } catch (JSONException e2) {
            throw new BadInstructionsException("Can't read property JSON", e2);
        } catch (ClassNotFoundException e3) {
            throw new BadInstructionsException("Can't read property JSON, relevant arg/return class not found", e3);
        }
    }

    private Object setMax(Object obj, String str, List<String> list) throws BadInstructionsException, CantGetEditAssetsException {
        try {
            if ("java.lang.CharSequence".equals(str) || "boolean".equals(str)) {
                return obj;
            }
            if ("java.lang.Boolean".equals(str)) {
                return obj;
            }
            if (!"int".equals(str)) {
                if (!"java.lang.Integer".equals(str)) {
                    if (!"float".equals(str)) {
                        if (!"java.lang.Float".equals(str)) {
                            if ("android.graphics.drawable.Drawable".equals(str)) {
                                return setMin((JSONObject) obj, list);
                            }
                            if ("android.graphics.drawable.BitmapDrawable".equals(str)) {
                                return setMin((JSONObject) obj, list);
                            }
                            if ("android.graphics.drawable.ColorDrawable".equals(str)) {
                                return new ColorDrawable(((Number) obj).intValue());
                            }
                            StringBuilder sb = new StringBuilder("Don't know how to interpret type ");
                            sb.append(str);
                            sb.append(" (arg was ");
                            sb.append(obj);
                            sb.append(")");
                            throw new BadInstructionsException(sb.toString());
                        }
                    }
                    return Float.valueOf(((Number) obj).floatValue());
                }
            }
            return Integer.valueOf(((Number) obj).intValue());
        } catch (ClassCastException unused) {
            StringBuilder sb2 = new StringBuilder("Couldn't interpret <");
            sb2.append(obj);
            sb2.append("> as ");
            sb2.append(str);
            throw new BadInstructionsException(sb2.toString());
        }
    }

    private Drawable setMin(JSONObject jSONObject, List<String> list) throws BadInstructionsException, CantGetEditAssetsException {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            if (!jSONObject.isNull("url")) {
                String string = jSONObject.getString("url");
                boolean z = false;
                if (jSONObject.isNull("dimensions")) {
                    i = 0;
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("dimensions");
                    int i5 = jSONObject2.getInt(TtmlNode.LEFT);
                    i4 = jSONObject2.getInt(TtmlNode.RIGHT);
                    i3 = jSONObject2.getInt(CloseSubAppEvent.TOP);
                    i2 = jSONObject2.getInt("bottom");
                    i = i5;
                    z = true;
                }
                Bitmap max = this.getMax.setMax(string);
                list.add(string);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), max);
                if (z) {
                    bitmapDrawable.setBounds(i, i3, i4, i2);
                }
                return bitmapDrawable;
            }
            throw new BadInstructionsException("Can't construct a BitmapDrawable with a null url");
        } catch (ImageStore.CantGetImageException e) {
            throw new CantGetEditAssetsException(e.getMessage(), e.getCause());
        } catch (JSONException e2) {
            throw new BadInstructionsException("Couldn't read drawable description", e2);
        }
    }
}
