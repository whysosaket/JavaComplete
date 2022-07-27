public class CopyObjects {
    public static void main(String[] args) {

        //to copy an object to the other we make a copy method in the class

        Mobile m1= new Mobile("Samsung", "Galaxy J7", 2016);
        //Mobile m2= new Mobile("Xiaomi","Redmi 5",2017);

        //###mehtod 1 now to copy
        //m2.copy(m1);

        //###method 2 now to copy
        Mobile m2= new Mobile(m1);

        //m1=m2;                             //don't do this because this just copies the reference
                                             // and both of them have the same adders

        System.out.println(m1);             //printing the address of these objects in the memory
        System.out.println(m2);
        System.out.println();

        System.out.println(m1.getCompany());
        System.out.println(m1.getModel());
        System.out.println(m1.getYear());
        System.out.println();

        System.out.println(m2.getCompany());
        System.out.println(m2.getModel());
        System.out.println(m2.getYear());

    }
}

class Mobile{
    private String company;
    private String model;
    private int year;

    Mobile (String company, String model, int year){
        /*this.company= company;
        this.model= model;
        this.year= year;*/

        //the same above code can be written more clean
        this.setCompany(company);
        this.setModel(model);
        this.setYear(year);
    }

    //we are creating a copy constructor

    Mobile(Mobile x){
        copy(x);
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

    public void copy(Mobile x){
        this.setCompany(x.getCompany());
        this.setModel((x.model));
        this.setYear(x.getYear());
    }

    // have not overridden toString method because seeing address of object is a goal

    /*public String toString(){
        return company+" "+model+" "+year;
    }*/
}