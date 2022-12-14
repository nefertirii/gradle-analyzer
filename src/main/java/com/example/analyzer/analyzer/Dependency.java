package com.example.analyzer.analyzer;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
public class Dependency {

    private final String groupId;
    private final String artifactId;
    private final String version;

    @Override
    public String toString() {
        return  groupId + ':' + artifactId + ':' + version;
    }
}
