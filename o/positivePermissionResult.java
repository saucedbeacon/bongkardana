package o;

import o.b;

public final class positivePermissionResult implements getAdapterPosition<classExist> {
    private final b.C0007b<requestPermission> otpRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public positivePermissionResult(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<requestPermission> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.otpRepositoryProvider = bVar3;
    }

    public final classExist get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.otpRepositoryProvider.get());
    }

    public static positivePermissionResult create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<requestPermission> bVar3) {
        return new positivePermissionResult(bVar, bVar2, bVar3);
    }

    public static classExist newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, requestPermission requestpermission) {
        return new classExist(appxloadfailed, getscheme, requestpermission);
    }
}
