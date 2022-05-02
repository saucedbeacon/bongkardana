package o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

final class AutoSubmitInterface extends setUiContext {
    static final /* synthetic */ boolean $assertionsDisabled = (!AutoSubmitInterface.class.desiredAssertionStatus());
    private static final int ConstructorId_UTC = -1;
    private static final int ConstructorId_now = -3;
    private static final int ConstructorId_parse = -2;
    private static final Object DATE_TAG = "Date";
    private static final double HalfTimeDomain = 8.64E15d;
    private static final double HoursPerDay = 24.0d;
    private static final int Id_constructor = 1;
    private static final int Id_getDate = 17;
    private static final int Id_getDay = 19;
    private static final int Id_getFullYear = 13;
    private static final int Id_getHours = 21;
    private static final int Id_getMilliseconds = 27;
    private static final int Id_getMinutes = 23;
    private static final int Id_getMonth = 15;
    private static final int Id_getSeconds = 25;
    private static final int Id_getTime = 11;
    private static final int Id_getTimezoneOffset = 29;
    private static final int Id_getUTCDate = 18;
    private static final int Id_getUTCDay = 20;
    private static final int Id_getUTCFullYear = 14;
    private static final int Id_getUTCHours = 22;
    private static final int Id_getUTCMilliseconds = 28;
    private static final int Id_getUTCMinutes = 24;
    private static final int Id_getUTCMonth = 16;
    private static final int Id_getUTCSeconds = 26;
    private static final int Id_getYear = 12;
    private static final int Id_setDate = 39;
    private static final int Id_setFullYear = 43;
    private static final int Id_setHours = 37;
    private static final int Id_setMilliseconds = 31;
    private static final int Id_setMinutes = 35;
    private static final int Id_setMonth = 41;
    private static final int Id_setSeconds = 33;
    private static final int Id_setTime = 30;
    private static final int Id_setUTCDate = 40;
    private static final int Id_setUTCFullYear = 44;
    private static final int Id_setUTCHours = 38;
    private static final int Id_setUTCMilliseconds = 32;
    private static final int Id_setUTCMinutes = 36;
    private static final int Id_setUTCMonth = 42;
    private static final int Id_setUTCSeconds = 34;
    private static final int Id_setYear = 45;
    private static final int Id_toDateString = 4;
    private static final int Id_toGMTString = 8;
    private static final int Id_toISOString = 46;
    private static final int Id_toJSON = 47;
    private static final int Id_toLocaleDateString = 7;
    private static final int Id_toLocaleString = 5;
    private static final int Id_toLocaleTimeString = 6;
    private static final int Id_toSource = 9;
    private static final int Id_toString = 2;
    private static final int Id_toTimeString = 3;
    private static final int Id_toUTCString = 8;
    private static final int Id_valueOf = 10;
    private static double LocalTZA = 0.0d;
    private static final int MAXARGS = 7;
    private static final int MAX_PROTOTYPE_ID = 47;
    private static final double MinutesPerDay = 1440.0d;
    private static final double MinutesPerHour = 60.0d;
    private static final double SecondsPerDay = 86400.0d;
    private static final double SecondsPerHour = 3600.0d;
    private static final double SecondsPerMinute = 60.0d;
    private static final String js_NaN_date_str = "Invalid Date";
    private static DateFormat localeDateFormatter = null;
    private static DateFormat localeDateTimeFormatter = null;
    private static DateFormat localeTimeFormatter = null;
    private static final double msPerDay = 8.64E7d;
    private static final double msPerHour = 3600000.0d;
    private static final double msPerMinute = 60000.0d;
    private static final double msPerSecond = 1000.0d;
    static final long serialVersionUID = -8307438915861678966L;
    private static TimeZone thisTimeZone;
    private static DateFormat timeZoneFormatter;
    private double date;

    private static double MakeDate(double d, double d2) {
        return (d * msPerDay) + d2;
    }

    private static double MakeTime(double d, double d2, double d3, double d4) {
        return (((((d * 60.0d) + d2) * 60.0d) + d3) * msPerSecond) + d4;
    }

    private static double TimeWithinDay(double d) {
        double d2 = d % msPerDay;
        return d2 < 0.0d ? d2 + msPerDay : d2;
    }

    private static int msFromTime(double d) {
        double d2 = d % msPerSecond;
        if (d2 < 0.0d) {
            d2 += msPerSecond;
        }
        return (int) d2;
    }

    public final String getClassName() {
        return "Date";
    }

    static void init(LogUtils logUtils, boolean z) {
        AutoSubmitInterface autoSubmitInterface = new AutoSubmitInterface();
        autoSubmitInterface.date = LogItem.Grayscale$Algorithm;
        autoSubmitInterface.exportAsJSClass(47, logUtils, z);
    }

    private AutoSubmitInterface() {
        if (thisTimeZone == null) {
            TimeZone timeZone = TimeZone.getDefault();
            thisTimeZone = timeZone;
            LocalTZA = (double) timeZone.getRawOffset();
        }
    }

    public final Object getDefaultValue(Class<?> cls) {
        if (cls == null) {
            cls = LogItem.toString;
        }
        return super.getDefaultValue(cls);
    }

    /* access modifiers changed from: package-private */
    public final double getJSTimeValue() {
        return this.date;
    }

