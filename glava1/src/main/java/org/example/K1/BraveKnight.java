package org.example.K1;

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() throws QuestException  {
        quest.embark();
    }
}
