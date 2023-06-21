package behavioral_patterns.chain_of_responsability.middleware;

/*
https://refactoring.guru/design-patterns/chain-of-responsibility/java/example
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
