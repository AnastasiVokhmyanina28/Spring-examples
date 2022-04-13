package org.example.K1;

public class DamselRescuingKnight  implements Knight{
    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() throws QuestException{
        quest.embark();
    }
}
