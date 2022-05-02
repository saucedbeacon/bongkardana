package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.log.MonitorWrapper;
import id.dana.home.model.EddAnswerInfoDTOModel;
import id.dana.home.model.EddInfoModel;
import id.dana.home.model.EddQuestionInfoDTOModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class LocationBridgeExtension {
    public static void length(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (LogCustomizeControl.getMin() > 0) {
                LogCustomizeControl.length(str).setMax(str2, new Object[0]);
            }
            LoggerWrapper.w(str, str2);
        }
    }

    public static void setMax(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (LogCustomizeControl.getMin() > 0) {
                LogCustomizeControl.length(str).getMin(str2, new Object[0]);
            }
            LoggerWrapper.i(str, str2);
        }
    }

    public static void setMin(@NonNull String str, @NonNull String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (LogCustomizeControl.getMin() > 0) {
                LogCustomizeControl.length(str).length(str2, new Object[0]);
            }
            LoggerWrapper.d(str, str2);
        }
    }

    public static void setMin(String str, String str2, String str3) {
        setMax(str, str2, str3, "");
    }

    public static void setMin(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (LogCustomizeControl.getMin() > 0) {
                LogCustomizeControl.length(str).getMax(th, str2, new Object[0]);
            }
            LoggerWrapper.e(str, str2, th);
        }
    }

    public static void setMax(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("exceptionType", str2);
        hashMap.put("message", str3);
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("traceId", str4);
        }
        MonitorWrapper.exception(str, hashMap);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            sb.append("[");
            sb.append((String) entry.getKey());
            sb.append(": ");
            sb.append((String) entry.getValue());
            sb.append("] ");
        }
        LoggerWrapper.e(str, sb.toString());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\t\u001a\u00020\n*\u00020\u000b¨\u0006\f"}, d2 = {"toEddAnswerInfoDTOModel", "Lid/dana/home/model/EddAnswerInfoDTOModel;", "Lid/dana/domain/kycamledd/model/EddAnswerInfoDTO;", "toEddConsultModel", "Lid/dana/home/model/EddConsultModel;", "Lid/dana/domain/kycamledd/model/EddConsult;", "toEddInfoModel", "Lid/dana/home/model/EddInfoModel;", "Lid/dana/domain/kycamledd/model/EddInfo;", "toEddQuestionInfoDTOModel", "Lid/dana/home/model/EddQuestionInfoDTOModel;", "Lid/dana/domain/kycamledd/model/EddQuestionInfoDTO;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
    /* renamed from: o.LocationBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        public static final EddInfoModel setMax(@NotNull GriverRVResourceEnvProxyImpl griverRVResourceEnvProxyImpl) {
            Intrinsics.checkNotNullParameter(griverRVResourceEnvProxyImpl, "$this$toEddInfoModel");
            String amlOrderId = griverRVResourceEnvProxyImpl.getAmlOrderId();
            Iterable<getSingleMonitorThreadExecutor> eddQuestionInfos = griverRVResourceEnvProxyImpl.getEddQuestionInfos();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eddQuestionInfos, 10));
            for (getSingleMonitorThreadExecutor max : eddQuestionInfos) {
                arrayList.add(getMax(max));
            }
            return new EddInfoModel(amlOrderId, (List) arrayList);
        }

        @NotNull
        private static EddQuestionInfoDTOModel getMax(@NotNull getSingleMonitorThreadExecutor getsinglemonitorthreadexecutor) {
            Intrinsics.checkNotNullParameter(getsinglemonitorthreadexecutor, "$this$toEddQuestionInfoDTOModel");
            String questionId = getsinglemonitorthreadexecutor.getQuestionId();
            String question = getsinglemonitorthreadexecutor.getQuestion();
            Iterable<setAlwaysShowDiagnosticTool> eddAnswerInfos = getsinglemonitorthreadexecutor.getEddAnswerInfos();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eddAnswerInfos, 10));
            for (setAlwaysShowDiagnosticTool setalwaysshowdiagnostictool : eddAnswerInfos) {
                Intrinsics.checkNotNullParameter(setalwaysshowdiagnostictool, "$this$toEddAnswerInfoDTOModel");
                arrayList.add(new EddAnswerInfoDTOModel(setalwaysshowdiagnostictool.getAnswerId(), setalwaysshowdiagnostictool.getAnswer()));
            }
            return new EddQuestionInfoDTOModel(questionId, question, (List) arrayList, 0, 8);
        }
    }
}
