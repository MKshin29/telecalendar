package com.telecalendar.telecalendar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Component
public class Ticket {

    private Date meetingDate;
    private String meetingTimeInterval;
    private String contactInfo;

}
