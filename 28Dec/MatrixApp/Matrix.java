package MatrixApp;
interface Matrix {
    void performOper(int a[][]);
    void performOperation(int a[][], int b[][]);
}
class Addition implements Matrix {
    @Override
    public void performOper(int a[][]) {}
    
    @Override
    public void performOperation(int a[][], int b[][]) {
        int c[][] = new int[a.length][b.length];
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }

}
class Substraction implements Matrix {

    @Override
    public void performOper(int[][] a) {
        throw new UnsupportedOperationException("Unimplemented method 'performOper'");
    }

    @Override
    public void performOperation(int[][] a, int[][] b) {
        int c[][] = new int[a.length][b.length];
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}
class ScalarMatrix implements Matrix {
    @Override
    public void performOper(int[][] a) {
        int k=2;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                a[i][j] = (a[i][j]*k);
            }
        }
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
    @Override
    public void performOperation(int a[][], int[][] b) {
        return;
    }
}
class Multiplication implements Matrix {
    @Override
    public void performOper(int a[][] ) {};

    @Override
    public void performOperation(int a[][], int[][] b) {
        int c[][] = new int[a.length][b.length];
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                for(int k=0; k<a.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}
class SumRowCol implements Matrix {
    @Override 
    public void performOper (int a[][]) {
         for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                a[i][j] = a[i][j] + a[j][i];
            }         
        }
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void performOperation(int[][] a, int[][] b) {}
}
