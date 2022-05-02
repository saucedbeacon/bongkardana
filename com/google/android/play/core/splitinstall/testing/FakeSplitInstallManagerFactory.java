package com.google.android.play.core.splitinstall.testing;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.play.core.common.LocalTestingException;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.k;
import com.google.android.play.core.splitinstall.p;
import java.io.File;

public class FakeSplitInstallManagerFactory {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private static FakeSplitInstallManager f10989a;

    public static FakeSplitInstallManager create(Context context) {
        try {
            File b = k.a(context).b();
            if (b == null) {
                throw new LocalTestingException("Failed to retrieve local testing directory path");
            } else if (b.exists()) {
                return create(context, b);
            } else {
                throw new LocalTestingException(String.format("Local testing directory not found: %s", new Object[]{b}));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized FakeSplitInstallManager create(Context context, File file) {
        FakeSplitInstallManager fakeSplitInstallManager;
        synchronized (FakeSplitInstallManagerFactory.class) {
            if (f10989a == null) {
                f10989a = createNewInstance(context, file);
            } else if (!f10989a.a().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", new Object[]{f10989a.a().getAbsolutePath(), file.getAbsolutePath()}));
            }
            fakeSplitInstallManager = f10989a;
        }
        return fakeSplitInstallManager;
    }

    public static FakeSplitInstallManager createNewInstance(Context context, File file) {
        SplitCompat.install(context);
        return new FakeSplitInstallManager(context, file, new p(context, context.getPackageName()));
    }
}
