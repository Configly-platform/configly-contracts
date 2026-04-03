package com.configly.contracts.fake.event;

import com.configly.contracts.event.environment.EnvironmentTypeChanged;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeEnvironmentTypeChangedBuilder {

    private EventId eventId;
    private UUID environmentId;
    private UUID projectId;
    private String type;
    private Metadata metadata;
    private Changes changes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeEnvironmentTypeChangedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.environmentId = UUID.randomUUID();
        this.projectId = UUID.randomUUID();
        this.type = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.changes = Changes.empty();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeEnvironmentTypeChangedBuilder fakeEnvironmentTypeChangedBuilder() {
        return new FakeEnvironmentTypeChangedBuilder();
    }

    public FakeEnvironmentTypeChangedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeEnvironmentTypeChangedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public EnvironmentTypeChanged build() {
        return new EnvironmentTypeChanged(
                eventId,
                environmentId,
                projectId,
                type,
                metadata,
                changes,
                createdAt,
                updatedAt,
                revision
        );
    }
}