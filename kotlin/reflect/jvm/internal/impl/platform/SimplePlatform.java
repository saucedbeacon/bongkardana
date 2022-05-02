package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

public abstract class SimplePlatform {
    @NotNull
    private final String platformName;
    @NotNull
    private final TargetPlatformVersion targetPlatformVersion;

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        if (!(targetName.length() > 0)) {
            return this.platformName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.platformName);
        sb.append(" (");
        sb.append(targetName);
        sb.append(')');
        return sb.toString();
    }

    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }
}
