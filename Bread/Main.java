import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin khách hàng từ bàn phím
        System.out.print("Nhập tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();
        System.out.print("Nhập số điện thoại khách hàng: ");
        String soDienThoai = scanner.nextLine();
        KhachHang khachHang1 = new KhachHang(tenKhachHang, soDienThoai);

        // Tạo các sản phẩm (bánh mì)
        SanPham banhMiThit = new SanPham("Bánh mì thịt", 20000);
        SanPham banhMiChay = new SanPham("Bánh mì chay", 15000);
        SanPham banhMiCa = new SanPham("Bánh mì cá", 25000);

        // Tạo đơn hàng
        DonHang donHang = new DonHang(khachHang1);

        // Lựa chọn sản phẩm và thêm vào đơn hàng
        System.out.println("Chọn sản phẩm (1: Bánh mì thịt, 2: Bánh mì chay, 3: Bánh mì cá): ");
        System.out.print("Nhập mã sản phẩm (0 để thoát): ");
        int luaChon = scanner.nextInt();

        while (luaChon != 0) {
            switch (luaChon) {
                case 1:
                    donHang.themSanPham(banhMiThit);
                    break;
                case 2:
                    donHang.themSanPham(banhMiChay);
                    break;
                case 3:
                    donHang.themSanPham(banhMiCa);
                    break;
                default:
                    System.out.println("Sản phẩm không hợp lệ.");
            }
            System.out.print("Nhập mã sản phẩm (0 để thoát): ");
            luaChon = scanner.nextInt();
        }
        donHang.hienThiDonHang();

        scanner.close();
    }
}
