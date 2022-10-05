package com.intellias.intellistart.interviewplanning;

import static org.assertj.core.api.Assertions.assertThat;


import com.intellias.intellistart.interviewplanning.service.InterviewerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InterviewPlanningApplicationTests {

  @Autowired
  private InterviewerService interviewerService;

  @Test
  void contextLoads() {
    var message = "Nothing to see here for now...";
    assertThat(message).isNotNull();
  }

  @Test
  void interviewerSlotMainScenario() {
    var slot = interviewerService.createSlot();
    assertThat(slot).isNotNull();
  }


}