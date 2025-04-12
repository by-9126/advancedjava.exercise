public class KhachHang {
    private String ten;
    private String soDienThoai;

    public KhachHang(String ten, String soDienThoai) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
    }

    // Các phương thức getter và setter
    public String getTen() {
        return ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void hienThiThongTin() {
        System.out.println("Khách hàng: " + ten);
        System.out.println("Số điện thoại: " + soDienThoai);
    }
}