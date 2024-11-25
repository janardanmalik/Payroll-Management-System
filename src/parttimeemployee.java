public class parttimeemployee extends employee{
    private int hours;
    private int hourpay;
    public parttimeemployee(int id,String name,String department,int hours,int hourpay){
        super(id,name,department);
        this.hours=hours;
        this.hourpay=hourpay;
    }
    public void calculateSalary(){
        salary=hours*hourpay;
    }

}
