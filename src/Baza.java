class BaseClass {
        private int baseField;

        public BaseClass() {
                this(0, 1);
                System.out.println("Default constructor in BaseClass");
        }

        public BaseClass(int baseField) {
                this.baseField = baseField;
                System.out.println("Parameterized constructor in BaseClass");
        }

        public BaseClass(int baseField, int parameter) {
                this.baseField = baseField;
                System.out.println("Two-parameter constructor in BaseClass");
        }

        public void baseMethod() {
                System.out.println("BaseMethod in BaseClass");
        }

        public void anotherBaseMethod() {
                System.out.println("AnotherBaseMethod in BaseClass");
        }
}