package o;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public final class TinyAppInnerProxy {
    private static long getDifferentDate(Date date, Date date2) {
        return TimeUnit.MINUTES.convert(Math.abs(date.getTime() - date2.getTime()), TimeUnit.MILLISECONDS);
    }

    public static boolean isPaymentExpired(addRenderView addrenderview) {
        return getDifferentDate(new Date(), addrenderview.getGenerateDate()) > 1;
    }
}
