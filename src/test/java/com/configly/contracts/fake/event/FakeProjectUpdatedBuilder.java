package com.configly.contracts.fake.event;

import com.configly.contracts.event.project.ProjectUpdated;
import com.configly.contracts.shared.Changes;
import com.configly.contracts.shared.EventId;
import com.configly.contracts.shared.Metadata;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.configly.contracts.fake.event.FakeMetadataBuilder.fakeMetadataBuilder;

public class FakeProjectUpdatedBuilder {

    private EventId eventId;
    private UUID projectId;
    private String projectName;
    private String projectDescription;
    private Metadata metadata;
    private String status;
    private Changes changes;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private long revision;

    private FakeProjectUpdatedBuilder() {
        this.eventId = new EventId(UUID.randomUUID());
        this.projectId = UUID.randomUUID();
        this.projectName = UUID.randomUUID().toString();
        this.projectDescription = UUID.randomUUID().toString();
        this.metadata = fakeMetadataBuilder().build();
        this.status = UUID.randomUUID().toString();
        this.changes = Changes.empty();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.revision = 0;
    }

    public static FakeProjectUpdatedBuilder fakeProjectUpdatedBuilder() {
        return new FakeProjectUpdatedBuilder();
    }

    public FakeProjectUpdatedBuilder withEventId(EventId eventId) {
        this.eventId = eventId;
        return this;
    }

    public FakeProjectUpdatedBuilder withProjectId(UUID projectId) {
        this.projectId = projectId;
        return this;
    }

    public FakeProjectUpdatedBuilder withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public FakeProjectUpdatedBuilder withProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
        return this;
    }

    public FakeProjectUpdatedBuilder withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public FakeProjectUpdatedBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FakeProjectUpdatedBuilder withChanges(Changes changes) {
        this.changes = changes;
        return this;
    }

    public FakeProjectUpdatedBuilder withCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public FakeProjectUpdatedBuilder withUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public FakeProjectUpdatedBuilder withRevision(long revision) {
        this.revision = revision;
        return this;
    }

    public ProjectUpdated build() {
        return new ProjectUpdated(
                eventId, projectId, projectName, projectDescription,
                metadata, status, changes,
                createdAt, updatedAt, revision
        );
    }
}