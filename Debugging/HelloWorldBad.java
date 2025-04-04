
class HelloWorldBad {
    public static void main(String[] args) {//prints the value of i counting up to 24 nad says if it equals 1
        
        for (int i=0;i<25;i++){
            System.out.println("the value of i is "+i);
            if (i==1){//error, it needs two equals to make the output a boolean
                System.out.println("i is equal to 1");
            }
        }    
        }
    }