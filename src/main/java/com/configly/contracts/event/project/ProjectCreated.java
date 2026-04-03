package com.configly.contracts.event.project;

import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.IntegrationEvent;
import lombok.Builder;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record ProjectCreated(
        EventId eventId,
        UUID projectId,
        String projectName,
        String projectDescription,
        Metadata metadata,
        String status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        long revision
) implements IntegrationEvent {

    public static final String EVENT_TYPE = ProjectCreated.class.getName();

    public static ProjectCreatedBuilder projectCreatedEventBuilder() {
        return new ProjectCreatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }
}
