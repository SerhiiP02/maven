package service;
import base.Base;
public class BaseService {
    public static void main(String[] args) {
        Base base = new Base(2, "second description");
        System.out.println(String.format("%s", base.publicMethod() ));
        // Доступ до приватних полів можливий через гетери, проте без них доступ відсутній
    }
}
