public class Child extends Parent{
    String name = "Child";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    public void ChildName(){
        System.out.println("Child name : " + name);
    }
}
