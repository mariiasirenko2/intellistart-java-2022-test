package com.intellias.intellistart.interviewplanning.service;

import org.springframework.stereotype.Service;

@Service
public class InterviewerService {

  public InterviewerTimeSlot createSlot() {
    return new InterviewerTimeSlot();
  }


}
