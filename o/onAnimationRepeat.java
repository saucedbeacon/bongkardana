package o;

import java.util.HashMap;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultEmbedViewManager;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006H\u0016J*\u0010\u000f\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011`\u00120\u0006H\u0016J-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u0002H\u0007H\u0016¢\u0006\u0002\u0010\u0016J2\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\u0010j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011`\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/data/globalsearch/source/GlobalSearchPreferenceCacheEntityData;", "Lid/dana/data/globalsearch/GlobalSearchCacheEntityData;", "globalSearchPreference", "Lid/dana/data/globalsearch/source/GlobalSearchPreference;", "(Lid/dana/data/globalsearch/source/GlobalSearchPreference;)V", "get", "Lio/reactivex/Observable;", "T", "", "key", "", "clazz", "Ljava/lang/Class;", "getPopularSearch", "Lid/dana/data/globalsearch/model/PopularSearchCache;", "getRecentSearch", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "save", "", "obj", "(Ljava/lang/String;Ljava/lang/Object;)Lio/reactivex/Observable;", "saveRecentSearch", "", "hashMap", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onAnimationRepeat implements triggerPreSnapshot {
    final pauseRender length;

    @Inject
    public onAnimationRepeat(@NotNull pauseRender pauserender) {
        Intrinsics.checkNotNullParameter(pauserender, "globalSearchPreference");
        this.length = pauserender;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u0001H\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "", "emitter", "Lio/reactivex/ObservableEmitter;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T> implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1<T> {
        final /* synthetic */ Class getMax;
        final /* synthetic */ String length;
        final /* synthetic */ onAnimationRepeat setMin;

        getMin(onAnimationRepeat onanimationrepeat, String str, Class cls) {
            this.setMin = onanimationrepeat;
            this.length = str;
            this.getMax = cls;
        }

        public final void subscribe(@NotNull TitleBarRightButtonView.AnonymousClass2<T> r4) {
            Intrinsics.checkNotNullParameter(r4, "emitter");
            Object min = this.setMin.length.setMin(this.length, this.getMax);
            Intrinsics.checkNotNull(min);
            r4.onNext(min);
            r4.onComplete();
        }
    }

    @NotNull
    public final <T> TitleBarRightButtonView.AnonymousClass1<T> setMin(@NotNull String str, @NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        TitleBarRightButtonView.AnonymousClass1<T> create = TitleBarRightButtonView.AnonymousClass1.create(new getMin(this, str, cls));
        Intrinsics.checkNotNullExpressionValue(create, "Observable.create { emit…er.onComplete()\n        }");
        return create;
    }

    @NotNull
    public final <T> TitleBarRightButtonView.AnonymousClass1<Boolean> setMax(@NotNull String str, @NotNull T t) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(t, "obj");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.length.length(str, t)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(globalSe…rence.saveData(key, obj))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> getMin(@NotNull HashMap<String, Long> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        TitleBarRightButtonView.AnonymousClass1<Unit> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(this, hashMap));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …Search(hashMap)\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<HashMap<String, Long>> setMin() {
        TitleBarRightButtonView.AnonymousClass1<HashMap<String, Long>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …eRecentSearch()\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<DefaultEmbedViewManager.Message> length() {
        TitleBarRightButtonView.AnonymousClass1<DefaultEmbedViewManager.Message> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …arSearchCache()\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<Unit> {
        final /* synthetic */ HashMap getMax;
        final /* synthetic */ onAnimationRepeat length;

        length(onAnimationRepeat onanimationrepeat, HashMap hashMap) {
            this.length = onanimationrepeat;
            this.getMax = hashMap;
        }

        public final /* synthetic */ Object call() {
            pauseRender pauserender = this.length.length;
            HashMap hashMap = this.getMax;
            Intrinsics.checkNotNullParameter(hashMap, "hashMap");
            pauserender.length.saveData("GLOBAL_SEARCH_RECENT_SEARCH", hashMap);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001aD\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0005*\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<HashMap<String, Long>> {
        final /* synthetic */ onAnimationRepeat setMax;

        setMax(onAnimationRepeat onanimationrepeat) {
            this.setMax = onanimationrepeat;
        }

        public final /* synthetic */ Object call() {
            HashMap hashMap = (HashMap) this.setMax.length.length.getObject("GLOBAL_SEARCH_RECENT_SEARCH", HashMap.class);
            return hashMap == null ? new HashMap() : hashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/globalsearch/model/PopularSearchCache;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMin<V> implements Callable<DefaultEmbedViewManager.Message> {
        final /* synthetic */ onAnimationRepeat length;

        setMin(onAnimationRepeat onanimationrepeat) {
            this.length = onanimationrepeat;
        }

        public final /* synthetic */ Object call() {
            DefaultEmbedViewManager.Message message = (DefaultEmbedViewManager.Message) this.length.length.length.getObject("POPULAR_SEARCH_PLACEHOLDER", DefaultEmbedViewManager.Message.class);
            return message == null ? new DefaultEmbedViewManager.Message((byte) 0) : message;
        }
    }
}
