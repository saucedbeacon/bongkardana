package com.alibaba.fastjson;

import com.alibaba.fastjson.util.TypeUtils;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o.SavedStateHandleController;
import o.dispatchOnCancelled;
import o.getTitleMarginBottom;
import o.onCancelLoad;
import o.onCanceled;

public class JSONArray extends JSON implements List<Object>, Cloneable, RandomAccess, Serializable {
    protected transient Type componentType;
    public List<Object> list;
    protected transient Object relatedArray;

    public JSONArray() {
        this.list = new ArrayList(10);
    }

    public JSONArray(List<Object> list2) {
        this.list = list2;
    }

    public JSONArray(int i) {
        this.list = new ArrayList(i);
    }

    public Object getRelatedArray() {
        return this.relatedArray;
    }

    public void setRelatedArray(Object obj) {
        this.relatedArray = obj;
    }

    public Type getComponentType() {
        return this.componentType;
    }

    public void setComponentType(Type type) {
        this.componentType = type;
    }

    public int size() {
        return this.list.size();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public boolean contains(Object obj) {
        return this.list.contains(obj);
    }

    public Iterator<Object> iterator() {
        return this.list.iterator();
    }

    public Object[] toArray() {
        return this.list.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.list.toArray(tArr);
    }

    public boolean add(Object obj) {
        return this.list.add(obj);
    }

    public boolean remove(Object obj) {
        return this.list.remove(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.list.containsAll(collection);
    }

    public boolean addAll(Collection<? extends Object> collection) {
        return this.list.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends Object> collection) {
        return this.list.addAll(i, collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.list.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.list.retainAll(collection);
    }

    public void clear() {
        this.list.clear();
    }

    public Object set(int i, Object obj) {
        return this.list.set(i, obj);
    }

    public void add(int i, Object obj) {
        this.list.add(i, obj);
    }

    public Object remove(int i) {
        return this.list.remove(i);
    }

    public int indexOf(Object obj) {
        return this.list.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.list.lastIndexOf(obj);
    }

    public ListIterator<Object> listIterator() {
        return this.list.listIterator();
    }

    public ListIterator<Object> listIterator(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1528037895, oncanceled);
            onCancelLoad.getMin(-1528037895, oncanceled);
        }
        return this.list.listIterator(i);
    }

    public List<Object> subList(int i, int i2) {
        return this.list.subList(i, i2);
    }

    public Object get(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1268780328, oncanceled);
            onCancelLoad.getMin(-1268780328, oncanceled);
        }
        return this.list.get(i);
    }

    public JSONObject getJSONObject(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return (JSONObject) toJSON(obj);
    }

    public JSONArray getJSONArray(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        return (JSONArray) toJSON(obj);
    }

    public <T> T getObject(int i, Class<T> cls) {
        return TypeUtils.castToJavaBean(this.list.get(i), cls);
    }

    public Boolean getBoolean(int i) {
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        return TypeUtils.castToBoolean(obj);
    }

    public boolean getBooleanValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return false;
        }
        return TypeUtils.castToBoolean(obj).booleanValue();
    }

    public Byte getByte(int i) {
        return TypeUtils.castToByte(get(i));
    }

    public byte getByteValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return TypeUtils.castToByte(obj).byteValue();
    }

    public Short getShort(int i) {
        return TypeUtils.castToShort(get(i));
    }

    public short getShortValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return TypeUtils.castToShort(obj).shortValue();
    }

    public Integer getInteger(int i) {
        return TypeUtils.castToInt(get(i));
    }

    public int getIntValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return TypeUtils.castToInt(obj).intValue();
    }

    public Long getLong(int i) {
        return TypeUtils.castToLong(get(i));
    }

    public long getLongValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0;
        }
        return TypeUtils.castToLong(obj).longValue();
    }

    public Float getFloat(int i) {
        return TypeUtils.castToFloat(get(i));
    }

    public float getFloatValue(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2129608237, oncanceled);
            onCancelLoad.getMin(-2129608237, oncanceled);
        }
        Object obj = get(i);
        if (obj == null) {
            return 0.0f;
        }
        return TypeUtils.castToFloat(obj).floatValue();
    }

    public Double getDouble(int i) {
        return TypeUtils.castToDouble(get(i));
    }

    public double getDoubleValue(int i) {
        Object obj = get(i);
        if (obj == null) {
            return 0.0d;
        }
        return TypeUtils.castToDouble(obj).doubleValue();
    }

    public BigDecimal getBigDecimal(int i) {
        return TypeUtils.castToBigDecimal(get(i));
    }

    public BigInteger getBigInteger(int i) {
        return TypeUtils.castToBigInteger(get(i));
    }

    public String getString(int i) {
        return TypeUtils.castToString(get(i));
    }

    public Date getDate(int i) {
        return TypeUtils.castToDate(get(i));
    }

    public Object clone() {
        return new JSONArray((List<Object>) new ArrayList(this.list));
    }

    public boolean equals(Object obj) {
        return this.list.equals(obj);
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public final /* synthetic */ void getMax(Gson gson, JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r6) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r6.getMin(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (min != 41) {
                JSON.setMax(jsonReader, min);
            } else if (z) {
                this.list = (List) gson.getAdapter(new getTitleMarginBottom()).read(jsonReader);
            } else {
                this.list = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }
}
