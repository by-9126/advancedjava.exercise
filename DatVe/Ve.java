public class Ve {
    private KhachHang khachHang;
    private Tuyen tuyen;
    private String maVe;

    public Ve(KhachHang khachHang, Tuyen tuyen, String maVe) {
        this.khachHang = khachHang;
        this.tuyen = tuyen;
        this.maVe = maVe;
    }

    // Các phương thức getter và setter
    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Tuyen getTuyen() {
        return tuyen;
    }

    public void setTuyen(Tuyen tuyen) {
        this.tuyen = tuyen;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void hienThiThongTinVe() {
        System.out.println("Mã vé: " + maVe);
        khachHang.hienThiThongTin();
        tuyen.hienThiThongTin();
    }
}

