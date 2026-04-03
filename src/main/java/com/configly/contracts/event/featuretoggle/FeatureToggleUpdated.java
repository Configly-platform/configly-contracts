package com.configly.contracts.event.featuretoggle;

import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.IntegrationEvent;
import lombok.Builder;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record FeatureToggleUpdated(
        EventId eventId,
        UUID id,
        UUID environmentId,
        String name,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Metadata metadata,
        Changes changes,
        long revision
) implements IntegrationEvent {

    public static FeatureToggleUpdatedBuilder featureToggleUpdatedEventBuilder() {
        return new FeatureToggleUpdatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }

}

