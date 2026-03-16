package pl.feature.toggle.service.contracts.event.featuretoggle;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record FeatureToggleCreated(
        EventId eventId,
        UUID id,
        UUID environmentId,
        String name,
        String description,
        String type,
        String value,
        String status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Metadata metadata,
        long revision
) implements IntegrationEvent {

    public static FeatureToggleCreatedBuilder featureToggleCreatedEventBuilder() {
        return new FeatureToggleCreatedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }

}