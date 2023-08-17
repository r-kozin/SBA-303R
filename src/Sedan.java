public class Sedan extends Car{
    private int length;
    public Sedan(){
    }
    public Sedan(int speed, int regularPrice, String color, int length){
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override
    double getSalePrice(){
        if (length > 20){
            return super.getSalePrice() * .95;
        } else {
            return super.getSalePrice() *.9;
        }
    } // for this method, implement this: If length > 20 feet, 5% discount; otherwise, 10% discount

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
