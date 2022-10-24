package homework10.level2;

public class Task1 {
    public static void main(String[] args) {
        double deposit = 100;
        double interestRate = 0.12;
        int depositPeriodYear = 3;
        int depositPeriodMonth = 36;

        double sumWithoutCapitalization = deposit + (deposit*interestRate * depositPeriodYear);

        double sumWithCapitalization = deposit;
        for (int i = 0; i < depositPeriodYear; i++) {
            sumWithCapitalization = sumWithCapitalization + sumWithCapitalization*interestRate;
                    }
        double sumWithMonthlyCapilazation = deposit;
        for (int i = 0; i < depositPeriodMonth; i++) {
            sumWithMonthlyCapilazation = sumWithMonthlyCapilazation + (sumWithMonthlyCapilazation*interestRate)/12;
        }


        System.out.println("Сумма без капитализации: " + sumWithoutCapitalization);
        System.out.println("Сумма c капитализацией: " + sumWithCapitalization);
        System.out.println("Сумма c ежемесячной капитализацией: " + sumWithMonthlyCapilazation);
    }
}
