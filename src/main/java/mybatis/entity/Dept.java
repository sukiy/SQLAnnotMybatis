package mybatis.entity;

/**
 * Created by Sukiy on 2018/1/29.
 */
public class Dept {

    private int dno;
    private String dname;

    public Dept() {
    }

    public Dept(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
