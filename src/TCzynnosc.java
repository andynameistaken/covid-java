/**
 * DO NOT CHANGE CLASS EVEN IF IT IS USELESS AND SHITTY
 * This class is used for describing what other class is doing.
 * It breaks rule of SOLID:
 * Dependency Inversion Principle: we should depend on abstractions (interfaces and abstract classes)
 * instead of concrete implementations (classes).
 * */
public class TCzynnosc {
/**
 * @param nazwaCzynnosci - String for naming of the job that class is doing
 * It should be final, but I can't change this
 * */
    private String nazwaCzynnosci;

    TCzynnosc(String arg1){
        this.nazwaCzynnosci = arg1;
    }

    public void show() {
        System.out.print(" - " + this.nazwaCzynnosci + " ");
    }
}