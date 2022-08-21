package com.telecalendar.telecalendar.cache;

import com.telecalendar.telecalendar.botapi.BotState;
import com.telecalendar.telecalendar.model.Ticket;

import java.util.HashMap;
import java.util.Map;

public class UserDataCache implements DataCache{

    private Map<Integer, BotState> userBotStatuses = new HashMap<>();
    private Map<Integer, Ticket> userTicketData = new HashMap<>();

    @Override
    public void setCurrentUserBotState(int userId, BotState botState) {
        userBotStatuses.put(userId, botState);
    }

    @Override
    public BotState getCurrentUserBotState(int userId) {
        BotState botState = userBotStatuses.get(userId);
        if (botState == null){
            botState = BotState.BEGIN;
        }
        return botState;
    }

    @Override
    public void setUserTicketData(int userId, Ticket userProfileData) {
        userTicketData.put(userId, userProfileData);
    }

    @Override
    public Ticket getUserTicketData(int userId) {
        Ticket ticket = userTicketData.get(userId);
        if(ticket == null){
            ticket = new Ticket();
        }
        return ticket;
    }
}
