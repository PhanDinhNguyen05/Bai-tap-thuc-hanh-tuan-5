package Tuan5;

class CongNhan {
    private String maCN;   
    private String mHo;    
    private String mTen;   
    private int mSoSP;      

    // Constructor
    public CongNhan() {
        this.maCN = "";
        this.mHo = "";
        this.mTen = "";
        this.mSoSP = 0;
    }

    // Constructor 
    public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.mSoSP = mSoSP;
    }

    // Getter and Setter 
    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getMHo() {
        return mHo;
    }

    public void setMHo(String mHo) {
        this.mHo = mHo;
    }

    public String getMTen() {
        return mTen;
    }

    public void setMTen(String mTen) {
        this.mTen = mTen;
    }

    public int getMSoSP() {
        return mSoSP;
    }

    public void setMSoSP(int mSoSP) {
        this.mSoSP = mSoSP;
    }
//tinh luong
    public double tinhLuong() {
        double donGia = 0;
        if (mSoSP >= 1 && mSoSP <= 199) {
            donGia = 0.5;
        } else if (mSoSP >= 200 && mSoSP <= 399) {
            donGia = 0.55;
        } else if (mSoSP >= 400 && mSoSP <= 599) {
            donGia = 0.6;
        } else if (mSoSP >= 600) {
            donGia = 0.65;
        }
        return mSoSP * donGia;
    }

    @Override
    public String toString() {
        return "CongNhan [maCN=" + maCN + ", Ho=" + mHo + ", Ten=" + mTen + ", So san pham=" + mSoSP + ", Luong=" + tinhLuong() + "]";
    }
}

