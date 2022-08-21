package com.telecalendar.telecalendar.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Ticket {

    private Date meetingDate;
    private String meetingTimeInterval;
    private String contactInfo;
}
