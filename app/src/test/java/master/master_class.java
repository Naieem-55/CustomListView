package master;

public class master_class {
    int roll;
    String name;

    master_class(){

    }

    master_class(int a, String s){
        roll=a;
        name=s;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
