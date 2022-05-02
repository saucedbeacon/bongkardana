package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

final class JvmBuiltIns$customizer$2 extends Lambda implements Function0<JvmBuiltInsCustomizer> {
    final /* synthetic */ StorageManager $storageManager;
    final /* synthetic */ JvmBuiltIns this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    JvmBuiltIns$customizer$2(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        super(0);
        this.this$0 = jvmBuiltIns;
        this.$storageManager = storageManager;
    }

    @NotNull
    public final JvmBuiltInsCustomizer invoke() {
        ModuleDescriptorImpl builtInsModule = this.this$0.getBuiltInsModule();
        Intrinsics.checkNotNullExpressionValue(builtInsModule, "builtInsModule");
        StorageManager storageManager = this.$storageManager;
        final JvmBuiltIns jvmBuiltIns = this.this$0;
        return new JvmBuiltInsCustomizer(builtInsModule, storageManager, new Function0<JvmBuiltIns.Settings>() {
            @NotNull
            public final JvmBuiltIns.Settings invoke() {
                Function0 access$getSettingsComputation$p = jvmBuiltIns.settingsComputation;
                if (access$getSettingsComputation$p != null) {
                    Object invoke = access$getSettingsComputation$p.invoke();
                    jvmBuiltIns.settingsComputation = null;
                    return (JvmBuiltIns.Settings) invoke;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        });
    }
}
