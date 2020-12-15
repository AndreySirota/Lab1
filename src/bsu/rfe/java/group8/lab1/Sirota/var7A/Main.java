package bsu.rfe.java.group8.lab1.Sirota.var7A;

public class Main {

    public static void main(String[] args) throws Exception{
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;
        int bigApple = 2;
        int midApple = 1;
        int littleApple = 1;
        int Cheese = 2;
        int karamel = 1;
        int chocolate = 1;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
                Cheese++;
            } else
            if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
                if(parts[1].equals("большое")){
                    bigApple++;
                }
                if(parts[1].equals("cреднее")){
                    midApple++;
                }
                if(parts[1].equals("маленькое")){
                    littleApple++;
                }
            }
            if (parts[0].equals("Ice-Cream")){
                breakfast[itemsSoFar] = new IceCream(parts[1]);
                if(parts[1].equals("Karamel")){
                    karamel++;
                }
                if(parts[1].equals("Chocolate")){
                    chocolate++;
                }
            }
            itemsSoFar++;
        }
        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;

        if(bigApple != 0){
            System.out.println("\nСъедено больших яблок: " + bigApple);
        }
        if(midApple != 0){
            System.out.println("Съедено средних яблок: " + midApple);
        }
        if(littleApple != 0){
            System.out.println("Съедено малых яблок: " + littleApple);
        }
        if(Cheese != 0){
            System.out.println("Съедено сыра: " + Cheese);
        }
        if(karamel != 0){
            System.out.println("Съедено мороженое с карамелью");
        }
        if(chocolate != 0){
            System.out.println("Съедено мороженое с шоколадом");
        }
        System.out.println("Всего хорошего!");
    }
}

