package com.configly.contracts.fake.event;

import com.configly.contracts.event.featuretoggle.FeatureToggleUpdated;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeFeatureToggleUpdatedBuilder {

    private EventId eventId;
    private UUID id;
    private UUID environmentId;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Metadata metadata;
    private Changes changes;
    private long revision;

    private FakeFeatureToggleUpdatedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.id = UUID.randomUUID();
        this.environmentId = UUID.randomUUID();
        this.name = UUID.randomUUID().toString();
        this.description = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.metadata = fakeMetadataBuilder().build();
        this.changes = Changes.empty();
        this.revision = 0;
    }

    public static FakeFeatureToggleUpdatedBuilder fakeFeatureToggleUpdatedBuilder() {
        return new FakeFeatureToggleUpdatedBuilder();
    }

    public FakeFeatureToggleUpdatedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeFeatureToggleUpdatedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public FeatureToggleUpdated build() {
        return new FeatureToggleUpdated(
                eventId, id, environmentId,
                name, description,
                createdAt, updatedAt,
                metadata, changes, revision
        );
    }
}