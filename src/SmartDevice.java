public class SmartDevice {

    String marca;
    String color;
    String pantalla;

    public SmartDevice(String marca, String color, String pantalla) {
        this.marca = marca;
        this.color = color;
        this.pantalla = pantalla;
    }

    public SmartDevice() {
    }

    public static class SmartPhone extends SmartDevice{

        double dimensiones;

        public SmartPhone(String marca, String color, String pantalla, double dimensiones) {
            super(marca, color, pantalla);
            this.dimensiones = dimensiones;
        }

        public SmartPhone() {
            super();
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "dimensiones=" + dimensiones +
                    ", marca='" + marca + '\'' +
                    ", color='" + color + '\'' +
                    ", pantalla='" + pantalla + '\'' +
                    '}';
        }
    }

    public static class SmartWatch extends SmartDevice{

        String modelo;

        public SmartWatch(String marca, String color, String pantalla, String modelo) {
            super(marca, color, pantalla);
            this.modelo = modelo;
        }

        public SmartWatch() {
            super();
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "modelo='" + modelo + '\'' +
                    ", marca='" + marca + '\'' +
                    ", color='" + color + '\'' +
                    ", pantalla='" + pantalla + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        SmartWatch smartWatch = new SmartWatch("Huawei", "Negro", "OLED", "Chica");
        System.out.println(smartWatch);

        SmartPhone smartPhone = new SmartPhone("Samsung", "Blanco", "IPS", 6.7);
        System.out.println(smartPhone);
    }
}
