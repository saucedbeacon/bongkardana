package o;

import android.app.Activity;
import androidx.annotation.DrawableRes;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.R;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.setLandscape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0007J\"\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0004H\u0003J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/promocode/utils/PromoCodeUtil;", "", "()V", "CODE_ALREADY_REDEEMED", "", "CODE_EXPIRED", "CODE_GENERAL_ERROR", "CODE_INVALID", "CODE_QUOTA_NOT_ENOUGH", "CODE_RISK_REJECT", "CODE_SUCCESS", "createPromoCodeBottomSheet", "Lid/dana/promocode/views/PromoCodeBottomSheet;", "activity", "Landroid/app/Activity;", "serverCode", "prizeName", "createSuccessBottomSheet", "getDesc", "flag", "getFlag", "getImgRes", "", "getPositiveButtonText", "getTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class mapUrl {
    @NotNull
    public static final mapUrl getMin = new mapUrl();

    private mapUrl() {
    }

    @JvmStatic
    @NotNull
    public static final setLandscape getMin(@NotNull Activity activity, @NotNull String str) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intrinsics.checkNotNullParameter(str, "prizeName");
        return setMin(activity, "CODE_SUCCESS", str);
    }

    @JvmStatic
    @NotNull
    public static final setLandscape setMax(@NotNull Activity activity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        return setMin(activity, str, (String) null);
    }

    @DrawableRes
    private static int setMin(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            switch (upperCase.hashCode()) {
                case -1452302473:
                    return upperCase.equals("LIMIT_EXCEEDED") ? R.drawable.img_promocode_claimed : R.drawable.img_promo_code_general_error;
                case -1049996093:
                    if (upperCase.equals("QUOTA_NOT_ENOUGH")) {
                        return R.drawable.img_promocode_out_of_time;
                    }
                    return R.drawable.img_promo_code_general_error;
                case -915868802:
                    if (upperCase.equals("CODE_NOT_VALID")) {
                        return R.drawable.img_promocode_code_invalid;
                    }
                    return R.drawable.img_promo_code_general_error;
                case 212273935:
                    if (upperCase.equals("RISK_REJECT")) {
                        return R.drawable.img_promocode_risk_reject;
                    }
                    return R.drawable.img_promo_code_general_error;
                case 404085649:
                    if (upperCase.equals("CODE_SUCCESS")) {
                        return R.drawable.img_promo_code_success;
                    }
                    return R.drawable.img_promo_code_general_error;
                case 962020019:
                    if (upperCase.equals("CODE_EXPIRED")) {
                        return R.drawable.img_promocode_code_expired;
                    }
                    return R.drawable.img_promo_code_general_error;
                default:
                    return R.drawable.img_promo_code_general_error;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    private static String length(Activity activity, String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            switch (upperCase.hashCode()) {
                case -1452302473:
                    if (upperCase.equals("LIMIT_EXCEEDED")) {
                        String string = activity.getString(R.string.promocode_bottomsheet_claimed_title);
                        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …ottomsheet_claimed_title)");
                        return string;
                    }
                    break;
                case -1049996093:
                    if (upperCase.equals("QUOTA_NOT_ENOUGH")) {
                        String string2 = activity.getString(R.string.promocode_bottomsheet_quota_not_enough_title);
                        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(\n    …t_quota_not_enough_title)");
                        return string2;
                    }
                    break;
                case -915868802:
                    if (upperCase.equals("CODE_NOT_VALID")) {
                        String string3 = activity.getString(R.string.promocode_bottomsheet_invalid_title);
                        Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(R.str…ottomsheet_invalid_title)");
                        return string3;
                    }
                    break;
                case 212273935:
                    if (upperCase.equals("RISK_REJECT")) {
                        String string4 = activity.getString(R.string.promocode_bottomsheet_risk_reject_title);
                        Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(R.str…msheet_risk_reject_title)");
                        return string4;
                    }
                    break;
                case 404085649:
                    if (upperCase.equals("CODE_SUCCESS")) {
                        String string5 = activity.getString(R.string.promocode_bottomsheet_success_title);
                        Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(R.str…ottomsheet_success_title)");
                        return string5;
                    }
                    break;
                case 962020019:
                    if (upperCase.equals("CODE_EXPIRED")) {
                        String string6 = activity.getString(R.string.promocode_bottomsheet_expired_title);
                        Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(\n    …ottomsheet_expired_title)");
                        return string6;
                    }
                    break;
            }
            String string7 = activity.getString(R.string.promocode_bottomsheet_general_error_title);
            Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(R.str…heet_general_error_title)");
            return string7;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static String length(Activity activity, String str, String str2) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            switch (upperCase.hashCode()) {
                case -1452302473:
                    if (upperCase.equals("LIMIT_EXCEEDED")) {
                        String string = activity.getString(R.string.promocode_bottomsheet_claimed_desc);
                        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …bottomsheet_claimed_desc)");
                        return string;
                    }
                    break;
                case -1049996093:
                    if (upperCase.equals("QUOTA_NOT_ENOUGH")) {
                        String string2 = activity.getString(R.string.promocode_bottomsheet_quota_not_enough_desc);
                        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(\n    …et_quota_not_enough_desc)");
                        return string2;
                    }
                    break;
                case -915868802:
                    if (upperCase.equals("CODE_NOT_VALID")) {
                        String string3 = activity.getString(R.string.promocode_bottomsheet_invalid_desc);
                        Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(R.str…bottomsheet_invalid_desc)");
                        return string3;
                    }
                    break;
                case 212273935:
                    if (upperCase.equals("RISK_REJECT")) {
                        String string4 = activity.getString(R.string.promocode_bottomsheet_risk_reject_desc);
                        Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(R.str…omsheet_risk_reject_desc)");
                        return string4;
                    }
                    break;
                case 404085649:
                    if (upperCase.equals("CODE_SUCCESS")) {
                        String string5 = activity.getString(R.string.promocode_bottomsheet_success_desc, new Object[]{str2});
                        Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(R.str…c,\n            prizeName)");
                        return string5;
                    }
                    break;
                case 962020019:
                    if (upperCase.equals("CODE_EXPIRED")) {
                        String string6 = activity.getString(R.string.promocode_bottomsheet_expired_desc);
                        Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(\n    …bottomsheet_expired_desc)");
                        return string6;
                    }
                    break;
            }
            String string7 = activity.getString(R.string.promocode_bottomsheet_general_error_desc);
            Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(R.str…sheet_general_error_desc)");
            return string7;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static String setMin(Activity activity, String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
            if (upperCase.hashCode() == 404085649 && upperCase.equals("CODE_SUCCESS")) {
                String string = activity.getString(R.string.promocode_bottomsheet_success_positive_button);
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …_success_positive_button)");
                return string;
            }
            String string2 = activity.getString(R.string.promocode_try_again);
            Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(R.string.promocode_try_again)");
            return string2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private static setLandscape setMin(Activity activity, String str, String str2) {
        String str3 = "CODE_SUCCESS";
        if (!Intrinsics.areEqual((Object) str, (Object) str3)) {
            str3 = new Object() {
                private final Map<String, String> getMin;

                public final o.GriverDataCacheExtensionImpl setMin(
/*
Method generation error in method: o.GriverChooseFileExtensionImpl.1.setMin(java.lang.String):o.GriverDataCacheExtensionImpl, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverChooseFileExtensionImpl.1.setMin(java.lang.String):o.GriverDataCacheExtensionImpl, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.instanceField(InsnGen.java:171)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }.setMin(str).setMax;
        }
        setLandscape.setMax setmax = setLandscape.getMin;
        int min = setMin(str3);
        String length = length(activity, str3);
        String length2 = length(activity, str3, str2);
        String min2 = setMin(activity, str3);
        Intrinsics.checkNotNullParameter(length, "title");
        Intrinsics.checkNotNullParameter(length2, SecurityConstants.KEY_DESC);
        Intrinsics.checkNotNullParameter(min2, "positiveButtonText");
        return setLandscape.setMax.length(min, length, length2, min2);
    }
}
