import javax.sound.sampled.SourceDataLine;

public class StarbuzzCoffee {
    public static void main(String args[]) {        
        //Code dasar
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " Seharga $" + beverage.cost());

        Beverage beverage3 = new MilkShake();
        beverage3 = new Oreo(beverage3);
        System.out.println(beverage3.getDescription() + " Seharga $" + beverage3.cost());
        // Akhir code awal

        // Code tambahan
        System.out.println("\nUntuk Tugas:\n\nDouble espresso :");
        // Untuk double espresso
        Beverage beverage4 = new Espresso();
        beverage4 = new Espresso(beverage4);
        System.out.println("Double " + beverage4.getDescription() + " $" + beverage4.cost());

        System.out.println("\nDouble Whip :");
        // Double espresso di combinasi dengan double whip
        Beverage beverage5 = new Espresso();
        beverage5 = new Espresso(beverage5);
        beverage5 = new Whip(beverage5);
        beverage5 = new Whip(beverage5);
        System.out.println("Double " + beverage5.getDescription() + " $" + beverage5.cost());

        System.out.println("\nWhip saja:");
        // Double espresso di combinasi dengan whip saja
        Beverage beverage6 = new Espresso();
        beverage6 = new Espresso(beverage6);
        beverage6 = new Whip(beverage6);
        System.out.println("Double " + beverage6.getDescription() + " $" + beverage6.cost());

        System.out.println("\nWhip dan oreo :");
        // Double espresso di combinasi dengan whip dan oreo
        Beverage beverage7 = new Espresso();
        beverage7 = new Espresso(beverage7);
        beverage7 = new Whip(beverage7);
        beverage7 = new Oreo(beverage7);
        System.out.println("Double " + beverage7.getDescription() + " $" + beverage7.cost());

        System.out.println("\nMilk, Whip dan oreo :");
        // Double espresso di combinasi dengan whip dan oreo serta milk
        Beverage beverage8 = new Espresso();
        beverage8 = new Espresso(beverage8);
        beverage8 = new Milk(beverage8);
        beverage8 = new Whip(beverage8);
        beverage8 = new Oreo(beverage8);
        System.out.println("Double " + beverage8.getDescription() + " $" + beverage8.cost());
    }
}
