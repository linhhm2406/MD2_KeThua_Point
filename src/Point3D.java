public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = {this.getX(),this.getY(),this.getZ()};
        return arr;
    }

    @Override
    public String toString() {
        float[] arr = getXYZ();
        return "x = " + arr[0] +"\n"
                + "y = " + arr[1]+"\n"
                + "z = " + arr[2];
    }
}
