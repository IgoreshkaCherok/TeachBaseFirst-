package moduleFour.backend;

import java.util.Date;

public class profileUser {
    private String firstName;
    private String secondName;
    private String threeName;
    private String bithdayUser;
    private String createCard;
    private String finishCard;
    private int createCardYear;
    private String createCardMoth;
    private int createCardDay;

    /**
     * Setter
     */
    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return String.valueOf(firstName);
    }

    public String setSecondName(String secondName) {
        this.secondName = secondName;
        return secondName;
    }

    public String setThreeName(String threeName) {
        this.threeName = threeName;
        return threeName;
    }

    public String setBithdayUser(String bithdayUser) {
        this.bithdayUser = bithdayUser;
        return bithdayUser;
    }

    public String setCreateCard(int createCardDay, String createCardMoth, int createCardYear) {
        this.createCard = createCardDay + "." + createCardMoth + "." + createCardYear;
        this.createCardDay = createCardDay;
        this.createCardMoth = createCardMoth;
        this.createCardYear = createCardYear;
        return createCard;
    }
    private String setFinishCard(int finishCardDay, String finishCardMoth, int finishCardYear) {
        finishCardYear = finishCardYear + 2;
        this.finishCard = finishCardDay + "." + finishCardMoth + "." + finishCardYear;
        return finishCard;
    }

    /**
     * Getter
     */
    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThreeName() {
        return threeName;
    }

    public String getBithdayUser() {
        return bithdayUser;
    }

    public String getCreateCard() {
        return createCard;
    }

    public String getFinishCard() {
        setFinishCard(createCardDay, createCardMoth, createCardYear);
        return finishCard;
    }
}
