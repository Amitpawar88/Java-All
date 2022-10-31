package Pattern;

public class TrianglePattern {
    // static void trianlge(int r, int c) {
    //     if (r == 0) {
    //         return;
    //     }
    //     if (c < r) {
    //         System.out.print("*");
    //         trianlge(r, c+1);
    //     } else {
    //         System.out.println();
    //         trianlge(r-1, 0);
    //     }
    // }

    static void printStar(int i) {
        if(i == 0) {
            return;
        }
        System.out.print("*");

        printStar(i - 1);
    } 

    static void trianlge3(int  r, int c) {
        if (r == 0) {
            return;
        }
        printStar(c);
        System.out.println();

        trianlge3(r-1, c+1);
    }
    public static void main(String[] args) {
        // trianlge(5, 0);
        // trianlge2(5, 0); not working
        trianlge3(5, 0);
    }
}
