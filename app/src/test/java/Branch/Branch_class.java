package Branch;

public class Branch_class {

    String name,id;
    float cgpa;
    double avg;

    Branch_class(){

    }

    Branch_class(String a,String b,float c,double d){
        name=a;
        id=b;
        cgpa=c;
        avg=d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
