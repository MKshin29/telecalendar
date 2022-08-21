package com.telecalendar.telecalendar.cache;

import com.telecalendar.telecalendar.botapi.BotState;

public interface DataCache {

    void setCurrentUserBotState(int userId, BotState botState);
    BotState getCurrentUserBotState(int userId);

    UserProfileData getUserProfileData(int userId);
    void setUserProfileData(int userId, UserProfileData userProfileData);

}
