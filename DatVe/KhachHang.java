class KhachHang {
    private String ten;
    private String soDienThoai;
    private String diaChi;

    public KhachHang(String ten, String soDienThoai, String diaChi) {
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    // Các phương thức getter và setter
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void hienThiThongTin() {
        System.out.println("Khách hàng: " + ten);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Địa chỉ: " + diaChi);
    }
}

