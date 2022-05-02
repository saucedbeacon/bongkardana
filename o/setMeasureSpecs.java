package o;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/twilio/verify/data/Storage;", "Lcom/twilio/verify/data/StorageProvider;", "sharedPreferences", "Landroid/content/SharedPreferences;", "encryptedStorage", "Lcom/twilio/security/storage/EncryptedStorage;", "migrations", "", "Lcom/twilio/verify/data/Migration;", "(Landroid/content/SharedPreferences;Lcom/twilio/security/storage/EncryptedStorage;Ljava/util/List;)V", "version", "", "getVersion", "()I", "applyMigration", "", "migration", "checkMigrations", "clear", "get", "", "key", "getAll", "remove", "save", "value", "updateVersion", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class setMeasureSpecs implements setRecyclerView {
    private final SharedPreferences getMax;
    private final int getMin = 2;
    private final List<onStateRestorationPolicyChanged> length;
    private final notifyItemRangeInserted setMin;

    public setMeasureSpecs(@NotNull SharedPreferences sharedPreferences, @NotNull notifyItemRangeInserted notifyitemrangeinserted, @NotNull List<? extends onStateRestorationPolicyChanged> list) {
        Intrinsics.checkParameterIsNotNull(sharedPreferences, "sharedPreferences");
        Intrinsics.checkParameterIsNotNull(notifyitemrangeinserted, "encryptedStorage");
        Intrinsics.checkParameterIsNotNull(list, "migrations");
        this.getMax = sharedPreferences;
        this.setMin = notifyitemrangeinserted;
        this.length = list;
        getMin();
    }

    public final void getMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.setMin.getMax(str, str2);
    }

    @Nullable
    public final String setMin(@NotNull String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-195051263, oncanceled);
            onCancelLoad.getMin(-195051263, oncanceled);
        }
        Intrinsics.checkParameterIsNotNull(str, "key");
        try {
            return (String) this.setMin.setMax(str, Reflection.getOrCreateKotlinClass(String.class));
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final List<String> getMax() {
        List<String> list = null;
        try {
            List<String> min = this.setMin.getMin(Reflection.getOrCreateKotlinClass(String.class));
            if (!min.isEmpty()) {
                list = min;
            }
        } catch (Exception unused) {
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.setMin.getMax(str);
    }

    public final void setMin() {
        this.setMin.setMax();
    }

    private final void getMin() {
        int i = this.getMax.getInt("cv", 1);
        if (i != this.getMin) {
            for (onStateRestorationPolicyChanged next : this.length) {
                if (next.setMax() >= i) {
                    for (RecyclerView$EdgeEffectFactory$EdgeDirection next2 : next.setMin(getMax())) {
                        String str = next2.getMax;
                        String str2 = next2.setMin;
                        Intrinsics.checkParameterIsNotNull(str, "key");
                        Intrinsics.checkParameterIsNotNull(str2, "value");
                        this.setMin.getMax(str, str2);
                    }
                    this.getMax.edit().putInt("cv", next.getMin()).apply();
                    i = next.getMin();
                    if (i == this.getMin) {
                        return;
                    }
                }
            }
        }
    }
}
