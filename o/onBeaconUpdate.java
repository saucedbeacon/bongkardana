package o;

import android.net.Uri;
import id.dana.danah5.DanaH5;
import id.dana.data.ProductFlavor;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.sendmoney.summary.SummaryActivity;
import id.dana.tracker.TrackerKey;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J4\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/explore/utils/ExploreUtils;", "", "()V", "AUTO_INQUIRY", "", "BIZ_PARAM", "EXTENDED_INFO", "GOODS_ID", "MINIPROGRAM", "PARAMS", "PAYMENT_AMOUNT", "PROVIDER", "PROVIDER_NAME", "SOURCE", "generateExtenedInfo", "bizId", "generateServiceDeeplink", "serviceKey", "generateServiceLink", "productBizId", "Lid/dana/domain/globalsearch/model/ProductBizId;", "link", "amount", "appId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onBeaconUpdate {
    @NotNull
    public static final onBeaconUpdate setMax = new onBeaconUpdate();

    private onBeaconUpdate() {
    }

    @NotNull
    public static String getMin(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, DanaH5.SERVICE_KEY);
        int hashCode = "production".hashCode();
        if (hashCode != -318354310) {
            if (hashCode == 1446938069 && "production".equals(ProductFlavor.PUBSIT)) {
                str2 = "ATVQIimLTY";
                StringBuilder sb = new StringBuilder("https://link.dana.id/");
                sb.append(str2);
                sb.append("?params=[service=");
                sb.append(str);
                sb.append(']');
                return sb.toString();
            }
        } else if ("production".equals(ProductFlavor.PREPROD)) {
            str2 = "7YA9YD9K45";
            StringBuilder sb2 = new StringBuilder("https://link.dana.id/");
            sb2.append(str2);
            sb2.append("?params=[service=");
            sb2.append(str);
            sb2.append(']');
            return sb2.toString();
        }
        str2 = "ZmoMgmWWTY";
        StringBuilder sb22 = new StringBuilder("https://link.dana.id/");
        sb22.append(str2);
        sb22.append("?params=[service=");
        sb22.append(str);
        sb22.append(']');
        return sb22.toString();
    }

    @NotNull
    public static String length(@NotNull String str, @Nullable performRequest performrequest, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        Uri.Builder builder;
        Intrinsics.checkNotNullParameter(str, DanaH5.SERVICE_KEY);
        Intrinsics.checkNotNullParameter(str2, "link");
        Intrinsics.checkNotNullParameter(str4, "appId");
        if (Intrinsics.areEqual((Object) str, (Object) "service_telkom")) {
            Uri parse = Uri.parse("https://link.dana.id/");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            builder = parse.buildUpon();
        } else {
            Uri parse2 = Uri.parse(str2);
            Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
            builder = parse2.buildUpon();
        }
        if (performrequest != null) {
            switch (str.hashCode()) {
                case -1872079272:
                    if (str.equals("service_telkom")) {
                        Uri.Builder appendPath = builder.appendPath(BranchLinkConstant.PathTarget.MINI_PROGRAM);
                        StringBuilder sb = new StringBuilder("[appId=");
                        sb.append(str4);
                        sb.append(']');
                        Uri.Builder appendQueryParameter = appendPath.appendQueryParameter("params", sb.toString());
                        String bizId = performrequest.getBizId();
                        int length = bizId != null ? bizId.length() : 0;
                        int max = dispatchOnCancelled.setMax(length);
                        if (length != max) {
                            onCanceled oncanceled = new onCanceled(length, max, 1);
                            onCancelLoad.setMax(-2000029969, oncanceled);
                            onCancelLoad.getMin(-2000029969, oncanceled);
                        }
                        appendQueryParameter.appendQueryParameter("extendedInfo", MapsKt.mapOf(new Pair("source", TrackerKey.SourceType.GLOBAL_SEARCH), new Pair("autoInquiry", SummaryActivity.CHECKED), new Pair("bizParam", bizId)).toString());
                        break;
                    }
                    break;
                case -1720298739:
                    if (str.equals("service_water")) {
                        builder.appendQueryParameter("autoInquiry", SummaryActivity.CHECKED).appendQueryParameter("goodsId", performrequest.getGoodsId()).appendQueryParameter("bizParam", performrequest.getBizId());
                        break;
                    }
                    break;
                case 359536993:
                    if (str.equals("service_bpjs")) {
                        builder.appendQueryParameter("autoInquiry", SummaryActivity.CHECKED).appendQueryParameter("bizParam", performrequest.getBizId());
                        break;
                    }
                    break;
                case 795109888:
                    if (str.equals("service_credit_card_repayment")) {
                        builder.appendQueryParameter("autoInquiry", SummaryActivity.CHECKED).appendQueryParameter("goodsId", performrequest.getGoodsId()).appendQueryParameter("bizParam", performrequest.getBizId()).appendQueryParameter("paymentAmount", str3).appendQueryParameter("providerName", performrequest.getProviderName());
                        break;
                    }
                    break;
                case 2086865566:
                    if (str.equals("service_education")) {
                        builder.appendQueryParameter("autoInquiry", SummaryActivity.CHECKED).appendQueryParameter("goodsId", performrequest.getGoodsId()).appendQueryParameter("bizParam", performrequest.getBizId()).appendQueryParameter("providerName", performrequest.getProviderName()).appendQueryParameter("provider", performrequest.getProvider());
                        break;
                    }
                    break;
            }
        }
        String obj = builder.build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "uriBuilder.build().toString()");
        return obj;
    }
}
