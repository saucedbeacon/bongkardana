package o;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.ConfirmPopup;
import o.b;

public final class makeFooterView implements getAdapterPosition<ConfirmPopup.AnonymousClass1> {
    private final b.C0007b<Context> setMin;

    private makeFooterView(b.C0007b<Context> bVar) {
        this.setMin = bVar;
    }

    public static makeFooterView setMax(b.C0007b<Context> bVar) {
        return new makeFooterView(bVar);
    }

    public final /* synthetic */ Object get() {
        return new Object(this.setMin.get()) {
            public final Context length;

            {
                this.length = r1;
            }

            public static String setMax(String str) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return LocalDateTime.now().format(DateTimeFormatter.ofPattern(str));
                }
                return new SimpleDateFormat(str, Locale.getDefault()).format(new Date());
            }

            public static long setMax(Date date) {
                long j;
                long j2;
                if (date == null) {
                    return -1;
                }
                Date date2 = new Date();
                if (date == null) {
                    j = -1;
                } else {
                    j = TimeUnit.DAYS.convert(date.getTime() - date2.getTime(), TimeUnit.MILLISECONDS);
                }
                if (j == 0) {
                    Date date3 = new Date();
                    if (date == null) {
                        j2 = -1;
                    } else {
                        j2 = TimeUnit.SECONDS.convert(date.getTime() - date3.getTime(), TimeUnit.MILLISECONDS);
                    }
                    if (j2 <= 0) {
                        return -1;
                    }
                }
                return j;
            }

            public static long setMin(Date date, Date date2) {
                if (date == null) {
                    return -1;
                }
                return (long) Math.round((((float) (date.getTime() - date2.getTime())) * 1.0f) / ((float) TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)));
            }

            public static boolean length(int i) {
                if (Calendar.getInstance().get(1) < i) {
                    return true;
                }
                return false;
            }

            public static boolean setMax(int i) {
                if (Calendar.getInstance().get(1) == i) {
                    return true;
                }
                return false;
            }

            public static boolean getMax(int i) {
                return Calendar.getInstance().get(2) == i;
            }

            public static boolean getMin(int i) {
                return Calendar.getInstance().get(2) < i;
            }

            public static Date setMin(int i, int i2, int i3) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("/");
                sb.append(i2);
                sb.append("/");
                sb.append(i3);
                try {
                    return new SimpleDateFormat("dd/MM/yyyy").parse(sb.toString());
                } catch (ParseException unused) {
                    return new Date();
                }
            }

            public static DatePickerDialog length(Context context, DatePickerDialog.OnDateSetListener onDateSetListener) {
                Calendar instance = Calendar.getInstance();
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, onDateSetListener, instance.get(1), instance.get(2), instance.get(5));
                datePickerDialog.getDatePicker().setMaxDate(new Date().getTime());
                return datePickerDialog;
            }

            public static long getMin() {
                Calendar instance = Calendar.getInstance();
                instance.add(5, 2);
                if (instance.get(2) <= Calendar.getInstance().get(2)) {
                    return instance.getTime().getTime();
                }
                int i = Calendar.getInstance().get(1);
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(setMin(1, Calendar.getInstance().get(2) + 1, i));
                instance2.set(5, instance2.getActualMaximum(5));
                return instance2.getTimeInMillis();
            }

            private static Calendar getMax(Date date) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                instance.set(11, 0);
                instance.set(12, 0);
                instance.set(13, 0);
                instance.set(14, 0);
                return instance;
            }

            public static long setMax(Date date, Date date2) {
                Calendar max = getMax(date);
                Calendar max2 = getMax(date2);
                long j = 0;
                while (max.before(max2)) {
                    max.add(5, 1);
                    j++;
                }
                return j;
            }

            public static ArrayList<String> getMin(long j, Integer num, String str, Boolean bool) {
                ArrayList arrayList = new ArrayList();
                ArrayList<String> arrayList2 = new ArrayList<>();
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                Integer valueOf = Integer.valueOf(bool.booleanValue() ? -1 : 1);
                for (int i = 0; i < num.intValue(); i++) {
                    arrayList.add(Long.valueOf(instance.getTimeInMillis()));
                    instance.add(2, valueOf.intValue());
                }
                Collections.sort(arrayList);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList2.add(new SimpleDateFormat(str, Locale.getDefault()).format(new Date(((Long) arrayList.get(i2)).longValue())));
                }
                return arrayList2;
            }

            public static String getMax(String str, String str2, Locale locale, String str3) {
                try {
                    return new SimpleDateFormat(str2, locale).format(new SimpleDateFormat(str, locale).parse(str3));
                } catch (ParseException e) {
                    updateActionSheetContent.e(DanaLogConstants.ExceptionType.UNKNOWN_EXCEPTION, e.getMessage());
                    return null;
                }
            }

            public static boolean length(Date date) {
                Calendar instance = Calendar.getInstance();
                instance.setTime(date);
                if (instance.get(1) < Calendar.getInstance().get(1)) {
                    return true;
                }
                return false;
            }

            public static boolean getMax(String str, String str2, Locale locale) {
                try {
                    if (System.currentTimeMillis() > new SimpleDateFormat(str2, locale).parse(str).getTime()) {
                        return true;
                    }
                    return false;
                } catch (ParseException unused) {
                }
            }
        };
    }
}
