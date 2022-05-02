package o;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import o.DefaultEmbedViewManager;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\bH&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H&J*\u0010\u000b\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r`\u000e0\u0003H&J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\"\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\fj\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r`\u000eH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lid/dana/data/globalsearch/GlobalSearchCacheEntityData;", "", "get", "Lio/reactivex/Observable;", "T", "key", "", "clazz", "Ljava/lang/Class;", "getPopularSearch", "Lid/dana/data/globalsearch/model/PopularSearchCache;", "getRecentSearch", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "save", "", "obj", "(Ljava/lang/String;Ljava/lang/Object;)Lio/reactivex/Observable;", "saveRecentSearch", "", "hashMap", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface triggerPreSnapshot {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Unit> getMin(@NotNull HashMap<String, Long> hashMap);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<DefaultEmbedViewManager.Message> length();

    @NotNull
    <T> TitleBarRightButtonView.AnonymousClass1<Boolean> setMax(@NotNull String str, @NotNull T t);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<HashMap<String, Long>> setMin();

    @NotNull
    <T> TitleBarRightButtonView.AnonymousClass1<T> setMin(@NotNull String str, @NotNull Class<T> cls);
}
