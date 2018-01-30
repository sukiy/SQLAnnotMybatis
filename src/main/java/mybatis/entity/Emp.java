package mybatis.entity;

/**
 * Created by Sukiy on 2018/1/29.
 */
public class Emp {

    private int eno;
    private String ename;

    //多个员工对应一个部门
    private Dept dept;

    public Emp() {
    }

    public Emp(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
