
package Entidades;


public class Array {
    public double[] Array  = new double[50];
    public double[] Array2 = new double[20];

    public Array() {
        
    }

    public Array(double[] Array, double[] Array2) {
        this.Array = Array;
        this.Array2 = Array2;
    }

    public double[] getArray() {
        return Array;
    }

    public double[] getArray2() {
        return Array2;
    }

    public void setArray(double[] Array) {
        this.Array = Array;
    }

   

    public void setArray2(double[] Array2) {
        this.Array2 = Array2;
    }
    public void setArrayI(double[] Array2, int i) {
        this.Array[i] = Array[i];
    }
    public void setArray2I(double[] Array2, int i) {
        this.Array2[i] = Array2[i];
    }
    public void setArray2I(double d, int i) {
        this.Array2[i] = d;
    }

  
    

  
    
    
    
    
    
    
    
    
}
