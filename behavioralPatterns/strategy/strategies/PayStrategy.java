package behavioralPatterns.strategy.strategies;

/**
 * Common interface for strategies
 * https://refactoring.guru/design-patterns/strategy/java/example
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
