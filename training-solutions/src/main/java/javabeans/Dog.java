package javabeans;

public class Dog {
    private String name;
    private int age;
    private boolean pedigree;

    public Dog() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPedigree() {
        return pedigree;
    }
}
