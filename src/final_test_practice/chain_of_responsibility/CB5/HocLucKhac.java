package final_test_practice.chain_of_responsibility.CB5;

public class HocLucKhac extends XepHocLuc{
    private XepHocLuc keTiep;
    public HocLucKhac(int minDiem, String ten) {
        super(minDiem, ten);
        keTiep = null;
    }

    @Override
    public XepHocLuc setKeTiep(XepHocLuc keTiep) {
        this.keTiep = keTiep;
        return this.keTiep;
    }

    @Override
    void getHocLuc(int diem) {
        if(diem < minDiem)
            keTiep.getHocLuc(diem);
        else
            System.out.println("Toi la hoc sinh " + ten);
    }
}
