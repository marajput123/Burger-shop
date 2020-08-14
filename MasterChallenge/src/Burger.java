public class Burger {
    protected String burger = "normal";
    protected Additions addition = new Additions();


    public void getPrice(){
        System.out.print("Current Price:");
        System.out.print("\nBurger Type - " + this.burger);
        System.out.printf("\nBread - " + addition.getBread() + " - $" + "%.2f",addition.getBreadPrice());
        System.out.printf("\nMeat - " + addition.getMeat() + " - $" + "%.2f",addition.getMeatPrice());
        System.out.printf("\nAddition 1 - " + addition.getAddition1() + " - $" + "%.2f",addition.getAddition1Price());
        System.out.printf("\nAddition 2 - " + addition.getAddition2() + " - $" + "%.2f",addition.getAddition2Price());
        System.out.printf("\nAddition 3 - " + addition.getAddition3() + " - $" + "%.2f",addition.getAddition3Price());
        System.out.printf("\nAddition 4 - " + addition.getAddition4() + " - $" + "%.2f",addition.getAddition4Price());
        System.out.printf("\nTotal - $ " + "%.2f",totalPrice());
        System.out.println("");
    }
    public void additions(){
        addition.addAddition();
    }
    public void meat(){
        addition.addMeat();
    }
    public void bread(){
        addition.addBread();
    }

    protected double totalPrice(){
        double total = addition.getAddition1Price() + addition.getAddition2Price() + addition.getAddition3Price() + addition.getAddition4Price() +
                addition.getAddition5Price() + addition.getAddition6Price()  + addition.getBreadPrice() +
                addition.getMeatPrice() + sides() - (addition.p/1000);
        return total;
    }

    public void getTotal(){
        System.out.printf("Total Price is: $" + "%.2f",totalPrice());
        System.out.println("");
    }

    protected void setBurger(){
        this.burger = "Normal Burger";
    }

    protected double sides(){
        return 0.00;
    }

    public void isHealthy(boolean healthy){
        addition.setBread("Whole Wheat");
        addition.setBreadPrice(3.00);
    }
    public void isDeluxe(boolean deluxe){
        addition.isDeluxe(deluxe);
    }

    public void burgerSelection(){
        System.out.println("~~~Choose where to start from~~~");
        System.out.println("1. Bread - " + addition.getBread());
        System.out.println("2. Meat - " + addition.getMeat());
        System.out.println("3. Additions");
        System.out.println("---------" +
                "\n4. Start Over" +
                "\n5. Get current Price/Current Order" +
                "\n6. Pay" +
                "\n7. back");

    }
}

