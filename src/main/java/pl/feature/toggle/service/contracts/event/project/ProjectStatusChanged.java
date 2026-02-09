package pl.feature.toggle.service.contracts.event.project;

import lombok.Builder;
import pl.feature.toggle.service.contracts.shared.Changes;
import pl.feature.toggle.service.contracts.shared.EventId;
import pl.feature.toggle.service.contracts.shared.IntegrationEvent;
import pl.feature.toggle.service.contracts.shared.Metadata;

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
}
