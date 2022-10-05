package com.intellias.intellistart.interviewplanning.service;

import java.time.DayOfWeek;
import java.time.LocalTime;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InterviewerTimeSlot {


  private Long id;


  private int weekNum;


  private DayOfWeek dayOfWeek;

  private LocalTime from;


  private LocalTime to;

  public InterviewerTimeSlot(SlotBuilder form) {
    from = form.getFrom();
    to = form.getTo();
    dayOfWeek = form.getDayOfWeek();
  }


}
