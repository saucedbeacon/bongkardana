package o;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/twilio/verify/domain/factor/FactorMigrations;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "factorMapper", "Lcom/twilio/verify/domain/factor/FactorMapper;", "(Landroid/content/SharedPreferences;Lcom/twilio/verify/domain/factor/FactorMapper;)V", "migrations", "", "Lcom/twilio/verify/data/Migration;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class addDisappearingView {
    final getLayoutDirection getMax;
    final SharedPreferences setMax;

    private addDisappearingView(@NotNull SharedPreferences sharedPreferences, @NotNull getLayoutDirection getlayoutdirection) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(getlayoutdirection, "factorMapper");
        this.setMax = sharedPreferences;
        this.getMax = getlayoutdirection;
    }

    public /* synthetic */ addDisappearingView(SharedPreferences sharedPreferences) {
        this(sharedPreferences, new getLayoutDirection());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"com/twilio/verify/domain/factor/FactorMigrations$migrations$migrationV1ToV2$1", "Lcom/twilio/verify/data/Migration;", "endVersion", "", "getEndVersion", "()I", "startVersion", "getStartVersion", "migrate", "", "Lcom/twilio/verify/data/Entry;", "data", "", "verify_release"}, k = 1, mv = {1, 1, 16})
    public static final class getMin implements onStateRestorationPolicyChanged {
        private final int getMax = 1;
        final /* synthetic */ addDisappearingView getMin;
        private final int setMax = 2;

        public getMin(addDisappearingView adddisappearingview) {
            this.getMin = adddisappearingview;
        }

        public final int setMax() {
            return this.getMax;
        }

        public final int getMin() {
            return this.setMax;
        }

        @NotNull
        public final List<RecyclerView$EdgeEffectFactory$EdgeDirection> setMin(@NotNull List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "data");
            Collection arrayList = new ArrayList();
            for (Object next : this.getMin.setMax.getAll().values()) {
                if (next instanceof String) {
                    arrayList.add(next);
                }
            }
            Collection arrayList2 = new ArrayList();
            for (Object next2 : (List) arrayList) {
                if (getLayoutDirection.setMin((String) next2)) {
                    arrayList2.add(next2);
                }
            }
            Iterable<String> iterable = (List) arrayList2;
            Collection arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (String jSONObject : iterable) {
                arrayList3.add(new JSONObject(jSONObject));
            }
            Iterable<JSONObject> iterable2 = (List) arrayList3;
            Collection arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            for (JSONObject jSONObject2 : iterable2) {
                Intrinsics.checkParameterIsNotNull(jSONObject2, "jsonObject");
                String string = jSONObject2.getString("sid");
                Intrinsics.checkExpressionValueIsNotNull(string, "jsonObject.getString(sidKey)");
                String jSONObject3 = jSONObject2.toString();
                Intrinsics.checkExpressionValueIsNotNull(jSONObject3, "it.toString()");
                arrayList4.add(new RecyclerView$EdgeEffectFactory$EdgeDirection(string, jSONObject3));
            }
            List<RecyclerView$EdgeEffectFactory$EdgeDirection> list2 = (List) arrayList4;
            for (RecyclerView$EdgeEffectFactory$EdgeDirection recyclerView$EdgeEffectFactory$EdgeDirection : list2) {
                this.getMin.setMax.edit().remove(recyclerView$EdgeEffectFactory$EdgeDirection.getMax).apply();
            }
            return list2;
        }
    }
}
