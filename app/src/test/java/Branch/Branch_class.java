package Branch;

public class Branch_class {

    String name,id;
    float cgpa;
    int number;

    Branch_class(){

    }

    Branch_class(String a, String b, float c,int e){
        name=a;
        id=b;
        cgpa=c;
        number=e;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
