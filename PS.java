/*Class Phan So. gom 2 thuoc tinh de trong private:                             tu so: _ts                             mau so: _ms */public class PS {    private int _ts,_ms;    /*    ham constructor khong tham so     */    public PS(){};    /*    ham constructor co tham so la 2 so nguyen tuong ung tu so va mau so     */    public PS(int ts, int ms){        this._ts = ts;        this._ms = ms;    }    /*    Hàm Constructor với tham số đầu vào là 1 đối tượng thuộc Class PS    hàm này chủ yếu dùng để gán giá trị     */    public PS(PS a){        this._ts = a._ts;        this._ms = a._ms;    }    public void setTs(int a){        this._ts = a;                   // hàm cài đặt tử số    }    public void setMs(int b){        this._ms = b;                   // hàm cài đặt mẫu số    }    public int getTs(){        return this._ts;                // hàm lấy giá trị tử số    }    public int getMs(){        return this._ms;                // hàm lấy giá trị mẫu số    }    public PS CongPs (PS a){        PS tong = new PS();        tong._ts = this._ts * a._ms + this._ms * a._ts;         // hàm cộng 2 phân số        tong._ms = this._ms*a._ms;        return tong;    }    public PS TruPS (PS a) {        PS hieu = new PS();        hieu._ts = this._ts*a._ms - a._ts*this._ms;             // hàm trừ 2 phân số        hieu._ms = this._ms*a._ms;        return hieu;    }    public PS NhanPS (PS a){        PS tich = new PS();        tich._ts = this._ts*a._ts;                              // hàm nhân 2 phân số        tich._ms = this._ms*a._ms;        return tich;    }    public PS ChiaPS(PS a){        PS thuong = new PS();        thuong._ts = this._ts * a._ms;                          // hàm chia 2 phân số        thuong._ms = this._ms * a._ts;        return thuong;    }    public Boolean equals(PS a){        if((this._ts*a._ms)== (this._ms*a._ts)) return true;    // hàm so sánh 2 phân số        else return false;    }}/* */