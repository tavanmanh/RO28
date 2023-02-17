package com.example.demo_05.models;

import java.util.Map;

public interface ProjectRepositoryCustom {
    Map<String, Object> search(ProjectDto project);
}
