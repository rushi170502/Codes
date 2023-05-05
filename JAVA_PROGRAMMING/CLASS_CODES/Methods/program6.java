
// function return various type we check that in different function

class methodDemo{

    // float return type
    float fun(float a, float b){
        float ans = a+b;
        return ans;
    }
    // integer return type
    int add(int a,int b){
        int ans = a+b;
        return ans;
    }
    // void return type does not return any value
    void gun(int a, int b){
        int ans = a+b;
    }
    public static void main(String[] args) {

        methodDemo obj = new methodDemo();
        // call function to add two numbers
        // return interger value
        int ret = obj.add(10,20);
        System.out.println("Addition is : "+ret);
        // retrun float value
        float ret1 = obj.fun(23.45f,12.33f);
        System.out.println("Addition is : "+ret1);

        // void value
        //System.out.println(obj.gun(10,20)); error : void is not allowed here


    }
}