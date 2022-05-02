package id.dana;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.FirebaseApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.setShowingForActionMode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Lid/dana/DanaAppInitializer;", "Landroidx/startup/Initializer;", "Lcom/google/firebase/FirebaseApp;", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaAppInitializer implements setShowingForActionMode<FirebaseApp> {
    public final /* synthetic */ Object setMin(Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        FirebaseApp.initializeApp(context);
        FirebaseApp instance = FirebaseApp.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseApp.getInstance()");
        return instance;
    }

    @NotNull
    public final List<Class<? extends setShowingForActionMode<?>>> getMin() {
        return CollectionsKt.emptyList();
    }
}
