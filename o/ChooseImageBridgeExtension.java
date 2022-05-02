package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.contact.recent.RecentContactAdapter;
import id.dana.sendmoney.contact.recent.RecentContactView;
import id.dana.sendmoney.di.module.SendMoneyV2Module;
import o.onFailure;
import o.onLoadFailed;

public final class ChooseImageBridgeExtension implements getBindingAdapter<RecentContactView> {

    /* renamed from: o.ChooseImageBridgeExtension$3  reason: invalid class name */
    public final class AnonymousClass3 implements getAdapterPosition<onFailure.setMin> {
        private final SendMoneyV2Module getMin;

        public static onFailure.setMin setMax(SendMoneyV2Module sendMoneyV2Module) {
            onFailure.setMin max = sendMoneyV2Module.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }

        public final /* synthetic */ Object get() {
            onFailure.setMin max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @InjectedFieldSignature("id.dana.sendmoney.contact.recent.RecentContactView.presenter")
    public static void getMax(RecentContactView recentContactView, onLoadFailed.setMax setmax) {
        recentContactView.presenter = setmax;
    }

    @InjectedFieldSignature("id.dana.sendmoney.contact.recent.RecentContactView.recentContactAdapter")
    public static void getMin(RecentContactView recentContactView, RecentContactAdapter recentContactAdapter) {
        recentContactView.recentContactAdapter = recentContactAdapter;
    }
}
