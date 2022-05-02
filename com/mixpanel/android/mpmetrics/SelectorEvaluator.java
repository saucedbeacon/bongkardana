package com.mixpanel.android.mpmetrics;

import id.dana.richview.CurrencyTextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class SelectorEvaluator {
    private static Calendar length;
    private final JSONObject getMin;

    enum PropertyType {
        Array,
        Boolean,
        Datetime,
        Null,
        Number,
        Object,
        String,
        Unknown
    }

    SelectorEvaluator(JSONObject jSONObject) throws IllegalArgumentException {
        if (!jSONObject.has("operator") || !jSONObject.has("children")) {
            throw new IllegalArgumentException("Missing required keys: operator children");
        }
        this.getMin = jSONObject;
    }

    private static PropertyType getMin(Object obj) {
        if (obj == null || obj.equals(JSONObject.NULL)) {
            return PropertyType.Null;
        }
        if (obj instanceof String) {
            return PropertyType.String;
        }
        if (obj instanceof JSONArray) {
            return PropertyType.Array;
        }
        if (obj instanceof JSONObject) {
            return PropertyType.Object;
        }
        if ((obj instanceof Double) || (obj instanceof Integer) || (obj instanceof Number)) {
            return PropertyType.Number;
        }
        if (obj instanceof Boolean) {
            return PropertyType.Boolean;
        }
        if (obj instanceof Date) {
            return PropertyType.Datetime;
        }
        return PropertyType.Unknown;
    }

    /* renamed from: com.mixpanel.android.mpmetrics.SelectorEvaluator$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType[] r0 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Null     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Datetime     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Boolean     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Number     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x003e }
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.String     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Object     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.SelectorEvaluator.AnonymousClass4.<clinit>():void");
        }
    }

    private static Double getMax(Object obj) {
        int i = AnonymousClass4.setMax[getMin(obj).ordinal()];
        if (i != 2) {
            double d = 0.0d;
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                } else if (obj instanceof Double) {
                    return (Double) obj;
                } else {
                    if (obj instanceof Integer) {
                        return Double.valueOf(((Integer) obj).doubleValue());
                    }
                    if (obj instanceof Number) {
                        return Double.valueOf(((Number) obj).doubleValue());
                    }
                }
                try {
                    return Double.valueOf(Double.parseDouble((String) obj));
                } catch (NumberFormatException unused) {
                    return Double.valueOf(0.0d);
                }
            } else {
                if (((Boolean) obj).booleanValue()) {
                    d = 1.0d;
                }
                return Double.valueOf(d);
            }
        } else {
            Date date = (Date) obj;
            if (date.getTime() > 0) {
                return new Double((double) date.getTime());
            }
            return null;
        }
    }

    private static Boolean length(Object obj) {
        boolean z = true;
        switch (AnonymousClass4.setMax[getMin(obj).ordinal()]) {
            case 1:
                return Boolean.FALSE;
            case 2:
                if (((Date) obj).getTime() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return (Boolean) obj;
            case 4:
                if (getMax(obj).doubleValue() == 0.0d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (((String) obj).length() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (((JSONArray) obj).length() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (((JSONObject) obj).length() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.FALSE;
        }
    }

    private static Date getMax(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Object obj;
        if (!jSONObject.has("operator") || !jSONObject.getString("operator").equals("datetime") || jSONObject.optJSONArray("children") == null || jSONObject.getJSONArray("children").length() != 1) {
            throw new IllegalArgumentException("Invalid node for cast operator: datetime");
        }
        JSONObject jSONObject3 = jSONObject.getJSONArray("children").getJSONObject(0);
        if (jSONObject3.has("property")) {
            obj = setMin(jSONObject3, jSONObject2);
        } else {
            obj = setMax(jSONObject3, jSONObject2);
        }
        int i = AnonymousClass4.setMax[getMin(obj).ordinal()];
        if (i == 2) {
            return (Date) obj;
        }
        if (i == 4) {
            return new Date(getMax(obj).longValue());
        }
        if (i != 5) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US).parse((String) obj);
        } catch (ParseException unused) {
            return null;
        }
    }

    private static Boolean length(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Object obj;
        Object obj2;
        if (!jSONObject.has("operator") || ((!jSONObject.getString("operator").equals(CurrencyTextView.DEFAULT_LANGUAGE_CODE) && !jSONObject.getString("operator").equals("not in")) || jSONObject.optJSONArray("children") == null || jSONObject.getJSONArray("children").length() != 2)) {
            throw new IllegalArgumentException("Invalid node for operator: (not) in");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        boolean z = false;
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.has("property")) {
            obj = setMin(jSONObject3, jSONObject2);
        } else {
            obj = setMax(jSONObject3, jSONObject2);
        }
        JSONObject jSONObject4 = jSONArray.getJSONObject(1);
        if (jSONObject4.has("property")) {
            obj2 = setMin(jSONObject4, jSONObject2);
        } else {
            obj2 = setMax(jSONObject4, jSONObject2);
        }
        Boolean bool = Boolean.FALSE;
        String obj3 = obj.toString();
        int i = AnonymousClass4.setMax[getMin(obj2).ordinal()];
        if (i == 5) {
            bool = Boolean.valueOf(((String) obj2).contains(obj3));
        } else if (i == 6) {
            JSONArray jSONArray2 = (JSONArray) obj2;
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray2.length()) {
                    break;
                } else if (obj3.equals(jSONArray2.getString(i2))) {
                    bool = Boolean.TRUE;
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (jSONObject.getString("operator").equals(CurrencyTextView.DEFAULT_LANGUAGE_CODE)) {
            z = bool.booleanValue();
        } else if (!bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private static boolean getMin(Object obj, Object obj2) {
        if (getMin(obj) != getMin(obj2)) {
            return false;
        }
        switch (AnonymousClass4.setMax[getMin(obj).ordinal()]) {
            case 1:
                return true;
            case 2:
            case 5:
            case 6:
                return obj.equals(obj2);
            case 3:
                return length(obj).equals(length(obj2));
            case 4:
                return getMax(obj).equals(getMax(obj2));
            default:
                return false;
        }
    }

    private static Boolean getMin(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Object obj;
        Object obj2;
        if (!jSONObject.has("operator") || ((!jSONObject.getString("operator").equals("==") && !jSONObject.getString("operator").equals("!=")) || jSONObject.optJSONArray("children") == null || jSONObject.getJSONArray("children").length() != 2)) {
            throw new IllegalArgumentException("Invalid node for equality operator");
        }
        JSONArray jSONArray = jSONObject.getJSONArray("children");
        boolean z = false;
        JSONObject jSONObject3 = jSONArray.getJSONObject(0);
        if (jSONObject3.has("property")) {
            obj = setMin(jSONObject3, jSONObject2);
        } else {
            obj = setMax(jSONObject3, jSONObject2);
        }
        JSONObject jSONObject4 = jSONArray.getJSONObject(1);
        if (jSONObject4.has("property")) {
            obj2 = setMin(jSONObject4, jSONObject2);
        } else {
            obj2 = setMax(jSONObject4, jSONObject2);
        }
        Boolean bool = Boolean.FALSE;
        if (getMin(obj) == getMin(obj2)) {
            if (AnonymousClass4.setMax[getMin(obj).ordinal()] != 7) {
                bool = Boolean.valueOf(getMin(obj, obj2));
            } else {
                JSONObject jSONObject5 = (JSONObject) obj;
                JSONObject jSONObject6 = (JSONObject) obj2;
                if (jSONObject5.length() == jSONObject6.length()) {
                    bool = Boolean.TRUE;
                    Iterator<String> keys = jSONObject5.keys();
                    while (true) {
                        if (!keys.hasNext()) {
                            break;
                        }
                        String next = keys.next();
                        if (!getMin(jSONObject5.get(next), jSONObject6.opt(next))) {
                            bool = Boolean.FALSE;
                            break;
                        }
                    }
                }
            }
        }
        if (!jSONObject.getString("operator").equals("!=")) {
            z = bool.booleanValue();
        } else if (!bool.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r3.equals("hour") != false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object setMin(org.json.JSONObject r10, org.json.JSONObject r11) throws org.json.JSONException {
        /*
            java.lang.String r0 = "property"
            boolean r1 = r10.has(r0)
            if (r1 == 0) goto L_0x0168
            java.lang.String r1 = "value"
            boolean r2 = r10.has(r1)
            if (r2 == 0) goto L_0x0168
            java.lang.String r2 = r10.getString(r0)
            int r3 = r2.hashCode()
            r4 = 96891546(0x5c6729a, float:1.8661928E-35)
            r5 = 0
            r6 = -1
            r7 = 1
            if (r3 == r4) goto L_0x0031
            r4 = 182460591(0xae020af, float:2.158271E-32)
            if (r3 == r4) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            java.lang.String r3 = "literal"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x0031:
            java.lang.String r3 = "event"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003b
            r2 = 0
            goto L_0x003c
        L_0x003b:
            r2 = -1
        L_0x003c:
            if (r2 == 0) goto L_0x015f
            if (r2 != r7) goto L_0x0147
            java.lang.Object r11 = r10.get(r1)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r11 = getMin(r11)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r0 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.String
            if (r11 != r0) goto L_0x005e
            java.lang.String r11 = r10.getString(r1)
            java.lang.String r0 = "now"
            boolean r11 = r11.equalsIgnoreCase(r0)
            if (r11 == 0) goto L_0x005e
            java.util.Date r10 = new java.util.Date
            r10.<init>()
            return r10
        L_0x005e:
            java.lang.Object r10 = r10.get(r1)
            int[] r11 = com.mixpanel.android.mpmetrics.SelectorEvaluator.AnonymousClass4.setMax
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r0 = getMin(r10)
            int r0 = r0.ordinal()
            r11 = r11[r0]
            r0 = 7
            if (r11 == r0) goto L_0x0072
            return r10
        L_0x0072:
            org.json.JSONObject r10 = (org.json.JSONObject) r10
            java.lang.String r11 = "window"
            org.json.JSONObject r11 = r10.optJSONObject(r11)
            if (r11 == 0) goto L_0x012f
            boolean r2 = r11.has(r1)
            if (r2 == 0) goto L_0x012f
            java.lang.String r2 = "unit"
            boolean r3 = r11.has(r2)
            if (r3 == 0) goto L_0x012f
            java.util.Calendar r10 = length
            if (r10 != 0) goto L_0x009d
            java.util.Calendar r10 = java.util.Calendar.getInstance()
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            r10.setTime(r3)
            goto L_0x00a3
        L_0x009d:
            java.lang.Object r10 = r10.clone()
            java.util.Calendar r10 = (java.util.Calendar) r10
        L_0x00a3:
            int r1 = r11.getInt(r1)
            int r1 = r1 * -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = r11.getString(r2)
            int r4 = r3.hashCode()
            r8 = 3
            r9 = 2
            switch(r4) {
                case 99228: goto L_0x00d9;
                case 3208676: goto L_0x00d0;
                case 3645428: goto L_0x00c5;
                case 104080000: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x00e3
        L_0x00bb:
            java.lang.String r4 = "month"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e3
            r5 = 3
            goto L_0x00e4
        L_0x00c5:
            java.lang.String r4 = "week"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e3
            r5 = 2
            goto L_0x00e4
        L_0x00d0:
            java.lang.String r4 = "hour"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r4 = "day"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e3
            r5 = 1
            goto L_0x00e4
        L_0x00e3:
            r5 = -1
        L_0x00e4:
            if (r5 == 0) goto L_0x0121
            r3 = 6
            if (r5 == r7) goto L_0x0119
            if (r5 == r9) goto L_0x010f
            if (r5 != r8) goto L_0x00f7
            int r11 = r1.intValue()
            int r11 = r11 * 30
            r10.add(r3, r11)
            goto L_0x012a
        L_0x00f7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid unit specification for window "
            r0.<init>(r1)
            java.lang.String r11 = r11.getString(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L_0x010f:
            int r11 = r1.intValue()
            int r11 = r11 * 7
            r10.add(r3, r11)
            goto L_0x012a
        L_0x0119:
            int r11 = r1.intValue()
            r10.add(r3, r11)
            goto L_0x012a
        L_0x0121:
            r11 = 10
            int r0 = r1.intValue()
            r10.add(r11, r0)
        L_0x012a:
            java.util.Date r10 = r10.getTime()
            return r10
        L_0x012f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid window specification for value key "
            r0.<init>(r1)
            java.lang.String r10 = r10.toString()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L_0x0147:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid operand: Invalid property type: "
            r1.<init>(r2)
            java.lang.String r10 = r10.getString(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L_0x015f:
            java.lang.String r10 = r10.getString(r1)
            java.lang.Object r10 = r11.opt(r10)
            return r10
        L_0x0168:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Missing required keys: property/value"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.SelectorEvaluator.setMin(org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0649  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object setMax(org.json.JSONObject r18, org.json.JSONObject r19) throws org.json.JSONException {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "operator"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto L_0x07f4
            java.lang.String r3 = r0.getString(r2)
            int r4 = r3.hashCode()
            java.lang.String r5 = "+"
            java.lang.String r6 = "string"
            java.lang.String r7 = "number"
            java.lang.String r8 = "defined"
            java.lang.String r9 = "/"
            java.lang.String r10 = "-"
            java.lang.String r11 = "*"
            java.lang.String r12 = "%"
            java.lang.String r13 = ">="
            java.lang.String r14 = "<="
            java.lang.String r15 = ">"
            java.lang.String r1 = "<"
            r16 = -1
            switch(r4) {
                case -1039759982: goto L_0x0113;
                case -1034364087: goto L_0x010a;
                case -891985903: goto L_0x0101;
                case 37: goto L_0x00f8;
                case 42: goto L_0x00f0;
                case 43: goto L_0x00e8;
                case 45: goto L_0x00e0;
                case 47: goto L_0x00d8;
                case 60: goto L_0x00cf;
                case 62: goto L_0x00c6;
                case 1084: goto L_0x00bb;
                case 1921: goto L_0x00b1;
                case 1952: goto L_0x00a5;
                case 1983: goto L_0x009b;
                case 3365: goto L_0x0090;
                case 3555: goto L_0x0085;
                case 96727: goto L_0x007a;
                case 109267: goto L_0x006e;
                case 3322014: goto L_0x0062;
                case 64711720: goto L_0x0056;
                case 1545035273: goto L_0x004c;
                case 1793702779: goto L_0x0040;
                case 1834754492: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x011d
        L_0x0034:
            java.lang.String r4 = "not defined"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 21
            goto L_0x011e
        L_0x0040:
            java.lang.String r4 = "datetime"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 16
            goto L_0x011e
        L_0x004c:
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x011d
            r3 = 20
            goto L_0x011e
        L_0x0056:
            java.lang.String r4 = "boolean"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 15
            goto L_0x011e
        L_0x0062:
            java.lang.String r4 = "list"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 17
            goto L_0x011e
        L_0x006e:
            java.lang.String r4 = "not"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 22
            goto L_0x011e
        L_0x007a:
            java.lang.String r4 = "and"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 0
            goto L_0x011e
        L_0x0085:
            java.lang.String r4 = "or"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 1
            goto L_0x011e
        L_0x0090:
            java.lang.String r4 = "in"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 2
            goto L_0x011e
        L_0x009b:
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x011d
            r3 = 12
            goto L_0x011e
        L_0x00a5:
            java.lang.String r4 = "=="
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 9
            goto L_0x011e
        L_0x00b1:
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x011d
            r3 = 14
            goto L_0x011e
        L_0x00bb:
            java.lang.String r4 = "!="
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 10
            goto L_0x011e
        L_0x00c6:
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x011d
            r3 = 11
            goto L_0x011e
        L_0x00cf:
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x011d
            r3 = 13
            goto L_0x011e
        L_0x00d8:
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x011d
            r3 = 7
            goto L_0x011e
        L_0x00e0:
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x011d
            r3 = 5
            goto L_0x011e
        L_0x00e8:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x011d
            r3 = 4
            goto L_0x011e
        L_0x00f0:
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x011d
            r3 = 6
            goto L_0x011e
        L_0x00f8:
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x011d
            r3 = 8
            goto L_0x011e
        L_0x0101:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x011d
            r3 = 19
            goto L_0x011e
        L_0x010a:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x011d
            r3 = 18
            goto L_0x011e
        L_0x0113:
            java.lang.String r4 = "not in"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011d
            r3 = 3
            goto L_0x011e
        L_0x011d:
            r3 = -1
        L_0x011e:
            java.lang.String r4 = "property"
            java.lang.String r0 = "children"
            switch(r3) {
                case 0: goto L_0x077d;
                case 1: goto L_0x0705;
                case 2: goto L_0x06fc;
                case 3: goto L_0x06fc;
                case 4: goto L_0x0659;
                case 5: goto L_0x052d;
                case 6: goto L_0x052d;
                case 7: goto L_0x052d;
                case 8: goto L_0x052d;
                case 9: goto L_0x0524;
                case 10: goto L_0x0524;
                case 11: goto L_0x0372;
                case 12: goto L_0x0372;
                case 13: goto L_0x0372;
                case 14: goto L_0x0372;
                case 15: goto L_0x0326;
                case 16: goto L_0x031d;
                case 17: goto L_0x02c9;
                case 18: goto L_0x027f;
                case 19: goto L_0x0218;
                case 20: goto L_0x01ad;
                case 21: goto L_0x01ad;
                case 22: goto L_0x013f;
                default: goto L_0x0125;
            }
        L_0x0125:
            r3 = r18
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unknown operator: "
            r1.<init>(r4)
            java.lang.String r2 = r3.getString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013f:
            r1 = 3
            r3 = r18
            boolean r5 = r3.has(r2)
            if (r5 == 0) goto L_0x01a5
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r5 = "not"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01a5
            org.json.JSONArray r2 = r3.optJSONArray(r0)
            if (r2 == 0) goto L_0x01a5
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            int r2 = r2.length()
            r5 = 1
            if (r2 != r5) goto L_0x01a5
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r2 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r2)
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L_0x017b
            r5 = r19
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x0181
        L_0x017b:
            r5 = r19
            java.lang.Object r0 = setMax(r0, r5)
        L_0x0181:
            int[] r2 = com.mixpanel.android.mpmetrics.SelectorEvaluator.AnonymousClass4.setMax
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r3 = getMin(r0)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            if (r2 == r3) goto L_0x01a2
            if (r2 == r1) goto L_0x0194
            r1 = 0
            return r1
        L_0x0194:
            java.lang.Boolean r0 = length((java.lang.Object) r0)
            boolean r0 = r0.booleanValue()
            r0 = r0 ^ r3
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x01a2:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x01a5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for operator: not"
            r0.<init>(r1)
            throw r0
        L_0x01ad:
            r3 = r18
            r5 = r19
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x0210
            java.lang.String r1 = r3.getString(r2)
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x01cd
            java.lang.String r1 = r3.getString(r2)
            java.lang.String r6 = "not defined"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0210
        L_0x01cd:
            org.json.JSONArray r1 = r3.optJSONArray(r0)
            if (r1 == 0) goto L_0x0210
            org.json.JSONArray r1 = r3.getJSONArray(r0)
            int r1 = r1.length()
            r6 = 1
            if (r1 != r6) goto L_0x0210
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r1 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x01f2
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x01f6
        L_0x01f2:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x01f6:
            if (r0 != 0) goto L_0x01fa
            r0 = 0
            goto L_0x01fb
        L_0x01fa:
            r0 = 1
        L_0x01fb:
            java.lang.String r1 = r3.getString(r2)
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0206
            goto L_0x020b
        L_0x0206:
            if (r0 != 0) goto L_0x020a
            r0 = 1
            goto L_0x020b
        L_0x020a:
            r0 = 0
        L_0x020b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0210:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for (not) defined operator"
            r0.<init>(r1)
            throw r0
        L_0x0218:
            r3 = r18
            r5 = r19
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x0277
            java.lang.String r1 = r3.getString(r2)
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0277
            org.json.JSONArray r1 = r3.optJSONArray(r0)
            if (r1 == 0) goto L_0x0277
            org.json.JSONArray r1 = r3.getJSONArray(r0)
            int r1 = r1.length()
            r2 = 1
            if (r1 != r2) goto L_0x0277
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r1 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x0251
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x0255
        L_0x0251:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x0255:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = getMin(r0)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r2 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Datetime
            if (r1 != r2) goto L_0x026e
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ss"
            r1.<init>(r3, r2)
            java.util.Date r0 = (java.util.Date) r0
            java.lang.String r0 = r1.format(r0)
            return r0
        L_0x026e:
            if (r0 == 0) goto L_0x0275
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0275:
            r0 = 0
            return r0
        L_0x0277:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for cast operator: string"
            r0.<init>(r1)
            throw r0
        L_0x027f:
            r3 = r18
            r5 = r19
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x02c1
            java.lang.String r1 = r3.getString(r2)
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x02c1
            org.json.JSONArray r1 = r3.optJSONArray(r0)
            if (r1 == 0) goto L_0x02c1
            org.json.JSONArray r1 = r3.getJSONArray(r0)
            int r1 = r1.length()
            r2 = 1
            if (r1 != r2) goto L_0x02c1
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r1 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x02b8
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x02bc
        L_0x02b8:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x02bc:
            java.lang.Double r0 = getMax(r0)
            return r0
        L_0x02c1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for cast operator: number"
            r0.<init>(r1)
            throw r0
        L_0x02c9:
            r3 = r18
            r5 = r19
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x0315
            java.lang.String r1 = r3.getString(r2)
            java.lang.String r2 = "list"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0315
            org.json.JSONArray r1 = r3.optJSONArray(r0)
            if (r1 == 0) goto L_0x0315
            org.json.JSONArray r1 = r3.getJSONArray(r0)
            int r1 = r1.length()
            r2 = 1
            if (r1 != r2) goto L_0x0315
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r1 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x0304
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x0308
        L_0x0304:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x0308:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = getMin(r0)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r2 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Array
            if (r1 != r2) goto L_0x0313
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            return r0
        L_0x0313:
            r0 = 0
            return r0
        L_0x0315:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for cast operator: list"
            r0.<init>(r1)
            throw r0
        L_0x031d:
            r3 = r18
            r5 = r19
            java.util.Date r0 = getMax(r18, r19)
            return r0
        L_0x0326:
            r3 = r18
            r5 = r19
            boolean r1 = r3.has(r2)
            if (r1 == 0) goto L_0x036a
            java.lang.String r1 = r3.getString(r2)
            java.lang.String r2 = "boolean"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x036a
            org.json.JSONArray r1 = r3.optJSONArray(r0)
            if (r1 == 0) goto L_0x036a
            org.json.JSONArray r1 = r3.getJSONArray(r0)
            int r1 = r1.length()
            r2 = 1
            if (r1 != r2) goto L_0x036a
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r1 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r1)
            boolean r1 = r0.has(r4)
            if (r1 == 0) goto L_0x0361
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x0365
        L_0x0361:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x0365:
            java.lang.Boolean r0 = length((java.lang.Object) r0)
            return r0
        L_0x036a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for cast operator: boolean"
            r0.<init>(r1)
            throw r0
        L_0x0372:
            r3 = r18
            r5 = r19
            r6 = r1
            r1 = 3
            boolean r7 = r3.has(r2)
            if (r7 == 0) goto L_0x051c
            java.lang.String r7 = r3.getString(r2)
            boolean r7 = r7.equals(r15)
            if (r7 != 0) goto L_0x03a6
            java.lang.String r7 = r3.getString(r2)
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L_0x03a6
            java.lang.String r7 = r3.getString(r2)
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x03a6
            java.lang.String r7 = r3.getString(r2)
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L_0x051c
        L_0x03a6:
            org.json.JSONArray r7 = r3.optJSONArray(r0)
            if (r7 == 0) goto L_0x051c
            org.json.JSONArray r7 = r3.getJSONArray(r0)
            int r7 = r7.length()
            r8 = 2
            if (r7 != r8) goto L_0x051c
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r7 = 0
            org.json.JSONObject r8 = r0.getJSONObject(r7)
            boolean r7 = r8.has(r4)
            if (r7 == 0) goto L_0x03cb
            java.lang.Object r7 = setMin(r8, r5)
            goto L_0x03cf
        L_0x03cb:
            java.lang.Object r7 = setMax(r8, r5)
        L_0x03cf:
            r8 = 1
            org.json.JSONObject r0 = r0.getJSONObject(r8)
            boolean r4 = r0.has(r4)
            if (r4 == 0) goto L_0x03df
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x03e3
        L_0x03df:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x03e3:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r4 = getMin(r7)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r5 = getMin(r0)
            if (r4 != r5) goto L_0x051a
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r4 = getMin(r7)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r5 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Number
            if (r4 == r5) goto L_0x047d
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r4 = getMin(r7)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r5 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Datetime
            if (r4 != r5) goto L_0x03ff
            goto L_0x047d
        L_0x03ff:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r4 = getMin(r7)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r5 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.String
            if (r4 != r5) goto L_0x051a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r7.compareTo(r0)
            java.lang.String r2 = r3.getString(r2)
            int r3 = r2.hashCode()
            r4 = 60
            if (r3 == r4) goto L_0x0440
            r4 = 62
            if (r3 == r4) goto L_0x0438
            r4 = 1921(0x781, float:2.692E-42)
            if (r3 == r4) goto L_0x0430
            r4 = 1983(0x7bf, float:2.779E-42)
            if (r3 == r4) goto L_0x0428
            goto L_0x0448
        L_0x0428:
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x0448
            r2 = 1
            goto L_0x0449
        L_0x0430:
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x0448
            r2 = 3
            goto L_0x0449
        L_0x0438:
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x0448
            r2 = 0
            goto L_0x0449
        L_0x0440:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0448
            r2 = 2
            goto L_0x0449
        L_0x0448:
            r2 = -1
        L_0x0449:
            if (r2 == 0) goto L_0x0473
            r3 = 1
            if (r2 == r3) goto L_0x0469
            r3 = 2
            if (r2 == r3) goto L_0x045f
            if (r2 == r1) goto L_0x0455
            goto L_0x051a
        L_0x0455:
            if (r0 > 0) goto L_0x0459
            r0 = 1
            goto L_0x045a
        L_0x0459:
            r0 = 0
        L_0x045a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x045f:
            if (r0 >= 0) goto L_0x0463
            r0 = 1
            goto L_0x0464
        L_0x0463:
            r0 = 0
        L_0x0464:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0469:
            if (r0 < 0) goto L_0x046d
            r0 = 1
            goto L_0x046e
        L_0x046d:
            r0 = 0
        L_0x046e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0473:
            if (r0 <= 0) goto L_0x0477
            r0 = 1
            goto L_0x0478
        L_0x0477:
            r0 = 0
        L_0x0478:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x047d:
            java.lang.Double r4 = getMax(r7)
            java.lang.Double r0 = getMax(r0)
            java.lang.String r2 = r3.getString(r2)
            int r3 = r2.hashCode()
            r5 = 60
            if (r3 == r5) goto L_0x04b6
            r5 = 62
            if (r3 == r5) goto L_0x04ae
            r5 = 1921(0x781, float:2.692E-42)
            if (r3 == r5) goto L_0x04a6
            r5 = 1983(0x7bf, float:2.779E-42)
            if (r3 == r5) goto L_0x049e
            goto L_0x04be
        L_0x049e:
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x04be
            r2 = 1
            goto L_0x04bf
        L_0x04a6:
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x04be
            r2 = 3
            goto L_0x04bf
        L_0x04ae:
            boolean r2 = r2.equals(r15)
            if (r2 == 0) goto L_0x04be
            r2 = 0
            goto L_0x04bf
        L_0x04b6:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x04be
            r2 = 2
            goto L_0x04bf
        L_0x04be:
            r2 = -1
        L_0x04bf:
            if (r2 == 0) goto L_0x0506
            r3 = 1
            if (r2 == r3) goto L_0x04f2
            r3 = 2
            if (r2 == r3) goto L_0x04de
            if (r2 == r1) goto L_0x04ca
            goto L_0x051a
        L_0x04ca:
            double r1 = r4.doubleValue()
            double r3 = r0.doubleValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x04d8
            r0 = 1
            goto L_0x04d9
        L_0x04d8:
            r0 = 0
        L_0x04d9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x04de:
            double r1 = r4.doubleValue()
            double r3 = r0.doubleValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x04ec
            r0 = 1
            goto L_0x04ed
        L_0x04ec:
            r0 = 0
        L_0x04ed:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x04f2:
            double r1 = r4.doubleValue()
            double r3 = r0.doubleValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0500
            r0 = 1
            goto L_0x0501
        L_0x0500:
            r0 = 0
        L_0x0501:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0506:
            double r1 = r4.doubleValue()
            double r3 = r0.doubleValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0514
            r0 = 1
            goto L_0x0515
        L_0x0514:
            r0 = 0
        L_0x0515:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x051a:
            r0 = 0
            return r0
        L_0x051c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for comparison operator"
            r0.<init>(r1)
            throw r0
        L_0x0524:
            r3 = r18
            r5 = r19
            java.lang.Boolean r0 = getMin((org.json.JSONObject) r18, (org.json.JSONObject) r19)
            return r0
        L_0x052d:
            r1 = 3
            r3 = r18
            r5 = r19
            boolean r6 = r3.has(r2)
            if (r6 == 0) goto L_0x0651
            java.lang.String r6 = r3.getString(r2)
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0560
            java.lang.String r6 = r3.getString(r2)
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x0560
            java.lang.String r6 = r3.getString(r2)
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0560
            java.lang.String r6 = r3.getString(r2)
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x0651
        L_0x0560:
            org.json.JSONArray r6 = r3.optJSONArray(r0)
            if (r6 == 0) goto L_0x0651
            org.json.JSONArray r6 = r3.getJSONArray(r0)
            int r6 = r6.length()
            r7 = 2
            if (r6 != r7) goto L_0x0651
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r6 = 0
            org.json.JSONObject r7 = r0.getJSONObject(r6)
            boolean r6 = r7.has(r4)
            if (r6 == 0) goto L_0x0585
            java.lang.Object r6 = setMin(r7, r5)
            goto L_0x0589
        L_0x0585:
            java.lang.Object r6 = setMax(r7, r5)
        L_0x0589:
            r7 = 1
            org.json.JSONObject r0 = r0.getJSONObject(r7)
            boolean r4 = r0.has(r4)
            if (r4 == 0) goto L_0x0599
            java.lang.Object r0 = setMin(r0, r5)
            goto L_0x059d
        L_0x0599:
            java.lang.Object r0 = setMax(r0, r5)
        L_0x059d:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r4 = getMin(r6)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r5 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Number
            if (r4 != r5) goto L_0x064f
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r4 = getMin(r0)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r5 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Number
            if (r4 != r5) goto L_0x064f
            java.lang.Double r4 = getMax(r6)
            double r4 = r4.doubleValue()
            java.lang.Double r0 = getMax(r0)
            double r6 = r0.doubleValue()
            java.lang.String r0 = r3.getString(r2)
            int r2 = r0.hashCode()
            r3 = 37
            if (r2 == r3) goto L_0x05ee
            r3 = 42
            if (r2 == r3) goto L_0x05e6
            r3 = 45
            if (r2 == r3) goto L_0x05de
            r3 = 47
            if (r2 == r3) goto L_0x05d6
            goto L_0x05f6
        L_0x05d6:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x05f6
            r0 = 2
            goto L_0x05f7
        L_0x05de:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x05f6
            r0 = 0
            goto L_0x05f7
        L_0x05e6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x05f6
            r0 = 1
            goto L_0x05f7
        L_0x05ee:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x05f6
            r0 = 3
            goto L_0x05f7
        L_0x05f6:
            r0 = -1
        L_0x05f7:
            if (r0 == 0) goto L_0x0649
            r2 = 1
            if (r0 == r2) goto L_0x0642
            r2 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0636
            if (r0 == r1) goto L_0x0604
            goto L_0x064f
        L_0x0604:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x064f
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0611
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            return r0
        L_0x0611:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0619
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0621
        L_0x0619:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0630
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0630
        L_0x0621:
            double r0 = r4 / r6
            double r0 = java.lang.Math.floor(r0)
            double r0 = r0 * r6
            double r0 = r0 - r4
            double r0 = -r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L_0x0630:
            double r4 = r4 % r6
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            return r0
        L_0x0636:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0640
            double r4 = r4 / r6
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            return r0
        L_0x0640:
            r0 = 0
            return r0
        L_0x0642:
            double r4 = r4 * r6
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            return r0
        L_0x0649:
            double r4 = r4 - r6
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            return r0
        L_0x064f:
            r0 = 0
            return r0
        L_0x0651:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for arithmetic operator"
            r0.<init>(r1)
            throw r0
        L_0x0659:
            r3 = r18
            r1 = r19
            boolean r6 = r3.has(r2)
            if (r6 == 0) goto L_0x06f4
            java.lang.String r2 = r3.getString(r2)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x06f4
            org.json.JSONArray r2 = r3.optJSONArray(r0)
            if (r2 == 0) goto L_0x06f4
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            int r2 = r2.length()
            r5 = 2
            if (r2 != r5) goto L_0x06f4
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r2 = 0
            org.json.JSONObject r2 = r0.getJSONObject(r2)
            boolean r3 = r2.has(r4)
            if (r3 == 0) goto L_0x0692
            java.lang.Object r2 = setMin(r2, r1)
            goto L_0x0696
        L_0x0692:
            java.lang.Object r2 = setMax(r2, r1)
        L_0x0696:
            r3 = 1
            org.json.JSONObject r0 = r0.getJSONObject(r3)
            boolean r3 = r0.has(r4)
            if (r3 == 0) goto L_0x06a6
            java.lang.Object r0 = setMin(r0, r1)
            goto L_0x06aa
        L_0x06a6:
            java.lang.Object r0 = setMax(r0, r1)
        L_0x06aa:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = getMin(r2)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r3 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Number
            if (r1 != r3) goto L_0x06d0
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = getMin(r0)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r3 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.Number
            if (r1 != r3) goto L_0x06d0
            java.lang.Double r1 = getMax(r2)
            double r1 = r1.doubleValue()
            java.lang.Double r0 = getMax(r0)
            double r3 = r0.doubleValue()
            double r1 = r1 + r3
            java.lang.Double r0 = java.lang.Double.valueOf(r1)
            return r0
        L_0x06d0:
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = getMin(r2)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r3 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.String
            if (r1 != r3) goto L_0x06f2
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r1 = getMin(r0)
            com.mixpanel.android.mpmetrics.SelectorEvaluator$PropertyType r3 = com.mixpanel.android.mpmetrics.SelectorEvaluator.PropertyType.String
            if (r1 != r3) goto L_0x06f2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x06f2:
            r0 = 0
            return r0
        L_0x06f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for operator: +"
            r0.<init>(r1)
            throw r0
        L_0x06fc:
            r3 = r18
            r1 = r19
            java.lang.Boolean r0 = length(r18, r19)
            return r0
        L_0x0705:
            r3 = r18
            r1 = r19
            boolean r5 = r3.has(r2)
            if (r5 == 0) goto L_0x0775
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r5 = "or"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x0775
            org.json.JSONArray r2 = r3.optJSONArray(r0)
            if (r2 == 0) goto L_0x0775
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            int r2 = r2.length()
            r5 = 2
            if (r2 != r5) goto L_0x0775
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r2 = 0
            org.json.JSONObject r3 = r0.getJSONObject(r2)
            boolean r2 = r3.has(r4)
            if (r2 == 0) goto L_0x0740
            java.lang.Object r2 = setMin(r3, r1)
            goto L_0x0744
        L_0x0740:
            java.lang.Object r2 = setMax(r3, r1)
        L_0x0744:
            java.lang.Boolean r2 = length((java.lang.Object) r2)
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x076f
            r2 = 1
            org.json.JSONObject r0 = r0.getJSONObject(r2)
            boolean r2 = r0.has(r4)
            if (r2 == 0) goto L_0x075e
            java.lang.Object r0 = setMin(r0, r1)
            goto L_0x0762
        L_0x075e:
            java.lang.Object r0 = setMax(r0, r1)
        L_0x0762:
            java.lang.Boolean r0 = length((java.lang.Object) r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x076d
            goto L_0x076f
        L_0x076d:
            r0 = 0
            goto L_0x0770
        L_0x076f:
            r0 = 1
        L_0x0770:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0775:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for operator: or"
            r0.<init>(r1)
            throw r0
        L_0x077d:
            r3 = r18
            r1 = r19
            boolean r5 = r3.has(r2)
            if (r5 == 0) goto L_0x07ec
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r5 = "and"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x07ec
            org.json.JSONArray r2 = r3.optJSONArray(r0)
            if (r2 == 0) goto L_0x07ec
            org.json.JSONArray r2 = r3.getJSONArray(r0)
            int r2 = r2.length()
            r5 = 2
            if (r2 != r5) goto L_0x07ec
            org.json.JSONArray r0 = r3.getJSONArray(r0)
            r2 = 0
            org.json.JSONObject r3 = r0.getJSONObject(r2)
            boolean r5 = r3.has(r4)
            if (r5 == 0) goto L_0x07b8
            java.lang.Object r3 = setMin(r3, r1)
            goto L_0x07bc
        L_0x07b8:
            java.lang.Object r3 = setMax(r3, r1)
        L_0x07bc:
            java.lang.Boolean r3 = length((java.lang.Object) r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x07e6
            r3 = 1
            org.json.JSONObject r0 = r0.getJSONObject(r3)
            boolean r4 = r0.has(r4)
            if (r4 == 0) goto L_0x07d6
            java.lang.Object r0 = setMin(r0, r1)
            goto L_0x07da
        L_0x07d6:
            java.lang.Object r0 = setMax(r0, r1)     // Catch:{ all -> 0x07fc }
        L_0x07da:
            java.lang.Boolean r0 = length((java.lang.Object) r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x07e6
            r0 = 1
            goto L_0x07e7
        L_0x07e6:
            r0 = 0
        L_0x07e7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x07ec:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid node for operator: and"
            r0.<init>(r1)
            throw r0
        L_0x07f4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing required keys: operator"
            r0.<init>(r1)
            throw r0
        L_0x07fc:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.mpmetrics.SelectorEvaluator.setMax(org.json.JSONObject, org.json.JSONObject):java.lang.Object");
    }

    public final boolean length(JSONObject jSONObject) throws JSONException {
        return length(setMax(this.getMin, jSONObject)).booleanValue();
    }
}
