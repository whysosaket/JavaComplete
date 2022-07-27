public class Encapsulation {
    public static void main(String[] args) {
        /*
        *   Encapsulation = is basically hiding the unnecessary code using access modifiers
        *                   we should usually make our fields encapsulated(private...etc)
        *                   if we don't have a good reason to keep it public
        *
        *    we use getters and setting in order to write to those or
        *    to get the values in those private or protected fields
        */

        Phone myPhone= new Phone("Poco", "F1", 2018);

        System.out.println(myPhone.getCompany());
        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getYear());

        System.out.println(myPhone);

        myPhone.setModel("X2");
        myPhone.setYear(2020);

        System.out.println(myPhone);
    }
}

class Phone{
    private String company;
    private String model;
    private int year;

    Phone (String company, String model, int year){
        /*this.company= company;
        this.model= model;
        this.year= year;*/

        //the same above code can be written more clean
        this.setCompany(company);
        this.setModel(model);
        this.setYear(year);
    }

    public String getCompany(){
        return company;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return company+" "+model+" "+year;
    }
}