package com.configly.contracts.shared;

public interface IntegrationEvent {

    EventId eventId();

    String correlationId();

}
