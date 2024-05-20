public class PongBall {
    private int x, y, XVelocity, YVelocity;
    public PongBall (int initX, int initY, int initXVel, int initYVel){

        x = initX;
        y = initY;
        XVelocity = initXVel;
        YVelocity = initYVel;
    }

    public void bounceX(){
        XVelocity = XVelocity * -1;
    }

    public void bounceY(){
        YVelocity = YVelocity * -1;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(){
        x += XVelocity;
        y += YVelocity;
    }
}
