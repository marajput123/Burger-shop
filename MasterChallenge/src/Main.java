import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        while (true) {
            mainMenu();
            int i = mainMenuUser();
            if(i == 1){


                while(true) {
                    burgerMenu();
                    int e = burgerMenuUser();
                    System.out.println(e);
                    boolean additionsPicked = false;

                    if (e == 1) {
                        Burger burger = new Burger();
                        while(true) {

                            gap();
                            burger.burgerSelection();
                            int f = burgerChoiceUser();
                            if(f == 1){
                                gap();
                                burger.bread();
                            }if (f == 2){
                                gap();
                                burger.meat();
                            }if(f == 3){
                                if(!additionsPicked) {
                                    for (int n = 0; n < 4; n++) {
                                        gap();
                                        burger.additions();
                                    }
                                    additionsPicked = true;
                                }else{
                                    gap();
                                    System.out.println("No more Additions may be added");
                                    check();
                                }
                            }if(f == 4){
                                System.out.println("\n\n\nStarting Over...");
                                Thread.sleep(1000);
                                break;
                            }if(f == 5){
                                System.out.println("Getting Current Price...");
                                Thread.sleep(1000);
                                gap();
                                burger.getPrice();
                                check();
                            }if(f == 6){
                                System.out.println("Getting Total Price...");
                                Thread.sleep(1000);
                                gap();
                                burger.getTotal();
                                pay();
                                return;
                            } if(f == 7){
                                gap();
                                break;
                            }
                        }


                    } else if (e == 2) {
                        DeluxeBurger deluxeBurger = new DeluxeBurger();
                            while (true) {

                                gap();
                                deluxeBurger.burgerSelection();
                                int f = burgerChoiceUser();
                                if (f == 1) {
                                    gap();
                                    deluxeBurger.bread();
                                }
                                if (f == 2) {
                                    gap();
                                    deluxeBurger.meat();
                                }
                                if (f == 3) {
                                    if (!additionsPicked) {
                                        for (int n = 0; n < 6; n++) {
                                            gap();
                                            deluxeBurger.additions();
                                        }
                                        additionsPicked = true;
                                    } else {
                                        gap();
                                        System.out.println("No more Additions may be added");
                                        check();
                                    }
                                }
                                if (f == 4) {
                                    System.out.println("\n\n\nStarting Over...");
                                    Thread.sleep(1000);
                                    break;
                                }
                                if (f == 5) {
                                    System.out.println("Getting Current Price...");
                                    Thread.sleep(1000);
                                    gap();
                                    deluxeBurger.getPrice();
                                    check();
                                }
                                if (f == 6) {
                                    System.out.println("Getting Total Price...");
                                    Thread.sleep(1000);
                                    gap();
                                    deluxeBurger.getTotal();
                                    pay();
                                    return;
                                }
                                if (f == 7) {
                                    gap();
                                    break;
                                }
                            }
                        }
                    else if (e == 3) {
                        HealthyBurger healthyBurger = new HealthyBurger();
                        healthyBurger.isHealthy(true);
                        while (true) {
                            gap();
                            healthyBurger.burgerSelection();
                            int f = burgerChoiceUser();
                            if (f == 1) {
                                gap();
                                System.out.println("Healthy Burger only comes with Whole Wheat Bread");
                                check();
                            }
                            if (f == 2) {
                                gap();
                                healthyBurger.meat();
                            }
                            if (f == 3) {
                                if (!additionsPicked) {
                                    for (int n = 0; n < 4; n++) {
                                        gap();
                                        healthyBurger.additions();
                                    }
                                    additionsPicked = true;
                                } else {
                                    gap();
                                    System.out.println("No more Additions may be added");
                                    check();
                                }
                            }
                            if (f == 4) {
                                System.out.println("\n\n\nStarting Over...");
                                Thread.sleep(1000);
                                break;
                            }
                            if (f == 5) {
                                System.out.println("Getting Current Price...");
                                Thread.sleep(1000);
                                gap();
                                healthyBurger.getPrice();
                                check();
                            }
                            if (f == 6) {
                                System.out.println("Getting Total Price...");
                                Thread.sleep(1000);
                                gap();
                                healthyBurger.getTotal();
                                pay();
                                return;
                            }
                            if (f == 7) {
                                gap();
                                break;
                            }
                        }

                    } else if (e == 4) {
                        gap();
                        break;
                    }
                }
            }else if(i == 2){
                foodMenu();
                check();
                gap();
            }else if(i == 3){
                contactInfo();
                check();
                gap();
            }else if(i == 4){
                quit();
                Thread.sleep(1000);
                break;
            }

        }

    }

















    

    public static void mainMenu(){
        System.out.println("~~Welcome To Bills Store~~");
        System.out.println("1 - Buy a burger");
        System.out.println("2 - Menu");
        System.out.println("3 - Contact");
        System.out.println("4 - quit");
    }
    public static int mainMenuUser(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose a option: ");
            String s = scan.nextLine();
            if(s.equalsIgnoreCase("quit")){
                return -1;
            }
            try{
                int n = Integer.parseInt(s);
                if(n < 1 || n > 4){
                    System.out.println("Please enter choice between 1 and 4" +
                            "\nOr type 'quit' to quit");
                    check();
                    gap();
                    return -1;
                }else {
                    return n;
                }
            }catch (Exception e){
                System.out.println("Please enter choice between 1 and 4" +
                        "\nOr type 'quit' to quit");
                check();
                gap();
                return -1;
            }
        }
    }
    public static void foodMenu(){
        System.out.println("\n\n\n\n~~~Menu~~~");
        System.out.println("---Breads---"+
                "\n-Italian - $3.00"+
                "\n-Italian Herbs and Cheese - $3.50"+
                "\n-Flat Bread - $2.00"+
                "\n-Whole Wheat - $3.00");
        System.out.println("---Meat---"+
                "\n- Turkey - $1.50" +
                "\n- Chicken - $1.25" +
                "\n- Meatball - $1.25" +
                "\n- Lamb - $1.50");
        System.out.println("---Additions---"+
                "\n- Carrot - $0.50" +
                "\n- Lettuce - $0.50" +
                "\n- Pineapple - $0.50" +
                "\n- Tomato - $0.50" +
                "\n- Cheese - $0.25" +
                "\n- Chipotle Sauce - $0.75" +
                "\n- Mayo - $0.75");
    }

    public static void contactInfo(){
        System.out.println("\n\n\n\n~~~Contact Info~~~");
        System.out.println("Name - Muhammad Rajput" +
                "\nDate - 5/22/2020" +
                "\nScope - Food service program based on Udemy Master OOP Project -" +
                "\n(https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3404262?start=345#overview)- " +
                "\nThe program allows user to order burger while tracking additions to the burger and the price of each Addition");
    }

    public static void burgerMenu(){
        System.out.println("\n\n\n\n~~~Make A Burger~~~");
        System.out.println("1. Normal Burger - 4 Sides + Any Sub - $4.00");
        System.out.println("2. Deluxe Burger - 6 Sides + Any Aub + Chips & Fries - $5.00 ");
        System.out.println("3. Healthy Burger - 4 Sides + Whole Wheat Bread - $3.50");
        System.out.println("4. Back to Main Menu");

    }
    public static int burgerMenuUser(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose a option: ");
            String s = scan.nextLine();
            try{
                int n = Integer.parseInt(s);
                if(n < 1 && n > 4){
                    System.out.println("Please enter choice between 1 and 4");

                    continue;
                }else {
                    return n;
                }
            }catch (Exception e){
                System.out.println("Please enter choice between 1 and 4");
            }
        }
    }

    public static int burgerChoiceUser(){
        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Choose a option: ");
            String s = scan.nextLine();
            try{
                int n = Integer.parseInt(s);
                if(n < 1 || n > 8){
                    System.out.println("Please enter choice between 1 and 7");
                    continue;
                }else {
                    return n;
                }
            }catch (Exception e){
                System.out.println("Please enter choice between 1 and 7");
            }
        }
    }

    public static void check(){
        System.out.print("-Return-");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
    }

    public static void pay(){
        System.out.print("Pay");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.println("\n\n\n\n\n\n~~~~~Enjoy Your Sub~~~~~\n  ~~~~~Thank YOU~~~~~");
    }
    public static void quit(){
        System.out.println("\n\n\n\n");
        System.out.println("Thank you! Have a nice day");
    }

    public static void gap(){
        System.out.println("\n\n\n");
    }


}
