public class Main {
    public static void main(String[] args) {
        BaseClass objA = new BaseClass();
        DerivedClass objB = new DerivedClass();
        DerivedClass objC = new DerivedClass(5);
        BaseClass objD = new BaseClass(10, 20);

        objA.baseMethod();
        objA.anotherBaseMethod();

        objB.baseMethod();
        objB.anotherBaseMethod();
        objB.derivedMethod();
        objB.additionalDerivedMethod();

        objC.baseMethod();
        objC.anotherBaseMethod();
        objC.derivedMethod();
        objC.additionalDerivedMethod();

        objD.baseMethod();
        objD.anotherBaseMethod();
    }
}
