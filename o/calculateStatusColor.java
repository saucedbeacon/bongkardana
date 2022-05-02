package o;

import com.google.common.collect.Sets;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

public final class calculateStatusColor {
    private static Set<String> length = Sets.newHashSet((E[]) new String[]{SummaryActivity.CHECKED, "false"});
    private static TimeZone setMin = TimeZone.getTimeZone("UTC");

    public static Long length(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).longValue());
        }
        if (obj instanceof Long) {
            return (Long) obj;
        }
        return null;
    }

    public static Boolean getMin(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (length.contains(str.toLowerCase(Locale.ROOT))) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        return null;
    }

    public static Set<String> getMin(Collection collection) {
        HashSet hashSet = new HashSet(collection.size());
        for (Object obj : collection) {
            hashSet.add(obj.toString());
        }
        return hashSet;
    }

    public static Long getMax(Object obj) {
        Calendar calendar;
        Long length2 = length(obj);
        if (length2 == null) {
            calendar = null;
        } else {
            calendar = Calendar.getInstance();
            calendar.setTimeZone(setMin);
            calendar.setTimeInMillis(length2.longValue());
        }
        if (calendar == null) {
            return null;
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Long.valueOf(calendar.getTimeInMillis());
    }

    public static Long setMax(Object obj) {
        Calendar calendar;
        Long length2 = length(obj);
        if (length2 == null) {
            calendar = null;
        } else {
            calendar = Calendar.getInstance();
            calendar.setTimeZone(setMin);
            calendar.setTimeInMillis(length2.longValue());
        }
        if (calendar == null) {
            return null;
        }
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Long.valueOf(calendar.getTimeInMillis());
    }
}
