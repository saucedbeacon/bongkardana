package com.google.type;

import com.google.protobuf.Internal;

public enum CalendarPeriod implements Internal.EnumLite {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final int DAY_VALUE = 1;
    public static final int FORTNIGHT_VALUE = 3;
    public static final int HALF_VALUE = 6;
    public static final int MONTH_VALUE = 4;
    public static final int QUARTER_VALUE = 5;
    public static final int WEEK_VALUE = 2;
    public static final int YEAR_VALUE = 7;
    private static final Internal.EnumLiteMap<CalendarPeriod> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new Internal.EnumLiteMap<CalendarPeriod>() {
            public CalendarPeriod findValueByNumber(int i) {
                return CalendarPeriod.forNumber(i);
            }
        };
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CalendarPeriod valueOf(int i) {
        return forNumber(i);
    }

    public static CalendarPeriod forNumber(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<CalendarPeriod> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return CalendarPeriodVerifier.INSTANCE;
    }

    static final class CalendarPeriodVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        private CalendarPeriodVerifier() {
        }

        static {
            INSTANCE = new CalendarPeriodVerifier();
        }

        public final boolean isInRange(int i) {
            return CalendarPeriod.forNumber(i) != null;
        }
    }

    private CalendarPeriod(int i) {
        this.value = i;
    }
}
