package o;

import id.dana.data.bank.UserBankExistException;
import id.dana.data.userconfig.BiztypeNotFoundException;
import id.dana.data.userconfig.UserConfigBizTypeConstant;
import id.dana.domain.bank.model.UserBank;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00150\u000fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/data/bank/repository/UserBankEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/bank/repository/UserBankRepository;", "userConfigRepository", "Lid/dana/data/userconfig/repository/UserConfigEntityRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "(Lid/dana/data/userconfig/repository/UserConfigEntityRepository;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;)V", "addUserBank", "Lio/reactivex/Observable;", "", "userBank", "Lid/dana/domain/bank/model/UserBank;", "deleteUserBank", "getUserBanks", "", "hasUserBank", "returnEmptyListForBizTypeNotFound", "", "Lid/dana/data/bank/model/UserConfigBankQrContent;", "it", "", "(Ljava/lang/Throwable;)[Lid/dana/data/bank/model/UserConfigBankQrContent;", "saveUserBanks", "userBanks", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class playAnimation extends setMinProgress implements PageFinishedPoint {
    private final getOrigin length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/data/bank/model/UserConfigBankQrContent;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Throwable;)[Lid/dana/data/bank/model/UserConfigBankQrContent;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Throwable, resumeAnimation[]> {
        final /* synthetic */ playAnimation setMin;

        getMax(playAnimation playanimation) {
            this.setMin = playanimation;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            Intrinsics.checkNotNullParameter(th, "it");
            return playAnimation.getMax(th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/domain/bank/model/UserBank;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<List<? extends UserBank>, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ playAnimation getMax;
        final /* synthetic */ UserBank length;

        getMin(playAnimation playanimation, UserBank userBank) {
            this.getMax = playanimation;
            this.length = userBank;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            if (!list.contains(this.length)) {
                playAnimation playanimation = this.getMax;
                List mutableList = CollectionsKt.toMutableList(list);
                mutableList.add(this.length);
                Unit unit = Unit.INSTANCE;
                return playanimation.saveUserBanks(mutableList);
            }
            throw new UserBankExistException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lid/dana/domain/bank/model/UserBank;", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/data/bank/model/UserConfigBankQrContent;", "apply", "([Lid/dana/data/bank/model/UserConfigBankQrContent;)Ljava/util/List;"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<resumeAnimation[], List<? extends UserBank>> {
        public static final length getMin = new length();

        length() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            resumeAnimation[] resumeanimationArr = (resumeAnimation[]) obj;
            Intrinsics.checkNotNullParameter(resumeanimationArr, "it");
            Intrinsics.checkNotNullParameter(resumeanimationArr, "$this$toUserBanks");
            Collection arrayList = new ArrayList(resumeanimationArr.length);
            for (resumeAnimation resumeanimation : resumeanimationArr) {
                Intrinsics.checkNotNullParameter(resumeanimation, "$this$toUserBank");
                String bankAccountIndexNo = resumeanimation.getBankAccountIndexNo();
                String str6 = bankAccountIndexNo == null ? "" : bankAccountIndexNo;
                String bankAccountHolderName = resumeanimation.getBankAccountHolderName();
                if (bankAccountHolderName == null) {
                    str = "";
                } else {
                    str = bankAccountHolderName;
                }
                String bankAccountFormattedMaskedNo = resumeanimation.getBankAccountFormattedMaskedNo();
                if (bankAccountFormattedMaskedNo == null) {
                    str2 = "";
                } else {
                    str2 = bankAccountFormattedMaskedNo;
                }
                String withdrawInstId = resumeanimation.getWithdrawInstId();
                if (withdrawInstId == null) {
                    str3 = "";
                } else {
                    str3 = withdrawInstId;
                }
                String withdrawPayMethod = resumeanimation.getWithdrawPayMethod();
                if (withdrawPayMethod == null) {
                    str4 = "";
                } else {
                    str4 = withdrawPayMethod;
                }
                String withdrawPayOption = resumeanimation.getWithdrawPayOption();
                if (withdrawPayOption == null) {
                    str5 = "";
                } else {
                    str5 = withdrawPayOption;
                }
                String withdrawInstLocalName = resumeanimation.getWithdrawInstLocalName();
                if (withdrawInstLocalName == null) {
                    withdrawInstLocalName = "";
                }
                arrayList.add(new UserBank(str6, str, str2, str3, str4, str5, withdrawInstLocalName));
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/domain/bank/model/UserBank;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<? extends UserBank>, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ UserBank length;

        setMax(UserBank userBank) {
            this.length = userBank;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(list.contains(this.length)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "userBanks", "", "Lid/dana/domain/bank/model/UserBank;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<? extends UserBank>, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ UserBank length;
        final /* synthetic */ playAnimation setMin;

        setMin(playAnimation playanimation, UserBank userBank) {
            this.setMin = playanimation;
            this.length = userBank;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1<Boolean> r2;
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "userBanks");
            List mutableList = CollectionsKt.toMutableList(list);
            if (!mutableList.remove(this.length)) {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(false)");
            } else {
                r2 = this.setMin.saveUserBanks(mutableList);
            }
            return r2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public playAnimation(@NotNull getOrigin getorigin, @NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r4, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r4, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(getorigin, "userConfigRepository");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r4, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        this.length = getorigin;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<UserBank>> getUserBanks() {
        TitleBarRightButtonView.AnonymousClass1<List<UserBank>> map = this.length.getUserSpecificConfig(new onFirstScanTime(UserConfigBizTypeConstant.CONFIG_USER_BANK_ACCOUNT_QR, resumeAnimation[].class)).onErrorReturn(new getMax(this)).map(length.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "userConfigRepository.get….map { it.toUserBanks() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserBanks(@NotNull List<UserBank> list) {
        Intrinsics.checkNotNullParameter(list, "userBanks");
        getOrigin getorigin = this.length;
        Object[] array = setMinFrame.setMin(list).toArray(new resumeAnimation[0]);
        if (array != null) {
            TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserSpecificConfig = getorigin.saveUserSpecificConfig(new hasMatte((resumeAnimation[]) array));
            Intrinsics.checkNotNullExpressionValue(saveUserSpecificConfig, "userConfigRepository.sav…ontent().toTypedArray()))");
            return saveUserSpecificConfig;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> addUserBank(@NotNull UserBank userBank) {
        Intrinsics.checkNotNullParameter(userBank, "userBank");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getUserBanks().flatMap(new getMin(this, userBank));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getUserBanks().flatMap {…rBank) })\n        }\n    }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> deleteUserBank(@NotNull UserBank userBank) {
        Intrinsics.checkNotNullParameter(userBank, "userBank");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getUserBanks().flatMap(new setMin(this, userBank));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getUserBanks().flatMap {…)\n            }\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> hasUserBank(@NotNull UserBank userBank) {
        Intrinsics.checkNotNullParameter(userBank, "userBank");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = getUserBanks().flatMap(new setMax(userBank));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getUserBanks().flatMap {…(it.contains(userBank)) }");
        return flatMap;
    }

    public static final /* synthetic */ resumeAnimation[] getMax(Throwable th) {
        if (th instanceof BiztypeNotFoundException) {
            return new resumeAnimation[0];
        }
        throw th;
    }
}
