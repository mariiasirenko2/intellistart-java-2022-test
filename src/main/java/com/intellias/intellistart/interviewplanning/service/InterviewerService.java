package com.intellias.intellistart.interviewplanning.service;

import org.springframework.stereotype.Service;

/**
 * Interviewer business logic.
 */
@Service
public class InterviewerService {

  public InterviewerTimeSlot createSlot() {
    return new InterviewerTimeSlot();
  }


}
