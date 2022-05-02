package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.RVOpenAuthHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ-\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lid/dana/data/social/repository/source/network/NetworkSocialSyncProcessEntityData;", "Lid/dana/data/social/core/SecureBaseNetwork;", "Lid/dana/data/social/repository/source/network/SocialSyncFacade;", "Lid/dana/data/social/repository/SocialSyncProcessEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "filterDanaUser", "", "", "kotlin.jvm.PlatformType", "phoneNumbersToCheck", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFacadeClass", "Ljava/lang/Class;", "initFeed", "Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "totalPhoneContactSize", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncContact", "Lid/dana/data/social/repository/source/network/result/SocialSyncResponse;", "userContacts", "Lid/dana/data/social/model/SocialUserContact;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBizContent extends getLocalPermissionDialog<setExtParams> implements setScopeNicks {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00040\u00040\u00030\u0006H@"}, d2 = {"filterDanaUser", "", "phoneNumbersToCheck", "", "", "continuation", "Lkotlin/coroutines/Continuation;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.data.social.repository.source.network.NetworkSocialSyncProcessEntityData", f = "NetworkSocialSyncProcessEntityData.kt", i = {}, l = {35}, m = "filterDanaUser", n = {}, s = {})
    static final class setMax extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ getBizContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(getBizContent getbizcontent, Continuation continuation) {
            super(continuation);
            this.this$0 = getbizcontent;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.filterDanaUser((List<String>) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public getBizContent(@NotNull setIsUrgentResource setisurgentresource, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(onappresume, context, setisurgentresource);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<setExtParams> getFacadeClass() {
        return setExtParams.class;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/synccontact/repository/source/network/result/BizTransferSyncContactResult;", "facade", "Lid/dana/data/social/repository/source/network/SocialSyncFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<setExtParams, updateApp> {
        final /* synthetic */ List $phoneNumbersToCheck;
        final /* synthetic */ getBizContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(getBizContent getbizcontent, List list) {
            super(1);
            this.this$0 = getbizcontent;
            this.$phoneNumbersToCheck = list;
        }

        @NotNull
        public final updateApp invoke(@NotNull setExtParams setextparams) {
            Intrinsics.checkNotNullParameter(setextparams, "facade");
            setNeedShowError setneedshowerror = new setNeedShowError();
            setneedshowerror.envInfo = this.this$0.generateMobileEnvInfo();
            setneedshowerror.phoneNumbers = this.$phoneNumbersToCheck;
            Unit unit = Unit.INSTANCE;
            return setextparams.checkDanaUser(setneedshowerror);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object filterDanaUser(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o.getBizContent.setMax
            if (r0 == 0) goto L_0x0014
            r0 = r6
            o.getBizContent$setMax r0 = (o.getBizContent.setMax) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            o.getBizContent$setMax r0 = new o.getBizContent$setMax
            r0.<init>(r4, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0045
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r6)
            o.getBizContent$getMax r6 = new o.getBizContent$getMax
            r6.<init>(r4, r5)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r0.label = r3
            java.lang.Object r6 = r4.wrapper(r6, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            o.updateApp r6 = (o.updateApp) r6
            java.util.List<java.lang.String> r5 = r6.registeredUsers
            if (r5 != 0) goto L_0x004f
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBizContent.filterDanaUser(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/result/SocialSyncResponse;", "facade", "Lid/dana/data/social/repository/source/network/SocialSyncFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<setExtParams, getErrorScopes> {
        final /* synthetic */ List $userContacts;
        final /* synthetic */ getBizContent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(getBizContent getbizcontent, List list) {
            super(1);
            this.this$0 = getbizcontent;
            this.$userContacts = list;
        }

        @NotNull
        public final getErrorScopes invoke(@NotNull setExtParams setextparams) {
            Intrinsics.checkNotNullParameter(setextparams, "facade");
            setAuthText setauthtext = new setAuthText(this.$userContacts);
            setauthtext.envInfo = this.this$0.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return setextparams.syncSocialContact(setauthtext);
        }
    }

    @Nullable
    public final Object syncContact(@NotNull List<RVOpenAuthHelper.AnonymousClass4> list, @NotNull Continuation<? super getErrorScopes> continuation) {
        return wrapper(new getMin(this, list), continuation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "facade", "Lid/dana/data/social/repository/source/network/SocialSyncFacade;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<setExtParams, setAuthCode> {
        final /* synthetic */ int $totalPhoneContactSize;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(int i) {
            super(1);
            this.$totalPhoneContactSize = i;
        }

        @NotNull
        public final setAuthCode invoke(@NotNull setExtParams setextparams) {
            Intrinsics.checkNotNullParameter(setextparams, "facade");
            return setextparams.initFeed(new getAuthText(this.$totalPhoneContactSize, 0, 2, (DefaultConstructorMarker) null));
        }
    }

    @Nullable
    public final Object initFeed(int i, @NotNull Continuation<? super setAuthCode> continuation) {
        return wrapper(new setMin(i), continuation);
    }
}
