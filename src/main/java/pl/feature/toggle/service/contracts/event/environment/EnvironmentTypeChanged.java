package pl.feature.toggle.service.contracts.event.environment;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

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

}
