package com.alibaba.ariver.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.Visit;
import com.alibaba.ariver.kernel.api.node.Node;

public class VisitNode extends NodeInstance implements Visit {
    public static final Parcelable.Creator<VisitNode> CREATOR = new Parcelable.Creator<VisitNode>() {
        public final VisitNode createFromParcel(Parcel parcel) {
            return new VisitNode(parcel);
        }

        public final VisitNode[] newArray(int i) {
            return new VisitNode[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f9954a;

    public VisitNode(Page page) {
        super((Node) page);
    }

    public void setVisitUrl(String str) {
        this.f9954a = str;
    }

    public String getVisitUrl() {
        return this.f9954a;
    }

    public VisitNode(Parcel parcel) {
        super(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
