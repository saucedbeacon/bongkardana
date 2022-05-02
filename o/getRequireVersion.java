package o;

import android.content.Context;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PermissionModel;
import o.RVResourceUtils;
import o.b;
import org.jetbrains.annotations.NotNull;

public final class getRequireVersion implements getAdapterPosition<PermissionModel.AnonymousClass1> {
    private final b.C0007b<Context> contextProvider;

    public getRequireVersion(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final PermissionModel.AnonymousClass1 get() {
        return newInstance(this.contextProvider.get());
    }

    public static getRequireVersion create(b.C0007b<Context> bVar) {
        return new getRequireVersion(bVar);
    }

    public static PermissionModel.AnonymousClass1 newInstance(Context context) {
        return new Object(context) {
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_DANA_FOOD = "bottom_sheet_on_boarding_dana_food";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_DANA_KAGET = "bottom_sheet_on_boarding_dana_kaget";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_FRIENDSHIP = "bottom_sheet_on_boarding_friendship";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_HIDE_FROM_QUICK_ACTION = "bottom_sheet_on_boarding_hide_from_qucik_action";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_MY_BILLS = "bottom_sheet_on_boarding_my_bills";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_REQUEST_MONEY = "bottom_sheet_on_boarding_request_money";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_SAVING_GOAL = "bottom_sheet_on boarding_saving_goal";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_SCAN_QR = "bottom_sheet_on_boarding_scan_qr";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_SEND_MONEY = "bottom_sheet_on_boarding_send_money";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_SNAP_RECEIPT = "bottom_sheet_on_boarding_snap_receipt";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_SPLIT_BILL = "bottom_sheet_on_boarding_split_bill";
            @NotNull
            public static final String BOTTOM_SHEET_ON_BOARDING_TOP_UP = "bottom_sheet_on_boarding_top_up";
            @NotNull
            public static final String BOTTOM_SHEET_SEND_MONEY_CONTACT_PERMISSION = "bottom_sheet_send_money_contact_permission";
            @NotNull
            public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
            @NotNull
            public static final String EDIT_FAVORITE_SERVICE_TOOLTIP = "edit_favorite_service_tooltip";
            @NotNull
            public static final String LOTTIE_ON_BOARDING_STATEMENT = "lottie_on_boarding_statement";
            @NotNull
            public static final String MOBILE_DATA_PERMISSION_ACCEPTED = "mobile_data_permission_accepted";
            @NotNull
            public static final String PROFILE_COMPLETION_WIDGET_CLOSED = "profile_completion_widget_closed";
            @NotNull
            public static final String PROFILE_COMPLETION_WIDGET_TOOLTIP = "profile_completion_widget";
            @NotNull
            public static final String USER_EDUCATION_PREFERENCE = "UserEducationPreferenceproduction";
            @NotNull
            public static final String USER_EDUCATION_TOOLTIP = "user_education_tooltip";
            private final onSingleFailed preferenceFacade;

            {
                onSingleFailed createData = new RVResourceUtils(new RVResourceUtils.getMax(r2).setPreferenceGroup("UserEducationPreferenceproduction").setUseDrutherPreference(true)).createData("local");
                Intrinsics.checkNotNullExpressionValue(createData, "LocalStorageFactory(buil….createData(Source.LOCAL)");
                this.preferenceFacade = createData;
            }

            public final boolean getToolTipShow(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "scenario");
                Intrinsics.checkNotNullParameter(str2, "phoneNumber");
                switch (str.hashCode()) {
                    case -1872601359:
                        if (!str.equals("profile_completion_widget")) {
                            return true;
                        }
                        Boolean bool = this.preferenceFacade.getBoolean("profile_completion_widget".concat(String.valueOf(str2)), false);
                        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…mber, false\n            )");
                        return bool.booleanValue();
                    case -186227545:
                        if (!str.equals("edit_favorite_service")) {
                            return true;
                        }
                        Boolean bool2 = this.preferenceFacade.getBoolean(EDIT_FAVORITE_SERVICE_TOOLTIP.concat(String.valueOf(str2)), false);
                        Intrinsics.checkNotNullExpressionValue(bool2, "preferenceFacade.getBool…mber, false\n            )");
                        return bool2.booleanValue();
                    case 1733885562:
                        if (!str.equals(PROFILE_COMPLETION_WIDGET_CLOSED)) {
                            return true;
                        }
                        Boolean bool3 = this.preferenceFacade.getBoolean(PROFILE_COMPLETION_WIDGET_CLOSED.concat(String.valueOf(str2)), false);
                        Intrinsics.checkNotNullExpressionValue(bool3, "preferenceFacade.getBool…mber, false\n            )");
                        return bool3.booleanValue();
                    case 2118081007:
                        if (!str.equals("home_page")) {
                            return true;
                        }
                        Boolean bool4 = this.preferenceFacade.getBoolean(USER_EDUCATION_TOOLTIP.concat(String.valueOf(str2)), false);
                        Intrinsics.checkNotNullExpressionValue(bool4, "preferenceFacade.getBool…mber, false\n            )");
                        return bool4.booleanValue();
                    default:
                        return true;
                }
            }

            public final boolean saveToolTipShow(boolean z, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "scenario");
                Intrinsics.checkNotNullParameter(str2, "phoneNumber");
                switch (str.hashCode()) {
                    case -1872601359:
                        if (!str.equals("profile_completion_widget")) {
                            return true;
                        }
                        this.preferenceFacade.saveData("profile_completion_widget".concat(String.valueOf(str2)), Boolean.valueOf(z));
                        return true;
                    case -186227545:
                        if (!str.equals("edit_favorite_service")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(EDIT_FAVORITE_SERVICE_TOOLTIP.concat(String.valueOf(str2)), Boolean.valueOf(z));
                        return true;
                    case 1733885562:
                        if (!str.equals(PROFILE_COMPLETION_WIDGET_CLOSED)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(PROFILE_COMPLETION_WIDGET_CLOSED.concat(String.valueOf(str2)), Boolean.valueOf(z));
                        return true;
                    case 2118081007:
                        if (!str.equals("home_page")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(USER_EDUCATION_TOOLTIP.concat(String.valueOf(str2)), Boolean.valueOf(z));
                        return true;
                    default:
                        return true;
                }
            }

            public final boolean getBottomSheetOnBoardingShow(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "scenario");
                Intrinsics.checkNotNullParameter(str2, "phoneNumber");
                switch (str.hashCode()) {
                    case -2085148305:
                        if (!str.equals("statement")) {
                            return false;
                        }
                        Boolean bool = this.preferenceFacade.getBoolean(LOTTIE_ON_BOARDING_STATEMENT.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade.getBool…er,\n                true)");
                        return bool.booleanValue();
                    case -1755748902:
                        if (!str.equals(BottomSheetOnBoardingScenario.FRIENDSHIP)) {
                            return false;
                        }
                        Boolean bool2 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_FRIENDSHIP.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool2, "preferenceFacade.getBool…SHIP + phoneNumber, true)");
                        return bool2.booleanValue();
                    case -1444372797:
                        if (!str.equals(BottomSheetOnBoardingScenario.SNAP_RECEIPT)) {
                            return false;
                        }
                        Boolean bool3 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_SNAP_RECEIPT.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool3, "preferenceFacade.getBool…EIPT + phoneNumber, true)");
                        return bool3.booleanValue();
                    case -1393841075:
                        if (!str.equals(BottomSheetOnBoardingScenario.DANA_FOOD)) {
                            return false;
                        }
                        Boolean bool4 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_DANA_FOOD.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool4, "preferenceFacade.getBool…FOOD + phoneNumber, true)");
                        return bool4.booleanValue();
                    case -1259411291:
                        if (!str.equals(BottomSheetOnBoardingScenario.HIDE_QUICK_ACTION)) {
                            return false;
                        }
                        Boolean bool5 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_HIDE_FROM_QUICK_ACTION.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool5, "preferenceFacade.getBool…TION + phoneNumber, true)");
                        return bool5.booleanValue();
                    case -868043323:
                        if (!str.equals(BottomSheetOnBoardingScenario.TOP_UP)) {
                            return false;
                        }
                        Boolean bool6 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_TOP_UP.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool6, "preferenceFacade.getBool…P_UP + phoneNumber, true)");
                        return bool6.booleanValue();
                    case -711814856:
                        if (!str.equals(BottomSheetOnBoardingScenario.SAVING_GOAL)) {
                            return false;
                        }
                        Boolean bool7 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_SAVING_GOAL.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool7, "preferenceFacade.getBool…er,\n                true)");
                        return bool7.booleanValue();
                    case -479929095:
                        if (!str.equals(BottomSheetOnBoardingScenario.MY_BILLS)) {
                            return false;
                        }
                        Boolean bool8 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_MY_BILLS.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool8, "preferenceFacade.getBool…ILLS + phoneNumber, true)");
                        return bool8.booleanValue();
                    case -340352500:
                        if (!str.equals("split_bill")) {
                            return false;
                        }
                        Boolean bool9 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_SPLIT_BILL.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool9, "preferenceFacade.getBool…BILL + phoneNumber, true)");
                        return bool9.booleanValue();
                    case -255207375:
                        if (!str.equals(BottomSheetOnBoardingScenario.DANA_KAGET)) {
                            return false;
                        }
                        Boolean bool10 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_DANA_KAGET.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool10, "preferenceFacade.getBool…AGET + phoneNumber, true)");
                        return bool10.booleanValue();
                    case 387440132:
                        if (!str.equals(BottomSheetOnBoardingScenario.SEND_MONEY_CONTACT_REQUEST_PERMISSION)) {
                            return false;
                        }
                        Boolean bool11 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_SEND_MONEY_CONTACT_PERMISSION.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool11, "preferenceFacade.getBool…er,\n                true)");
                        return bool11.booleanValue();
                    case 821988681:
                        if (!str.equals("send_money")) {
                            return false;
                        }
                        Boolean bool12 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_SEND_MONEY.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool12, "preferenceFacade.getBool…ONEY + phoneNumber, true)");
                        return bool12.booleanValue();
                    case 1740443408:
                        if (!str.equals("request_money")) {
                            return false;
                        }
                        Boolean bool13 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_REQUEST_MONEY.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool13, "preferenceFacade.getBool…ONEY + phoneNumber, true)");
                        return bool13.booleanValue();
                    case 1910947619:
                        if (!str.equals("scan_qr")) {
                            return false;
                        }
                        Boolean bool14 = this.preferenceFacade.getBoolean(BOTTOM_SHEET_ON_BOARDING_SCAN_QR.concat(String.valueOf(str2)), true);
                        Intrinsics.checkNotNullExpressionValue(bool14, "preferenceFacade.getBool…N_QR + phoneNumber, true)");
                        return bool14.booleanValue();
                    default:
                        return false;
                }
            }

            public final boolean saveBottomSheetOnBoardingShow(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "scenario");
                Intrinsics.checkNotNullParameter(str2, "phoneNumber");
                switch (str.hashCode()) {
                    case -2085148305:
                        if (!str.equals("statement")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(LOTTIE_ON_BOARDING_STATEMENT.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -1755748902:
                        if (!str.equals(BottomSheetOnBoardingScenario.FRIENDSHIP)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_FRIENDSHIP.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -1444372797:
                        if (!str.equals(BottomSheetOnBoardingScenario.SNAP_RECEIPT)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_SNAP_RECEIPT.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -1393841075:
                        if (!str.equals(BottomSheetOnBoardingScenario.DANA_FOOD)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_DANA_FOOD.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -1259411291:
                        if (!str.equals(BottomSheetOnBoardingScenario.HIDE_QUICK_ACTION)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_HIDE_FROM_QUICK_ACTION.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -868043323:
                        if (!str.equals(BottomSheetOnBoardingScenario.TOP_UP)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_TOP_UP.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -711814856:
                        if (!str.equals(BottomSheetOnBoardingScenario.SAVING_GOAL)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_SAVING_GOAL.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -479929095:
                        if (!str.equals(BottomSheetOnBoardingScenario.MY_BILLS)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_MY_BILLS.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -340352500:
                        if (!str.equals("split_bill")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_SPLIT_BILL.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case -255207375:
                        if (!str.equals(BottomSheetOnBoardingScenario.DANA_KAGET)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_DANA_KAGET.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case 387440132:
                        if (!str.equals(BottomSheetOnBoardingScenario.SEND_MONEY_CONTACT_REQUEST_PERMISSION)) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_SEND_MONEY_CONTACT_PERMISSION.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case 821988681:
                        if (!str.equals("send_money")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_SEND_MONEY.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case 1740443408:
                        if (!str.equals("request_money")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_REQUEST_MONEY.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    case 1910947619:
                        if (!str.equals("scan_qr")) {
                            return true;
                        }
                        this.preferenceFacade.saveData(BOTTOM_SHEET_ON_BOARDING_SCAN_QR.concat(String.valueOf(str2)), Boolean.FALSE);
                        return true;
                    default:
                        return true;
                }
            }

            public final boolean setMobileDataPermissionAccepted(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "phoneNumber");
                this.preferenceFacade.saveData(MOBILE_DATA_PERMISSION_ACCEPTED.concat(String.valueOf(str)), Boolean.TRUE);
                return true;
            }

            public final boolean checkMobileDataPermissionAccepted(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "phoneNumber");
                Boolean bool = this.preferenceFacade.getBoolean(MOBILE_DATA_PERMISSION_ACCEPTED.concat(String.valueOf(str)), false);
                Intrinsics.checkNotNullExpressionValue(bool, "preferenceFacade\n       …TED + phoneNumber, false)");
                return bool.booleanValue();
            }

            public final void clearAll() {
                this.preferenceFacade.clearAllData();
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/data/usereducation/repository/source/local/UserEducationPreference$Companion;", "", "()V", "BOTTOM_SHEET_ON_BOARDING_DANA_FOOD", "", "BOTTOM_SHEET_ON_BOARDING_DANA_KAGET", "BOTTOM_SHEET_ON_BOARDING_FRIENDSHIP", "BOTTOM_SHEET_ON_BOARDING_HIDE_FROM_QUICK_ACTION", "BOTTOM_SHEET_ON_BOARDING_MY_BILLS", "BOTTOM_SHEET_ON_BOARDING_REQUEST_MONEY", "BOTTOM_SHEET_ON_BOARDING_SAVING_GOAL", "BOTTOM_SHEET_ON_BOARDING_SCAN_QR", "BOTTOM_SHEET_ON_BOARDING_SEND_MONEY", "BOTTOM_SHEET_ON_BOARDING_SNAP_RECEIPT", "BOTTOM_SHEET_ON_BOARDING_SPLIT_BILL", "BOTTOM_SHEET_ON_BOARDING_TOP_UP", "BOTTOM_SHEET_SEND_MONEY_CONTACT_PERMISSION", "EDIT_FAVORITE_SERVICE_TOOLTIP", "LOTTIE_ON_BOARDING_STATEMENT", "MOBILE_DATA_PERMISSION_ACCEPTED", "PROFILE_COMPLETION_WIDGET_CLOSED", "PROFILE_COMPLETION_WIDGET_TOOLTIP", "USER_EDUCATION_PREFERENCE", "USER_EDUCATION_TOOLTIP", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.PermissionModel$1$setMin */
            public static final class setMin {
                private setMin() {
                }

                public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }
        };
    }
}
