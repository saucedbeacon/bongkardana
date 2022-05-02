package com.google.api;

import com.google.api.Logging;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface LoggingOrBuilder extends MessageLiteOrBuilder {
    Logging.LoggingDestination getConsumerDestinations(int i);

    int getConsumerDestinationsCount();

    List<Logging.LoggingDestination> getConsumerDestinationsList();

    Logging.LoggingDestination getProducerDestinations(int i);

    int getProducerDestinationsCount();

    List<Logging.LoggingDestination> getProducerDestinationsList();
}
