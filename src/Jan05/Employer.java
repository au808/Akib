package Jan05;

public class Employer {
    private int id;
    private String type;
    private double capital;

    public Employer(int id, String type, double capital) {
        this.id = id;
        this.type = type;
        this.capital = capital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Employer{" + "id=" + id + ", type=" + type + ", capital=" + capital + '}';
    }
    
    
}
