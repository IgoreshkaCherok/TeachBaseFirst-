package moduleFour.backend;

import java.time.LocalDate;
import java.time.Year;
public class CardClient {

    private final String fullName;
    private final LocalDate birthDate;
    private final LocalDate cardIssueDate;

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getCardIssueDate() {
        return cardIssueDate;
    }

    public CardClient(String fullName, LocalDate birthDate, LocalDate cardIssueDate) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.cardIssueDate = cardIssueDate;
    }

    public LocalDate getCardExpirationDate() {
        int yearsSinceIssue = Year.now().getValue() - cardIssueDate.getYear();
        LocalDate expirationDate = cardIssueDate.plusYears(2);
        if (yearsSinceIssue > 0 && yearsSinceIssue % 2 == 0) {
            throw new IllegalStateException("Карта просрочена");
        } else {
            return expirationDate;
        }
    }
}
