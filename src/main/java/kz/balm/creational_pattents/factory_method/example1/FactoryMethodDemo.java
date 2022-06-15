package kz.balm.creational_pattents.factory_method.example1;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
//        String image = "gif";
        String image = "jpeg";
        String format = image.substring(0, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
