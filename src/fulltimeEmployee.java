public class fulltimeEmployee extends employee {
    private double basicpay;
    private double hra;
    public fulltimeEmployee(int id,String name,String department,double basicpay,double hra){
        super(id,name,department);
        this.basicpay=basicpay;
        this.hra=hra;
    }
    public void calculateSalary(){
        salary=basicpay+hra;
    }


}
