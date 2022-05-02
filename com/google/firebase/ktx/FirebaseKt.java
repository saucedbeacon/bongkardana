package com.google.firebase.ktx;

import android.content.Context;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u001a\u001a\u0010\f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b\u001a\"\u0010\f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"LIBRARY_NAME", "", "app", "Lcom/google/firebase/FirebaseApp;", "Lcom/google/firebase/ktx/Firebase;", "getApp", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseApp;", "options", "Lcom/google/firebase/FirebaseOptions;", "getOptions", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/FirebaseOptions;", "name", "initialize", "context", "Landroid/content/Context;", "com.google.firebase-firebase-common-ktx"}, k = 2, mv = {1, 1, 16})
public final class FirebaseKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-core-ktx";

    @NotNull
    public static final FirebaseApp getApp(@NotNull Firebase firebase) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$app");
        FirebaseApp instance = FirebaseApp.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseApp.getInstance()");
        return instance;
    }

    @NotNull
    public static final FirebaseApp app(@NotNull Firebase firebase, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$app");
        Intrinsics.checkParameterIsNotNull(str, "name");
        FirebaseApp instance = FirebaseApp.getInstance(str);
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseApp.getInstance(name)");
        return instance;
    }

    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$initialize");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        return FirebaseApp.initializeApp(context);
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$initialize");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(firebaseOptions, SecurityConstants.KEY_OPTIONS);
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        Intrinsics.checkExpressionValueIsNotNull(initializeApp, "FirebaseApp.initializeApp(context, options)");
        return initializeApp;
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$initialize");
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        Intrinsics.checkParameterIsNotNull(firebaseOptions, SecurityConstants.KEY_OPTIONS);
        Intrinsics.checkParameterIsNotNull(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        Intrinsics.checkExpressionValueIsNotNull(initializeApp, "FirebaseApp.initializeApp(context, options, name)");
        return initializeApp;
    }

    @NotNull
    public static final FirebaseOptions getOptions(@NotNull Firebase firebase) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$options");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        Intrinsics.checkExpressionValueIsNotNull(options, "Firebase.app.options");
        return options;
    }
}
