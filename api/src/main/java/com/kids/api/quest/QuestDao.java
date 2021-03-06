package com.kids.api.quest;

import java.util.List;

public interface QuestDao {
    int createQuest(Quest quest);

    Quest detailQuest(int questNo);

    List<Quest> getQuestListByParentId(int parentId);

    int updateQuest(Quest quest);

    int deleteQuest(int questNo);

    int setKidsQuest(KidsQuest quest);

    int finishKidsQuest(KidsQuest quest);

    int deleteKidQuest(KidsQuest quest);

    List<KidQuestDetail> getKidQuestListByKidId(int kidId);

    int updateRequest(KidsQuest quest);
    
    int getFinishCount(int kidId);
    
    int getRequestCount(int kidId);    
}
