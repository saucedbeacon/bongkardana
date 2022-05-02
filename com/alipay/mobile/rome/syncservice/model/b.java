package com.alipay.mobile.rome.syncservice.model;

import com.alipay.msync.core.model.spcode.pb.ProtoBizSyncData;
import com.alipay.msync.core.model.spcode.pb.ProtoOplog;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f9479a;
    public Integer b;
    public Boolean c;
    public Long d;
    public List<ProtoOplog> e;

    public b() {
    }

    public b(ProtoBizSyncData protoBizSyncData) {
        if (protoBizSyncData != null) {
            this.f9479a = protoBizSyncData.biz_type;
            this.c = protoBizSyncData.has_more;
            this.e = protoBizSyncData.oplog;
            this.d = protoBizSyncData.sync_key;
            this.b = protoBizSyncData.biz_order;
        }
    }
}
