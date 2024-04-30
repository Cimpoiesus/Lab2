class DerivedClass extends BaseClass {
    private int derivedField;

    public DerivedClass() {
        super();
        this.derivedField = 1;
        System.out.println("Default constructor in DerivedClass");
    }

    public DerivedClass(int derivedField) {
        super();
        this.derivedField = derivedField;
        System.out.println("Parameterized constructor in DerivedClass");
    }

    public void derivedMethod() {
        System.out.println("DerivedMethod in DerivedClass");
    }

    @Override
    public void anotherBaseMethod() {
        super.anotherBaseMethod();
        System.out.println("Overridden method in DerivedClass");
    }

    public void additionalDerivedMethod() {
        System.out.println("AdditionalDerivedMethod in DerivedClass");
    }
}
