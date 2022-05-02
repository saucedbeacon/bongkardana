package com.google.firebase.messaging.ktx;

import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"LIBRARY_NAME", "", "messaging", "Lcom/google/firebase/messaging/FirebaseMessaging;", "Lcom/google/firebase/ktx/Firebase;", "getMessaging", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/messaging/FirebaseMessaging;", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "to", "init", "Lkotlin/Function1;", "Lcom/google/firebase/messaging/RemoteMessage$Builder;", "", "Lkotlin/ExtensionFunctionType;", "com.google.firebase-firebase-messaging-ktx"}, k = 2, mv = {1, 1, 16})
public final class MessagingKt {
    @NotNull
    public static final String LIBRARY_NAME = "fire-fcm-ktx";

    @NotNull
    public static final FirebaseMessaging getMessaging(@NotNull Firebase firebase) {
        Intrinsics.checkParameterIsNotNull(firebase, "$this$messaging");
        FirebaseMessaging instance = FirebaseMessaging.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "FirebaseMessaging.getInstance()");
        return instance;
    }

    @NotNull
    public static final RemoteMessage remoteMessage(@NotNull String str, @NotNull Function1<? super RemoteMessage.Builder, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "to");
        Intrinsics.checkParameterIsNotNull(function1, IAPSyncCommand.COMMAND_INIT);
        RemoteMessage.Builder builder = new RemoteMessage.Builder(str);
        function1.invoke(builder);
        RemoteMessage build = builder.build();
        Intrinsics.checkExpressionValueIsNotNull(build, "builder.build()");
        return build;
    }
}
