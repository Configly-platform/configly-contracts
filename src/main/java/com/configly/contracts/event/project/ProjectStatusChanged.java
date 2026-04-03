package com.configly.contracts.event.project;

import lombok.Builder;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.IntegrationEvent;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record ProjectStatusChanged(
        EventId eventId,
        UUID projectId,
        Metadata metadata,
        String status,
        Changes changes,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        long revision
) implements IntegrationEvent {

    public static final String EVENT_TYPE = ProjectStatusChanged.class.getName();

    public static ProjectStatusChangedBuilder projectStatusChangedEventBuilder() {
        return new ProjectStatusChangedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }
}
