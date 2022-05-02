package com.afollestad.materialdialogs.internal.message;

import android.text.style.URLSpan;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/afollestad/materialdialogs/internal/message/CustomUrlSpan;", "Landroid/text/style/URLSpan;", "url", "", "onLinkClick", "Lkotlin/Function1;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onClick", "widget", "Landroid/view/View;", "core"}, k = 1, mv = {1, 1, 16})
public final class CustomUrlSpan extends URLSpan {
    private final Function1<String, Unit> onLinkClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomUrlSpan(@NotNull String str, @NotNull Function1<? super String, Unit> function1) {
        super(str);
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(function1, "onLinkClick");
        this.onLinkClick = function1;
    }

    public final void onClick(@NotNull View view) {
        Intrinsics.checkParameterIsNotNull(view, "widget");
        Function1<String, Unit> function1 = this.onLinkClick;
        String url = getURL();
        Intrinsics.checkExpressionValueIsNotNull(url, "url");
        function1.invoke(url);
    }
}
