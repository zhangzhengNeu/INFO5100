package edu.northeastern.ashish.zheng;

/*2. Traffic Light Controlled Intersection:
There is an intersection of two roads. First road is road A where cars travel from North to
South in direction 1 and from South to North in direction 2. Second road is road B where cars
travel from West to East in direction 3 and from East to West in direction 4.
Refer this link : (1) Traffic Light Controlled Intersection - LeetCode */

class TrafficLight {

  // Signal maintains the road which is green at the moment
  private final Signal signal;

  public TrafficLight() {
    signal = new Signal();
  }

  public void carArrived(
      int carId, // ID of the car
      int roadId, // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
      int direction, // Direction of the car
      Runnable turnGreen, // Use turnGreen.run() to turn light to green on current road
      Runnable crossCar // Use crossCar.run() to make car cross the intersection
      ) {

    synchronized (signal) {
      if (signal.greenRoad != roadId) {
        turnGreen.run();
        signal.greenRoad = roadId;
      }
      crossCar.run();
    }
  }

  static class Signal {
    // 1 corresponds to the Road A
    int greenRoad = 1;
  }
}
