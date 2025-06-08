package final_test_practice.chain_of_responsibility.CB5;

public class HocLucYeu extends XepHocLuc{
    public HocLucYeu(int minDiem, String ten) {
        super(minDiem, ten);
    }

    @Override
    public XepHocLuc setKeTiep(XepHocLuc keTiep) {
        return null;
    }

    @Override
    void getHocLuc(int diem) {
        System.out.println("Toi la hoc sinh " + ten);
    }
}