    /* access modifiers changed from: protected */
    public final void fillConstructorProperties(EditTextUtil editTextUtil) {
        EditTextUtil editTextUtil2 = editTextUtil;
        addIdFunctionProperty(editTextUtil2, DATE_TAG, -3, "now", 0);
        addIdFunctionProperty(editTextUtil, DATE_TAG, -2, "parse", 1);
        addIdFunctionProperty(editTextUtil2, DATE_TAG, -1, "UTC", 7);
        super.fillConstructorProperties(editTextUtil);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        r0 = r1;
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00af, code lost:
        initPrototypeMethod(DATE_TAG, r6, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void initPrototypeId(int r6) {
        /*
            r5 = this;
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r6) {
                case 1: goto L_0x00aa;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a4;
                case 4: goto L_0x00a1;
                case 5: goto L_0x009e;
                case 6: goto L_0x009b;
                case 7: goto L_0x0098;
                case 8: goto L_0x0095;
                case 9: goto L_0x0092;
                case 10: goto L_0x008f;
                case 11: goto L_0x008c;
                case 12: goto L_0x0089;
                case 13: goto L_0x0086;
                case 14: goto L_0x0083;
                case 15: goto L_0x0080;
                case 16: goto L_0x007d;
                case 17: goto L_0x007a;
                case 18: goto L_0x0077;
                case 19: goto L_0x0074;
                case 20: goto L_0x0071;
                case 21: goto L_0x006e;
                case 22: goto L_0x006b;
                case 23: goto L_0x0068;
                case 24: goto L_0x0065;
                case 25: goto L_0x0062;
                case 26: goto L_0x005e;
                case 27: goto L_0x005a;
                case 28: goto L_0x0056;
                case 29: goto L_0x0052;
                case 30: goto L_0x004d;
                case 31: goto L_0x004a;
                case 32: goto L_0x0047;
                case 33: goto L_0x0042;
                case 34: goto L_0x003f;
                case 35: goto L_0x003a;
                case 36: goto L_0x0037;
                case 37: goto L_0x0031;
                case 38: goto L_0x002e;
                case 39: goto L_0x002b;
                case 40: goto L_0x0028;
                case 41: goto L_0x0025;
                case 42: goto L_0x0022;
                case 43: goto L_0x001f;
                case 44: goto L_0x001c;
                case 45: goto L_0x0019;
                case 46: goto L_0x0015;
                case 47: goto L_0x0012;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            throw r0
        L_0x0012:
            java.lang.String r0 = "toJSON"
            goto L_0x004f
        L_0x0015:
            java.lang.String r0 = "toISOString"
            goto L_0x00af
        L_0x0019:
            java.lang.String r0 = "setYear"
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "setUTCFullYear"
            goto L_0x003c
        L_0x001f:
            java.lang.String r0 = "setFullYear"
            goto L_0x003c
        L_0x0022:
            java.lang.String r0 = "setUTCMonth"
            goto L_0x0044
        L_0x0025:
            java.lang.String r0 = "setMonth"
            goto L_0x0044
        L_0x0028:
            java.lang.String r0 = "setUTCDate"
            goto L_0x004f
        L_0x002b:
            java.lang.String r0 = "setDate"
            goto L_0x004f
        L_0x002e:
            java.lang.String r1 = "setUTCHours"
            goto L_0x0033
        L_0x0031:
            java.lang.String r1 = "setHours"
        L_0x0033:
            r0 = r1
            r4 = 4
            goto L_0x00af
        L_0x0037:
            java.lang.String r0 = "setUTCMinutes"
            goto L_0x003c
        L_0x003a:
            java.lang.String r0 = "setMinutes"
        L_0x003c:
            r4 = 3
            goto L_0x00af
        L_0x003f:
            java.lang.String r0 = "setUTCSeconds"
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "setSeconds"
        L_0x0044:
            r4 = 2
            goto L_0x00af
        L_0x0047:
            java.lang.String r0 = "setUTCMilliseconds"
            goto L_0x004f
        L_0x004a:
            java.lang.String r0 = "setMilliseconds"
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "setTime"
        L_0x004f:
            r4 = 1
            goto L_0x00af
        L_0x0052:
            java.lang.String r0 = "getTimezoneOffset"
            goto L_0x00af
        L_0x0056:
            java.lang.String r0 = "getUTCMilliseconds"
            goto L_0x00af
        L_0x005a:
            java.lang.String r0 = "getMilliseconds"
            goto L_0x00af
        L_0x005e:
            java.lang.String r0 = "getUTCSeconds"
            goto L_0x00af
        L_0x0062:
            java.lang.String r0 = "getSeconds"
            goto L_0x00af
        L_0x0065:
            java.lang.String r0 = "getUTCMinutes"
            goto L_0x00af
        L_0x0068:
            java.lang.String r0 = "getMinutes"
            goto L_0x00af
        L_0x006b:
            java.lang.String r0 = "getUTCHours"
            goto L_0x00af
        L_0x006e:
            java.lang.String r0 = "getHours"
            goto L_0x00af
        L_0x0071:
            java.lang.String r0 = "getUTCDay"
            goto L_0x00af
        L_0x0074:
            java.lang.String r0 = "getDay"
            goto L_0x00af
        L_0x0077:
            java.lang.String r0 = "getUTCDate"
            goto L_0x00af
        L_0x007a:
            java.lang.String r0 = "getDate"
            goto L_0x00af
        L_0x007d:
            java.lang.String r0 = "getUTCMonth"
            goto L_0x00af
        L_0x0080:
            java.lang.String r0 = "getMonth"
            goto L_0x00af
        L_0x0083:
            java.lang.String r0 = "getUTCFullYear"
            goto L_0x00af
        L_0x0086:
            java.lang.String r0 = "getFullYear"
            goto L_0x00af
        L_0x0089:
            java.lang.String r0 = "getYear"
            goto L_0x00af
        L_0x008c:
            java.lang.String r0 = "getTime"
            goto L_0x00af
        L_0x008f:
            java.lang.String r0 = "valueOf"
            goto L_0x00af
        L_0x0092:
            java.lang.String r0 = "toSource"
            goto L_0x00af
        L_0x0095:
            java.lang.String r0 = "toUTCString"
            goto L_0x00af
        L_0x0098:
            java.lang.String r0 = "toLocaleDateString"
            goto L_0x00af
        L_0x009b:
            java.lang.String r0 = "toLocaleTimeString"
            goto L_0x00af
        L_0x009e:
            java.lang.String r0 = "toLocaleString"
            goto L_0x00af
        L_0x00a1:
            java.lang.String r0 = "toDateString"
            goto L_0x00af
        L_0x00a4:
            java.lang.String r0 = "toTimeString"
            goto L_0x00af
        L_0x00a7:
            java.lang.String r0 = "toString"
            goto L_0x00af
        L_0x00aa:
            r0 = 7
            java.lang.String r1 = "constructor"
            r0 = r1
            r4 = 7
        L_0x00af:
            java.lang.Object r1 = DATE_TAG
            r5.initPrototypeMethod(r1, r6, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.initPrototypeId(int):void");
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r12, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        double d;
        double d2;
        if (!editTextUtil.hasTag(DATE_TAG)) {
            return super.execIdCall(editTextUtil, r12, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        if (methodId == -3) {
            return LogItem.getMax(now());
        }
        if (methodId == -2) {
            return LogItem.getMax(date_parseString(LogItem.getMin(objArr)));
        }
        if (methodId == -1) {
            return LogItem.getMax(jsStaticFunction_UTC(objArr));
        }
        if (methodId != 1) {
            if (methodId == 47) {
                LogUtils min = LogItem.setMin(r12, logUtils, (Object) logUtils2);
                Object min2 = LogItem.getMin((Object) min, LogItem.toIntRange);
                if (min2 instanceof Number) {
                    double doubleValue = ((Number) min2).doubleValue();
                    if (doubleValue != doubleValue || Double.isInfinite(doubleValue)) {
                        return null;
                    }
                }
                Object property = ScriptableObject.getProperty(min, "toISOString");
                if (property == getMax) {
                    throw LogItem.setMin("msg.function.not.found.in", (Object) "toISOString", (Object) LogItem.getMin((Object) min));
                } else if (property instanceof announceSwitchKeyboard) {
                    Object call = ((announceSwitchKeyboard) property).call(r12, logUtils, min, LogItem.create);
                    if (LogItem.toDoubleRange(call)) {
                        return call;
                    }
                    throw LogItem.length("msg.toisostring.must.return.primitive", (Object) LogItem.getMin(call));
                } else {
                    throw LogItem.getMin("msg.isnt.function.in", "toISOString", LogItem.getMin((Object) min), LogItem.getMin(property));
                }
            } else if (logUtils2 instanceof AutoSubmitInterface) {
                AutoSubmitInterface autoSubmitInterface = (AutoSubmitInterface) logUtils2;
                double d3 = autoSubmitInterface.date;
                switch (methodId) {
                    case 2:
                    case 3:
                    case 4:
                        if (d3 == d3) {
                            return date_format(d3, methodId);
                        }
                        return js_NaN_date_str;
                    case 5:
                    case 6:
                    case 7:
                        if (d3 == d3) {
                            return toLocale_helper(d3, methodId);
                        }
                        return js_NaN_date_str;
                    case 8:
                        if (d3 == d3) {
                            return js_toUTCString(d3);
                        }
                        return js_NaN_date_str;
                    case 9:
                        StringBuilder sb = new StringBuilder("(new Date(");
                        sb.append(LogItem.setMin(d3));
                        sb.append("))");
                        return sb.toString();
                    case 10:
                    case 11:
                        return LogItem.getMax(d3);
                    case 12:
                    case 13:
                    case 14:
                        if (d3 == d3) {
                            if (methodId != 14) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) YearFromTime(d3);
                            if (methodId == 12 && (!r12.getMax(1) || (1900.0d <= d3 && d3 < 2000.0d))) {
                                Double.isNaN(d3);
                                d3 -= 1900.0d;
                            }
                        }
                        return LogItem.getMax(d3);
                    case 15:
                    case 16:
                        if (d3 == d3) {
                            if (methodId == 15) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) MonthFromTime(d3);
                        }
                        return LogItem.getMax(d3);
                    case 17:
                    case 18:
                        if (d3 == d3) {
                            if (methodId == 17) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) DateFromTime(d3);
                        }
                        return LogItem.getMax(d3);
                    case 19:
                    case 20:
                        if (d3 == d3) {
                            if (methodId == 19) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) WeekDay(d3);
                        }
                        return LogItem.getMax(d3);
                    case 21:
                    case 22:
                        if (d3 == d3) {
                            if (methodId == 21) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) HourFromTime(d3);
                        }
                        return LogItem.getMax(d3);
                    case 23:
                    case 24:
                        if (d3 == d3) {
                            if (methodId == 23) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) MinFromTime(d3);
                        }
                        return LogItem.getMax(d3);
                    case 25:
                    case 26:
                        if (d3 == d3) {
                            if (methodId == 25) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) SecFromTime(d3);
                        }
                        return LogItem.getMax(d3);
                    case 27:
                    case 28:
                        if (d3 == d3) {
                            if (methodId == 27) {
                                d3 = LocalTime(d3);
                            }
                            d3 = (double) msFromTime(d3);
                        }
                        return LogItem.getMax(d3);
                    case 29:
                        if (d3 == d3) {
                            d3 = (d3 - LocalTime(d3)) / msPerMinute;
                        }
                        return LogItem.getMax(d3);
                    case 30:
                        double TimeClip = TimeClip(LogItem.getMin(objArr, 0));
                        autoSubmitInterface.date = TimeClip;
                        return LogItem.getMax(TimeClip);
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                        double makeTime = makeTime(d3, objArr, methodId);
                        autoSubmitInterface.date = makeTime;
                        return LogItem.getMax(makeTime);
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        double makeDate = makeDate(d3, objArr, methodId);
                        autoSubmitInterface.date = makeDate;
                        return LogItem.getMax(makeDate);
                    case 45:
                        double min3 = LogItem.getMin(objArr, 0);
                        if (min3 != min3 || Double.isInfinite(min3)) {
                            d = LogItem.Grayscale$Algorithm;
                        } else {
                            if (d3 != d3) {
                                d2 = 0.0d;
                            } else {
                                d2 = LocalTime(d3);
                            }
                            if (min3 >= 0.0d && min3 <= 99.0d) {
                                min3 += 1900.0d;
                            }
                            d = TimeClip(internalUTC(MakeDate(MakeDay(min3, (double) MonthFromTime(d2), (double) DateFromTime(d2)), TimeWithinDay(d2))));
                        }
                        autoSubmitInterface.date = d;
                        return LogItem.getMax(d);
                    case 46:
                        if (d3 == d3) {
                            return js_toISOString(d3);
                        }
                        throw LogItem.setMin("RangeError", LogItem.getMax("msg.invalid.date"));
                    default:
                        throw new IllegalArgumentException(String.valueOf(methodId));
                }
            } else {
                throw incompatibleCallError(editTextUtil);
            }
        } else if (logUtils2 != null) {
            return date_format(now(), 2);
        } else {
            return jsConstructor(objArr);
        }
    }

    private static double Day(double d) {
        return Math.floor(d / msPerDay);
    }

    private static boolean IsLeapYear(int i) {
        if (i % 4 == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    private static double DayFromYear(double d) {
        return ((((d - 1970.0d) * 365.0d) + Math.floor((d - 1969.0d) / 4.0d)) - Math.floor((d - 1901.0d) / 100.0d)) + Math.floor((d - 1601.0d) / 400.0d);
    }

    private static double TimeFromYear(double d) {
        return DayFromYear(d) * msPerDay;
    }

    private static int YearFromTime(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return 0;
        }
        double floor = Math.floor(d / 3.1556952E10d) + 1970.0d;
        double TimeFromYear = TimeFromYear(floor);
        if (TimeFromYear > d) {
            floor -= 1.0d;
        } else if (TimeFromYear + (DaysInYear(floor) * msPerDay) <= d) {
            floor += 1.0d;
        }
        return (int) floor;
    }

    private static double DayFromMonth(int i, int i2) {
        int i3;
        int i4;
        int i5 = i * 30;
        if (i >= 7) {
            i4 = i / 2;
        } else if (i >= 2) {
            i4 = (i - 1) / 2;
        } else {
            i3 = i5 + i;
            if (i >= 2 && IsLeapYear(i2)) {
                i3++;
            }
            return (double) i3;
        }
        i3 = i5 + (i4 - 1);
        i3++;
        return (double) i3;
    }

    private static double DaysInYear(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return LogItem.Grayscale$Algorithm;
        }
        return IsLeapYear((int) d) ? 366.0d : 365.0d;
    }

    private static int DaysInMonth(int i, int i2) {
        return i2 == 2 ? IsLeapYear(i) ? 29 : 28 : i2 >= 8 ? 31 - (i2 & 1) : (i2 & 1) + 30;
    }

    private static int MonthFromTime(double d) {
        int i;
        int YearFromTime = YearFromTime(d);
        int Day = ((int) (Day(d) - DayFromYear((double) YearFromTime))) - 59;
        if (Day < 0) {
            return Day < -28 ? 0 : 1;
        }
        if (IsLeapYear(YearFromTime)) {
            if (Day == 0) {
                return 1;
            }
            Day--;
        }
        int i2 = Day / 30;
        switch (i2) {
            case 0:
                return 2;
            case 1:
                i = 31;
                break;
            case 2:
                i = 61;
                break;
            case 3:
                i = 92;
                break;
            case 4:
                i = 122;
                break;
            case 5:
                i = 153;
                break;
            case 6:
                i = 184;
                break;
            case 7:
                i = 214;
                break;
            case 8:
                i = 245;
                break;
            case 9:
                i = 275;
                break;
            case 10:
                return 11;
            default:
                throw getStyleId.setMin();
        }
        return Day >= i ? i2 + 2 : i2 + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r2 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        r3 = r3 - r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r3 >= 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        return r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int DateFromTime(double r3) {
        /*
            int r0 = YearFromTime(r3)
            double r3 = Day(r3)
            double r1 = (double) r0
            double r1 = DayFromYear(r1)
            double r3 = r3 - r1
            int r3 = (int) r3
            int r3 = r3 + -59
            r4 = 31
            if (r3 >= 0) goto L_0x001f
            r0 = -28
            if (r3 >= r0) goto L_0x001a
            int r3 = r3 + r4
        L_0x001a:
            int r3 = r3 + 28
        L_0x001c:
            int r3 = r3 + 1
            return r3
        L_0x001f:
            boolean r0 = IsLeapYear(r0)
            if (r0 == 0) goto L_0x002c
            if (r3 != 0) goto L_0x002a
            r3 = 29
            return r3
        L_0x002a:
            int r3 = r3 + -1
        L_0x002c:
            int r0 = r3 / 30
            float r0 = (float) r0
            int r0 = java.lang.Math.round(r0)
            r1 = 275(0x113, float:3.85E-43)
            r2 = 30
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0061;
                case 2: goto L_0x005e;
                case 3: goto L_0x0059;
                case 4: goto L_0x0056;
                case 5: goto L_0x0051;
                case 6: goto L_0x004c;
                case 7: goto L_0x0049;
                case 8: goto L_0x0044;
                case 9: goto L_0x0041;
                case 10: goto L_0x003f;
                default: goto L_0x003a;
            }
        L_0x003a:
            java.lang.RuntimeException r3 = o.getStyleId.setMin()
            throw r3
        L_0x003f:
            int r3 = r3 - r1
            goto L_0x001c
        L_0x0041:
            r4 = 275(0x113, float:3.85E-43)
            goto L_0x0063
        L_0x0044:
            r0 = 245(0xf5, float:3.43E-43)
            r4 = 245(0xf5, float:3.43E-43)
            goto L_0x0061
        L_0x0049:
            r4 = 214(0xd6, float:3.0E-43)
            goto L_0x0063
        L_0x004c:
            r0 = 184(0xb8, float:2.58E-43)
            r4 = 184(0xb8, float:2.58E-43)
            goto L_0x0061
        L_0x0051:
            r0 = 153(0x99, float:2.14E-43)
            r4 = 153(0x99, float:2.14E-43)
            goto L_0x0061
        L_0x0056:
            r4 = 122(0x7a, float:1.71E-43)
            goto L_0x0063
        L_0x0059:
            r0 = 92
            r4 = 92
            goto L_0x0061
        L_0x005e:
            r4 = 61
            goto L_0x0063
        L_0x0061:
            r2 = 31
        L_0x0063:
            int r3 = r3 - r4
            if (r3 >= 0) goto L_0x0067
            int r3 = r3 + r2
        L_0x0067:
            int r3 = r3 + 1
            return r3
        L_0x006a:
            int r3 = r3 + 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.DateFromTime(double):int");
    }

    private static int WeekDay(double d) {
        double Day = (Day(d) + 4.0d) % 7.0d;
        if (Day < 0.0d) {
            Day += 7.0d;
        }
        return (int) Day;
    }

    private static double now() {
        return (double) System.currentTimeMillis();
    }

    private static double DaylightSavingTA(double d) {
        if (d < 0.0d) {
            d = MakeDate(MakeDay((double) EquivalentYear(YearFromTime(d)), (double) MonthFromTime(d), (double) DateFromTime(d)), TimeWithinDay(d));
        }
        if (thisTimeZone.inDaylightTime(new Date((long) d))) {
            return msPerHour;
        }
        return 0.0d;
    }

    private static int EquivalentYear(int i) {
        int DayFromYear = (((int) DayFromYear((double) i)) + 4) % 7;
        if (DayFromYear < 0) {
            DayFromYear += 7;
        }
        if (IsLeapYear(i)) {
            switch (DayFromYear) {
                case 0:
                    return 1984;
                case 1:
                    return 1996;
                case 2:
                    return 1980;
                case 3:
                    return 1992;
                case 4:
                    return 1976;
                case 5:
                    return 1988;
                case 6:
                    return 1972;
            }
        } else {
            switch (DayFromYear) {
                case 0:
                    return 1978;
                case 1:
                    return 1973;
                case 2:
                    return 1985;
                case 3:
                    return 1986;
                case 4:
                    return 1981;
                case 5:
                    return 1971;
                case 6:
                    return 1977;
            }
        }
        throw getStyleId.setMin();
    }

    private static double LocalTime(double d) {
        return LocalTZA + d + DaylightSavingTA(d);
    }

    private static double internalUTC(double d) {
        double d2 = LocalTZA;
        return (d - d2) - DaylightSavingTA(d - d2);
    }

    private static int HourFromTime(double d) {
        double floor = Math.floor(d / msPerHour) % HoursPerDay;
        if (floor < 0.0d) {
            floor += HoursPerDay;
        }
        return (int) floor;
    }

    private static int MinFromTime(double d) {
        double floor = Math.floor(d / msPerMinute) % 60.0d;
        if (floor < 0.0d) {
            floor += 60.0d;
        }
        return (int) floor;
    }

    private static int SecFromTime(double d) {
        double floor = Math.floor(d / msPerSecond) % 60.0d;
        if (floor < 0.0d) {
            floor += 60.0d;
        }
        return (int) floor;
    }

    private static double MakeDay(double d, double d2, double d3) {
        double floor = d + Math.floor(d2 / 12.0d);
        double d4 = d2 % 12.0d;
        if (d4 < 0.0d) {
            d4 += 12.0d;
        }
        return ((Math.floor(TimeFromYear(floor) / msPerDay) + DayFromMonth((int) d4, (int) floor)) + d3) - 1.0d;
    }

    private static double TimeClip(double d) {
        if (d != d || d == Double.POSITIVE_INFINITY || d == Double.NEGATIVE_INFINITY || Math.abs(d) > HalfTimeDomain) {
            return LogItem.Grayscale$Algorithm;
        }
        if (d > 0.0d) {
            return Math.floor(d + 0.0d);
        }
        return Math.ceil(d + 0.0d);
    }

    private static double date_msecFromDate(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return MakeDate(MakeDay(d, d2, d3), MakeTime(d4, d5, d6, d7));
    }

    private static double date_msecFromArgs(Object[] objArr) {
        Object[] objArr2 = objArr;
        double[] dArr = new double[7];
        for (int i = 0; i < 7; i++) {
            if (i < objArr2.length) {
                double max = LogItem.getMax(objArr2[i]);
                if (max != max || Double.isInfinite(max)) {
                    return LogItem.Grayscale$Algorithm;
                }
                dArr[i] = LogItem.length(objArr2[i]);
            } else if (i == 2) {
                dArr[i] = 1.0d;
            } else {
                dArr[i] = 0.0d;
            }
        }
        if (dArr[0] >= 0.0d && dArr[0] <= 99.0d) {
            dArr[0] = dArr[0] + 1900.0d;
        }
        return date_msecFromDate(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5], dArr[6]);
    }

    private static double jsStaticFunction_UTC(Object[] objArr) {
        return TimeClip(date_msecFromArgs(objArr));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r0 = -1;
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bc, code lost:
        if (r8 != '-') goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
        if (r8 != '-') goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ce, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d0, code lost:
        r10 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d1, code lost:
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e0, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00e9, code lost:
        r10 = '-';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x010a, code lost:
        if (r13 != 7) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x010c, code lost:
        if (r8 != r10) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x010e, code lost:
        r16 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0111, code lost:
        r16 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x011d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double parseISOString(java.lang.String r34) {
        /*
            r0 = r34
            r1 = 9
            int[] r1 = new int[r1]
            r1 = {1970, 1, 1, 0, 0, 0, 0, -1, -1} // fill-array
            int r2 = r34.length()
            r3 = 84
            r4 = 43
            r5 = 4
            r6 = 6
            r7 = 3
            r8 = 45
            r9 = 0
            r11 = -1
            if (r2 == 0) goto L_0x0032
            char r12 = r0.charAt(r9)
            if (r12 == r4) goto L_0x0029
            if (r12 != r8) goto L_0x0023
            goto L_0x0029
        L_0x0023:
            if (r12 != r3) goto L_0x0032
            r12 = 1
            r13 = 3
            r14 = 1
            goto L_0x0035
        L_0x0029:
            if (r12 != r8) goto L_0x002d
            r12 = -1
            goto L_0x002e
        L_0x002d:
            r12 = 1
        L_0x002e:
            r13 = 0
            r14 = 1
            r15 = 6
            goto L_0x0036
        L_0x0032:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0035:
            r15 = 4
        L_0x0036:
            r16 = 1
        L_0x0038:
            r17 = 2
            r18 = 8
            r10 = 5
            r3 = 7
            if (r13 == r11) goto L_0x011d
            if (r13 != 0) goto L_0x0045
            r19 = r15
            goto L_0x004c
        L_0x0045:
            if (r13 != r6) goto L_0x004a
            r19 = 3
            goto L_0x004c
        L_0x004a:
            r19 = 2
        L_0x004c:
            int r11 = r14 + r19
            if (r11 <= r2) goto L_0x0054
        L_0x0050:
            r0 = -1
            r13 = -1
            goto L_0x011e
        L_0x0054:
            r19 = 0
        L_0x0056:
            if (r14 >= r11) goto L_0x0072
            char r8 = r0.charAt(r14)
            r4 = 48
            if (r8 < r4) goto L_0x0050
            r4 = 57
            if (r8 <= r4) goto L_0x0065
            goto L_0x0050
        L_0x0065:
            int r19 = r19 * 10
            int r8 = r8 + -48
            int r19 = r19 + r8
            int r14 = r14 + 1
            r4 = 43
            r8 = 45
            goto L_0x0056
        L_0x0072:
            r1[r13] = r19
            if (r14 != r2) goto L_0x007f
            if (r13 == r7) goto L_0x007c
            if (r13 == r3) goto L_0x007c
            goto L_0x011d
        L_0x007c:
            r13 = -1
            goto L_0x011d
        L_0x007f:
            int r4 = r14 + 1
            char r8 = r0.charAt(r14)
            r11 = 90
            if (r8 != r11) goto L_0x0098
            r1[r3] = r9
            r1[r18] = r9
            if (r13 == r5) goto L_0x0095
            if (r13 == r10) goto L_0x0095
            if (r13 == r6) goto L_0x0095
            r14 = r4
            goto L_0x0050
        L_0x0095:
            r14 = r4
            goto L_0x011d
        L_0x0098:
            r11 = 58
            switch(r13) {
                case 0: goto L_0x00fa;
                case 1: goto L_0x00fa;
                case 2: goto L_0x00ee;
                case 3: goto L_0x00e4;
                case 4: goto L_0x00d3;
                case 5: goto L_0x00bf;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00ab;
                case 8: goto L_0x00a5;
                default: goto L_0x009d;
            }
        L_0x009d:
            r10 = 45
            r11 = 84
        L_0x00a1:
            r14 = 43
            goto L_0x010a
        L_0x00a5:
            r10 = 45
            r11 = 84
            r13 = -1
            goto L_0x00a1
        L_0x00ab:
            if (r8 == r11) goto L_0x00af
            int r4 = r4 + -1
        L_0x00af:
            r10 = 45
            r11 = 84
            r13 = 8
            goto L_0x00a1
        L_0x00b6:
            r14 = 43
            r13 = 45
            if (r8 == r14) goto L_0x00d0
            if (r8 != r13) goto L_0x00ce
            goto L_0x00d0
        L_0x00bf:
            r13 = 45
            r14 = 43
            r10 = 46
            if (r8 != r10) goto L_0x00c9
            r10 = 6
            goto L_0x00d1
        L_0x00c9:
            if (r8 == r14) goto L_0x00d0
            if (r8 != r13) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            r10 = -1
            goto L_0x00d1
        L_0x00d0:
            r10 = 7
        L_0x00d1:
            r13 = r10
            goto L_0x00e9
        L_0x00d3:
            r13 = 45
            r14 = 43
            if (r8 != r11) goto L_0x00db
            r13 = 5
            goto L_0x00e9
        L_0x00db:
            if (r8 == r14) goto L_0x00e2
            if (r8 != r13) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            r13 = -1
            goto L_0x00e9
        L_0x00e2:
            r13 = 7
            goto L_0x00e9
        L_0x00e4:
            r14 = 43
            if (r8 != r11) goto L_0x00e0
            r13 = 4
        L_0x00e9:
            r10 = 45
            r11 = 84
            goto L_0x010a
        L_0x00ee:
            r11 = 84
            r14 = 43
            if (r8 != r11) goto L_0x00f6
            r13 = 3
            goto L_0x00f7
        L_0x00f6:
            r13 = -1
        L_0x00f7:
            r10 = 45
            goto L_0x010a
        L_0x00fa:
            r10 = 45
            r11 = 84
            r14 = 43
            if (r8 != r10) goto L_0x0105
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0105:
            if (r8 != r11) goto L_0x0109
            r13 = 3
            goto L_0x010a
        L_0x0109:
            r13 = -1
        L_0x010a:
            if (r13 != r3) goto L_0x0113
            if (r8 != r10) goto L_0x0111
            r16 = -1
            goto L_0x0113
        L_0x0111:
            r16 = 1
        L_0x0113:
            r14 = r4
            r3 = 84
            r4 = 43
            r8 = 45
            r11 = -1
            goto L_0x0038
        L_0x011d:
            r0 = -1
        L_0x011e:
            if (r13 == r0) goto L_0x01af
            if (r14 != r2) goto L_0x01af
            r0 = r1[r9]
            r2 = 1
            r4 = r1[r2]
            r2 = r1[r17]
            r7 = r1[r7]
            r5 = r1[r5]
            r8 = r1[r10]
            r6 = r1[r6]
            r3 = r1[r3]
            r1 = r1[r18]
            r9 = 275943(0x435e7, float:3.86679E-40)
            if (r0 > r9) goto L_0x01af
            if (r4 <= 0) goto L_0x01af
            r9 = 12
            if (r4 > r9) goto L_0x01af
            if (r2 <= 0) goto L_0x01af
            int r9 = DaysInMonth(r0, r4)
            if (r2 > r9) goto L_0x01af
            r9 = 24
            if (r7 > r9) goto L_0x01af
            if (r7 != r9) goto L_0x0154
            if (r5 > 0) goto L_0x01af
            if (r8 > 0) goto L_0x01af
            if (r6 > 0) goto L_0x01af
        L_0x0154:
            r9 = 59
            if (r5 > r9) goto L_0x01af
            if (r8 > r9) goto L_0x01af
            r10 = 23
            if (r3 > r10) goto L_0x01af
            if (r1 > r9) goto L_0x01af
            int r0 = r0 * r12
            double r9 = (double) r0
            r0 = 1
            int r4 = r4 - r0
            double r11 = (double) r4
            double r13 = (double) r2
            r34 = r1
            double r0 = (double) r7
            double r4 = (double) r5
            double r7 = (double) r8
            r15 = r3
            double r2 = (double) r6
            r20 = r9
            r22 = r11
            r24 = r13
            r26 = r0
            r28 = r4
            r30 = r7
            r32 = r2
            double r0 = date_msecFromDate(r20, r22, r24, r26, r28, r30, r32)
            r2 = r15
            r3 = -1
            if (r2 == r3) goto L_0x019c
            int r3 = r2 * 60
            int r3 = r3 + r34
            double r2 = (double) r3
            r4 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            r10 = r16
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            double r0 = r0 - r2
        L_0x019c:
            r2 = -4377866037058863104(0xc33eb208c2dc0000, double:-8.64E15)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x01af
            r2 = 4845505999795912704(0x433eb208c2dc0000, double:8.64E15)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x01af
            return r0
        L_0x01af:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.parseISOString(java.lang.String):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0226, code lost:
        if (r3 <= '9') goto L_0x0228;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x011b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0151 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double date_parseString(java.lang.String r38) {
        /*
            r6 = r38
            double r0 = parseISOString(r38)
            int r2 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000b
            return r0
        L_0x000b:
            int r7 = r38.length()
            r16 = 0
            r0 = -1
            r18 = 0
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = -1
            r4 = -1
            r5 = -1
            r19 = -1
            r20 = -1
            r21 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r23 = 0
        L_0x0022:
            if (r0 >= r7) goto L_0x0236
            char r8 = r6.charAt(r0)
            int r0 = r0 + 1
            r9 = 57
            r10 = 32
            r11 = 48
            r12 = 45
            if (r8 <= r10) goto L_0x0211
            r13 = 44
            if (r8 == r13) goto L_0x0211
            if (r8 != r12) goto L_0x003c
            goto L_0x0211
        L_0x003c:
            r14 = 40
            if (r8 != r14) goto L_0x0057
            r15 = 1
        L_0x0041:
            if (r0 >= r7) goto L_0x0022
            char r8 = r6.charAt(r0)
            int r0 = r0 + 1
            if (r8 != r14) goto L_0x004e
            int r15 = r15 + 1
            goto L_0x0041
        L_0x004e:
            r9 = 41
            if (r8 != r9) goto L_0x0041
            int r15 = r15 + -1
            if (r15 > 0) goto L_0x0041
            goto L_0x0022
        L_0x0057:
            r14 = 58
            r15 = 43
            r10 = 47
            if (r11 > r8) goto L_0x0126
            if (r8 > r9) goto L_0x0126
            int r26 = r8 + -48
            r13 = r26
        L_0x0065:
            if (r0 >= r7) goto L_0x0076
            char r8 = r6.charAt(r0)
            if (r11 > r8) goto L_0x0076
            if (r8 > r9) goto L_0x0076
            int r13 = r13 * 10
            int r13 = r13 + r8
            int r13 = r13 - r11
            int r0 = r0 + 1
            goto L_0x0065
        L_0x0076:
            r9 = 60
            if (r1 == r15) goto L_0x0100
            if (r1 != r12) goto L_0x007e
            goto L_0x0100
        L_0x007e:
            r11 = 70
            if (r13 >= r11) goto L_0x00e3
            if (r1 != r10) goto L_0x008c
            if (r4 < 0) goto L_0x008c
            if (r3 < 0) goto L_0x008c
            if (r5 >= 0) goto L_0x008c
            goto L_0x00e3
        L_0x008c:
            if (r8 != r14) goto L_0x0099
            if (r2 >= 0) goto L_0x0093
            r2 = r13
            goto L_0x0123
        L_0x0093:
            if (r20 >= 0) goto L_0x0096
            goto L_0x00d2
        L_0x0096:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x0099:
            if (r8 != r10) goto L_0x00a8
            if (r4 >= 0) goto L_0x00a2
            int r13 = r13 + -1
            r4 = r13
            goto L_0x0123
        L_0x00a2:
            if (r3 >= 0) goto L_0x00a5
            goto L_0x00de
        L_0x00a5:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x00a8:
            if (r0 >= r7) goto L_0x00b7
            r1 = 44
            if (r8 == r1) goto L_0x00b7
            r1 = 32
            if (r8 <= r1) goto L_0x00b7
            if (r8 == r12) goto L_0x00b7
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x00b7:
            if (r23 == 0) goto L_0x00ce
            if (r13 >= r9) goto L_0x00ce
            int r1 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c7
            double r8 = (double) r13
            java.lang.Double.isNaN(r8)
            double r21 = r21 - r8
            goto L_0x0123
        L_0x00c7:
            double r8 = (double) r13
            java.lang.Double.isNaN(r8)
            double r21 = r21 + r8
            goto L_0x0123
        L_0x00ce:
            if (r2 < 0) goto L_0x00d5
            if (r20 >= 0) goto L_0x00d5
        L_0x00d2:
            r20 = r13
            goto L_0x0123
        L_0x00d5:
            if (r20 < 0) goto L_0x00dc
            if (r19 >= 0) goto L_0x00dc
            r19 = r13
            goto L_0x0123
        L_0x00dc:
            if (r3 >= 0) goto L_0x00e0
        L_0x00de:
            r3 = r13
            goto L_0x0123
        L_0x00e0:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x00e3:
            if (r5 < 0) goto L_0x00e8
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x00e8:
            r1 = 32
            if (r8 <= r1) goto L_0x00f8
            r1 = 44
            if (r8 == r1) goto L_0x00f8
            if (r8 == r10) goto L_0x00f8
            if (r0 < r7) goto L_0x00f5
            goto L_0x00f8
        L_0x00f5:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x00f8:
            r1 = 100
            if (r13 >= r1) goto L_0x00fe
            int r13 = r13 + 1900
        L_0x00fe:
            r5 = r13
            goto L_0x0123
        L_0x0100:
            r8 = 24
            if (r13 >= r8) goto L_0x0107
            int r13 = r13 * 60
            goto L_0x010e
        L_0x0107:
            int r8 = r13 % 100
            int r13 = r13 / 100
            int r13 = r13 * 60
            int r13 = r13 + r8
        L_0x010e:
            if (r1 != r15) goto L_0x0111
            int r13 = -r13
        L_0x0111:
            int r1 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r1 == 0) goto L_0x011e
            r8 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x011e
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x011e:
            double r8 = (double) r13
            r21 = r8
            r23 = 1
        L_0x0123:
            r1 = 0
            goto L_0x0022
        L_0x0126:
            if (r8 == r10) goto L_0x020b
            if (r8 == r14) goto L_0x020b
            if (r8 == r15) goto L_0x020b
            if (r8 != r12) goto L_0x0130
            goto L_0x020b
        L_0x0130:
            int r8 = r0 + -1
            r9 = r0
        L_0x0133:
            if (r9 >= r7) goto L_0x014c
            char r0 = r6.charAt(r9)
            r10 = 65
            if (r10 > r0) goto L_0x0141
            r10 = 90
            if (r0 <= r10) goto L_0x0149
        L_0x0141:
            r10 = 97
            if (r10 > r0) goto L_0x014c
            r10 = 122(0x7a, float:1.71E-43)
            if (r0 > r10) goto L_0x014c
        L_0x0149:
            int r9 = r9 + 1
            goto L_0x0133
        L_0x014c:
            int r10 = r9 - r8
            r11 = 2
            if (r10 >= r11) goto L_0x0154
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x0154:
            java.lang.String r12 = "am;pm;monday;tuesday;wednesday;thursday;friday;saturday;sunday;january;february;march;april;may;june;july;august;september;october;november;december;gmt;ut;utc;est;edt;cst;cdt;mst;mdt;pst;pdt;"
            r13 = 0
            r14 = 0
        L_0x0158:
            r0 = 59
            int r15 = r12.indexOf(r0, r13)
            if (r15 >= 0) goto L_0x0163
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x0163:
            r24 = 1
            r0 = r12
            r25 = r1
            r1 = r24
            r24 = r9
            r9 = r2
            r2 = r13
            r13 = r3
            r3 = r38
            r26 = r12
            r12 = r4
            r4 = r8
            r27 = r5
            r5 = r10
            boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x018f
            int r0 = r15 + 1
            int r14 = r14 + 1
            r2 = r9
            r4 = r12
            r3 = r13
            r9 = r24
            r1 = r25
            r12 = r26
            r5 = r27
            r13 = r0
            goto L_0x0158
        L_0x018f:
            r0 = 12
            if (r14 >= r11) goto L_0x01b0
            if (r9 > r0) goto L_0x01ad
            if (r9 >= 0) goto L_0x0198
            goto L_0x01ad
        L_0x0198:
            if (r14 != 0) goto L_0x01a7
            if (r9 != r0) goto L_0x0205
            r4 = r12
            r3 = r13
            r0 = r24
            r1 = r25
            r5 = r27
            r2 = 0
            goto L_0x0022
        L_0x01a7:
            if (r9 == r0) goto L_0x0205
            int r2 = r9 + 12
            goto L_0x0206
        L_0x01ad:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x01b0:
            int r14 = r14 + -2
            r1 = 7
            if (r14 < r1) goto L_0x0205
            int r4 = r14 + -7
            if (r4 >= r0) goto L_0x01c0
            if (r12 >= 0) goto L_0x01bd
            r2 = r9
            goto L_0x0207
        L_0x01bd:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x01c0:
            int r4 = r4 + -12
            switch(r4) {
                case 0: goto L_0x01ff;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01ff;
                case 3: goto L_0x01ef;
                case 4: goto L_0x01ec;
                case 5: goto L_0x01dc;
                case 6: goto L_0x01ef;
                case 7: goto L_0x01cc;
                case 8: goto L_0x01dc;
                case 9: goto L_0x01c9;
                case 10: goto L_0x01cc;
                default: goto L_0x01c5;
            }
        L_0x01c5:
            o.getStyleId.setMin()
            goto L_0x0205
        L_0x01c9:
            r21 = 4647151865492930560(0x407e000000000000, double:480.0)
            goto L_0x0205
        L_0x01cc:
            r2 = r9
            r4 = r12
            r3 = r13
            r0 = r24
            r1 = r25
            r5 = r27
            r21 = 4646096334330265600(0x407a400000000000, double:420.0)
            goto L_0x0022
        L_0x01dc:
            r2 = r9
            r4 = r12
            r3 = r13
            r0 = r24
            r1 = r25
            r5 = r27
            r21 = 4645040803167600640(0x4076800000000000, double:360.0)
            goto L_0x0022
        L_0x01ec:
            r21 = 4642648265865560064(0x406e000000000000, double:240.0)
            goto L_0x0205
        L_0x01ef:
            r2 = r9
            r4 = r12
            r3 = r13
            r0 = r24
            r1 = r25
            r5 = r27
            r21 = 4643985272004935680(0x4072c00000000000, double:300.0)
            goto L_0x0022
        L_0x01ff:
            r2 = r9
            r4 = r12
            r3 = r13
            r21 = r16
            goto L_0x0208
        L_0x0205:
            r2 = r9
        L_0x0206:
            r4 = r12
        L_0x0207:
            r3 = r13
        L_0x0208:
            r0 = r24
            goto L_0x0230
        L_0x020b:
            r9 = r2
            r13 = r3
            r12 = r4
            r27 = r5
            goto L_0x0228
        L_0x0211:
            r25 = r1
            r9 = r2
            r13 = r3
            r12 = r4
            r27 = r5
            r1 = 57
            r2 = 45
            if (r0 >= r7) goto L_0x022d
            char r3 = r6.charAt(r0)
            if (r8 != r2) goto L_0x022d
            if (r11 > r3) goto L_0x022d
            if (r3 > r1) goto L_0x022d
        L_0x0228:
            r1 = r8
            r2 = r9
            r4 = r12
            r3 = r13
            goto L_0x0232
        L_0x022d:
            r2 = r9
            r4 = r12
            r3 = r13
        L_0x0230:
            r1 = r25
        L_0x0232:
            r5 = r27
            goto L_0x0022
        L_0x0236:
            r9 = r2
            r13 = r3
            r12 = r4
            if (r5 < 0) goto L_0x027c
            if (r12 < 0) goto L_0x027c
            if (r13 >= 0) goto L_0x0240
            goto L_0x027c
        L_0x0240:
            if (r19 >= 0) goto L_0x0244
            r0 = 0
            goto L_0x0246
        L_0x0244:
            r0 = r19
        L_0x0246:
            if (r20 >= 0) goto L_0x024a
            r1 = 0
            goto L_0x024c
        L_0x024a:
            r1 = r20
        L_0x024c:
            if (r9 >= 0) goto L_0x024f
            r9 = 0
        L_0x024f:
            double r2 = (double) r5
            double r4 = (double) r12
            double r6 = (double) r13
            double r8 = (double) r9
            double r10 = (double) r1
            double r0 = (double) r0
            r36 = 0
            r24 = r2
            r26 = r4
            r28 = r6
            r30 = r8
            r32 = r10
            r34 = r0
            double r0 = date_msecFromDate(r24, r26, r28, r30, r32, r34, r36)
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r4 = (r21 > r2 ? 1 : (r21 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0272
            double r0 = internalUTC(r0)
            return r0
        L_0x0272:
            r2 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r21 = r21 * r2
            double r0 = r0 + r21
            return r0
        L_0x027c:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.date_parseString(java.lang.String):double");
    }

    private static String date_format(double d, int i) {
        StringBuilder sb = new StringBuilder(60);
        double LocalTime = LocalTime(d);
        if (i != 3) {
            appendWeekDayName(sb, WeekDay(LocalTime));
            sb.append(' ');
            appendMonthName(sb, MonthFromTime(LocalTime));
            sb.append(' ');
            append0PaddedUint(sb, DateFromTime(LocalTime), 2);
            sb.append(' ');
            int YearFromTime = YearFromTime(LocalTime);
            if (YearFromTime < 0) {
                sb.append('-');
                YearFromTime = -YearFromTime;
            }
            append0PaddedUint(sb, YearFromTime, 4);
            if (i != 4) {
                sb.append(' ');
            }
        }
        if (i != 4) {
            append0PaddedUint(sb, HourFromTime(LocalTime), 2);
            sb.append(':');
            append0PaddedUint(sb, MinFromTime(LocalTime), 2);
            sb.append(':');
            append0PaddedUint(sb, SecFromTime(LocalTime), 2);
            int floor = (int) Math.floor((LocalTZA + DaylightSavingTA(d)) / msPerMinute);
            int i2 = ((floor / 60) * 100) + (floor % 60);
            if (i2 > 0) {
                sb.append(" GMT+");
            } else {
                sb.append(" GMT-");
                i2 = -i2;
            }
            append0PaddedUint(sb, i2, 4);
            if (timeZoneFormatter == null) {
                timeZoneFormatter = new SimpleDateFormat("zzz");
            }
            if (d < 0.0d) {
                d = MakeDate(MakeDay((double) EquivalentYear(YearFromTime(LocalTime)), (double) MonthFromTime(d), (double) DateFromTime(d)), TimeWithinDay(d));
            }
            sb.append(" (");
            Date date2 = new Date((long) d);
            synchronized (timeZoneFormatter) {
                sb.append(timeZoneFormatter.format(date2));
            }
            sb.append(')');
        }
        return sb.toString();
    }

    private static Object jsConstructor(Object[] objArr) {
        double d;
        AutoSubmitInterface autoSubmitInterface = new AutoSubmitInterface();
        if (objArr.length == 0) {
            autoSubmitInterface.date = now();
            return autoSubmitInterface;
        } else if (objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof LogUtils) {
                obj = ((LogUtils) obj).getDefaultValue((Class<?>) null);
            }
            if (obj instanceof CharSequence) {
                d = date_parseString(obj.toString());
            } else {
                d = LogItem.getMax(obj);
            }
            autoSubmitInterface.date = TimeClip(d);
            return autoSubmitInterface;
        } else {
            double date_msecFromArgs = date_msecFromArgs(objArr);
            if (!Double.isNaN(date_msecFromArgs) && !Double.isInfinite(date_msecFromArgs)) {
                date_msecFromArgs = TimeClip(internalUTC(date_msecFromArgs));
            }
            autoSubmitInterface.date = date_msecFromArgs;
            return autoSubmitInterface;
        }
    }

    private static String toLocale_helper(double d, int i) {
        DateFormat dateFormat;
        String format;
        if (i == 5) {
            if (localeDateTimeFormatter == null) {
                localeDateTimeFormatter = DateFormat.getDateTimeInstance(1, 1);
            }
            dateFormat = localeDateTimeFormatter;
        } else if (i == 6) {
            if (localeTimeFormatter == null) {
                localeTimeFormatter = DateFormat.getTimeInstance(1);
            }
            dateFormat = localeTimeFormatter;
        } else if (i == 7) {
            if (localeDateFormatter == null) {
                localeDateFormatter = DateFormat.getDateInstance(1);
            }
            dateFormat = localeDateFormatter;
        } else {
            throw new AssertionError();
        }
        synchronized (dateFormat) {
            format = dateFormat.format(new Date((long) d));
        }
        return format;
    }

    private static String js_toUTCString(double d) {
        StringBuilder sb = new StringBuilder(60);
        appendWeekDayName(sb, WeekDay(d));
        sb.append(", ");
        append0PaddedUint(sb, DateFromTime(d), 2);
        sb.append(' ');
        appendMonthName(sb, MonthFromTime(d));
        sb.append(' ');
        int YearFromTime = YearFromTime(d);
        if (YearFromTime < 0) {
            sb.append('-');
            YearFromTime = -YearFromTime;
        }
        append0PaddedUint(sb, YearFromTime, 4);
        sb.append(' ');
        append0PaddedUint(sb, HourFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, MinFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, SecFromTime(d), 2);
        sb.append(" GMT");
        return sb.toString();
    }

    private static String js_toISOString(double d) {
        StringBuilder sb = new StringBuilder(27);
        int YearFromTime = YearFromTime(d);
        if (YearFromTime < 0) {
            sb.append('-');
            append0PaddedUint(sb, -YearFromTime, 6);
        } else if (YearFromTime > 9999) {
            append0PaddedUint(sb, YearFromTime, 6);
        } else {
            append0PaddedUint(sb, YearFromTime, 4);
        }
        sb.append('-');
        append0PaddedUint(sb, MonthFromTime(d) + 1, 2);
        sb.append('-');
        append0PaddedUint(sb, DateFromTime(d), 2);
        sb.append('T');
        append0PaddedUint(sb, HourFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, MinFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, SecFromTime(d), 2);
        sb.append('.');
        append0PaddedUint(sb, msFromTime(d), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static void append0PaddedUint(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            getStyleId.setMin();
        }
        int i3 = i2 - 1;
        int i4 = 1000000000;
        if (i < 10) {
            i4 = 1;
        } else if (i < 1000000000) {
            i4 = 1;
            while (true) {
                int i5 = i4 * 10;
                if (i < i5) {
                    break;
                }
                i3--;
                i4 = i5;
            }
        } else {
            i3 -= 9;
        }
        while (i3 > 0) {
            sb.append('0');
            i3--;
        }
        while (i4 != 1) {
            sb.append((char) ((i / i4) + 48));
            i %= i4;
            i4 /= 10;
        }
        sb.append((char) (i + 48));
    }

    private static void appendMonthName(StringBuilder sb, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 != 3; i3++) {
            sb.append("JanFebMarAprMayJunJulAugSepOctNovDec".charAt(i2 + i3));
        }
    }

    private static void appendWeekDayName(StringBuilder sb, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 != 3; i3++) {
            sb.append("SunMonTueWedThuFriSat".charAt(i2 + i3));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        if (r0.length >= r7) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
        r8 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        r8 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
        if ($assertionsDisabled != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0032, code lost:
        if (r8 > 4) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        r9 = new double[4];
        r10 = 0;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003f, code lost:
        if (r10 >= r8) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        r12 = o.LogItem.getMax(r0[r10]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
        if (r12 != r12) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (java.lang.Double.isInfinite(r12) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
        r9[r10] = o.LogItem.setMax(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        if (r11 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        if (r20 == r20) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        if (r6 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r10 = LocalTime(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        r10 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (r7 < 4) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        if (r8 <= 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        r12 = r9[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        r12 = (double) HourFromTime(r10);
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007b, code lost:
        if (r7 < 3) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007d, code lost:
        if (r4 >= r8) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007f, code lost:
        r14 = r9[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0086, code lost:
        r14 = (double) MinFromTime(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r7 < 2) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008e, code lost:
        if (r4 >= r8) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0090, code lost:
        r1 = r9[r4];
        r4 = r4 + 1;
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0098, code lost:
        r16 = (double) SecFromTime(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x009f, code lost:
        if (r7 <= 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a1, code lost:
        if (r4 >= r8) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a3, code lost:
        r0 = r9[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00a6, code lost:
        r0 = (double) msFromTime(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ab, code lost:
        r0 = MakeDate(Day(r10), MakeTime(r12, r14, r16, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b9, code lost:
        if (r6 == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bb, code lost:
        r0 = internalUTC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c3, code lost:
        return TimeClip(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c6, code lost:
        return o.LogItem.Grayscale$Algorithm;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double makeTime(double r20, java.lang.Object[] r22, int r23) {
        /*
            r0 = r22
            int r1 = r0.length
            if (r1 != 0) goto L_0x0008
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x0008:
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 1
            r5 = 0
            switch(r23) {
                case 31: goto L_0x0026;
                case 32: goto L_0x0024;
                case 33: goto L_0x0021;
                case 34: goto L_0x001f;
                case 35: goto L_0x001c;
                case 36: goto L_0x001a;
                case 37: goto L_0x0017;
                case 38: goto L_0x0015;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x0015:
            r6 = 0
            goto L_0x0018
        L_0x0017:
            r6 = 1
        L_0x0018:
            r7 = 4
            goto L_0x0028
        L_0x001a:
            r6 = 0
            goto L_0x001d
        L_0x001c:
            r6 = 1
        L_0x001d:
            r7 = 3
            goto L_0x0028
        L_0x001f:
            r6 = 0
            goto L_0x0022
        L_0x0021:
            r6 = 1
        L_0x0022:
            r7 = 2
            goto L_0x0028
        L_0x0024:
            r6 = 0
            goto L_0x0027
        L_0x0026:
            r6 = 1
        L_0x0027:
            r7 = 1
        L_0x0028:
            int r8 = r0.length
            if (r8 >= r7) goto L_0x002d
            int r8 = r0.length
            goto L_0x002e
        L_0x002d:
            r8 = r7
        L_0x002e:
            boolean r9 = $assertionsDisabled
            if (r9 != 0) goto L_0x003b
            if (r8 > r3) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x003b:
            double[] r9 = new double[r3]
            r10 = 0
            r11 = 0
        L_0x003f:
            if (r10 >= r8) goto L_0x005d
            r12 = r0[r10]
            double r12 = o.LogItem.getMax((java.lang.Object) r12)
            int r14 = (r12 > r12 ? 1 : (r12 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0059
            boolean r14 = java.lang.Double.isInfinite(r12)
            if (r14 == 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            double r12 = o.LogItem.setMax((double) r12)
            r9[r10] = r12
            goto L_0x005a
        L_0x0059:
            r11 = 1
        L_0x005a:
            int r10 = r10 + 1
            goto L_0x003f
        L_0x005d:
            if (r11 != 0) goto L_0x00c4
            int r0 = (r20 > r20 ? 1 : (r20 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0065
            goto L_0x00c4
        L_0x0065:
            if (r6 == 0) goto L_0x006c
            double r10 = LocalTime(r20)
            goto L_0x006e
        L_0x006c:
            r10 = r20
        L_0x006e:
            if (r7 < r3) goto L_0x0075
            if (r8 <= 0) goto L_0x0075
            r12 = r9[r5]
            goto L_0x007b
        L_0x0075:
            int r0 = HourFromTime(r10)
            double r12 = (double) r0
            r4 = 0
        L_0x007b:
            if (r7 < r1) goto L_0x0086
            if (r4 >= r8) goto L_0x0086
            int r0 = r4 + 1
            r3 = r9[r4]
            r14 = r3
            r4 = r0
            goto L_0x008c
        L_0x0086:
            int r0 = MinFromTime(r10)
            double r0 = (double) r0
            r14 = r0
        L_0x008c:
            if (r7 < r2) goto L_0x0098
            if (r4 >= r8) goto L_0x0098
            int r0 = r4 + 1
            r1 = r9[r4]
            r4 = r0
            r16 = r1
            goto L_0x009f
        L_0x0098:
            int r0 = SecFromTime(r10)
            double r0 = (double) r0
            r16 = r0
        L_0x009f:
            if (r7 <= 0) goto L_0x00a6
            if (r4 >= r8) goto L_0x00a6
            r0 = r9[r4]
            goto L_0x00ab
        L_0x00a6:
            int r0 = msFromTime(r10)
            double r0 = (double) r0
        L_0x00ab:
            r18 = r0
            double r0 = MakeTime(r12, r14, r16, r18)
            double r2 = Day(r10)
            double r0 = MakeDate(r2, r0)
            if (r6 == 0) goto L_0x00bf
            double r0 = internalUTC(r0)
        L_0x00bf:
            double r0 = TimeClip(r0)
            return r0
        L_0x00c4:
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.makeTime(double, java.lang.Object[], int):double");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        if (r0.length >= r6) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r7 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002a, code lost:
        if ($assertionsDisabled != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002c, code lost:
        if (r7 <= 0) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002e, code lost:
        if (r7 > 3) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0037, code lost:
        r8 = new double[3];
        r9 = 0;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r9 >= r7) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
        r11 = o.LogItem.getMax(r0[r9]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
        if (r11 != r11) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (java.lang.Double.isInfinite(r11) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        r8[r9] = o.LogItem.setMax(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0055, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (r10 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        return o.LogItem.Grayscale$Algorithm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0060, code lost:
        if (r17 == r17) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0062, code lost:
        if (r6 >= 3) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0066, code lost:
        return o.LogItem.Grayscale$Algorithm;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0067, code lost:
        r9 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006a, code lost:
        if (r5 == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006c, code lost:
        r9 = LocalTime(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0071, code lost:
        r9 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0073, code lost:
        if (r6 < 3) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0075, code lost:
        if (r7 <= 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0077, code lost:
        r11 = r8[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007a, code lost:
        r11 = (double) YearFromTime(r9);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        if (r6 < 2) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0082, code lost:
        if (r3 >= r7) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
        r1 = r8[r3];
        r3 = r3 + 1;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        r13 = (double) MonthFromTime(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0091, code lost:
        if (r6 <= 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0093, code lost:
        if (r3 >= r7) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0095, code lost:
        r0 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0098, code lost:
        r0 = (double) DateFromTime(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009d, code lost:
        r0 = MakeDate(MakeDay(r11, r13, r0), TimeWithinDay(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00aa, code lost:
        if (r5 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ac, code lost:
        r0 = internalUTC(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b4, code lost:
        return TimeClip(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double makeDate(double r17, java.lang.Object[] r19, int r20) {
        /*
            r0 = r19
            int r1 = r0.length
            if (r1 != 0) goto L_0x0008
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x0008:
            r1 = 2
            r2 = 3
            r3 = 1
            r4 = 0
            switch(r20) {
                case 39: goto L_0x0020;
                case 40: goto L_0x001e;
                case 41: goto L_0x001b;
                case 42: goto L_0x0019;
                case 43: goto L_0x0016;
                case 44: goto L_0x0014;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x0014:
            r5 = 0
            goto L_0x0017
        L_0x0016:
            r5 = 1
        L_0x0017:
            r6 = 3
            goto L_0x0022
        L_0x0019:
            r5 = 0
            goto L_0x001c
        L_0x001b:
            r5 = 1
        L_0x001c:
            r6 = 2
            goto L_0x0022
        L_0x001e:
            r5 = 0
            goto L_0x0021
        L_0x0020:
            r5 = 1
        L_0x0021:
            r6 = 1
        L_0x0022:
            int r7 = r0.length
            if (r7 >= r6) goto L_0x0027
            int r7 = r0.length
            goto L_0x0028
        L_0x0027:
            r7 = r6
        L_0x0028:
            boolean r8 = $assertionsDisabled
            if (r8 != 0) goto L_0x0037
            if (r7 <= 0) goto L_0x0031
            if (r7 > r2) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0037:
            double[] r8 = new double[r2]
            r9 = 0
            r10 = 0
        L_0x003b:
            if (r9 >= r7) goto L_0x0059
            r11 = r0[r9]
            double r11 = o.LogItem.getMax((java.lang.Object) r11)
            int r13 = (r11 > r11 ? 1 : (r11 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0055
            boolean r13 = java.lang.Double.isInfinite(r11)
            if (r13 == 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            double r11 = o.LogItem.setMax((double) r11)
            r8[r9] = r11
            goto L_0x0056
        L_0x0055:
            r10 = 1
        L_0x0056:
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0059:
            if (r10 == 0) goto L_0x005e
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x005e:
            int r0 = (r17 > r17 ? 1 : (r17 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            if (r6 >= r2) goto L_0x0067
            double r0 = o.LogItem.Grayscale$Algorithm
            return r0
        L_0x0067:
            r9 = 0
            goto L_0x0073
        L_0x006a:
            if (r5 == 0) goto L_0x0071
            double r9 = LocalTime(r17)
            goto L_0x0073
        L_0x0071:
            r9 = r17
        L_0x0073:
            if (r6 < r2) goto L_0x007a
            if (r7 <= 0) goto L_0x007a
            r11 = r8[r4]
            goto L_0x0080
        L_0x007a:
            int r0 = YearFromTime(r9)
            double r11 = (double) r0
            r3 = 0
        L_0x0080:
            if (r6 < r1) goto L_0x008b
            if (r3 >= r7) goto L_0x008b
            int r0 = r3 + 1
            r1 = r8[r3]
            r3 = r0
            r13 = r1
            goto L_0x0091
        L_0x008b:
            int r0 = MonthFromTime(r9)
            double r0 = (double) r0
            r13 = r0
        L_0x0091:
            if (r6 <= 0) goto L_0x0098
            if (r3 >= r7) goto L_0x0098
            r0 = r8[r3]
            goto L_0x009d
        L_0x0098:
            int r0 = DateFromTime(r9)
            double r0 = (double) r0
        L_0x009d:
            r15 = r0
            double r0 = MakeDay(r11, r13, r15)
            double r2 = TimeWithinDay(r9)
            double r0 = MakeDate(r0, r2)
            if (r5 == 0) goto L_0x00b0
            double r0 = internalUTC(r0)
        L_0x00b0:
            double r0 = TimeClip(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.makeDate(double, java.lang.Object[], int):double");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findPrototypeId(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            if (r0 == 0) goto L_0x000a
            int r2 = r17.length()
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            int r3 = o.dispatchOnCancelled.setMax(r2)
            r4 = 1
            if (r2 == r3) goto L_0x0020
            o.onCanceled r5 = new o.onCanceled
            r5.<init>(r2, r3, r4)
            r2 = 204514044(0xc30a2fc, float:1.3607593E-31)
            o.onCancelLoad.setMax(r2, r5)
            o.onCancelLoad.getMin(r2, r5)
        L_0x0020:
            int r3 = r17.length()
            r5 = 2
            r6 = 6
            r7 = 8
            r8 = 83
            r9 = 9
            r10 = 84
            r11 = 68
            r12 = 77
            r13 = 3
            r14 = 116(0x74, float:1.63E-43)
            r15 = 115(0x73, float:1.61E-43)
            r2 = 103(0x67, float:1.44E-43)
            switch(r3) {
                case 6: goto L_0x0226;
                case 7: goto L_0x01da;
                case 8: goto L_0x0195;
                case 9: goto L_0x018f;
                case 10: goto L_0x0147;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00cb;
                case 13: goto L_0x009b;
                case 14: goto L_0x0080;
                case 15: goto L_0x006c;
                case 16: goto L_0x003c;
                case 17: goto L_0x0066;
                case 18: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0238
        L_0x003e:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x004a
            r4 = 28
            java.lang.String r2 = "getUTCMilliseconds"
            goto L_0x023a
        L_0x004a:
            if (r3 != r15) goto L_0x0052
            r4 = 32
            java.lang.String r2 = "setUTCMilliseconds"
            goto L_0x023a
        L_0x0052:
            if (r3 != r14) goto L_0x0238
            char r2 = r0.charAt(r7)
            if (r2 != r11) goto L_0x005f
            r4 = 7
            java.lang.String r2 = "toLocaleDateString"
            goto L_0x023a
        L_0x005f:
            if (r2 != r10) goto L_0x0238
            java.lang.String r2 = "toLocaleTimeString"
            r4 = 6
            goto L_0x023a
        L_0x0066:
            r4 = 29
            java.lang.String r2 = "getTimezoneOffset"
            goto L_0x023a
        L_0x006c:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x0078
            r4 = 27
            java.lang.String r2 = "getMilliseconds"
            goto L_0x023a
        L_0x0078:
            if (r3 != r15) goto L_0x0238
            r4 = 31
            java.lang.String r2 = "setMilliseconds"
            goto L_0x023a
        L_0x0080:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x008c
            r4 = 14
            java.lang.String r2 = "getUTCFullYear"
            goto L_0x023a
        L_0x008c:
            if (r3 != r15) goto L_0x0094
            r4 = 44
            java.lang.String r2 = "setUTCFullYear"
            goto L_0x023a
        L_0x0094:
            if (r3 != r14) goto L_0x0238
            r4 = 5
            java.lang.String r2 = "toLocaleString"
            goto L_0x023a
        L_0x009b:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x00b5
            char r2 = r0.charAt(r6)
            if (r2 != r12) goto L_0x00ad
            r4 = 24
            java.lang.String r2 = "getUTCMinutes"
            goto L_0x023a
        L_0x00ad:
            if (r2 != r8) goto L_0x0238
            r4 = 26
            java.lang.String r2 = "getUTCSeconds"
            goto L_0x023a
        L_0x00b5:
            if (r3 != r15) goto L_0x0238
            char r2 = r0.charAt(r6)
            if (r2 != r12) goto L_0x00c3
            r4 = 36
            java.lang.String r2 = "setUTCMinutes"
            goto L_0x023a
        L_0x00c3:
            if (r2 != r8) goto L_0x0238
            r4 = 34
            java.lang.String r2 = "setUTCSeconds"
            goto L_0x023a
        L_0x00cb:
            char r2 = r0.charAt(r5)
            if (r2 != r11) goto L_0x00d6
            r4 = 4
            java.lang.String r2 = "toDateString"
            goto L_0x023a
        L_0x00d6:
            if (r2 != r10) goto L_0x0238
            java.lang.String r2 = "toTimeString"
            r4 = 3
            goto L_0x023a
        L_0x00dd:
            char r3 = r0.charAt(r13)
            r5 = 70
            if (r3 == r5) goto L_0x0133
            if (r3 == r12) goto L_0x012d
            if (r3 == r15) goto L_0x0129
            switch(r3) {
                case 83: goto L_0x0123;
                case 84: goto L_0x0120;
                case 85: goto L_0x00ee;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x0238
        L_0x00ee:
            char r3 = r0.charAt(r1)
            r4 = 114(0x72, float:1.6E-43)
            if (r3 != r2) goto L_0x010a
            char r2 = r0.charAt(r9)
            if (r2 != r4) goto L_0x0102
            r4 = 22
            java.lang.String r2 = "getUTCHours"
            goto L_0x023a
        L_0x0102:
            if (r2 != r14) goto L_0x0238
            r4 = 16
            java.lang.String r2 = "getUTCMonth"
            goto L_0x023a
        L_0x010a:
            if (r3 != r15) goto L_0x0238
            char r2 = r0.charAt(r9)
            if (r2 != r4) goto L_0x0118
            r4 = 38
            java.lang.String r2 = "setUTCHours"
            goto L_0x023a
        L_0x0118:
            if (r2 != r14) goto L_0x0238
            r4 = 42
            java.lang.String r2 = "setUTCMonth"
            goto L_0x023a
        L_0x0120:
            java.lang.String r2 = "toUTCString"
            goto L_0x012f
        L_0x0123:
            r4 = 46
            java.lang.String r2 = "toISOString"
            goto L_0x023a
        L_0x0129:
            java.lang.String r2 = "constructor"
            goto L_0x023a
        L_0x012d:
            java.lang.String r2 = "toGMTString"
        L_0x012f:
            r4 = 8
            goto L_0x023a
        L_0x0133:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x013f
            r4 = 13
            java.lang.String r2 = "getFullYear"
            goto L_0x023a
        L_0x013f:
            if (r3 != r15) goto L_0x0238
            r4 = 43
            java.lang.String r2 = "setFullYear"
            goto L_0x023a
        L_0x0147:
            char r3 = r0.charAt(r13)
            if (r3 != r12) goto L_0x0161
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x0159
            r4 = 23
            java.lang.String r2 = "getMinutes"
            goto L_0x023a
        L_0x0159:
            if (r3 != r15) goto L_0x0238
            r4 = 35
            java.lang.String r2 = "setMinutes"
            goto L_0x023a
        L_0x0161:
            if (r3 != r8) goto L_0x0177
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x016f
            r4 = 25
            java.lang.String r2 = "getSeconds"
            goto L_0x023a
        L_0x016f:
            if (r3 != r15) goto L_0x0238
            r4 = 33
            java.lang.String r2 = "setSeconds"
            goto L_0x023a
        L_0x0177:
            r4 = 85
            if (r3 != r4) goto L_0x0238
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x0187
            r4 = 18
            java.lang.String r2 = "getUTCDate"
            goto L_0x023a
        L_0x0187:
            if (r3 != r15) goto L_0x0238
            r4 = 40
            java.lang.String r2 = "setUTCDate"
            goto L_0x023a
        L_0x018f:
            r4 = 20
            java.lang.String r2 = "getUTCDay"
            goto L_0x023a
        L_0x0195:
            char r3 = r0.charAt(r13)
            r4 = 72
            if (r3 == r4) goto L_0x01c6
            if (r3 == r12) goto L_0x01b2
            r2 = 111(0x6f, float:1.56E-43)
            if (r3 == r2) goto L_0x01ac
            if (r3 == r14) goto L_0x01a7
            goto L_0x0238
        L_0x01a7:
            java.lang.String r2 = "toString"
            r4 = 2
            goto L_0x023a
        L_0x01ac:
            java.lang.String r2 = "toSource"
            r4 = 9
            goto L_0x023a
        L_0x01b2:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x01be
            r4 = 15
            java.lang.String r2 = "getMonth"
            goto L_0x023a
        L_0x01be:
            if (r3 != r15) goto L_0x0238
            r4 = 41
            java.lang.String r2 = "setMonth"
            goto L_0x023a
        L_0x01c6:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x01d2
            r4 = 21
            java.lang.String r2 = "getHours"
            goto L_0x023a
        L_0x01d2:
            if (r3 != r15) goto L_0x0238
            r4 = 37
            java.lang.String r2 = "setHours"
            goto L_0x023a
        L_0x01da:
            char r3 = r0.charAt(r13)
            if (r3 == r11) goto L_0x0214
            if (r3 == r10) goto L_0x0202
            r4 = 89
            if (r3 == r4) goto L_0x01f0
            r2 = 117(0x75, float:1.64E-43)
            if (r3 == r2) goto L_0x01eb
            goto L_0x0238
        L_0x01eb:
            r4 = 10
            java.lang.String r2 = "valueOf"
            goto L_0x023a
        L_0x01f0:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x01fb
            r4 = 12
            java.lang.String r2 = "getYear"
            goto L_0x023a
        L_0x01fb:
            if (r3 != r15) goto L_0x0238
            r4 = 45
            java.lang.String r2 = "setYear"
            goto L_0x023a
        L_0x0202:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x020d
            r4 = 11
            java.lang.String r2 = "getTime"
            goto L_0x023a
        L_0x020d:
            if (r3 != r15) goto L_0x0238
            r4 = 30
            java.lang.String r2 = "setTime"
            goto L_0x023a
        L_0x0214:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x021f
            r4 = 17
            java.lang.String r2 = "getDate"
            goto L_0x023a
        L_0x021f:
            if (r3 != r15) goto L_0x0238
            r4 = 39
            java.lang.String r2 = "setDate"
            goto L_0x023a
        L_0x0226:
            char r3 = r0.charAt(r1)
            if (r3 != r2) goto L_0x0231
            r4 = 19
            java.lang.String r2 = "getDay"
            goto L_0x023a
        L_0x0231:
            if (r3 != r14) goto L_0x0238
            r4 = 47
            java.lang.String r2 = "toJSON"
            goto L_0x023a
        L_0x0238:
            r2 = 0
            r4 = 0
        L_0x023a:
            if (r2 == 0) goto L_0x0245
            if (r2 == r0) goto L_0x0245
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0245
            goto L_0x0246
        L_0x0245:
            r1 = r4
        L_0x0246:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AutoSubmitInterface.findPrototypeId(java.lang.String):int");
    }
}
