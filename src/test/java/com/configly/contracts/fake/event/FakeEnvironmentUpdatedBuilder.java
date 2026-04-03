package com.configly.contracts.fake.event;

import com.configly.contracts.event.environment.EnvironmentUpdated;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeEnvironmentUpdatedBuilder {

    private EventId eventId;
    private UUID environmentId;
    private UUID projectId;
    private String environmentName;
    private Metadata metadata;
    private Changes changes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeEnvironmentUpdatedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.environmentId = UUID.randomUUID();
        this.projectId = UUID.randomUUID();
        this.environmentName = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.changes = Changes.empty();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeEnvironmentUpdatedBuilder fakeEnvironmentUpdatedBuilder() {
        return new FakeEnvironmentUpdatedBuilder();
    }

    public FakeEnvironmentUpdatedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeEnvironmentUpdatedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public EnvironmentUpdated build() {
        return new EnvironmentUpdated(
                eventId,
                environmentId,
                projectId,
                environmentName,
                metadata,
                changes,
                createdAt,
                updatedAt,
                revision
        );
    }
}