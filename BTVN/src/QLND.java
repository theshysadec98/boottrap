import java.util.ArrayList;
import java.util.Scanner;

public class QLND {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<GiaoDich> giaoDich = new ArrayList<>();

    public static void themGiaoDich(){

        System.out.println("");
        int value = sc.nextInt();
        switch (value){
            case 1 -> giaoDich.add(themGiaoDichNha());
            case 2 -> giaoDich.add(themGiaoDichDat());
            default -> System.out.println("");
        }
    }
    public static GiaoDich themGiaoDichNha(){
        String maGiaoDich = getMaGiaoDich();
        String ngayGiaoDich = getNgayGiaoDich();
        double donGia = getDonGia();
        double dienTich = getDienTich();
        String loaiNha = getLoaiNha();
        String diaChi = getDiaChi();
        return new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiNha, diaChi);
    }
    public static GiaoDich themGiaoDichDat(){
        String maGiaoDich = getMaGiaoDich();
        String ngayGiaoDich = getNgayGiaoDich();
        double donGia = getDonGia();
        double dienTich = getDienTich();
        String loaiDat = getLoaiDat();
        return new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, dienTich, loaiDat);
    }
    public static String getMaGiaoDich(){
        System.out.println("Nhap ma giao dich:");
        return sc.nextLine();
    }
    public static String getNgayGiaoDich(){
        System.out.println("Nhap ngay giao dich:");
        return sc.nextLine();
    }
    public static double getDonGia(){
        System.out.println("Nhap Don gia:");
        return sc.nextDouble();
    }
    public static double getDienTich(){
        System.out.println("Nhap dien tich:");
        return sc.nextDouble();
    }
    public static String getLoaiNha(){
        System.out.println("Nhap loai nha:");
        return sc.nextLine();
    }
    public static String getDiaChi(){
        System.out.println("Nhap dia chi:");
        return sc.nextLine();
    }
    public static String getLoaiDat(){
        System.out.println("Nhap loai dat :");
        return sc.nextLine();
    }
}
