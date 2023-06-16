package misc.graphTheory;

public class Vertex {
    public String label;
    
    Vertex(String label) {
        this.label = label;
    }
    
    @Override
    public boolean equals(Object obj) {
        if ( obj == this) {
            return true;
        }

        if (!(obj instanceof Vertex)) {
            return false;
        }

        Vertex vx = (Vertex)obj;
        return vx.label == label;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (label != null) {
            result = 31 * result + label.hashCode();
        }
        return result;
    }

}
