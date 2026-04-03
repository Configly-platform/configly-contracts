package com.configly.contracts.fake.event;

import com.configly.contracts.event.featuretoggle.FeatureToggleValueChanged;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeFeatureToggleValueChangedBuilder {

    private EventId eventId;
    private UUID id;
    private UUID environmentId;
    private Changes changes;
    private String type;
    private String value;
    private Metadata metadata;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeFeatureToggleValueChangedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.id = UUID.randomUUID();
        this.environmentId = UUID.randomUUID();
        this.changes = Changes.empty();
        this.type = UUID.randomUUID().toString();
        this.value = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeFeatureToggleValueChangedBuilder fakeFeatureToggleValueChangedBuilder() {
        return new FakeFeatureToggleValueChangedBuilder();
    }

    public FakeFeatureToggleValueChangedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withId(UUID id) {
        this.id = id;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withEnvironmentId(UUID environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeFeatureToggleValueChangedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public FeatureToggleValueChanged build() {
        return new FeatureToggleValueChanged(
                eventId, id, environmentId,
                changes, type, value, metadata,
                createdAt, updatedAt, revision
        );
    }
}