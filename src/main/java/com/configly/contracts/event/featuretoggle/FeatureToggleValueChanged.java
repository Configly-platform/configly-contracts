package com.configly.contracts.event.featuretoggle;

import lombok.Builder;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.IntegrationEvent;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record FeatureToggleValueChanged(
        EventId eventId,
        UUID id,
        UUID environmentId,
        Changes changes,
        String type,
        String value,
        Metadata metadata,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        long revision
) implements IntegrationEvent {

    public static final String EVENT_TYPE = FeatureToggleValueChanged.class.getName();

    public static FeatureToggleValueChangedBuilder featureToggleValueChangedBuilder() {
        return new FeatureToggleValueChangedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }
}
