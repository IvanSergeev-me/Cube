import java.util.Scanner;

public class Cube {
    private Facet[] facets;

    public Cube() {
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(0, 1, 0));
        facets[1] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(0, 1, 0));
        facets[2] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(0, 1, 0));
        facets[3] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(0, 1, 0));
        facets[4] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(0, 1, 0));
        facets[5] = new Facet(new R3Vector(0, 0, 0), new R3Vector(1, 0, 0), new R3Vector(1, 1, 0), new R3Vector(0, 1, 0));
    }

    //public static void main(String[] args){}

}