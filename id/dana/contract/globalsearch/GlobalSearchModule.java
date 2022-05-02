package id.dana.contract.globalsearch;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import id.dana.explore.model.TrackerExploreDanaOpen;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.TrackerGlobalSearchOpen;
import id.dana.globalsearch.tracker.model.SearchResultOpenTrackerModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverManifest;
import o.ParcelImpl;
import o.convertDipToPx;
import o.getAlpha;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchModule;", "", "view", "Lid/dana/contract/globalsearch/GlobalSearchContract$View;", "(Lid/dana/contract/globalsearch/GlobalSearchContract$View;)V", "provideGlobalSearchAnalyticTracker", "Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;", "context", "Landroid/content/Context;", "provideGlobalSearchPresenter", "Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "globalSearchPresenter", "Lid/dana/contract/globalsearch/GlobalSearchPresenter;", "provideGlobalSearchView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class GlobalSearchModule {
    private final getAlpha.setMax getMin;

    public GlobalSearchModule(@NotNull getAlpha.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.getMin = setmax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getAlpha.setMax getMax() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getAlpha.length setMin(@NotNull ParcelImpl parcelImpl) {
        Intrinsics.checkNotNullParameter(parcelImpl, "globalSearchPresenter");
        return parcelImpl;
    }

    @NotNull
    @Provides
    public final GriverManifest.AnonymousClass11 setMin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return new GriverManifest.AnonymousClass11(context) {
            @NotNull
            private final Context getMin;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.GriverManifest$13$getMax */
            static final class getMax extends Lambda implements Function1<convertDipToPx.length, Unit> {
                public static final getMax INSTANCE = new getMax();

                getMax() {
                    super(1);
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((convertDipToPx.length) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull convertDipToPx.length length) {
                    Intrinsics.checkNotNullParameter(length, "$receiver");
                    length.getMax = TrackerKey.Event.SEARCH_RESULT_BOTTOM_SHEET_DETAIL_OPEN;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.GriverManifest$13$getMin */
            static final class getMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
                public static final getMin INSTANCE = new getMin();

                getMin() {
                    super(1);
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((convertDipToPx.length) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull convertDipToPx.length length) {
                    Intrinsics.checkNotNullParameter(length, "$receiver");
                    length.getMax = TrackerKey.Event.GLOBAL_SEARCH_OPEN;
                    length.setMax("Source", TrackerGlobalSearchOpen.INSTANCE.getGlobalSearchOpenType());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.GriverManifest$13$length */
            static final class length extends Lambda implements Function1<convertDipToPx.length, Unit> {
                public static final length INSTANCE = new length();

                length() {
                    super(1);
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((convertDipToPx.length) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull convertDipToPx.length length) {
                    Intrinsics.checkNotNullParameter(length, "$receiver");
                    length.getMax = TrackerKey.Event.POP_UP_ENABLE_LOCATION_OPEN;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.GriverManifest$13$setMax */
            static final class setMax extends Lambda implements Function1<convertDipToPx.length, Unit> {
                final /* synthetic */ PaySearchInfoModel $paySearchInfoModel;
                final /* synthetic */ AnonymousClass13 this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                setMax(AnonymousClass13 r1, PaySearchInfoModel paySearchInfoModel) {
                    super(1);
                    this.this$0 = r1;
                    this.$paySearchInfoModel = paySearchInfoModel;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((convertDipToPx.length) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull convertDipToPx.length length) {
                    Intrinsics.checkNotNullParameter(length, "$receiver");
                    length.getMax = TrackerKey.Event.SEARCH_RESULT_PAGE_ACTION_BUTTON;
                    length.setMax(TrackerKey.GlobalSearchProperties.SECTION, AnonymousClass13.setMin(this.$paySearchInfoModel));
                    length.setMax("Merchant Name", this.$paySearchInfoModel.getMerchantName());
                    String merchantCategory = this.$paySearchInfoModel.getMerchantCategory();
                    if (merchantCategory != null) {
                        length.setMax(TrackerKey.GlobalSearchProperties.MERCHANT_CATEGORY, merchantCategory);
                    }
                    String shopName = this.$paySearchInfoModel.getShopName();
                    if (shopName != null) {
                        length.setMax("Shop Name", shopName);
                    }
                    String dishesName = this.$paySearchInfoModel.getDishesName();
                    if (dishesName != null) {
                        length.setMax(TrackerKey.GlobalSearchProperties.DISHES_NAME, dishesName);
                    }
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.GriverManifest$13$setMin */
            static final class setMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
                public static final setMin INSTANCE = new setMin();

                setMin() {
                    super(1);
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((convertDipToPx.length) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull convertDipToPx.length length) {
                    Intrinsics.checkNotNullParameter(length, "$receiver");
                    length.getMax = TrackerKey.Event.EXPLORE_PAGE_OPEN;
                    length.setMax("Source", TrackerExploreDanaOpen.INSTANCE.getExploreDanaSourceType());
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
            /* renamed from: o.GriverManifest$13$toIntRange */
            static final class toIntRange extends Lambda implements Function1<convertDipToPx.length, Unit> {
                final /* synthetic */ SearchResultOpenTrackerModel $searchResultOpenTrackerModel;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                toIntRange(SearchResultOpenTrackerModel searchResultOpenTrackerModel) {
                    super(1);
                    this.$searchResultOpenTrackerModel = searchResultOpenTrackerModel;
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((convertDipToPx.length) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull convertDipToPx.length length) {
                    Intrinsics.checkNotNullParameter(length, "$receiver");
                    length.getMax = TrackerKey.Event.SEARCH_RESULT_PAGE_OPEN;
                    length.setMax("Result Status", this.$searchResultOpenTrackerModel.getResultStatus());
                    length.setMax(TrackerKey.GlobalSearchOpenProperties.KEYWORD_USAGE, this.$searchResultOpenTrackerModel.getKeywordUsage());
                    length.setMax(TrackerKey.GlobalSearchOpenProperties.KEYWORD_RESULT, this.$searchResultOpenTrackerModel.getKeywordResult());
                    length.setMax(TrackerKey.GlobalSearchOpenProperties.SUGGESTION_ORDER, this.$searchResultOpenTrackerModel.getSuggestionOrder());
                }
            }

            {
                Intrinsics.checkNotNullParameter(r2, HummerConstants.CONTEXT);
                this.getMin = r2;
            }

            public final void setMin() {
                convertDipToPx.length min = convertDipToPx.length.setMin(this.getMin);
                Intrinsics.checkNotNullExpressionValue(min, "builder");
                getMin.INSTANCE.invoke(min);
                min.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
                List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }

            public final void getMin() {
                convertDipToPx.length min = convertDipToPx.length.setMin(this.getMin);
                Intrinsics.checkNotNullExpressionValue(min, "builder");
                length.INSTANCE.invoke(min);
                min.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
                List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }

            public final void setMax() {
                convertDipToPx.length min = convertDipToPx.length.setMin(this.getMin);
                Intrinsics.checkNotNullExpressionValue(min, "builder");
                getMax.INSTANCE.invoke(min);
                min.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
                List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }

            public final void getMax(@NotNull PaySearchInfoModel paySearchInfoModel) {
                Intrinsics.checkNotNullParameter(paySearchInfoModel, "paySearchInfoModel");
                convertDipToPx.length min = convertDipToPx.length.setMin(this.getMin);
                Intrinsics.checkNotNullExpressionValue(min, "builder");
                new setMax(this, paySearchInfoModel).invoke(min);
                min.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
                List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }

            public final void setMax(@NotNull SearchResultOpenTrackerModel searchResultOpenTrackerModel) {
                Intrinsics.checkNotNullParameter(searchResultOpenTrackerModel, "searchResultOpenTrackerModel");
                if (Intrinsics.areEqual((Object) searchResultOpenTrackerModel.getKeywordUsage(), (Object) TrackerKey.KeywordType.CUSTOM)) {
                    searchResultOpenTrackerModel.setKeywordResult(startBluetoothDevicesDiscovery.INSTANCE.capitalizeWords(searchResultOpenTrackerModel.getKeywordResult()));
                }
                convertDipToPx.length min = convertDipToPx.length.setMin(this.getMin);
                Intrinsics.checkNotNullExpressionValue(min, "builder");
                new toIntRange(searchResultOpenTrackerModel).invoke(min);
                min.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
                List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }

            public final void getMax() {
                convertDipToPx.length min = convertDipToPx.length.setMin(this.getMin);
                Intrinsics.checkNotNullExpressionValue(min, "builder");
                setMin.INSTANCE.invoke(min);
                min.setMin();
                convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
                List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
                genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
            }

            public static final /* synthetic */ String setMin(PaySearchInfoModel paySearchInfoModel) {
                String category = paySearchInfoModel.getCategory();
                int hashCode = category.hashCode();
                if (hashCode == -1592831339) {
                    return category.equals("SERVICE") ? TrackerKey.Property.SERVICE : TrackerKey.Property.ONLINE;
                }
                if (hashCode != 2178) {
                    if (hashCode != 1016896708) {
                        if (hashCode == 2014341056 && category.equals("DF_SKU")) {
                            return TrackerKey.Property.DISHES;
                        }
                        return TrackerKey.Property.ONLINE;
                    } else if (category.equals("OFFLINE_MERCHANT")) {
                        return "Nearby";
                    } else {
                        return TrackerKey.Property.ONLINE;
                    }
                } else if (category.equals("DF")) {
                    return TrackerKey.Property.RESTSAURANT;
                } else {
                    return TrackerKey.Property.ONLINE;
                }
            }
        };
    }
}
