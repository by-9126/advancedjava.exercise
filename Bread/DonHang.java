import java.util.ArrayList;

public class DonHang {
    private KhachHang khachHang;
    private ArrayList<SanPham> danhSachSanPham;
    private double tongTien;

    // Constructor
    public DonHang(KhachHang khachHang) {
        this.khachHang = khachHang;
        this.danhSachSanPham = new ArrayList<>();
        this.tongTien = 0;
    }

    // Phương thức thêm sản phẩm vào đơn hàng
    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
        tongTien += sanPham.getGia();
    }

    // Phương thức hiển thị thông tin đơn hàng
    public void hienThiDonHang() {
        System.out.println("Khách hàng: " + khachHang.getTen());
        System.out.println("Số điện thoại: " + khachHang.getSoDienThoai());
        System.out.println("Các sản phẩm trong đơn hàng:");
        for (SanPham sp : danhSachSanPham) {
            System.out.println("- " + sp.getTen() + ": " + sp.getGia() + " VND");
        }
        System.out.println("Tổng tiền: " + tongTien + " VND");
    }
}
