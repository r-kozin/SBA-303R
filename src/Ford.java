public class Ford extends Car{
    private int year;
    private int manufacturerDiscount;

    public Ford(){

    }
    public Ford(int speed, int regularPrice, String color, int year, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    @Override
    double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
