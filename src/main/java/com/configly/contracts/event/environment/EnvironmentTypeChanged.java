package com.configly.contracts.event.environment;

import lombok.Builder;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.IntegrationEvent;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record EnvironmentTypeChanged(
        EventId eventId,
        UUID environmentId,
        UUID projectId,
        String type,
        Metadata metadata,
        Changes changes,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        long revision
) implements IntegrationEvent {

    public static final String EVENT_TYPE = EnvironmentTypeChanged.class.getName();

    public static EnvironmentTypeChangedBuilder environmentTypeChangedBuilder() {
        return new EnvironmentTypeChangedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }

}
