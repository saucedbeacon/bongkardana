package o;

import android.nfc.tech.IsoDep;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class asBinder {
    public final IsoDep setMax;

    public asBinder(@NotNull IsoDep isoDep) {
        Intrinsics.checkNotNullParameter(isoDep, "isoDep");
        this.setMax = isoDep;
    }

    @NotNull
    public final String getMax() {
        StringBuilder sb = new StringBuilder();
        ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
        byte[] transceive = this.setMax.transceive(ICustomTabsService.length("00E70000"));
        Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStr…RSAL_DATA_TO_CREATE_SAM))");
        sb.append(StringsKt.dropLast(ICustomTabsService.getMin(transceive), 4));
        ICustomTabsService iCustomTabsService2 = ICustomTabsService.setMax;
        byte[] transceive2 = this.setMax.transceive(ICustomTabsService.length("00E0000000"));
        Intrinsics.checkNotNullExpressionValue(transceive2, "isoDep.transceive(hexStr…ToByteArray(CERTIFICATE))");
        sb.append(StringsKt.dropLast(ICustomTabsService.getMin(transceive2), 4));
        return sb.toString();
    }

    @NotNull
    public final String getMin() {
        ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
        byte[] transceive = this.setMax.transceive(ICustomTabsService.length("00B500000A"));
        Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStr…oByteArray(LAST_BALANCE))");
        String min = ICustomTabsService.getMin(transceive);
        if (!Intrinsics.areEqual((Object) "9000", (Object) StringsKt.takeLast(min, 4))) {
            return min;
        }
        ICustomTabsService iCustomTabsService2 = ICustomTabsService.setMax;
        String substring = min.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        ByteBuffer order = ByteBuffer.wrap(ICustomTabsService.length(substring)).order(ByteOrder.LITTLE_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "ByteBuffer.wrap(hexStrin…(ByteOrder.LITTLE_ENDIAN)");
        return String.valueOf(order.getInt());
    }

    @NotNull
    public final String length(@NotNull String str, @NotNull String str2) {
        String format;
        String str3;
        Intrinsics.checkNotNullParameter(str, "session");
        Intrinsics.checkNotNullParameter(str2, "pendingTopUp");
        try {
            StringBuilder sb = new StringBuilder();
            ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
            byte[] transceive = this.setMax.transceive(ICustomTabsService.length("00E0000000"));
            Intrinsics.checkNotNullExpressionValue(transceive, "isoDep.transceive(hexStr…ToByteArray(CERTIFICATE))");
            String dropLast = StringsKt.dropLast(ICustomTabsService.getMin(transceive), 4);
            this.setMax.setTimeout(2000);
            ICustomTabsService iCustomTabsService2 = ICustomTabsService.setMax;
            IsoDep isoDep = this.setMax;
            StringBuilder sb2 = new StringBuilder("00E5000046");
            StringBuilder sb3 = new StringBuilder();
            if (Build.VERSION.SDK_INT >= 26) {
                format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddmmyyhhmmss"));
                str3 = "current.format(formatter)";
            } else {
                format = new SimpleDateFormat("ddmmyyhhmmss").format(new Date());
                str3 = "formatter.format(current)";
            }
            Intrinsics.checkNotNullExpressionValue(format, str3);
            sb3.append(format);
            sb3.append("0000000000000000000000000000");
            sb3.append(str);
            sb3.append("000000000000000000000000000000000000");
            ByteBuffer putInt = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(Integer.parseInt(str2));
            ICustomTabsService iCustomTabsService3 = ICustomTabsService.setMax;
            byte[] array = putInt.array();
            Intrinsics.checkNotNullExpressionValue(array, "topUpToBigEndian.array()");
            sb3.append(ICustomTabsService.getMin(array));
            sb3.append("0000000000000000000000000000000000000000");
            String obj = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "data.toString()");
            sb2.append(obj);
            String obj2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(obj2, "StringBuilder().append(D…pendingTopUp)).toString()");
            byte[] transceive2 = isoDep.transceive(ICustomTabsService.length(obj2));
            Intrinsics.checkNotNullExpressionValue(transceive2, "isoDep.transceive(hexStr…(session, pendingTopUp)))");
            sb.append(StringsKt.dropLast(ICustomTabsService.getMin(transceive2), 4));
            sb.append(dropLast);
            String obj3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(obj3, "dataToSam.toString()");
            return obj3;
        } catch (Exception unused) {
            return "";
        }
    }
}
