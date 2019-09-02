package simedia;

public class Robot {

    private int x;

    public Robot(){
        x=1;
    }
    public void change(int k){
        if (k>=1){
            x+=k;
        }
    }

    @Override
    public String toString() {
        return "The position of the robot is " + x + ".";
    }
}
