package Bai9.Model;

import Bai2.Model.DocumentModel;

public class KhachHang {
    private String name;
    private int address;
    private String id;

    public KhachHang(String name, int address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DocumentModel) {
            DocumentModel another = (DocumentModel) obj;
            if (this.id.equals(another.getId())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return 31 + this.id.hashCode();
    }
}
