package structuralPatterns.adapter.adapter;

import structuralPatterns.adapter.round.RoundPeg;
import structuralPatterns.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Minimum circle radius to fit the peg
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
