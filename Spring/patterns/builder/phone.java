package patterns.builder;

public class phone {
    private Integer ram; //required
    private Integer cpus; //required
    private String display; //optional
    private boolean sensor; //optional

    private phone(builder b) {
        this.ram = b.ram;
        this.cpus = b.cpus;
        this.display = b.display;
        this.sensor = b.sensor;
    }

    @Override
    public String toString() {
        return "androidPhone{" +
                "ram=" + ram +
                ", cpus=" + cpus +
                ", display='" + display + '\'' +
                ", sensor=" + sensor +
                '}';
    }

    public static class builder {

        private Integer ram;
        private Integer cpus;
        private String display;
        private boolean sensor;

        public phone build() {
            return new phone(this);
        }

        public builder setRam(Integer ram) {
            this.ram = ram;
            return this;
        }

        public builder setCpus(Integer cpus) {
            this.cpus = cpus;
            return this;
        }

        public builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public builder setSensor(boolean sensor) {
            this.sensor = sensor;
            return this;
        }
    }
}
