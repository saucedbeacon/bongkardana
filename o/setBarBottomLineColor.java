package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH&J3\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH&J3\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\u000f"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/EmoneyCallback;", "", "callConfirm", "", "emoneyCardAttribute", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyCardAttribute;", "callGetTopupCommand", "onResult", "Lkotlin/Function1;", "Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "Lkotlin/ParameterName;", "name", "result", "callInquiryBalance", "callReversal", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public interface setBarBottomLineColor {
    void callConfirm(@NotNull hideBackButton hidebackbutton);

    void callGetTopupCommand(@NotNull hideBackButton hidebackbutton, @NotNull Function1<? super hideTitleLoading, Unit> function1);

    void callInquiryBalance(@NotNull hideBackButton hidebackbutton, @NotNull Function1<? super hideTitleLoading, Unit> function1);

    void callReversal(@NotNull hideBackButton hidebackbutton, @NotNull Function1<? super hideTitleLoading, Unit> function1);
}
