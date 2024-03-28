package base;

public class Other {
    public static void main(String... args) {
        Base base = new Base(1, "first description");
        System.out.println(String.format("%s \n%s \n%s", base.defaultMethod(),base.protectedMethod(), base.publicMethod() ));
        // Доступ до приватних полів можливий через гетери, проте без них доступ відсутній
    }
}
