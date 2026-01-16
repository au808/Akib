package jan06.trainees;

class TraineeAddress {
    private int postalCode;
    private String area;

    public TraineeAddress(int postalCode, String area) {
        this.postalCode = postalCode;
        this.area = area;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" + "postalCode=" + postalCode + ", area=" + area + '}';
    }
    
    
}

public class Trainee {
    private int id;
    private TraineeAddress addr;

    public Trainee(int id, TraineeAddress addr) {
        this.id = id;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TraineeAddress getAddr() {
        return addr;
    }

    public void setAddr(TraineeAddress addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Trainee{" + "id=" + id + ", addr=" + addr + '}';
    }
}
    
    
    
    
