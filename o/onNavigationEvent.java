package o;

import android.os.Build;
import id.co.bri.sdk.BrizziHistoryObject;
import id.co.bri.sdk.exception.BrizziException;
import id.dana.lib.electronicmoney.bri.model.BrizziHistoryResult;
import id.dana.lib.electronicmoney.bri.model.ReversalResult;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.TabBarBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/lib/electronicmoney/bri/BriEntityRepository$doHistoryObject$1", "Lid/co/bri/sdk/Callback;", "OnFailure", "", "e", "Lid/co/bri/sdk/exception/BrizziException;", "OnSuccess", "brizziCardObject", "Lid/co/bri/sdk/BrizziCardObject;", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class onNavigationEvent implements unScrap {
    public final /* synthetic */ Function1 getMin;
    public final /* synthetic */ valueOf setMin;

    public onNavigationEvent(valueOf valueof, Function1 function1) {
        this.setMin = valueof;
        this.getMin = function1;
    }

    public final void getMax(@Nullable BrizziException brizziException) {
        this.setMin.setMax(true, this.getMin);
    }

    public final void getMin(@NotNull clearReturnedFromScrapFlag clearreturnedfromscrapflag) {
        String str;
        String str2;
        clearReturnedFromScrapFlag clearreturnedfromscrapflag2 = clearreturnedfromscrapflag;
        Intrinsics.checkNotNullParameter(clearreturnedfromscrapflag2, "brizziCardObject");
        valueOf.getMin(this.setMin, TabBarItemColorModel.LIMIT, this.getMin);
        create create = this.setMin.getMax;
        TabBarBridgeExtension.AnonymousClass2 r3 = create.setMax;
        if (r3 != null) {
            WindowBridgeExtension windowBridgeExtension = create.length;
            Intrinsics.checkNotNull(windowBridgeExtension);
            String str3 = windowBridgeExtension.length;
            String str4 = clearreturnedfromscrapflag2.setMax;
            Intrinsics.checkNotNullExpressionValue(str4, "brizziCardObject.cardNumber");
            String str5 = clearreturnedfromscrapflag2.toFloatRange;
            Intrinsics.checkNotNullExpressionValue(str5, "brizziCardObject.lastTrxDate");
            String str6 = clearreturnedfromscrapflag2.setMin;
            Intrinsics.checkNotNullExpressionValue(str6, "brizziCardObject.balance");
            ArrayList<BrizziHistoryObject> arrayList = clearreturnedfromscrapflag2.hashCode;
            Intrinsics.checkNotNullExpressionValue(arrayList, "brizziCardObject.history");
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                BrizziHistoryObject brizziHistoryObject = (BrizziHistoryObject) it.next();
                Intrinsics.checkNotNullExpressionValue(brizziHistoryObject, "it");
                Intrinsics.checkNotNullParameter(brizziHistoryObject, "$this$toBrizziHistoryResult");
                String str7 = brizziHistoryObject.setMax;
                Intrinsics.checkNotNullExpressionValue(str7, "merchantID");
                String str8 = brizziHistoryObject.getMin;
                Intrinsics.checkNotNullExpressionValue(str8, "terminalID");
                String str9 = brizziHistoryObject.length;
                Intrinsics.checkNotNullExpressionValue(str9, "transDate");
                String str10 = brizziHistoryObject.getMax;
                Intrinsics.checkNotNullExpressionValue(str10, "transTime");
                String str11 = brizziHistoryObject.setMin;
                Intrinsics.checkNotNullExpressionValue(str11, "transType");
                String str12 = brizziHistoryObject.toIntRange;
                Intrinsics.checkNotNullExpressionValue(str12, "transAmount");
                String str13 = brizziHistoryObject.equals;
                Iterator<T> it2 = it;
                Intrinsics.checkNotNullExpressionValue(str13, "balanceBefore");
                String str14 = brizziHistoryObject.toFloatRange;
                String str15 = str12;
                Intrinsics.checkNotNullExpressionValue(str14, "balanceAfter");
                ICustomTabsService iCustomTabsService = ICustomTabsService.setMax;
                StringBuilder sb = new StringBuilder();
                TabBarBridgeExtension.AnonymousClass2 r20 = r3;
                sb.append(brizziHistoryObject.length);
                sb.append(' ');
                sb.append(brizziHistoryObject.getMax);
                String obj = sb.toString();
                Intrinsics.checkNotNullParameter(obj, "dateTimetoParse");
                Intrinsics.checkNotNullParameter("ddMMyy HHmmss", "formatPattern");
                String str16 = str6;
                if (Build.VERSION.SDK_INT >= 26) {
                    str2 = LocalDateTime.parse(obj, DateTimeFormatter.ofPattern("ddMMyy HHmmss")).toString();
                    str = "LocalDateTime.parse(date…ormatPattern)).toString()";
                } else {
                    str2 = new SimpleDateFormat("ddMMyy HHmmss").parse(obj).toString();
                    str = "SimpleDateFormat(formatP…teTimetoParse).toString()";
                }
                Intrinsics.checkNotNullExpressionValue(str2, str);
                arrayList2.add(new BrizziHistoryResult(str7, str8, str9, str10, str11, str15, str13, str14, str2));
                it = it2;
                r3 = r20;
                str6 = str16;
            }
            String str17 = str6;
            r3.needReversal(new ReversalResult((String) null, str3, str4, str5, str6, TabBarItemColorModel.LIMIT, CollectionsKt.take(CollectionsKt.sortedWith(arrayList2, new getMin()), 5), 1));
        }
    }

    public static final class getMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(((BrizziHistoryResult) t2).isInside, ((BrizziHistoryResult) t).isInside);
        }
    }
}
