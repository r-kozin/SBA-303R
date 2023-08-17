public class MyOwnAutoShop {
    public static void main(String[] args){
        Sedan s1 = new Sedan(80, 20000, "Red", 15);
        Ford f1 = new Ford(95, 20000, "Maroon", 2006, 5000);
        Ford f2 = new Ford(120, 55000, "Black", 2024, 1000);
        Car car1 = new Car(120, 20000, "Blue");

        System.out.println("-- CAR PRICES --");

        System.out.println("Price of " + s1.getLength() + "ft " + s1.getColor() + " Sedan is: $"+ s1.getSalePrice() + " (regular price: $"+s1.getRegularPrice()+").");

        System.out.println("Price of " + f1.getYear() + " " + f1.getColor() + " Ford is: $"+ f1.getSalePrice() + " (after manufacturer discount of: $"+f1.getManufacturerDiscount()+").");

        System.out.println("Price of " + f2.getYear() + " " + f2.getColor() + " Ford is: $"+ f2.getSalePrice() + " (after manufacturer discount of: $"+f2.getManufacturerDiscount()+").");

        System.out.println("Price of " + car1.getColor() + " Car is: $" + car1.getSalePrice());

    }
}
