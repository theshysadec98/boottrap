public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat() {
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "GiaoDichDat{" +
                "loaiDat='" + getLoaiDat() + '\'' +
                "maGiaoDich='" + getMaGiaoDich() + '\'' +
                ", ngayGiaoDich='" + getNgayGiaoDich() + '\'' +
                ", donGia=" + getDonGia() +
                ", dienTich=" + getDienTich() +
                '}';
    }
}
