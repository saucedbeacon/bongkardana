package io.split.android.client.dtos;

import com.google.common.base.Objects;
import io.split.android.client.storage.InBytesSizable;
import java.util.Map;

public class Event implements InBytesSizable, Identifiable {
    public String eventTypeId;
    public String key;
    public Map<String, Object> properties;
    private int sizeInBytes = 0;
    public transient long storageId;
    public long timestamp;
    public String trafficTypeName;
    public double value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Event event = (Event) obj;
            return Double.compare(event.value, this.value) == 0 && this.timestamp == event.timestamp && Objects.equal(this.eventTypeId, event.eventTypeId) && Objects.equal(this.trafficTypeName, event.trafficTypeName) && Objects.equal(this.key, event.key) && Objects.equal(this.properties, event.properties);
        }
    }

    public int hashCode() {
        return Objects.hashCode(this.eventTypeId, this.trafficTypeName, this.key, Double.valueOf(this.value), Long.valueOf(this.timestamp));
    }

    public void setSizeInBytes(int i) {
        this.sizeInBytes = i;
    }

    public long getSizeInBytes() {
        return (long) this.sizeInBytes;
    }

    public long getId() {
        return this.storageId;
    }
}
