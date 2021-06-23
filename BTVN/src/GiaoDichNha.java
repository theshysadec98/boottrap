public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" +
                "loaiNha='" + getLoaiNha() + '\'' +
                ", diaChi='" + getDiaChi() + '\'' +
                "maGiaoDich='" + getMaGiaoDich() + '\'' +
                ", ngayGiaoDich='" + getNgayGiaoDich() + '\'' +
                ", donGia=" + getDonGia() +
                ", dienTich=" + getDienTich() +
                '}';
    }
}
