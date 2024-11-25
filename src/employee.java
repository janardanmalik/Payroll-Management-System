abstract class employee {
    private int id;
    private String name;
    private String department;
    protected double salary;
    public employee(int id,String name,String department){
        this.id=id;
        this.department=department;
        this.name=name;
    }
    public int getID(){
        return id;
    }
    public String department(){
        return department;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public abstract void calculateSalary();
    public String toString(){
        return "name is "+name+"department is "+department+"job id is"+id+"and salary is"+salary;
    }







}
