package lab2;

public class Point3d {
  private double xAxis;
  private double yAxis;
  private double zAxis;

  public Point3d(double x, double y, double z) {
    xAxis = x;
    yAxis = y;
    zAxis = z;
  }

  public Point3d() {
    xAxis = 0;
    yAxis = 0;
    zAxis = 0;
  }

  public double getXAxis() {
    return xAxis;
  }

  public void setXAxis(double x) {
    xAxis = x;
  }

  public double getYAxis() {
    return yAxis;
  }

  public void setYAxis(double y) {
    yAxis = y;
  }

  public double getZAxis() {
    return zAxis;
  }

  public void setZAxis(double z) {
    zAxis = z;
  }

  public boolean equals(Point3d point) {
    return xAxis == point.xAxis && yAxis == point.yAxis && zAxis == point.zAxis;
  }

  public double distanceTo(Point3d point) {
    return Math.round(Math.sqrt(Math.pow(point.xAxis - xAxis, 2) + Math.pow(point.yAxis - yAxis, 2) + Math.pow(point.zAxis - zAxis, 2)) * 100.0) / 100.0;
  }
}
