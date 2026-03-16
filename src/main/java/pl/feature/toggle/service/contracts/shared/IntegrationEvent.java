package pl.feature.toggle.service.contracts.shared;

public interface IntegrationEvent {

    EventId eventId();

    String correlationId();

}
