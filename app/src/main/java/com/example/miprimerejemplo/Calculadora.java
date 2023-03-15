package com.example.miprimerejemplo;

public class Calculadora {

        private int n1, n2, res;

        public void setResultadoMul(int n1, int n2){

            this.n1=n1;
            this.n2=n2;
        }

        private int operacionMult(){
            res= n1*n2;
            return res;
        }

        public int getResMult(){
            return operacionMult();
        }

     public void setResultadoFib(int n1, int n2){

        this.n1=n1;
        this.n2=n2;
    }

    private int operacionFib(){
            res= (n1-1)+(n1-2);
        return res;
    }

    public int getResFib(){
        return operacionFib();
    }

    public void setResultadoPot(int n1, int n2){

        this.n1=n1;
        this.n2=n2;
    }

    private int operacionPot(){
        if (n2==1) return n1;
        else if(n2==0) return 1;
        else return n1 * operacionPot(n1, n2-1);
    }

    public int getResPot(){
        return operacionPot();
    }
}


