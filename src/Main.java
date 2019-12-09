public class Main {
    public static void main(String[] args){
        R3Vector vector1 = new R3Vector(0,0,0);
        R3Vector vector2 = new R3Vector(1,0,0);
        R3Vector vector3 = new R3Vector(1,1,0);
        R3Vector vector4 = new R3Vector(0,1,0);
        Facet facet = new Facet(vector1,vector2,vector3,vector4);
        facet.out();
        Cube c = new Cube();
        Window window= new Window();

        //c.scale(10);

    }
}
