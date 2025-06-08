package final_test_practice.chain_of_responsibility.CB5;

public abstract class XepHocLuc {
    protected int minDiem;
    protected String ten;

    public XepHocLuc(int minDiem, String ten) {
        this.minDiem = minDiem;
        this.ten = ten;
    }

    abstract public XepHocLuc setKeTiep(XepHocLuc keTiep);
    abstract void getHocLuc(int diem);
}
