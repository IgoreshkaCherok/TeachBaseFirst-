package moduleFour.front;

import moduleFour.backend.CardClient;

import java.time.LocalDate;

// Пример использования класса
    public class AppBacking {
        public static void main(String[] args) {
            // Создаем экземпляр класса ClientCard
            CardClient cardClient = new CardClient("Иванов Иван Иванович", LocalDate.of(1990, 1, 1), LocalDate.of(2023, 4, 1));

            // Получаем дату окончания действия карты
            LocalDate expirationDate = cardClient.getCardExpirationDate();
            System.out.println("ФИО клиента: " + cardClient.getFullName());
            System.out.println("Дата рождения: " + cardClient.getBirthDate());
            System.out.println("Карта клиента выпущена: " + cardClient.getCardIssueDate());
            System.out.println("Карта клиента истекает: " + expirationDate);
        }
    }
