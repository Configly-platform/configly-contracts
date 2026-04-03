package com.configly.contracts.event.environment;

import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.IntegrationEvent;
import lombok.Builder;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record EnvironmentCreated(
        EventId eventId,
        UUID environmentId,
        UUID projectId,
        String environmentName,
        String type,
        String status,
        Metadata metadata,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        long revision
) implements IntegrationEvent {

    public static final String EVENT_TYPE = EnvironmentCreated.class.getName();

    public static EnvironmentCreatedBuilder environmentCreatedEventBuilder() {
        return new EnvironmentCreatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }
}
