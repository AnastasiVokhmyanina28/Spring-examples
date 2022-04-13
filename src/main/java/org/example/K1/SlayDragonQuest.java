package org.example.K1;

public class SlayDragonQuest implements Quest {
    @Override
    public void embark() throws QuestException {
        System.out.println("Slaying Dragon!");
    }
}
