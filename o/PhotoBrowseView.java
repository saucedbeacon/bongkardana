package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney_v2.recipient.view.RecipientView;
import id.dana.sendmoney_v2.x2l.di.SendToLinkBannerModule;
import id.dana.sendmoney_v2.x2l.di.SendToLinkSelectorModule;
import id.dana.sendmoney_v2.x2l.model.SocialLinkModel;
import id.dana.sendmoney_v2.x2l.view.SendToLinkSelectorView;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoGridView;
import o.PrepareException;
import o.SystemAlarmService;
import o.access$2602;
import o.b;
import o.getSelectedIndex;
import o.moveToStart;
import o.onSuccess;
import o.parentColumns;
import o.setMediaId;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/sendmoney_v2/recipient/decorator/SearchRecentRecipientDecorator;", "Lid/dana/sendmoney/recipient/decorator/recipient/RecipientDecorator;", "recipient", "Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;", "recentRecipientModels", "", "Lid/dana/sendmoney/model/RecentRecipientModel;", "filter", "", "isContactEmpty", "", "(Lid/dana/sendmoney/recipient/decorator/recipient/Recipient;Ljava/util/List;Ljava/lang/String;Z)V", "getEmptyModel", "Lid/dana/sendmoney/model/RecipientViewModel;", "getNoRecentRecipientFoundModel", "getRecentRecipientModels", "", "getRecipientViewModels", "", "isSearchByName", "setSection", "allRecentModels", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PhotoBrowseView extends getPhotoGroupIndex {
    private final getMediaSubType setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.PhotoBrowseView$8  reason: invalid class name */
    public interface AnonymousClass8 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetSocialLinks", "", "socialLinks", "", "Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.PhotoBrowseView$8$getMax */
        public interface getMax extends parentColumns.getMax {
            void setMin(@NotNull List<SocialLinkModel> list);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/x2l/contract/SendToLinkSelectorContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getSocialLinks", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.PhotoBrowseView$8$length */
        public interface length extends parentColumns.setMin {
            void getMax();
        }
    }

    public final class MenuItemOnClickListener implements getAdapterPosition<access$2602.setMin> {
        private final SendToLinkBannerModule getMax;

        private MenuItemOnClickListener(SendToLinkBannerModule sendToLinkBannerModule) {
            this.getMax = sendToLinkBannerModule;
        }

        public static MenuItemOnClickListener setMax(SendToLinkBannerModule sendToLinkBannerModule) {
            return new MenuItemOnClickListener(sendToLinkBannerModule);
        }

        public final /* synthetic */ Object get() {
            access$2602.setMin min = this.getMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class PhotoPagerAdapter implements setOnOverScrolledListener {
        private b.C0007b<toInt> getMax;
        private b.C0007b<AnonymousClass8.getMax> getMin;
        private b.C0007b<AnonymousClass7> length;
        private b.C0007b<AnonymousClass8.length> setMax;
        private b.C0007b<getByteCount> setMin;

        public /* synthetic */ PhotoPagerAdapter(SendToLinkSelectorModule sendToLinkSelectorModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(sendToLinkSelectorModule, r2);
        }

        private PhotoPagerAdapter(SendToLinkSelectorModule sendToLinkSelectorModule, PrepareException.AnonymousClass1 r3) {
            this.getMin = isScrap.getMin(PhotoGridView.OnOverScrolledListener.getMin(sendToLinkSelectorModule));
            getMin getmin = new getMin(r3);
            this.setMin = getmin;
            reverseArray create = reverseArray.create(getmin);
            this.getMax = create;
            AnonymousClass6 min = AnonymousClass6.setMin(this.getMin, create);
            this.length = min;
            this.setMax = isScrap.getMin(isPhotoType.setMax(sendToLinkSelectorModule, min));
        }

        public static final class setMin {
            public SendToLinkSelectorModule getMax;
            public PrepareException.AnonymousClass1 length;

            public /* synthetic */ setMin(byte b) {
                this();
            }

            private setMin() {
            }
        }

        static class getMin implements b.C0007b<getByteCount> {
            private final PrepareException.AnonymousClass1 length;

            getMin(PrepareException.AnonymousClass1 r1) {
                this.length = r1;
            }

            public final /* synthetic */ Object get() {
                getByteCount create = this.length.create();
                if (create != null) {
                    return create;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void setMin(SendToLinkSelectorView sendToLinkSelectorView) {
            showProgress.getMax(sendToLinkSelectorView, this.setMax.get());
        }
    }

    public PhotoBrowseView(@NotNull getMediaSubType getmediasubtype, @NotNull List<? extends increaseCount> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(getmediasubtype, "recipient");
        Intrinsics.checkNotNullParameter(list, "recentRecipientModels");
        Intrinsics.checkNotNullParameter(str, "filter");
        this.setMin = getmediasubtype;
        if (!setMax(str) || !list.isEmpty() || !z) {
            int length = str.length();
            boolean z2 = true;
            if (!(length > 0) || !list.isEmpty()) {
                Object apply = new setEnableStepScan().apply(list);
                Intrinsics.checkNotNullExpressionValue(apply, "RecentRecipientToRecipie…   recentRecipientModels)");
                List mutableList = CollectionsKt.toMutableList((Collection) apply);
                Collection collection = mutableList;
                if (collection != null && !collection.isEmpty()) {
                    z2 = false;
                }
                if (!z2) {
                    mutableList.add(0, new RecipientViewModel(23));
                }
                setMax(mutableList);
                return;
            }
            length(new RecipientViewModel(22));
            return;
        }
        length(new RecipientViewModel(18));
    }

    private static boolean setMax(String str) {
        char charAt;
        if (str.length() == 0) {
            return false;
        }
        char charAt2 = str.charAt(0);
        return ('a' <= charAt2 && 'z' >= charAt2) || ('A' <= (charAt = str.charAt(0)) && 'Z' >= charAt);
    }

    @NotNull
    public final List<RecipientViewModel> getMin() {
        List<RecipientViewModel> min = this.setMin.getMin();
        List list = this.getMax;
        Intrinsics.checkNotNullExpressionValue(list, "recipientViewModels");
        min.addAll(list);
        Intrinsics.checkNotNullExpressionValue(min, "recipient.recipientViewM…ientViewModels)\n        }");
        return min;
    }

    /* renamed from: o.PhotoBrowseView$3  reason: invalid class name */
    public final class AnonymousClass3 implements getBindingAdapter<RecipientView> {
        @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.view.RecipientView.addReceiverInfoPresenter")
        public static void setMin(RecipientView recipientView, SystemAlarmService.setMin setmin) {
            recipientView.addReceiverInfoPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.view.RecipientView.danaContactPresenter")
        public static void getMin(RecipientView recipientView, moveToStart.setMin setmin) {
            recipientView.danaContactPresenter = setmin;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.view.RecipientView.savedBankPresenter")
        public static void setMax(RecipientView recipientView, onSuccess.length length) {
            recipientView.savedBankPresenter = length;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.view.RecipientView.onBoardingPresenter")
        public static void getMax(RecipientView recipientView, getSelectedIndex.length length) {
            recipientView.onBoardingPresenter = length;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.view.RecipientView.sortingSendMoneyPresenter")
        public static void setMin(RecipientView recipientView, Action action) {
            recipientView.sortingSendMoneyPresenter = action;
        }

        @InjectedFieldSignature("id.dana.sendmoney_v2.recipient.view.RecipientView.recentRecipientPresenter")
        public static void setMax(RecipientView recipientView, setMediaId.setMax setmax) {
            recipientView.recentRecipientPresenter = setmax;
        }
    }
}
