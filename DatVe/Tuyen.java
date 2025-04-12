public class Tuyen {
    private String diemDi;
    private String diemDen;
    private double giaVe;

    public Tuyen(String diemDi, String diemDen, double giaVe) {
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.giaVe = giaVe;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public void hienThiThongTin() {
        System.out.println("Tuyến xe từ " + diemDi + " đến " + diemDen);
        System.out.println("Giá vé: " + giaVe + " VND");
    }
}
