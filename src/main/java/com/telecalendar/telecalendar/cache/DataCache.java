package com.telecalendar.telecalendar.cache;

import com.telecalendar.telecalendar.botapi.BotState;
import com.telecalendar.telecalendar.model.Ticket;

public interface DataCache {

    void setCurrentUserBotState(int userId, BotState botState);
    BotState getCurrentUserBotState(int userId);

    void setUserTicketData(int userId, Ticket userProfileData);
    Ticket getUserTicketData(int userId);

}
