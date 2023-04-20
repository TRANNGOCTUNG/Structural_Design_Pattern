package proxy;

public class Main {
    public static void main(String[] args) {
        MediaFile mediaFile = new ProxyMediaFile("HAYTRAOCHOANH.mp4");
        mediaFile.print();
        mediaFile.print();
        System.out.println("-----------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}