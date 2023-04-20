package proxy;

public class MediaFileImpl implements MediaFile {
    private String fileName;

    public MediaFileImpl(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void print() {
        System.out.println("Tạm ngưng " + fileName);

    }
    private void loadFromDisk(String fileName){
        System.out.println("Đang tải " + fileName);
    }
}
