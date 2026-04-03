package com.configly.contracts.fake.event;

import com.configly.contracts.event.project.ProjectStatusChanged;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeProjectStatusChangedBuilder {

    private EventId eventId;
    private UUID projectId;
    private Metadata metadata;
    private String status;
    private Changes changes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeProjectStatusChangedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.projectId = UUID.randomUUID();
        this.metadata = fakeMetadataBuilder().build();
        this.status = UUID.randomUUID().toString();
        this.changes = Changes.empty();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeProjectStatusChangedBuilder fakeProjectStatusChangedBuilder() {
        return new FakeProjectStatusChangedBuilder();
    }

    public FakeProjectStatusChangedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeProjectStatusChangedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeProjectStatusChangedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeProjectStatusChangedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeProjectStatusChangedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeProjectStatusChangedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeProjectStatusChangedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeProjectStatusChangedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public ProjectStatusChanged build() {
        return new ProjectStatusChanged(
                eventId, projectId, metadata, status,
                changes, createdAt, updatedAt, revision
        );
    }
}