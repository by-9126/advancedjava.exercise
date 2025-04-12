public class Main {
    public static void main(String[] args) {
        KhachHang khachHang = new KhachHang("Nguyen Van A", "0123456789", "Ha Noi");
        Tuyen tuyen = new Tuyen("Ha Noi", "Hai Phong", 100000);
        Ve ve = new Ve(khachHang, tuyen, "VE001");
        ve.hienThiThongTinVe();
    }
}