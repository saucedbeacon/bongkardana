package o;

import android.text.TextUtils;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.ScheduleExtensionInvoker;
import o.TitleBarRightButtonView;

@Singleton
public class ResolveExtensionInvoker implements setTimeoutForContext {
    private final SecurityExtensionInvoker recentContactEntityDataFactory;
    private final handleSetNode recentContactEntityMapper;

    @Inject
    public ResolveExtensionInvoker(handleSetNode handlesetnode, SecurityExtensionInvoker securityExtensionInvoker) {
        this.recentContactEntityMapper = handlesetnode;
        this.recentContactEntityDataFactory = securityExtensionInvoker;
    }

    private ScheduleExtensionInvoker.AnonymousClass3 createContactEntityData() {
        return this.recentContactEntityDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> storeRecentContact(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str2)) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
        return createContactEntityData().saveRecentContact(new NodeAware(str, str2.replace("62-", "0"), str3, str4, getBadgeList.getNowDateInEpoch(), false)).flatMap(ScheduleExtensionInvoker.AnonymousClass2.getMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$storeRecentContact$0(Long l) throws Exception {
        if (l != null) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getErrorStatusPageUrl>> getRecentContact() {
        TitleBarRightButtonView.AnonymousClass1<List<NodeAware>> recentContact = createContactEntityData().getRecentContact();
        handleSetNode handlesetnode = this.recentContactEntityMapper;
        Objects.requireNonNull(handlesetnode);
        return recentContact.map(new RedDotDrawable(handlesetnode) {
            private final handleSetNode getMin;

            {
                this.getMin = r1;
            }

            public final Object apply(Object obj) {
                return this.getMin.apply((List<NodeAware>) (List) obj);
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveDanaUserContact(String str, String str2) {
        return createContactEntityData().saveDanaUserContact(new DataNode(str, str2, getBadgeList.getNowDateInEpoch())).flatMap(ScheduleExtensionInvoker.setMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveDanaUserContact$1(Long l) throws Exception {
        if (l != null) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getDanaUserContact() {
        return createContactEntityData().getDanaUserContact();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveDanaUserContact(String str) {
        return saveDanaUserContact((String) null, str);
    }
}
