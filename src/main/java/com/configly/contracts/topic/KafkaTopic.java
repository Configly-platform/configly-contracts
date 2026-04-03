package com.configly.contracts.topic;

import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public enum KafkaTopic {

    CONFIGURATION("feature-toggle-configuration-events"),
    FEATURE_TOGGLE("feature-toggle-events");

    private final String topicName;

    KafkaTopic(String topic) {
        this.topicName = topic;
    }
}
