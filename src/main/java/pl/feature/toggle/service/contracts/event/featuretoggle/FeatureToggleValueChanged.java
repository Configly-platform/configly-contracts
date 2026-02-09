package pl.feature.toggle.service.contracts.event.featuretoggle;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
public record FeatureToggleValueChanged(
        EventId eventId,
        UUID id,
        UUID projectId,
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
}
