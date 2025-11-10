package javatokoltin.lesson13;

public class JavaHouse {

    private String address;
    private LivingRoom livingRoom;

    public JavaHouse(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public String getAddress() {
        return address;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public static class LivingRoom {

        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        public double getArea() {
            return area;
        }
    }
}
