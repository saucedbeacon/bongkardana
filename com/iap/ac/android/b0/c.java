package com.iap.ac.android.b0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.RVEvents;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.container.IContainerPresenter;
import com.iap.ac.android.common.container.event.IContainerListener;
import com.iap.ac.android.common.container.utils.ContainerUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.mpm.base.interfaces.IDecodeCallback;
import com.iap.ac.android.mpm.biz.base.EntranceType;
import com.iap.ac.android.mpm.interceptor.provider.UAProvider;
import com.iap.ac.android.mpm.node.base.NodeType;

public abstract class c extends com.iap.ac.android.c0.a {
    public boolean e = false;
    public String f;
    public Context g;
    public String h;
    public String i;
    public String j;
    public IContainerPresenter k;
    public String l;
    public EntranceType m = EntranceType.Decode;
    public String n;

    public class a extends com.iap.ac.android.m0.c {
        public final /* synthetic */ NodeType e;

        public a(c cVar, NodeType nodeType) {
            this.e = nodeType;
        }

        public boolean a() {
            return false;
        }

        public NodeType b() {
            return this.e;
        }
    }

    public class b implements IContainerListener {
        public b() {
        }

        public void onContainerCreated(@NonNull Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append(c.this.f);
            sb.append(" onContainerCreated");
            ACLog.d(Constants.TAG, sb.toString());
        }

        public void onContainerDestroyed(@NonNull Bundle bundle) {
            StringBuilder sb = new StringBuilder();
            sb.append(c.this.f);
            sb.append(" onContainerDestroyed");
            ACLog.d(Constants.TAG, sb.toString());
            b.f9676a.remove(c.this.l);
            if (!c.this.e) {
                UAProvider.enableUserAgent(false);
                Result result = new Result();
                result.resultCode = "USER_CANCEL";
                result.resultMessage = ResultCode.USER_CANCEL_MESSAGE;
                com.iap.ac.android.s0.b bVar = new com.iap.ac.android.s0.b();
                bVar.e = false;
                bVar.f9748a = result;
                bVar.b = result.resultCode;
                bVar.c = result.resultMessage;
                bVar.d = HummerConstants.WEB_USER_CANCEL;
                c.this.a((com.iap.ac.android.m0.c) bVar);
            }
        }
    }

    public c(String str, Context context, String str2, String str3, IDecodeCallback iDecodeCallback) {
        this.f = str;
        this.g = context.getApplicationContext();
        this.h = str2;
        this.b = str3;
        this.d = iDecodeCallback;
        StringBuilder a2 = com.iap.ac.android.a.a.a(str);
        a2.append(SystemClock.elapsedRealtime());
        this.l = a2.toString();
    }

    public void a(Result result) {
    }

    public void a(@NonNull com.iap.ac.android.m0.b bVar, @NonNull a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" onProcessResume");
        sb.append(bVar.f9747a);
        ACLog.i(Constants.TAG, sb.toString());
        this.m = aVar.f9675a;
    }

    public void b(@NonNull com.iap.ac.android.m0.c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" onProcessPause ");
        sb.append(cVar.b());
        sb.append(" is ");
        sb.append(cVar.a());
        ACLog.i(Constants.TAG, sb.toString());
    }

    public void c(@NonNull com.iap.ac.android.m0.c cVar) {
        if (cVar.a() && NodeType.Pay.equals(cVar.b())) {
            a(cVar.f9748a);
        }
    }

    public void d() {
        IContainerPresenter iContainerPresenter = this.k;
        if (iContainerPresenter != null) {
            try {
                iContainerPresenter.closeWebview();
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f);
                sb.append("close webview error:");
                sb.append(e2);
                String obj = sb.toString();
                ACLog.e(Constants.TAG, obj);
                ACLogEvent.exceptionLog(obj);
            }
        }
    }

    public void e() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" onProcessBegin");
        ACLog.i(Constants.TAG, sb.toString());
        this.f9692a = SystemClock.elapsedRealtime();
        a(this.h, this.f);
    }

    public void a(NodeType nodeType) {
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_node_type_error").addParams("bizName", this.f).addParams("nodeType", (Object) nodeType).setEventType(LogEventType.CRUCIAL_LOG).event();
        Result result = new Result();
        result.resultCode = ResultCode.PARAM_ILLEGAL;
        result.resultMessage = "Oops! System busy. Try again later!";
        a aVar = new a(this, nodeType);
        aVar.f9748a = result;
        aVar.b = ResultCode.PARAM_ILLEGAL;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append("onProcessResume can't recognize ");
        sb.append(nodeType);
        aVar.c = sb.toString();
        aVar.d = RVEvents.RESUME;
        a((com.iap.ac.android.m0.c) aVar);
    }

    public void a(@NonNull com.iap.ac.android.m0.c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" onProcessFinish ");
        sb.append(cVar.b());
        sb.append(" is ");
        sb.append(cVar.a());
        ACLog.i(Constants.TAG, sb.toString());
        this.e = true;
        a(cVar, this.f, this.i);
        c(cVar);
        Result result = cVar.f9748a;
        result.thirdPartyError = this.n;
        com.iap.ac.android.c0.a.a(result, this.d);
    }

    public void a(@NonNull com.iap.ac.android.m0.b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" onNodeBegin ");
        sb.append(bVar.f9747a);
        ACLog.i(Constants.TAG, sb.toString());
    }

    public void a(@NonNull com.iap.ac.android.m0.b bVar, @NonNull com.iap.ac.android.m0.c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" onNodeEnd ");
        sb.append(cVar.b());
        sb.append(" is ");
        sb.append(cVar.a());
        ACLog.i(Constants.TAG, sb.toString());
    }

    public void a(com.iap.ac.android.s0.a aVar) {
        b.f9676a.put(this.l, this);
        aVar.b = this.l;
        aVar.d = this.g;
        aVar.e = this.c;
        aVar.f = new b();
    }

    public void a(IContainerPresenter iContainerPresenter) {
        if (iContainerPresenter != null && iContainerPresenter.getActivity() != null) {
            Class<?> cls = iContainerPresenter.getActivity().getClass();
            if (ContainerUtils.isActivityRunning(iContainerPresenter.getActivity())) {
                Intent intent = new Intent(iContainerPresenter.getActivity().getApplicationContext(), cls);
                intent.setFlags(805306368);
                iContainerPresenter.getActivity().getApplicationContext().startActivity(intent);
            }
        }
    }
}
