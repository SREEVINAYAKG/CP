import java.util.Scanner;
public class anton_and_polyhedron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int faces = 0;
        for(int i=0;i<n;i++){
            String shape = sc.next();
            if(shape.equals("Tetrahedron")){
                faces += 4;
            }
            else if(shape.equals("Cube")){
                faces += 6;
            }
            else if(shape.equals("Octahedron")){
                faces += 8;
            }
            else if(shape.equals("Dodecahedron")){
                faces += 12;
            }
            else if(shape.equals("Icosahedron")){
                faces += 20;
            }
        }
        System.out.println(faces);
    }
    
}