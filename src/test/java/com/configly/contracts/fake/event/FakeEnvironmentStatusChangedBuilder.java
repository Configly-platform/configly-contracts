package com.configly.contracts.fake.event;

import com.configly.contracts.event.environment.EnvironmentStatusChanged;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeEnvironmentStatusChangedBuilder {

    private EventId eventId;
    private UUID environmentId;
    private UUID projectId;
    private String status;
    private Metadata metadata;
    private Changes changes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeEnvironmentStatusChangedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.environmentId = UUID.randomUUID();
        this.projectId = UUID.randomUUID();
        this.status = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.changes = Changes.empty();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeEnvironmentStatusChangedBuilder fakeEnvironmentStatusChangedBuilder() {
        return new FakeEnvironmentStatusChangedBuilder();
    }

    public FakeEnvironmentStatusChangedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeEnvironmentStatusChangedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public EnvironmentStatusChanged build() {
        return new EnvironmentStatusChanged(
                eventId,
                environmentId,
                projectId,
                status,
                metadata,
                changes,
                createdAt,
                updatedAt,
                revision
        );
    }
}
