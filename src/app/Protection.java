package app;

public class Protection {
    private String name;
    private int protectNum;

    public Protection(String name, int protectNum) {
        this.protectNum = protectNum;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProtectNum() {
        return protectNum;
    }
}
