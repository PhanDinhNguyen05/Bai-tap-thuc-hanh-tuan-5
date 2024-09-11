package Tuan5;


class DanhSachCongNhan {
    private CongNhan[] dsCongNhan;
    private int soLuong;

    public DanhSachCongNhan(int soLuong) {
        dsCongNhan = new CongNhan[soLuong];
        this.soLuong = 0;
    }
//them cong nhan
    public void themCongNhan(CongNhan cn) {
        if (soLuong < dsCongNhan.length) {
            dsCongNhan[soLuong] = cn;
            soLuong++;
        } else {
            System.out.println("Danh sach da day, khong the them moi cong nhan.");
        }
    }
//cong nhan lam tren 200 sp
    public void hienThiCongNhanTren200SP() {
        for (int i = 0; i < soLuong; i++) {
            if (dsCongNhan[i].getMSoSP() >= 200) {
                System.out.println(dsCongNhan[i].toString());
            }
        }
    }
//sap xep cong nhan
    public void sapXepTheoSoSP() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (dsCongNhan[i].getMSoSP() > dsCongNhan[j].getMSoSP()) {
                	CongNhan temp = dsCongNhan[i];
                    dsCongNhan[i] = dsCongNhan[j];
                    dsCongNhan[j] = temp;
                }
            }
        }
    }

    public void hienThiDanhSachCongNhan() {
        for (int i = 0; i < soLuong; i++) {
            System.out.println(dsCongNhan[i].toString());
        }
    }
}
