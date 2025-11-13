package com.example.feedback.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.feedback.dto.FeedbackDTO;

import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*")
public class feedbackController {
       @PostMapping("/feedback")
    public ResponseEntity<FeedbackDTO> postFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        return ResponseEntity.ok(feedbackDTO);
    }
}

