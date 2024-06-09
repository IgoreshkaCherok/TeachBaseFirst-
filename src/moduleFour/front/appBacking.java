package moduleFour.front;

import moduleFour.backend.profileUser;

public class appBacking {
    public static void main(String[] args) {
        profileUser user = new profileUser();
        user.setFirstName("Igor");
        user.setSecondName("Cherkashin");
        user.setThreeName("Yurievich");
        user.setBithdayUser("25.07.1997");
        user.setCreateCard(20, "03", 2020);
        System.out.println("Имя: " + user.getFirstName());
        System.out.println("Фамилия: " + user.getSecondName());
        System.out.println("Отчество: " + user.getThreeName());
        System.out.println("Дата рождения: " + user.getBithdayUser());
        System.out.println("Дата выпуска карты: " + user.getCreateCard());
        System.out.println("Дата окончание действия карты: " + user.getFinishCard());


    }
}
