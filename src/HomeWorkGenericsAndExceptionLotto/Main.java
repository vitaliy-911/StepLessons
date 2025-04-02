package HomeWorkGenericsAndExceptionLotto;

public class Main {
    public static void main(String[] args) throws MaxWinnersExceededException {
        LotteryMachine<Participant> lotto = new LotteryMachine<>();
        for (int i = 0; i < 10; i++) {
            try {
                lotto.add(ParticipantFactory.next());
            } catch (UnderageException | DuplicateParticipantException e) {
                System.out.println("ошибка" + e.getMessage());
            }
        }

        lotto.init();
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("победитель" + lotto.pick());
            }
            catch (MaxWinnersExceededException e){
                System.out.println("ошибка" + e.getMessage());
            }
        }

        try {
            lotto.reset();
        } catch (NotInitializedException e) {
            System.out.println("ошибка" + e.getMessage());
        }
        System.out.println(lotto.ageToWinners());
    }
}