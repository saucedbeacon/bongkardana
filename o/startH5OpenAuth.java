package o;

import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003¨\u0006\n"}, d2 = {"Lid/dana/data/social/mapper/ReportReasonsConfigMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lcom/alibaba/fastjson/JSONObject;", "Lid/dana/domain/social/model/ReportReasons;", "()V", "map", "oldItem", "mapReportReason", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class startH5OpenAuth extends setSpeed<List<JSONObject>, List<setSimulatedScanData>> {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    @NotNull
    public static final String KEY_EN = "en";
    @NotNull
    public static final String KEY_ID = "id";
    @NotNull
    public static final String KEY_REASON_ID = "reason_id";

    @NotNull
    public final List<setSimulatedScanData> map(@NotNull List<JSONObject> list) {
        Intrinsics.checkNotNullParameter(list, "oldItem");
        List<setSimulatedScanData> arrayList = new ArrayList<>();
        for (JSONObject mapReportReason : list) {
            arrayList.add(mapReportReason(mapReportReason));
        }
        return arrayList;
    }

    @NotNull
    public final setSimulatedScanData mapReportReason(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "oldItem");
        String string = jSONObject.getString(KEY_REASON_ID);
        String str = "";
        if (string == null) {
            string = str;
        }
        String string2 = jSONObject.getString("id");
        if (string2 == null) {
            string2 = str;
        }
        String string3 = jSONObject.getString(KEY_EN);
        if (string3 != null) {
            str = string3;
        }
        return new setSimulatedScanData(string, string2, str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/social/mapper/ReportReasonsConfigMapper$Companion;", "", "()V", "KEY_EN", "", "KEY_ID", "KEY_REASON_ID", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
