package pl.feature.toggle.service.contracts.event.featuretoggle;

import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Metadata;

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

