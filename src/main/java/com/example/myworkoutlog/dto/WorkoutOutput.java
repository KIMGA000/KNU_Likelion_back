package com.example.myworkoutlog.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class WorkoutOutput {
    public Long id;
    public String exerciseName;
    public String duration;
    public LocalDateTime date;
    public String content;

    public WorkoutOutput(Long id, String exerciseName, String duration, LocalDateTime date, String content) {
        this.id = id;
        this.exerciseName = exerciseName;
        this.duration = duration;
        this.date = date;
        this.content = content;
    }
    /**
     * 저장되어 있는 모든 운동기록을 리턴
     * @return WorkoutOutput List
     */
    public List<WorkoutOutput> findAll(){
        List<WorkoutOutput> result = new ArrayList<>();
        for{

        }
        return result
    }
}