package com.intellias.intellistart.interviewplanning.service;

import java.time.DayOfWeek;
import java.time.LocalTime;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * InterviewerTimeSlot model.
 */

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class InterviewerTimeSlot {


  private Long id;


  private int weekNum;


  private DayOfWeek dayOfWeek;

  private LocalTime from;


  private LocalTime to;


}
