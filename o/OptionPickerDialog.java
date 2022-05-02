package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.usereducation.BottomSheetOnBoardingActivity;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.MultilevelSelectActivity;
import o.ScanFilterUtils;
import o.b;
import o.getSelectedIndex;
import org.jetbrains.annotations.NotNull;

public final class OptionPickerDialog implements getAdapterPosition<MultilevelSelectAdapter> {
    private final b.C0007b<getDetectedCrashCount> equals;
    private final b.C0007b<BleAdvertisement> getMax;
    private final b.C0007b<MultilevelSelectActivity.AnonymousClass1.setMin> getMin;
    private final b.C0007b<onNonBeaconLeScan> isInside;
    private final b.C0007b<UrlBeaconUrlCompressor> length;
    private final b.C0007b<onScanFailed> setMax;
    private final b.C0007b<StartupBroadcastReceiver> setMin;
    private final b.C0007b<ScanFilterUtils.ScanFilterData> toFloatRange;
    private final b.C0007b<addChooseImageCrossOrigin> toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lid/dana/util/ContentDescriptorUtil;", "", "()V", "stringToContentDescriptorId", "", "prefix", "optionName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OnOptionPickListener {
        @NotNull
        public static final OnOptionPickListener getMin = new OnOptionPickListener();

        private OnOptionPickListener() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<String, CharSequence> {
            public static final getMin INSTANCE = new getMin();

            getMin() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "java.util.Locale.ROOT");
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                return upperCase;
            }
        }

        @NotNull
        public static String getMax(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "prefix");
            Intrinsics.checkNotNullParameter(str2, "optionName");
            String joinToString$default = CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) str2, new String[]{" "}, false, 0, 6, (Object) null), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, getMin.INSTANCE, 31, (Object) null);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(joinToString$default);
            return sb.toString();
        }
    }

    /* renamed from: o.OptionPickerDialog$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<BottomSheetOnBoardingActivity> {
        @InjectedFieldSignature("id.dana.usereducation.BottomSheetOnBoardingActivity.presenter")
        public static void getMax(BottomSheetOnBoardingActivity bottomSheetOnBoardingActivity, getSelectedIndex.length length) {
            bottomSheetOnBoardingActivity.presenter = length;
        }
    }

    private OptionPickerDialog(b.C0007b<MultilevelSelectActivity.AnonymousClass1.setMin> bVar, b.C0007b<onScanFailed> bVar2, b.C0007b<UrlBeaconUrlCompressor> bVar3, b.C0007b<StartupBroadcastReceiver> bVar4, b.C0007b<BleAdvertisement> bVar5, b.C0007b<ScanFilterUtils.ScanFilterData> bVar6, b.C0007b<onNonBeaconLeScan> bVar7, b.C0007b<getDetectedCrashCount> bVar8, b.C0007b<addChooseImageCrossOrigin> bVar9) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
        this.setMin = bVar4;
        this.getMax = bVar5;
        this.toFloatRange = bVar6;
        this.isInside = bVar7;
        this.equals = bVar8;
        this.toIntRange = bVar9;
    }

    public static OptionPickerDialog setMin(b.C0007b<MultilevelSelectActivity.AnonymousClass1.setMin> bVar, b.C0007b<onScanFailed> bVar2, b.C0007b<UrlBeaconUrlCompressor> bVar3, b.C0007b<StartupBroadcastReceiver> bVar4, b.C0007b<BleAdvertisement> bVar5, b.C0007b<ScanFilterUtils.ScanFilterData> bVar6, b.C0007b<onNonBeaconLeScan> bVar7, b.C0007b<getDetectedCrashCount> bVar8, b.C0007b<addChooseImageCrossOrigin> bVar9) {
        return new OptionPickerDialog(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public final /* synthetic */ Object get() {
        return new MultilevelSelectAdapter(this.getMin.get(), this.setMax.get(), this.length.get(), this.setMin.get(), this.getMax.get(), this.toFloatRange.get(), this.isInside.get(), this.equals.get(), this.toIntRange.get());
    }
}
