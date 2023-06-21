package behavioral_patterns.chain_of_responsability;

import behavioral_patterns.chain_of_responsability.middleware.Middleware;
import behavioral_patterns.chain_of_responsability.middleware.RoleCheckMiddleware;
import behavioral_patterns.chain_of_responsability.middleware.ThrottlingMiddleware;
import behavioral_patterns.chain_of_responsability.middleware.UserExistsMiddleware;
import behavioral_patterns.chain_of_responsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://refactoring.guru/design-patterns/chain-of-responsibility/java/example
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("User@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while(!success);
    }
}
