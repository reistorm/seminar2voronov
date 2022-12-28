//package dz1;
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileWrite {
//    public static void main(String[] args) {
//        try (FileWriter fw = new FileWriter("C:\\Users\\Родион\\Desktop\\Элиза\\seminar2voronov\\src\\main\\java\\dz1\\file.txt")) {
//            fw.write("a = 10");
//            fw.append('\n');
//            fw.append("b = 3");
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public int read(int a, int b) throws IOException {
//        int result = 1;
//        for (int i = 1; i < b; i++) {
//            result *= a;
//        }
//        return result;
//    }
//
//    public static void main2(String[] args) {
//        try (FileWriter fw = new FileWriter("C:\\Users\\Родион\\Desktop\\Элиза\\seminar2voronov\\src\\main\\java\\dz1\\file2.txt")) {
//            fw.write("result =" + result);
//            fw.append('\n');
//            fw.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
//
//
