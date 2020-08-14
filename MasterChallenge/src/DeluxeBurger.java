public class DeluxeBurger extends Burger{

    @Override
    public void getPrice() {
        System.out.print("Current Price:");
        System.out.println("\nBurger Type - " + this.burger);
        System.out.printf("\nBread - " + addition.getBread() + " - $" + "%.2f",addition.getBreadPrice());
        System.out.printf("\nMeat - " + addition.getMeat() + " - $" + "%.2f",addition.getMeatPrice());
        System.out.printf("\nAddition 1 - " + addition.getAddition1() + " - $" + "%.2f",addition.getAddition1Price());
        System.out.printf("\nAddition 2 - " + addition.getAddition2() + " - $" + "%.2f",addition.getAddition2Price());
        System.out.printf("\nAddition 3 - " + addition.getAddition3() + " - $" + "%.2f",addition.getAddition3Price());
        System.out.printf("\nAddition 4 - " + addition.getAddition4() + " - $" + "%.2f",addition.getAddition4Price());
        System.out.printf("\nAddition 5 - " + addition.getAddition5() + " - $" + "%.2f",addition.getAddition5Price());
        System.out.printf("\nAddition 6 - " + addition.getAddition6() + " - $" + "%.2f",addition.getAddition6Price());
        System.out.printf("\nSides - Chips and Drink - $2.00");
        System.out.printf("\nTotal - $ " + "%.2f",totalPrice());
        System.out.println("");
    }


    @Override
    protected void setBurger() {
        this.burger = "Deluxe Burger";
    }

    @Override
    protected double sides() {
        return 2.00;
    }
}
