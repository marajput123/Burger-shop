import java.util.Scanner;

public class Additions {
    private String bread = "Not Selected";
    private String meat = "Not Selected";
    private String addition1 = "Not Selected";
    private String addition2 = "Not Selected";
    private String addition3 = "Not Selected";
    private String addition4 = "Not Selected";
    private String addition5 = "Not Selected";
    private String addition6 = "Not Selected";
    private double breadPrice = 0.00;
    private double meatPrice = 0.00;
    private double addition1Price=0.001;
    private double addition2Price=0.001;
    private double addition3Price=0.001;
    private double addition4Price=0.001;
    private double addition5Price=0.001;
    private double addition6Price=0.001;
    public double p = 6;

    Scanner scan = new Scanner(System.in);

    int m = 0;
    int s = 0;
    int b = 0;




    public String getMeat() {
        return meat;
    }

    private void setMeat(String meat) {
        this.meat = meat;
    }

    public String getAddition1() {
        return addition1;
    }

    private void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    private void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    private void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    private void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public String getAddition5() {
        return addition5;
    }

    private void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public String getAddition6() {
        return addition6;
    }

    private void setAddition6(String addition6) {
        this.addition6 = addition6;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    private void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    private void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    private void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    private void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    private void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public double getAddition5Price() {
        return addition5Price;
    }

    private void setAddition5Price(double addition5Price) {
        this.addition5Price = addition5Price;
    }

    public double getAddition6Price() {
        return addition6Price;
    }

    private void setAddition6Price(double addition6Price) {
        this.addition6Price = addition6Price;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public double getBreadPrice() {
        return breadPrice;
    }

    public void setBreadPrice(double bearPrice) {
        this.breadPrice = bearPrice;
    }

    public void addAddition(){
        System.out.println("What would you like to add (type in the #) Addition " +  (s+1) + ": " +
                "\n1.) Carrot - $0.50" +
                "\n2.) Lettuce - $0.50" +
                "\n3.) Pineapple - $0.50" +
                "\n4.) Tomato - $0.50" +
                "\n5.) Cheese - $0.25" +
                "\n6.) Chipotle Sauce - $0.75" +
                "\n7.) Mayo - $0.75" +
                "\n8.) No Addition");

        switch (userPickAddition()){
            case 1:
                addition("Carrots");
                additionPrice(0.50);
                break;
            case 2:
                addition("Lettuce");
                additionPrice(0.50);
                break;
            case 3:
                addition("Pineapple");
                additionPrice(0.50);
                break;
            case 4:
                addition("Tomato");
                additionPrice(0.50);
                break;
            case 5:
                addition("Cheese");
                additionPrice(0.25);
                break;
            case 6:
                addition("Chipotle Sauce");
                additionPrice(0.75);
                break;
            case 7:
                addition("Mayo");
                additionPrice(0.75);
                break;
            case 8:
                addition("No Addition");
                additionPrice(0.00);
                break;
            default:
                return;
        }
    }

    private void addition(String filling){
        if(getAddition1() == "Not Selected"){
            setAddition1(filling);
            p--;
            return;
        }if(getAddition2() == "Not Selected"){
            setAddition2(filling);
            p--;
            return;
        }if(getAddition3() == "Not Selected"){
            setAddition3(filling);
            p--;
            return;
        }if(getAddition4() == "Not Selected"){
            setAddition4(filling);
            p--;
            return;
        }if(getAddition5() == "Not Selected"){
            setAddition5(filling);
            p--;
            return;
        }if(getAddition6() == "Not Selected"){
            setAddition6(filling);
            p--;
            return;
        }
    }

    private void additionPrice(double price){
        if(addition1Price == .001){
            setAddition1Price(price);
            return;
        }if(addition2Price == .001){
            setAddition2Price(price);
            return;
        }if(addition3Price == .001){
            setAddition3Price(price);
            return;
        }if(addition4Price == .001){
            setAddition4Price(price);
            return;
        }if(addition5Price == .001){
            setAddition5Price(price);
            return;
        }if(addition6Price == 0.001){
            setAddition6Price(price);
            return;
        }
    }
    private int userPickAddition() {
        while (true) {
            System.out.print("Pick(1-8): ");
            String i = scan.nextLine();
                try{
                    int n = Integer.parseInt(i);
                    if(n <= 0 || n > 8){
                        System.out.println("Please enter choice between 1 and 8");
                        continue;
                    }else{
                        s++;
                        return n;
                    }
                }catch (Exception e){
                    System.out.println("Please enter choice between 1 and 8");
                    continue;
                }
            }
        }

    public void addMeat(){
        if(m == 1){
            System.out.println("You may not add anymore meat");
            System.out.print("Return");
            scan.nextLine();
            return;
        }
        System.out.println("\"Which meat would you like to add (type in the #): " +
                "\n1.) Turkey - $1.50" +
                "\n2.) Chicken - $1.25" +
                "\n3.) Meatball - $1.25" +
                "\n4.) Lamb - 1.50"+
                "\n5.) No Meat");
        switch (userPickMeat()){
            case 1:
                setMeat("Turkey");
                setMeatPrice(1.50);
                break;
            case 2:
                setMeat("Chicken");
                setMeatPrice(1.25);
                break;
            case 3:
                setMeat("Meatball");
                setMeatPrice(1.25);
                break;
            case 4:
                setMeat("lamb");
                setMeatPrice(1.50);
                break;
            case 5:
                setMeat("No Meat Added");
                break;
            default:
                return;
        }
    }
    private int userPickMeat() {
        while (true) {
            System.out.print("Pick(1-5): ");
            String i = scan.nextLine();
                try{
                    int n = Integer.parseInt(i);
                    if(n <= 0 || n > 5){
                        System.out.println("Please enter choice between 1 and 5");
                        continue;
                    }else{
                        m++;
                        return n;
                    }
                }catch (Exception e){
                    System.out.println("Please enter choice between 1 and 5");
                    continue;
                }
            }
        }

    public void isDeluxe(boolean check){
        if(check == true){
            s = -2;
            return;
        }
    }

    public void addBread(){
        if(b >= 1) {
            System.out.println("You may only pick one type of bread.");
            System.out.print("Return");
            scan.nextLine();
            return;
        }
        System.out.println("\"Which bread would you like to add (type in the #): " +
                "\n1.) Italian - $3.00" +
                "\n2.) Italian Herbs and Cheese - $3.50" +
                "\n3.) Flat Bread - $2.00" +
                "\n4.) Whole Wheat Bread - $3.00");
        switch(userPickBread()){
            case 1:
                setBread("Italian");
                setBreadPrice(3.00);
                break;
            case 2:
                setBread("Italian Herbs and Cheese");
                setBreadPrice(3.50);
                break;
            case 3:
                setBread("Flat Bread");
                setBreadPrice(2.00);
                break;
            case 4:
                setBread("Whole Wheat Bread");
                setBreadPrice(3.00);
                break;
            default:
                return;
        }
    }

    private int userPickBread() {
        while (true) {
            System.out.print("Pick(1-4): ");
            String i = scan.nextLine();
            if (i.equalsIgnoreCase("quit")) {
                System.out.println("Quiting...");
                return -1;
            }else{
                try{
                    int n = Integer.parseInt(i);
                    if(n <= 0 || n > 4){
                        System.out.println("Please enter choice between 1 and 4" +
                                "\nOr type 'quit' to quit");
                        continue;
                    }else{
                        b++;
                        return n;
                    }
                }catch (Exception e){
                    System.out.println("Please enter choice between 1 and 4" +
                            "\nOr type 'quit' to quit");
                    continue;
                }
            }
        }
    }




}

