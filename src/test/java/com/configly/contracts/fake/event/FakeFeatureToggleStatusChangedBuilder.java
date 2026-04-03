package com.configly.contracts.fake.event;

import com.configly.contracts.event.featuretoggle.FeatureToggleStatusChanged;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeFeatureToggleStatusChangedBuilder {

    private EventId eventId;
    private UUID id;
    private UUID environmentId;
    private Changes changes;
    private String status;
    private Metadata metadata;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeFeatureToggleStatusChangedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.id = UUID.randomUUID();
        this.environmentId = UUID.randomUUID();
        this.changes = Changes.empty();
        this.status = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeFeatureToggleStatusChangedBuilder fakeFeatureToggleStatusChangedBuilder() {
        return new FakeFeatureToggleStatusChangedBuilder();
    }

    public FakeFeatureToggleStatusChangedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeFeatureToggleStatusChangedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public FeatureToggleStatusChanged build() {
        return new FeatureToggleStatusChanged(
                eventId, id, environmentId,
                changes, status, metadata, createdAt, updatedAt, revision
        );
    }
}