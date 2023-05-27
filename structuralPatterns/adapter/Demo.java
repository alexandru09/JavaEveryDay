package structuralPatterns.adapter;

import structuralPatterns.adapter.adapter.SquarePegAdapter;
import structuralPatterns.adapter.round.RoundHole;
import structuralPatterns.adapter.round.RoundPeg;
import structuralPatterns.adapter.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);
        // hole.fits(smallSquarePeg); // doesn't work

        // Use the adapter
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5");
        }
        if (!hole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg w20 does not fit round hole r5");
        }
    }
}
