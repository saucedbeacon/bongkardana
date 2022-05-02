package com.google.maps.android.data;

import java.util.ArrayList;
import java.util.List;

public class MultiGeometry implements Geometry {
    private String geometryType = "MultiGeometry";
    private List<Geometry> mGeometries;

    public MultiGeometry(List<? extends Geometry> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Geometry add : list) {
                arrayList.add(add);
            }
            this.mGeometries = arrayList;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }

    public String getGeometryType() {
        return this.geometryType;
    }

    public List<Geometry> getGeometryObject() {
        return this.mGeometries;
    }

    public void setGeometryType(String str) {
        this.geometryType = str;
    }

    public String toString() {
        String str = this.geometryType.equals("MultiPoint") ? "LineStrings=" : "Geometries=";
        if (this.geometryType.equals("MultiLineString")) {
            str = "points=";
        }
        if (this.geometryType.equals("MultiPolygon")) {
            str = "Polygons=";
        }
        StringBuilder sb = new StringBuilder(getGeometryType());
        sb.append("{");
        sb.append("\n ".concat(str));
        sb.append(getGeometryObject());
        sb.append("\n}\n");
        return sb.toString();
    }
}
