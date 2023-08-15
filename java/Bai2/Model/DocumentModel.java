package Bai2.Model;

public class DocumentModel {
    private String id;
    private String publish;
    private int count;

    public DocumentModel(String id, String publish, int count) {
        this.id = id;
        this.publish = publish;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
