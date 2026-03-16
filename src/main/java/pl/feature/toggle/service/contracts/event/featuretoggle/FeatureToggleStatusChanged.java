package pl.feature.toggle.service.contracts.event.featuretoggle;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record FeatureToggleStatusChanged(
        EventId eventId,
        UUID id,
        UUID environmentId,
        Changes changes,
        String status,
        Metadata metadata,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        long revision
) implements IntegrationEvent {
    public static final String EVENT_TYPE = FeatureToggleStatusChanged.class.getName();

    public static FeatureToggleStatusChangedBuilder featureToggleStatusChangedBuilder() {
        return new FeatureToggleStatusChangedBuilder()
                .metadata(Metadata.empty())
                .eventId(EventId.create());
    }

    @Override
    public String correlationId() {
        return metadata.correlationId();
    }
}
