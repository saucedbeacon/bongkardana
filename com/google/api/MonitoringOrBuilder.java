package com.google.api;

import com.google.api.Monitoring;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface MonitoringOrBuilder extends MessageLiteOrBuilder {
    Monitoring.MonitoringDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Monitoring.MonitoringDestination> getConsumerDestinationsList();

    Monitoring.MonitoringDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Monitoring.MonitoringDestination> getProducerDestinationsList();
}
