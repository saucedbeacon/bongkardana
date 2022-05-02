package o;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.Branch;
import o.b;

public final class VisitNode implements getAdapterPosition<addRenderReadyListener> {
    private final b.C0007b<getVisitUrl> branchIoDeepLinkEntityMapperProvider;
    private final b.C0007b<Branch> branchProvider;
    private final b.C0007b<Context> contextProvider;

    /* renamed from: o.VisitNode$1  reason: invalid class name */
    public class AnonymousClass1 {
        private String link;
        private String referralCode;

        public AnonymousClass1() {
        }

        public AnonymousClass1(String str) {
            this.link = str;
        }

        public String getLink() {
            return this.link;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public String getReferralCode() {
            return this.referralCode;
        }

        public void setReferralCode(String str) {
            this.referralCode = str;
        }

        public boolean isReferralCodeEmpty() {
            return TextUtils.isEmpty(this.referralCode);
        }
    }

    public VisitNode(b.C0007b<Context> bVar, b.C0007b<Branch> bVar2, b.C0007b<getVisitUrl> bVar3) {
        this.contextProvider = bVar;
        this.branchProvider = bVar2;
        this.branchIoDeepLinkEntityMapperProvider = bVar3;
    }

    public final addRenderReadyListener get() {
        return newInstance(this.contextProvider.get(), this.branchProvider.get(), this.branchIoDeepLinkEntityMapperProvider.get());
    }

    public static VisitNode create(b.C0007b<Context> bVar, b.C0007b<Branch> bVar2, b.C0007b<getVisitUrl> bVar3) {
        return new VisitNode(bVar, bVar2, bVar3);
    }

    public static addRenderReadyListener newInstance(Context context, Branch branch, getVisitUrl getvisiturl) {
        return new addRenderReadyListener(context, branch, getvisiturl);
    }
}
