package homework5.task33;

public class Main {

    public static void main(String[] args) {

        NonPersonalizedCard card1 = new NonPersonalizedCard(1234, 56789,
                "MasterCard", "05/25", 456);
        System.out.println(card1.getValidThru());

        PersonalizedCard card2 = new PersonalizedCard();
        card2.payOnCredit();

        ChildrenCard childrenCard = new ChildrenCard();
        childrenCard.pay();
        childrenCard.payOnCredit();

        ChildrenCard childrenCard2 = new ChildrenCard();
        childrenCard2.setName("Иванов Петр");
        System.out.println(childrenCard2.getName());


    }


}
