package com.teamtreehouse.courses.model;

import java.util.List;

/**
 * Created by Hydra1 on 20-11-16.
 */
public interface CourseIdeaDAO {
    boolean add(CourseIdea idea);

    List<CourseIdea> findAll();

    CourseIdea findBySlug(String slug);
}
