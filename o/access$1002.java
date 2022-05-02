package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/user/interactor/GetEmptyUserInfo;", "Lid/dana/domain/core/usecase/BaseUseCase;", "", "", "Lid/dana/domain/user/interactor/GetEmptyUserInfo$Params;", "userRepository", "Lid/dana/domain/user/repository/UserRepository;", "accountRepository", "Lid/dana/domain/account/AccountRepository;", "(Lid/dana/domain/user/repository/UserRepository;Lid/dana/domain/account/AccountRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class access$1002 extends APWebChromeClient<List<? extends String>, setMax> {
    private final getCommonResources accountRepository;
    /* access modifiers changed from: private */
    public final onDescriptorWrite userRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012D\u0010\u0004\u001a@\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "userData", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Map<String, String>, List<? extends String>> {
        public static final getMax length = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            Intrinsics.checkNotNullParameter(map, "userData");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getValue();
                Intrinsics.checkNotNullExpressionValue(str, "it");
                boolean z = true;
                if (!(str.length() == 0) && !Intrinsics.areEqual((Object) str, (Object) "[]")) {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map map2 = linkedHashMap;
            Collection arrayList = new ArrayList(map2.size());
            for (Map.Entry key : map2.entrySet()) {
                arrayList.add((String) key.getKey());
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\u0010\u0000\u001a\u0001\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*L\u0012F\b\u0001\u0012B\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends Map<String, String>>> {
        final /* synthetic */ setMax getMin;
        final /* synthetic */ access$1002 setMax;

        length(access$1002 access_1002, setMax setmax) {
            this.setMax = access_1002;
            this.getMin = setmax;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            return this.setMax.userRepository.checkUserInfo(this.getMin.getScopes$domain_release(), this.getMin.getClientId$domain_release(), str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public access$1002(@NotNull onDescriptorWrite ondescriptorwrite, @NotNull getCommonResources getcommonresources) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(ondescriptorwrite, "userRepository");
        Intrinsics.checkNotNullParameter(getcommonresources, "accountRepository");
        this.userRepository = ondescriptorwrite;
        this.accountRepository = getcommonresources;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> buildUseCase(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> map = this.accountRepository.getUserId().flatMap(new length(this, setmax)).map(getMax.length);
        Intrinsics.checkNotNullExpressionValue(map, "accountRepository.userId…= \"[]\" }.map { it.key } }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/user/interactor/GetEmptyUserInfo$Params;", "", "scopes", "", "clientId", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId$domain_release", "()Ljava/lang/String;", "getScopes$domain_release", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @Nullable
        private final String clientId;
        @Nullable
        private final String scopes;

        public setMax(@Nullable String str, @Nullable String str2) {
            this.scopes = str;
            this.clientId = str2;
        }

        @Nullable
        public final String getClientId$domain_release() {
            return this.clientId;
        }

        @Nullable
        public final String getScopes$domain_release() {
            return this.scopes;
        }
    }
}
