package structural_patterns.adapter;

import structural_patterns.adapter.adapter.SquarePegAdapter;
import structural_patterns.adapter.round.RoundHole;
import structural_patterns.adapter.round.RoundPeg;
import structural_patterns.adapter.square.SquarePeg;

public class MainAdapterApp {
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
