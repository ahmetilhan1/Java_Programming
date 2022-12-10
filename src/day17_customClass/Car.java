package day17_customClass;

public class Car {


    public String Make;
    public String Model;
    public int Year;
    public String Title;
    public double Mileage;
    public double Price;

    public void setInfo(String make, String model, int year, String title, double mileage, double price) {
        Make = make;
        Model = model;
        Year = year;
        Title = title;
        Mileage = mileage;
        Price = price;





    }

    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", Title='" + Title + '\'' +
                ", Mileage=" + Mileage +
                ", Price=" + Price +
                '}';
    }
}
